package androidx.camera.camera2.internal;

import E.C0206k;
import E.C0218x;
import E.C0219y;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.core.ImageCapture$ScreenFlashListener;
import androidx.camera.core.impl.AbstractC0999q;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13146d;

    public /* synthetic */ G0(C0923d0 c0923d0, AtomicReference atomicReference, androidx.concurrent.futures.k kVar) {
        this.f13143a = 2;
        this.f13144b = c0923d0;
        this.f13146d = atomicReference;
        this.f13145c = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener, androidx.camera.camera2.internal.I0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        Rational rational;
        final long jK;
        switch (this.f13143a) {
            case 0:
                final K0 k2 = (K0) this.f13144b;
                androidx.concurrent.futures.k kVar = (androidx.concurrent.futures.k) this.f13145c;
                C0218x c0218x = (C0218x) this.f13146d;
                if (!k2.f13206d) {
                    kVar.d(new C0206k("Camera is not active."));
                } else {
                    Rect cropSensorRegion = ((ZoomControl$ZoomImpl) k2.f13203a.f13611i.f13570f).getCropSensorRegion();
                    if (k2.f13207e != null) {
                        rational = k2.f13207e;
                    } else {
                        Rect cropSensorRegion2 = ((ZoomControl$ZoomImpl) k2.f13203a.f13611i.f13570f).getCropSensorRegion();
                        rational = new Rational(cropSensorRegion2.width(), cropSensorRegion2.height());
                    }
                    List list = c0218x.f2134a;
                    Integer num = (Integer) k2.f13203a.f13607e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                    List listD = k2.d(list, num == null ? 0 : num.intValue(), rational, cropSensorRegion, 1);
                    List list2 = c0218x.f2135b;
                    Integer num2 = (Integer) k2.f13203a.f13607e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                    List listD2 = k2.d(list2, num2 == null ? 0 : num2.intValue(), rational, cropSensorRegion, 2);
                    List list3 = c0218x.f2136c;
                    Integer num3 = (Integer) k2.f13203a.f13607e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                    List listD3 = k2.d(list3, num3 == null ? 0 : num3.intValue(), rational, cropSensorRegion, 4);
                    if (listD.isEmpty() && listD2.isEmpty() && listD3.isEmpty()) {
                        kVar.d(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                    } else {
                        k2.f13203a.i(k2.f13217o);
                        androidx.concurrent.futures.k kVar2 = k2.t;
                        if (kVar2 != null) {
                            kVar2.d(new C0206k("Cancelled by another startFocusAndMetering()"));
                            k2.t = null;
                        }
                        k2.f13203a.i(k2.f13218p);
                        androidx.concurrent.futures.k kVar3 = k2.f13222u;
                        if (kVar3 != null) {
                            kVar3.d(new C0206k("Cancelled by another startFocusAndMetering()"));
                            k2.f13222u = null;
                        }
                        ScheduledFuture scheduledFuture = k2.f13211i;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(true);
                            k2.f13211i = null;
                        }
                        k2.t = kVar;
                        MeteringRectangle[] meteringRectangleArr = K0.f13202x;
                        MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) listD.toArray(meteringRectangleArr);
                        MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) listD2.toArray(meteringRectangleArr);
                        MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) listD3.toArray(meteringRectangleArr);
                        I0 i0 = k2.f13217o;
                        C0944o c0944o = k2.f13203a;
                        c0944o.i(i0);
                        ScheduledFuture scheduledFuture2 = k2.f13211i;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(true);
                            k2.f13211i = null;
                        }
                        ScheduledFuture scheduledFuture3 = k2.f13212j;
                        if (scheduledFuture3 != null) {
                            scheduledFuture3.cancel(true);
                            k2.f13212j = null;
                        }
                        k2.f13219q = meteringRectangleArr2;
                        k2.f13220r = meteringRectangleArr3;
                        k2.f13221s = meteringRectangleArr4;
                        if (meteringRectangleArr2.length > 0) {
                            k2.f13209g = true;
                            k2.f13214l = false;
                            k2.f13215m = false;
                            jK = c0944o.k();
                            k2.g(true);
                        } else {
                            k2.f13209g = false;
                            k2.f13214l = true;
                            k2.f13215m = false;
                            jK = c0944o.k();
                        }
                        k2.f13210h = 0;
                        final boolean z3 = c0944o.e(1) == 1;
                        ?? r3 = new Camera2CameraControlImpl$CaptureResultListener() { // from class: androidx.camera.camera2.internal.I0
                            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
                            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                                K0 k8 = k2;
                                k8.getClass();
                                Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                                if (k8.f13219q.length > 0) {
                                    if (!z3 || num4 == null) {
                                        k8.f13215m = true;
                                        k8.f13214l = true;
                                    } else if (k8.f13210h.intValue() == 3) {
                                        if (num4.intValue() == 4) {
                                            k8.f13215m = true;
                                            k8.f13214l = true;
                                        } else if (num4.intValue() == 5) {
                                            k8.f13215m = false;
                                            k8.f13214l = true;
                                        }
                                    }
                                }
                                if (!k8.f13214l || !C0944o.h(totalCaptureResult, jK)) {
                                    if (!k8.f13210h.equals(num4) && num4 != null) {
                                        k8.f13210h = num4;
                                    }
                                    return false;
                                }
                                boolean z8 = k8.f13215m;
                                ScheduledFuture scheduledFuture4 = k8.f13212j;
                                if (scheduledFuture4 != null) {
                                    scheduledFuture4.cancel(true);
                                    k8.f13212j = null;
                                }
                                androidx.concurrent.futures.k kVar4 = k8.t;
                                if (kVar4 != null) {
                                    kVar4.b(new C0219y(z8));
                                    k8.t = null;
                                }
                                return true;
                            }
                        };
                        k2.f13217o = r3;
                        c0944o.a(r3);
                        long j6 = k2.f13213k + 1;
                        k2.f13213k = j6;
                        B0 b0 = new B0(2, j6, k2);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        androidx.camera.core.impl.utils.executor.d dVar = k2.f13205c;
                        k2.f13212j = dVar.schedule(b0, 5000L, timeUnit);
                        long j10 = c0218x.f2137d;
                        if (j10 > 0) {
                            k2.f13211i = dVar.schedule(new B0(3, j6, k2), j10, timeUnit);
                        }
                    }
                }
                break;
            case 1:
                C0940m c0940m = ((C0944o) this.f13144b).f13627z;
                HashSet hashSet = (HashSet) c0940m.f13596b;
                AbstractC0999q abstractC0999q = (AbstractC0999q) this.f13146d;
                hashSet.add(abstractC0999q);
                ((ArrayMap) c0940m.f13597c).put(abstractC0999q, (Executor) this.f13145c);
                break;
            default:
                C0923d0 c0923d0 = (C0923d0) this.f13144b;
                c0923d0.getClass();
                p140j8.f.G("Camera2CapturePipeline");
                c0923d0.f13500d.apply(TimeUnit.SECONDS.toMillis(3L) + System.currentTimeMillis(), (ImageCapture$ScreenFlashListener) ((AtomicReference) this.f13146d).get());
                ((androidx.concurrent.futures.k) this.f13145c).b(null);
                break;
        }
    }

    public /* synthetic */ G0(Object obj, int i7, Object obj2, Object obj3) {
        this.f13143a = i7;
        this.f13144b = obj;
        this.f13145c = obj2;
        this.f13146d = obj3;
    }
}
