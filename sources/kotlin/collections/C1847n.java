package kotlin.collections;

import Ad.C0058e;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlin.collections.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1847n extends C1846m {
    public static Set A(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            return B.f38895a;
        }
        if (length == 1) {
            return N.b(objArr[0]);
        }
        LinkedHashSet destination = new LinkedHashSet(F.a(objArr.length));
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
    public static boolean l(byte[] bArr, byte b7) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        int i7 = 0;
        while (i7 < length) {
            if (b7 == bArr[i7]) {
                if (i7 >= 0) {
                    return true;
                }
                return false;
            }
            i7++;
        }
        i7 = -1;
        if (i7 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
    public static boolean m(char[] cArr, char c6) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        int i7 = 0;
        while (i7 < length) {
            if (c6 == cArr[i7]) {
                if (i7 >= 0) {
                    return true;
                }
                return false;
            }
            i7++;
        }
        i7 = -1;
        if (i7 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
    public static boolean n(int[] iArr, int i7) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (i7 == iArr[i10]) {
                if (i10 >= 0) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001c A[RETURN] */
    public static boolean o(long[] jArr, long j6) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        int i7 = 0;
        while (i7 < length) {
            if (j6 == jArr[i7]) {
                if (i7 >= 0) {
                    return true;
                }
                return false;
            }
            i7++;
        }
        i7 = -1;
        if (i7 >= 0) {
            return true;
        }
        return false;
    }

    public static boolean p(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return t(objArr, obj) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
    public static boolean q(short[] sArr, short s3) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        int i7 = 0;
        while (i7 < length) {
            if (s3 == sArr[i7]) {
                if (i7 >= 0) {
                    return true;
                }
                return false;
            }
            i7++;
        }
        i7 = -1;
        if (i7 >= 0) {
            return true;
        }
        return false;
    }

    public static ArrayList r(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object s(int i7, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i7 < 0 || i7 >= objArr.length) {
            return null;
        }
        return objArr[i7];
    }

    public static int t(Object[] objArr, Object obj) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int i7 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i7 < length2) {
            if (obj.equals(objArr[i7])) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public static String u(int i7, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                buffer.append((CharSequence) ", ");
            }
            kotlin.text.r.a(buffer, obj, null);
        }
        buffer.append((CharSequence) "");
        return buffer.toString();
    }

    public static String v(byte[] bArr, String separator, Wd.G g7, int i7) {
        if ((i7 & 1) != 0) {
            separator = ", ";
        }
        String prefix = (i7 & 2) != 0 ? "" : "[";
        String postfix = (i7 & 4) == 0 ? "]" : "";
        int i10 = (i7 & 8) != 0 ? -1 : 32;
        if ((i7 & 32) != 0) {
            g7 = null;
        }
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) prefix);
        int i11 = 0;
        for (byte b7 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append((CharSequence) separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (g7 != null) {
                buffer.append((CharSequence) g7.invoke(Byte.valueOf(b7)));
            } else {
                buffer.append((CharSequence) String.valueOf((int) b7));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append((CharSequence) "...");
        }
        buffer.append((CharSequence) postfix);
        return buffer.toString();
    }

    public static String w(int[] iArr, String separator, C0058e c0058e, int i7) {
        if ((i7 & 1) != 0) {
            separator = ", ";
        }
        if ((i7 & 32) != 0) {
            c0058e = null;
        }
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        int i10 = 0;
        for (int i11 : iArr) {
            i10++;
            if (i10 > 1) {
                buffer.append((CharSequence) separator);
            }
            if (c0058e != null) {
                buffer.append((CharSequence) c0058e.invoke(Integer.valueOf(i11)));
            } else {
                buffer.append((CharSequence) String.valueOf(i11));
            }
        }
        buffer.append((CharSequence) "");
        return buffer.toString();
    }

    public static char x(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static List y(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? z(objArr) : C1849p.c(objArr[0]);
        }
        return z.f38935a;
    }

    public static ArrayList z(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return new ArrayList(new C1842i(objArr, false));
    }
}
