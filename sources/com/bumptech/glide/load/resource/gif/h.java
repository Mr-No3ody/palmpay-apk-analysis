package com.bumptech.glide.load.resource.gif;

import J1.o;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.k;
import com.bumptech.glide.m;
import com.bumptech.glide.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.gifdecoder.a f20999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f21000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f21002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitmapPool f21003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f21006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f21007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f21009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f21010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Transformation f21011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f21012n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21013o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f21015q;

    public h(com.bumptech.glide.b bVar, com.bumptech.glide.gifdecoder.a aVar, int i7, int i10, Bitmap bitmap) {
        A1.e eVar = A1.e.f30b;
        BitmapPool bitmapPool = bVar.f20434b;
        com.bumptech.glide.f fVar = bVar.f20436d;
        p pVarE = com.bumptech.glide.b.e(fVar.getBaseContext());
        m mVarO = com.bumptech.glide.b.e(fVar.getBaseContext()).b().a(((G1.d) ((G1.d) G1.d.N(k.f20704c).M()).F(true)).w(i7, i10));
        this.f21001c = new ArrayList();
        this.f21002d = pVarE;
        Handler handler = new Handler(Looper.getMainLooper(), new g(this));
        this.f21003e = bitmapPool;
        this.f21000b = handler;
        this.f21006h = mVarO;
        this.f20999a = aVar;
        c(eVar, bitmap);
    }

    public final void a() {
        if (!this.f21004f || this.f21005g) {
            return;
        }
        f fVar = this.f21012n;
        if (fVar != null) {
            this.f21012n = null;
            b(fVar);
            return;
        }
        this.f21005g = true;
        com.bumptech.glide.gifdecoder.a aVar = this.f20999a;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) aVar.getNextDelay());
        aVar.advance();
        this.f21009k = new f(this.f21000b, aVar.f20485l, jUptimeMillis);
        m mVarA0 = this.f21006h.a((G1.d) new G1.d().D(new I1.d(Double.valueOf(Math.random())))).load(aVar);
        mVarA0.T(this.f21009k, null, mVarA0, J1.g.f4461a);
    }

    public final void b(f fVar) {
        this.f21005g = false;
        boolean z3 = this.f21008j;
        Handler handler = this.f21000b;
        if (z3) {
            handler.obtainMessage(2, fVar).sendToTarget();
            return;
        }
        if (!this.f21004f) {
            this.f21012n = fVar;
            return;
        }
        if (fVar.f20997d != null) {
            Bitmap bitmap = this.f21010l;
            if (bitmap != null) {
                this.f21003e.put(bitmap);
                this.f21010l = null;
            }
            f fVar2 = this.f21007i;
            this.f21007i = fVar;
            ArrayList arrayList = this.f21001c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((GifFrameLoader$FrameCallback) arrayList.get(size)).onFrameReady();
            }
            if (fVar2 != null) {
                handler.obtainMessage(2, fVar2).sendToTarget();
            }
        }
        a();
    }

    public final void c(Transformation transformation, Bitmap bitmap) {
        J1.g.c(transformation, "Argument must not be null");
        this.f21011m = transformation;
        J1.g.c(bitmap, "Argument must not be null");
        this.f21010l = bitmap;
        this.f21006h = this.f21006h.a(new G1.d().I(transformation, true));
        this.f21013o = o.c(bitmap);
        this.f21014p = bitmap.getWidth();
        this.f21015q = bitmap.getHeight();
    }
}
