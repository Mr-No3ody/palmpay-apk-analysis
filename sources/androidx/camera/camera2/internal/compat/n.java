package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Handler;
import android.util.Size;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class n implements StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl, CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13411a;

    public /* synthetic */ n(Object obj) {
        this.f13411a = obj;
    }

    public void a(androidx.camera.camera2.internal.compat.params.r rVar) throws a {
        ((o) this.f13411a).createCaptureSession(rVar);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl
    public Object get(CameraCharacteristics.Key key) {
        return ((CameraCharacteristics) this.f13411a).get(key);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl
    public Size[] getHighResolutionOutputSizes(int i7) {
        return ((StreamConfigurationMap) this.f13411a).getHighResolutionOutputSizes(i7);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl
    public int[] getOutputFormats() {
        try {
            return ((StreamConfigurationMap) this.f13411a).getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException unused) {
            p140j8.f.G("StreamConfigurationMapCompatBaseImpl");
            return null;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl
    public Size[] getOutputSizes(int i7) {
        return ((StreamConfigurationMap) this.f13411a).getOutputSizes(i7);
    }

    public Set getPhysicalCameraIds() {
        return Collections.EMPTY_SET;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl
    public CameraCharacteristics unwrap() {
        return (CameraCharacteristics) this.f13411a;
    }

    public n(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f13411a = new o(cameraDevice, new i(handler));
        } else {
            cameraDevice.getClass();
            this.f13411a = new p(cameraDevice, null);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl
    public Size[] getOutputSizes(Class cls) {
        return ((StreamConfigurationMap) this.f13411a).getOutputSizes(cls);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat$StreamConfigurationMapCompatImpl
    /* JADX INFO: renamed from: unwrap, reason: collision with other method in class */
    public StreamConfigurationMap mo70unwrap() {
        return (StreamConfigurationMap) this.f13411a;
    }
}
