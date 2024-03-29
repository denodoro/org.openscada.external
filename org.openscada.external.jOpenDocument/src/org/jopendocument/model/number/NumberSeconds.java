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

package org.jopendocument.model.number;

/**
 * 
 */
public class NumberSeconds {

    protected String numberDecimalPlaces;
    protected String numberStyle;

    /**
     * Gets the value of the numberDecimalPlaces property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumberDecimalPlaces() {
        if (this.numberDecimalPlaces == null) {
            return "0";
        } else {
            return this.numberDecimalPlaces;
        }
    }

    /**
     * Gets the value of the numberStyle property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumberStyle() {
        if (this.numberStyle == null) {
            return "short";
        } else {
            return this.numberStyle;
        }
    }

    /**
     * Sets the value of the numberDecimalPlaces property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumberDecimalPlaces(final String value) {
        this.numberDecimalPlaces = value;
    }

    /**
     * Sets the value of the numberStyle property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumberStyle(final String value) {
        this.numberStyle = value;
    }

}
