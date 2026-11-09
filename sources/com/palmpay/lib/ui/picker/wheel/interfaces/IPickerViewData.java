package com.palmpay.lib.ui.picker.wheel.interfaces;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface IPickerViewData {
    <T extends IPickerViewData> List<T> getChildList();

    String getPickerViewText();
}
