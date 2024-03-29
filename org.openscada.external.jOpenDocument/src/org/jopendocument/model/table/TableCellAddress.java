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

/**
 * 
 */
public class TableCellAddress {

    protected String tableColumn;
    protected String tableRow;
    protected String tableTable;

    /**
     * Gets the value of the tableColumn property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableColumn() {
        return this.tableColumn;
    }

    /**
     * Gets the value of the tableRow property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableRow() {
        return this.tableRow;
    }

    /**
     * Gets the value of the tableTable property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableTable() {
        return this.tableTable;
    }

    /**
     * Sets the value of the tableColumn property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTableColumn(final String value) {
        this.tableColumn = value;
    }

    /**
     * Sets the value of the tableRow property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTableRow(final String value) {
        this.tableRow = value;
    }

    /**
     * Sets the value of the tableTable property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTableTable(final String value) {
        this.tableTable = value;
    }

}
