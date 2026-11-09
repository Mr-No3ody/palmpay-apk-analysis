package com.transsnet.palmpay.util;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes4.dex */
public class ScrollViewUtils {
    private static void getDeepChildOffset(ViewGroup viewGroup, ViewParent viewParent, View view, Point point) {
        ViewGroup viewGroup2 = (ViewGroup) viewParent;
        point.x = view.getLeft() + point.x;
        point.y = view.getTop() + point.y;
        if (viewGroup2.equals(viewGroup)) {
            return;
        }
        getDeepChildOffset(viewGroup, viewGroup2.getParent(), viewGroup2, point);
    }

    public static void scrollToView(ScrollView scrollView, View view) {
        if (scrollView == null || view == null) {
            return;
        }
        Point point = new Point();
        getDeepChildOffset(scrollView, view.getParent(), view, point);
        int paddingTop = point.y - scrollView.getPaddingTop();
        if (paddingTop <= 0) {
            paddingTop = 0;
        }
        scrollView.smoothScrollTo(0, paddingTop);
    }

    public static void scrollToView(NestedScrollView nestedScrollView, View view) {
        if (nestedScrollView == null || view == null) {
            return;
        }
        Point point = new Point();
        getDeepChildOffset(nestedScrollView, view.getParent(), view, point);
        int paddingTop = point.y - nestedScrollView.getPaddingTop();
        if (paddingTop <= 0) {
            paddingTop = 0;
        }
        nestedScrollView.p(paddingTop);
    }
}
