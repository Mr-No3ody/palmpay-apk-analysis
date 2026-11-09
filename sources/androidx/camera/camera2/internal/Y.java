package androidx.camera.camera2.internal;

import E.C0206k;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.C1004t;
import androidx.camera.core.impl.CameraCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC0999q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.k f13297b;

    public /* synthetic */ Y(int i7, androidx.concurrent.futures.k kVar) {
        this.f13296a = i7;
        this.f13297b = kVar;
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public final void a(int i7) {
        switch (this.f13296a) {
            case 0:
                this.f13297b.d(new E.Q(3, "Capture request is cancelled because camera is closed", null));
                break;
            default:
                androidx.concurrent.futures.k kVar = this.f13297b;
                if (kVar != null) {
                    kVar.d(new C0206k("Camera is closed"));
                }
                break;
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public final void b(int i7, CameraCaptureResult cameraCaptureResult) {
        switch (this.f13296a) {
            case 0:
                this.f13297b.b(null);
                break;
            default:
                androidx.concurrent.futures.k kVar = this.f13297b;
                if (kVar != null) {
                    p140j8.f.G("FocusMeteringControl");
                    kVar.b(null);
                }
                break;
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public final void c(int i7, C1004t c1004t) {
        switch (this.f13296a) {
            case 0:
                this.f13297b.d(new E.Q(2, "Capture request failed with reason ".concat("ERROR"), null));
                break;
            default:
                androidx.concurrent.futures.k kVar = this.f13297b;
                if (kVar != null) {
                    kVar.d(new U2.B(3));
                }
                break;
        }
    }
}
