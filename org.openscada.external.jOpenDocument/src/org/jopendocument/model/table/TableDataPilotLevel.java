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
public class TableDataPilotLevel {

    protected TableDataPilotMembers tableDataPilotMembers;
    protected TableDataPilotSubtotals tableDataPilotSubtotals;
    protected String tableDisplayEmpty;

    /**
     * Gets the value of the tableDataPilotMembers property.
     * 
     * @return possible object is {@link TableDataPilotMembers }
     * 
     */
    public TableDataPilotMembers getTableDataPilotMembers() {
        return this.tableDataPilotMembers;
    }

    /**
     * Gets the value of the tableDataPilotSubtotals property.
     * 
     * @return possible object is {@link TableDataPilotSubtotals }
     * 
     */
    public TableDataPilotSubtotals getTableDataPilotSubtotals() {
        return this.tableDataPilotSubtotals;
    }

    /**
     * Gets the value of the tableDisplayEmpty property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableDisplayEmpty() {
        return this.tableDisplayEmpty;
    }

    /**
     * Sets the value of the tableDataPilotMembers property.
     * 
     * @param value allowed object is {@link TableDataPilotMembers }
     * 
     */
    public void setTableDataPilotMembers(final TableDataPilotMembers value) {
        this.tableDataPilotMembers = value;
    }

    /**
     * Sets the value of the tableDataPilotSubtotals property.
     * 
     * @param value allowed object is {@link TableDataPilotSubtotals }
     * 
     */
    public void setTableDataPilotSubtotals(final TableDataPilotSubtotals value) {
        this.tableDataPilotSubtotals = value;
    }

    /**
     * Sets the value of the tableDisplayEmpty property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTableDisplayEmpty(final String value) {
        this.tableDisplayEmpty = value;
    }

}
