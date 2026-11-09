package B6;

/* JADX INFO: renamed from: B6.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0101x extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0100w f535a;

    public C0101x(EnumC0100w enumC0100w) {
        this.f535a = enumC0100w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0101x) && this.f535a == ((C0101x) obj).f535a;
    }

    public final int hashCode() {
        EnumC0100w enumC0100w = this.f535a;
        if (enumC0100w == null) {
            return 0;
        }
        return enumC0100w.hashCode();
    }

    public final String toString() {
        return "ActionTimeout(directive=" + this.f535a + ")";
    }
}
