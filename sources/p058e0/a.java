package p058e0;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f35984b;

    public a(Object obj, Object obj2) {
        this.f35983a = obj;
        this.f35984b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(aVar.f35983a, this.f35983a) && Objects.equals(aVar.f35984b, this.f35984b);
    }

    public final int hashCode() {
        Object obj = this.f35983a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f35984b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f35983a + " " + this.f35984b + "}";
    }
}
