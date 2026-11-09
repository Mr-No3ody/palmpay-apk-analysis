package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0942n extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13601c;

    public C0942n(int i7) {
        this.f13599a = i7;
        switch (i7) {
            case 3:
                this.f13600b = AbstractC0198c.y(new V9.q(this, 29));
                break;
            default:
                this.f13601c = null;
                this.f13600b = new HashMap();
                break;
        }
    }

    public void a(CaptureRequest captureRequest, List list) {
        HashMap map = (HashMap) this.f13600b;
        List list2 = (List) map.get(captureRequest);
        if (list2 == null) {
            map.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        map.put(captureRequest, arrayList);
    }

    public void b() {
        androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) this.f13601c;
        if (kVar != null) {
            kVar.b(null);
            this.f13601c = null;
        }
    }

    public List c(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.f13600b).get(captureRequest);
        return list != null ? list : Collections.EMPTY_LIST;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j6) {
        switch (this.f13599a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
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
            case 2:
                ((Executor) this.f13601c).execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) this.f13390a.f13600b).onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j6);
                    }
                });
                break;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j6);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f13599a) {
            case 0:
                ((androidx.camera.core.impl.utils.executor.i) this.f13601c).execute(new RunnableC0934j(2, this, totalCaptureResult));
                break;
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                break;
            case 2:
                ((Executor) this.f13601c).execute(new Da.g(this, cameraCaptureSession, captureRequest, totalCaptureResult, 6));
                break;
            default:
                b();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f13599a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                break;
            case 2:
                ((Executor) this.f13601c).execute(new Da.g(this, cameraCaptureSession, captureRequest, captureFailure, 8));
                break;
            case 3:
                b();
                break;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f13599a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                break;
            case 2:
                ((Executor) this.f13601c).execute(new Da.g(this, cameraCaptureSession, captureRequest, captureResult, 7));
                break;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i7) {
        switch (this.f13599a) {
            case 1:
                Iterator it = ((HashMap) this.f13600b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceAborted(cameraCaptureSession, i7);
                    }
                }
                C0956u0 c0956u0 = (C0956u0) this.f13601c;
                if (c0956u0 != null) {
                    c0956u0.onCaptureSequenceCompletedOrAborted(cameraCaptureSession, i7, true);
                }
                break;
            case 2:
                ((Executor) this.f13601c).execute(new H0.a(this, cameraCaptureSession, i7, 9));
                break;
            case 3:
                b();
                break;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, i7);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i7, final long j6) {
        switch (this.f13599a) {
            case 1:
                Iterator it = ((HashMap) this.f13600b).values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((List) it.next()).iterator();
                    while (it2.hasNext()) {
                        ((CameraCaptureSession.CaptureCallback) it2.next()).onCaptureSequenceCompleted(cameraCaptureSession, i7, j6);
                    }
                }
                C0956u0 c0956u0 = (C0956u0) this.f13601c;
                if (c0956u0 != null) {
                    c0956u0.onCaptureSequenceCompletedOrAborted(cameraCaptureSession, i7, false);
                }
                break;
            case 2:
                ((Executor) this.f13601c).execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) this.f13386a.f13600b).onCaptureSequenceCompleted(cameraCaptureSession, i7, j6);
                    }
                });
                break;
            case 3:
                b();
                break;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, i7, j6);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j6, final long j10) {
        switch (this.f13599a) {
            case 1:
                Iterator it = c(captureRequest).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j6, j10);
                }
                break;
            case 2:
                ((Executor) this.f13601c).execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) this.f13381a.f13600b).onCaptureStarted(cameraCaptureSession, captureRequest, j6, j10);
                    }
                });
                break;
            case 3:
                b();
                break;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j6, j10);
                break;
        }
    }

    public C0942n(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        this.f13599a = 2;
        this.f13601c = executor;
        this.f13600b = captureCallback;
    }

    public C0942n(androidx.camera.core.impl.utils.executor.i iVar) {
        this.f13599a = 0;
        this.f13600b = new HashSet();
        this.f13601c = iVar;
    }
}
