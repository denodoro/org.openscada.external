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
public class TableDataPilotMember {

    protected String tableDisplay;
    protected String tableDisplayDetails;
    protected String tableName;

    /**
     * Gets the value of the tableDisplay property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableDisplay() {
        return this.tableDisplay;
    }

    /**
     * Gets the value of the tableDisplayDetails property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableDisplayDetails() {
        return this.tableDisplayDetails;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableName() {
        return this.tableName;
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

    /**
     * Sets the value of the tableDisplayDetails property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTableDisplayDetails(final String value) {
        this.tableDisplayDetails = value;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTableName(final String value) {
        this.tableName = value;
    }

}
