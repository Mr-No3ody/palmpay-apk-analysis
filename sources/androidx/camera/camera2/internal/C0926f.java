package androidx.camera.camera2.internal;

import E.C0199d;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.EnumC1006u;
import androidx.camera.core.impl.EnumC1007v;
import androidx.camera.core.impl.EnumC1008w;
import androidx.camera.core.impl.EnumC1009x;
import androidx.camera.core.impl.EnumC1010y;
import androidx.camera.core.impl.EnumC1011z;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0926f implements CameraCaptureResult, CameraDeviceSurfaceManager, FutureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13513b;

    public /* synthetic */ C0926f(Object obj, Object obj2) {
        this.f13512a = obj;
        this.f13513b = obj2;
    }

    public void a() {
        E e10 = (E) this.f13512a;
        if (e10 != null) {
            e10.f13132b.set(true);
            e10.f13131a.cancel(true);
        }
        this.f13512a = null;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1006u getAeMode() {
        Integer num = (Integer) ((CaptureResult) this.f13513b).get(CaptureResult.CONTROL_AE_MODE);
        EnumC1006u enumC1006u = EnumC1006u.f14132a;
        if (num == null) {
            return enumC1006u;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC1006u.f14133b;
        }
        if (iIntValue == 1) {
            return EnumC1006u.f14134c;
        }
        if (iIntValue == 2) {
            return EnumC1006u.f14135d;
        }
        if (iIntValue == 3) {
            return EnumC1006u.f14136e;
        }
        if (iIntValue != 4) {
            return (iIntValue == 5 && Build.VERSION.SDK_INT >= 28) ? EnumC1006u.f14138g : enumC1006u;
        }
        return EnumC1006u.f14137f;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1007v getAeState() {
        Integer num = (Integer) ((CaptureResult) this.f13513b).get(CaptureResult.CONTROL_AE_STATE);
        EnumC1007v enumC1007v = EnumC1007v.f14264a;
        if (num == null) {
            return enumC1007v;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC1007v.f14265b;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC1007v.f14268e;
            }
            if (iIntValue == 3) {
                return EnumC1007v.f14269f;
            }
            if (iIntValue == 4) {
                return EnumC1007v.f14267d;
            }
            if (iIntValue != 5) {
                p140j8.f.g("C2CameraCaptureResult", "Undefined ae state: " + num);
                return enumC1007v;
            }
        }
        return EnumC1007v.f14266c;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1008w getAfMode() {
        Integer num = (Integer) ((CaptureResult) this.f13513b).get(CaptureResult.CONTROL_AF_MODE);
        EnumC1008w enumC1008w = EnumC1008w.f14274a;
        if (num == null) {
            return enumC1008w;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return EnumC1008w.f14276c;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return EnumC1008w.f14277d;
            }
            if (iIntValue != 5) {
                p140j8.f.g("C2CameraCaptureResult", "Undefined af mode: " + num);
                return enumC1008w;
            }
        }
        return EnumC1008w.f14275b;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1009x getAfState() {
        Integer num = (Integer) ((CaptureResult) this.f13513b).get(CaptureResult.CONTROL_AF_STATE);
        EnumC1009x enumC1009x = EnumC1009x.f14279a;
        if (num == null) {
            return enumC1009x;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC1009x.f14280b;
            case 1:
            case 3:
                return EnumC1009x.f14281c;
            case 2:
                return EnumC1009x.f14282d;
            case 4:
                return EnumC1009x.f14284f;
            case 5:
                return EnumC1009x.f14285g;
            case 6:
                return EnumC1009x.f14283e;
            default:
                p140j8.f.g("C2CameraCaptureResult", "Undefined af state: " + num);
                return enumC1009x;
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1010y getAwbMode() {
        Integer num = (Integer) ((CaptureResult) this.f13513b).get(CaptureResult.CONTROL_AWB_MODE);
        EnumC1010y enumC1010y = EnumC1010y.f14287a;
        if (num == null) {
            return enumC1010y;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC1010y.f14288b;
            case 1:
                return EnumC1010y.f14289c;
            case 2:
                return EnumC1010y.f14290d;
            case 3:
                return EnumC1010y.f14291e;
            case 4:
                return EnumC1010y.f14292f;
            case 5:
                return EnumC1010y.f14293g;
            case 6:
                return EnumC1010y.f14294i;
            case 7:
                return EnumC1010y.f14295j;
            case 8:
                return EnumC1010y.f14296o;
            default:
                return enumC1010y;
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1011z getAwbState() {
        Integer num = (Integer) ((CaptureResult) this.f13513b).get(CaptureResult.CONTROL_AWB_STATE);
        EnumC1011z enumC1011z = EnumC1011z.f14299a;
        if (num == null) {
            return enumC1011z;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC1011z.f14300b;
        }
        if (iIntValue == 1) {
            return EnumC1011z.f14301c;
        }
        if (iIntValue == 2) {
            return EnumC1011z.f14302d;
        }
        if (iIntValue == 3) {
            return EnumC1011z.f14303e;
        }
        p140j8.f.g("C2CameraCaptureResult", "Undefined awb state: " + num);
        return enumC1011z;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CaptureResult getCaptureResult() {
        return (CaptureResult) this.f13513b;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.A getFlashState() {
        Integer num = (Integer) ((CaptureResult) this.f13513b).get(CaptureResult.FLASH_STATE);
        androidx.camera.core.impl.A a3 = androidx.camera.core.impl.A.f13828a;
        if (num == null) {
            return a3;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return androidx.camera.core.impl.A.f13829b;
        }
        if (iIntValue == 2) {
            return androidx.camera.core.impl.A.f13830c;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return androidx.camera.core.impl.A.f13831d;
        }
        p140j8.f.g("C2CameraCaptureResult", "Undefined flash state: " + num);
        return a3;
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    public Pair getSuggestedStreamSpecs(int i7, String str, List list, Map map, boolean z3, boolean z8) {
        p118hf.a.g(!map.isEmpty(), "No new use cases to be bound.");
        Y0 y8 = (Y0) ((HashMap) this.f13512a).get(str);
        if (y8 != null) {
            return y8.g(i7, list, map, z3, z8);
        }
        throw new IllegalArgumentException(C0.G.o("No such camera id in supported combination list: ", str));
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public androidx.camera.core.impl.O0 getTagBundle() {
        return (androidx.camera.core.impl.O0) this.f13512a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        Long l5 = (Long) ((CaptureResult) this.f13513b).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l5 == null) {
            return -1L;
        }
        return l5.longValue();
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onFailure(Throwable th) {
        throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
    public void onSuccess(Object obj) {
        ((Surface) this.f13512a).release();
        ((SurfaceTexture) this.f13513b).release();
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public void populateExifData(androidx.camera.core.impl.utils.i iVar) {
        String strValueOf;
        CaptureResult captureResult = (CaptureResult) this.f13513b;
        super.populateExifData(iVar);
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                iVar.d(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            p140j8.f.G("C2CameraCaptureResult");
        }
        Long l5 = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l5 != null) {
            long jLongValue = l5.longValue();
            iVar.getClass();
            iVar.c("ExposureTime", String.valueOf(jLongValue / TimeUnit.SECONDS.toNanos(1L)), iVar.f14228a);
        }
        Float f10 = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            iVar.getClass();
            iVar.c("FNumber", String.valueOf(fFloatValue), iVar.f14228a);
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num2 != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (num2.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            iVar.getClass();
            String strValueOf2 = String.valueOf(3);
            ArrayList arrayList = iVar.f14228a;
            iVar.c("SensitivityType", strValueOf2, arrayList);
            iVar.c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
        }
        Float f11 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            float fFloatValue2 = f11.floatValue();
            iVar.getClass();
            iVar.c("FocalLength", ((long) (fFloatValue2 * 1000.0f)) + "/1000", iVar.f14228a);
        }
        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null) {
            int i7 = num3.intValue() == 0 ? 2 : 1;
            iVar.getClass();
            int i10 = F.i(i7);
            if (i10 != 0) {
                strValueOf = i10 != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            iVar.c("WhiteBalance", strValueOf, iVar.f14228a);
        }
    }

    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager
    public androidx.camera.core.impl.N0 transformSurfaceConfig(int i7, String str, int i10, Size size) {
        Y0 y8 = (Y0) ((HashMap) this.f13512a).get(str);
        if (y8 != null) {
            return androidx.camera.core.impl.N0.b(i7, i10, size, y8.i(i10));
        }
        return null;
    }

    public C0926f(androidx.camera.core.impl.utils.executor.i executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f13512a = executor;
        this.f13513b = new AtomicInteger(0);
    }

    public C0926f(androidx.camera.core.impl.N n10) {
        this.f13512a = n10;
        androidx.lifecycle.F f10 = new androidx.lifecycle.F();
        this.f13513b = f10;
        f10.i(new C0199d(5, null));
    }

    public C0926f(CaptureResult captureResult) {
        this(androidx.camera.core.impl.O0.f13940b, captureResult);
    }

    public C0926f(Context context, Object obj, Set set) {
        androidx.camera.camera2.internal.compat.s sVar;
        C0959w c0959w = new C0959w(1);
        this.f13512a = new HashMap();
        this.f13513b = c0959w;
        if (obj instanceof androidx.camera.camera2.internal.compat.s) {
            sVar = (androidx.camera.camera2.internal.compat.s) obj;
        } else {
            sVar = new androidx.camera.camera2.internal.compat.s(CameraManagerCompat$CameraManagerCompatImpl.from(context, androidx.camera.core.impl.utils.n.o()));
        }
        context.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) this.f13512a).put(str, new Y0(context, str, sVar, (C0959w) this.f13513b));
        }
    }

    public C0926f(J j6) {
        this.f13513b = j6;
        this.f13512a = null;
    }
}
