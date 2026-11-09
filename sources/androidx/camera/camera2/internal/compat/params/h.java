package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f13422a;

    public h(int i7, Surface surface) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f13422a = new o(new OutputConfiguration(i7, surface));
            return;
        }
        if (i10 >= 28) {
            this.f13422a = new n(new m(new OutputConfiguration(i7, surface)));
        } else if (i10 >= 26) {
            this.f13422a = new l(new k(new OutputConfiguration(i7, surface)));
        } else {
            this.f13422a = new j(new i(new OutputConfiguration(i7, surface)));
        }
    }

    public final void a(Surface surface) {
        this.f13422a.addSurface(surface);
    }

    public final void b() {
        this.f13422a.enableSurfaceSharing();
    }

    public final String c() {
        return this.f13422a.getPhysicalCameraId();
    }

    public final void d(long j6) {
        this.f13422a.setDynamicRangeProfile(j6);
    }

    public final void e(int i7) {
        this.f13422a.setMirrorMode(i7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f13422a.equals(((h) obj).f13422a);
    }

    public final void f(String str) {
        this.f13422a.setPhysicalCameraId(str);
    }

    public final void g(long j6) {
        this.f13422a.setStreamUseCase(j6);
    }

    public final int hashCode() {
        return this.f13422a.f13427a.hashCode();
    }

    public h(j jVar) {
        this.f13422a = jVar;
    }
}
