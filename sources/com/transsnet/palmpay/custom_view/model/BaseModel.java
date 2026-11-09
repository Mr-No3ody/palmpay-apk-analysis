package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p103gf.a;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class BaseModel extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f31417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f31418b;

    public BaseModel(Context context) {
        super(context, null);
        a(context);
    }

    public void a(Context context) {
        this.f31417a = context;
        c(context);
    }

    public void b(Context context, AttributeSet attributeSet, int i7) {
        a(context);
    }

    public abstract View c(Context context);

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f31418b;
        if (aVar != null) {
            aVar.dispose();
            this.f31418b = null;
        }
    }

    public BaseModel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet, 0);
    }

    public BaseModel(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        b(context, attributeSet, i7);
    }
}
