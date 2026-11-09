package com.google.android.flexbox;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
interface FlexContainer {
    public static final int NOT_SET = -1;

    void addView(View view);

    void addView(View view, int i7);

    int getAlignContent();

    int getAlignItems();

    int getChildHeightMeasureSpec(int i7, int i10, int i11);

    int getChildWidthMeasureSpec(int i7, int i10, int i11);

    int getDecorationLengthCrossAxis(View view);

    int getDecorationLengthMainAxis(View view, int i7, int i10);

    int getFlexDirection();

    View getFlexItemAt(int i7);

    int getFlexItemCount();

    List<FlexLine> getFlexLines();

    List<FlexLine> getFlexLinesInternal();

    int getFlexWrap();

    int getJustifyContent();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    View getReorderedFlexItemAt(int i7);

    int getSumOfCrossSize();

    boolean isMainAxisDirectionHorizontal();

    void onNewFlexItemAdded(View view, int i7, int i10, FlexLine flexLine);

    void onNewFlexLineAdded(FlexLine flexLine);

    void removeAllViews();

    void removeViewAt(int i7);

    void setAlignContent(int i7);

    void setAlignItems(int i7);

    void setFlexDirection(int i7);

    void setFlexLines(List<FlexLine> list);

    void setFlexWrap(int i7);

    void setJustifyContent(int i7);

    void setMaxLine(int i7);

    void updateViewCache(int i7, View view);
}
