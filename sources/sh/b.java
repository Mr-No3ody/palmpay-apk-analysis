package sh;

import D8.d;
import android.graphics.Canvas;
import android.graphics.Paint;
import p027bc.c;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f42265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f42266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f42267h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f42268i;

    public b(int i7, int i10, d dVar, int i11, int i12) {
        super(i7, i10, dVar);
        this.f42267h = i11;
        this.f42268i = i12;
        Paint paint = new Paint();
        this.f42265f = paint;
        int i13 = ((d) this.f18847e).f1698a;
        paint.setColor(i13 == -1 ? -1 : i13);
        Paint paint2 = new Paint();
        this.f42266g = paint2;
        paint2.setStrokeWidth(3.0f);
        this.f42266g.setColor(rh.a.f41992b);
    }

    @Override // p027bc.c, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i7 = this.f18844b;
        canvas.drawRect(0.0f, 0.0f, i7, this.f18845c, this.f42265f);
        int i10 = this.f42268i;
        if (i10 != 0) {
            int i11 = this.f42267h;
            float f10 = (i11 / 2) * i10;
            canvas.drawLine(0.0f, f10, i7, f10, this.f42266g);
            float f11 = ((i11 / 2) + 1) * i10;
            canvas.drawLine(0.0f, f11, i7, f11, this.f42266g);
        }
    }
}
