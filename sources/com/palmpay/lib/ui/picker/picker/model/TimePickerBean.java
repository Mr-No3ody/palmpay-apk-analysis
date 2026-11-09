package com.palmpay.lib.ui.picker.picker.model;

import com.palmpay.lib.ui.picker.wheel.interfaces.IPickerViewData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TimePickerBean implements IPickerViewData {
    private String data;
    private Integer time;

    public TimePickerBean(String str, Integer num) {
        this.data = str;
        this.time = num;
    }

    @Override // com.palmpay.lib.ui.picker.wheel.interfaces.IPickerViewData
    public List<IPickerViewData> getChildList() {
        return null;
    }

    public String getData() {
        return this.data;
    }

    @Override // com.palmpay.lib.ui.picker.wheel.interfaces.IPickerViewData
    public String getPickerViewText() {
        return this.data;
    }

    public Integer getTime() {
        return this.time;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }
}
