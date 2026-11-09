package com.transsnet.adsdk.widgets.banner.bannerview.transform;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes3.dex */
public class ScaleInTransformer implements ViewPager2.PageTransformer {
    private static final float DEFAULT_CENTER = 0.5f;
    public static final float DEFAULT_MIN_SCALE = 0.85f;
    private final boolean mIsRtl;
    private final float mMinScale;

    public ScaleInTransformer(float minScale, boolean isRtl) {
        this.mMinScale = minScale;
        this.mIsRtl = isRtl;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float position) {
        if (this.mIsRtl) {
            position = -position;
        }
        int width = view.getWidth();
        view.setPivotY(view.getHeight() / 2.0f);
        float f10 = width;
        view.setPivotX(f10 / 2.0f);
        if (position < -1.0f) {
            view.setScaleX(this.mMinScale);
            view.setScaleY(this.mMinScale);
            view.setPivotX(f10);
            return;
        }
        if (position > 1.0f) {
            view.setPivotX(0.0f);
            view.setScaleX(this.mMinScale);
            view.setScaleY(this.mMinScale);
        } else {
            if (position < 0.0f) {
                float f11 = this.mMinScale;
                float f12 = ((1.0f - f11) * (position + 1.0f)) + f11;
                view.setScaleX(f12);
                view.setScaleY(f12);
                view.setPivotX((((-position) * DEFAULT_CENTER) + DEFAULT_CENTER) * f10);
                return;
            }
            float f13 = 1.0f - position;
            float f14 = this.mMinScale;
            float f15 = ((1.0f - f14) * f13) + f14;
            view.setScaleX(f15);
            view.setScaleY(f15);
            view.setPivotX(f13 * DEFAULT_CENTER * f10);
        }
    }
}
