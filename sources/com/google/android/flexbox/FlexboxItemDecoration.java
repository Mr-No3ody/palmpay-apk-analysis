package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.u;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FlexboxItemDecoration extends RecyclerView.ItemDecoration {
    public static final int BOTH = 3;
    public static final int HORIZONTAL = 1;
    private static final int[] LIST_DIVIDER_ATTRS = {android.R.attr.listDivider};
    public static final int VERTICAL = 2;
    private Drawable mDrawable;
    private int mOrientation;

    public FlexboxItemDecoration(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(LIST_DIVIDER_ATTRS);
        this.mDrawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(3);
    }

    private void drawHorizontalDecorations(Canvas canvas, RecyclerView recyclerView) {
        int top2;
        int intrinsicHeight;
        int left;
        int right;
        int i7;
        int iMin;
        int left2;
        if (needsHorizontalDecoration()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            int left3 = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int paddingRight = recyclerView.getPaddingRight() + recyclerView.getRight();
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (flexDirection == 3) {
                    intrinsicHeight = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    top2 = this.mDrawable.getIntrinsicHeight() + intrinsicHeight;
                } else {
                    top2 = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    intrinsicHeight = top2 - this.mDrawable.getIntrinsicHeight();
                }
                if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                    if (flexboxLayoutManager.isLayoutRtl()) {
                        iMin = Math.min(this.mDrawable.getIntrinsicWidth() + childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, paddingRight);
                        left2 = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    } else {
                        left = Math.max((childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDrawable.getIntrinsicWidth(), left3);
                        right = childAt.getRight();
                        i7 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    }
                    this.mDrawable.setBounds(left2, intrinsicHeight, iMin, top2);
                    this.mDrawable.draw(canvas);
                } else {
                    left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    right = childAt.getRight();
                    i7 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }
                int i11 = left;
                iMin = right + i7;
                left2 = i11;
                this.mDrawable.setBounds(left2, intrinsicHeight, iMin, top2);
                this.mDrawable.draw(canvas);
            }
        }
    }

    private void drawVerticalDecorations(Canvas canvas, RecyclerView recyclerView) {
        int left;
        int intrinsicWidth;
        int iMax;
        int bottom;
        int i7;
        int i10;
        if (needsVerticalDecoration()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top2 = recyclerView.getTop() - recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom() + recyclerView.getBottom();
            int childCount = recyclerView.getChildCount();
            int flexDirection = flexboxLayoutManager.getFlexDirection();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (flexboxLayoutManager.isLayoutRtl()) {
                    intrinsicWidth = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    left = this.mDrawable.getIntrinsicWidth() + intrinsicWidth;
                } else {
                    left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    intrinsicWidth = left - this.mDrawable.getIntrinsicWidth();
                }
                if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
                    iMax = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    bottom = childAt.getBottom();
                    i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                } else {
                    if (flexDirection == 3) {
                        int iMin = Math.min(this.mDrawable.getIntrinsicHeight() + childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, paddingBottom);
                        iMax = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        i10 = iMin;
                    } else {
                        iMax = Math.max((childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDrawable.getIntrinsicHeight(), top2);
                        bottom = childAt.getBottom();
                        i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    this.mDrawable.setBounds(intrinsicWidth, iMax, left, i10);
                    this.mDrawable.draw(canvas);
                }
                i10 = bottom + i7;
                this.mDrawable.setBounds(intrinsicWidth, iMax, left, i10);
                this.mDrawable.draw(canvas);
            }
        }
    }

    private boolean isFirstItemInLine(int i7, List<FlexLine> list, FlexboxLayoutManager flexboxLayoutManager) {
        int positionToFlexLineIndex = flexboxLayoutManager.getPositionToFlexLineIndex(i7);
        if ((positionToFlexLineIndex == -1 || positionToFlexLineIndex >= flexboxLayoutManager.getFlexLinesInternal().size() || flexboxLayoutManager.getFlexLinesInternal().get(positionToFlexLineIndex).mFirstIndex != i7) && i7 != 0) {
            return list.size() != 0 && ((FlexLine) u.e(1, list)).mLastIndex == i7 - 1;
        }
        return true;
    }

    private boolean needsHorizontalDecoration() {
        return (this.mOrientation & 1) > 0;
    }

    private boolean needsVerticalDecoration() {
        return (this.mOrientation & 2) > 0;
    }

    private void setOffsetAlongCrossAxis(Rect rect, int i7, FlexboxLayoutManager flexboxLayoutManager, List<FlexLine> list) {
        if (list.size() == 0 || flexboxLayoutManager.getPositionToFlexLineIndex(i7) == 0) {
            return;
        }
        if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
            if (needsHorizontalDecoration()) {
                rect.top = this.mDrawable.getIntrinsicHeight();
                rect.bottom = 0;
                return;
            } else {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
        }
        if (needsVerticalDecoration()) {
            if (flexboxLayoutManager.isLayoutRtl()) {
                rect.right = this.mDrawable.getIntrinsicWidth();
                rect.left = 0;
            } else {
                rect.left = this.mDrawable.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }

    private void setOffsetAlongMainAxis(Rect rect, int i7, FlexboxLayoutManager flexboxLayoutManager, List<FlexLine> list, int i10) {
        if (isFirstItemInLine(i7, list, flexboxLayoutManager)) {
            return;
        }
        if (flexboxLayoutManager.isMainAxisDirectionHorizontal()) {
            if (!needsVerticalDecoration()) {
                rect.left = 0;
                rect.right = 0;
                return;
            } else if (flexboxLayoutManager.isLayoutRtl()) {
                rect.right = this.mDrawable.getIntrinsicWidth();
                rect.left = 0;
                return;
            } else {
                rect.left = this.mDrawable.getIntrinsicWidth();
                rect.right = 0;
                return;
            }
        }
        if (!needsHorizontalDecoration()) {
            rect.top = 0;
            rect.bottom = 0;
        } else if (i10 == 3) {
            rect.bottom = this.mDrawable.getIntrinsicHeight();
            rect.top = 0;
        } else {
            rect.top = this.mDrawable.getIntrinsicHeight();
            rect.bottom = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            return;
        }
        if (!needsHorizontalDecoration() && !needsVerticalDecoration()) {
            rect.set(0, 0, 0, 0);
            return;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        List<FlexLine> flexLines = flexboxLayoutManager.getFlexLines();
        setOffsetAlongMainAxis(rect, childAdapterPosition, flexboxLayoutManager, flexLines, flexboxLayoutManager.getFlexDirection());
        setOffsetAlongCrossAxis(rect, childAdapterPosition, flexboxLayoutManager, flexLines);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        drawHorizontalDecorations(canvas, recyclerView);
        drawVerticalDecorations(canvas, recyclerView);
    }

    public void setDrawable(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.mDrawable = drawable;
    }

    public void setOrientation(int i7) {
        this.mOrientation = i7;
    }
}
