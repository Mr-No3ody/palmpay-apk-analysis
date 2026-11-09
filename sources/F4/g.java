package F4;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends p002a.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f2577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f2578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f2579f;

    public g(p362y4.a aVar, G4.j jVar) {
        super(jVar);
        Paint paint = new Paint(1);
        this.f2577d = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.f2579f = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(G4.i.b(9.0f));
        Paint paint3 = new Paint(1);
        this.f2578e = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f2578e.setStrokeWidth(2.0f);
        this.f2578e.setColor(Color.rgb(255, 187, 115));
    }

    public abstract void D();
}
