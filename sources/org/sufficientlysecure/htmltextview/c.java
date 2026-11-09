package org.sufficientlysecure.htmltextview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineBackgroundSpan;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements LeadingMarginSpan, LineBackgroundSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f41124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f41125d;

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, int i16) {
        int color = paint.getColor();
        paint.setColor(this.f41122a);
        canvas.drawRect(i7, i11, i10, i13, paint);
        paint.setColor(color);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z3, Layout layout) {
        Paint.Style style = paint.getStyle();
        int color = paint.getColor();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f41123b);
        float f10 = i7;
        canvas.drawRect(f10, i11, (i10 * this.f41124c) + f10, i13, paint);
        paint.setStyle(style);
        paint.setColor(color);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z3) {
        return (int) (this.f41124c + this.f41125d);
    }
}
