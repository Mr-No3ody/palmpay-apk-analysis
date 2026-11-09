package com.github.chrisbanes.photoview;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22337a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        f22337a = iArr;
        try {
            iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f22337a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f22337a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f22337a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
