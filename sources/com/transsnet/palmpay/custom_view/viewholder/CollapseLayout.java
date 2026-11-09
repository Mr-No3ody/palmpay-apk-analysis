package com.transsnet.palmpay.custom_view.viewholder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class CollapseLayout extends BaseModel implements View.OnClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f31710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CollapseCallback f31711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31712g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31713i;

    public interface CollapseCallback {
        void collapse(boolean z3);
    }

    public CollapseLayout(Context context) {
        this(context, null);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        setOrientation(1);
        return this;
    }

    public final void d(boolean z3) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt != null) {
                if (i7 == getChildCount() - 1) {
                    childAt.setVisibility(0);
                } else {
                    childAt.setVisibility(z3 ? 8 : 0);
                }
            }
        }
        this.f31710e.setImageResource(this.f31709d ? this.f31712g : this.f31713i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f31708c) {
            return;
        }
        this.f31708c = true;
        ImageView imageView = new ImageView(getContext());
        this.f31710e = imageView;
        imageView.setImageResource(this.f31712g);
        this.f31710e.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f31710e.setPadding(20, 20, 20, 20);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = SizeUtils.dp2px(16.0f);
        this.f31710e.setOnClickListener(this);
        addView(this.f31710e, layoutParams);
        d(this.f31709d);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z3 = !this.f31709d;
        this.f31709d = z3;
        d(z3);
        CollapseCallback collapseCallback = this.f31711f;
        if (collapseCallback != null) {
            collapseCallback.collapse(this.f31709d);
        }
    }

    public void setCollapseCallback(CollapseCallback collapseCallback) {
        this.f31711f = collapseCallback;
    }

    public void setResCollapseOff(int i7) {
        this.f31713i = i7;
    }

    public void setResCollapseOn(int i7) {
        this.f31712g = i7;
    }

    public CollapseLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CollapseLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31708c = false;
        this.f31709d = true;
        this.f31712g = r.cv_arrow_down_with_bg;
        this.f31713i = r.cv_arrow_up_with_bg;
    }
}
