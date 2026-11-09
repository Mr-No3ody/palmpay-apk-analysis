package com.transsnet.palmpay.core.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseActivity f27349a;

    public e(BaseActivity baseActivity) {
        this.f27349a = baseActivity;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        View viewA = this.f27349a.getDelegate().a(view, str, context, attributeSet);
        try {
            F6.d.h("View", 4, str + "/" + viewA + " cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        } catch (Exception unused) {
        }
        return viewA;
    }
}
