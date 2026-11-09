package com.palmpay.lib.liveness.ui.widget;

import L6.e;
import Y.j;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p232p6.q;
import p232p6.w;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated(message = "兼容性问题")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/palmpay/lib/liveness/ui/widget/CountdownProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", ViewProps.COLOR, "", "setProgressColor", "(I)V", "setBackgroundArcColor", "setCircleBackgroundColor", "setTextColor", "", "sizeSp", "setTextSizeSp", "(F)V", "widthDp", "setProgressStrokeWidthDp", "lib_liveness_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CustomViewStyleable"})
public final class CountdownProgressView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f23892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f23893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f23894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f23895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f23896g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f23897i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountdownProgressView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23891b = this.f23890a;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f10 = this.f23897i;
        float f11 = 2;
        float f12 = f10 / f11;
        float f13 = f10 / f11;
        Paint paint = this.f23895f;
        canvas.drawCircle(f12, f13, (f10 / f11) - paint.getStrokeWidth(), this.f23893d);
        RectF rectF = this.f23896g;
        canvas.drawArc(rectF, -90.0f, 360.0f, false, this.f23894e);
        canvas.drawArc(rectF, -90.0f, MessageEvent.EVENT_CL_REPAYMENT_FAILED * 0.0f, false, paint);
        String strValueOf = String.valueOf(this.f23891b);
        Rect rect = new Rect();
        Paint paint2 = this.f23892c;
        paint2.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
        canvas.drawText(strValueOf, f12, ((rect.height() / 2.0f) + f13) - rect.bottom, paint2);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int iMin = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        setMeasuredDimension(iMin, iMin);
        this.f23897i = iMin;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.f23897i = Math.min(i7, i10);
        float strokeWidth = this.f23895f.getStrokeWidth();
        RectF rectF = this.f23896g;
        float f10 = strokeWidth / 2;
        float f11 = this.f23897i;
        rectF.set(f10, f10, f11 - f10, f11 - f10);
    }

    public final void setBackgroundArcColor(int color) {
        this.f23894e.setColor(color);
        invalidate();
    }

    public final void setCircleBackgroundColor(int color) {
        this.f23893d.setColor(color);
        invalidate();
    }

    public final void setProgressColor(int color) {
        this.f23895f.setColor(color);
        invalidate();
    }

    public final void setProgressStrokeWidthDp(float widthDp) {
        float fApplyDimension = TypedValue.applyDimension(1, widthDp, getContext().getResources().getDisplayMetrics());
        this.f23895f.setStrokeWidth(fApplyDimension);
        this.f23894e.setStrokeWidth(fApplyDimension);
        RectF rectF = this.f23896g;
        float f10 = fApplyDimension / 2;
        float f11 = this.f23897i;
        rectF.set(f10, f10, f11 - f10, f11 - f10);
        invalidate();
    }

    public final void setTextColor(int color) {
        this.f23892c.setColor(color);
        invalidate();
    }

    public final void setTextSizeSp(float sizeSp) {
        this.f23892c.setTextSize(TypedValue.applyDimension(2, sizeSp, getContext().getResources().getDisplayMetrics()));
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountdownProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CountdownProgressView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CountdownProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23890a = 10;
        this.f23891b = 10;
        Paint paint = new Paint(1);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(j.a(e.lib_ui_palmpaynum_bold_ttf, context));
        this.f23892c = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.f23893d = paint2;
        Paint paint3 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        this.f23894e = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        this.f23895f = paint4;
        this.f23896g = new RectF();
        float fApplyDimension = TypedValue.applyDimension(2, 12.0f, context.getResources().getDisplayMetrics());
        float fApplyDimension2 = TypedValue.applyDimension(1, 1.5f, context.getResources().getDisplayMetrics());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.LivenessCountdownProgressView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            paint4.setColor(typedArrayObtainStyledAttributes.getColor(w.LivenessCountdownProgressView_cpv_progressColor, context.getColor(q.face_primary_color)));
            paint3.setColor(typedArrayObtainStyledAttributes.getColor(w.LivenessCountdownProgressView_cpv_backgroundArcColor, context.getColor(q.face_progress_bg_color)));
            paint2.setColor(typedArrayObtainStyledAttributes.getColor(w.LivenessCountdownProgressView_cpv_circleBackgroundColor, context.getColor(R.color.white)));
            paint.setColor(typedArrayObtainStyledAttributes.getColor(w.LivenessCountdownProgressView_cpv_textColor, -16777216));
            paint.setTextSize(typedArrayObtainStyledAttributes.getDimension(w.LivenessCountdownProgressView_cpv_textSize, fApplyDimension));
            float dimension = typedArrayObtainStyledAttributes.getDimension(w.LivenessCountdownProgressView_cpv_strokeWidth, fApplyDimension2);
            paint4.setStrokeWidth(dimension);
            paint3.setStrokeWidth(dimension);
            this.f23891b = typedArrayObtainStyledAttributes.getInteger(w.LivenessCountdownProgressView_cpv_durationSeconds, 10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
