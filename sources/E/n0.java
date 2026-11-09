package E;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.UseCase$StateChangeCallback;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0993n;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.H0;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UseCaseConfig f2076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public UseCaseConfig f2077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public UseCaseConfig f2078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0993n f2079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UseCaseConfig f2080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f2081i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CameraInternal f2083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CameraInternal f2084l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f2073a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2074b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2075c = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Matrix f2082j = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public H0 f2085m = H0.a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public H0 f2086n = H0.a();

    public n0(UseCaseConfig useCaseConfig) {
        this.f2077e = useCaseConfig;
        this.f2078f = useCaseConfig;
    }

    public void A(Rect rect) {
        this.f2081i = rect;
    }

    public final void B(CameraInternal cameraInternal) {
        x();
        synchronized (this.f2074b) {
            try {
                CameraInternal cameraInternal2 = this.f2083k;
                if (cameraInternal == cameraInternal2) {
                    this.f2073a.remove(cameraInternal2);
                    this.f2083k = null;
                }
                CameraInternal cameraInternal3 = this.f2084l;
                if (cameraInternal == cameraInternal3) {
                    this.f2073a.remove(cameraInternal3);
                    this.f2084l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f2079g = null;
        this.f2081i = null;
        this.f2078f = this.f2077e;
        this.f2076d = null;
        this.f2080h = null;
    }

    public final void C(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f2085m = (H0) list.get(0);
        if (list.size() > 1) {
            this.f2086n = (H0) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (AbstractC0970b0 abstractC0970b0 : ((H0) it.next()).b()) {
                if (abstractC0970b0.f14030j == null) {
                    abstractC0970b0.f14030j = getClass();
                }
            }
        }
    }

    public final void a(CameraInternal cameraInternal, CameraInternal cameraInternal2, UseCaseConfig useCaseConfig, UseCaseConfig useCaseConfig2) {
        synchronized (this.f2074b) {
            this.f2083k = cameraInternal;
            this.f2084l = cameraInternal2;
            this.f2073a.add(cameraInternal);
            if (cameraInternal2 != null) {
                this.f2073a.add(cameraInternal2);
            }
        }
        this.f2076d = useCaseConfig;
        this.f2080h = useCaseConfig2;
        this.f2078f = m(cameraInternal.getCameraInfoInternal(), this.f2076d, this.f2080h);
        q();
    }

    public final CameraInternal b() {
        CameraInternal cameraInternal;
        synchronized (this.f2074b) {
            cameraInternal = this.f2083k;
        }
        return cameraInternal;
    }

    public final CameraControlInternal c() {
        synchronized (this.f2074b) {
            try {
                CameraInternal cameraInternal = this.f2083k;
                if (cameraInternal == null) {
                    return CameraControlInternal.f13853a;
                }
                return cameraInternal.getCameraControlInternal();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String d() {
        CameraInternal cameraInternalB = b();
        p118hf.a.j(cameraInternalB, "No camera attached to use case: " + this);
        return cameraInternalB.getCameraInfoInternal().getCameraId();
    }

    public abstract UseCaseConfig e(boolean z3, UseCaseConfigFactory useCaseConfigFactory);

    public final String f() {
        String targetName = this.f2078f.getTargetName("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(targetName);
        return targetName;
    }

    public final int g(CameraInternal cameraInternal, boolean z3) {
        int sensorRotationDegrees = cameraInternal.getCameraInfoInternal().getSensorRotationDegrees(j());
        return (cameraInternal.getHasTransform() || !z3) ? sensorRotationDegrees : androidx.camera.core.impl.utils.o.h(-sensorRotationDegrees);
    }

    public final CameraInternal h() {
        CameraInternal cameraInternal;
        synchronized (this.f2074b) {
            cameraInternal = this.f2084l;
        }
        return cameraInternal;
    }

    public Set i() {
        return Collections.EMPTY_SET;
    }

    public final int j() {
        return ((ImageOutputConfig) this.f2078f).getTargetRotation(0);
    }

    public abstract UseCaseConfig.Builder k(Config config);

    public final boolean l(CameraInternal cameraInternal) {
        int mirrorMode = ((ImageOutputConfig) this.f2078f).getMirrorMode(-1);
        if (mirrorMode == -1 || mirrorMode == 0) {
            return false;
        }
        if (mirrorMode == 1) {
            return true;
        }
        if (mirrorMode == 2) {
            return cameraInternal.isFrontFacing();
        }
        throw new AssertionError(C0.G.m(mirrorMode, "Unknown mirrorMode: "));
    }

    public final UseCaseConfig m(CameraInfoInternal cameraInfoInternal, UseCaseConfig useCaseConfig, UseCaseConfig useCaseConfig2) {
        C0992m0 c0992m0B;
        if (useCaseConfig2 != null) {
            c0992m0B = C0992m0.c(useCaseConfig2);
            c0992m0B.removeOption(TargetConfig.c0);
        } else {
            c0992m0B = C0992m0.b();
        }
        boolean zContainsOption = this.f2077e.containsOption(ImageOutputConfig.f13905u);
        TreeMap treeMap = c0992m0B.f14126a;
        if (zContainsOption || this.f2077e.containsOption(ImageOutputConfig.f13899D)) {
            C0971c c0971c = ImageOutputConfig.f13903I;
            if (treeMap.containsKey(c0971c)) {
                c0992m0B.removeOption(c0971c);
            }
        }
        UseCaseConfig useCaseConfig3 = this.f2077e;
        C0971c c0971c2 = ImageOutputConfig.f13903I;
        if (useCaseConfig3.containsOption(c0971c2)) {
            C0971c c0971c3 = ImageOutputConfig.f13901F;
            if (treeMap.containsKey(c0971c3) && ((I.b) this.f2077e.retrieveOption(c0971c2)).f3955b != null) {
                c0992m0B.removeOption(c0971c3);
            }
        }
        Iterator<androidx.camera.core.impl.V> it = this.f2077e.listOptions().iterator();
        while (it.hasNext()) {
            Config.mergeOptionValue(c0992m0B, c0992m0B, this.f2077e, it.next());
        }
        if (useCaseConfig != null) {
            for (androidx.camera.core.impl.V v3 : useCaseConfig.listOptions()) {
                if (!((C0971c) v3).f14031a.equals(TargetConfig.c0.f14031a)) {
                    Config.mergeOptionValue(c0992m0B, c0992m0B, useCaseConfig, v3);
                }
            }
        }
        if (treeMap.containsKey(ImageOutputConfig.f13899D)) {
            C0971c c0971c4 = ImageOutputConfig.f13905u;
            if (treeMap.containsKey(c0971c4)) {
                c0992m0B.removeOption(c0971c4);
            }
        }
        C0971c c0971c5 = ImageOutputConfig.f13903I;
        if (treeMap.containsKey(c0971c5)) {
            ((I.b) c0992m0B.retrieveOption(c0971c5)).getClass();
        }
        return s(cameraInfoInternal, k(c0992m0B));
    }

    public final void n() {
        this.f2075c = 1;
        p();
    }

    public final void o() {
        Iterator it = this.f2073a.iterator();
        while (it.hasNext()) {
            ((UseCase$StateChangeCallback) it.next()).onUseCaseReset(this);
        }
    }

    public final void p() {
        int i7 = androidx.camera.camera2.internal.F.i(this.f2075c);
        HashSet hashSet = this.f2073a;
        if (i7 == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((UseCase$StateChangeCallback) it.next()).onUseCaseActive(this);
            }
        } else {
            if (i7 != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((UseCase$StateChangeCallback) it2.next()).onUseCaseInactive(this);
            }
        }
    }

    public abstract UseCaseConfig s(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder);

    public abstract C0993n v(androidx.camera.camera2.impl.b bVar);

    public abstract C0993n w(C0993n c0993n, C0993n c0993n2);

    public void y(Matrix matrix) {
        this.f2082j = new Matrix(matrix);
    }

    public final boolean z(int i7) {
        Size targetResolution;
        int targetRotation = ((ImageOutputConfig) this.f2078f).getTargetRotation(-1);
        if (targetRotation != -1 && targetRotation == i7) {
            return false;
        }
        UseCaseConfig.Builder builderK = k(this.f2077e);
        ImageOutputConfig imageOutputConfig = (ImageOutputConfig) builderK.getUseCaseConfig();
        int targetRotation2 = imageOutputConfig.getTargetRotation(-1);
        if (targetRotation2 == -1 || targetRotation2 != i7) {
            ((ImageOutputConfig.Builder) builderK).setTargetRotation(i7);
        }
        if (targetRotation2 != -1 && i7 != -1 && targetRotation2 != i7) {
            if (Math.abs(com.facebook.imagepipeline.nativecode.b.V(i7) - com.facebook.imagepipeline.nativecode.b.V(targetRotation2)) % 180 == 90 && (targetResolution = imageOutputConfig.getTargetResolution(null)) != null) {
                ((ImageOutputConfig.Builder) builderK).setTargetResolution(new Size(targetResolution.getHeight(), targetResolution.getWidth()));
            }
        }
        this.f2077e = builderK.getUseCaseConfig();
        CameraInternal cameraInternalB = b();
        if (cameraInternalB == null) {
            this.f2078f = this.f2077e;
            return true;
        }
        this.f2078f = m(cameraInternalB.getCameraInfoInternal(), this.f2076d, this.f2080h);
        return true;
    }

    public void q() {
    }

    public void r() {
    }

    public void t() {
    }

    public void u() {
    }

    public void x() {
    }
}
