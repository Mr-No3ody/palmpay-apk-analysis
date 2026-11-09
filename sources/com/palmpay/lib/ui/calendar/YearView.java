package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class YearView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f24174A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f24175B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f24176C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f24177H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f24178L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f24179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f24180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f24181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f24182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f24183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f24184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f24185g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f24186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f24187j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f24188o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f24189p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f24190v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f24191w;

    public YearView(Context context) {
        this(context, null);
    }

    private int getMonthViewTop() {
        p pVar = this.f24179a;
        return pVar.f24295u + pVar.f24223C + pVar.f24297v + pVar.f24225D;
    }

    public final void a(int i7, int i10) {
        Rect rect = new Rect();
        Paint paint = this.f24180b;
        paint.getTextBounds("1", 0, 1, rect);
        int iHeight = (rect.height() * 12) + getMonthViewTop();
        if (i10 < iHeight) {
            i10 = iHeight;
        }
        getLayoutParams().width = i7;
        getLayoutParams().height = i10;
        this.f24189p = (i10 - getMonthViewTop()) / 6;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.f24190v = ((fontMetrics.bottom - fontMetrics.top) / 2.0f) + ((this.f24189p / 2) - fontMetrics.descent);
        Paint.FontMetrics fontMetrics2 = this.f24186i.getFontMetrics();
        this.f24191w = ((fontMetrics2.bottom - fontMetrics2.top) / 2.0f) + ((this.f24179a.f24223C / 2) - fontMetrics2.descent);
        Paint.FontMetrics fontMetrics3 = this.f24187j.getFontMetrics();
        this.f24174A = ((fontMetrics3.bottom - fontMetrics3.top) / 2.0f) + ((this.f24179a.f24225D / 2) - fontMetrics3.descent);
        invalidate();
    }

    public abstract void b(Canvas canvas, int i7, int i10, int i11);

    public abstract void c(Canvas canvas, C1435e c1435e, int i7, int i10, boolean z3, boolean z8);

    public abstract void d(Canvas canvas, int i7, int i10, int i11, int i12);

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        p pVar = this.f24179a;
        int i7 = pVar.f24292s;
        this.t = ((width - i7) - pVar.t) / 7;
        int i10 = this.f24176C;
        getWidth();
        int i11 = this.f24179a.t;
        b(canvas, i10, i7, pVar.f24295u);
        p pVar2 = this.f24179a;
        if (pVar2.f24225D > 0) {
            int i12 = pVar2.f24261b;
            if (i12 > 0) {
                i12--;
            }
            int width2 = getWidth();
            p pVar3 = this.f24179a;
            int i13 = ((width2 - pVar3.f24292s) - pVar3.t) / 7;
            int i14 = i12;
            for (int i15 = 0; i15 < 7; i15++) {
                p pVar4 = this.f24179a;
                d(canvas, i14, pVar4.f24292s + (i15 * i13), pVar4.f24223C + pVar4.f24295u + pVar4.f24297v, i13);
                i14++;
                if (i14 >= 7) {
                    i14 = 0;
                }
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i17 < this.f24178L) {
            int i18 = i16;
            for (int i19 = 0; i19 < 7; i19++) {
                C1435e c1435e = (C1435e) this.f24188o.get(i18);
                if (i18 > this.f24188o.size() - this.f24177H) {
                    return;
                }
                if (c1435e.f24204d) {
                    int i20 = this.f24179a.f24292s + (this.t * i19);
                    int monthViewTop = getMonthViewTop() + (this.f24189p * i17);
                    boolean zEquals = c1435e.equals(this.f24179a.f24226D0);
                    boolean zA = c1435e.a();
                    if (zA && !zEquals) {
                        this.f24182d.setColor(this.f24179a.f24249Q);
                    }
                    c(canvas, c1435e, i20, monthViewTop, zA, zEquals);
                }
                i18++;
            }
            i17++;
            i16 = i18;
        }
    }

    public final void setup(p pVar) {
        this.f24179a = pVar;
        if (pVar == null) {
            return;
        }
        Paint paint = this.f24180b;
        paint.setTextSize(pVar.f24219A);
        Paint paint2 = this.f24183e;
        paint2.setTextSize(this.f24179a.f24219A);
        Paint paint3 = this.f24181c;
        paint3.setTextSize(this.f24179a.f24219A);
        Paint paint4 = this.f24185g;
        paint4.setTextSize(this.f24179a.f24219A);
        Paint paint5 = this.f24184f;
        paint5.setTextSize(this.f24179a.f24219A);
        paint2.setColor(this.f24179a.f24231G);
        paint.setColor(this.f24179a.f24229F);
        paint3.setColor(this.f24179a.f24229F);
        paint4.setColor(this.f24179a.f24235I);
        paint5.setColor(this.f24179a.f24233H);
        Paint paint6 = this.f24186i;
        paint6.setTextSize(this.f24179a.f24305z);
        paint6.setColor(this.f24179a.f24227E);
        Paint paint7 = this.f24187j;
        paint7.setColor(this.f24179a.f24237J);
        paint7.setTextSize(this.f24179a.f24221B);
    }

    public YearView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f24180b = paint;
        Paint paint2 = new Paint();
        this.f24181c = paint2;
        Paint paint3 = new Paint();
        Paint paint4 = new Paint();
        Paint paint5 = new Paint();
        Paint paint6 = new Paint();
        Paint paint7 = new Paint();
        this.f24182d = paint7;
        Paint paint8 = new Paint();
        Paint paint9 = new Paint();
        this.f24183e = paint9;
        Paint paint10 = new Paint();
        this.f24184f = paint10;
        Paint paint11 = new Paint();
        this.f24185g = paint11;
        Paint paint12 = new Paint();
        Paint paint13 = new Paint();
        this.f24186i = paint13;
        Paint paint14 = new Paint();
        this.f24187j = paint14;
        paint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        paint.setColor(-15658735);
        paint.setFakeBoldText(true);
        paint2.setAntiAlias(true);
        paint2.setTextAlign(align);
        paint2.setColor(-1973791);
        paint2.setFakeBoldText(true);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(align);
        paint4.setAntiAlias(true);
        paint4.setTextAlign(align);
        paint5.setAntiAlias(true);
        paint5.setTextAlign(align);
        paint13.setAntiAlias(true);
        paint13.setFakeBoldText(true);
        paint14.setAntiAlias(true);
        paint14.setFakeBoldText(true);
        paint14.setTextAlign(align);
        paint6.setAntiAlias(true);
        paint6.setTextAlign(align);
        paint9.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint9.setStyle(style);
        paint9.setTextAlign(align);
        paint9.setColor(-1223853);
        paint9.setFakeBoldText(true);
        paint10.setAntiAlias(true);
        paint10.setStyle(style);
        paint10.setTextAlign(align);
        paint10.setColor(-1223853);
        paint10.setFakeBoldText(true);
        paint7.setAntiAlias(true);
        paint7.setStyle(style);
        paint7.setStrokeWidth(2.0f);
        paint7.setColor(-1052689);
        paint11.setAntiAlias(true);
        paint11.setTextAlign(align);
        paint11.setColor(-65536);
        paint11.setFakeBoldText(true);
        paint12.setAntiAlias(true);
        paint12.setTextAlign(align);
        paint12.setColor(-65536);
        paint12.setFakeBoldText(true);
        paint8.setAntiAlias(true);
        paint8.setStyle(style);
        paint8.setStrokeWidth(2.0f);
    }
}
