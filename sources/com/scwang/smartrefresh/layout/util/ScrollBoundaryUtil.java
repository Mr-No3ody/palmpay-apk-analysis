package com.scwang.smartrefresh.layout.util;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class ScrollBoundaryUtil {
    public static boolean canLoadMore(@NonNull View view, PointF pointF, boolean z3) {
        if (canScrollDown(view) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            PointF pointF2 = new PointF();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (isTransformedTouchPointInView(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean zCanLoadMore = canLoadMore(childAt, pointF, z3);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return zCanLoadMore;
                }
            }
        }
        return z3 || canScrollUp(view);
    }

    public static boolean canRefresh(@NonNull View view, PointF pointF) {
        if (canScrollUp(view) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (isTransformedTouchPointInView(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                pointF.offset(pointF2.x, pointF2.y);
                boolean zCanRefresh = canRefresh(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return zCanRefresh;
            }
        }
        return true;
    }

    public static boolean canScrollDown(@NonNull View view) {
        return view.canScrollVertically(1);
    }

    public static boolean canScrollUp(@NonNull View view) {
        return view.canScrollVertically(-1);
    }

    public static boolean isTransformedTouchPointInView(@NonNull View view, @NonNull View view2, float f10, float f11, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f10, f11};
        fArr[0] = (view.getScrollX() - view2.getLeft()) + f10;
        float scrollY = fArr[1] + (view.getScrollY() - view2.getTop());
        fArr[1] = scrollY;
        float f12 = fArr[0];
        boolean z3 = f12 >= 0.0f && scrollY >= 0.0f && f12 < ((float) view2.getWidth()) && fArr[1] < ((float) view2.getHeight());
        if (z3 && pointF != null) {
            pointF.set(fArr[0] - f10, fArr[1] - f11);
        }
        return z3;
    }
}
