package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import androidx.camera.camera2.internal.C0943n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class p implements SessionConfigurationCompat$SessionConfigurationCompatImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SessionConfiguration f13433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f13434b;

    public p(int i7, List list, androidx.camera.core.impl.utils.executor.i iVar, C0943n0 c0943n0) {
        h hVar;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(i7, r.h(list), iVar, c0943n0);
        this.f13433a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            if (outputConfiguration == null) {
                hVar = null;
            } else {
                int i10 = Build.VERSION.SDK_INT;
                hVar = new h(i10 >= 33 ? new o(outputConfiguration) : i10 >= 28 ? new n(new m(outputConfiguration)) : i10 >= 26 ? new l(new k(outputConfiguration)) : new j(new i(outputConfiguration)));
            }
            arrayList.add(hVar);
        }
        this.f13434b = Collections.unmodifiableList(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return Objects.equals(this.f13433a, ((p) obj).f13433a);
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final Executor getExecutor() {
        return this.f13433a.getExecutor();
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final g getInputConfiguration() {
        return g.a(this.f13433a.getInputConfiguration());
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final List getOutputConfigurations() {
        return this.f13434b;
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final Object getSessionConfiguration() {
        return this.f13433a;
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final CaptureRequest getSessionParameters() {
        return this.f13433a.getSessionParameters();
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final int getSessionType() {
        return this.f13433a.getSessionType();
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final CameraCaptureSession.StateCallback getStateCallback() {
        return this.f13433a.getStateCallback();
    }

    public final int hashCode() {
        return this.f13433a.hashCode();
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final void setInputConfiguration(g gVar) {
        this.f13433a.setInputConfiguration(gVar.f13421a.f13420a);
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final void setSessionParameters(CaptureRequest captureRequest) {
        this.f13433a.setSessionParameters(captureRequest);
    }
}
