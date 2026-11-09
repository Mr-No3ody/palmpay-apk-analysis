package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultYearView extends YearView {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f24133M;

    public DefaultYearView(Context context) {
        super(context);
        this.f24133M = s.e(context, 3.0f);
    }

    @Override // com.palmpay.lib.ui.calendar.YearView
    public final void b(Canvas canvas, int i7, int i10, int i11) {
        canvas.drawText(getContext().getResources().getStringArray(this.f24179a.f24246N0)[i7 - 1], ((this.t / 2) + i10) - this.f24133M, i11 + this.f24191w, this.f24186i);
    }

    @Override // com.palmpay.lib.ui.calendar.YearView
    public final void c(Canvas canvas, C1435e c1435e, int i7, int i10, boolean z3, boolean z8) {
        float f10 = this.f24190v + i10;
        int i11 = (this.t / 2) + i7;
        Paint paint = this.f24183e;
        if (z8) {
            String strValueOf = String.valueOf(c1435e.f24203c);
            float f11 = i11;
            if (!z3) {
                paint = this.f24184f;
            }
            canvas.drawText(strValueOf, f11, f10, paint);
            return;
        }
        Paint paint2 = this.f24181c;
        Paint paint3 = this.f24185g;
        if (z3) {
            String strValueOf2 = String.valueOf(c1435e.f24203c);
            float f12 = i11;
            if (c1435e.f24205e) {
                paint = paint3;
            } else if (!c1435e.f24204d) {
                paint = paint2;
            }
            canvas.drawText(strValueOf2, f12, f10, paint);
            return;
        }
        String strValueOf3 = String.valueOf(c1435e.f24203c);
        float f13 = i11;
        if (c1435e.f24205e) {
            paint2 = paint3;
        } else if (c1435e.f24204d) {
            paint2 = this.f24180b;
        }
        canvas.drawText(strValueOf3, f13, f10, paint2);
    }

    @Override // com.palmpay.lib.ui.calendar.YearView
    public final void d(Canvas canvas, int i7, int i10, int i11, int i12) {
        canvas.drawText(getContext().getResources().getStringArray(L6.a.pp_year_view_week_string_array)[i7], (i12 / 2) + i10, i11 + this.f24174A, this.f24187j);
    }
}
