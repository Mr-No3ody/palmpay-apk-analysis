package p297te;

import Cc.a;
import D6.j;
import E.C0211p;
import N8.r;
import android.widget.TextView;
import androidx.camera.lifecycle.h;
import androidx.camera.view.C1027h;
import androidx.camera.view.PreviewView;
import androidx.core.content.d;
import androidx.core.widget.NestedScrollView;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.google.common.util.concurrent.ListenableFuture;
import com.palmpay.lib.liveness.ui.FaceCaptureActivity;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcContactActivity;
import com.transsnet.palmpay.main.export.bean.req.MerchantOrderCheckSignReq;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42613c;

    public /* synthetic */ g(int i7, Object obj, Object obj2) {
        this.f42611a = i7;
        this.f42612b = obj;
        this.f42613c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = false;
        Object obj = this.f42613c;
        Object obj2 = this.f42612b;
        switch (this.f42611a) {
            case 0:
                ThirdPartyMerchantActivity thirdPartyMerchantActivity = ((h) obj2).f42614a;
                thirdPartyMerchantActivity.showLoadingDialog(true);
                MerchantOrderCheckSignReq merchantOrderCheckSignReq = (MerchantOrderCheckSignReq) obj;
                ((IApiMainService) a.f1353a.f39520b).checkMerchantOrderSign(merchantOrderCheckSignReq).k(f.f42629b).i(b.a()).subscribe(new r(thirdPartyMerchantActivity, 12, merchantOrderCheckSignReq, z3));
                return;
            case 1:
                int i7 = OcContactActivity.f29378l1;
                Object value = ((OcContactActivity) obj2).f29405a1.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((NestedScrollView) value).scrollTo(0, ((TextView) obj).getBottom());
                return;
            case 2:
                DevLoadingModule.showMessage$lambda$0((DevLoadingModule) obj2, (String) obj);
                return;
            case 3:
                FaceCaptureActivity faceCaptureActivity = (FaceCaptureActivity) obj2;
                ListenableFuture listenableFuture = (ListenableFuture) obj;
                FaceCaptureActivity.a aVar = FaceCaptureActivity.f23821i;
                try {
                    if (!faceCaptureActivity.isDestroyed() && !faceCaptureActivity.isFinishing()) {
                        h hVar = (h) listenableFuture.get();
                        C0211p DEFAULT_FRONT_CAMERA = C0211p.f2091b;
                        Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
                        if (!hVar.hasCamera(DEFAULT_FRONT_CAMERA)) {
                            faceCaptureActivity.e();
                            return;
                        }
                        C1027h c1027h = new C1027h(faceCaptureActivity);
                        c1027h.j(DEFAULT_FRONT_CAMERA);
                        c1027h.l(1.0f);
                        c1027h.k(d.d(faceCaptureActivity), new j(faceCaptureActivity.f()));
                        p140j8.f.b();
                        c1027h.f14951D = faceCaptureActivity;
                        c1027h.n(null);
                        PreviewView previewView = faceCaptureActivity.f23822a;
                        if (previewView != null) {
                            previewView.setController(c1027h);
                            return;
                        } else {
                            Intrinsics.n("cameraPreview");
                            throw null;
                        }
                    }
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    faceCaptureActivity.e();
                    return;
                }
            case 4:
                LivenessActivity livenessActivity = (LivenessActivity) obj2;
                ListenableFuture listenableFuture2 = (ListenableFuture) obj;
                int i10 = LivenessActivity.f23837Y;
                try {
                    if (!livenessActivity.isDestroyed() && !livenessActivity.isFinishing()) {
                        h hVar2 = (h) listenableFuture2.get();
                        C0211p DEFAULT_FRONT_CAMERA2 = C0211p.f2091b;
                        Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA2, "DEFAULT_FRONT_CAMERA");
                        if (!hVar2.hasCamera(DEFAULT_FRONT_CAMERA2)) {
                            livenessActivity.f();
                            return;
                        }
                        C1027h c1027h2 = new C1027h(livenessActivity);
                        c1027h2.j(DEFAULT_FRONT_CAMERA2);
                        ExecutorService executorService = livenessActivity.f23848c;
                        Intrinsics.e(executorService);
                        c1027h2.k(executorService, new D6.b(livenessActivity.g()));
                        p140j8.f.b();
                        c1027h2.f14951D = livenessActivity;
                        c1027h2.n(null);
                        livenessActivity.f23846a = c1027h2;
                        PreviewView previewView2 = livenessActivity.f23847b;
                        if (previewView2 != null) {
                            previewView2.setController(c1027h2);
                            return;
                        } else {
                            Intrinsics.n("cameraPreview");
                            throw null;
                        }
                    }
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    livenessActivity.f();
                    return;
                }
            default:
                SelfieCaptureActivity selfieCaptureActivity = (SelfieCaptureActivity) obj2;
                ListenableFuture listenableFuture3 = (ListenableFuture) obj;
                int i11 = SelfieCaptureActivity.f23859v;
                try {
                    if (!selfieCaptureActivity.isDestroyed() && !selfieCaptureActivity.isFinishing()) {
                        h hVar3 = (h) listenableFuture3.get();
                        C0211p DEFAULT_FRONT_CAMERA3 = C0211p.f2091b;
                        Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA3, "DEFAULT_FRONT_CAMERA");
                        if (!hVar3.hasCamera(DEFAULT_FRONT_CAMERA3)) {
                            selfieCaptureActivity.g();
                            return;
                        }
                        C1027h c1027h3 = new C1027h(selfieCaptureActivity);
                        c1027h3.j(DEFAULT_FRONT_CAMERA3);
                        c1027h3.l(1.0f);
                        p140j8.f.b();
                        c1027h3.f14951D = selfieCaptureActivity;
                        c1027h3.n(null);
                        PreviewView previewView3 = selfieCaptureActivity.f23861b;
                        if (previewView3 == null) {
                            Intrinsics.n("cameraPreview");
                            throw null;
                        }
                        previewView3.setController(c1027h3);
                        selfieCaptureActivity.f23860a = c1027h3;
                        PpButton ppButton = selfieCaptureActivity.f23862c;
                        if (ppButton != null) {
                            ppButton.setEnabled(true);
                            return;
                        } else {
                            Intrinsics.n("captureButton");
                            throw null;
                        }
                    }
                    return;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    selfieCaptureActivity.g();
                    return;
                }
        }
    }
}
