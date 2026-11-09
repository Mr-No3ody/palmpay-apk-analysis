package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13919a = new ArrayList();

    public static void b(ArrayList arrayList, int i7, int[] iArr, int i10) {
        if (i10 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i11 = 0; i11 < i7; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= i10) {
                    iArr[i10] = i11;
                    b(arrayList, i7, iArr, i10 + 1);
                    break;
                } else if (i11 == iArr[i12]) {
                    break;
                } else {
                    i12++;
                }
            }
        }
    }

    public final void a(C0995o c0995o) {
        this.f13919a.add(c0995o);
    }

    public final List c(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f13919a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList<int[]> arrayList2 = new ArrayList();
        boolean z3 = false;
        b(arrayList2, size2, new int[size2], 0);
        N0[] n0Arr = new N0[list.size()];
        for (int[] iArr : arrayList2) {
            boolean z8 = true;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (iArr[i7] < list.size()) {
                    N0 n10 = (N0) arrayList.get(i7);
                    N0 n11 = (N0) list.get(iArr[i7]);
                    n10.getClass();
                    C0995o c0995o = (C0995o) n11;
                    C0995o c0995o2 = (C0995o) n10;
                    z8 &= c0995o.f14114b.f13933a <= c0995o2.f14114b.f13933a && c0995o.f14113a == c0995o2.f14113a;
                    if (!z8) {
                        break;
                    }
                    n0Arr[iArr[i7]] = (N0) arrayList.get(i7);
                }
            }
            if (z8) {
                z3 = true;
                break;
            }
        }
        if (z3) {
            return Arrays.asList(n0Arr);
        }
        return null;
    }
}
