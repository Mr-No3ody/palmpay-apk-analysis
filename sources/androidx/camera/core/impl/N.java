package androidx.camera.core.impl;

import E.AbstractC0198c;
import androidx.camera.core.Camera;
import androidx.camera.core.concurrent.CameraCoordinator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class N implements CameraCoordinator.ConcurrentCameraModeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f13934a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C.b f13937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f13938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13939f;

    public N(C.b bVar) {
        Object obj = new Object();
        this.f13935b = obj;
        this.f13938e = new HashMap();
        this.f13936c = 1;
        synchronized (obj) {
            this.f13937d = bVar;
            this.f13939f = this.f13936c;
        }
    }

    public static void c(androidx.camera.camera2.internal.J j6, G g7) {
        if (AbstractC0198c.J()) {
            AbstractC0198c.Z(g7.ordinal(), "CX:State[" + j6 + "]");
        }
    }

    public final M a(String str) {
        HashMap map = this.f13938e;
        for (Camera camera : map.keySet()) {
            if (str.equals(((CameraInfoInternal) camera.getCameraInfo()).getCameraId())) {
                return (M) map.get(camera);
            }
        }
        return null;
    }

    public final void b() {
        boolean zO = p140j8.f.o("CameraStateRegistry");
        StringBuilder sb2 = this.f13934a;
        if (zO) {
            sb2.setLength(0);
            sb2.append("Recalculating open cameras:\n");
            sb2.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb2.append("-------------------------------------------------------------------\n");
        }
        int i7 = 0;
        for (Map.Entry entry : this.f13938e.entrySet()) {
            if (p140j8.f.o("CameraStateRegistry")) {
                sb2.append(String.format(Locale.US, "%-45s%-22s\n", ((Camera) entry.getKey()).toString(), ((M) entry.getValue()).f13920a != null ? ((M) entry.getValue()).f13920a.toString() : p381za.c.UNKNOWN_PROCESS_NAME));
            }
            G g7 = ((M) entry.getValue()).f13920a;
            if (g7 != null && g7.f13870a) {
                i7++;
            }
        }
        if (p140j8.f.o("CameraStateRegistry")) {
            sb2.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb2.append("Open count: " + i7 + " (Max allowed: " + this.f13936c + ")");
            p140j8.f.G("CameraStateRegistry");
        }
        this.f13939f = Math.max(this.f13936c - i7, 0);
    }

    public final boolean d(androidx.camera.camera2.internal.J j6) {
        boolean z3;
        synchronized (this.f13935b) {
            try {
                M m7 = (M) this.f13938e.get(j6);
                p118hf.a.j(m7, "Camera must first be registered with registerCamera()");
                z3 = true;
                if (p140j8.f.o("CameraStateRegistry")) {
                    this.f13934a.setLength(0);
                    StringBuilder sb2 = this.f13934a;
                    Locale locale = Locale.US;
                    int i7 = this.f13939f;
                    G g7 = m7.f13920a;
                    boolean z8 = g7 != null && g7.f13870a;
                    sb2.append("tryOpenCamera(" + j6 + ") [Available Cameras: " + i7 + ", Already Open: " + z8 + " (Previous state: " + m7.f13920a + ")]");
                }
                if (this.f13939f > 0) {
                    G g10 = G.OPENING;
                    m7.f13920a = g10;
                    c(j6, g10);
                } else {
                    G g11 = m7.f13920a;
                    if (g11 != null && g11.f13870a) {
                        G g12 = G.OPENING;
                        m7.f13920a = g12;
                        c(j6, g12);
                    } else {
                        z3 = false;
                    }
                }
                if (p140j8.f.o("CameraStateRegistry")) {
                    StringBuilder sb3 = this.f13934a;
                    Locale locale2 = Locale.US;
                    sb3.append(" --> ".concat(z3 ? "SUCCESS" : "FAIL"));
                    p140j8.f.G("CameraStateRegistry");
                }
                if (z3) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public final boolean e(String str, String str2) {
        synchronized (this.f13935b) {
            try {
                boolean z3 = true;
                if (this.f13937d.f917f != 2) {
                    return true;
                }
                M mA = a(str);
                G g7 = mA != null ? mA.f13920a : null;
                M mA2 = str2 != null ? a(str2) : null;
                G g10 = mA2 != null ? mA2.f13920a : null;
                G g11 = G.OPEN;
                boolean z8 = g11.equals(g7) || G.CONFIGURED.equals(g7);
                boolean z10 = g11.equals(g10) || G.CONFIGURED.equals(g10);
                if (!z8 || !z10) {
                    z3 = false;
                }
                return z3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.concurrent.CameraCoordinator.ConcurrentCameraModeListener
    public final void onCameraOperatingModeUpdated(int i7, int i10) {
        synchronized (this.f13935b) {
            boolean z3 = true;
            this.f13936c = i10 == 2 ? 2 : 1;
            boolean z8 = i7 != 2 && i10 == 2;
            if (i7 != 2 || i10 == 2) {
                z3 = false;
            }
            if (z8 || z3) {
                b();
            }
        }
    }
}
