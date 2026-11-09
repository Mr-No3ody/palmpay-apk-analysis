package com.transsnet.palmpay.custom_view;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends GridLayoutManager.SpanSizeLookup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GridLayoutManager f31024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f31025b;

    public I(J j6, GridLayoutManager gridLayoutManager) {
        this.f31025b = j6;
        this.f31024a = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i7) {
        J j6 = this.f31025b;
        boolean zA = j6.a(i7);
        GridLayoutManager.SpanSizeLookup spanSizeLookup = j6.f31027b.f31145g;
        if (spanSizeLookup != null && !zA) {
            return spanSizeLookup.getSpanSize(i7);
        }
        if (zA) {
            return this.f31024a.getSpanCount();
        }
        return 1;
    }
}
