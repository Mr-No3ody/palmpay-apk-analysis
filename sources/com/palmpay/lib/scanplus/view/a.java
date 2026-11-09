package com.palmpay.lib.scanplus.view;

import androidx.lifecycle.EnumC1203m;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24054a;

    static {
        int[] iArr = new int[EnumC1203m.values().length];
        try {
            iArr[EnumC1203m.ON_STOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC1203m.ON_DESTROY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f24054a = iArr;
    }
}
