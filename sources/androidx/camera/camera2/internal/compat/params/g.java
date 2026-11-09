package androidx.camera.camera2.internal.compat.params;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f13421a;

    public g(e eVar) {
        this.f13421a = eVar;
    }

    public static g a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new g(new f(obj)) : new g(new e(obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f13421a.equals(((g) obj).f13421a);
    }

    public final int hashCode() {
        return this.f13421a.f13420a.hashCode();
    }

    public final String toString() {
        return this.f13421a.f13420a.toString();
    }
}
