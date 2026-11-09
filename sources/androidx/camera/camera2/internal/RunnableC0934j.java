package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.SessionConfig$ErrorListener;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0934j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13560c;

    public /* synthetic */ RunnableC0934j(int i7, Object obj, Object obj2) {
        this.f13558a = i7;
        this.f13559b = obj;
        this.f13560c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13558a) {
            case 0:
                C0940m c0940m = ((C0944o) this.f13559b).f13627z;
                HashSet hashSet = (HashSet) c0940m.f13596b;
                AbstractC0999q abstractC0999q = (AbstractC0999q) this.f13560c;
                hashSet.remove(abstractC0999q);
                ((ArrayMap) c0940m.f13597c).remove(abstractC0999q);
                return;
            case 1:
                C0944o c0944o = (C0944o) this.f13559b;
                androidx.camera.core.impl.utils.futures.j.f(AbstractC0198c.y(new O8.a(c0944o.k(), c0944o)), (androidx.concurrent.futures.k) this.f13560c);
                return;
            case 2:
                C0942n c0942n = (C0942n) this.f13559b;
                HashSet hashSet2 = new HashSet();
                HashSet<Camera2CameraControlImpl$CaptureResultListener> hashSet3 = (HashSet) c0942n.f13600b;
                for (Camera2CameraControlImpl$CaptureResultListener camera2CameraControlImpl$CaptureResultListener : hashSet3) {
                    if (camera2CameraControlImpl$CaptureResultListener.onCaptureResult((TotalCaptureResult) this.f13560c)) {
                        hashSet2.add(camera2CameraControlImpl$CaptureResultListener);
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                hashSet3.removeAll(hashSet2);
                return;
            case 3:
                ((Surface) this.f13559b).release();
                ((SurfaceTexture) this.f13560c).release();
                return;
            case 4:
                J j6 = (J) this.f13559b;
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str = (String) this.f13560c;
                sb2.append(str);
                sb2.append(" INACTIVE");
                j6.f(sb2.toString());
                LinkedHashMap linkedHashMap = (LinkedHashMap) j6.f13175a.f41079b;
                if (linkedHashMap.containsKey(str)) {
                    androidx.camera.core.impl.R0 r3 = (androidx.camera.core.impl.R0) linkedHashMap.get(str);
                    r3.f13954f = false;
                    if (!r3.f13953e) {
                        linkedHashMap.remove(str);
                    }
                }
                j6.x();
                return;
            case 5:
                ((SessionConfig$ErrorListener) this.f13559b).onError((androidx.camera.core.impl.H0) this.f13560c, androidx.camera.core.impl.F0.f13859a);
                return;
            case 6:
                ((C0944o) this.f13559b).i((C0917a0) this.f13560c);
                return;
            case 7:
                androidx.camera.core.impl.utils.n.f(((V0) this.f13559b).f13282f);
                AbstractC0970b0 abstractC0970b0 = (AbstractC0970b0) this.f13560c;
                if (abstractC0970b0 != null) {
                    abstractC0970b0.b();
                    return;
                }
                return;
            case 8:
                c1 c1Var = (c1) this.f13559b;
                SynchronizedCaptureSession synchronizedCaptureSession = (SynchronizedCaptureSession) this.f13560c;
                P0 p3 = c1Var.f13350b;
                synchronized (p3.f13247b) {
                    ((LinkedHashSet) p3.f13248c).remove(c1Var);
                    ((LinkedHashSet) p3.f13249d).remove(c1Var);
                    break;
                }
                c1Var.g(synchronizedCaptureSession);
                if (c1Var.f13355g == null) {
                    p140j8.f.G("SyncCaptureSessionBase");
                    return;
                } else {
                    Objects.requireNonNull(c1Var.f13354f);
                    c1Var.f13354f.c(synchronizedCaptureSession);
                    return;
                }
            default:
                b1 b1Var = (b1) this.f13559b;
                Objects.requireNonNull(b1Var.f13354f);
                b1Var.f13354f.g((SynchronizedCaptureSession) this.f13560c);
                return;
        }
    }
}
