package androidx.camera.camera2.internal;

import android.util.ArrayMap;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.C1004t;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInfoInternal;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0940m extends AbstractC0999q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13595a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13597c;

    public /* synthetic */ C0940m() {
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public void a(int i7) {
        switch (this.f13595a) {
            case 0:
                for (AbstractC0999q abstractC0999q : (HashSet) this.f13596b) {
                    try {
                        ((Executor) ((ArrayMap) this.f13597c).get(abstractC0999q)).execute(new B3.a(abstractC0999q, i7, 5));
                    } catch (RejectedExecutionException e10) {
                        p140j8.f.h("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                    }
                }
                break;
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public final void b(int i7, CameraCaptureResult cameraCaptureResult) {
        switch (this.f13595a) {
            case 0:
                for (AbstractC0999q abstractC0999q : (HashSet) this.f13596b) {
                    try {
                        ((Executor) ((ArrayMap) this.f13597c).get(abstractC0999q)).execute(new H0.a(abstractC0999q, i7, cameraCaptureResult, 7));
                    } catch (RejectedExecutionException e10) {
                        p140j8.f.h("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                    }
                }
                break;
            default:
                ((androidx.concurrent.futures.k) this.f13596b).b(null);
                ((CameraInfoInternal) ((CameraInfo) this.f13597c)).removeSessionCaptureCallback(this);
                break;
        }
    }

    @Override // androidx.camera.core.impl.AbstractC0999q
    public void c(int i7, C1004t c1004t) {
        switch (this.f13595a) {
            case 0:
                for (AbstractC0999q abstractC0999q : (HashSet) this.f13596b) {
                    try {
                        ((Executor) ((ArrayMap) this.f13597c).get(abstractC0999q)).execute(new H0.a(abstractC0999q, i7, c1004t, 6));
                    } catch (RejectedExecutionException e10) {
                        p140j8.f.h("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                    }
                }
                break;
        }
    }

    public C0940m(androidx.concurrent.futures.k kVar, CameraInfo cameraInfo) {
        this.f13596b = kVar;
        this.f13597c = cameraInfo;
    }
}
