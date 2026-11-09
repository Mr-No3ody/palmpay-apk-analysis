package com.transsnet.palmpay.util;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class SizeUtils {

    public interface onGetSizeListener {
        void onGetSize(View view);
    }

    private SizeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int dp2px(float f10) {
        return (int) ((f10 * Utils.getApp().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int getMeasuredHeight(View view) {
        return measureView(view)[1];
    }

    public static int getMeasuredWidth(View view) {
        return measureView(view)[0];
    }

    public static int[] measureView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i7 = layoutParams.height;
        view.measure(childMeasureSpec, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
    }

    public static int px2dp(float f10) {
        return (int) ((f10 / Utils.getApp().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2sp(float f10) {
        return (int) ((f10 / Utils.getApp().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int sp2px(float f10) {
        return (int) ((f10 * Utils.getApp().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
