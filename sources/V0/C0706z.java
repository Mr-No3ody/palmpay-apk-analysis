package V0;

/* JADX INFO: renamed from: V0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0706z extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0695n f9980a = C0695n.f9957c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0706z.class != obj.getClass()) {
            return false;
        }
        return this.f9980a.equals(((C0706z) obj).f9980a);
    }

    public final int hashCode() {
        return this.f9980a.hashCode() + (C0706z.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f9980a + '}';
    }
}
