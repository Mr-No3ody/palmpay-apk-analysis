package androidx.camera.lifecycle;

import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f14516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.internal.a f14517b;

    public a(LifecycleOwner lifecycleOwner, androidx.camera.core.internal.a aVar) {
        if (lifecycleOwner == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f14516a = lifecycleOwner;
        if (aVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f14517b = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f14516a.equals(aVar.f14516a) && this.f14517b.equals(aVar.f14517b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14516a.hashCode() ^ 1000003) * 1000003) ^ this.f14517b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f14516a + ", cameraId=" + this.f14517b + "}";
    }
}
