package androidx.camera.video;

import E.C0216v;
import E.m0;
import android.net.Uri;
import android.util.Size;
import android.view.Surface;
import androidx.biometric.RunnableC0903g;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.C0994n0;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.J0;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.P0;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.encoder.EncodedData;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.OutputConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s implements VideoOutput {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Set f14825E = Collections.unmodifiableSet(EnumSet.of(r.f14817b, r.f14818c));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Set f14826F = Collections.unmodifiableSet(EnumSet.of(r.f14816a, r.f14819d, r.f14822g, r.f14821f, r.f14823i));

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final p1.d f14827G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final j f14828H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C1016e f14829I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final B8.d f14830J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f14831K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final long f14832L;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public E f14833A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public E f14834B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public q f14835C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f14836D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0994n0 f14837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0994n0 f14838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f14839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f14840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B8.d f14841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f14842f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r f14844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f14845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.camera.video.internal.d f14848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f14849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m0 f14850n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public P0 f14851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Surface f14852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Surface f14853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0994n0 f14854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Encoder f14855s;
    public OutputConfig t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final OutputConfig f14856u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14857v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EncodedData f14858w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final androidx.camera.core.internal.utils.a f14859x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public F f14860y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ScheduledFuture f14861z;

    static {
        C1018g c1018g = l.f14795c;
        p1.d dVarH = p1.d.h(Arrays.asList(c1018g, l.f14794b, l.f14793a), new C1015d(c1018g, 1));
        f14827G = dVarH;
        i iVarA = j.a();
        iVarA.f14603a = dVarH;
        iVarA.f14606d = -1;
        j jVarA = iVarA.a();
        f14828H = jVarA;
        C1014c c1014cA = C1014c.a().a();
        j.a().a();
        f14829I = new C1016e(jVarA, c1014cA, -1);
        new RuntimeException("The video frame producer became inactive before any data was received.");
        f14830J = new B8.d(12);
        new androidx.camera.core.impl.utils.executor.i(org.chromium.support_lib_boundary.util.b.M());
        f14831K = 3;
        f14832L = 1000L;
    }

    public s(C1016e c1016e, B8.d dVar, B8.d dVar2) {
        this.f14843g = androidx.camera.video.internal.compat.quirk.a.f14630a.b(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.f14844h = r.f14816a;
        this.f14845i = null;
        this.f14846j = 0;
        this.f14847k = false;
        this.f14848l = null;
        this.f14849m = new ArrayList();
        this.f14852p = null;
        this.f14853q = null;
        this.f14855s = null;
        this.t = null;
        this.f14856u = null;
        this.f14836D = 1;
        Uri uri = Uri.EMPTY;
        this.f14857v = 1;
        this.f14858w = null;
        this.f14859x = new androidx.camera.core.internal.utils.a(60, null);
        this.f14860y = F.f14572c;
        this.f14861z = null;
        this.f14834B = null;
        this.f14835C = null;
        androidx.camera.core.impl.utils.executor.f fVarM = org.chromium.support_lib_boundary.util.b.M();
        this.f14839c = fVarM;
        androidx.camera.core.impl.utils.executor.i iVar = new androidx.camera.core.impl.utils.executor.i(fVarM);
        this.f14840d = iVar;
        j jVarA = c1016e.f14590a;
        C1014c c1014c = c1016e.f14591b;
        int i7 = c1016e.f14592c;
        if (c1016e.f14590a.f14788d == -1) {
            if (jVarA == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            i iVar2 = new i();
            iVar2.f14603a = jVarA.f14785a;
            iVar2.f14604b = jVarA.f14786b;
            iVar2.f14605c = jVarA.f14787c;
            iVar2.f14606d = Integer.valueOf(jVarA.f14788d);
            iVar2.f14606d = Integer.valueOf(f14828H.f14788d);
            jVarA = iVar2.a();
        }
        String strConcat = jVarA == null ? " videoSpec" : "";
        strConcat = c1014c == null ? strConcat.concat(" audioSpec") : strConcat;
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        this.f14854r = new C0994n0(new C1016e(jVarA, c1014c, i7));
        this.f14837a = new C0994n0(new h(this.f14846j, c(this.f14844h)));
        this.f14838b = new C0994n0(Boolean.FALSE);
        this.f14841e = dVar;
        this.f14833A = new E(dVar, iVar, fVarM);
    }

    public static Object b(J0 j1) {
        try {
            return j1.fetchData().get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(r rVar) {
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = (DeactivateEncoderSurfaceBeforeStopEncoderQuirk) androidx.camera.video.internal.compat.quirk.a.f14630a.b(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class);
        if (rVar != r.f14820e) {
            return (rVar == r.f14821f && deactivateEncoderSurfaceBeforeStopEncoderQuirk == null) ? 1 : 2;
        }
        return 1;
    }

    public static void d(Encoder encoder) {
        if (encoder instanceof androidx.camera.video.internal.encoder.v) {
            androidx.camera.video.internal.encoder.v vVar = (androidx.camera.video.internal.encoder.v) encoder;
            vVar.f14741h.execute(new androidx.camera.video.internal.encoder.k(vVar, 4));
        }
    }

    public final void a(m0 m0Var, P0 p3, boolean z3) {
        if (m0Var.a()) {
            p140j8.f.G("Recorder");
            return;
        }
        o oVar = new o(this);
        androidx.camera.core.impl.utils.executor.i iVar = this.f14840d;
        m0Var.c(iVar, oVar);
        t tVar = new t((CameraInfoInternal) m0Var.f2059e.getCameraInfo());
        Size size = m0Var.f2056b;
        C0216v c0216v = m0Var.f2057c;
        l lVarFindNearestHigherSupportedQualityFor = tVar.findNearestHigherSupportedQualityFor(size, c0216v);
        Objects.toString(lVarFindNearestHigherSupportedQualityFor);
        Objects.toString(size);
        p140j8.f.G("Recorder");
        if (lVarFindNearestHigherSupportedQualityFor != l.f14799g) {
            k kVarA = tVar.a(c0216v);
            androidx.camera.video.internal.d dVarA = kVarA == null ? null : kVarA.a(lVarFindNearestHigherSupportedQualityFor);
            this.f14848l = dVarA;
            if (dVarA == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        q qVar = this.f14835C;
        if (qVar != null && !qVar.f14812d) {
            qVar.f14812d = true;
            ScheduledFuture scheduledFuture = qVar.f14814f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                qVar.f14814f = null;
            }
        }
        q qVar2 = new q(this, m0Var, p3, z3 ? f14831K : 0);
        this.f14835C = qVar2;
        Objects.toString(this.f14855s);
        p140j8.f.G("Recorder");
        E e10 = this.f14833A;
        e10.a();
        androidx.camera.core.impl.utils.futures.j.e(e10.f14566j).addListener(new Da.h(qVar2, 24, m0Var, p3), iVar);
    }

    public final void e(IOException iOException) {
        boolean z3;
        synchronized (this.f14842f) {
            try {
                z3 = false;
                switch (this.f14844h.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.f14844h);
                    case 4:
                    case 5:
                        h(r.f14821f);
                        z3 = true;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            j(5, iOException);
        }
    }

    public final void f() {
        boolean z3;
        boolean z8;
        synchronized (this.f14842f) {
            try {
                z3 = false;
                switch (this.f14844h.ordinal()) {
                    case 1:
                    case 2:
                        k(r.f14822g);
                    case 0:
                    case 3:
                    case 8:
                        z8 = false;
                        z3 = true;
                        break;
                    case 4:
                    case 5:
                        p118hf.a.k(false, "In-progress recording shouldn't be null when in state " + this.f14844h);
                        h(r.f14822g);
                        z8 = true;
                        break;
                    case 6:
                        h(r.f14822g);
                        z8 = false;
                        break;
                    case 7:
                    default:
                        z8 = false;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z3) {
            if (z8) {
                j(4, null);
                return;
            }
            return;
        }
        p140j8.f.G("Recorder");
        this.f14836D = 1;
        if (this.f14855s != null) {
            p140j8.f.G("Recorder");
            E e10 = this.f14834B;
            if (e10 != null) {
                p118hf.a.k(e10.f14560d == this.f14855s, null);
                Objects.toString(this.f14855s);
                p140j8.f.G("Recorder");
                this.f14834B.b();
                this.f14834B = null;
                this.f14855s = null;
                g(null);
            } else {
                Objects.toString(this.f14855s);
                p140j8.f.G("Recorder");
                E e11 = this.f14833A;
                e11.a();
                androidx.camera.core.impl.utils.futures.j.e(e11.f14566j);
            }
        }
        synchronized (this.f14842f) {
            try {
                switch (this.f14844h.ordinal()) {
                    case 1:
                    case 2:
                        k(r.f14816a);
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        h(r.f14816a);
                        break;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m0 m0Var = this.f14850n;
        if (m0Var == null || m0Var.a()) {
            return;
        }
        a(this.f14850n, this.f14851o, false);
    }

    public final void g(Surface surface) {
        int iHashCode;
        if (this.f14852p == surface) {
            return;
        }
        this.f14852p = surface;
        synchronized (this.f14842f) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            i(iHashCode);
        }
    }

    @Override // androidx.camera.video.VideoOutput
    public final VideoCapabilities getMediaCapabilities(CameraInfo cameraInfo) {
        return new t((CameraInfoInternal) cameraInfo);
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable getMediaSpec() {
        return this.f14854r;
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable getStreamInfo() {
        return this.f14837a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    public final void h(r rVar) {
        int iC;
        r rVar2 = this.f14844h;
        if (rVar2 == rVar) {
            throw new AssertionError("Attempted to transition to state " + rVar + ", but Recorder is already in state " + rVar);
        }
        Objects.toString(rVar2);
        Objects.toString(rVar);
        p140j8.f.G("Recorder");
        Set set = f14825E;
        if (set.contains(rVar)) {
            if (!set.contains(this.f14844h)) {
                if (!f14826F.contains(this.f14844h)) {
                    throw new AssertionError("Invalid state transition. Should not be transitioning to a PENDING state from state " + this.f14844h);
                }
                r rVar3 = this.f14844h;
                this.f14845i = rVar3;
                iC = c(rVar3);
            }
            this.f14844h = rVar;
            if (iC == 0) {
                iC = c(rVar);
            }
            this.f14837a.b(new h(this.f14846j, iC));
        }
        if (this.f14845i != null) {
            this.f14845i = null;
        }
        iC = 0;
        this.f14844h = rVar;
        if (iC == 0) {
            iC = c(rVar);
        }
        this.f14837a.b(new h(this.f14846j, iC));
    }

    public final void i(int i7) {
        if (this.f14846j == i7) {
            return;
        }
        p140j8.f.G("Recorder");
        this.f14846j = i7;
        this.f14837a.b(new h(i7, c(this.f14844h)));
    }

    @Override // androidx.camera.video.VideoOutput
    public final Observable isSourceStreamRequired() {
        return this.f14838b;
    }

    public final void j(int i7, IOException iOException) {
        if (this.f14847k) {
            return;
        }
        this.f14847k = true;
        this.f14857v = i7;
        if (this.f14836D != 4) {
            EncodedData encodedData = this.f14858w;
            if (encodedData != null) {
                encodedData.close();
                this.f14858w = null;
            }
            if (this.f14860y != F.f14571b) {
                W8.o oVar = new W8.o(this.f14855s, 21);
                this.f14861z = org.chromium.support_lib_boundary.util.b.S().schedule(new RunnableC0903g(23, this.f14840d, oVar), 1000L, TimeUnit.MILLISECONDS);
            } else {
                d(this.f14855s);
            }
            this.f14855s.stop(-1L);
            return;
        }
        while (true) {
            androidx.camera.core.internal.utils.a aVar = this.f14859x;
            if (aVar.isEmpty()) {
                throw null;
            }
            aVar.dequeue();
        }
    }

    public final void k(r rVar) {
        if (!f14825E.contains(this.f14844h)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.f14844h);
        }
        if (!f14826F.contains(rVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + rVar);
        }
        if (this.f14845i != rVar) {
            this.f14845i = rVar;
            this.f14837a.b(new h(this.f14846j, c(rVar)));
        }
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSourceStateChanged(F f10) {
        this.f14840d.execute(new RunnableC0903g(22, this, f10));
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(m0 m0Var) {
        onSurfaceRequested(m0Var, P0.f13943a);
    }

    @Override // androidx.camera.video.VideoOutput
    public final void onSurfaceRequested(m0 m0Var, P0 p3) {
        synchronized (this.f14842f) {
            try {
                Objects.toString(this.f14844h);
                p140j8.f.G("Recorder");
                if (this.f14844h == r.f14823i) {
                    h(r.f14816a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14840d.execute(new Da.h(this, 23, m0Var, p3));
    }
}
