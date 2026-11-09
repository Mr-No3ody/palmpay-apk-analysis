package p379z7;

import A7.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f44491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f44492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int[] f44493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f44494s;
    public ArrayList t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f44495u;

    @Override // org.chromium.support_lib_boundary.util.b, com.rollingtextview.strategy.CharOrderStrategy
    public final void afterCompute() {
        this.f44493r = null;
        this.f44494s = null;
        this.t = null;
        this.f44491p = null;
        this.f44492q = null;
    }

    @Override // org.chromium.support_lib_boundary.util.b, com.rollingtextview.strategy.CharOrderStrategy
    public final void beforeCompute(CharSequence sourceText, CharSequence targetText, List charPool) {
        Object next;
        Intrinsics.checkNotNullParameter(sourceText, "sourceText");
        Intrinsics.checkNotNullParameter(targetText, "targetText");
        Intrinsics.checkNotNullParameter(charPool, "charPool");
        if (sourceText.length() >= 10 || targetText.length() >= 10) {
            throw new IllegalStateException("your text is too long, it may overflow the integer calculation. please use other animation strategy.");
        }
        int iMax = Math.max(sourceText.length(), targetText.length());
        int[] iArr = new int[iMax];
        int[] iArr2 = new int[iMax];
        int[] iArr3 = new int[iMax];
        ArrayList arrayList = new ArrayList();
        char c6 = 0;
        Iterator it = kotlin.ranges.b.f(0, iMax).iterator();
        while (((Rf.b) it).f8613c) {
            int iA = ((C) it).a();
            int i7 = iA - iMax;
            int length = sourceText.length() + i7;
            int length2 = targetText.length() + i7;
            char cCharAt = length >= 0 ? sourceText.charAt(length) : c6;
            char cCharAt2 = length2 >= 0 ? targetText.charAt(length2) : c6;
            Iterator it2 = charPool.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                Collection collection = (Collection) next;
                if (collection.contains(Character.valueOf(cCharAt)) && collection.contains(Character.valueOf(cCharAt2))) {
                    break;
                }
            }
            Collection collection2 = (Collection) next;
            if (collection2 == null) {
                throw new IllegalStateException("the char " + cCharAt + " or " + cCharAt2 + " cannot be found in the charPool,please addCharOrder() before use");
            }
            arrayList.add(collection2);
            Collection collection3 = collection2;
            iArr[iA] = Math.max(CollectionsKt.H(collection3, Character.valueOf(cCharAt)) - 1, -1);
            iArr2[iA] = Math.max(CollectionsKt.H(collection3, Character.valueOf(cCharAt2)) - 1, -1);
            iArr3[iA] = collection2.size() - 1;
            c6 = 0;
        }
        int[] iArr4 = new int[iMax];
        int[] iArr5 = new int[iMax];
        Iterator it3 = kotlin.ranges.b.f(0, iMax).iterator();
        int iMax2 = 0;
        int iMax3 = 0;
        int i10 = 0;
        while (((Rf.b) it3).f8613c) {
            int iA2 = ((C) it3).a();
            iMax2 = (iMax2 * i10) + Math.max(iArr[iA2], 0);
            iMax3 = (i10 * iMax3) + Math.max(iArr2[iA2], 0);
            i10 = iArr3[iA2];
            iArr4[iA2] = iMax2;
            iArr5[iA2] = iMax3;
        }
        this.f44491p = iArr;
        this.f44492q = iArr2;
        this.f44493r = iArr4;
        this.f44494s = iArr5;
        this.t = arrayList;
        this.f44495u = iMax2 < iMax3;
    }

    @Override // org.chromium.support_lib_boundary.util.b, com.rollingtextview.strategy.CharOrderStrategy
    public final Pair findCharOrder(CharSequence sourceText, CharSequence targetText, int i7, List charPool) {
        Intrinsics.checkNotNullParameter(sourceText, "sourceText");
        Intrinsics.checkNotNullParameter(targetText, "targetText");
        Intrinsics.checkNotNullParameter(charPool, "charPool");
        int[] iArr = this.f44491p;
        int[] iArr2 = this.f44492q;
        int[] iArr3 = this.f44493r;
        int[] iArr4 = this.f44494s;
        ArrayList arrayList = this.t;
        if (iArr3 == null || iArr4 == null || arrayList == null || iArr == null || iArr2 == null) {
            throw new IllegalStateException("CarryBitStrategy is in a illegal state, check it's lifecycle");
        }
        Iterable iterable = (Iterable) arrayList.get(i7);
        ArrayList orderList = new ArrayList();
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                int iAbs = Math.abs(iArr3[i7] - iArr4[i7]) + 1;
                Character ch2 = iArr[i7] == -1 ? (char) 0 : null;
                Character ch3 = iArr2[i7] == -1 ? (char) 0 : null;
                int i11 = iArr[i7];
                int i12 = i11 >= 0 ? i11 : 0;
                Intrinsics.checkNotNullParameter(orderList, "orderList");
                Pair pair = this.f44495u ? new Pair(orderList, Integer.valueOf(i12)) : new Pair(w.v(orderList), Integer.valueOf((orderList.size() - 1) - i12));
                List rawList = (List) pair.f38891a;
                int iIntValue = ((Number) pair.f38892b).intValue();
                Intrinsics.checkNotNullParameter(rawList, "rawList");
                return new Pair(new c(new A7.b(iAbs, iIntValue, rawList), ch2, ch3), b.f44496c);
            }
            Object next = it.next();
            int i13 = i10 + 1;
            if (i10 < 0) {
                C1850q.k();
                throw null;
            }
            ((Character) next).getClass();
            if (i10 > 0) {
                orderList.add(next);
            }
            i10 = i13;
        }
    }

    @Override // org.chromium.support_lib_boundary.util.b, com.rollingtextview.strategy.CharOrderStrategy
    public final p365y7.a nextProgress(p365y7.b previousProgress, int i7, List columns, int i10) {
        Intrinsics.checkNotNullParameter(previousProgress, "previousProgress");
        Intrinsics.checkNotNullParameter(columns, "columns");
        if (i7 == columns.size() - 1) {
            return super.nextProgress(previousProgress, i7, columns, i10);
        }
        int[] iArr = this.f44491p;
        ArrayList arrayList = this.t;
        if (iArr == null || arrayList == null) {
            return super.nextProgress(previousProgress, i7, columns, i10);
        }
        int i11 = i7 + 1;
        int iMax = Math.max(iArr[i11], 0);
        int size = ((Collection) arrayList.get(i11)).size() - 1;
        int i12 = previousProgress.f44122a;
        boolean z3 = this.f44495u;
        int i13 = z3 ? (i12 + iMax) / size : (((i12 - iMax) - 1) + size) / size;
        return (!z3 ? (i12 - iMax) % size == 0 : ((i12 + iMax) + 1) % size == 0) ? new p365y7.a(i13, 0.0d, previousProgress.f44124c) : new p365y7.a(i13, previousProgress.f44123b, previousProgress.f44124c);
    }
}
