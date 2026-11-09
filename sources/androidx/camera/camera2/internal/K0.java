package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import E.C0206k;
import E.C0218x;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final MeteringRectangle[] f13202x = new MeteringRectangle[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0944o f13203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.d f13205c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Oe.a f13208f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture f13211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ScheduledFuture f13212j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MeteringRectangle[] f13219q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MeteringRectangle[] f13220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MeteringRectangle[] f13221s;
    public androidx.concurrent.futures.k t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.concurrent.futures.k f13222u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public E0 f13224w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f13206d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Rational f13207e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13209g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f13210h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f13213k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13214l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13215m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13216n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public I0 f13217o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public H0 f13218p = null;

    public K0(C0944o c0944o, androidx.camera.core.impl.utils.executor.d dVar, androidx.camera.core.impl.utils.executor.i iVar, androidx.camera.core.impl.y0 y0Var) {
        MeteringRectangle[] meteringRectangleArr = f13202x;
        this.f13219q = meteringRectangleArr;
        this.f13220r = meteringRectangleArr;
        this.f13221s = meteringRectangleArr;
        this.t = null;
        this.f13222u = null;
        this.f13223v = false;
        this.f13224w = null;
        this.f13203a = c0944o;
        this.f13204b = iVar;
        this.f13205c = dVar;
        this.f13208f = new Oe.a(y0Var, 11);
    }

    public final void a(boolean z3, boolean z8) {
        if (this.f13206d) {
            androidx.camera.core.impl.S s3 = new androidx.camera.core.impl.S();
            s3.f13960f = true;
            s3.f13957c = this.f13216n;
            C0992m0 c0992m0B = C0992m0.b();
            if (z3) {
                c0992m0B.insertOption(androidx.camera.camera2.impl.b.k(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z8) {
                c0992m0B.insertOption(androidx.camera.camera2.impl.b.k(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            s3.c(new androidx.camera.camera2.impl.b(C1000q0.a(c0992m0B), 2));
            C0944o c0944o = this.f13203a;
            c0944o.f13608f.onCameraControlCaptureRequests(Collections.singletonList(s3.d()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener, androidx.camera.camera2.internal.H0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(androidx.concurrent.futures.k kVar) {
        H0 h7 = this.f13218p;
        C0944o c0944o = this.f13203a;
        c0944o.i(h7);
        androidx.concurrent.futures.k kVar2 = this.f13222u;
        if (kVar2 != null) {
            kVar2.d(new C0206k("Cancelled by another cancelFocusAndMetering()"));
            this.f13222u = null;
        }
        c0944o.i(this.f13217o);
        androidx.concurrent.futures.k kVar3 = this.t;
        if (kVar3 != null) {
            kVar3.d(new C0206k("Cancelled by cancelFocusAndMetering()"));
            this.t = null;
        }
        this.f13222u = kVar;
        ScheduledFuture scheduledFuture = this.f13211i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f13211i = null;
        }
        ScheduledFuture scheduledFuture2 = this.f13212j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f13212j = null;
        }
        if (this.f13219q.length > 0) {
            a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f13202x;
        this.f13219q = meteringRectangleArr;
        this.f13220r = meteringRectangleArr;
        this.f13221s = meteringRectangleArr;
        this.f13209g = false;
        final long jK = c0944o.k();
        if (this.f13222u != null) {
            final int iE = c0944o.e(this.f13216n != 3 ? 4 : 3);
            ?? r3 = new Camera2CameraControlImpl$CaptureResultListener() { // from class: androidx.camera.camera2.internal.H0
                @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
                public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                    K0 k2 = this;
                    k2.getClass();
                    if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != iE || !C0944o.h(totalCaptureResult, jK)) {
                        return false;
                    }
                    androidx.concurrent.futures.k kVar4 = k2.f13222u;
                    if (kVar4 == null) {
                        return true;
                    }
                    kVar4.b(null);
                    k2.f13222u = null;
                    return true;
                }
            };
            this.f13218p = r3;
            c0944o.a(r3);
        }
    }

    public final ListenableFuture c(boolean z3) {
        return (Build.VERSION.SDK_INT >= 28 && C0944o.d(this.f13203a.f13607e, 5) == 5) ? AbstractC0198c.y(new De.b(this, z3, 1)) : androidx.camera.core.impl.utils.futures.l.f14212c;
    }

    public final List d(List list, int i7, Rational rational, Rect rect, int i10) {
        if (list.isEmpty() || i7 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E.X x3 = (E.X) it.next();
            if (arrayList.size() == i7) {
                break;
            }
            float f10 = x3.f1971a;
            if (f10 >= 0.0f && f10 <= 1.0f) {
                float f11 = x3.f1972b;
                if (f11 >= 0.0f && f11 <= 1.0f) {
                    Rational rational3 = x3.f1974d;
                    if (rational3 == null) {
                        rational3 = rational;
                    }
                    PointF pointF = (i10 == 1 && ((androidx.camera.core.impl.y0) this.f13208f.f6830b).a(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - f10, f11) : new PointF(f10, f11);
                    if (!rational3.equals(rational2)) {
                        if (rational3.compareTo(rational2) > 0) {
                            float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                            pointF.y = (1.0f / fDoubleValue) * (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointF.y);
                        } else {
                            float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                            pointF.x = (1.0f / fDoubleValue2) * (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointF.x);
                        }
                    }
                    int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                    int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                    float fWidth = rect.width();
                    float f12 = x3.f1973c;
                    int i11 = ((int) (fWidth * f12)) / 2;
                    int iHeight2 = ((int) (f12 * rect.height())) / 2;
                    Rect rect2 = new Rect(iWidth - i11, iHeight - iHeight2, iWidth + i11, iHeight + iHeight2);
                    rect2.left = Math.min(Math.max(rect2.left, rect.left), rect.right);
                    rect2.right = Math.min(Math.max(rect2.right, rect.left), rect.right);
                    rect2.top = Math.min(Math.max(rect2.top, rect.top), rect.bottom);
                    rect2.bottom = Math.min(Math.max(rect2.bottom, rect.top), rect.bottom);
                    MeteringRectangle meteringRectangle = new MeteringRectangle(rect2, 1000);
                    if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                        arrayList.add(meteringRectangle);
                    }
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean e(C0218x c0218x) {
        Rational rational;
        C0944o c0944o = this.f13203a;
        Rect cropSensorRegion = ((ZoomControl$ZoomImpl) c0944o.f13611i.f13570f).getCropSensorRegion();
        if (this.f13207e != null) {
            rational = this.f13207e;
        } else {
            Rect cropSensorRegion2 = ((ZoomControl$ZoomImpl) this.f13203a.f13611i.f13570f).getCropSensorRegion();
            rational = new Rational(cropSensorRegion2.width(), cropSensorRegion2.height());
        }
        List list = c0218x.f2134a;
        Integer num = (Integer) c0944o.f13607e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        List listD = d(list, num == null ? 0 : num.intValue(), rational, cropSensorRegion, 1);
        Integer num2 = (Integer) c0944o.f13607e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        List listD2 = d(c0218x.f2135b, num2 == null ? 0 : num2.intValue(), rational, cropSensorRegion, 2);
        Integer num3 = (Integer) c0944o.f13607e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        return (listD.isEmpty() && listD2.isEmpty() && d(c0218x.f2136c, num3 == null ? 0 : num3.intValue(), rational, cropSensorRegion, 4).isEmpty()) ? false : true;
    }

    public final void f(androidx.concurrent.futures.k kVar) {
        p140j8.f.G("FocusMeteringControl");
        if (!this.f13206d) {
            if (kVar != null) {
                kVar.d(new C0206k("Camera is not active."));
                return;
            }
            return;
        }
        androidx.camera.core.impl.S s3 = new androidx.camera.core.impl.S();
        s3.f13957c = this.f13216n;
        s3.f13960f = true;
        C0992m0 c0992m0B = C0992m0.b();
        c0992m0B.insertOption(androidx.camera.camera2.impl.b.k(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
        s3.c(new androidx.camera.camera2.impl.b(C1000q0.a(c0992m0B), 2));
        s3.b(new Y(1, kVar));
        C0944o c0944o = this.f13203a;
        c0944o.f13608f.onCameraControlCaptureRequests(Collections.singletonList(s3.d()));
    }

    public final void g(boolean z3) {
        if (this.f13206d) {
            androidx.camera.core.impl.S s3 = new androidx.camera.core.impl.S();
            s3.f13957c = this.f13216n;
            s3.f13960f = true;
            C0992m0 c0992m0B = C0992m0.b();
            c0992m0B.insertOption(androidx.camera.camera2.impl.b.k(CaptureRequest.CONTROL_AF_TRIGGER), 1);
            if (z3) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                Integer numValueOf = Integer.valueOf(C0944o.d(this.f13203a.f13607e, 1));
                c0992m0B.insertOption(androidx.camera.camera2.impl.b.k(key), androidx.camera.core.impl.W.f13995b, numValueOf);
            }
            s3.c(new androidx.camera.camera2.impl.b(C1000q0.a(c0992m0B), 2));
            s3.b(new J0(0));
            C0944o c0944o = this.f13203a;
            c0944o.f13608f.onCameraControlCaptureRequests(Collections.singletonList(s3.d()));
        }
    }
}
