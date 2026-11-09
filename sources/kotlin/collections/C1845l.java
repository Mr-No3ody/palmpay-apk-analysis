package kotlin.collections;

import java.util.Arrays;

/* JADX INFO: renamed from: kotlin.collections.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1845l extends C1844k {
    public static boolean b(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = objArr[i7];
            Object obj2 = objArr2[i7];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!b((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof p355xf.y) && (obj2 instanceof p355xf.y)) {
                    p355xf.y yVar = (p355xf.y) obj2;
                    byte[] bArr = ((p355xf.y) obj).f43990a;
                    if (bArr == null) {
                        bArr = null;
                    }
                    byte[] bArr2 = yVar.f43990a;
                    if (!Arrays.equals(bArr, bArr2 != null ? bArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof p355xf.I) && (obj2 instanceof p355xf.I)) {
                    p355xf.I i10 = (p355xf.I) obj2;
                    short[] sArr = ((p355xf.I) obj).f43954a;
                    if (sArr == null) {
                        sArr = null;
                    }
                    short[] sArr2 = i10.f43954a;
                    if (!Arrays.equals(sArr, sArr2 != null ? sArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof p355xf.B) && (obj2 instanceof p355xf.B)) {
                    p355xf.B b7 = (p355xf.B) obj2;
                    int[] iArr = ((p355xf.B) obj).f43947a;
                    if (iArr == null) {
                        iArr = null;
                    }
                    int[] iArr2 = b7.f43947a;
                    if (!Arrays.equals(iArr, iArr2 != null ? iArr2 : null)) {
                        return false;
                    }
                } else if ((obj instanceof p355xf.E) && (obj2 instanceof p355xf.E)) {
                    p355xf.E e10 = (p355xf.E) obj2;
                    long[] jArr = ((p355xf.E) obj).f43950a;
                    if (jArr == null) {
                        jArr = null;
                    }
                    long[] jArr2 = e10.f43950a;
                    if (!Arrays.equals(jArr, jArr2 != null ? jArr2 : null)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
