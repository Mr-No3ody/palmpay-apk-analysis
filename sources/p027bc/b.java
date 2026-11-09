package p027bc;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f18839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f18840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18842i;

    @Override // p027bc.c, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i7 = this.f18844b;
        canvas.drawRect(0.0f, 0.0f, i7, this.f18845c, this.f18839f);
        int i10 = this.f18842i;
        if (i10 != 0) {
            int i11 = this.f18841h;
            canvas.drawLine(0.0f, (i11 / 2) * i10, i7, (i11 / 2) * i10, this.f18840g);
            canvas.drawLine(0.0f, ((i11 / 2) + 1) * i10, i7, ((i11 / 2) + 1) * i10, this.f18840g);
        }
    }
}
