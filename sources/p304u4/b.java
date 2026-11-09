package p304u4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.Intrinsics;
import p027bc.c;
import p290t4.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f42687n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f42688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f42689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GradientDrawable f42690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GradientDrawable f42691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f42692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f42693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f42694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f42695m;

    static {
        new a(null);
        f42687n = new int[]{-15658735, 11184810, 11184810};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i7, int i10, p334w4.b style, int i11, int i12) {
        super(i7, i10, style);
        Intrinsics.checkNotNullParameter(style, "style");
        this.f42688f = i11;
        this.f42689g = i12;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int[] iArr = f42687n;
        this.f42690h = new GradientDrawable(orientation, iArr);
        this.f42691i = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
        Paint paint = new Paint();
        this.f42692j = paint;
        int i13 = ((p334w4.b) this.f18847e).f43259a;
        paint.setColor(i13 == -1 ? a.f42323a : i13);
        Paint paint2 = new Paint();
        this.f42693k = paint2;
        paint2.setColor(a.f42327e);
        Paint paint3 = new Paint();
        this.f42694l = paint3;
        paint3.setColor(a.f42328f);
        Paint paint4 = this.f42694l;
        Intrinsics.e(paint4);
        paint4.setStrokeWidth(2.0f);
        Paint paint5 = new Paint();
        this.f42695m = paint5;
        paint5.setStrokeWidth(6.0f);
        Paint paint6 = this.f42695m;
        Intrinsics.e(paint6);
        paint6.setColor(a.f42329g);
    }

    @Override // p027bc.c, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i7 = this.f18844b;
        int i10 = this.f18845c;
        Paint paint = this.f42692j;
        Intrinsics.e(paint);
        canvas.drawRect(0.0f, 0.0f, i7, i10, paint);
        int i11 = this.f42689g;
        if (i11 != 0) {
            int i12 = this.f42688f;
            Paint paint2 = this.f42693k;
            Intrinsics.e(paint2);
            canvas.drawRect(0.0f, (i12 / 2) * i11, i7, ((i12 / 2) + 1) * i11, paint2);
            Paint paint3 = this.f42694l;
            Intrinsics.e(paint3);
            canvas.drawLine(0.0f, (i12 / 2) * i11, i7, (i12 / 2) * i11, paint3);
            Paint paint4 = this.f42694l;
            Intrinsics.e(paint4);
            canvas.drawLine(0.0f, ((i12 / 2) + 1) * i11, i7, ((i12 / 2) + 1) * i11, paint4);
            GradientDrawable gradientDrawable = this.f42690h;
            gradientDrawable.setBounds(0, 0, i7, i11);
            gradientDrawable.draw(canvas);
            GradientDrawable gradientDrawable2 = this.f42691i;
            gradientDrawable2.setBounds(0, i10 - i11, i7, i10);
            gradientDrawable2.draw(canvas);
            Paint paint5 = this.f42695m;
            Intrinsics.e(paint5);
            canvas.drawLine(0.0f, 0.0f, 0.0f, i10, paint5);
            Paint paint6 = this.f42695m;
            Intrinsics.e(paint6);
            canvas.drawLine(i7, 0.0f, i7, i10, paint6);
        }
    }
}
