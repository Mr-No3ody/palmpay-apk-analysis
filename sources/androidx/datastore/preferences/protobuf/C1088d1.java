package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1088d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f16598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16599b;

    public C1088d1(int i7, MessageLite messageLite) {
        this.f16598a = messageLite;
        this.f16599b = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1088d1)) {
            return false;
        }
        C1088d1 c1088d1 = (C1088d1) obj;
        return this.f16598a == c1088d1.f16598a && this.f16599b == c1088d1.f16599b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f16598a) * 65535) + this.f16599b;
    }
}
