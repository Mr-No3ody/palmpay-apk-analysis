package K0;

import N8.q0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f4891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4892d;

    static {
        new f(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public g(String name, boolean z3, List columns, List orders) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f4889a = name;
        this.f4890b = z3;
        this.f4891c = columns;
        this.f4892d = orders;
        List arrayList = orders;
        if (arrayList.isEmpty()) {
            int size = columns.size();
            arrayList = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                arrayList.add("ASC");
            }
        }
        this.f4892d = (List) arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f4890b == gVar.f4890b && Intrinsics.c(this.f4891c, gVar.f4891c) && Intrinsics.c(this.f4892d, gVar.f4892d)) {
                String str = this.f4889a;
                boolean zM = y.m(str, "index_", false);
                String str2 = gVar.f4889a;
                return zM ? y.m(str2, "index_", false) : str.equals(str2);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4889a;
        return this.f4892d.hashCode() + ((this.f4891c.hashCode() + ((((y.m(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f4890b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Index{name='");
        sb2.append(this.f4889a);
        sb2.append("', unique=");
        sb2.append(this.f4890b);
        sb2.append(", columns=");
        sb2.append(this.f4891c);
        sb2.append(", orders=");
        return q0.o(sb2, this.f4892d, "'}");
    }
}
