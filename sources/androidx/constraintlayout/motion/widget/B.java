package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f15219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15220d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E2.a f15222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Interpolator f15223g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f15225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15226j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f15229m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O.e f15221e = new O.e(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15224h = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f15228l = new Rect();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f15227k = System.nanoTime();

    public B(E2.a aVar, m mVar, int i7, int i10, int i11, Interpolator interpolator, int i12, int i13) {
        this.f15229m = false;
        this.f15222f = aVar;
        this.f15219c = mVar;
        this.f15220d = i10;
        if (((ArrayList) aVar.f2186e) == null) {
            aVar.f2186e = new ArrayList();
        }
        ((ArrayList) aVar.f2186e).add(this);
        this.f15223g = interpolator;
        this.f15217a = i12;
        this.f15218b = i13;
        if (i11 == 3) {
            this.f15229m = true;
        }
        this.f15226j = i7 == 0 ? Float.MAX_VALUE : 1.0f / i7;
        a();
    }

    public final void a() {
        boolean z3 = this.f15224h;
        E2.a aVar = this.f15222f;
        Interpolator interpolator = this.f15223g;
        m mVar = this.f15219c;
        int i7 = this.f15218b;
        int i10 = this.f15217a;
        if (!z3) {
            long jNanoTime = System.nanoTime();
            long j6 = jNanoTime - this.f15227k;
            this.f15227k = jNanoTime;
            float f10 = (((float) (j6 * 1.0E-6d)) * this.f15226j) + this.f15225i;
            this.f15225i = f10;
            if (f10 >= 1.0f) {
                this.f15225i = 1.0f;
            }
            boolean zH = mVar.h(interpolator == null ? this.f15225i : interpolator.getInterpolation(this.f15225i), jNanoTime, this.f15221e, mVar.f15382b);
            if (this.f15225i >= 1.0f) {
                if (i10 != -1) {
                    mVar.f15382b.setTag(i10, Long.valueOf(System.nanoTime()));
                }
                if (i7 != -1) {
                    mVar.f15382b.setTag(i7, null);
                }
                if (!this.f15229m) {
                    ((ArrayList) aVar.f2187f).add(this);
                }
            }
            if (this.f15225i < 1.0f || zH) {
                ((MotionLayout) aVar.f2183b).invalidate();
                return;
            }
            return;
        }
        long jNanoTime2 = System.nanoTime();
        long j10 = jNanoTime2 - this.f15227k;
        this.f15227k = jNanoTime2;
        float f11 = this.f15225i - (((float) (j10 * 1.0E-6d)) * this.f15226j);
        this.f15225i = f11;
        if (f11 < 0.0f) {
            this.f15225i = 0.0f;
        }
        float interpolation = this.f15225i;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        boolean zH2 = mVar.h(interpolation, jNanoTime2, this.f15221e, mVar.f15382b);
        if (this.f15225i <= 0.0f) {
            if (i10 != -1) {
                mVar.f15382b.setTag(i10, Long.valueOf(System.nanoTime()));
            }
            if (i7 != -1) {
                mVar.f15382b.setTag(i7, null);
            }
            ((ArrayList) aVar.f2187f).add(this);
        }
        if (this.f15225i > 0.0f || zH2) {
            ((MotionLayout) aVar.f2183b).invalidate();
        }
    }

    public final void b() {
        this.f15224h = true;
        int i7 = this.f15220d;
        if (i7 != -1) {
            this.f15226j = i7 == 0 ? Float.MAX_VALUE : 1.0f / i7;
        }
        ((MotionLayout) this.f15222f.f2183b).invalidate();
        this.f15227k = System.nanoTime();
    }
}
