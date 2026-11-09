package com.scwang.smartrefresh.layout.util;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes3.dex */
public class DensityUtil {
    public float density = Resources.getSystem().getDisplayMetrics().density;

    public static int dp2px(float f10) {
        return (int) ((f10 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static float px2dp(int i7) {
        return i7 / Resources.getSystem().getDisplayMetrics().density;
    }

    public int dip2px(float f10) {
        return (int) ((f10 * this.density) + 0.5f);
    }

    public float px2dip(int i7) {
        return i7 / this.density;
    }
}
