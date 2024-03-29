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

package org.jopendocument.dom.spreadsheet;

import org.jopendocument.dom.XMLVersion;

import org.jdom.Element;

/**
 * A single sheet in a spreadsheet.
 * 
 * @author Sylvain
 */
public class Sheet extends Table<SpreadSheet> {

    static Element createEmpty(XMLVersion ns) {
        return new Element("table", ns.getTABLE());
    }

    Sheet(SpreadSheet parent, Element local) {
        super(parent, local);
    }

    public final SpreadSheet getSpreadSheet() {
        return this.getODDocument();
    }

    @Override
    public void detach() {
        super.detach();
        this.getSpreadSheet().invalidate(getElement());
    }

    /**
     * Copy this sheet.
     * 
     * @param toIndex the index where to put the copy.
     * @param name the name of the copy, <code>null</code> to keep the same name.
     * @return the copied sheet.
     */
    public final Sheet copy(final int toIndex, final String name) {
        return this.getSpreadSheet().addSheet(toIndex, (Element) getElement().clone(), name);
    }

    public final void move(final int toIndex) {
        this.getSpreadSheet().move(this, toIndex);
    }
}