package p050d8;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f35547b;

    public c(int i7, boolean z3) {
        this.f35546a = i7;
        this.f35547b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f35546a == cVar.f35546a && this.f35547b == cVar.f35547b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35547b) + (Integer.hashCode(this.f35546a) * 31);
    }

    public final String toString() {
        return "CacheKey(fontSize=" + this.f35546a + ", isTitleEmpty=" + this.f35547b + ")";
    }
}
