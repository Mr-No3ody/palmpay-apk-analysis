package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j implements OutputConfigurationCompat$OutputConfigurationCompatImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13427a;

    public j(Object obj) {
        this.f13427a = obj;
    }

    public boolean a() {
        return ((i) this.f13427a).f13425c;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public void addSurface(Surface surface) {
        p118hf.a.j(surface, "Surface must not be null");
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!a()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
        ((i) this.f13427a).f13425c = true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return Objects.equals(this.f13427a, ((j) obj).f13427a);
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public long getDynamicRangeProfile() {
        return ((i) this.f13427a).f13426d;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public int getMaxSharedSurfaceCount() {
        return 1;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public int getMirrorMode() {
        return 0;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public Object getOutputConfiguration() {
        Object obj = this.f13427a;
        p118hf.a.f(obj instanceof i);
        return ((i) obj).f13423a;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public String getPhysicalCameraId() {
        return ((i) this.f13427a).f13424b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public long getStreamUseCase() {
        return -1L;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final Surface getSurface() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurface();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final int getSurfaceGroupId() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaceGroupId();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public List getSurfaces() {
        return Collections.singletonList(getSurface());
    }

    public final int hashCode() {
        return this.f13427a.hashCode();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public void removeSurface(Surface surface) {
        if (getSurface() != surface) {
            throw new IllegalArgumentException("Surface is not part of this output configuration");
        }
        throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public void setDynamicRangeProfile(long j6) {
        ((i) this.f13427a).f13426d = j6;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public void setPhysicalCameraId(String str) {
        ((i) this.f13427a).f13424b = str;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public void setMirrorMode(int i7) {
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public void setStreamUseCase(long j6) {
    }
}
