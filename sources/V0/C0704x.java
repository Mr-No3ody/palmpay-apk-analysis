package V0;

/* JADX INFO: renamed from: V0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0704x extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0695n f9979a = C0695n.f9957c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0704x.class != obj.getClass()) {
            return false;
        }
        return this.f9979a.equals(((C0704x) obj).f9979a);
    }

    public final int hashCode() {
        return this.f9979a.hashCode() + (C0704x.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f9979a + '}';
    }
}
