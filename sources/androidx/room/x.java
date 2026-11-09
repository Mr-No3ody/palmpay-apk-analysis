package androidx.room;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f17796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f17797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f17798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f17799d;

    public x(w observer, int[] tableIds, String[] tableNames) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f17796a = observer;
        this.f17797b = tableIds;
        this.f17798c = tableNames;
        this.f17799d = tableNames.length == 0 ? kotlin.collections.B.f38895a : kotlin.collections.N.b(tableNames[0]);
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void a(Set invalidatedTablesIds) {
        Set setA;
        Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.f17797b;
        int length = iArr.length;
        if (length != 0) {
            int i7 = 0;
            if (length != 1) {
                Af.l lVar = new Af.l();
                int length2 = iArr.length;
                int i10 = 0;
                while (i7 < length2) {
                    int i11 = i10 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr[i7]))) {
                        lVar.add(this.f17798c[i10]);
                    }
                    i7++;
                    i10 = i11;
                }
                setA = kotlin.collections.N.a(lVar);
            } else {
                setA = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f17799d : kotlin.collections.B.f38895a;
            }
        } else {
            setA = kotlin.collections.B.f38895a;
        }
        if (setA.isEmpty()) {
            return;
        }
        this.f17796a.a(setA);
    }
}
