package A;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f9c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f10d;

    public c(Object obj, Object obj2) {
        this.f7a = obj;
        this.f8b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7a.equals(cVar.f7a) && this.f8b.equals(cVar.f8b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7a.hashCode() ^ this.f8b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f7a + "=" + this.f8b;
    }
}
