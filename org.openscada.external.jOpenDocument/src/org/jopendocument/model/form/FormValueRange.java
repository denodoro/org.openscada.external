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

package org.jopendocument.model.form;

import org.jopendocument.model.office.OfficeEvents;

/**
 * 
 */
public class FormValueRange {

    protected String formCurrentValue;
    protected String formDelayForRepeat;
    protected String formDisabled;
    protected String formLinkedCell;
    protected String formMaxValue;
    protected String formMinValue;
    protected String formOrientation;
    protected String formPageStepSize;
    protected String formPrintable;
    protected FormProperties formProperties;
    protected String formStepSize;
    protected String formTabIndex;
    protected String formTabStop;
    protected String formTitle;
    protected String formValue;
    protected OfficeEvents officeEvents;

    /**
     * Gets the value of the formCurrentValue property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormCurrentValue() {
        return this.formCurrentValue;
    }

    /**
     * Gets the value of the formDelayForRepeat property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormDelayForRepeat() {
        return this.formDelayForRepeat;
    }

    /**
     * Gets the value of the formDisabled property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormDisabled() {
        if (this.formDisabled == null) {
            return "false";
        } else {
            return this.formDisabled;
        }
    }

    /**
     * Gets the value of the formLinkedCell property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormLinkedCell() {
        return this.formLinkedCell;
    }

    /**
     * Gets the value of the formMaxValue property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormMaxValue() {
        return this.formMaxValue;
    }

    /**
     * Gets the value of the formMinValue property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormMinValue() {
        return this.formMinValue;
    }

    /**
     * Gets the value of the formOrientation property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormOrientation() {
        return this.formOrientation;
    }

    /**
     * Gets the value of the formPageStepSize property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormPageStepSize() {
        return this.formPageStepSize;
    }

    /**
     * Gets the value of the formPrintable property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormPrintable() {
        if (this.formPrintable == null) {
            return "true";
        } else {
            return this.formPrintable;
        }
    }

    /**
     * Gets the value of the formProperties property.
     * 
     * @return possible object is {@link FormProperties }
     * 
     */
    public FormProperties getFormProperties() {
        return this.formProperties;
    }

    /**
     * Gets the value of the formStepSize property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormStepSize() {
        if (this.formStepSize == null) {
            return "1";
        } else {
            return this.formStepSize;
        }
    }

    /**
     * Gets the value of the formTabIndex property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormTabIndex() {
        return this.formTabIndex;
    }

    /**
     * Gets the value of the formTabStop property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormTabStop() {
        if (this.formTabStop == null) {
            return "true";
        } else {
            return this.formTabStop;
        }
    }

    /**
     * Gets the value of the formTitle property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormTitle() {
        return this.formTitle;
    }

    /**
     * Gets the value of the formValue property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFormValue() {
        return this.formValue;
    }

    /**
     * Gets the value of the officeEvents property.
     * 
     * @return possible object is {@link OfficeEvents }
     * 
     */
    public OfficeEvents getOfficeEvents() {
        return this.officeEvents;
    }

    /**
     * Sets the value of the formCurrentValue property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormCurrentValue(final String value) {
        this.formCurrentValue = value;
    }

    /**
     * Sets the value of the formDelayForRepeat property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormDelayForRepeat(final String value) {
        this.formDelayForRepeat = value;
    }

    /**
     * Sets the value of the formDisabled property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormDisabled(final String value) {
        this.formDisabled = value;
    }

    /**
     * Sets the value of the formLinkedCell property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormLinkedCell(final String value) {
        this.formLinkedCell = value;
    }

    /**
     * Sets the value of the formMaxValue property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormMaxValue(final String value) {
        this.formMaxValue = value;
    }

    /**
     * Sets the value of the formMinValue property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormMinValue(final String value) {
        this.formMinValue = value;
    }

    /**
     * Sets the value of the formOrientation property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormOrientation(final String value) {
        this.formOrientation = value;
    }

    /**
     * Sets the value of the formPageStepSize property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormPageStepSize(final String value) {
        this.formPageStepSize = value;
    }

    /**
     * Sets the value of the formPrintable property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormPrintable(final String value) {
        this.formPrintable = value;
    }

    /**
     * Sets the value of the formProperties property.
     * 
     * @param value allowed object is {@link FormProperties }
     * 
     */
    public void setFormProperties(final FormProperties value) {
        this.formProperties = value;
    }

    /**
     * Sets the value of the formStepSize property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormStepSize(final String value) {
        this.formStepSize = value;
    }

    /**
     * Sets the value of the formTabIndex property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormTabIndex(final String value) {
        this.formTabIndex = value;
    }

    /**
     * Sets the value of the formTabStop property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormTabStop(final String value) {
        this.formTabStop = value;
    }

    /**
     * Sets the value of the formTitle property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormTitle(final String value) {
        this.formTitle = value;
    }

    /**
     * Sets the value of the formValue property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFormValue(final String value) {
        this.formValue = value;
    }

    /**
     * Sets the value of the officeEvents property.
     * 
     * @param value allowed object is {@link OfficeEvents }
     * 
     */
    public void setOfficeEvents(final OfficeEvents value) {
        this.officeEvents = value;
    }

}
