package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l extends j {
    @Override // androidx.camera.camera2.internal.compat.params.j
    public final boolean a() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final void addSurface(Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).addSurface(surface);
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final void enableSurfaceSharing() {
        ((OutputConfiguration) getOutputConfiguration()).enableSurfaceSharing();
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
        return ((k) this.f13427a).f13430c;
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
        try {
            Field declaredField = OutputConfiguration.class.getDeclaredField("MAX_SURFACES_COUNT");
            declaredField.setAccessible(true);
            return declaredField.getInt(null);
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            p140j8.f.h("OutputConfigCompat", "Unable to retrieve max shared surface count.", e10);
            return 1;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public Object getOutputConfiguration() {
        Object obj = this.f13427a;
        p118hf.a.f(obj instanceof k);
        return ((k) obj).f13428a;
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public String getPhysicalCameraId() {
        return ((k) this.f13427a).f13429b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final List getSurfaces() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaces();
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public void removeSurface(Surface surface) {
        if (getSurface() == surface) {
            throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
        }
        try {
            OutputConfiguration outputConfiguration = (OutputConfiguration) getOutputConfiguration();
            Field declaredField = OutputConfiguration.class.getDeclaredField("mSurfaces");
            declaredField.setAccessible(true);
            if (((List) declaredField.get(outputConfiguration)).remove(surface)) {
            } else {
                throw new IllegalArgumentException("Surface is not part of this output configuration");
            }
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            p140j8.f.h("OutputConfigCompat", "Unable to remove surface from this output configuration.", e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long j6) {
        ((k) this.f13427a).f13430c = j6;
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public void setPhysicalCameraId(String str) {
        ((k) this.f13427a).f13429b = str;
    }
}
