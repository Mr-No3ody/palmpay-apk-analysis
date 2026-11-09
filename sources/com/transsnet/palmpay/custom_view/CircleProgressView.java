package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0012R*\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0012R*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0012R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/transsnet/palmpay/custom_view/CircleProgressView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "getCircleColor", "()I", "getProgressColor", ViewProps.COLOR, "", "setCircleColor", "(I)V", "setProgressColor", "value", "f", "I", "getMaxProgress", "setMaxProgress", "maxProgress", "g", "getCurrentProgress", "setCurrentProgress", "currentProgress", "", "i", "F", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "strokeWidth", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CircleProgressView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f30949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f30950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f30953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int maxProgress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int currentProgress;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public float strokeWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30957j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f30958o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressView(@NotNull Context context, @NotNull AttributeSet attrs, int i7) {
        super(context, attrs, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f30950b = new RectF();
        this.maxProgress = 100;
        this.f30957j = Color.parseColor("#D9FAE1");
        this.f30958o = Color.parseColor("#38D79F");
        a(attrs);
    }

    /* JADX INFO: renamed from: getCircleColor, reason: from getter */
    private final int getF30957j() {
        return this.f30957j;
    }

    /* JADX INFO: renamed from: getProgressColor, reason: from getter */
    private final int getF30958o() {
        return this.f30958o;
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CircleProgressView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f30957j = typedArrayObtainStyledAttributes.getColor(x.CircleProgressView_circleColor, this.f30957j);
            this.f30958o = typedArrayObtainStyledAttributes.getColor(x.CircleProgressView_progressColor, this.f30958o);
            setMaxProgress(typedArrayObtainStyledAttributes.getInt(x.CircleProgressView_maxProgress, this.maxProgress));
            setCurrentProgress(typedArrayObtainStyledAttributes.getInt(x.CircleProgressView_currentProgress, this.currentProgress));
            this.strokeWidth = typedArrayObtainStyledAttributes.getDimension(x.CircleProgressView_progressStrokeWidth, SizeUtils.dp2px(5.0f));
            typedArrayObtainStyledAttributes.recycle();
        }
        Paint paint = new Paint(1);
        this.f30949a = paint;
        paint.setStrokeWidth(this.strokeWidth);
        Paint paint2 = this.f30949a;
        if (paint2 == null) {
            Intrinsics.n("paint");
            throw null;
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.f30949a;
        if (paint3 != null) {
            paint3.setStrokeCap(Paint.Cap.ROUND);
        } else {
            Intrinsics.n("paint");
            throw null;
        }
    }

    public final void b(int i7, int i10) {
        if (i7 >= i10 || i10 <= 0) {
            return;
        }
        setMaxProgress(i10);
        setCurrentProgress(i7);
        invalidate();
    }

    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    public final int getMaxProgress() {
        return this.maxProgress;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int i10 = this.f30951c;
        if (i10 <= 0 || (i7 = this.f30952d) <= 0) {
            return;
        }
        float f10 = i10 / 2.0f;
        float f11 = i7 / 2.0f;
        canvas.save();
        canvas.rotate(-90.0f, f10, f11);
        Paint paint = this.f30949a;
        if (paint == null) {
            Intrinsics.n("paint");
            throw null;
        }
        paint.setColor(getF30957j());
        float f12 = this.f30953e;
        Paint paint2 = this.f30949a;
        if (paint2 == null) {
            Intrinsics.n("paint");
            throw null;
        }
        canvas.drawCircle(f10, f11, f12, paint2);
        float f13 = this.strokeWidth;
        this.f30950b.set(f13, f13, this.f30951c - f13, this.f30952d - f13);
        Paint paint3 = this.f30949a;
        if (paint3 == null) {
            Intrinsics.n("paint");
            throw null;
        }
        paint3.setColor(getF30958o());
        int i11 = this.maxProgress;
        if (i11 > 0) {
            float f14 = (1.0f - (this.currentProgress / i11)) * MessageEvent.EVENT_CL_REPAYMENT_FAILED;
            Paint paint4 = this.f30949a;
            if (paint4 == null) {
                Intrinsics.n("paint");
                throw null;
            }
            canvas2 = canvas;
            canvas2.drawArc(this.f30950b, 0.0f, f14, false, paint4);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f30951c = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f30952d = measuredHeight;
        this.f30953e = (Math.min(this.f30951c, measuredHeight) / 2) - this.strokeWidth;
    }

    public final void setCircleColor(int color) {
        this.f30957j = color;
        invalidate();
    }

    public final void setCurrentProgress(int i7) {
        this.currentProgress = i7;
        postInvalidate();
    }

    public final void setMaxProgress(int i7) {
        this.maxProgress = i7;
        postInvalidate();
    }

    public final void setProgressColor(int color) {
        this.f30958o = color;
        invalidate();
    }

    public final void setStrokeWidth(float f10) {
        this.strokeWidth = f10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f30950b = new RectF();
        this.maxProgress = 100;
        this.f30957j = Color.parseColor("#D9FAE1");
        this.f30958o = Color.parseColor("#38D79F");
        a(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30950b = new RectF();
        this.maxProgress = 100;
        this.f30957j = Color.parseColor("#D9FAE1");
        this.f30958o = Color.parseColor("#38D79F");
        a(null);
    }
}
