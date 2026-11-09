package com.github.xiaofeidev.shadow;

import I4.b;
import Md.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.github.xiaofeidev.shadow.round.RoundStatus;
import com.github.xiaofeidev.shadow.shadow.ShadowStatus;

/* JADX INFO: loaded from: classes.dex */
public class ShadowFrameLayout extends FrameLayout implements ShadowStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f22448a;

    public ShadowFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        setLayerType(1, null);
        this.f22448a.onDraw(canvas);
        setLayerType(2, null);
        super.draw(canvas);
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public int getBlurRadius() {
        return this.f22448a.f4006c.f4000a;
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public RoundStatus getRoundStatus() {
        return this.f22448a.f4005b;
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public int getShadowColor() {
        return this.f22448a.f4006c.f4003d;
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public int getShadowOffsetX() {
        return this.f22448a.f4006c.f4001b;
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public int getShadowOffsetY() {
        return this.f22448a.f4006c.f4002c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f22448a.onSizeChanged(i7, i10, i11, i12);
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public void setBlurRadius(int i7) {
        this.f22448a.setBlurRadius(i7);
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public void setRadius(@NonNull RoundStatus roundStatus) {
        this.f22448a.setRadius(roundStatus);
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public void setShadowColor(int i7) {
        this.f22448a.setShadowColor(i7);
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public void setShadowOffsetX(int i7) {
        this.f22448a.setShadowOffsetX(i7);
    }

    @Override // com.github.xiaofeidev.shadow.shadow.ShadowStatus
    public void setShadowOffsetY(int i7) {
        this.f22448a.setShadowOffsetY(i7);
    }

    public ShadowFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ShadowFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        int i10 = 0;
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.ShadowFrameLayout, 0, 0);
        try {
            float dimension = typedArrayObtainStyledAttributes.getDimension(a.ShadowFrameLayout_shadow_corner_radius, 0.0f);
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(a.ShadowFrameLayout_shadow_corner_top_left_radius, -1.0f);
            float dimension3 = typedArrayObtainStyledAttributes.getDimension(a.ShadowFrameLayout_shadow_corner_top_right_radius, -1.0f);
            float dimension4 = typedArrayObtainStyledAttributes.getDimension(a.ShadowFrameLayout_shadow_corner_bottom_right_radius, -1.0f);
            float dimension5 = typedArrayObtainStyledAttributes.getDimension(a.ShadowFrameLayout_shadow_corner_bottom_left_radius, -1.0f);
            H4.a aVar = new H4.a();
            aVar.f3691f = new float[8];
            aVar.f3686a = dimension;
            aVar.f3690e = dimension4;
            aVar.f3687b = dimension2;
            aVar.f3688c = dimension3;
            aVar.f3689d = dimension5;
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.ShadowFrameLayout_shadow_blur_radius, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.ShadowFrameLayout_shadow_offset_x, 0);
            int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.ShadowFrameLayout_shadow_offset_y, 0);
            int color = typedArrayObtainStyledAttributes.getColor(a.ShadowFrameLayout_shadow_color, -16777216);
            if (dimensionPixelSize >= 0) {
                i10 = dimensionPixelSize;
            }
            dimensionPixelSize2 = Math.abs(dimensionPixelSize2) > i10 ? dimensionPixelSize2 > 0 ? i10 : -i10 : dimensionPixelSize2;
            dimensionPixelSize3 = Math.abs(dimensionPixelSize3) > i10 ? dimensionPixelSize3 > 0 ? i10 : -i10 : dimensionPixelSize3;
            I4.a aVar2 = new I4.a();
            aVar2.f4000a = i10;
            aVar2.f4001b = dimensionPixelSize2;
            aVar2.f4002c = dimensionPixelSize3;
            aVar2.f4003d = color;
            this.f22448a = new b(this, aVar, aVar2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
