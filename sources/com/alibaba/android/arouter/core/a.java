package com.alibaba.android.arouter.core;

import com.alibaba.android.arouter.facade.enums.RouteType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20350a;

    static {
        int[] iArr = new int[RouteType.values().length];
        f20350a = iArr;
        try {
            iArr[RouteType.PROVIDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f20350a[RouteType.FRAGMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
