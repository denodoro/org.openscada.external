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

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class TextBibliographySource {

    protected List<TextBibliographyEntryTemplate> textBibliographyEntryTemplate;
    protected TextIndexTitleTemplate textIndexTitleTemplate;

    /**
     * Gets the value of the textBibliographyEntryTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the textBibliographyEntryTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTextBibliographyEntryTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextBibliographyEntryTemplate }
     * 
     * 
     */
    public List<TextBibliographyEntryTemplate> getTextBibliographyEntryTemplate() {
        if (this.textBibliographyEntryTemplate == null) {
            this.textBibliographyEntryTemplate = new ArrayList<TextBibliographyEntryTemplate>();
        }
        return this.textBibliographyEntryTemplate;
    }

    /**
     * Gets the value of the textIndexTitleTemplate property.
     * 
     * @return possible object is {@link TextIndexTitleTemplate }
     * 
     */
    public TextIndexTitleTemplate getTextIndexTitleTemplate() {
        return this.textIndexTitleTemplate;
    }

    /**
     * Sets the value of the textIndexTitleTemplate property.
     * 
     * @param value allowed object is {@link TextIndexTitleTemplate }
     * 
     */
    public void setTextIndexTitleTemplate(final TextIndexTitleTemplate value) {
        this.textIndexTitleTemplate = value;
    }

}
