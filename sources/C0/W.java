package C0;

import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.google.maps.android.BuildConfig;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
public final class W extends d0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f997n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(boolean z3, int i7) {
        super(z3);
        this.f997n = i7;
    }

    public static float[] f(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new float[]{((Number) d0.f1026h.c(value)).floatValue()};
    }

    public static int[] g(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new int[]{((Number) d0.f1021c.c(value)).intValue()};
    }

    public static long[] h(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new long[]{((Number) d0.f1024f.c(value)).longValue()};
    }

    public static boolean[] i(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new boolean[]{((Boolean) d0.f1028j.c(value)).booleanValue()};
    }

    @Override // C0.d0
    public final Object a(Bundle bundle, String key) {
        switch (this.f997n) {
            case 0:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (boolean[]) bundle.get(key);
            case 1:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (Boolean) bundle.get(key);
            case 2:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (float[]) bundle.get(key);
            case 3:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj = bundle.get(key);
                Intrinsics.f(obj, "null cannot be cast to non-null type kotlin.Float");
                return (Float) obj;
            case 4:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (int[]) bundle.get(key);
            case 5:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj2 = bundle.get(key);
                Intrinsics.f(obj2, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj2;
            case 6:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (long[]) bundle.get(key);
            case 7:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj3 = bundle.get(key);
                Intrinsics.f(obj3, "null cannot be cast to non-null type kotlin.Long");
                return (Long) obj3;
            case 8:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj4 = bundle.get(key);
                Intrinsics.f(obj4, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj4;
            case 9:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (String[]) bundle.get(key);
            default:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                return (String) bundle.get(key);
        }
    }

    @Override // C0.d0
    public final String b() {
        switch (this.f997n) {
            case 0:
                return "boolean[]";
            case 1:
                return "boolean";
            case 2:
                return "float[]";
            case 3:
                return "float";
            case 4:
                return "integer[]";
            case 5:
                return "integer";
            case 6:
                return "long[]";
            case 7:
                return Constants.LONG;
            case 8:
                return "reference";
            case 9:
                return "string[]";
            default:
                return "string";
        }
    }

    @Override // C0.d0
    public final Object c(String value) {
        boolean z3;
        int i7;
        String strSubstring;
        long j6;
        int i10;
        switch (this.f997n) {
            case 0:
                return i(value);
            case 1:
                Intrinsics.checkNotNullParameter(value, "value");
                if (Intrinsics.c(value, "true")) {
                    z3 = true;
                } else {
                    if (!Intrinsics.c(value, "false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 2:
                return f(value);
            case 3:
                Intrinsics.checkNotNullParameter(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            case 4:
                return g(value);
            case 5:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.y.m(value, "0x", false)) {
                    String strSubstring2 = value.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    i7 = Integer.parseInt(strSubstring2, CharsKt.checkRadix(16));
                } else {
                    i7 = Integer.parseInt(value);
                }
                return Integer.valueOf(i7);
            case 6:
                return h(value);
            case 7:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.y.g(value, "L", false)) {
                    strSubstring = value.substring(0, value.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    strSubstring = value;
                }
                if (kotlin.text.y.m(value, "0x", false)) {
                    String strSubstring3 = strSubstring.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
                    j6 = Long.parseLong(strSubstring3, CharsKt.checkRadix(16));
                } else {
                    j6 = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j6);
            case 8:
                Intrinsics.checkNotNullParameter(value, "value");
                if (kotlin.text.y.m(value, "0x", false)) {
                    String strSubstring4 = value.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String).substring(startIndex)");
                    i10 = Integer.parseInt(strSubstring4, CharsKt.checkRadix(16));
                } else {
                    i10 = Integer.parseInt(value);
                }
                return Integer.valueOf(i10);
            case 9:
                Intrinsics.checkNotNullParameter(value, "value");
                return new String[]{value};
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                if (Intrinsics.c(value, BuildConfig.TRAVIS)) {
                    return null;
                }
                return value;
        }
    }

    @Override // C0.d0
    public Object d(String value, Object obj) {
        switch (this.f997n) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (zArr == null) {
                    return i(value);
                }
                boolean[] elements = i(value);
                Intrinsics.checkNotNullParameter(zArr, "<this>");
                Intrinsics.checkNotNullParameter(elements, "elements");
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(elements, 0, zArrCopyOf, length, 1);
                Intrinsics.e(zArrCopyOf);
                return zArrCopyOf;
            case 2:
                float[] fArr = (float[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (fArr == null) {
                    return f(value);
                }
                float[] elements2 = f(value);
                Intrinsics.checkNotNullParameter(fArr, "<this>");
                Intrinsics.checkNotNullParameter(elements2, "elements");
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(elements2, 0, fArrCopyOf, length2, 1);
                Intrinsics.e(fArrCopyOf);
                return fArrCopyOf;
            case 4:
                int[] iArr = (int[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (iArr == null) {
                    return g(value);
                }
                int[] elements3 = g(value);
                Intrinsics.checkNotNullParameter(iArr, "<this>");
                Intrinsics.checkNotNullParameter(elements3, "elements");
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(elements3, 0, iArrCopyOf, length3, 1);
                Intrinsics.e(iArrCopyOf);
                return iArrCopyOf;
            case 6:
                long[] jArr = (long[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                if (jArr == null) {
                    return h(value);
                }
                long[] elements4 = h(value);
                Intrinsics.checkNotNullParameter(jArr, "<this>");
                Intrinsics.checkNotNullParameter(elements4, "elements");
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(elements4, 0, jArrCopyOf, length4, 1);
                Intrinsics.e(jArrCopyOf);
                return jArrCopyOf;
            case 9:
                String[] strArr = (String[]) obj;
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(value, "value");
                if (strArr == null) {
                    return new String[]{value};
                }
                String[] elements5 = {value};
                Intrinsics.checkNotNullParameter(strArr, "<this>");
                Intrinsics.checkNotNullParameter(elements5, "elements");
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(elements5, 0, objArrCopyOf, length5, 1);
                Intrinsics.e(objArrCopyOf);
                return (String[]) objArrCopyOf;
            default:
                return super.d(value, obj);
        }
    }

    @Override // C0.d0
    public final void e(Bundle bundle, String key, Object obj) {
        switch (this.f997n) {
            case 0:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putBooleanArray(key, (boolean[]) obj);
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putBoolean(key, zBooleanValue);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putFloatArray(key, (float[]) obj);
                break;
            case 3:
                float fFloatValue = ((Number) obj).floatValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putFloat(key, fFloatValue);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putIntArray(key, (int[]) obj);
                break;
            case 5:
                int iIntValue = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putInt(key, iIntValue);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putLongArray(key, (long[]) obj);
                break;
            case 7:
                long jLongValue = ((Number) obj).longValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putLong(key, jLongValue);
                break;
            case 8:
                int iIntValue2 = ((Number) obj).intValue();
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putInt(key, iIntValue2);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putStringArray(key, (String[]) obj);
                break;
            default:
                Intrinsics.checkNotNullParameter(bundle, "bundle");
                Intrinsics.checkNotNullParameter(key, "key");
                bundle.putString(key, (String) obj);
                break;
        }
    }
}
