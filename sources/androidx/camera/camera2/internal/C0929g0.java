package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.EnumC1006u;
import androidx.camera.core.impl.EnumC1008w;
import androidx.camera.core.impl.EnumC1010y;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0929g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0944o f13529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E.N f13530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.y0 f13532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.i f13533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.camera.core.impl.utils.executor.d f13534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13536h = 1;

    public C0929g0(C0944o c0944o, androidx.camera.camera2.internal.compat.l lVar, androidx.camera.core.impl.y0 y0Var, androidx.camera.core.impl.utils.executor.i iVar, androidx.camera.core.impl.utils.executor.d dVar) {
        this.f13529a = c0944o;
        Integer num = (Integer) lVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f13535g = num != null && num.intValue() == 2;
        this.f13533e = iVar;
        this.f13534f = dVar;
        this.f13532d = y0Var;
        this.f13530b = new E.N(y0Var, 5);
        this.f13531c = p002a.a.p(new C0936k(lVar, 1));
    }

    public static boolean b(TotalCaptureResult totalCaptureResult, boolean z3) {
        if (totalCaptureResult != null) {
            C0926f c0926f = new C0926f(totalCaptureResult);
            Set set = androidx.camera.core.impl.Y.f14001a;
            boolean z8 = c0926f.getAfMode() == EnumC1008w.f14275b || c0926f.getAfMode() == EnumC1008w.f14274a || androidx.camera.core.impl.Y.f14001a.contains(c0926f.getAfState());
            boolean z10 = c0926f.getAeMode() == EnumC1006u.f14133b;
            boolean z11 = !z3 ? !(z10 || androidx.camera.core.impl.Y.f14003c.contains(c0926f.getAeState())) : !(z10 || androidx.camera.core.impl.Y.f14004d.contains(c0926f.getAeState()));
            boolean z12 = c0926f.getAwbMode() == EnumC1010y.f14288b || androidx.camera.core.impl.Y.f14002b.contains(c0926f.getAwbState());
            Objects.toString(c0926f.getAeState());
            Objects.toString(c0926f.getAfState());
            Objects.toString(c0926f.getAwbState());
            p140j8.f.G("ConvergenceUtils");
            if (z8 && z11 && z12) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(int i7, TotalCaptureResult totalCaptureResult) {
        p140j8.f.G("Camera2CapturePipeline");
        if (i7 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            p140j8.f.G("Camera2CapturePipeline");
            return num != null && num.intValue() == 4;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                return false;
            }
            if (i7 != 3) {
                throw new AssertionError(i7);
            }
        }
        return true;
    }

    public final Z a(int i7, int i10, int i11) {
        androidx.camera.core.impl.y0 y0Var = this.f13532d;
        N7.a aVar = new N7.a(y0Var, 2);
        Z z3 = new Z(this.f13536h, this.f13533e, this.f13534f, this.f13529a, this.f13535g, aVar);
        ArrayList arrayList = z3.f13330h;
        C0944o c0944o = this.f13529a;
        if (i7 == 0) {
            arrayList.add(new T(c0944o));
        }
        if (i10 == 3) {
            arrayList.add(new C0923d0(c0944o, this.f13533e, this.f13534f, new Sd.b(y0Var)));
        } else if (this.f13531c) {
            boolean z8 = this.f13530b.f1938b;
            if (z8 || this.f13536h == 3 || i11 == 1) {
                arrayList.add(new C0927f0(this.f13529a, i10, this.f13533e, this.f13534f, (z8 || c0944o.isInVideoUsage()) ? false : true));
            } else {
                arrayList.add(new S(c0944o, i10, aVar));
            }
        }
        Objects.toString(arrayList);
        p140j8.f.G("Camera2CapturePipeline");
        return z3;
    }
}
