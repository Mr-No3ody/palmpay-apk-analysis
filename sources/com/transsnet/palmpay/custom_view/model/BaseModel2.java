package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class BaseModel2 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f31419a;

    public BaseModel2(Context context) {
        super(context, null);
        a(context);
    }

    public final void a(Context context) {
        this.f31419a = context;
        c(context);
    }

    public void b(Context context, AttributeSet attributeSet, int i7) {
        a(context);
    }

    public abstract View c(Context context);

    public BaseModel2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet, 0);
    }

    public BaseModel2(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        b(context, attributeSet, i7);
    }
}
