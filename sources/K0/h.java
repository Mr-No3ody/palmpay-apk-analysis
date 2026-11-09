package K0;

import java.util.AbstractSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f4893e = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractSet f4896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractSet f4897d;

    public h(String name, Map columns, AbstractSet foreignKeys, AbstractSet abstractSet) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f4894a = name;
        this.f4895b = columns;
        this.f4896c = foreignKeys;
        this.f4897d = abstractSet;
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!Intrinsics.c(this.f4894a, hVar.f4894a) || !this.f4895b.equals(hVar.f4895b) || !Intrinsics.c(this.f4896c, hVar.f4896c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f4897d;
        if (abstractSet2 == null || (abstractSet = hVar.f4897d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f4896c.hashCode() + ((this.f4895b.hashCode() + (this.f4894a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f4894a + "', columns=" + this.f4895b + ", foreignKeys=" + this.f4896c + ", indices=" + this.f4897d + '}';
    }
}
