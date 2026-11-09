package com.rnmaps.maps;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class I extends s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MapWMSTile f24714n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(MapWMSTile mapWMSTile, int i7, String str, int i10, int i11, int i12, String str2, int i13, boolean z3, Context context, boolean z8) {
        super(i7, false, str, i10, i11, i12, false, str2, i13, z3, context, z8);
        this.f24714n = mapWMSTile;
        this.f24972a = new H(this, i7, i7, str);
    }
}
