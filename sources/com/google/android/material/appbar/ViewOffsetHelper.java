package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.N;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
class ViewOffsetHelper {
    private int layoutLeft;
    private int layoutTop;
    private int offsetLeft;
    private int offsetTop;
    private final View view;
    private boolean verticalOffsetEnabled = true;
    private boolean horizontalOffsetEnabled = true;

    public ViewOffsetHelper(View view) {
        this.view = view;
    }

    public void applyOffsets() {
        View view = this.view;
        int top2 = this.offsetTop - (view.getTop() - this.layoutTop);
        WeakHashMap weakHashMap = N.f16168a;
        view.offsetTopAndBottom(top2);
        View view2 = this.view;
        view2.offsetLeftAndRight(this.offsetLeft - (view2.getLeft() - this.layoutLeft));
    }

    public int getLayoutLeft() {
        return this.layoutLeft;
    }

    public int getLayoutTop() {
        return this.layoutTop;
    }

    public int getLeftAndRightOffset() {
        return this.offsetLeft;
    }

    public int getTopAndBottomOffset() {
        return this.offsetTop;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.horizontalOffsetEnabled;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.verticalOffsetEnabled;
    }

    public void onViewLayout() {
        this.layoutTop = this.view.getTop();
        this.layoutLeft = this.view.getLeft();
    }

    public void setHorizontalOffsetEnabled(boolean z3) {
        this.horizontalOffsetEnabled = z3;
    }

    public boolean setLeftAndRightOffset(int i7) {
        if (!this.horizontalOffsetEnabled || this.offsetLeft == i7) {
            return false;
        }
        this.offsetLeft = i7;
        applyOffsets();
        return true;
    }

    public boolean setTopAndBottomOffset(int i7) {
        if (!this.verticalOffsetEnabled || this.offsetTop == i7) {
            return false;
        }
        this.offsetTop = i7;
        applyOffsets();
        return true;
    }

    public void setVerticalOffsetEnabled(boolean z3) {
        this.verticalOffsetEnabled = z3;
    }
}
