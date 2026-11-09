package com.scwang.smartrefresh.layout.util;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ScrollingView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes3.dex */
public class SmartUtil {
    public static void fling(View view, int i7) {
        if (view instanceof ScrollView) {
            ((ScrollView) view).fling(i7);
            return;
        }
        if (view instanceof AbsListView) {
            ((AbsListView) view).fling(i7);
            return;
        }
        if (view instanceof WebView) {
            ((WebView) view).flingScroll(0, i7);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).d(i7);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).fling(0, i7);
        }
    }

    public static int getColor(@NonNull Context context, @ColorRes int i7) {
        return context.getColor(i7);
    }

    public static boolean isScrollableView(View view) {
        return (view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof ScrollingView) || (view instanceof WebView) || (view instanceof ViewPager) || (view instanceof NestedScrollingChild) || (view instanceof NestedScrollingParent);
    }

    public static int measureViewHeight(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i7 = layoutParams.height;
        view.measure(childMeasureSpec, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static void scrollListBy(@NonNull AbsListView absListView, int i7) {
        absListView.scrollListBy(i7);
    }
}
