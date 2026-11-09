package com.transsnet.palmpay.core.base;

import androidx.lifecycle.AbstractC1207q;

/* JADX INFO: loaded from: classes3.dex */
public interface IBaseView {
    default AbstractC1207q getCoroutineScope() {
        return null;
    }

    default void showLoadingDialog(boolean show) {
    }

    default void showLoadingDialog(boolean show, boolean cancelable) {
    }
}
