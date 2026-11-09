package p027bc;

import D8.d;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import p290t4.a;
import p334w4.b;

/* JADX INFO: loaded from: classes4.dex */
public class c extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18843a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f18846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f18847e;

    public c(int i7, int i10, d dVar) {
        this.f18844b = i7;
        this.f18845c = i10;
        this.f18847e = dVar;
        Paint paint = new Paint();
        this.f18846d = paint;
        int i11 = dVar.f1698a;
        paint.setColor(i11 == -1 ? -1 : i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        switch (this.f18843a) {
            case 0:
                canvas.drawRect(0.0f, 0.0f, this.f18844b, this.f18845c, this.f18846d);
                break;
            case 1:
                canvas.drawRect(0.0f, 0.0f, this.f18844b, this.f18845c, this.f18846d);
                break;
            default:
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                float f10 = this.f18844b;
                float f11 = this.f18845c;
                Paint paint = this.f18846d;
                Intrinsics.e(paint);
                canvas.drawRect(0.0f, 0.0f, f10, f11, paint);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f18843a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        int i10 = this.f18843a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.f18843a;
    }

    public c(int i7, int i10, b mStyle) {
        Intrinsics.checkNotNullParameter(mStyle, "mStyle");
        this.f18844b = i7;
        this.f18845c = i10;
        this.f18847e = mStyle;
        Paint paint = new Paint();
        this.f18846d = paint;
        int i11 = mStyle.f43259a;
        if (i11 == -1) {
            int i12 = a.f42323a;
            i11 = -1;
        }
        paint.setColor(i11);
    }

    public c(int i7, int i10, dc.b bVar) {
        this.f18844b = i7;
        this.f18845c = i10;
        this.f18847e = bVar;
        Paint paint = new Paint();
        this.f18846d = paint;
        int i11 = bVar.f35864a;
        paint.setColor(i11 == -1 ? -1 : i11);
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void c(int i7) {
    }

    private final void d(ColorFilter colorFilter) {
    }

    private final void e(ColorFilter colorFilter) {
    }

    private final void f(ColorFilter colorFilter) {
    }
}
