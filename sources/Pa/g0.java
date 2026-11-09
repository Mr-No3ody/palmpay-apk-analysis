package Pa;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.palmpay.lib.liveness.model.AuthenticationRequest;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.init.LivenessTask;
import com.transsnet.palmpay.core.util.ScanFaceLogicUtil$IScanFaceResultCallBack;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e0 f7080h = new e0(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p355xf.t f7081i = C2131j.b(new b0(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScanFaceLogicUtil$IScanFaceResultCallBack f7083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p038ca.d f7084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f7085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f7087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f7088g;

    public static void e(g0 g0Var, androidx.fragment.app.E e10, int i7, ScanFaceLogicUtil$IScanFaceResultCallBack scanFaceLogicUtil$IScanFaceResultCallBack, p038ca.d requestPermissionLauncher, String str, String str2, int i10) {
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str2 = null;
        }
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(requestPermissionLauncher, "requestPermissionLauncher");
        g0Var.f7082a = i7;
        g0Var.f7086e = str;
        g0Var.f7085d = new WeakReference(e10);
        g0Var.f7083b = scanFaceLogicUtil$IScanFaceResultCallBack;
        g0Var.f7084c = requestPermissionLauncher;
        g0Var.f7088g = str2;
        g0Var.a();
    }

    public static void f(g0 g0Var, BaseFragment baseFragment, int i7, ScanFaceLogicUtil$IScanFaceResultCallBack scanFaceLogicUtil$IScanFaceResultCallBack, p038ca.d requestPermissionLauncher, String str, boolean z3) {
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(requestPermissionLauncher, "requestPermissionLauncher");
        if (baseFragment != null) {
            androidx.fragment.app.E activity = baseFragment.getActivity();
            Intrinsics.checkNotNullParameter(requestPermissionLauncher, "requestPermissionLauncher");
            g0Var.f7082a = i7;
            g0Var.f7086e = str;
            g0Var.f7085d = new WeakReference(activity);
            g0Var.f7083b = scanFaceLogicUtil$IScanFaceResultCallBack;
            g0Var.f7084c = requestPermissionLauncher;
            g0Var.f7088g = null;
            g0Var.a();
        }
    }

    public final void a() {
        if (p377z5.l.o(BaseApplication.getContext(), "android.permission.CAMERA")) {
            b();
            return;
        }
        p038ca.d dVar = this.f7084c;
        if (dVar != null) {
            c0 onGranted = new c0(this, 0);
            c0 onDenied = new c0(this, 1);
            c0 c0Var = new c0(this, 2);
            Intrinsics.checkNotNullParameter("android.permission.CAMERA", "permission");
            Intrinsics.checkNotNullParameter(onGranted, "onGranted");
            Intrinsics.checkNotNullParameter(onDenied, "onDenied");
            dVar.d("android.permission.CAMERA", new V3.e(onGranted, dVar, c0Var, onDenied, 1));
        }
    }

    public final void b() {
        WeakReference weakReference = this.f7085d;
        androidx.fragment.app.E e10 = weakReference != null ? (androidx.fragment.app.E) weakReference.get() : null;
        if (e10 == null || !i0.W(e10)) {
            F6.d.c("Face", "initAliParams: activity unavailable, skip LiveID.start");
            ScanFaceLogicUtil$IScanFaceResultCallBack scanFaceLogicUtil$IScanFaceResultCallBack = this.f7083b;
            if (scanFaceLogicUtil$IScanFaceResultCallBack != null) {
                scanFaceLogicUtil$IScanFaceResultCallBack.onFailed(null, "Activity is unavailable.", null);
            }
            c(scanFaceLogicUtil$IScanFaceResultCallBack);
            return;
        }
        ScanFaceLogicUtil$IScanFaceResultCallBack scanFaceLogicUtil$IScanFaceResultCallBack2 = this.f7083b;
        if (scanFaceLogicUtil$IScanFaceResultCallBack2 != null) {
            scanFaceLogicUtil$IScanFaceResultCallBack2.onProcessing();
        }
        F6.d.c("Face", "initAliParams: palmpay");
        p232p6.p pVar = p232p6.p.f41234a;
        r6.a aVar = p232p6.p.f41237d;
        if (aVar != null) {
            aVar.f41575g = 0;
        }
        LivenessTask.INSTANCE.initLiveness(e10.getApplication());
        int i7 = this.f7082a;
        String str = null;
        p232p6.p.j(e10, new AuthenticationRequest(Integer.valueOf(i7), str, this.f7087f, this.f7086e, this.f7088g, 2, null), new p1.c(this, 7));
        f7080h.refreshDeviceToken();
    }

    public final void c(ScanFaceLogicUtil$IScanFaceResultCallBack scanFaceLogicUtil$IScanFaceResultCallBack) {
        if (scanFaceLogicUtil$IScanFaceResultCallBack == null || this.f7083b != scanFaceLogicUtil$IScanFaceResultCallBack) {
            return;
        }
        this.f7083b = null;
        this.f7084c = null;
        this.f7085d = null;
        this.f7086e = null;
        this.f7088g = null;
        this.f7087f = null;
    }

    public final void d(p038ca.a aVar) {
        WeakReference weakReference = this.f7085d;
        androidx.fragment.app.E e10 = weakReference != null ? (androidx.fragment.app.E) weakReference.get() : null;
        if (e10 != null) {
            int i7 = p025ba.k.core_opps;
            int i10 = p025ba.k.core_cancel;
            io.fastkv.n.O(e10, 0, Integer.valueOf(i7), null, null, null, null, "Please grant camera permission to continue.", Integer.valueOf(p025ba.k.core_confirm), null, new Oc.j(7, aVar, this), Integer.valueOf(i10), null, new Nc.x(this, 13), null, true, 0, 8295037);
        }
    }
}
