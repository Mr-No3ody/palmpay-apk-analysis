package kotlin.collections;

import Pa.a0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlin.collections.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1846m extends C1845l {
    public static List c(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        Intrinsics.checkNotNullExpressionValue(listAsList, "asList(...)");
        return listAsList;
    }

    public static void d(int i7, int i10, int[] iArr, int[] destination, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(iArr, i10, destination, i7, i11 - i10);
    }

    public static void e(byte[] bArr, int i7, byte[] destination, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(bArr, i10, destination, i7, i11 - i10);
    }

    public static void f(Object[] objArr, int i7, Object[] destination, int i10, int i11) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i10, destination, i7, i11 - i10);
    }

    public static /* synthetic */ void g(Object[] objArr, int i7, Object[] objArr2, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i7 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = objArr.length;
        }
        f(objArr, 0, objArr2, i7, i10);
    }

    public static Object[] h(int i7, int i10, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        C1844k.a(i10, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i7, i10);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void i(Object[] objArr, a0 a0Var, int i7, int i10) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i7, i10, a0Var);
    }

    public static void k(Comparator comparator, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
