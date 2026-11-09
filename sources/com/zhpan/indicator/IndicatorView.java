package com.zhpan.indicator;

import Ra.a;
import Ue.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import com.zhpan.indicator.base.BaseIndicatorView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/zhpan/indicator/IndicatorView;", "Lcom/zhpan/indicator/base/BaseIndicatorView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LVe/a;", "options", "", "setIndicatorOptions", "(LVe/a;)V", "orientation", "setOrientation", "(I)V", "indicator_release"}, k = 1, mv = {1, 4, 0})
public final class IndicatorView extends BaseIndicatorView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f35483a;

    @JvmOverloads
    public IndicatorView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @Override // com.zhpan.indicator.base.BaseIndicatorView, com.zhpan.indicator.base.IIndicator
    public final void notifyDataChanged() {
        this.f35483a = new a(getMIndicatorOptions());
        super.notifyDataChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.g(canvas, "canvas");
        super.onDraw(canvas);
        if (getMIndicatorOptions().f10329a == 1) {
            canvas.rotate(90.0f, getWidth() / 2.0f, getWidth() / 2.0f);
        } else if (getMIndicatorOptions().f10329a == 3) {
            canvas.rotate(180.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        this.f35483a.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        this.f35483a.getClass();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        b bVarOnMeasure = this.f35483a.onMeasure(i7, i10);
        setMeasuredDimension(bVarOnMeasure.f9754a, bVarOnMeasure.f9755b);
    }

    @Override // com.zhpan.indicator.base.BaseIndicatorView, com.zhpan.indicator.base.IIndicator
    public void setIndicatorOptions(@NotNull Ve.a options) {
        Intrinsics.g(options, "options");
        super.setIndicatorOptions(options);
        a aVar = this.f35483a;
        aVar.getClass();
        aVar.a(options);
    }

    public final void setOrientation(int orientation) {
        getMIndicatorOptions().f10329a = orientation;
    }

    @JvmOverloads
    public IndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ IndicatorView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.g(context, "context");
        Ve.a mIndicatorOptions = getMIndicatorOptions();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Se.a.IndicatorView);
            int i10 = typedArrayObtainStyledAttributes.getInt(Se.a.IndicatorView_vpi_slide_mode, 0);
            int i11 = typedArrayObtainStyledAttributes.getInt(Se.a.IndicatorView_vpi_style, 0);
            int color = typedArrayObtainStyledAttributes.getColor(Se.a.IndicatorView_vpi_slider_checked_color, Color.parseColor("#6C6D72"));
            int color2 = typedArrayObtainStyledAttributes.getColor(Se.a.IndicatorView_vpi_slider_normal_color, Color.parseColor("#8C18171C"));
            int i12 = typedArrayObtainStyledAttributes.getInt(Se.a.IndicatorView_vpi_orientation, 0);
            float dimension = typedArrayObtainStyledAttributes.getDimension(Se.a.IndicatorView_vpi_slider_radius, f.f(8.0f));
            mIndicatorOptions.f10334f = color;
            mIndicatorOptions.f10333e = color2;
            mIndicatorOptions.f10329a = i12;
            mIndicatorOptions.f10330b = i11;
            mIndicatorOptions.f10331c = i10;
            float f10 = dimension * 2.0f;
            mIndicatorOptions.f10337i = f10;
            mIndicatorOptions.f10338j = f10;
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f35483a = new a(getMIndicatorOptions());
    }
}
