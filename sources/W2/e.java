package W2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f10545c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10547b;

    static {
        new d(null);
        f10545c = new e(p381za.c.UNKNOWN_PROCESS_NAME, null);
    }

    public e(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f10546a = name;
        this.f10547b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.c(this.f10546a, eVar.f10546a) && Intrinsics.c(this.f10547b, eVar.f10547b);
    }

    public final int hashCode() {
        int iHashCode = this.f10546a.hashCode() * 31;
        String str = this.f10547b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.f10546a;
    }
}
