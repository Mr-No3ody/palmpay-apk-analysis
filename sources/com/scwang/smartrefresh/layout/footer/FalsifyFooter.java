package com.scwang.smartrefresh.layout.footer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.scwang.smartrefresh.layout.R;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshKernel;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.internal.InternalAbstract;
import com.scwang.smartrefresh.layout.util.DensityUtil;

/* JADX INFO: loaded from: classes3.dex */
public class FalsifyFooter extends InternalAbstract implements RefreshFooter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RefreshKernel f25118c;

    public FalsifyFooter(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int iDp2px = DensityUtil.dp2px(5.0f);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-858993460);
            paint.setStrokeWidth(DensityUtil.dp2px(1.0f));
            float f10 = iDp2px;
            paint.setPathEffect(new DashPathEffect(new float[]{f10, f10, f10, f10}, 1.0f));
            canvas.drawRect(f10, f10, getWidth() - iDp2px, getBottom() - iDp2px, paint);
            TextView textView = new TextView(getContext());
            textView.setText(getResources().getString(R.string.srl_component_falsify, getClass().getSimpleName(), Float.valueOf(DensityUtil.px2dp(getHeight()))));
            textView.setTextColor(-858993460);
            textView.setGravity(17);
            textView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
            textView.layout(0, 0, getWidth(), getHeight());
            textView.draw(canvas);
        }
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onInitialized(@NonNull RefreshKernel refreshKernel, int i7, int i10) {
        this.f25118c = refreshKernel;
        refreshKernel.getRefreshLayout().setEnableAutoLoadMore(false);
    }

    @Override // com.scwang.smartrefresh.layout.internal.InternalAbstract, com.scwang.smartrefresh.layout.api.RefreshInternal
    public void onReleased(@NonNull RefreshLayout refreshLayout, int i7, int i10) {
        RefreshKernel refreshKernel = this.f25118c;
        if (refreshKernel != null) {
            refreshKernel.setState(RefreshState.None);
            this.f25118c.setState(RefreshState.LoadFinish);
        }
    }

    @Override // com.scwang.smartrefresh.layout.api.RefreshFooter
    public boolean setNoMoreData(boolean z3) {
        return false;
    }

    public FalsifyFooter(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }

    public FalsifyFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
