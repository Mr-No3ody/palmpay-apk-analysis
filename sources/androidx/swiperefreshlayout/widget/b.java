package androidx.swiperefreshlayout.widget;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f17870a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f17871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f17872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f17873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f17874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f17875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f17876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f17878i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f17880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f17881l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f17882m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f17883n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Path f17884o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f17885p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f17886q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17887r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17888s;
    public int t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17889u;

    public b() {
        Paint paint = new Paint();
        this.f17871b = paint;
        Paint paint2 = new Paint();
        this.f17872c = paint2;
        Paint paint3 = new Paint();
        this.f17873d = paint3;
        this.f17874e = 0.0f;
        this.f17875f = 0.0f;
        this.f17876g = 0.0f;
        this.f17877h = 5.0f;
        this.f17885p = 1.0f;
        this.t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i7) {
        this.f17879j = i7;
        this.f17889u = this.f17878i[i7];
    }
}
