package M;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5688a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f5689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f5690c;

    static {
        long[] jArr = {-9187201950435737345L, -1};
        f5689b = jArr;
        jArr[0] = (jArr[0] & (-256)) | 255;
        f5690c = new Object();
    }

    public static final void a(o oVar) {
        int i7 = oVar.f5699d;
        int[] iArr = oVar.f5697b;
        Object[] objArr = oVar.f5698c;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj = objArr[i11];
            if (obj != f5690c) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        oVar.f5696a = false;
        oVar.f5699d = i10;
    }

    public static final void b(g gVar, int i7) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int[] iArr = new int[i7];
        gVar.getClass();
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        gVar.f5679a = iArr;
        Object[] objArr = new Object[i7];
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        gVar.f5680b = objArr;
    }

    public static final int c(g gVar, Object obj, int i7) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i10 = gVar.f5681c;
        if (i10 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        try {
            int iA = N.a.a(gVar.f5681c, i7, gVar.f5679a);
            if (iA < 0 || Intrinsics.c(obj, gVar.f5680b[iA])) {
                return iA;
            }
            int i11 = iA + 1;
            while (i11 < i10 && gVar.f5679a[i11] == i7) {
                if (Intrinsics.c(obj, gVar.f5680b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iA - 1; i12 >= 0 && gVar.f5679a[i12] == i7; i12--) {
                if (Intrinsics.c(obj, gVar.f5680b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
