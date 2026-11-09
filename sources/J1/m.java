package J1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f4474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f4475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f4476c;

    public m(Class cls, Class cls2, Class cls3) {
        this.f4474a = cls;
        this.f4475b = cls2;
        this.f4476c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f4474a.equals(mVar.f4474a) && this.f4475b.equals(mVar.f4475b) && o.b(this.f4476c, mVar.f4476c);
    }

    public final int hashCode() {
        int iHashCode = (this.f4475b.hashCode() + (this.f4474a.hashCode() * 31)) * 31;
        Class cls = this.f4476c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f4474a + ", second=" + this.f4475b + '}';
    }
}
