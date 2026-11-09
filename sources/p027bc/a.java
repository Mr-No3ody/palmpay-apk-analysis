package p027bc;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f18830n = {-15658735, 11184810, 11184810};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GradientDrawable f18831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GradientDrawable f18832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f18833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f18834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f18835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Paint f18836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18838m;

    @Override // p027bc.c, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i7 = this.f18844b;
        int i10 = this.f18845c;
        canvas.drawRect(0.0f, 0.0f, i7, i10, this.f18833h);
        int i11 = this.f18838m;
        if (i11 != 0) {
            int i12 = this.f18837l;
            canvas.drawRect(0.0f, (i12 / 2) * i11, i7, ((i12 / 2) + 1) * i11, this.f18834i);
            canvas.drawLine(0.0f, (i12 / 2) * i11, i7, (i12 / 2) * i11, this.f18835j);
            canvas.drawLine(0.0f, ((i12 / 2) + 1) * i11, i7, ((i12 / 2) + 1) * i11, this.f18835j);
            GradientDrawable gradientDrawable = this.f18831f;
            gradientDrawable.setBounds(0, 0, i7, i11);
            gradientDrawable.draw(canvas);
            GradientDrawable gradientDrawable2 = this.f18832g;
            gradientDrawable2.setBounds(0, i10 - i11, i7, i10);
            gradientDrawable2.draw(canvas);
            canvas.drawLine(0.0f, 0.0f, 0.0f, i10, this.f18836k);
            canvas.drawLine(i7, 0.0f, i7, i10, this.f18836k);
        }
    }
}
