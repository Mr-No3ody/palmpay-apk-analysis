package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0947p0 extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13638b;

    public C0947p0(P0 p3) {
        this.f13637a = 1;
        this.f13638b = p3;
    }

    public void a() {
        ArrayList arrayListI;
        synchronized (((P0) this.f13638b).f13247b) {
            arrayListI = ((P0) this.f13638b).i();
            ((LinkedHashSet) ((P0) this.f13638b).f13250e).clear();
            ((LinkedHashSet) ((P0) this.f13638b).f13248c).clear();
            ((LinkedHashSet) ((P0) this.f13638b).f13249d).clear();
        }
        Iterator it = arrayListI.iterator();
        while (it.hasNext()) {
            ((SynchronizedCaptureSession) it.next()).finishClose();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((P0) this.f13638b).f13247b) {
            linkedHashSet.addAll((LinkedHashSet) ((P0) this.f13638b).f13250e);
            linkedHashSet.addAll((LinkedHashSet) ((P0) this.f13638b).f13248c);
        }
        ((androidx.camera.core.impl.utils.executor.i) ((P0) this.f13638b).f13246a).execute(new RunnableC0961x(linkedHashSet, 5));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f13637a) {
            case 0:
                Iterator it = ((ArrayList) this.f13638b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f13637a) {
            case 0:
                Iterator it = ((ArrayList) this.f13638b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i7) {
        switch (this.f13637a) {
            case 0:
                Iterator it = ((ArrayList) this.f13638b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i7);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((P0) this.f13638b).f13247b) {
                    linkedHashSet.addAll((LinkedHashSet) ((P0) this.f13638b).f13250e);
                    linkedHashSet.addAll((LinkedHashSet) ((P0) this.f13638b).f13248c);
                    break;
                }
                ((androidx.camera.core.impl.utils.executor.i) ((P0) this.f13638b).f13246a).execute(new B3.a(linkedHashSet, i7, 6));
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.f13637a) {
            case 0:
                Iterator it = ((ArrayList) this.f13638b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                break;
        }
    }

    public C0947p0(ArrayList arrayList) {
        this.f13637a = 0;
        this.f13638b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof C0949q0)) {
                ((ArrayList) this.f13638b).add(stateCallback);
            }
        }
    }

    private final void c(CameraDevice cameraDevice) {
    }
}
