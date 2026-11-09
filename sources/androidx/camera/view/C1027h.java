package androidx.camera.view;

import E.o0;
import E.p0;
import androidx.camera.core.Camera;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.camera.view.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1027h extends AbstractC1024e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public LifecycleOwner f14951D;

    @Override // androidx.camera.view.AbstractC1024e
    public final Camera m() {
        p0 p0VarB;
        int i7 = this.f14925b;
        if (this.f14951D != null && this.f14937n != null) {
            if (!i() || this.f14939p == null || this.f14938o == null) {
                p140j8.f.G("CameraController");
                p0VarB = null;
            } else {
                o0 o0Var = new o0();
                o0Var.a(this.f14926c);
                p140j8.f.b();
                if ((i7 & 1) != 0) {
                    o0Var.a(this.f14927d);
                } else {
                    this.f14937n.unbind(this.f14927d);
                }
                p140j8.f.b();
                if ((i7 & 2) != 0) {
                    o0Var.a(this.f14930g);
                } else {
                    this.f14937n.unbind(this.f14930g);
                }
                p140j8.f.b();
                this.f14937n.unbind(this.f14931h);
                o0Var.f2088a = this.f14938o;
                Iterator it = this.f14922A.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    o0Var.f2090c.add(null);
                }
                p0VarB = o0Var.b();
            }
            if (p0VarB != null) {
                try {
                    return this.f14937n.bindToLifecycle(this.f14951D, this.f14924a, p0VarB);
                } catch (IllegalArgumentException e10) {
                    throw new IllegalStateException("The selected camera does not support the enabled use cases. Please disable use case and/or select a different camera. e.g. #setVideoCaptureEnabled(false)", e10);
                }
            }
        }
        return null;
    }

    public final void r() {
        p140j8.f.b();
        this.f14951D = null;
        this.f14936m = null;
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.f14937n;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.unbindAll();
        }
    }
}
