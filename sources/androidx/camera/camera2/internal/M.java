package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import E.C0199d;
import E.C0218x;
import Pa.C0505b;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import androidx.camera.core.ExposureState;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class M implements CameraInfoInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.l f13229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.d f13230c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0944o f13232e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final L f13235h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.camera.core.impl.y0 f13237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0931h0 f13238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.s f13239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashSet f13240m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13231d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public L f13233f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public L f13234g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f13236i = null;

    public M(androidx.camera.camera2.internal.compat.s sVar, String str) {
        str.getClass();
        this.f13228a = str;
        this.f13239l = sVar;
        androidx.camera.camera2.internal.compat.l lVarA = sVar.a(str);
        this.f13229b = lVarA;
        p1.d dVar = new p1.d(2, false);
        dVar.f41178b = this;
        this.f13230c = dVar;
        androidx.camera.core.impl.y0 y0VarG = Z4.e.g(lVarA);
        this.f13237j = y0VarG;
        this.f13238k = new C0931h0(str, y0VarG);
        this.f13235h = new L(new C0199d(5, null));
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void addSessionCaptureCallback(Executor executor, AbstractC0999q abstractC0999q) {
        synchronized (this.f13231d) {
            try {
                C0944o c0944o = this.f13232e;
                if (c0944o != null) {
                    c0944o.f13605c.execute(new G0(c0944o, 1, executor, abstractC0999q));
                } else {
                    if (this.f13236i == null) {
                        this.f13236i = new ArrayList();
                    }
                    this.f13236i.add(new Pair(abstractC0999q, executor));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(C0944o c0944o) {
        synchronized (this.f13231d) {
            try {
                this.f13232e = c0944o;
                L l5 = this.f13234g;
                if (l5 != null) {
                    l5.m((androidx.lifecycle.F) c0944o.f13611i.f13569e);
                }
                L l6 = this.f13233f;
                if (l6 != null) {
                    l6.m(this.f13232e.f13612j.f13506b);
                }
                ArrayList<Pair> arrayList = this.f13236i;
                if (arrayList != null) {
                    for (Pair pair : arrayList) {
                        C0944o c0944o2 = this.f13232e;
                        Executor executor = (Executor) pair.second;
                        AbstractC0999q abstractC0999q = (AbstractC0999q) pair.first;
                        c0944o2.getClass();
                        c0944o2.f13605c.execute(new G0(c0944o2, 1, executor, abstractC0999q));
                    }
                    this.f13236i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((Integer) this.f13229b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).getClass();
        p140j8.f.G("Camera2CameraInfo");
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Object getCameraCharacteristics() {
        return (CameraCharacteristics) this.f13229b.f13405b.f13411a;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final String getCameraId() {
        return this.f13228a;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final androidx.camera.core.impl.y0 getCameraQuirks() {
        return this.f13237j;
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.lifecycle.B getCameraState() {
        return this.f13235h;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final EncoderProfilesProvider getEncoderProfilesProvider() {
        return this.f13238k;
    }

    @Override // androidx.camera.core.CameraInfo
    public final ExposureState getExposureState() {
        synchronized (this.f13231d) {
            try {
                C0944o c0944o = this.f13232e;
                if (c0944o == null) {
                    return new C0505b(this.f13229b);
                }
                return (C0505b) c0944o.f13613k.f13568d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final String getImplementationType() {
        Integer num = (Integer) this.f13229b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // androidx.camera.core.CameraInfo
    public final float getIntrinsicZoomRatio() {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        androidx.camera.camera2.internal.compat.l lVar = this.f13229b;
        Integer num = (Integer) lVar.a(key);
        if (num == null) {
            return 1.0f;
        }
        try {
            float[] fArr = (float[]) lVar.a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            p118hf.a.j(fArr, "The focal lengths can not be empty.");
            return AbstractC0198c.v(this.f13239l, num.intValue()) / AbstractC0198c.s(fArr[0], AbstractC0198c.E(lVar));
        } catch (Exception e10) {
            p140j8.f.g("Camera2CameraInfo", "The camera is unable to provide necessary information to resolve its intrinsic zoom ratio with error: " + e10);
            return 1.0f;
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getLensFacing() {
        Integer num = (Integer) this.f13229b.a(CameraCharacteristics.LENS_FACING);
        p118hf.a.g(num != null, "Unable to get the lens facing of the camera.");
        return G8.a.u(num.intValue());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Object getPhysicalCameraCharacteristics(String str) {
        try {
            if (this.f13229b.f13405b.getPhysicalCameraIds().contains(str)) {
                return (CameraCharacteristics) this.f13239l.a(str).f13405b.f13411a;
            }
            return null;
        } catch (androidx.camera.camera2.internal.compat.a e10) {
            p140j8.f.h("Camera2CameraInfo", "Failed to get CameraCharacteristics for cameraId " + str, e10);
            return null;
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final Set getPhysicalCameraInfos() {
        if (this.f13240m == null) {
            this.f13240m = new HashSet();
            for (String str : this.f13229b.f13405b.getPhysicalCameraIds()) {
                try {
                    this.f13240m.add(new C0933i0(this.f13239l, str));
                } catch (androidx.camera.camera2.internal.compat.a e10) {
                    p140j8.f.h("Camera2CameraInfo", "Failed to get CameraCharacteristics for cameraId " + str, e10);
                    return Collections.EMPTY_SET;
                }
            }
        }
        return this.f13240m;
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees(int i7) {
        Integer num = (Integer) this.f13229b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return com.facebook.imagepipeline.nativecode.b.v(com.facebook.imagepipeline.nativecode.b.V(i7), num.intValue(), 1 == getLensFacing());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set getSupportedDynamicRanges() {
        return androidx.camera.camera2.internal.compat.params.b.a(this.f13229b).c();
    }

    @Override // androidx.camera.core.CameraInfo
    public final Set getSupportedFrameRateRanges() {
        Range[] rangeArr = (Range[]) this.f13229b.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        return rangeArr != null ? new HashSet(Arrays.asList(rangeArr)) : Collections.EMPTY_SET;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List getSupportedHighResolutions(int i7) {
        O2.a aVarB = this.f13229b.b();
        HashMap map = (HashMap) aVarB.f6556d;
        Size[] sizeArr = null;
        if (!map.containsKey(Integer.valueOf(i7))) {
            Size[] highResolutionOutputSizes = ((StreamConfigurationMap) ((androidx.camera.camera2.internal.compat.n) aVarB.f6553a).f13411a).getHighResolutionOutputSizes(i7);
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
                highResolutionOutputSizes = ((p1.d) aVarB.f6554b).a(highResolutionOutputSizes, i7);
            }
            map.put(Integer.valueOf(i7), highResolutionOutputSizes);
            if (highResolutionOutputSizes != null) {
                sizeArr = (Size[]) highResolutionOutputSizes.clone();
            }
        } else if (((Size[]) map.get(Integer.valueOf(i7))) != null) {
            sizeArr = (Size[]) ((Size[]) map.get(Integer.valueOf(i7))).clone();
        }
        return sizeArr != null ? Arrays.asList(sizeArr) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set getSupportedOutputFormats() {
        int[] outputFormats = ((androidx.camera.camera2.internal.compat.n) this.f13229b.b().f6553a).getOutputFormats();
        int[] iArr = outputFormats == null ? null : (int[]) outputFormats.clone();
        if (iArr == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (int i7 : iArr) {
            hashSet.add(Integer.valueOf(i7));
        }
        return hashSet;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List getSupportedResolutions(int i7) {
        Size[] sizeArrF = this.f13229b.b().f(i7);
        return sizeArrF != null ? Arrays.asList(sizeArrF) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final androidx.camera.core.impl.P0 getTimebase() {
        Integer num = (Integer) this.f13229b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? androidx.camera.core.impl.P0.f13943a : androidx.camera.core.impl.P0.f13944b;
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.lifecycle.B getTorchState() {
        synchronized (this.f13231d) {
            try {
                C0944o c0944o = this.f13232e;
                if (c0944o == null) {
                    if (this.f13233f == null) {
                        this.f13233f = new L(0);
                    }
                    return this.f13233f;
                }
                L l5 = this.f13233f;
                if (l5 != null) {
                    return l5;
                }
                return c0944o.f13612j.f13506b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.lifecycle.B getZoomState() {
        synchronized (this.f13231d) {
            try {
                C0944o c0944o = this.f13232e;
                if (c0944o != null) {
                    L l5 = this.f13234g;
                    if (l5 != null) {
                        return l5;
                    }
                    return (androidx.lifecycle.F) c0944o.f13611i.f13569e;
                }
                if (this.f13234g == null) {
                    ZoomControl$ZoomImpl zoomControl$ZoomImplB = j1.b(this.f13229b);
                    k1 k1Var = new k1(zoomControl$ZoomImplB.getMaxZoom(), zoomControl$ZoomImplB.getMinZoom());
                    k1Var.b(1.0f);
                    this.f13234g = new L(androidx.camera.core.internal.b.a(k1Var));
                }
                return this.f13234g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean hasFlashUnit() {
        androidx.camera.camera2.internal.compat.l lVar = this.f13229b;
        Objects.requireNonNull(lVar);
        return p002a.a.p(new C0936k(lVar, 1));
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isFocusMeteringSupported(C0218x c0218x) {
        synchronized (this.f13231d) {
            try {
                C0944o c0944o = this.f13232e;
                if (c0944o == null) {
                    return false;
                }
                return c0944o.f13610h.e(c0218x);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isLogicalMultiCameraSupported() {
        return J3.a.z(this.f13229b, 11);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean isPreviewStabilizationSupported() {
        int[] iArr = (int[]) this.f13229b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i7 : iArr) {
                if (i7 == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isPrivateReprocessingSupported() {
        return J3.a.z(this.f13229b, 4);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean isVideoStabilizationSupported() {
        int[] iArr = (int[]) this.f13229b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i7 : iArr) {
                if (i7 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isZslSupported() {
        return isPrivateReprocessingSupported() && androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(ZslDisablerQuirk.class) == null;
    }

    @Override // androidx.camera.core.CameraInfo
    public final Set querySupportedDynamicRanges(Set set) {
        return androidx.camera.core.impl.utils.executor.g.h(set, getSupportedDynamicRanges());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void removeSessionCaptureCallback(AbstractC0999q abstractC0999q) {
        synchronized (this.f13231d) {
            try {
                C0944o c0944o = this.f13232e;
                if (c0944o != null) {
                    c0944o.f13605c.execute(new RunnableC0934j(0, c0944o, abstractC0999q));
                    return;
                }
                ArrayList arrayList = this.f13236i;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == abstractC0999q) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
