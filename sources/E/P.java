package E;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageCapture$OnImageSavedCallback;
import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0982h0;
import androidx.camera.core.impl.C0985j;
import androidx.camera.core.impl.C0987k;
import androidx.camera.core.impl.C0991m;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class P extends n0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final M f1940z = new M();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicReference f1942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1943q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Rational f1945s;
    public androidx.camera.core.internal.i t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0 f1946u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public E2.a f1947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.camera.core.imagecapture.x f1948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public D0 f1949x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Oe.a f1950y;

    public P(C0982h0 c0982h0) {
        super(c0982h0);
        this.f1942p = new AtomicReference(null);
        this.f1944r = -1;
        this.f1945s = null;
        this.f1950y = new Oe.a(this, 3);
        C0982h0 c0982h1 = (C0982h0) this.f2078f;
        C0971c c0971c = C0982h0.f14069b;
        if (c0982h1.containsOption(c0971c)) {
            this.f1941o = ((Integer) c0982h1.retrieveOption(c0971c)).intValue();
        } else {
            this.f1941o = 1;
        }
        this.f1943q = ((Integer) c0982h1.retrieveOption(C0982h0.f14076j, 0)).intValue();
        this.t = androidx.camera.core.internal.i.f14348e.from((ImageCapture$ScreenFlash) c0982h1.retrieveOption(C0982h0.f14078p, null));
    }

    public static boolean G(int i7, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i7))) {
                return true;
            }
        }
        return false;
    }

    public final void D(boolean z3) {
        androidx.camera.core.imagecapture.x xVar;
        p140j8.f.b();
        D0 d1 = this.f1949x;
        if (d1 != null) {
            d1.a();
            this.f1949x = null;
        }
        E2.a aVar = this.f1947v;
        if (aVar != null) {
            p140j8.f.b();
            ((androidx.camera.core.imagecapture.n) aVar.f2185d).release();
            ((androidx.camera.core.imagecapture.s) aVar.f2186e).getClass();
            this.f1947v = null;
        }
        if (z3 || (xVar = this.f1948w) == null) {
            return;
        }
        xVar.a();
        this.f1948w = null;
    }

    public final C0 E(String str, C0982h0 c0982h0, C0993n c0993n) {
        SessionProcessor sessionProcessor;
        p140j8.f.b();
        Objects.toString(c0993n);
        Size size = c0993n.f14108a;
        CameraInternal cameraInternalB = b();
        Objects.requireNonNull(cameraInternalB);
        boolean z3 = !cameraInternalB.getHasTransform();
        Size size2 = null;
        if (this.f1947v != null) {
            p118hf.a.k(z3, null);
            E2.a aVar = this.f1947v;
            aVar.getClass();
            p140j8.f.b();
            ((androidx.camera.core.imagecapture.n) aVar.f2185d).release();
            ((androidx.camera.core.imagecapture.s) aVar.f2186e).getClass();
        }
        int i7 = 35;
        if (((Boolean) this.f2078f.retrieveOption(C0982h0.f14079v, Boolean.FALSE)).booleanValue() && (sessionProcessor = b().getExtendedConfig().getSessionProcessor(null)) != null) {
            I.b bVar = (I.b) this.f2078f.retrieveOption(C0982h0.t, null);
            Map<Integer, List<Size>> supportedPostviewSize = sessionProcessor.getSupportedPostviewSize(size);
            List<Size> list = supportedPostviewSize.get(35);
            if (list == null || list.isEmpty()) {
                i7 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                list = supportedPostviewSize.get(Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
            }
            List<Size> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                if (bVar != null) {
                    Collections.sort(list2, new androidx.camera.core.impl.utils.d(true));
                    CameraInternal cameraInternalB2 = b();
                    Rect sensorRect = cameraInternalB2.getCameraControlInternal().getSensorRect();
                    CameraInfoInternal cameraInfoInternal = cameraInternalB2.getCameraInfoInternal();
                    ArrayList arrayList = (ArrayList) Xe.e.e(bVar, list2, null, j(), new Rational(sensorRect.width(), sensorRect.height()), cameraInfoInternal.getSensorRotationDegrees(), cameraInfoInternal.getLensFacing());
                    if (arrayList.isEmpty()) {
                        throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
                    }
                    size2 = (Size) arrayList.get(0);
                } else {
                    size2 = (Size) Collections.max(list2, new androidx.camera.core.impl.utils.d(false));
                }
            }
        }
        this.f1947v = new E2.a(c0982h0, size, z3, size2, i7);
        if (this.f1948w == null) {
            this.f1948w = new androidx.camera.core.imagecapture.x(this.f1950y);
        }
        androidx.camera.core.imagecapture.x xVar = this.f1948w;
        E2.a aVar2 = this.f1947v;
        xVar.getClass();
        p140j8.f.b();
        xVar.f13823c = aVar2;
        aVar2.getClass();
        p140j8.f.b();
        androidx.camera.core.imagecapture.n nVar = (androidx.camera.core.imagecapture.n) aVar2.f2185d;
        nVar.getClass();
        p140j8.f.b();
        p118hf.a.k(nVar.f13774b != null, "The ImageReader is not initialized.");
        d0 d0Var = nVar.f13774b;
        synchronized (d0Var.f2006a) {
            d0Var.f2011f = xVar;
        }
        E2.a aVar3 = this.f1947v;
        C0 c0E = C0.e((C0982h0) aVar3.f2183b, c0993n.f14108a);
        androidx.camera.core.imagecapture.b bVar2 = (androidx.camera.core.imagecapture.b) aVar3.f2187f;
        j0 j0Var = bVar2.f13734b;
        Objects.requireNonNull(j0Var);
        C0216v c0216v = C0216v.f2122d;
        C0985j c0985jA = C0987k.a(j0Var);
        c0985jA.f14090e = c0216v;
        c0E.f13838a.add(c0985jA.a());
        j0 j0Var2 = bVar2.f13735c;
        if (j0Var2 != null) {
            c0E.f13845h = C0987k.a(j0Var2).a();
        }
        if (this.f1941o == 2 && !c0993n.f14112e) {
            c().addZslConfig(c0E);
        }
        androidx.camera.camera2.impl.b bVar3 = c0993n.f14111d;
        if (bVar3 != null) {
            c0E.f13839b.c(bVar3);
        }
        D0 d1 = this.f1949x;
        if (d1 != null) {
            d1.a();
        }
        D0 d2 = new D0(new C0220z(this, 1));
        this.f1949x = d2;
        c0E.f13843f = d2;
        return c0E;
    }

    public final int F() {
        int iIntValue;
        synchronized (this.f1942p) {
            iIntValue = this.f1944r;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((C0982h0) this.f2078f).retrieveOption(C0982h0.f14070c, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void H(int i7) {
        p140j8.f.G("ImageCapture");
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                throw new IllegalArgumentException(C0.G.m(i7, "Invalid flash mode: "));
            }
            if (this.t.f14349a == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (b() != null) {
                CameraInternal cameraInternalB = b();
                if ((cameraInternalB != null ? cameraInternalB.getCameraInfo().getLensFacing() : -1) != 0) {
                    throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
                }
            }
        }
        synchronized (this.f1942p) {
            this.f1944r = i7;
            K();
        }
    }

    public final void I(int i7) {
        int iJ = j();
        if (!z(i7) || this.f1945s == null) {
            return;
        }
        this.f1945s = androidx.camera.core.internal.utils.c.b(Math.abs(com.facebook.imagepipeline.nativecode.b.V(i7) - com.facebook.imagepipeline.nativecode.b.V(iJ)), this.f1945s);
    }

    public final void J(Executor executor, androidx.camera.video.internal.c cVar, ImageCapture$OnImageSavedCallback imageCapture$OnImageSavedCallback, p279s5.d dVar) {
        Rect rect;
        int iRound;
        int i7;
        int i10;
        int i11;
        int iIntValue;
        p140j8.f.b();
        if (F() == 3 && this.t.f14349a == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        CameraInternal cameraInternalB = b();
        Rect rect2 = null;
        if (cameraInternalB == null) {
            Q exception = new Q(4, "Not bound to a valid Camera [" + this + "]", null);
            if (cVar == null) {
                if (imageCapture$OnImageSavedCallback == null) {
                    throw new IllegalArgumentException("Must have either in-memory or on-disk callback.");
                }
                imageCapture$OnImageSavedCallback.onError(exception);
                return;
            }
            Intrinsics.checkNotNullParameter(exception, "exception");
            int i12 = p292t6.a.f42345a;
            String message = exception.getMessage();
            if (message == null) {
                message = "";
            }
            p292t6.a.b(message);
            SelfieCaptureActivity.e((SelfieCaptureActivity) cVar.f14621b);
            return;
        }
        androidx.camera.core.imagecapture.x xVar = this.f1948w;
        Objects.requireNonNull(xVar);
        Rect rect3 = this.f2081i;
        C0993n c0993n = this.f2079g;
        Size size = c0993n != null ? c0993n.f14108a : null;
        Objects.requireNonNull(size);
        if (rect3 == null) {
            Rational rational = this.f1945s;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rect3 = new Rect(0, 0, size.getWidth(), size.getHeight());
                rect = rect3;
            } else {
                CameraInternal cameraInternalB2 = b();
                Objects.requireNonNull(cameraInternalB2);
                int iG = g(cameraInternalB2, false);
                Rational rational2 = new Rational(this.f1945s.getDenominator(), this.f1945s.getNumerator());
                if (!androidx.camera.core.impl.utils.o.c(iG)) {
                    rational2 = this.f1945s;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    p140j8.f.G("ImageUtil");
                } else {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    float f10 = width;
                    float f11 = height;
                    float f12 = f10 / f11;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f12) {
                        int iRound2 = Math.round((f10 / numerator) * denominator);
                        i11 = (height - iRound2) / 2;
                        i10 = iRound2;
                        iRound = width;
                        i7 = 0;
                    } else {
                        iRound = Math.round((f11 / denominator) * numerator);
                        i7 = (width - iRound) / 2;
                        i10 = height;
                        i11 = 0;
                    }
                    rect2 = new Rect(i7, i11, iRound + i7, i10 + i11);
                }
                Objects.requireNonNull(rect2);
                rect = rect2;
            }
        } else {
            rect = rect3;
        }
        Matrix matrix = this.f2082j;
        int iG2 = g(cameraInternalB, false);
        C0982h0 c0982h0 = (C0982h0) this.f2078f;
        C0971c c0971c = C0982h0.f14077o;
        if (c0982h0.containsOption(c0971c)) {
            iIntValue = ((Integer) c0982h0.retrieveOption(c0971c)).intValue();
        } else {
            int i13 = this.f1941o;
            if (i13 == 0) {
                iIntValue = 100;
            } else {
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException(androidx.camera.camera2.internal.F.c(i13, "CaptureMode ", " is invalid"));
                }
                iIntValue = 95;
            }
        }
        int i14 = iIntValue;
        List listUnmodifiableList = Collections.unmodifiableList(this.f1946u.f13842e);
        p118hf.a.g((imageCapture$OnImageSavedCallback == null) == (dVar == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        p118hf.a.g((imageCapture$OnImageSavedCallback == null) ^ (cVar == null), "One and only one on-disk or in-memory callback should be present.");
        androidx.camera.core.imagecapture.h hVar = new androidx.camera.core.imagecapture.h(executor, cVar, imageCapture$OnImageSavedCallback, dVar, rect, matrix, iG2, i14, this.f1941o, listUnmodifiableList);
        p140j8.f.b();
        xVar.f13821a.offer(hVar);
        xVar.b();
    }

    public final void K() {
        synchronized (this.f1942p) {
            try {
                if (this.f1942p.get() != null) {
                    return;
                }
                c().setFlashMode(F());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E.n0
    public final UseCaseConfig e(boolean z3, UseCaseConfigFactory useCaseConfigFactory) {
        f1940z.getClass();
        C0982h0 c0982h0 = M.f1936a;
        Config config = useCaseConfigFactory.getConfig(c0982h0.getCaptureType(), this.f1941o);
        if (z3) {
            config = Config.mergeConfigs(config, c0982h0);
        }
        if (config == null) {
            return null;
        }
        return new C0982h0(C1000q0.a(((L) k(config)).f1935a));
    }

    @Override // E.n0
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // E.n0
    public final UseCaseConfig.Builder k(Config config) {
        return new L(C0992m0.c(config));
    }

    @Override // E.n0
    public final void q() {
        p118hf.a.j(b(), "Attached camera cannot be null");
        if (F() == 3) {
            CameraInternal cameraInternalB = b();
            if ((cameraInternalB != null ? cameraInternalB.getCameraInfo().getLensFacing() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // E.n0
    public final void r() {
        p140j8.f.G("ImageCapture");
        K();
        c().setScreenFlash(this.t);
    }

    @Override // E.n0
    public final UseCaseConfig s(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        boolean z3;
        if (cameraInfoInternal.getCameraQuirks().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            MutableConfig mutableConfig = builder.getMutableConfig();
            C0971c c0971c = C0982h0.f14075i;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(mutableConfig.retrieveOption(c0971c, bool2))) {
                p140j8.f.G("ImageCapture");
            } else {
                p140j8.f.G("ImageCapture");
                builder.getMutableConfig().insertOption(c0971c, bool2);
            }
        }
        MutableConfig mutableConfig2 = builder.getMutableConfig();
        Boolean bool3 = Boolean.TRUE;
        C0971c c0971c2 = C0982h0.f14075i;
        Boolean bool4 = Boolean.FALSE;
        boolean z8 = true;
        if (bool3.equals(mutableConfig2.retrieveOption(c0971c2, bool4))) {
            if (b() == null || b().getExtendedConfig().getSessionProcessor(null) == null) {
                z3 = true;
            } else {
                p140j8.f.G("ImageCapture");
                z3 = false;
            }
            Integer num = (Integer) mutableConfig2.retrieveOption(C0982h0.f14072e, null);
            if (num != null && num.intValue() != 256) {
                p140j8.f.G("ImageCapture");
                z3 = false;
            }
            if (!z3) {
                p140j8.f.G("ImageCapture");
                mutableConfig2.insertOption(c0971c2, bool4);
            }
        } else {
            z3 = false;
        }
        Integer num2 = (Integer) builder.getMutableConfig().retrieveOption(C0982h0.f14072e, null);
        if (num2 != null) {
            if (b() != null && b().getExtendedConfig().getSessionProcessor(null) != null && num2.intValue() != 256) {
                z8 = false;
            }
            p118hf.a.g(z8, "Cannot set non-JPEG buffer format with Extensions enabled.");
            builder.getMutableConfig().insertOption(ImageInputConfig.f13897r, Integer.valueOf(z3 ? 35 : num2.intValue()));
        } else if (Objects.equals(builder.getMutableConfig().retrieveOption(C0982h0.f14073f, null), 1)) {
            builder.getMutableConfig().insertOption(ImageInputConfig.f13897r, 4101);
            builder.getMutableConfig().insertOption(ImageInputConfig.f13898s, C0216v.f2121c);
        } else if (z3) {
            builder.getMutableConfig().insertOption(ImageInputConfig.f13897r, 35);
        } else {
            List list = (List) builder.getMutableConfig().retrieveOption(ImageOutputConfig.f13902G, null);
            if (list == null || G(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, list)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.f13897r, Integer.valueOf(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER));
            } else if (G(35, list)) {
                builder.getMutableConfig().insertOption(ImageInputConfig.f13897r, 35);
            }
        }
        return builder.getUseCaseConfig();
    }

    public final String toString() {
        return "ImageCapture:".concat(f());
    }

    @Override // E.n0
    public final void u() {
        androidx.camera.core.internal.i iVar = this.t;
        iVar.b();
        iVar.a();
        androidx.camera.core.imagecapture.x xVar = this.f1948w;
        if (xVar != null) {
            xVar.a();
        }
    }

    @Override // E.n0
    public final C0993n v(androidx.camera.camera2.impl.b bVar) {
        this.f1946u.b(bVar);
        Object[] objArr = {this.f1946u.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        C0991m c0991mA = this.f2079g.a();
        c0991mA.f14105d = bVar;
        return c0991mA.a();
    }

    @Override // E.n0
    public final C0993n w(C0993n c0993n, C0993n c0993n2) {
        C0 c0E = E(d(), (C0982h0) this.f2078f, c0993n);
        this.f1946u = c0E;
        Object[] objArr = {c0E.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        n();
        return c0993n;
    }

    @Override // E.n0
    public final void x() {
        androidx.camera.core.internal.i iVar = this.t;
        iVar.b();
        iVar.a();
        androidx.camera.core.imagecapture.x xVar = this.f1948w;
        if (xVar != null) {
            xVar.a();
        }
        D(false);
        c().setScreenFlash(null);
    }
}
