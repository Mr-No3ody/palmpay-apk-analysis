package com.scwang.smartrefresh.layout.util;

import E7.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.CoordinatorLayoutListener;

/* JADX INFO: loaded from: classes3.dex */
public class DesignUtil {
    public static void checkCoordinatorLayout(View view, RefreshKernel refreshKernel, CoordinatorLayoutListener coordinatorLayoutListener) {
        try {
            if (view instanceof CoordinatorLayout) {
                refreshKernel.getRefreshLayout().setEnableNestedScroll(false);
                ViewGroup viewGroup = (ViewGroup) view;
                RefreshLayout refreshLayout = refreshKernel.getRefreshLayout();
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new a(coordinatorLayoutListener, refreshLayout));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
