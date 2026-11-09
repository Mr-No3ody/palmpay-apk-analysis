package androidx.work.impl.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f18583b;

    public c(String key, Long l5) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f18582a = key;
        this.f18583b = l5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.c(this.f18582a, cVar.f18582a) && Intrinsics.c(this.f18583b, cVar.f18583b);
    }

    public final int hashCode() {
        int iHashCode = this.f18582a.hashCode() * 31;
        Long l5 = this.f18583b;
        return iHashCode + (l5 == null ? 0 : l5.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f18582a + ", value=" + this.f18583b + ')';
    }
}
