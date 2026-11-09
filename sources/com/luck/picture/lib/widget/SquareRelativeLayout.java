package com.luck.picture.lib.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes3.dex */
public class SquareRelativeLayout extends RelativeLayout {
    public SquareRelativeLayout(Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i7);
    }

    public SquareRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareRelativeLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    @TargetApi(21)
    public SquareRelativeLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        super(context, attributeSet, i7, i10);
    }
}
