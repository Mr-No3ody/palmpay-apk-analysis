package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import E.C0216v;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.camera.core.impl.C0985j;
import androidx.camera.core.impl.C0987k;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0996o0;
import androidx.camera.core.impl.C1000q0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0963y extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13688a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13690c;

    public C0963y(Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f13690c = executor;
        this.f13689b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f13688a) {
            case 0:
                ((J) this.f13690c).f("openCameraConfigAndClose camera closed");
                ((androidx.concurrent.futures.k) this.f13689b).b(null);
                break;
            default:
                ((Executor) this.f13690c).execute(new androidx.camera.camera2.internal.compat.m(this, cameraDevice, 0));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f13688a) {
            case 0:
                ((J) this.f13690c).f("openCameraConfigAndClose camera disconnected");
                ((androidx.concurrent.futures.k) this.f13689b).b(null);
                break;
            default:
                ((Executor) this.f13690c).execute(new androidx.camera.camera2.internal.compat.m(this, cameraDevice, 1));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i7) {
        switch (this.f13688a) {
            case 0:
                ((J) this.f13690c).f(C0.G.m(i7, "openCameraConfigAndClose camera error "));
                ((androidx.concurrent.futures.k) this.f13689b).b(null);
                break;
            default:
                ((Executor) this.f13690c).execute(new H0.a(this, cameraDevice, i7, 10));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        Object obj = this.f13690c;
        switch (this.f13688a) {
            case 0:
                J j6 = (J) obj;
                j6.f("openCameraConfigAndClose camera opened");
                C0962x0 c0962x0 = new C0962x0(j6.f13198y0, false);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                E.j0 j0Var = new E.j0(surface);
                androidx.camera.core.impl.utils.futures.j.e(j0Var.f14025e).addListener(new RunnableC0934j(3, surface, surfaceTexture), org.chromium.support_lib_boundary.util.b.u());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                C0992m0 c0992m0B = C0992m0.b();
                ArrayList arrayList = new ArrayList();
                C0996o0 c0996o0A = C0996o0.a();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                C0216v c0216v = C0216v.f2122d;
                C0985j c0985jA = C0987k.a(j0Var);
                c0985jA.f14090e = c0216v;
                linkedHashSet.add(c0985jA.a());
                j6.f("Start configAndClose.");
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                C1000q0 c1000q0A = C1000q0.a(c0992m0B);
                ArrayList arrayList10 = new ArrayList(arrayList);
                androidx.camera.core.impl.O0 o10 = androidx.camera.core.impl.O0.f13940b;
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = c0996o0A.f13941a;
                for (String str : arrayMap2.keySet()) {
                    arrayMap.put(str, arrayMap2.get(str));
                }
                androidx.camera.core.impl.H0 h7 = new androidx.camera.core.impl.H0(arrayList5, arrayList6, arrayList7, arrayList8, new androidx.camera.core.impl.T(arrayList9, c1000q0A, 1, false, arrayList10, false, new androidx.camera.core.impl.O0(arrayMap), null), null, null, null);
                Z0 z3 = j6.f13189r0;
                androidx.camera.core.impl.utils.executor.d dVar = z3.f13333b;
                P0 p3 = z3.f13335d;
                androidx.camera.core.impl.utils.executor.i iVar = z3.f13332a;
                androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(AbstractC0198c.y(new androidx.camera.core.impl.utils.futures.d(c0962x0.open(h7, cameraDevice, new c1(z3.f13334c, p3, z3.f13336e, z3.f13337f, dVar, iVar)), 1)));
                int i7 = 0;
                C0953t c0953t = new C0953t(i7, c0962x0, j0Var);
                bVarA.getClass();
                androidx.camera.core.impl.utils.executor.i iVar2 = j6.f13177c;
                androidx.camera.core.impl.utils.futures.a aVarI = androidx.camera.core.impl.utils.futures.j.i(bVarA, c0953t, iVar2);
                Objects.requireNonNull(cameraDevice);
                aVarI.addListener(new RunnableC0961x(cameraDevice, i7), iVar2);
                break;
            default:
                ((Executor) obj).execute(new androidx.camera.camera2.internal.compat.m(this, cameraDevice, 2));
                break;
        }
    }

    public C0963y(J j6, androidx.concurrent.futures.k kVar) {
        this.f13690c = j6;
        this.f13689b = kVar;
    }
}
