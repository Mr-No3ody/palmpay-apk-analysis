package com.flexibank.sdk.customview.countdown;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.flexibank.sdk.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u0017B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/flexibank/sdk/customview/countdown/FlexiBankTransactionCountdownView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "w", "I", "getMaxCountdown", "()I", "setMaxCountdown", "(I)V", "maxCountdown", "mCurrentCountDown", "getCurrentCountDown", "setCurrentCountDown", "currentCountDown", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankTransactionCountdownView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f22227A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f22228B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextPaint f22229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f22230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f22231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f22235g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f22236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f22237j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f22238o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f22239p;
    public float t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f22240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public int maxCountdown;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public FlexiBankTransactionCountdownView(@Nullable Context context) {
        super(context);
        this.f22232d = -65536;
        this.f22233e = -65536;
        this.maxCountdown = 1;
        a(null, 0);
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, t.fb_TransactionCountdownView, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f22232d = typedArrayObtainStyledAttributes.getColor(t.fb_TransactionCountdownView_fb_colorPrimary, this.f22232d);
        this.f22233e = typedArrayObtainStyledAttributes.getColor(t.fb_TransactionCountdownView_fb_colorSecondary, this.f22233e);
        this.f22234f = typedArrayObtainStyledAttributes.getDimension(t.fb_TransactionCountdownView_fb_circleRadius1, this.f22234f);
        this.f22235g = typedArrayObtainStyledAttributes.getDimension(t.fb_TransactionCountdownView_fb_circleRadius2, this.f22235g);
        this.f22236i = typedArrayObtainStyledAttributes.getDimension(t.fb_TransactionCountdownView_fb_circleRadius3, this.f22236i);
        this.f22237j = typedArrayObtainStyledAttributes.getDimension(t.fb_TransactionCountdownView_fb_circleRadius4, this.f22237j);
        this.f22238o = typedArrayObtainStyledAttributes.getDimension(t.fb_TransactionCountdownView_fb_circleStrokeWidth, this.f22238o);
        this.f22239p = typedArrayObtainStyledAttributes.getDimension(t.fb_TransactionCountdownView_fb_lineStrokeWidth, this.f22239p);
        this.t = typedArrayObtainStyledAttributes.getDimension(t.fb_TransactionCountdownView_fb_pointStrokeWidth, this.t);
        this.f22240v = typedArrayObtainStyledAttributes.getDimension(t.fb_TransactionCountdownView_fb_countDownTextSize, this.f22240v);
        this.maxCountdown = typedArrayObtainStyledAttributes.getInteger(t.fb_TransactionCountdownView_fb_maxCountdown, this.maxCountdown);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f22229a = textPaint;
        textPaint.setFlags(1);
        TextPaint textPaint2 = this.f22229a;
        Intrinsics.e(textPaint2);
        textPaint2.setTextAlign(Paint.Align.LEFT);
        TextPaint textPaint3 = this.f22229a;
        Intrinsics.e(textPaint3);
        textPaint3.setTextSize(this.f22240v);
        TextPaint textPaint4 = this.f22229a;
        Intrinsics.e(textPaint4);
        textPaint4.setColor(this.f22232d);
        TextPaint textPaint5 = this.f22229a;
        Intrinsics.e(textPaint5);
        Paint.FontMetricsInt fontMetricsInt = textPaint5.getFontMetricsInt();
        this.f22228B = (-(fontMetricsInt.bottom + fontMetricsInt.top)) / 2;
        Paint paint = new Paint();
        this.f22230b = paint;
        paint.setFlags(1);
        Paint paint2 = this.f22230b;
        Intrinsics.e(paint2);
        paint2.setColor(this.f22232d);
        Paint paint3 = this.f22230b;
        Intrinsics.e(paint3);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f22231c = paint4;
        paint4.setFlags(1);
        Paint paint5 = this.f22231c;
        Intrinsics.e(paint5);
        paint5.setColor(this.f22232d);
        Paint paint6 = this.f22231c;
        Intrinsics.e(paint6);
        paint6.setStyle(style);
        Paint paint7 = this.f22231c;
        Intrinsics.e(paint7);
        paint7.setStrokeWidth(this.f22239p);
    }

    /* JADX INFO: renamed from: getCurrentCountDown, reason: from getter */
    public final int getF22227A() {
        return this.f22227A;
    }

    public final int getMaxCountdown() {
        return this.maxCountdown;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        canvas.save();
        canvas.translate(measuredWidth / 2, measuredHeight / 2);
        Paint paint = this.f22230b;
        Intrinsics.e(paint);
        paint.setStrokeWidth(this.f22238o);
        float f10 = this.f22234f;
        Paint paint2 = this.f22230b;
        Intrinsics.e(paint2);
        canvas.drawCircle(0.0f, 0.0f, f10, paint2);
        Paint paint3 = this.f22230b;
        Intrinsics.e(paint3);
        paint3.setStrokeWidth(this.t);
        canvas.save();
        int i7 = 0;
        for (int i10 = 0; i10 < 72; i10++) {
            float f11 = this.f22235g;
            Paint paint4 = this.f22230b;
            Intrinsics.e(paint4);
            canvas.drawPoint(0.0f, f11, paint4);
            canvas.rotate(5.0f, 0.0f, 0.0f);
        }
        canvas.restore();
        canvas.save();
        int i11 = (this.f22227A * 108) / this.maxCountdown;
        canvas.rotate(180.0f);
        while (i7 < 108) {
            Paint paint5 = this.f22231c;
            Intrinsics.e(paint5);
            paint5.setColor(i7 < i11 ? this.f22232d : this.f22233e);
            float f12 = this.f22236i;
            float f13 = this.f22237j;
            Paint paint6 = this.f22231c;
            Intrinsics.e(paint6);
            Canvas canvas2 = canvas;
            canvas2.drawLine(0.0f, f12, 0.0f, f13, paint6);
            canvas2.rotate(360.0f / 108, 0.0f, 0.0f);
            i7++;
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        canvas3.restore();
        String strValueOf = String.valueOf(this.f22227A);
        String strValueOf2 = String.valueOf(this.f22227A);
        TextPaint textPaint = this.f22229a;
        Intrinsics.e(textPaint);
        float f14 = (-textPaint.measureText(strValueOf)) / 2;
        float f15 = this.f22228B;
        TextPaint textPaint2 = this.f22229a;
        Intrinsics.e(textPaint2);
        canvas3.drawText(strValueOf2, f14, f15, textPaint2);
        canvas3.restore();
    }

    public final void setCurrentCountDown(int i7) {
        this.f22227A = i7;
        invalidate();
    }

    public final void setMaxCountdown(int i7) {
        this.maxCountdown = i7;
    }

    public FlexiBankTransactionCountdownView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22232d = -65536;
        this.f22233e = -65536;
        this.maxCountdown = 1;
        a(attributeSet, 0);
    }

    public FlexiBankTransactionCountdownView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f22232d = -65536;
        this.f22233e = -65536;
        this.maxCountdown = 1;
        a(attributeSet, i7);
    }
}
