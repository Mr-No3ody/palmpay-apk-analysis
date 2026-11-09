package F4;

import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends p002a.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f2571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f2572e;

    public a(G4.j jVar, G4.g gVar, A4.a aVar) {
        super(jVar);
        if (jVar != null) {
            this.f2571d = new Paint(1);
            Paint paint = new Paint();
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setAlpha(90);
            Paint paint2 = new Paint();
            paint2.setColor(-16777216);
            paint2.setStrokeWidth(1.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint(1);
            this.f2572e = paint3;
            paint3.setStyle(style);
        }
    }
}
