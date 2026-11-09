package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.RequestProcessor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0935j0 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestProcessor.Callback f13561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RequestProcessor.Request f13562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0937k0 f13564d;

    public C0935j0(C0937k0 c0937k0, RequestProcessor.Request request, RequestProcessor.Callback callback, boolean z3) {
        this.f13564d = c0937k0;
        this.f13561a = callback;
        this.f13562b = request;
        this.f13563c = z3;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j6) {
        RequestProcessor.Callback callback = this.f13561a;
        RequestProcessor.Request request = this.f13562b;
        C0937k0 c0937k0 = this.f13564d;
        synchronized (c0937k0.f13573a) {
            try {
                List list = c0937k0.f13575c;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        callback.onCaptureBufferLost(request, j6, -1);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.f13561a.onCaptureCompleted(this.f13562b, new C0926f(totalCaptureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        this.f13561a.onCaptureFailed(this.f13562b, new C0924e());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        this.f13561a.onCaptureProgressed(this.f13562b, new C0926f(captureResult));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i7) {
        if (this.f13563c) {
            this.f13561a.onCaptureSequenceAborted(i7);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i7, long j6) {
        if (this.f13563c) {
            this.f13561a.onCaptureSequenceCompleted(i7, j6);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j6, long j10) {
        this.f13561a.onCaptureStarted(this.f13562b, j10, j6);
    }
}
