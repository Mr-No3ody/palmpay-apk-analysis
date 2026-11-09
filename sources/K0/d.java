package K0;

import C0.G;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f4884e;

    public d(String referenceTable, String onDelete, String onUpdate, List columnNames, List referenceColumnNames) {
        Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
        this.f4880a = referenceTable;
        this.f4881b = onDelete;
        this.f4882c = onUpdate;
        this.f4883d = columnNames;
        this.f4884e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Intrinsics.c(this.f4880a, dVar.f4880a) && Intrinsics.c(this.f4881b, dVar.f4881b) && Intrinsics.c(this.f4882c, dVar.f4882c) && Intrinsics.c(this.f4883d, dVar.f4883d)) {
            return Intrinsics.c(this.f4884e, dVar.f4884e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4884e.hashCode() + ((this.f4883d.hashCode() + G.c(G.c(this.f4880a.hashCode() * 31, 31, this.f4881b), 31, this.f4882c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f4880a + "', onDelete='" + this.f4881b + " +', onUpdate='" + this.f4882c + "', columnNames=" + this.f4883d + ", referenceColumnNames=" + this.f4884e + '}';
    }
}
