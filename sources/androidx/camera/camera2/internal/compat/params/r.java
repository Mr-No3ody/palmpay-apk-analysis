package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import androidx.camera.camera2.internal.C0943n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SessionConfigurationCompat$SessionConfigurationCompatImpl f13441a;

    public r(int i7, List list, androidx.camera.core.impl.utils.executor.i iVar, C0943n0 c0943n0) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f13441a = new q(i7, list, iVar, c0943n0);
        } else {
            this.f13441a = new p(i7, list, iVar, c0943n0);
        }
    }

    public static ArrayList h(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((h) it.next()).f13422a.getOutputConfiguration());
        }
        return arrayList;
    }

    public final Executor a() {
        return this.f13441a.getExecutor();
    }

    public final g b() {
        return this.f13441a.getInputConfiguration();
    }

    public final List c() {
        return this.f13441a.getOutputConfigurations();
    }

    public final int d() {
        return this.f13441a.getSessionType();
    }

    public final CameraCaptureSession.StateCallback e() {
        return this.f13441a.getStateCallback();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f13441a.equals(((r) obj).f13441a);
    }

    public final void f(g gVar) {
        this.f13441a.setInputConfiguration(gVar);
    }

    public final void g(CaptureRequest captureRequest) {
        this.f13441a.setSessionParameters(captureRequest);
    }

    public final int hashCode() {
        return this.f13441a.hashCode();
    }

    public final Object i() {
        return this.f13441a.getSessionConfiguration();
    }
}
