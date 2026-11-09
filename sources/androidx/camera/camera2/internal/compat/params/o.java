package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {
    @Override // androidx.camera.camera2.internal.compat.params.n, androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final long getDynamicRangeProfile() {
        return ((OutputConfiguration) getOutputConfiguration()).getDynamicRangeProfile();
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final int getMirrorMode() {
        return ((OutputConfiguration) getOutputConfiguration()).getMirrorMode();
    }

    @Override // androidx.camera.camera2.internal.compat.params.n, androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final Object getOutputConfiguration() {
        Object obj = this.f13427a;
        p118hf.a.f(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final long getStreamUseCase() {
        return ((OutputConfiguration) getOutputConfiguration()).getStreamUseCase();
    }

    @Override // androidx.camera.camera2.internal.compat.params.n, androidx.camera.camera2.internal.compat.params.l, androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final void setDynamicRangeProfile(long j6) {
        ((OutputConfiguration) getOutputConfiguration()).setDynamicRangeProfile(j6);
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final void setMirrorMode(int i7) {
        ((OutputConfiguration) getOutputConfiguration()).setMirrorMode(i7);
    }

    @Override // androidx.camera.camera2.internal.compat.params.j, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat$OutputConfigurationCompatImpl
    public final void setStreamUseCase(long j6) {
        if (j6 == -1) {
            return;
        }
        ((OutputConfiguration) getOutputConfiguration()).setStreamUseCase(j6);
    }
}
