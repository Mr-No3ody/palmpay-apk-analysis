package p379z7;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f44506p;

    public /* synthetic */ e(int i7) {
        this.f44506p = i7;
    }

    public static ArrayList q0(Iterable iterable, int i7, int i10) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : iterable) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C1850q.k();
                throw null;
            }
            if (i7 <= i11 && i11 <= i10) {
                arrayList.add(obj);
            }
            i11 = i12;
        }
        return arrayList;
    }

    @Override // org.chromium.support_lib_boundary.util.b
    public final Pair v(char c6, char c10, Iterable iterable) {
        switch (this.f44506p) {
            case 0:
                b bVar = b.f44497d;
                if (c6 == c10) {
                    return new Pair(C1849p.c(Character.valueOf(c10)), bVar);
                }
                if (iterable == null) {
                    return new Pair(C1850q.h(Character.valueOf(c6), Character.valueOf(c10)), bVar);
                }
                int iH = CollectionsKt.H(iterable, Character.valueOf(c6));
                int iH2 = CollectionsKt.H(iterable, Character.valueOf(c10));
                return iH < iH2 ? new Pair(q0(iterable, iH, iH2), bVar) : new Pair(w.v(q0(iterable, iH2, iH)), b.f44496c);
            default:
                return new Pair(C1849p.c(Character.valueOf(c10)), b.f44497d);
        }
    }
}
