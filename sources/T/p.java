package T;

import android.view.View;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p059e1.a f8927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f8929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8932f;

    public p() {
        this.f8929c = new float[3];
        this.f8930d = false;
        this.f8932f = Float.NaN;
    }

    public final float a(float f10, long j6, O.e eVar, View view) {
        float[] fArr = this.f8929c;
        this.f8927a.x(f10, fArr);
        boolean z3 = true;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f8930d = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f8932f)) {
            float fC = eVar.c(view, this.f8928b);
            this.f8932f = fC;
            if (Float.isNaN(fC)) {
                this.f8932f = 0.0f;
            }
        }
        float f12 = (float) (((((j6 - this.f8931e) * 1.0E-9d) * ((double) f11)) + ((double) this.f8932f)) % 1.0d);
        this.f8932f = f12;
        String str = this.f8928b;
        HashMap map = (HashMap) eVar.f6490b;
        if (map.containsKey(view)) {
            HashMap map2 = (HashMap) map.get(view);
            if (map2 == null) {
                map2 = new HashMap();
            }
            if (map2.containsKey(str)) {
                float[] fArrCopyOf = (float[]) map2.get(str);
                if (fArrCopyOf == null) {
                    fArrCopyOf = new float[0];
                }
                if (fArrCopyOf.length <= 0) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, 1);
                }
                fArrCopyOf[0] = f12;
                map2.put(str, fArrCopyOf);
            } else {
                map2.put(str, new float[]{f12});
                map.put(view, map2);
            }
        } else {
            HashMap map3 = new HashMap();
            map3.put(str, new float[]{f12});
            map.put(view, map3);
        }
        this.f8931e = j6;
        float f13 = fArr[0];
        float fSin = (((float) Math.sin(this.f8932f * 6.2831855f)) * f13) + fArr[2];
        if (f13 == 0.0f && f11 == 0.0f) {
            z3 = false;
        }
        this.f8930d = z3;
        return fSin;
    }

    public abstract boolean b(float f10, long j6, O.e eVar, View view);

    public void c(int i7) {
        System.err.println("Error no points added to " + this.f8928b);
    }

    public final String toString() {
        String str = this.f8928b;
        new DecimalFormat("##.##");
        return str;
    }
}
