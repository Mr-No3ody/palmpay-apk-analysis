package androidx.camera.video;

import E.AbstractC0198c;
import E.C0216v;
import E.C0220z;
import E.m0;
import E.n0;
import N8.J;
import N8.q0;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.appcompat.widget.m1;
import androidx.arch.core.util.Function;
import androidx.biometric.RunnableC0903g;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.C0;
import androidx.camera.core.impl.C0977f;
import androidx.camera.core.impl.C0985j;
import androidx.camera.core.impl.C0987k;
import androidx.camera.core.impl.C0991m;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class C extends n0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final A f14542B = new A();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final w f14543A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC0970b0 f14544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.camera.core.processing.m f14545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f14546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0 f14547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public androidx.concurrent.futures.m f14548s;
    public m0 t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public F f14549u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public top.zibin.luban.io.a f14550v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Rect f14551w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14552x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public B f14553y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public D0 f14554z;

    public C(androidx.camera.video.impl.a aVar) {
        super(aVar);
        this.f14546q = h.f14598c;
        this.f14547r = new C0();
        this.f14548s = null;
        this.f14549u = F.f14572c;
        this.f14543A = new w(this);
    }

    public static void D(HashSet hashSet, int i7, int i10, Size size, VideoEncoderInfo videoEncoderInfo) {
        if (i7 > size.getWidth() || i10 > size.getHeight()) {
            return;
        }
        try {
            hashSet.add(new Size(i7, ((Integer) videoEncoderInfo.getSupportedHeightsFor(i7).clamp(Integer.valueOf(i10))).intValue()));
        } catch (IllegalArgumentException unused) {
            p140j8.f.G("VideoCapture");
        }
        try {
            hashSet.add(new Size(((Integer) videoEncoderInfo.getSupportedWidthsFor(i10).clamp(Integer.valueOf(i7))).intValue(), i10));
        } catch (IllegalArgumentException unused2) {
            p140j8.f.G("VideoCapture");
        }
    }

    public static int E(boolean z3, int i7, int i10, Range range) {
        int i11 = i7 % i10;
        if (i11 != 0) {
            i7 = z3 ? i7 - i11 : i7 + (i10 - i11);
        }
        return ((Integer) range.clamp(Integer.valueOf(i7))).intValue();
    }

    public static VideoEncoderInfo M(Function function, androidx.camera.video.internal.d dVar, C1016e c1016e, Size size, C0216v c0216v, Range range) {
        androidx.camera.video.internal.config.a aVarB = androidx.camera.video.internal.config.b.b(c1016e, c0216v, dVar);
        P0 p3 = P0.f13943a;
        String str = aVarB.f14631a;
        j jVar = c1016e.f14590a;
        C0977f c0977f = aVarB.f14633c;
        VideoEncoderInfo videoEncoderInfo = (VideoEncoderInfo) function.apply((androidx.camera.video.internal.encoder.d) (c0977f != null ? new m1(str, p3, jVar, size, c0977f, c0216v, range) : new androidx.camera.video.internal.config.c(str, p3, jVar, size, c0216v, range)).get());
        Size size2 = null;
        if (videoEncoderInfo == null) {
            p140j8.f.G("VideoCapture");
            return null;
        }
        if (dVar != null) {
            C0977f c0977f2 = ((androidx.camera.video.internal.a) dVar).f14616f;
            size2 = new Size(c0977f2.f14052e, c0977f2.f14053f);
        }
        return androidx.camera.video.internal.workaround.b.a(videoEncoderInfo, size2);
    }

    @Override // E.n0
    public final void A(Rect rect) {
        this.f2081i = rect;
        N();
    }

    public final void F(C0 c0, h hVar, C0993n c0993n) {
        AbstractC0970b0 abstractC0970b0;
        boolean z3 = hVar.f14601a == -1;
        boolean z8 = hVar.f14602b == 1;
        if (z3 && z8) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        c0.f13838a.clear();
        c0.f13839b.f13955a.clear();
        C0216v c0216v = c0993n.f14109b;
        if (!z3 && (abstractC0970b0 = this.f14544o) != null) {
            if (z8) {
                c0.c(abstractC0970b0, c0216v, -1);
            } else {
                C0985j c0985jA = C0987k.a(abstractC0970b0);
                if (c0216v == null) {
                    throw new NullPointerException("Null dynamicRange");
                }
                c0985jA.f14090e = c0216v;
                c0.f13838a.add(c0985jA.a());
            }
        }
        androidx.concurrent.futures.m mVar = this.f14548s;
        if (mVar != null && mVar.cancel(false)) {
            p140j8.f.G("VideoCapture");
        }
        androidx.concurrent.futures.m mVarY = AbstractC0198c.y(new U8.a(13, this, c0));
        this.f14548s = mVarY;
        mVarY.addListener(new androidx.camera.core.impl.utils.futures.i(0, mVarY, new He.a(this, mVarY, z8)), org.chromium.support_lib_boundary.util.b.S());
    }

    public final void G() {
        p140j8.f.b();
        D0 d1 = this.f14554z;
        if (d1 != null) {
            d1.a();
            this.f14554z = null;
        }
        AbstractC0970b0 abstractC0970b0 = this.f14544o;
        if (abstractC0970b0 != null) {
            abstractC0970b0.a();
            this.f14544o = null;
        }
        top.zibin.luban.io.a aVar = this.f14550v;
        if (aVar != null) {
            aVar.release();
            this.f14550v = null;
        }
        androidx.camera.core.processing.m mVar = this.f14545p;
        if (mVar != null) {
            mVar.c();
            this.f14545p = null;
        }
        this.f14551w = null;
        this.t = null;
        this.f14546q = h.f14598c;
        this.f14552x = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0 H(androidx.camera.video.impl.a aVar, C0993n c0993n) {
        C1016e c1016e;
        VideoEncoderInfo videoEncoderInfo;
        int i7;
        String str;
        top.zibin.luban.io.a aVar2;
        p140j8.f.b();
        CameraInternal cameraInternalB = b();
        cameraInternalB.getClass();
        Size size = c0993n.f14108a;
        W8.o oVar = new W8.o(this, 23);
        Range range = c0993n.f14110c;
        if (Objects.equals(range, C0993n.f14107f)) {
            range = A.f14538b;
        }
        Range range2 = range;
        ListenableFuture<C1016e> listenableFutureFetchData = J().getMediaSpec().fetchData();
        if (listenableFutureFetchData.isDone()) {
            try {
                c1016e = listenableFutureFetchData.get();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            c1016e = null;
        }
        C1016e c1016e2 = c1016e;
        Objects.requireNonNull(c1016e2);
        VideoCapabilities mediaCapabilities = J().getMediaCapabilities(cameraInternalB.getCameraInfo());
        C0216v c0216v = c0993n.f14109b;
        androidx.camera.video.internal.d dVarFindNearestHigherSupportedEncoderProfilesFor = mediaCapabilities.findNearestHigherSupportedEncoderProfilesFor(size, c0216v);
        Function function = (Function) aVar.retrieveOption(androidx.camera.video.impl.a.f14608c);
        Objects.requireNonNull(function);
        VideoEncoderInfo videoEncoderInfoM = M(function, dVarFindNearestHigherSupportedEncoderProfilesFor, c1016e2, size, c0216v, range2);
        this.f14552x = I(cameraInternalB);
        Rect rect = this.f2081i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        if (videoEncoderInfoM == null || videoEncoderInfoM.isSizeSupportedAllowSwapping(rect.width(), rect.height())) {
            videoEncoderInfo = videoEncoderInfoM;
            i7 = 0;
            str = "VideoCapture";
        } else {
            String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", androidx.camera.core.impl.utils.o.f(rect), Integer.valueOf(videoEncoderInfoM.getWidthAlignment()), Integer.valueOf(videoEncoderInfoM.getHeightAlignment()), videoEncoderInfoM.getSupportedWidths(), videoEncoderInfoM.getSupportedHeights());
            p140j8.f.G("VideoCapture");
            VideoEncoderInfo yVar = (!(videoEncoderInfoM.getSupportedWidths().contains(Integer.valueOf(rect.width())) && videoEncoderInfoM.getSupportedHeights().contains(Integer.valueOf(rect.height()))) && videoEncoderInfoM.canSwapWidthHeight() && videoEncoderInfoM.getSupportedHeights().contains(Integer.valueOf(rect.width())) && videoEncoderInfoM.getSupportedWidths().contains(Integer.valueOf(rect.height()))) ? new androidx.camera.video.internal.encoder.y(videoEncoderInfoM) : videoEncoderInfoM;
            int widthAlignment = yVar.getWidthAlignment();
            int heightAlignment = yVar.getHeightAlignment();
            Range<Integer> supportedWidths = yVar.getSupportedWidths();
            Range<Integer> supportedHeights = yVar.getSupportedHeights();
            videoEncoderInfo = videoEncoderInfoM;
            str = "VideoCapture";
            int iE = E(true, rect.width(), widthAlignment, supportedWidths);
            int iE2 = E(false, rect.width(), widthAlignment, supportedWidths);
            int iE3 = E(true, rect.height(), heightAlignment, supportedHeights);
            int iE4 = E(false, rect.height(), heightAlignment, supportedHeights);
            HashSet hashSet = new HashSet();
            D(hashSet, iE, iE3, size, yVar);
            D(hashSet, iE, iE4, size, yVar);
            D(hashSet, iE2, iE3, size, yVar);
            D(hashSet, iE2, iE4, size, yVar);
            if (hashSet.isEmpty()) {
                p140j8.f.G(str);
            } else {
                ArrayList arrayList = new ArrayList(hashSet);
                arrayList.toString();
                p140j8.f.G(str);
                Collections.sort(arrayList, new androidx.camera.core.internal.compat.workaround.b(rect, 1));
                arrayList.toString();
                p140j8.f.G(str);
                Size size2 = (Size) arrayList.get(0);
                int width = size2.getWidth();
                int height = size2.getHeight();
                if (width == rect.width() && height == rect.height()) {
                    p140j8.f.G(str);
                } else {
                    p118hf.a.k(width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight(), null);
                    Rect rect2 = new Rect(rect);
                    if (width != rect.width()) {
                        int iMax = Math.max(0, rect.centerX() - (width / 2));
                        rect2.left = iMax;
                        int i10 = iMax + width;
                        rect2.right = i10;
                        if (i10 > size.getWidth()) {
                            int width2 = size.getWidth();
                            rect2.right = width2;
                            rect2.left = width2 - width;
                        }
                    }
                    if (height != rect.height()) {
                        i7 = 0;
                        int iMax2 = Math.max(0, rect.centerY() - (height / 2));
                        rect2.top = iMax2;
                        int i11 = iMax2 + height;
                        rect2.bottom = i11;
                        if (i11 > size.getHeight()) {
                            int height2 = size.getHeight();
                            rect2.bottom = height2;
                            rect2.top = height2 - height;
                        }
                    } else {
                        i7 = 0;
                    }
                    androidx.camera.core.impl.utils.o.f(rect);
                    androidx.camera.core.impl.utils.o.f(rect2);
                    p140j8.f.G(str);
                    rect = rect2;
                }
            }
            i7 = 0;
        }
        this.f14546q.getClass();
        this.f14551w = rect;
        this.f14546q.getClass();
        this.f14546q.getClass();
        Rect rect3 = this.f14551w;
        int i12 = this.f14552x;
        boolean zK = K(cameraInternalB, aVar, rect3, size);
        if (((SizeCannotEncodeVideoQuirk) androidx.camera.video.internal.compat.quirk.a.f14630a.b(SizeCannotEncodeVideoQuirk.class)) != null) {
            if (!zK) {
                i12 = i7;
            }
            Size sizeG = androidx.camera.core.impl.utils.o.g(androidx.camera.core.impl.utils.o.e(rect3), i12);
            if ((("motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL)) ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET).contains(sizeG)) {
                int heightAlignment2 = videoEncoderInfo != null ? videoEncoderInfo.getHeightAlignment() / 2 : 8;
                Rect rect4 = new Rect(rect3);
                if (rect3.width() == sizeG.getHeight()) {
                    rect4.left += heightAlignment2;
                    rect4.right -= heightAlignment2;
                } else {
                    rect4.top += heightAlignment2;
                    rect4.bottom -= heightAlignment2;
                }
                rect3 = rect4;
            }
        }
        this.f14551w = rect3;
        if (K(cameraInternalB, aVar, rect3, size)) {
            p140j8.f.G(str);
            CameraInternal cameraInternalB2 = b();
            Objects.requireNonNull(cameraInternalB2);
            aVar2 = new top.zibin.luban.io.a(cameraInternalB2, new androidx.camera.core.processing.f(c0216v));
        } else {
            aVar2 = null;
        }
        this.f14550v = aVar2;
        P0 timebase = (aVar2 == null && cameraInternalB.getHasTransform()) ? P0.f13943a : cameraInternalB.getCameraInfoInternal().getTimebase();
        Objects.toString(cameraInternalB.getCameraInfoInternal().getTimebase());
        Objects.toString(timebase);
        p140j8.f.G(str);
        C0991m c0991mA = c0993n.a();
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        c0991mA.f14102a = size;
        if (range2 == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        c0991mA.f14104c = range2;
        C0993n c0993nA = c0991mA.a();
        p118hf.a.k(this.f14545p == null ? 1 : i7, null);
        androidx.camera.core.processing.m mVar = new androidx.camera.core.processing.m(2, 34, c0993nA, this.f2082j, cameraInternalB.getHasTransform(), this.f14551w, this.f14552x, ((ImageOutputConfig) this.f2078f).getAppTargetRotation(-1), (cameraInternalB.getHasTransform() && l(cameraInternalB)) ? 1 : i7);
        this.f14545p = mVar;
        mVar.a(oVar);
        if (this.f14550v != null) {
            androidx.camera.core.processing.m mVar2 = this.f14545p;
            int i13 = mVar2.f14431f;
            int i14 = mVar2.f14434i;
            Rect rect5 = mVar2.f14429d;
            H.c cVar = new H.c(UUID.randomUUID(), i13, mVar2.f14426a, rect5, androidx.camera.core.impl.utils.o.g(androidx.camera.core.impl.utils.o.e(rect5), i14), mVar2.f14434i, mVar2.f14430e);
            androidx.camera.core.processing.m mVar3 = (androidx.camera.core.processing.m) this.f14550v.transform(new androidx.camera.core.processing.c(this.f14545p, Collections.singletonList(cVar))).get(cVar);
            Objects.requireNonNull(mVar3);
            mVar3.a(new Da.a(this, mVar3, cameraInternalB, aVar, timebase, 3));
            this.t = mVar3.d(cameraInternalB, true);
            androidx.camera.core.processing.m mVar4 = this.f14545p;
            mVar4.getClass();
            p140j8.f.b();
            mVar4.b();
            p118hf.a.k(!mVar4.f14435j, "Consumer can only be linked once.");
            mVar4.f14435j = true;
            androidx.camera.core.processing.l lVar = mVar4.f14437l;
            this.f14544o = lVar;
            androidx.camera.core.impl.utils.futures.j.e(lVar.f14025e).addListener(new RunnableC0903g(24, this, lVar), org.chromium.support_lib_boundary.util.b.S());
        } else {
            m0 m0VarD = this.f14545p.d(cameraInternalB, true);
            this.t = m0VarD;
            this.f14544o = m0VarD.f2066l;
        }
        VideoOutput videoOutput = (VideoOutput) aVar.retrieveOption(androidx.camera.video.impl.a.f14607b);
        Objects.requireNonNull(videoOutput);
        videoOutput.onSurfaceRequested(this.t, timebase);
        N();
        this.f14544o.f14030j = MediaCodec.class;
        C0 c0E = C0.e(aVar, c0993n.f14108a);
        Range range3 = c0993n.f14110c;
        S s3 = c0E.f13839b;
        s3.getClass();
        s3.f13956b.insertOption(T.f13965k, range3);
        int videoStabilizationMode = aVar.getVideoStabilizationMode();
        if (videoStabilizationMode != 0) {
            S s8 = c0E.f13839b;
            s8.getClass();
            if (videoStabilizationMode != 0) {
                s8.f13956b.insertOption(UseCaseConfig.f13992a0, Integer.valueOf(videoStabilizationMode));
            }
        }
        D0 d1 = this.f14554z;
        if (d1 != null) {
            d1.a();
        }
        D0 d2 = new D0(new C0220z(this, 4));
        this.f14554z = d2;
        c0E.f13843f = d2;
        androidx.camera.camera2.impl.b bVar = c0993n.f14111d;
        if (bVar != null) {
            c0E.f13839b.c(bVar);
        }
        return c0E;
    }

    public final int I(CameraInternal cameraInternal) {
        int iG = g(cameraInternal, l(cameraInternal));
        this.f14546q.getClass();
        return iG;
    }

    public final VideoOutput J() {
        VideoOutput videoOutput = (VideoOutput) ((androidx.camera.video.impl.a) this.f2078f).retrieveOption(androidx.camera.video.impl.a.f14607b);
        Objects.requireNonNull(videoOutput);
        return videoOutput;
    }

    public final boolean K(CameraInternal cameraInternal, androidx.camera.video.impl.a aVar, Rect rect, Size size) {
        if (cameraInternal.getHasTransform()) {
            Boolean bool = (Boolean) aVar.retrieveOption(androidx.camera.video.impl.a.f14609d, Boolean.FALSE);
            Objects.requireNonNull(bool);
            if (bool.booleanValue()) {
                return true;
            }
        }
        if ((cameraInternal.getHasTransform() && (SurfaceProcessingQuirk.workaroundBySurfaceProcessing(androidx.camera.video.internal.compat.quirk.a.f14630a) || SurfaceProcessingQuirk.workaroundBySurfaceProcessing(cameraInternal.getCameraInfoInternal().getCameraQuirks()))) || size.getWidth() != rect.width() || size.getHeight() != rect.height()) {
            return true;
        }
        if (cameraInternal.getHasTransform() && l(cameraInternal)) {
            return true;
        }
        this.f14546q.getClass();
        return false;
    }

    public final void L() {
        if (b() == null) {
            return;
        }
        G();
        androidx.camera.video.impl.a aVar = (androidx.camera.video.impl.a) this.f2078f;
        C0993n c0993n = this.f2079g;
        c0993n.getClass();
        C0 c0H = H(aVar, c0993n);
        this.f14547r = c0H;
        F(c0H, this.f14546q, this.f2079g);
        Object[] objArr = {this.f14547r.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        o();
    }

    public final void N() {
        CameraInternal cameraInternalB = b();
        androidx.camera.core.processing.m mVar = this.f14545p;
        if (cameraInternalB == null || mVar == null) {
            return;
        }
        int I7 = I(cameraInternalB);
        this.f14552x = I7;
        p140j8.f.B(new J(mVar, I7, ((ImageOutputConfig) this.f2078f).getAppTargetRotation(-1), 1));
    }

    @Override // E.n0
    public final UseCaseConfig e(boolean z3, UseCaseConfigFactory useCaseConfigFactory) {
        f14542B.getClass();
        androidx.camera.video.impl.a aVar = A.f14537a;
        Config config = useCaseConfigFactory.getConfig(aVar.getCaptureType(), 1);
        if (z3) {
            config = Config.mergeConfigs(config, aVar);
        }
        if (config == null) {
            return null;
        }
        return new androidx.camera.video.impl.a(C1000q0.a(((y) k(config)).f14871a));
    }

    @Override // E.n0
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    @Override // E.n0
    public final UseCaseConfig.Builder k(Config config) {
        return new y(C0992m0.c(config));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c3  */
    @Override // E.n0
    public final UseCaseConfig s(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        C1016e c1016e;
        C1016e c1016e2;
        p1.d dVar;
        ArrayList arrayList;
        androidx.camera.video.internal.d dVarFindNearestHigherSupportedEncoderProfilesFor;
        C0216v c0216v;
        C1016e c1016e3;
        VideoEncoderInfo videoEncoderInfoM;
        androidx.camera.video.impl.a aVar;
        HashMap map;
        int i7;
        ListenableFuture<C1016e> listenableFutureFetchData = J().getMediaSpec().fetchData();
        if (listenableFutureFetchData.isDone()) {
            try {
                c1016e = listenableFutureFetchData.get();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        } else {
            c1016e = null;
        }
        C1016e c1016e4 = c1016e;
        p118hf.a.g(c1016e4 != null, "Unable to update target resolution by null MediaSpec.");
        C0216v dynamicRange = this.f2078f.hasDynamicRange() ? this.f2078f.getDynamicRange() : A.f14539c;
        VideoCapabilities mediaCapabilities = J().getMediaCapabilities(cameraInfoInternal);
        List<l> supportedQualities = mediaCapabilities.getSupportedQualities(dynamicRange);
        if (supportedQualities.isEmpty()) {
            p140j8.f.G("VideoCapture");
        } else {
            j jVar = c1016e4.f14590a;
            p1.d dVar2 = jVar.f14785a;
            dVar2.getClass();
            if (supportedQualities.isEmpty()) {
                p140j8.f.G("QualitySelector");
                arrayList = new ArrayList();
                c1016e2 = c1016e4;
                dVar = dVar2;
            } else {
                supportedQualities.toString();
                p140j8.f.G("QualitySelector");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (l lVar : (List) dVar2.f41178b) {
                    if (lVar == l.f14798f) {
                        linkedHashSet.addAll(supportedQualities);
                        break;
                    }
                    if (lVar == l.f14797e) {
                        ArrayList arrayList2 = new ArrayList(supportedQualities);
                        Collections.reverse(arrayList2);
                        linkedHashSet.addAll(arrayList2);
                        break;
                    }
                    if (supportedQualities.contains(lVar)) {
                        linkedHashSet.add(lVar);
                    } else {
                        Objects.toString(lVar);
                        p140j8.f.G("QualitySelector");
                    }
                }
                if (supportedQualities.isEmpty() || linkedHashSet.containsAll(supportedQualities)) {
                    c1016e2 = c1016e4;
                    dVar = dVar2;
                } else {
                    C1015d c1015d = (C1015d) dVar2.f41179c;
                    Objects.toString(c1015d);
                    p140j8.f.G("QualitySelector");
                    if (c1015d == C1015d.f14587c) {
                        c1016e2 = c1016e4;
                        dVar = dVar2;
                    } else {
                        p118hf.a.k(Objects.nonNull(c1015d), "Currently only support type RuleStrategy");
                        ArrayList arrayList3 = new ArrayList(l.f14801i);
                        Object obj = c1015d.f14588a;
                        if (obj == l.f14798f) {
                            obj = (l) arrayList3.get(0);
                        } else if (obj == l.f14797e) {
                            obj = (l) q0.i(1, arrayList3);
                        }
                        int iIndexOf = arrayList3.indexOf(obj);
                        p118hf.a.k(iIndexOf != -1, null);
                        ArrayList arrayList4 = new ArrayList();
                        int i10 = iIndexOf - 1;
                        while (i10 >= 0) {
                            int i11 = i10;
                            l lVar2 = (l) arrayList3.get(i10);
                            if (supportedQualities.contains(lVar2)) {
                                arrayList4.add(lVar2);
                            }
                            i10 = i11 - 1;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        c1016e2 = c1016e4;
                        dVar = dVar2;
                        for (int i12 = iIndexOf + 1; i12 < arrayList3.size(); i12++) {
                            l lVar3 = (l) arrayList3.get(i12);
                            if (supportedQualities.contains(lVar3)) {
                                arrayList5.add(lVar3);
                            }
                        }
                        arrayList3.toString();
                        Objects.toString(obj);
                        arrayList4.toString();
                        arrayList5.toString();
                        p140j8.f.G("QualitySelector");
                        int i13 = c1015d.f14589b;
                        if (i13 != 0) {
                            if (i13 != 1) {
                                throw new AssertionError("Unhandled fallback strategy: " + c1015d);
                            }
                            linkedHashSet.addAll(arrayList4);
                            linkedHashSet.addAll(arrayList5);
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            arrayList.toString();
            dVar.toString();
            p140j8.f.G("VideoCapture");
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Unable to find supported quality by QualitySelector");
            }
            HashMap map2 = new HashMap();
            for (l lVar4 : mediaCapabilities.getSupportedQualities(dynamicRange)) {
                androidx.camera.video.internal.d profiles = mediaCapabilities.getProfiles(lVar4, dynamicRange);
                Objects.requireNonNull(profiles);
                C0977f c0977f = ((androidx.camera.video.internal.a) profiles).f14616f;
                map2.put(lVar4, new Size(c0977f.f14052e, c0977f.f14053f));
            }
            n nVar = new n(cameraInfoInternal.getSupportedResolutions(this.f2078f.getInputFormat()), map2);
            ArrayList arrayList6 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List list = (List) nVar.f14805a.get(new C1017f((l) it.next(), jVar.f14788d));
                arrayList6.addAll(list != null ? new ArrayList(list) : new ArrayList(0));
            }
            androidx.camera.video.impl.a aVar2 = (androidx.camera.video.impl.a) builder.getUseCaseConfig();
            if (!arrayList6.isEmpty()) {
                Iterator it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    Size size = (Size) it2.next();
                    if (!map2.containsValue(size) && (dVarFindNearestHigherSupportedEncoderProfilesFor = mediaCapabilities.findNearestHigherSupportedEncoderProfilesFor(size, dynamicRange)) != null) {
                        Function function = (Function) aVar2.retrieveOption(androidx.camera.video.impl.a.f14608c);
                        Objects.requireNonNull(function);
                        Range<Integer> targetFrameRate = aVar2.getTargetFrameRate(A.f14538b);
                        Objects.requireNonNull(targetFrameRate);
                        if (dynamicRange.b()) {
                            c1016e3 = c1016e2;
                            videoEncoderInfoM = M(function, dVarFindNearestHigherSupportedEncoderProfilesFor, c1016e3, size, dynamicRange, targetFrameRate);
                            c0216v = dynamicRange;
                        } else {
                            c0216v = dynamicRange;
                            c1016e3 = c1016e2;
                            int i14 = Integer.MIN_VALUE;
                            VideoEncoderInfo videoEncoderInfo = null;
                            for (C0977f c0977f2 : ((androidx.camera.video.internal.a) dVarFindNearestHigherSupportedEncoderProfilesFor).f14614d) {
                                if (androidx.camera.video.internal.utils.b.a(c0977f2, c0216v)) {
                                    int i15 = i14;
                                    aVar = aVar2;
                                    HashMap map3 = androidx.camera.video.internal.utils.b.f14772d;
                                    map = map2;
                                    int i16 = c0977f2.f14057j;
                                    p118hf.a.f(map3.containsKey(Integer.valueOf(i16)));
                                    Integer num = (Integer) map3.get(Integer.valueOf(i16));
                                    Objects.requireNonNull(num);
                                    int iIntValue = num.intValue();
                                    HashMap map4 = androidx.camera.video.internal.utils.b.f14771c;
                                    int i17 = c0977f2.f14055h;
                                    p118hf.a.f(map4.containsKey(Integer.valueOf(i17)));
                                    Integer num2 = (Integer) map4.get(Integer.valueOf(i17));
                                    Objects.requireNonNull(num2);
                                    C0216v c0216v2 = new C0216v(iIntValue, num2.intValue());
                                    i7 = i15;
                                    VideoEncoderInfo videoEncoderInfoM2 = M(function, dVarFindNearestHigherSupportedEncoderProfilesFor, c1016e3, size, c0216v2, targetFrameRate);
                                    if (videoEncoderInfoM2 == null) {
                                        aVar2 = aVar;
                                        i14 = i7;
                                        map2 = map;
                                    } else {
                                        int iIntValue2 = ((Integer) videoEncoderInfoM2.getSupportedWidths().getUpper()).intValue();
                                        int iIntValue3 = ((Integer) videoEncoderInfoM2.getSupportedHeights().getUpper()).intValue();
                                        Size size2 = androidx.camera.core.internal.utils.d.f14361a;
                                        int i18 = iIntValue2 * iIntValue3;
                                        if (i18 > i7) {
                                            videoEncoderInfo = videoEncoderInfoM2;
                                            i14 = i18;
                                        }
                                        aVar2 = aVar;
                                        map2 = map;
                                    }
                                } else {
                                    aVar = aVar2;
                                    map = map2;
                                    i7 = i14;
                                }
                                i14 = i7;
                                aVar2 = aVar;
                                map2 = map;
                            }
                            videoEncoderInfoM = videoEncoderInfo;
                        }
                        androidx.camera.video.impl.a aVar3 = aVar2;
                        HashMap map5 = map2;
                        if (videoEncoderInfoM != null && !videoEncoderInfoM.isSizeSupportedAllowSwapping(size.getWidth(), size.getHeight())) {
                            it2.remove();
                        }
                        aVar2 = aVar3;
                        c1016e2 = c1016e3;
                        dynamicRange = c0216v;
                        map2 = map5;
                    }
                }
            }
            arrayList6.toString();
            p140j8.f.G("VideoCapture");
            builder.getMutableConfig().insertOption(ImageOutputConfig.f13904J, arrayList6);
        }
        return builder.getUseCaseConfig();
    }

    @Override // E.n0
    public final void t() {
        d();
        p140j8.f.G("VideoCapture");
        C0993n c0993n = this.f2079g;
        if (c0993n == null || this.t != null) {
            return;
        }
        Observable<h> streamInfo = J().getStreamInfo();
        h hVar = h.f14598c;
        ListenableFuture<h> listenableFutureFetchData = streamInfo.fetchData();
        if (listenableFutureFetchData.isDone()) {
            try {
                hVar = listenableFutureFetchData.get();
            } catch (InterruptedException | ExecutionException e10) {
                throw new IllegalStateException(e10);
            }
        }
        this.f14546q = hVar;
        C0 c0H = H((androidx.camera.video.impl.a) this.f2078f, c0993n);
        this.f14547r = c0H;
        F(c0H, this.f14546q, c0993n);
        Object[] objArr = {this.f14547r.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        n();
        J().getStreamInfo().addObserver(org.chromium.support_lib_boundary.util.b.S(), this.f14543A);
        B b7 = this.f14553y;
        if (b7 != null) {
            p118hf.a.k(p140j8.f.q(), "SourceStreamRequirementObserver can be closed from main thread only");
            p140j8.f.G("VideoCapture");
            CameraControlInternal cameraControlInternal = b7.f14540a;
            if (cameraControlInternal == null) {
                p140j8.f.G("VideoCapture");
            } else {
                if (b7.f14541b) {
                    b7.f14541b = false;
                    cameraControlInternal.decrementVideoUsage();
                }
                b7.f14540a = null;
            }
        }
        CameraControlInternal cameraControlInternalC = c();
        B b10 = new B();
        b10.f14541b = false;
        b10.f14540a = cameraControlInternalC;
        this.f14553y = b10;
        J().isSourceStreamRequired().addObserver(org.chromium.support_lib_boundary.util.b.S(), this.f14553y);
        F f10 = F.f14571b;
        if (f10 != this.f14549u) {
            this.f14549u = f10;
            J().onSourceStateChanged(f10);
        }
    }

    public final String toString() {
        return "VideoCapture:".concat(f());
    }

    @Override // E.n0
    public final void u() {
        p140j8.f.G("VideoCapture");
        p118hf.a.k(p140j8.f.q(), "VideoCapture can only be detached on the main thread.");
        if (this.f14553y != null) {
            J().isSourceStreamRequired().removeObserver(this.f14553y);
            B b7 = this.f14553y;
            b7.getClass();
            p118hf.a.k(p140j8.f.q(), "SourceStreamRequirementObserver can be closed from main thread only");
            p140j8.f.G("VideoCapture");
            CameraControlInternal cameraControlInternal = b7.f14540a;
            if (cameraControlInternal == null) {
                p140j8.f.G("VideoCapture");
            } else {
                if (b7.f14541b) {
                    b7.f14541b = false;
                    cameraControlInternal.decrementVideoUsage();
                }
                b7.f14540a = null;
            }
            this.f14553y = null;
        }
        F f10 = F.f14572c;
        if (f10 != this.f14549u) {
            this.f14549u = f10;
            J().onSourceStateChanged(f10);
        }
        J().getStreamInfo().removeObserver(this.f14543A);
        androidx.concurrent.futures.m mVar = this.f14548s;
        if (mVar != null && mVar.cancel(false)) {
            p140j8.f.G("VideoCapture");
        }
        G();
    }

    @Override // E.n0
    public final C0993n v(androidx.camera.camera2.impl.b bVar) {
        this.f14547r.b(bVar);
        Object[] objArr = {this.f14547r.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        C0993n c0993n = this.f2079g;
        Objects.requireNonNull(c0993n);
        C0991m c0991mA = c0993n.a();
        c0991mA.f14105d = bVar;
        return c0991mA.a();
    }

    @Override // E.n0
    public final C0993n w(C0993n c0993n, C0993n c0993n2) {
        Objects.toString(c0993n);
        p140j8.f.G("VideoCapture");
        List<Size> customOrderedResolutions = ((androidx.camera.video.impl.a) this.f2078f).getCustomOrderedResolutions(null);
        if (customOrderedResolutions != null && !customOrderedResolutions.contains(c0993n.f14108a)) {
            Objects.toString(c0993n.f14108a);
            customOrderedResolutions.toString();
            p140j8.f.G("VideoCapture");
        }
        return c0993n;
    }
}
