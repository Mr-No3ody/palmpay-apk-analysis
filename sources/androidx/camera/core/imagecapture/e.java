package androidx.camera.core.imagecapture;

import C0.G;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.processing.g f13749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.processing.g f13750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13752d;

    public e(androidx.camera.core.processing.g gVar, androidx.camera.core.processing.g gVar2, int i7, int i10) {
        this.f13749a = gVar;
        this.f13750b = gVar2;
        this.f13751c = i7;
        this.f13752d = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f13749a.equals(eVar.f13749a) && this.f13750b.equals(eVar.f13750b) && this.f13751c == eVar.f13751c && this.f13752d == eVar.f13752d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f13749a.hashCode() ^ 1000003) * 1000003) ^ this.f13750b.hashCode()) * 1000003) ^ this.f13751c) * 1000003) ^ this.f13752d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{edge=");
        sb2.append(this.f13749a);
        sb2.append(", postviewEdge=");
        sb2.append(this.f13750b);
        sb2.append(", inputFormat=");
        sb2.append(this.f13751c);
        sb2.append(", outputFormat=");
        return G.n(this.f13752d, "}", sb2);
    }
}
