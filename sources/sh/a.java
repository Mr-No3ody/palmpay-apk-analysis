package sh;

import D8.d;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import p027bc.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f42256n = {-15658735, 11184810, 11184810};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GradientDrawable f42257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GradientDrawable f42258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f42259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f42260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f42261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f42262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f42263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f42264m;

    public a(int i7, int i10, d dVar, int i11, int i12) {
        super(i7, i10, dVar);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int[] iArr = f42256n;
        this.f42257f = new GradientDrawable(orientation, iArr);
        this.f42258g = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
        this.f42263l = i11;
        this.f42264m = i12;
        Paint paint = new Paint();
        this.f42259h = paint;
        int i13 = ((d) this.f18847e).f1698a;
        paint.setColor(i13 == -1 ? rh.a.f41991a : i13);
        Paint paint2 = new Paint();
        this.f42260i = paint2;
        paint2.setColor(rh.a.f41993c);
        Paint paint3 = new Paint();
        this.f42261j = paint3;
        paint3.setColor(rh.a.f41994d);
        this.f42261j.setStrokeWidth(2.0f);
        Paint paint4 = new Paint();
        this.f42262k = paint4;
        paint4.setStrokeWidth(6.0f);
        this.f42262k.setColor(rh.a.f41995e);
    }

    @Override // p027bc.c, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i7 = this.f18844b;
        int i10 = this.f18845c;
        canvas.drawRect(0.0f, 0.0f, i7, i10, this.f42259h);
        int i11 = this.f42264m;
        if (i11 != 0) {
            int i12 = this.f42263l;
            int i13 = i12 / 2;
            canvas.drawRect(0.0f, i13 * i11, i7, (i13 + 1) * i11, this.f42260i);
            float f10 = (i12 / 2) * i11;
            canvas.drawLine(0.0f, f10, i7, f10, this.f42261j);
            float f11 = ((i12 / 2) + 1) * i11;
            canvas.drawLine(0.0f, f11, i7, f11, this.f42261j);
            GradientDrawable gradientDrawable = this.f42257f;
            gradientDrawable.setBounds(0, 0, i7, i11);
            gradientDrawable.draw(canvas);
            GradientDrawable gradientDrawable2 = this.f42258g;
            gradientDrawable2.setBounds(0, i10 - i11, i7, i10);
            gradientDrawable2.draw(canvas);
            canvas.drawLine(0.0f, 0.0f, 0.0f, i10, this.f42262k);
            float f12 = i7;
            canvas.drawLine(f12, 0.0f, f12, i10, this.f42262k);
        }
    }
}
