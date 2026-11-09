package com.transsnet.palmpay.custom_view;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GridLayoutManager f30942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f30943b;

    public B(C c6, GridLayoutManager gridLayoutManager) {
        this.f30943b = c6;
        this.f30942a = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        C c6 = this.f30943b;
        boolean zA = c6.a(i7);
        GridLayoutManager.SpanSizeLookup spanSizeLookup = c6.f30945b.f31113f;
        if (spanSizeLookup != null && !zA) {
            return spanSizeLookup.getSpanSize(i7);
        }
        if (zA) {
            return this.f30942a.getSpanCount();
        }
        return 1;
    }
}
