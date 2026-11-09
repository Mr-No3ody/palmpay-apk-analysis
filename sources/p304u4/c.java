package p304u4;

import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import p290t4.a;
import p334w4.b;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p027bc.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f42697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f42698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f42699i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i7, int i10, b style, int i11, int i12) {
        super(i7, i10, style);
        Intrinsics.checkNotNullParameter(style, "style");
        this.f42696f = i11;
        this.f42697g = i12;
        Paint paint = new Paint();
        this.f42698h = paint;
        b bVar = (b) this.f18847e;
        int i13 = bVar.f43259a;
        paint.setColor(i13 == -1 ? a.f42324b : i13);
        Paint paint2 = new Paint();
        this.f42699i = paint2;
        paint2.setStrokeWidth(3);
        Paint paint3 = this.f42699i;
        Intrinsics.e(paint3);
        int i14 = bVar.f43260b;
        paint3.setColor(i14 == -1 ? a.f42325c : i14);
    }

    @Override // p027bc.c, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i7 = this.f18844b;
        float f10 = this.f18845c;
        Paint paint = this.f42698h;
        Intrinsics.e(paint);
        canvas.drawRect(0.0f, 0.0f, i7, f10, paint);
        int i10 = this.f42697g;
        if (i10 != 0) {
            int i11 = this.f42696f;
            Paint paint2 = this.f42699i;
            Intrinsics.e(paint2);
            canvas.drawLine(0.0f, (i11 / 2) * i10, i7, (i11 / 2) * i10, paint2);
            Paint paint3 = this.f42699i;
            Intrinsics.e(paint3);
            canvas.drawLine(0.0f, ((i11 / 2) + 1) * i10, i7, ((i11 / 2) + 1) * i10, paint3);
        }
    }
}
