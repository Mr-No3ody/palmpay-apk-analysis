package p357y;

import G0.g;
import android.os.Looper;
import com.facebook.imagepipeline.nativecode.b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile a f44017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f44018h = new g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f44019f = new b();

    public static a Z() {
        if (f44017g != null) {
            return f44017g;
        }
        synchronized (a.class) {
            try {
                if (f44017g == null) {
                    f44017g = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f44017g;
    }

    public final void a0(Runnable runnable) {
        b bVar = this.f44019f;
        if (bVar.f44022h == null) {
            synchronized (bVar.f44020f) {
                try {
                    if (bVar.f44022h == null) {
                        bVar.f44022h = b.Z(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        bVar.f44022h.post(runnable);
    }
}
