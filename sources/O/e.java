package O;

import android.view.View;
import com.facebook.react.animated.InterpolationAnimatedNode;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f6487c = new e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f6488d = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f6490b;

    public e(int i7) {
        this.f6489a = i7;
        switch (i7) {
            case 1:
                this.f6490b = new HashMap();
                break;
            default:
                this.f6490b = InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY;
                break;
        }
    }

    public static e d(String str) {
        byte b7 = 3;
        char c6 = 2;
        char c10 = 0;
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new d(str);
        }
        if (str.startsWith("spline")) {
            j jVar = new j(0);
            jVar.f6490b = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i7 = 0;
            while (iIndexOf2 != -1) {
                dArr[i7] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i7++;
            }
            dArr[i7] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i7 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            int i10 = 0;
            while (i10 < dArrCopyOf.length) {
                double d10 = dArrCopyOf[i10];
                int i11 = i10 + length2;
                dArr2[i11][c10] = d10;
                char c11 = c6;
                char c12 = c10;
                double d11 = ((double) i10) * d2;
                dArr3[i11] = d11;
                if (i10 > 0) {
                    int i12 = (length2 * 2) + i10;
                    dArr2[i12][c12] = d10 + 1.0d;
                    dArr3[i12] = d11 + 1.0d;
                    int i13 = i10 - 1;
                    dArr2[i13][c12] = (d10 - 1.0d) - d2;
                    dArr3[i13] = (d11 - 1.0d) - d2;
                }
                i10++;
                c6 = c11;
                c10 = c12;
            }
            g gVar = new g(dArr3, dArr2);
            System.out.println(" 0 " + gVar.v(0.0d));
            System.out.println(" 1 " + gVar.v(1.0d));
            jVar.f6509e = gVar;
            return jVar;
        }
        if (str.startsWith("Schlick")) {
            h hVar = new h(0);
            hVar.f6490b = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            hVar.f6498e = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i14 = iIndexOf4 + 1;
            hVar.f6499f = Double.parseDouble(str.substring(i14, str.indexOf(44, i14)).trim());
            return hVar;
        }
        switch (str.hashCode()) {
            case -1354466595:
                b7 = !str.equals("accelerate") ? (byte) -1 : (byte) 0;
                break;
            case -1263948740:
                b7 = !str.equals("decelerate") ? (byte) -1 : (byte) 1;
                break;
            case -1197605014:
                b7 = !str.equals("anticipate") ? (byte) -1 : (byte) 2;
                break;
            case -1102672091:
                if (!str.equals("linear")) {
                    b7 = -1;
                }
                break;
            case -749065269:
                b7 = !str.equals("overshoot") ? (byte) -1 : (byte) 4;
                break;
            case 1312628413:
                b7 = !str.equals("standard") ? (byte) -1 : (byte) 5;
                break;
            default:
                b7 = -1;
                break;
        }
        switch (b7) {
            case 0:
                return new d("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new d("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new d("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new d("cubic(1, 1, 0, 0)");
            case 4:
                return new d("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new d("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f6488d));
                return f6487c;
        }
    }

    public double b(double d2) {
        return 1.0d;
    }

    public float c(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = (HashMap) this.f6490b;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public String toString() {
        switch (this.f6489a) {
            case 0:
                return (String) this.f6490b;
            default:
                return super.toString();
        }
    }

    public double a(double d2) {
        return d2;
    }
}
