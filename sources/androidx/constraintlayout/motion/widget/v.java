package androidx.constraintlayout.motion.widget;

import androidx.camera.camera2.internal.F;
import com.facebook.react.uimanager.ViewProps;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Comparable {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String[] f15445H = {ViewProps.POSITION, "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O.e f15449a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f15454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15455g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f15456i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15450b = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15457j = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15458o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15459p = -1;
    public float t = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m f15460v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinkedHashMap f15461w = new LinkedHashMap();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f15446A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public double[] f15447B = new double[18];

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public double[] f15448C = new double[18];

    public static boolean b(float f10, float f11) {
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            return Float.isNaN(f10) != Float.isNaN(f11);
        }
        return Math.abs(f10 - f11) > 1.0E-6f;
    }

    public static void f(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            float f16 = (float) dArr[i7];
            double d2 = dArr2[i7];
            int i10 = iArr[i7];
            if (i10 == 1) {
                f12 = f16;
            } else if (i10 == 2) {
                f14 = f16;
            } else if (i10 == 3) {
                f13 = f16;
            } else if (i10 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (((f13 * 1.0f) + f17) * f10) + ((1.0f - f10) * f17) + 0.0f;
        fArr[1] = (((f15 * 1.0f) + f18) * f11) + ((1.0f - f11) * f18) + 0.0f;
    }

    public final void a(androidx.constraintlayout.widget.h hVar) {
        int i7;
        this.f15449a = O.e.d(hVar.f15746d.f15820d);
        androidx.constraintlayout.widget.j jVar = hVar.f15746d;
        this.f15458o = jVar.f15821e;
        this.f15459p = jVar.f15818b;
        this.f15457j = jVar.f15824h;
        this.f15450b = jVar.f15822f;
        this.t = hVar.f15747e.f15754C;
        for (String str : hVar.f15749g.keySet()) {
            androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) hVar.f15749g.get(str);
            if (aVar != null && (i7 = F.i(aVar.f15701c)) != 4 && i7 != 5 && i7 != 7) {
                this.f15461w.put(str, aVar);
            }
        }
    }

    public final void c(double d2, int[] iArr, double[] dArr, float[] fArr, int i7) {
        float fSin = this.f15453e;
        float fCos = this.f15454f;
        float f10 = this.f15455g;
        float f11 = this.f15456i;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f12 = (float) dArr[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                fSin = f12;
            } else if (i11 == 2) {
                fCos = f12;
            } else if (i11 == 3) {
                f10 = f12;
            } else if (i11 == 4) {
                f11 = f12;
            }
        }
        m mVar = this.f15460v;
        if (mVar != null) {
            float[] fArr2 = new float[2];
            mVar.e(d2, fArr2, new float[2]);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            double d10 = f13;
            double d11 = fSin;
            double d12 = fCos;
            fSin = (float) (((Math.sin(d12) * d11) + d10) - ((double) (f10 / 2.0f)));
            fCos = (float) ((((double) f14) - (Math.cos(d12) * d11)) - ((double) (f11 / 2.0f)));
        }
        fArr[i7] = (f10 / 2.0f) + fSin + 0.0f;
        fArr[i7 + 1] = (f11 / 2.0f) + fCos + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f15452d, ((v) obj).f15452d);
    }

    public final void d(String str, double[] dArr) {
        androidx.constraintlayout.widget.a aVar = (androidx.constraintlayout.widget.a) this.f15461w.get(str);
        if (aVar == null) {
            return;
        }
        int i7 = 0;
        if (aVar.c() == 1) {
            dArr[0] = aVar.a();
            return;
        }
        int iC = aVar.c();
        float[] fArr = new float[iC];
        aVar.b(fArr);
        int i10 = 0;
        while (i7 < iC) {
            dArr[i10] = fArr[i7];
            i7++;
            i10++;
        }
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f15453e = f10;
        this.f15454f = f11;
        this.f15455g = f12;
        this.f15456i = f13;
    }

    public final void g(m mVar, v vVar) {
        double d2 = (((this.f15455g / 2.0f) + this.f15453e) - vVar.f15453e) - (vVar.f15455g / 2.0f);
        double d10 = (((this.f15456i / 2.0f) + this.f15454f) - vVar.f15454f) - (vVar.f15456i / 2.0f);
        this.f15460v = mVar;
        this.f15453e = (float) Math.hypot(d10, d2);
        if (Float.isNaN(this.t)) {
            this.f15454f = (float) (Math.atan2(d10, d2) + 1.5707963267948966d);
        } else {
            this.f15454f = (float) Math.toRadians(this.t);
        }
    }
}
