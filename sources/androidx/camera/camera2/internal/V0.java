package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.SessionProcessor;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.maps.android.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class V0 implements CaptureSessionInterface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ArrayList f13275o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f13276p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SessionProcessor f13277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f13278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.d f13280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0962x0 f13281e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.camera.core.impl.H0 f13283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0937k0 f13284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.camera.core.impl.H0 f13285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13286j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final U0 f13288l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f13282f = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile List f13287k = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public org.greenrobot.eventbus.f f13289m = new org.greenrobot.eventbus.f(C1000q0.a(C0992m0.b()), 2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public org.greenrobot.eventbus.f f13290n = new org.greenrobot.eventbus.f(C1000q0.a(C0992m0.b()), 2);

    public V0(SessionProcessor sessionProcessor, M m7, androidx.camera.camera2.internal.compat.params.b bVar, androidx.camera.core.impl.utils.executor.i iVar, androidx.camera.core.impl.utils.executor.d dVar) {
        this.f13281e = new C0962x0(bVar, androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(CaptureSessionShouldUseMrirQuirk.class) != null);
        this.f13277a = sessionProcessor;
        this.f13278b = m7;
        this.f13279c = iVar;
        this.f13280d = dVar;
        this.f13286j = 1;
        this.f13288l = new U0();
        f13276p++;
        p140j8.f.G("ProcessingCaptureSession");
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.T t = (androidx.camera.core.impl.T) it.next();
            Iterator it2 = t.f13970e.iterator();
            while (it2.hasNext()) {
                ((AbstractC0999q) it2.next()).a(t.a());
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void cancelIssuedCaptureRequests() {
        p140j8.f.G("ProcessingCaptureSession");
        if (this.f13287k != null) {
            for (androidx.camera.core.impl.T t : this.f13287k) {
                Iterator it = t.f13970e.iterator();
                while (it.hasNext()) {
                    ((AbstractC0999q) it.next()).a(t.a());
                }
            }
            this.f13287k = null;
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void close() {
        p140j8.f.G("ProcessingCaptureSession");
        if (this.f13286j == 3) {
            p140j8.f.G("ProcessingCaptureSession");
            this.f13277a.onCaptureSessionEnd();
            C0937k0 c0937k0 = this.f13284h;
            if (c0937k0 != null) {
                synchronized (c0937k0.f13573a) {
                    c0937k0.f13576d = true;
                    c0937k0.f13574b = null;
                    c0937k0.f13577e = null;
                    c0937k0.f13575c = null;
                }
            }
            this.f13286j = 4;
        }
        this.f13281e.close();
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final List getCaptureConfigs() {
        return this.f13287k != null ? this.f13287k : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final androidx.camera.core.impl.H0 getSessionConfig() {
        return this.f13283g;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final boolean isInOpenState() {
        return this.f13281e.isInOpenState();
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void issueCaptureRequests(List list) {
        if (list.isEmpty()) {
            return;
        }
        p140j8.f.G("ProcessingCaptureSession");
        int i7 = F.i(this.f13286j);
        if (i7 == 0 || i7 == 1) {
            if (this.f13287k == null) {
                this.f13287k = list;
                return;
            } else {
                a(list);
                p140j8.f.G("ProcessingCaptureSession");
                return;
            }
        }
        if (i7 != 2) {
            if (i7 == 3 || i7 == 4) {
                p140j8.f.G("ProcessingCaptureSession");
                a(list);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.T t = (androidx.camera.core.impl.T) it.next();
            int i10 = t.f13968c;
            if (i10 != 2 && i10 != 4) {
                p140j8.f.G("ProcessingCaptureSession");
                org.greenrobot.eventbus.f fVarBuild = D.e.b(t.f13967b).build();
                Iterator<androidx.camera.core.impl.V> it2 = fVarBuild.listOptions().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        a(Arrays.asList(t));
                        break;
                    }
                    CaptureRequest.Key key = ((C0971c) it2.next()).f14033c;
                    if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        this.f13277a.startTrigger(fVarBuild, t.f13972g, new T0(t.a(), t.f13970e));
                        break;
                    }
                }
            } else {
                D.e eVarB = D.e.b(t.f13967b);
                C0971c c0971c = androidx.camera.core.impl.T.f13963i;
                C1000q0 c1000q0 = t.f13967b;
                if (c1000q0.f14126a.containsKey(c0971c)) {
                    CaptureRequest.Key key2 = CaptureRequest.JPEG_ORIENTATION;
                    Integer num = (Integer) c1000q0.retrieveOption(c0971c);
                    eVarB.f1584a.insertOption(androidx.camera.camera2.impl.b.k(key2), num);
                }
                C0971c c0971c2 = androidx.camera.core.impl.T.f13964j;
                if (c1000q0.f14126a.containsKey(c0971c2)) {
                    CaptureRequest.Key key3 = CaptureRequest.JPEG_QUALITY;
                    Byte bValueOf = Byte.valueOf(((Integer) c1000q0.retrieveOption(c0971c2)).byteValue());
                    eVarB.f1584a.insertOption(androidx.camera.camera2.impl.b.k(key3), bValueOf);
                }
                org.greenrobot.eventbus.f fVarBuild2 = eVarB.build();
                this.f13290n = fVarBuild2;
                org.greenrobot.eventbus.f fVar = this.f13289m;
                C0992m0 c0992m0B = C0992m0.b();
                androidx.camera.core.impl.W w3 = androidx.camera.core.impl.W.f13997d;
                for (androidx.camera.core.impl.V v3 : fVar.listOptions()) {
                    c0992m0B.insertOption(v3, w3, fVar.retrieveOption(v3));
                }
                for (androidx.camera.core.impl.V v4 : fVarBuild2.listOptions()) {
                    c0992m0B.insertOption(v4, w3, fVarBuild2.retrieveOption(v4));
                }
                this.f13277a.setParameters(new androidx.camera.camera2.impl.b(C1000q0.a(c0992m0B), 2));
                this.f13277a.startCapture(t.f13969d, t.f13972g, new T0(t.a(), t.f13970e));
            }
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final ListenableFuture open(androidx.camera.core.impl.H0 h7, CameraDevice cameraDevice, SynchronizedCaptureSession.Opener opener) {
        String str;
        int i7 = this.f13286j;
        boolean z3 = i7 == 1;
        if (i7 == 1) {
            str = "UNINITIALIZED";
        } else if (i7 == 2) {
            str = "SESSION_INITIALIZED";
        } else if (i7 == 3) {
            str = "ON_CAPTURE_SESSION_STARTED";
        } else if (i7 != 4) {
            str = i7 != 5 ? BuildConfig.TRAVIS : "DE_INITIALIZED";
        } else {
            str = "ON_CAPTURE_SESSION_ENDED";
        }
        p118hf.a.g(z3, "Invalid state state:".concat(str));
        p118hf.a.g(!h7.b().isEmpty(), "SessionConfig contains no surfaces");
        p140j8.f.G("ProcessingCaptureSession");
        List listB = h7.b();
        this.f13282f = listB;
        androidx.camera.core.impl.utils.executor.i iVar = this.f13279c;
        androidx.camera.core.impl.utils.futures.b bVarA = androidx.camera.core.impl.utils.futures.b.a(androidx.camera.core.impl.utils.n.z(listB, 5000L, iVar, this.f13280d));
        Q0 q10 = new Q0(this, h7, cameraDevice, opener, 0);
        bVarA.getClass();
        return androidx.camera.core.impl.utils.futures.j.i(androidx.camera.core.impl.utils.futures.j.i(bVarA, q10, iVar), new C2085k0(new Function() { // from class: androidx.camera.camera2.internal.R0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                V0 v3 = this.f13258a;
                C0962x0 c0962x0 = v3.f13281e;
                if (v3.f13286j == 2) {
                    List<AbstractC0970b0> listB2 = v3.f13285i.b();
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC0970b0 abstractC0970b0 : listB2) {
                        p118hf.a.g(false, "Surface must be SessionProcessorSurface");
                        if (abstractC0970b0 != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    }
                    v3.f13284h = new C0937k0(c0962x0, arrayList);
                    p140j8.f.G("ProcessingCaptureSession");
                    v3.f13277a.onCaptureSessionStart(v3.f13284h);
                    v3.f13286j = 3;
                    androidx.camera.core.impl.H0 h10 = v3.f13283g;
                    if (h10 != null) {
                        v3.setSessionConfig(h10);
                    }
                    if (v3.f13287k != null) {
                        v3.issueCaptureRequests(v3.f13287k);
                        v3.f13287k = null;
                    }
                }
                return null;
            }
        }, 13), iVar);
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final ListenableFuture release(boolean z3) {
        p140j8.f.G("ProcessingCaptureSession");
        ListenableFuture listenableFutureRelease = this.f13281e.release(z3);
        int i7 = F.i(this.f13286j);
        if (i7 == 1 || i7 == 3) {
            listenableFutureRelease.addListener(new RunnableC0961x(this, 6), org.chromium.support_lib_boundary.util.b.u());
        }
        this.f13286j = 5;
        return listenableFutureRelease;
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void setSessionConfig(androidx.camera.core.impl.H0 h7) {
        p140j8.f.G("ProcessingCaptureSession");
        this.f13283g = h7;
        if (h7 == null) {
            return;
        }
        C0937k0 c0937k0 = this.f13284h;
        if (c0937k0 != null) {
            synchronized (c0937k0.f13573a) {
                c0937k0.f13577e = h7;
            }
        }
        if (this.f13286j == 3) {
            org.greenrobot.eventbus.f fVarBuild = D.e.b(h7.f13886g.f13967b).build();
            this.f13289m = fVarBuild;
            org.greenrobot.eventbus.f fVar = this.f13290n;
            C0992m0 c0992m0B = C0992m0.b();
            androidx.camera.core.impl.W w3 = androidx.camera.core.impl.W.f13997d;
            for (androidx.camera.core.impl.V v3 : fVarBuild.listOptions()) {
                c0992m0B.insertOption(v3, w3, fVarBuild.retrieveOption(v3));
            }
            for (androidx.camera.core.impl.V v4 : fVar.listOptions()) {
                c0992m0B.insertOption(v4, w3, fVar.retrieveOption(v4));
            }
            this.f13277a.setParameters(new androidx.camera.camera2.impl.b(C1000q0.a(c0992m0B), 2));
            for (AbstractC0970b0 abstractC0970b0 : Collections.unmodifiableList(h7.f13886g.f13966a)) {
                if (Objects.equals(abstractC0970b0.f14030j, E.b0.class) || Objects.equals(abstractC0970b0.f14030j, androidx.camera.core.streamsharing.d.class)) {
                    this.f13277a.startRepeating(h7.f13886g.f13972g, this.f13288l);
                    return;
                }
            }
            this.f13277a.stopRepeating();
        }
    }

    @Override // androidx.camera.camera2.internal.CaptureSessionInterface
    public final void setStreamUseCaseMap(Map map) {
    }
}
