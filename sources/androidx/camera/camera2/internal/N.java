package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.C1004t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class N extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13243b;

    public N(AbstractC0999q abstractC0999q) {
        this.f13242a = 1;
        if (abstractC0999q == null) {
            throw new NullPointerException("cameraCaptureCallback is null");
        }
        this.f13243b = abstractC0999q;
    }

    public static int a(CaptureRequest captureRequest) {
        Integer num;
        if ((captureRequest.getTag() instanceof androidx.camera.core.impl.O0) && (num = (Integer) ((androidx.camera.core.impl.O0) captureRequest.getTag()).f13941a.get("CAPTURE_CONFIG_ID_KEY")) != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j6) {
        switch (this.f13242a) {
            case 0:
                Iterator it = ((ArrayList) this.f13243b).iterator();
                while (it.hasNext()) {
                    CaptureRequest captureRequest2 = captureRequest;
                    Surface surface2 = surface;
                    long j10 = j6;
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureBufferLost(cameraCaptureSession, captureRequest2, surface2, j10);
                    captureRequest = captureRequest2;
                    surface = surface2;
                    j6 = j10;
                }
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j6);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        androidx.camera.core.impl.O0 o10;
        switch (this.f13242a) {
            case 0:
                Iterator it = ((ArrayList) this.f13243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            case 1:
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                Object tag = captureRequest.getTag();
                if (tag != null) {
                    p118hf.a.g(tag instanceof androidx.camera.core.impl.O0, "The tagBundle object from the CaptureResult is not a TagBundle object.");
                    o10 = (androidx.camera.core.impl.O0) tag;
                } else {
                    o10 = androidx.camera.core.impl.O0.f13940b;
                }
                ((AbstractC0999q) this.f13243b).b(a(captureRequest), new C0926f(o10, totalCaptureResult));
                return;
            default:
                synchronized (((C0962x0) this.f13243b).f13670a) {
                    try {
                        androidx.camera.core.impl.H0 h7 = ((C0962x0) this.f13243b).f13675f;
                        if (h7 == null) {
                            return;
                        }
                        androidx.camera.core.impl.T t = h7.f13886g;
                        p140j8.f.G("CaptureSession");
                        C0962x0 c0962x0 = (C0962x0) this.f13243b;
                        c0962x0.f13683n.getClass();
                        c0962x0.issueCaptureRequests(Collections.singletonList(E.N.a(t)));
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f13242a) {
            case 0:
                Iterator it = ((ArrayList) this.f13243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            case 1:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ((AbstractC0999q) this.f13243b).c(a(captureRequest), new C1004t());
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f13242a) {
            case 0:
                Iterator it = ((ArrayList) this.f13243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i7) {
        switch (this.f13242a) {
            case 0:
                Iterator it = ((ArrayList) this.f13243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, i7);
                }
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i7);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i7, long j6) {
        switch (this.f13242a) {
            case 0:
                Iterator it = ((ArrayList) this.f13243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, i7, j6);
                }
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i7, j6);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j6, long j10) {
        switch (this.f13242a) {
            case 0:
                Iterator it = ((ArrayList) this.f13243b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j6, j10);
                }
                break;
            case 1:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j6, j10);
                ((AbstractC0999q) this.f13243b).e(a(captureRequest));
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j6, j10);
                break;
        }
    }

    public N(List list) {
        this.f13242a = 0;
        this.f13243b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof O)) {
                ((ArrayList) this.f13243b).add(captureCallback);
            }
        }
    }

    public N(C0962x0 c0962x0) {
        this.f13242a = 2;
        this.f13243b = c0962x0;
    }
}
