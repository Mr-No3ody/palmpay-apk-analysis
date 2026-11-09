package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.C0943n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class q implements SessionConfigurationCompat$SessionConfigurationCompatImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0943n0 f13436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f13439e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CaptureRequest f13440f = null;

    public q(int i7, List list, androidx.camera.core.impl.utils.executor.i iVar, C0943n0 c0943n0) {
        this.f13438d = i7;
        this.f13435a = Collections.unmodifiableList(new ArrayList(list));
        this.f13436b = c0943n0;
        this.f13437c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (Objects.equals(this.f13439e, qVar.f13439e) && this.f13438d == qVar.f13438d) {
                List list = this.f13435a;
                int size = list.size();
                List list2 = qVar.f13435a;
                if (size == list2.size()) {
                    for (int i7 = 0; i7 < list.size(); i7++) {
                        if (!((h) list.get(i7)).equals(list2.get(i7))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final Executor getExecutor() {
        return this.f13437c;
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final g getInputConfiguration() {
        return this.f13439e;
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final List getOutputConfigurations() {
        return this.f13435a;
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final Object getSessionConfiguration() {
        return null;
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final CaptureRequest getSessionParameters() {
        return this.f13440f;
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final int getSessionType() {
        return this.f13438d;
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final CameraCaptureSession.StateCallback getStateCallback() {
        return this.f13436b;
    }

    public final int hashCode() {
        int iHashCode = this.f13435a.hashCode() ^ 31;
        int i7 = (iHashCode << 5) - iHashCode;
        g gVar = this.f13439e;
        int iHashCode2 = (gVar == null ? 0 : gVar.f13421a.f13420a.hashCode()) ^ i7;
        return this.f13438d ^ ((iHashCode2 << 5) - iHashCode2);
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final void setInputConfiguration(g gVar) {
        if (this.f13438d == 1) {
            throw new UnsupportedOperationException("Method not supported for high speed session types");
        }
        this.f13439e = gVar;
    }

    @Override // androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat$SessionConfigurationCompatImpl
    public final void setSessionParameters(CaptureRequest captureRequest) {
        this.f13440f = captureRequest;
    }
}
