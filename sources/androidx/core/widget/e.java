package androidx.core.widget;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final int f16350H = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f16351A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f16352B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ListView f16353C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f16354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f16355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListView f16356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B5.c f16357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f16358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f16359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16360g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f16362j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float[] f16363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f16364p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16366w;

    public e(ListView listView) {
        a aVar = new a();
        aVar.f16343e = Long.MIN_VALUE;
        aVar.f16345g = -1L;
        aVar.f16344f = 0L;
        this.f16354a = aVar;
        this.f16355b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f16358e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f16359f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f16362j = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f16363o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f16364p = fArr5;
        this.f16356c = listView;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f16360g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f16361i = f16350H;
        aVar.f16339a = 500;
        aVar.f16340b = 500;
        this.f16353C = listView;
    }

    public static float b(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(float f10, float f11, float f12, int i7) {
        float fB;
        float interpolation;
        float fB2 = b(this.f16358e[i7] * f11, 0.0f, this.f16359f[i7]);
        float fC = c(f11 - f10, fB2) - c(f10, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f16355b;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f13 = this.f16362j[i7];
            float f14 = this.f16363o[i7];
            float f15 = this.f16364p[i7];
            float f16 = f13 * f12;
            return fB > 0.0f ? b(fB * f16, f14, f15) : -b((-fB) * f16, f14, f15);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f17 = this.f16362j[i7];
        float f18 = this.f16363o[i7];
        float f19 = this.f16364p[i7];
        float f110 = f17 * f12;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 != 0.0f) {
            int i7 = this.f16360g;
            if (i7 == 0 || i7 == 1) {
                if (f10 < f11) {
                    if (f10 >= 0.0f) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f16351A && i7 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i7 == 2 && f10 < 0.0f) {
                return f10 / (-f11);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i7 = 0;
        if (this.f16365v) {
            this.f16351A = false;
            return;
        }
        a aVar = this.f16354a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i10 = (int) (jCurrentAnimationTimeMillis - aVar.f16343e);
        int i11 = aVar.f16340b;
        if (i10 > i11) {
            i7 = i11;
        } else if (i10 >= 0) {
            i7 = i10;
        }
        aVar.f16347i = i7;
        aVar.f16346h = aVar.a(jCurrentAnimationTimeMillis);
        aVar.f16345g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        ListView listView;
        int count;
        a aVar = this.f16354a;
        float f10 = aVar.f16342d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(aVar.f16341c);
        if (iAbs != 0 && (count = (listView = this.f16353C).getCount()) != 0) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i7 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0)) : !(i7 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f16352B
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.d()
            return r1
        L1b:
            r7.f16366w = r2
            r7.t = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.widget.ListView r4 = r7.f16356c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            androidx.core.widget.a r9 = r7.f16354a
            r9.f16341c = r0
            r9.f16342d = r8
            boolean r8 = r7.f16351A
            if (r8 != 0) goto L7e
            boolean r8 = r7.e()
            if (r8 == 0) goto L7e
            B5.c r8 = r7.f16357d
            if (r8 != 0) goto L62
            B5.c r8 = new B5.c
            r9 = 29
            r8.<init>(r7, r9)
            r7.f16357d = r8
        L62:
            r7.f16351A = r2
            r7.f16365v = r2
            boolean r8 = r7.t
            if (r8 != 0) goto L77
            int r8 = r7.f16361i
            if (r8 <= 0) goto L77
            B5.c r9 = r7.f16357d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = androidx.core.view.N.f16168a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            B5.c r8 = r7.f16357d
            r8.run()
        L7c:
            r7.t = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
