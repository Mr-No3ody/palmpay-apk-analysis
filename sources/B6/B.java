package B6;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0100w f384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f385b;

    public B(EnumC0100w enumC0100w, float f10) {
        this.f384a = enumC0100w;
        this.f385b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b7 = (B) obj;
        return this.f384a == b7.f384a && Float.compare(this.f385b, b7.f385b) == 0;
    }

    public final int hashCode() {
        EnumC0100w enumC0100w = this.f384a;
        return Float.hashCode(this.f385b) + ((enumC0100w == null ? 0 : enumC0100w.hashCode()) * 31);
    }

    public final String toString() {
        return "StartTimerAnimation(directive=" + this.f384a + ", progress=" + this.f385b + ")";
    }
}
