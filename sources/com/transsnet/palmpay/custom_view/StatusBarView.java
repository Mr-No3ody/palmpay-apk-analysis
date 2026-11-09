package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class StatusBarView extends View {
    public StatusBarView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        int statusBarHeight = BarUtils.getStatusBarHeight();
        if (statusBarHeight <= 0) {
            statusBarHeight = SizeUtils.dp2px(24.0f);
        }
        setMeasuredDimension(size, statusBarHeight);
    }

    public StatusBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StatusBarView(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
