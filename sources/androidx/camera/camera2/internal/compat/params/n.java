package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class n extends l {
    @Override // androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
        return ((m) this.f13427a).f13432b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final int getMaxSharedSurfaceCount() {
        return ((OutputConfiguration) getOutputConfiguration()).getMaxSharedSurfaceCount();
    }

    @Override // androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public Object getOutputConfiguration() {
        Object obj = this.f13427a;
        p118hf.a.f(obj instanceof m);
        return ((m) obj).f13431a;
    }

    @Override // androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final String getPhysicalCameraId() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final void removeSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).removeSurface(surface);
    }

    @Override // androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long j6) {
        ((m) this.f13427a).f13432b = j6;
    }

    @Override // androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final void setPhysicalCameraId(String str) {
        ((OutputConfiguration) getOutputConfiguration()).setPhysicalCameraId(str);
    }
}
