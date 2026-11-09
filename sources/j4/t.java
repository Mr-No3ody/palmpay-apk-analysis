package j4;

import androidx.fragment.app.E;
import com.flexibank.sdk.FlexiBankFaceVerificationCallback;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckWithFaceRecognitionFragment;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import p052da.ViewOnClickListenerC1649v;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f38312g = new r(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p355xf.t f38313h = C2131j.b(new com.transsnet.palmpay.managemoney.ui.view.c(21));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlexiBankCheckWithFaceRecognitionFragment f38315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V3.f f38316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f38317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f38318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f38319f;

    public final void a() {
        if (p377z5.l.o(com.flexibank.sdk.k.g(), "android.permission.CAMERA")) {
            b();
            return;
        }
        V3.f fVar = this.f38316c;
        if (fVar != null) {
            q onGranted = new q(this, 0);
            q onDenied = new q(this, 1);
            q qVar = new q(this, 2);
            Intrinsics.checkNotNullParameter("android.permission.CAMERA", "permission");
            Intrinsics.checkNotNullParameter(onGranted, "onGranted");
            Intrinsics.checkNotNullParameter(onDenied, "onDenied");
            fVar.d("android.permission.CAMERA", new V3.e(onGranted, fVar, qVar, onDenied, 0));
        }
    }

    public final void b() {
        Object objF;
        FlexiBankCheckWithFaceRecognitionFragment flexiBankCheckWithFaceRecognitionFragment = this.f38315b;
        if (flexiBankCheckWithFaceRecognitionFragment != null) {
            flexiBankCheckWithFaceRecognitionFragment.onProcessing();
        }
        WeakReference weakReference = this.f38317d;
        E e10 = weakReference != null ? (E) weakReference.get() : null;
        FlexiBankCheckWithFaceRecognitionFragment flexiBankCheckWithFaceRecognitionFragment2 = this.f38315b;
        try {
            p355xf.o oVar = p355xf.q.f43977a;
            com.flexibank.sdk.k kVar = com.flexibank.sdk.k.f22317a;
            objF = com.flexibank.sdk.k.o().f21932d;
        } catch (Throwable th) {
            p355xf.o oVar2 = p355xf.q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        FlexiBankFaceVerificationCallback flexiBankFaceVerificationCallback = (FlexiBankFaceVerificationCallback) (objF instanceof p355xf.p ? null : objF);
        if (e10 != null && flexiBankCheckWithFaceRecognitionFragment2 != null && flexiBankFaceVerificationCallback != null) {
            flexiBankFaceVerificationCallback.start(e10, this.f38314a, this.f38318e, this.f38319f, true, flexiBankCheckWithFaceRecognitionFragment2);
        } else if (flexiBankCheckWithFaceRecognitionFragment2 != null) {
            flexiBankCheckWithFaceRecognitionFragment2.onFailed("UNSUPPORTED_VERIFICATION_METHOD", "Face verification callback is not configured");
        }
    }

    public final void c(V3.c cVar) {
        WeakReference weakReference = this.f38317d;
        E e10 = weakReference != null ? (E) weakReference.get() : null;
        if (e10 != null) {
            int i7 = com.flexibank.sdk.r.fb_opps;
            int i10 = com.flexibank.sdk.r.fb_core_cancel;
            ViewOnClickListenerC1649v viewOnClickListenerC1649v = new ViewOnClickListenerC1649v(this, 13);
            int i11 = com.flexibank.sdk.r.fb_confirm;
            p054dd.n nVar = new p054dd.n(9, cVar, this);
            int i12 = L6.i.ppDefaultDialogTheme;
            O6.c cVar2 = new O6.c(e10);
            cVar2.f6614u = 1;
            cVar2.e(i7);
            cVar2.f6598d = "Please grant camera permission to continue.";
            cVar2.d(i11, nVar);
            cVar2.c(i10, viewOnClickListenerC1649v);
            cVar2.f6605k = false;
            cVar2.f6606l = 0;
            cVar2.f6615v = i12;
            O6.d dialog = cVar2.g();
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            Intrinsics.checkNotNullExpressionValue(dialog, "dialog");
        }
    }
}
