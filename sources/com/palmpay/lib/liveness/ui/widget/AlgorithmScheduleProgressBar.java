package com.palmpay.lib.liveness.ui.widget;

import Re.e;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.camera.video.u;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import p232p6.q;
import p232p6.w;
import p353xd.B;

/* JADX INFO: loaded from: classes3.dex */
public class AlgorithmScheduleProgressBar extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f23871A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f23872B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f23873C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f23874H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final SweepGradient f23875L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f23876M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f23877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueAnimator f23879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f23881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23883g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23885j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f23886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f23887p;
    public float t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f23888v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23889w;

    public AlgorithmScheduleProgressBar(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, RectF rectF, Paint.Style style, boolean z3) {
        Paint paint = this.f23881e;
        paint.setStyle(style);
        SweepGradient sweepGradient = this.f23875L;
        if (sweepGradient != null && z3) {
            paint.setShader(sweepGradient);
        }
        int i7 = this.f23871A;
        if (i7 != 0) {
            int i10 = this.f23887p;
            int i11 = this.f23886o;
            canvas.drawArc(rectF, i11 + 90, (((i10 - i11) * 1.0f) * i7) / this.f23889w, false, paint);
        }
        paint.setShader(null);
    }

    public final void b(float f10, boolean z3, int i7) {
        int max = (int) (f10 * getMax());
        if (this.f23878b) {
            return;
        }
        this.f23878b = true;
        long j6 = i7;
        this.f23877a.postDelayed(new B(this, 5), j6);
        int progress = getProgress();
        ValueAnimator valueAnimator = this.f23879c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(progress, max);
        this.f23879c = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(j6);
        if (z3) {
            this.f23879c.setInterpolator(new LinearInterpolator());
        } else {
            this.f23879c.setInterpolator(new AccelerateInterpolator());
        }
        this.f23879c.addUpdateListener(new e(this, max, 8));
        this.f23879c.start();
    }

    public int getCricleColor() {
        return this.f23882f;
    }

    public int getCricleProgressColor() {
        return this.f23884i;
    }

    public synchronized int getMax() {
        return this.f23889w;
    }

    public synchronized int getProgress() {
        return this.f23871A;
    }

    public int getRadius() {
        return this.f23874H;
    }

    public float getRoundWidth() {
        return this.f23888v;
    }

    public int getTextColor() {
        return this.f23885j;
    }

    public float getTextSize() {
        return this.t;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth() / 2;
        float f10 = width;
        this.f23874H = (int) (f10 - (this.f23888v / 2.0f));
        Paint paint = this.f23881e;
        paint.setColor(this.f23882f);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f23888v);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(this.f23876M);
        canvas.drawCircle(f10, f10, this.f23874H, paint);
        paint.setStrokeWidth(0.0f);
        paint.setColor(this.f23885j);
        paint.setTextSize(this.t);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        int i7 = (int) ((this.f23871A / this.f23889w) * 100.0f);
        float fMeasureText = paint.measureText(i7 + "%");
        paint.setShader(null);
        boolean z3 = this.f23872B;
        int i10 = this.f23873C;
        if (z3 && i7 != 0 && i10 == 0) {
            canvas.drawText(u.g(i7, "%"), f10 - (fMeasureText / 2.0f), (this.t / 2.0f) + f10, paint);
        }
        paint.setStrokeWidth(this.f23888v);
        int i11 = this.f23874H;
        RectF rectF = new RectF(width - i11, width - i11, width + i11, width + i11);
        paint.setColor(this.f23882f);
        int i12 = this.f23886o;
        canvas.drawArc(rectF, i12 + 90, this.f23887p - i12, false, paint);
        paint.setColor(this.f23883g);
        if (i10 == 0) {
            a(canvas, rectF, style, true);
        } else {
            if (i10 != 1) {
                return;
            }
            a(canvas, rectF, Paint.Style.FILL_AND_STROKE, false);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.f23876M = i7;
        postInvalidate();
    }

    public void setCricleColor(int i7) {
        this.f23882f = i7;
    }

    public void setCricleProgressColor(int i7) {
        this.f23884i = i7;
    }

    public synchronized void setMax(int i7) {
        try {
            if (i7 < 0) {
                throw new IllegalArgumentException("max not less than 0");
            }
            this.f23889w = i7;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setProgress(int i7) {
        try {
            if (i7 < 0) {
                throw new IllegalArgumentException("progress not less than 0");
            }
            int i10 = this.f23889w;
            if (i7 > i10) {
                i7 = i10;
            }
            if (i7 <= i10) {
                this.f23871A = i7;
                postInvalidate();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setRoundColor(int i7) {
        this.f23882f = i7;
        postInvalidate();
    }

    public void setRoundWidth(float f10) {
        this.f23888v = f10;
    }

    public void setTextColor(int i7) {
        this.f23885j = i7;
    }

    public void setTextSize(float f10) {
        this.t = f10;
    }

    public AlgorithmScheduleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlgorithmScheduleProgressBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f23877a = new Handler();
        this.f23878b = false;
        this.f23873C = 0;
        this.f23874H = 0;
        this.f23881e = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.face_round_progressBar, i7, 0);
        this.f23882f = typedArrayObtainStyledAttributes.getColor(w.face_round_progressBar_face_round_color, context.getColor(q.face_progress_bg_color));
        this.f23885j = typedArrayObtainStyledAttributes.getColor(w.face_round_progressBar_face_text_color, context.getColor(R.color.black));
        this.t = typedArrayObtainStyledAttributes.getDimension(w.face_round_progressBar_face_text_size, 15.0f);
        this.f23888v = typedArrayObtainStyledAttributes.getDimension(w.face_round_progressBar_face_round_width, 5.0f);
        this.f23889w = typedArrayObtainStyledAttributes.getInteger(w.face_round_progressBar_face_max, 100);
        this.f23872B = typedArrayObtainStyledAttributes.getBoolean(w.face_round_progressBar_face_text_is_displayable, true);
        this.f23873C = typedArrayObtainStyledAttributes.getInt(w.face_round_progressBar_face_style, 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(w.face_round_progressBar_face_progress_shader, false);
        float dimension = typedArrayObtainStyledAttributes.getDimension(w.face_round_progressBar_face_color_bg_width, 0.0f);
        this.f23886o = typedArrayObtainStyledAttributes.getInt(w.face_round_progressBar_face_start_angle, 0);
        this.f23887p = typedArrayObtainStyledAttributes.getInt(w.face_round_progressBar_face_end_angle, MessageEvent.EVENT_CL_REPAYMENT_FAILED);
        this.f23876M = typedArrayObtainStyledAttributes.getColor(w.face_round_progressBar_face_background_color, context.getColor(R.color.white));
        this.f23883g = typedArrayObtainStyledAttributes.getColor(w.face_round_progressBar_face_round_progress_color, -16711936);
        this.f23884i = typedArrayObtainStyledAttributes.getColor(w.face_round_progressBar_face_round_progress_start_color, -16711936);
        int color = typedArrayObtainStyledAttributes.getColor(w.face_round_progressBar_face_round_progress_end_color, -16711936);
        if (dimension > 0.0f && z3) {
            float f10 = dimension / 2.0f;
            SweepGradient sweepGradient = new SweepGradient(f10, f10, this.f23884i, color);
            this.f23875L = sweepGradient;
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f, f10, f10);
            sweepGradient.setLocalMatrix(matrix);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
