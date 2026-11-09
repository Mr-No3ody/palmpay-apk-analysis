package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
final class RightSheetDelegate extends SheetDelegate {
    final SideSheetBehavior<? extends View> sheetBehavior;

    public RightSheetDelegate(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.sheetBehavior = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int calculateInnerMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public float calculateSlideOffset(int i7) {
        float hiddenOffset = getHiddenOffset();
        return (hiddenOffset - i7) / (hiddenOffset - getExpandedOffset());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getCoplanarSiblingAdjacentMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getExpandedOffset() {
        return Math.max(0, (getHiddenOffset() - this.sheetBehavior.getChildWidth()) - this.sheetBehavior.getInnerMargin());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getHiddenOffset() {
        return this.sheetBehavior.getParentWidth();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getMaxViewPositionHorizontal() {
        return this.sheetBehavior.getParentWidth();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getMinViewPositionHorizontal() {
        return getExpandedOffset();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public <V extends View> int getOuterEdge(@NonNull V v3) {
        return v3.getLeft() - this.sheetBehavior.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getParentInnerEdge(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getSheetEdge() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isExpandingOutwards(float f10) {
        return f10 < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isReleasedCloseToInnerEdge(@NonNull View view) {
        return view.getLeft() > (getHiddenOffset() + getExpandedOffset()) / 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isSwipeSignificant(float f10, float f11) {
        return SheetUtils.isSwipeMostlyHorizontal(f10, f11) && Math.abs(f10) > ((float) this.sheetBehavior.getSignificantVelocityThreshold());
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean shouldHide(@NonNull View view, float f10) {
        return Math.abs((this.sheetBehavior.getHideFriction() * f10) + ((float) view.getRight())) > this.sheetBehavior.getHideThreshold();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public void updateCoplanarSiblingAdjacentMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i7) {
        marginLayoutParams.rightMargin = i7;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public void updateCoplanarSiblingLayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i10) {
        int parentWidth = this.sheetBehavior.getParentWidth();
        if (i7 <= parentWidth) {
            marginLayoutParams.rightMargin = parentWidth - i7;
        }
    }
}
