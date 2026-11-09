package com.transsnet.palmpay.core.listener;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public interface OnSendCodeListener {
    default void onButtonVisibilityChange(View view, int visibility) {
    }

    void onSend(int type, int subId, String extra);
}
