/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 2008 jOpenDocument, by ILM Informatique. All rights reserved.
 * 
 * The contents of this file are subject to the terms of the GNU
 * General Public License Version 3 only ("GPL").  
 * You may not use this file except in compliance with the License. 
 * You can obtain a copy of the License at http://www.gnu.org/licenses/gpl-3.0.html
 * See the License for the specific language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each file.
 * 
 */

package org.jopendocument.util.cc;

import org.apache.commons.collections.TransformerUtils;

public abstract class Transformer<E, T> implements ITransformer<E, T>, IClosure<E>, org.apache.commons.collections.Transformer {

    public static final <N> ITransformer<N, N> nopTransformer() {
        return new ITransformerWrapper<N, N>(TransformerUtils.nopTransformer());
    }

    @SuppressWarnings("unchecked")
    public final Object transform(Object input) {
        return this.transformChecked((E) input);
    }

    public abstract T transformChecked(E input);

    public final void executeChecked(E input) {
        this.transformChecked(input);
    }
}
