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

import org.jopendocument.dom.ODFrame;
import org.jopendocument.dom.StyleStyle;

import org.jdom.Element;

public class TableStyle extends StyleStyle {

    static public final String STYLE_FAMILY = "table";

    public TableStyle(Element tableColElem) {
        super(tableColElem);
    }

    public final Float getWidth() {
        final String width = getFormattingProperties().getAttributeValue("width", this.getSTYLE());
        return width == null ? null : ODFrame.parseLength(width);
    }

    void setWidth(float f) {
        getFormattingProperties().setAttribute("width", f + ODFrame.UNIT, this.getSTYLE());
    }

}