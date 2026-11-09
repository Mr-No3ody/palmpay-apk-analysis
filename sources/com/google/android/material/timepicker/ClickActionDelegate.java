package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import androidx.core.view.C1050b;
import p074f0.d;

/* JADX INFO: loaded from: classes2.dex */
class ClickActionDelegate extends C1050b {
    private final p074f0.c clickAction;

    public ClickActionDelegate(Context context, int i7) {
        this.clickAction = new p074f0.c(16, context.getString(i7));
    }

    @Override // androidx.core.view.C1050b
    public void onInitializeAccessibilityNodeInfo(View view, d dVar) {
        super.onInitializeAccessibilityNodeInfo(view, dVar);
        dVar.b(this.clickAction);
    }
}
