package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e implements InputConfigurationCompat$InputConfigurationCompatImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputConfiguration f13420a;

    public e(Object obj) {
        this.f13420a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InputConfigurationCompat$InputConfigurationCompatImpl)) {
            return false;
        }
        return Objects.equals(this.f13420a, ((InputConfigurationCompat$InputConfigurationCompatImpl) obj).getInputConfiguration());
    }

    @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl
    public final int getFormat() {
        return this.f13420a.getFormat();
    }

    @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl
    public final int getHeight() {
        return this.f13420a.getHeight();
    }

    @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl
    public final Object getInputConfiguration() {
        return this.f13420a;
    }

    @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl
    public final int getWidth() {
        return this.f13420a.getWidth();
    }

    public final int hashCode() {
        return this.f13420a.hashCode();
    }

    @Override // androidx.camera.camera2.internal.compat.params.InputConfigurationCompat$InputConfigurationCompatImpl
    public boolean isMultiResolution() {
        return false;
    }

    public final String toString() {
        return this.f13420a.toString();
    }
}
