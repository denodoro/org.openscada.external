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

package org.jopendocument.model.text;

/**
 * 
 */
public class TextEndnote {

    protected TextEndnoteBody textEndnoteBody;
    protected TextEndnoteCitation textEndnoteCitation;
    protected String textId;

    /**
     * Gets the value of the textEndnoteBody property.
     * 
     * @return possible object is {@link TextEndnoteBody }
     * 
     */
    public TextEndnoteBody getTextEndnoteBody() {
        return this.textEndnoteBody;
    }

    /**
     * Gets the value of the textEndnoteCitation property.
     * 
     * @return possible object is {@link TextEndnoteCitation }
     * 
     */
    public TextEndnoteCitation getTextEndnoteCitation() {
        return this.textEndnoteCitation;
    }

    /**
     * Gets the value of the textId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTextId() {
        return this.textId;
    }

    /**
     * Sets the value of the textEndnoteBody property.
     * 
     * @param value allowed object is {@link TextEndnoteBody }
     * 
     */
    public void setTextEndnoteBody(final TextEndnoteBody value) {
        this.textEndnoteBody = value;
    }

    /**
     * Sets the value of the textEndnoteCitation property.
     * 
     * @param value allowed object is {@link TextEndnoteCitation }
     * 
     */
    public void setTextEndnoteCitation(final TextEndnoteCitation value) {
        this.textEndnoteCitation = value;
    }

    /**
     * Sets the value of the textId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTextId(final String value) {
        this.textId = value;
    }

}
