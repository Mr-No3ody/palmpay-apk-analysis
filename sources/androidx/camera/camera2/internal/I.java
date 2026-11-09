package androidx.camera.camera2.internal;

import E.C0200e;
import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class I extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.d f13155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H f13156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f13157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G f13158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ J f13159f;

    public I(J j6, androidx.camera.core.impl.utils.executor.i iVar, androidx.camera.core.impl.utils.executor.d dVar, long j10) {
        this.f13159f = j6;
        this.f13154a = iVar;
        this.f13155b = dVar;
        this.f13158e = new G(this, j10);
    }

    public final boolean a() {
        if (this.f13157d == null) {
            return false;
        }
        this.f13159f.f("Cancelling scheduled re-open: " + this.f13156c);
        this.f13156c.f13148b = true;
        this.f13156c = null;
        this.f13157d.cancel(false);
        this.f13157d = null;
        return true;
    }

    public final void b() {
        p118hf.a.k(this.f13156c == null, null);
        p118hf.a.k(this.f13157d == null, null);
        G g7 = this.f13158e;
        g7.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (g7.f13141b == -1) {
            g7.f13141b = jUptimeMillis;
        }
        long j6 = jUptimeMillis - g7.f13141b;
        long jB = g7.b();
        J j10 = this.f13159f;
        if (j6 >= jB) {
            g7.f13141b = -1L;
            p140j8.f.g("Camera2CameraImpl", "Camera reopening attempted for " + g7.b() + "ms without success.");
            j10.r(4, null, false);
            return;
        }
        this.f13156c = new H(this, this.f13154a);
        j10.f("Attempting camera re-open in " + g7.a() + "ms: " + this.f13156c + " activeResuming = " + j10.f13196w0);
        this.f13157d = this.f13155b.schedule(this.f13156c, (long) g7.a(), TimeUnit.MILLISECONDS);
    }

    public final boolean c() {
        J j6 = this.f13159f;
        if (!j6.f13196w0) {
            return false;
        }
        int i7 = j6.f13186p;
        return i7 == 1 || i7 == 2;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f13159f.f("CameraDevice.onClosed()");
        p118hf.a.k(this.f13159f.f13185o == null, "Unexpected onClose callback on camera device: " + cameraDevice);
        int i7 = F.i(this.f13159f.f13166B0);
        if (i7 == 1 || i7 == 4) {
            p118hf.a.k(this.f13159f.f13165B.isEmpty(), null);
            this.f13159f.d();
        } else {
            if (i7 != 5 && i7 != 6) {
                throw new IllegalStateException("Camera closed while in state: ".concat(F.j(this.f13159f.f13166B0)));
            }
            J j6 = this.f13159f;
            int i10 = j6.f13186p;
            if (i10 == 0) {
                j6.w(false);
            } else {
                j6.f("Camera closed due to error: ".concat(J.h(i10)));
                b();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f13159f.f("CameraDevice.onDisconnected()");
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i7) {
        J j6 = this.f13159f;
        j6.f13185o = cameraDevice;
        j6.f13186p = i7;
        C0926f c0926f = j6.f13164A0;
        ((J) c0926f.f13513b).f("Camera receive onErrorCallback");
        c0926f.a();
        int i10 = F.i(this.f13159f.f13166B0);
        if (i10 != 1) {
            switch (i10) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    cameraDevice.getId();
                    F.h(this.f13159f.f13166B0);
                    p140j8.f.G("Camera2CameraImpl");
                    p118hf.a.k(this.f13159f.f13166B0 == 8 || this.f13159f.f13166B0 == 9 || this.f13159f.f13166B0 == 10 || this.f13159f.f13166B0 == 7 || this.f13159f.f13166B0 == 6, "Attempt to handle open error from non open state: ".concat(F.j(this.f13159f.f13166B0)));
                    int i11 = 3;
                    if (i7 != 1 && i7 != 2 && i7 != 4) {
                        p140j8.f.g("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + J.h(i7) + " closing camera.");
                        this.f13159f.r(5, new C0200e(i7 == 3 ? 5 : 6, null), true);
                        this.f13159f.b();
                        return;
                    }
                    cameraDevice.getId();
                    p140j8.f.G("Camera2CameraImpl");
                    J j10 = this.f13159f;
                    p118hf.a.k(j10.f13186p != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
                    if (i7 == 1) {
                        i11 = 2;
                    } else if (i7 == 2) {
                        i11 = 1;
                    }
                    j10.r(7, new C0200e(i11, null), true);
                    j10.b();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: ".concat(F.j(this.f13159f.f13166B0)));
            }
        }
        String id2 = cameraDevice.getId();
        String strH = J.h(i7);
        String strH2 = F.h(this.f13159f.f13166B0);
        StringBuilder sbF = F.f("CameraDevice.onError(): ", id2, " failed with ", strH, " while in ");
        sbF.append(strH2);
        sbF.append(" state. Will finish closing camera.");
        p140j8.f.g("Camera2CameraImpl", sbF.toString());
        this.f13159f.b();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f13159f.f("CameraDevice.onOpened()");
        J j6 = this.f13159f;
        j6.f13185o = cameraDevice;
        j6.f13186p = 0;
        this.f13158e.f13141b = -1L;
        int i7 = F.i(j6.f13166B0);
        if (i7 == 1 || i7 == 4) {
            p118hf.a.k(this.f13159f.f13165B.isEmpty(), null);
            this.f13159f.f13185o.close();
            this.f13159f.f13185o = null;
        } else {
            if (i7 != 5 && i7 != 6 && i7 != 7) {
                throw new IllegalStateException("onOpened() should not be possible from state: ".concat(F.j(this.f13159f.f13166B0)));
            }
            this.f13159f.s(9);
            androidx.camera.core.impl.N n10 = this.f13159f.f13170M;
            String id2 = cameraDevice.getId();
            J j10 = this.f13159f;
            if (n10.e(id2, j10.f13169L.getPairedConcurrentCameraId(j10.f13185o.getId()))) {
                this.f13159f.n();
            }
        }
    }
}
