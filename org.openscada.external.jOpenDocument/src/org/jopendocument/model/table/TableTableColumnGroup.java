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

package org.jopendocument.model.table;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class TableTableColumnGroup {

    protected String tableDisplay;
    protected List<Object> tableTableHeaderColumnsOrTableTableColumnOrTableTableColumnGroup;

    /**
     * Gets the value of the tableDisplay property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableDisplay() {
        if (this.tableDisplay == null) {
            return "true";
        } else {
            return this.tableDisplay;
        }
    }

    /**
     * Gets the value of the tableTableHeaderColumnsOrTableTableColumnOrTableTableColumnGroup
     * property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the
     * tableTableHeaderColumnsOrTableTableColumnOrTableTableColumnGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTableTableHeaderColumnsOrTableTableColumnOrTableTableColumnGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TableTableHeaderColumns }
     * {@link TableTableColumn } {@link TableTableColumnGroup }
     * 
     * 
     */
    public List<Object> getTableTableHeaderColumnsOrTableTableColumnOrTableTableColumnGroup() {
        if (this.tableTableHeaderColumnsOrTableTableColumnOrTableTableColumnGroup == null) {
            this.tableTableHeaderColumnsOrTableTableColumnOrTableTableColumnGroup = new ArrayList<Object>();
        }
        return this.tableTableHeaderColumnsOrTableTableColumnOrTableTableColumnGroup;
    }

    /**
     * Sets the value of the tableDisplay property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTableDisplay(final String value) {
        this.tableDisplay = value;
    }

}
