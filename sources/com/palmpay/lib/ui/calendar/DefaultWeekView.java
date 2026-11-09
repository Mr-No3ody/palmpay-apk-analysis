package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultWeekView extends WeekView {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Paint f24128q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Paint f24129r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final float f24130s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f24131t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final float f24132u0;

    public DefaultWeekView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f24128q0 = paint;
        Paint paint2 = new Paint();
        this.f24129r0 = paint2;
        paint.setTextSize(s.e(context, 8.0f));
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setFakeBoldText(true);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setColor(-1223853);
        paint2.setFakeBoldText(true);
        float fE = s.e(getContext(), 7.0f);
        this.f24130s0 = fE;
        this.f24131t0 = s.e(getContext(), 4.0f);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        this.f24132u0 = ((fontMetrics.bottom - fontMetrics.top) / 2.0f) + (fE - fontMetrics.descent) + s.e(getContext(), 1.0f);
    }

    @Override // com.palmpay.lib.ui.calendar.WeekView
    public final void h(Canvas canvas, C1435e c1435e, int i7) {
        Paint paint = this.f24129r0;
        c1435e.getClass();
        paint.setColor(0);
        int i10 = this.f24073C + i7;
        int i11 = this.f24131t0;
        float f10 = this.f24130s0;
        float f11 = f10 / 2.0f;
        float f12 = i11;
        canvas.drawCircle((i10 - i11) - f11, f12 + f10, f10, paint);
        String str = c1435e.f24207g;
        float f13 = ((i7 + this.f24073C) - i11) - f11;
        Paint paint2 = this.f24128q0;
        canvas.drawText(str, f13 - (paint2.measureText(str) / 2.0f), f12 + this.f24132u0, paint2);
    }

    @Override // com.palmpay.lib.ui.calendar.WeekView
    public final void i(int i7, Canvas canvas) {
        Paint paint = this.f24086j;
        paint.setStyle(Paint.Style.FILL);
        int i10 = this.f24131t0;
        canvas.drawRect(i7 + i10, i10, (i7 + this.f24073C) - i10, this.f24072B - i10, paint);
    }

    @Override // com.palmpay.lib.ui.calendar.WeekView
    public final void j(Canvas canvas, C1435e c1435e, int i7, boolean z3, boolean z8) {
        int i10 = (this.f24073C / 2) + i7;
        int i11 = (-this.f24072B) / 6;
        if (z8) {
            float f10 = i10;
            canvas.drawText(String.valueOf(c1435e.f24203c), f10, this.f24074H + i11, this.f24089p);
            canvas.drawText(c1435e.f24206f, f10, this.f24074H + (this.f24072B / 10), this.f24082e);
            return;
        }
        Paint paint = this.f24090v;
        Paint paint2 = this.f24080c;
        Paint paint3 = this.t;
        if (z3) {
            String strValueOf = String.valueOf(c1435e.f24203c);
            float f11 = i10;
            float f12 = this.f24074H + i11;
            if (c1435e.f24205e) {
                paint2 = paint3;
            } else if (c1435e.f24204d) {
                paint2 = this.f24088o;
            }
            canvas.drawText(strValueOf, f11, f12, paint2);
            String str = c1435e.f24206f;
            float f13 = this.f24074H + (this.f24072B / 10);
            if (!c1435e.f24205e) {
                paint = this.f24084g;
            }
            canvas.drawText(str, f11, f13, paint);
            return;
        }
        String strValueOf2 = String.valueOf(c1435e.f24203c);
        float f14 = i10;
        float f15 = this.f24074H + i11;
        if (c1435e.f24205e) {
            paint2 = paint3;
        } else if (c1435e.f24204d) {
            paint2 = this.f24079b;
        }
        canvas.drawText(strValueOf2, f14, f15, paint2);
        String str2 = c1435e.f24206f;
        float f16 = this.f24074H + (this.f24072B / 10);
        if (!c1435e.f24205e) {
            paint = c1435e.f24204d ? this.f24081d : this.f24083f;
        }
        canvas.drawText(str2, f14, f16, paint);
    }
}
