package androidx.camera.core.processing;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.concurrent.futures.k f14370c;

    public a(int i7, int i10, androidx.concurrent.futures.k kVar) {
        this.f14368a = i7;
        this.f14369b = i10;
        if (kVar == null) {
            throw new NullPointerException("Null completer");
        }
        this.f14370c = kVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f14368a == aVar.f14368a && this.f14369b == aVar.f14369b && this.f14370c.equals(aVar.f14370c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14368a ^ 1000003) * 1000003) ^ this.f14369b) * 1000003) ^ this.f14370c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f14368a + ", rotationDegrees=" + this.f14369b + ", completer=" + this.f14370c + "}";
    }
}
