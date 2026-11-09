package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o implements CameraDeviceCompat$CameraDeviceCompatImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraDevice f13412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f13413b;

    public o(CameraDevice cameraDevice, i iVar) {
        cameraDevice.getClass();
        this.f13412a = cameraDevice;
        this.f13413b = iVar;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat$CameraDeviceCompatImpl
    public void createCaptureSession(androidx.camera.camera2.internal.compat.params.r rVar) throws a {
        CameraDevice cameraDevice = this.f13412a;
        cameraDevice.getClass();
        rVar.getClass();
        rVar.e().getClass();
        List listC = rVar.c();
        if (listC == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (rVar.a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        cameraDevice.getId();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            String strC = ((androidx.camera.camera2.internal.compat.params.h) it.next()).c();
            if (strC != null && !strC.isEmpty()) {
                p140j8.f.G("CameraDeviceCompat");
            }
        }
        f fVar = new f(rVar.a(), rVar.e());
        List listC2 = rVar.c();
        i iVar = this.f13413b;
        iVar.getClass();
        androidx.camera.camera2.internal.compat.params.g gVarB = rVar.b();
        Handler handler = iVar.f13401a;
        try {
            if (gVarB != null) {
                InputConfiguration inputConfiguration = gVarB.f13421a.f13420a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, androidx.camera.camera2.internal.compat.params.r.h(listC2), fVar, handler);
            } else {
                if (rVar.d() != 1) {
                    cameraDevice.createCaptureSessionByOutputConfigurations(androidx.camera.camera2.internal.compat.params.r.h(listC2), fVar, handler);
                    return;
                }
                ArrayList arrayList = new ArrayList(listC2.size());
                Iterator it2 = listC2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((androidx.camera.camera2.internal.compat.params.h) it2.next()).f13422a.getSurface());
                }
                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, fVar, handler);
            }
        } catch (CameraAccessException e10) {
            throw new a(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompat$CameraDeviceCompatImpl
    public final CameraDevice unwrap() {
        return this.f13412a;
    }
}
