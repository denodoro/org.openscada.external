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
public class NumberCurrencySymbol {

    protected String numberCountry;
    protected String numberLanguage;
    protected String value;

    /**
     * Gets the value of the numberCountry property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumberCountry() {
        return this.numberCountry;
    }

    /**
     * Gets the value of the numberLanguage property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getNumberLanguage() {
        return this.numberLanguage;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getvalue() {
        return this.value;
    }

    /**
     * Sets the value of the numberCountry property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumberCountry(final String value) {
        this.numberCountry = value;
    }

    /**
     * Sets the value of the numberLanguage property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setNumberLanguage(final String value) {
        this.numberLanguage = value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setvalue(final String value) {
        this.value = value;
    }

}
