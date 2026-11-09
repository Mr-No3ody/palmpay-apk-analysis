package com.github.chrisbanes.photoview;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22367a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        f22367a = iArr;
        try {
            iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
    }
}
