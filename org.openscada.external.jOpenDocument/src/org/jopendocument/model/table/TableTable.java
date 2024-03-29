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
import java.util.Vector;

import org.jopendocument.model.OpenDocument;
import org.jopendocument.model.office.OfficeForms;
import org.jopendocument.model.office.OfficeSpreadsheet;
import org.jopendocument.model.style.StyleMasterPage;
import org.jopendocument.model.style.StylePageLayout;
import org.jopendocument.model.style.StylePageLayoutProperties;
import org.jopendocument.model.style.StyleStyle;

/**
 * 
 */
public class TableTable {

    Vector<TableTableColumn> allColumns;

    // Une colonne ou ligne repeated est dupliquée dans la liste
    ArrayList<TableTableColumn> columns = new ArrayList<TableTableColumn>();

    protected OfficeForms officeForms;

    private int printStartCol = 0;

    private int printStartRow = 0;

    private int printStopCol = 0;

    private int printStopRow = 0;

    ArrayList<TableTableRow> rows = new ArrayList<TableTableRow>();

    private OfficeSpreadsheet spreadsheet;

    protected String tableAutomaticPrintRange;

    protected String tableName;

    protected String tablePrintRanges;

    protected String tableProtected;

    protected String tableProtectionKey;

    protected TableScenario tableScenario;

    protected TableShapes tableShapes;

    protected String tableStyleName;

    protected List<Object> tableTableColumnsOrTableTableColumnOrTableTableColumnGroupOrTableTableHeaderColumns;

    protected List<Object> tableTableRowsOrTableTableRowOrTableTableRowGroupOrTableTableHeaderRows;

    protected TableTableSource tableTableSource;

    public void addColumn(final TableTableColumn col) {
        for (int i = 0; i < col.getTableNumberColumnsRepeated(); i++) {
            this.columns.add(col);
        }

        col.setTable(this);

    }

    public void addRow(final TableTableRow r) {
        for (int i = 0; i < r.getTableNumberRowsRepeated(); i++) {
            this.rows.add(r);
        }
        r.setTable(this);
    }

    public StyleStyle getCellStyle(final String s) {

        return this.spreadsheet.getBody().getDocument().getAutomaticStyles().getCellStyle(s);
    }

    public TableTableColumn getColumn(final int i) {
        return this.columns.get(i);
    }

    public TableTableColumn getColumnAtPosition(final int colPosition) {
        // FIXME: faire idem rows
        if (this.allColumns == null) {
            this.allColumns = new Vector<TableTableColumn>();
            for (int i = 0; i < this.columns.size(); i++) {
                final TableTableColumn col = this.getColumn(i);
                for (int n = 0; n < col.getTableNumberColumnsRepeated(); n++) {
                    this.allColumns.add(col);
                }

            }

        }
        return this.allColumns.get(colPosition);

    }

    public List<TableTableColumn> getColumns() {
        return this.columns;
    }

    public List<TableTableColumn> getColumnsInRange(final int startCol, final int stopCol) {
        final List<TableTableColumn> colsInRange = new Vector<TableTableColumn>(stopCol - startCol + 1);
        for (int i = startCol; i <= stopCol; i++) {
            colsInRange.add(this.columns.get(i));
        }
        return colsInRange;
    }

    public StyleStyle getColumnStyle(final String s) {

        return this.spreadsheet.getBody().getDocument().getAutomaticStyles().getColumnStyle(s);
    }

    public int getHeight(final int startRow, final int stopRow) {
        int h = 0;
        for (int i = startRow; i <= stopRow; i++) {
            final TableTableRow tableTableRow = this.rows.get(i);
            h += tableTableRow.getHeight();
        }
        return h;
    }

    /**
     * Gets the value of the officeForms property.
     * 
     * @return possible object is {@link OfficeForms }
     * 
     */
    public OfficeForms getOfficeForms() {
        return this.officeForms;
    }

    /**
     * Returns the page layout properties
     * 
     * @return the properties
     */
    public StylePageLayoutProperties getPageLayoutProperties() {
        if (this.tableStyleName == null) {
            return null;
        }
        // Getting page layout... a vibrant story
        final OpenDocument doc = this.getSpreadsheet().getBody().getDocument();

        final StyleStyle tableStyle = doc.getAutomaticStyles().getTableStyle(this.tableStyleName);

        final String styleMasterPageName = tableStyle.getMasterPageName();
        final StyleMasterPage styleMasterPage = doc.getMasterStyles().getMasterPageFromStyleName(styleMasterPageName);
        final String pageLayoutName = styleMasterPage.getStylePageLayoutName();
        final StylePageLayout pageLayout = doc.getAutomaticStyles().getStylePageLayoutFromStyleName(pageLayoutName);
        return pageLayout.getPageLayoutProperties();
    }

    public int getPrintHeight() {
        int h = 0;

        final List<TableTableRow> rowsInRange = this.getRowsInRange(this.getPrintStartRow(), this.getPrintStopRow());
        for (final TableTableRow row : rowsInRange) {
            h += row.getHeight();
        }
        return h;
    }

    public int getPrintHeight(final double resizeFactor) {
        int h = 0;

        final List<TableTableRow> rowsInRange = this.getRowsInRange(this.getPrintStartRow(), this.getPrintStopRow());
        for (final TableTableRow row : rowsInRange) {
            h += row.getHeight() / resizeFactor;

        }

        return h;
    }

    public int getPrintStartCol() {
        return this.printStartCol;
    }

    public int getPrintStartRow() {
        return this.printStartRow;
    }

    public int getPrintStopCol() {
        return this.printStopCol;
    }

    public int getPrintStopRow() {
        return this.printStopRow;
    }

    public int getPrintWidth() {
        int w = 0;
        final List<TableTableColumn> cols = this.getColumnsInRange(this.getPrintStartCol(), this.getPrintStopCol());
        for (final TableTableColumn col : cols) {
            w += col.getWidth();
        }
        return w;
    }

    public int getPrintWidth(final double resizeFactor) {
        int w = 0;
        final List<TableTableColumn> cols = this.getColumnsInRange(this.getPrintStartCol(), this.getPrintStopCol());
        for (final TableTableColumn col : cols) {
            w += col.getWidth() / resizeFactor;
        }
        return w;
    }

    /**
     * Return all the rows (duplicated if repeated)
     */
    public List<TableTableRow> getRows() {
        return this.rows;
    }

    public List<TableTableRow> getRowsInRange(final int startRow, final int stopRow) {
        final List<TableTableRow> rowsInRange = new ArrayList<TableTableRow>(stopRow - startRow + 1);
        for (int i = startRow; i <= stopRow; i++) {
            if (i < this.rows.size()) {
                rowsInRange.add(this.rows.get(i));
            }
        }
        return rowsInRange;
    }

    public StyleStyle getRowStyle(final String s) {
        return this.spreadsheet.getBody().getDocument().getAutomaticStyles().getRowStyle(s);
    }

    public OfficeSpreadsheet getSpreadsheet() {
        return this.spreadsheet;
    }

    /**
     * Gets the value of the tableAutomaticPrintRange property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableAutomaticPrintRange() {
        return this.tableAutomaticPrintRange;
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
     * Gets the value of the tableProtected property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableProtected() {
        if (this.tableProtected == null) {
            return "false";
        } else {
            return this.tableProtected;
        }
    }

    /**
     * Gets the value of the tableProtectionKey property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableProtectionKey() {
        return this.tableProtectionKey;
    }

    /**
     * Gets the value of the tableScenario property.
     * 
     * @return possible object is {@link TableScenario }
     * 
     */
    public TableScenario getTableScenario() {
        return this.tableScenario;
    }

    /**
     * Gets the value of the tableShapes property.
     * 
     * @return possible object is {@link TableShapes }
     * 
     */
    public TableShapes getTableShapes() {
        return this.tableShapes;
    }

    /**
     * Gets the value of the tableStyleName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTableStyleName() {
        return this.tableStyleName;
    }

    /**
     * Gets the value of the tableTableSource property.
     * 
     * @return possible object is {@link TableTableSource }
     * 
     */
    public TableTableSource getTableTableSource() {
        return this.tableTableSource;
    }

    /**
     * Sets the value of the officeForms property.
     * 
     * @param value allowed object is {@link OfficeForms }
     * 
     */
    public void setOfficeForms(final OfficeForms value) {
        this.officeForms = value;
    }

    public void setSpreadsheet(final OfficeSpreadsheet s) {
        this.spreadsheet = s;

    }

    /**
     * Sets the value of the tableAutomaticPrintRange property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTableAutomaticPrintRange(final String value) {
        this.tableAutomaticPrintRange = value;
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

    /**
     * Sets the value of the tablePrintRanges property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTablePrintRanges(final String value) {
        if (value == null || !value.contains(":")) {
            throw new IllegalArgumentException("ranges is null");
        }
        this.tablePrintRanges = value;
        final int s = value.indexOf(':');
        final String l = value.substring(0, s);
        final String r = value.substring(s + 1);

        String vl = l.substring(l.indexOf('.') + 1);
        String vr = r.substring(r.indexOf('.') + 1);
        vl = removeDollars(vl);
        vr = removeDollars(vr);

        {
            int j = 0;
            for (int i = vl.length() - 1; i >= 0; i--) {
                final int c = vl.charAt(i);
                if (Character.isLetter(c)) {
                    final int val = c - 'A' + 1;
                    this.printStartCol += val * Math.pow(26, j);
                    j++;
                } else {
                    this.printStartRow = i;
                }
            }
            final String substring = vl.substring(j);
            this.printStartRow = Integer.valueOf(substring) - 1;
            this.printStartCol--;
        }
        {
            int j = 0;
            for (int i = vr.length() - 1; i >= 0; i--) {
                final int c = vr.charAt(i);
                if (Character.isLetter(c)) {
                    final int val = c - 'A' + 1;
                    this.printStopCol += val * Math.pow(26, j);
                    j++;
                } else {
                    this.printStopRow = i;
                }
            }
            final String substring = vr.substring(j);
            this.printStopRow = Integer.valueOf(substring) - 1;
            this.printStopCol--;
        }
    }

    private final String removeDollars(String s) {
        final int length = s.length();
        final StringBuilder t = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c != '$') {
                t.append(c);
            }
        }
        return t.toString();
    }

    /**
     * Sets the value of the tableProtected property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTableProtected(final String value) {
        this.tableProtected = value;
    }

    /**
     * Sets the value of the tableProtectionKey property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTableProtectionKey(final String value) {
        this.tableProtectionKey = value;
    }

    /**
     * Sets the value of the tableScenario property.
     * 
     * @param value allowed object is {@link TableScenario }
     * 
     */
    public void setTableScenario(final TableScenario value) {
        this.tableScenario = value;
    }

    /**
     * Sets the value of the tableShapes property.
     * 
     * @param value allowed object is {@link TableShapes }
     * 
     */
    public void setTableShapes(final TableShapes value) {
        this.tableShapes = value;
    }

    /**
     * Sets the value of the tableStyleName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTableStyleName(final String value) {
        this.tableStyleName = value;
    }

    /**
     * Sets the value of the tableTableSource property.
     * 
     * @param value allowed object is {@link TableTableSource }
     * 
     */
    public void setTableTableSource(final TableTableSource value) {
        this.tableTableSource = value;
    }

    @Override
    public String toString() {

        return "TableTable: print:" + this.getPrintStartCol() + "," + this.getPrintStartRow() + " : " + this.getPrintStopCol() + "," + this.getPrintStopRow();
    }

}
