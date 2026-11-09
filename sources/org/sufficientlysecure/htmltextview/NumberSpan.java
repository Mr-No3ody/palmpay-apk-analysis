package org.sufficientlysecure.htmltextview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.BulletSpan;
import com.alibaba.android.arouter.utils.Consts;

/* JADX INFO: loaded from: classes4.dex */
public class NumberSpan extends BulletSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41119b;

    public NumberSpan(int i7, int i10) {
        this.f41118a = i7;
        this.f41119b = Integer.toString(i10).concat(Consts.DOT);
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z3, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i14) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
            String str = this.f41119b;
            if (zIsHardwareAccelerated) {
                canvas.save();
                canvas.drawText(str, i7 + i10, i12, paint);
                canvas.restore();
            } else {
                canvas.drawText(str, i7 + i10, (i11 + i13) / 2.0f, paint);
            }
            paint.setStyle(style);
        }
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z3) {
        return this.f41118a + 20;
    }

    @Override // android.text.style.BulletSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f41118a);
        parcel.writeString(this.f41119b);
    }
}
