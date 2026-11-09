package p294tb;

import C0.G;
import android.text.TextUtils;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.credit.bean.req.CLComparePhotoReq;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoActivity;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 implements FileUploadManager.UploadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLTakePhotoActivity f42505a;

    public r0(CLTakePhotoActivity cLTakePhotoActivity) {
        this.f42505a = cLTakePhotoActivity;
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onComplete(String str, File file) {
        String str2;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        CLTakePhotoActivity cLTakePhotoActivity = this.f42505a;
        if (zIsEmpty) {
            cLTakePhotoActivity.runOnUiThread(new q0(cLTakePhotoActivity, 1));
            return;
        }
        if (TextUtils.isEmpty(cLTakePhotoActivity.f29138D0)) {
            if (Intrinsics.c(cLTakePhotoActivity.f29249C, "oc_use_type_router")) {
                str2 = Intrinsics.c(cLTakePhotoActivity.f29261w, "OK_CARD") ? "OK_CARD_APPLY" : "CASH_LOAN_APPLY";
            } else {
                str2 = Intrinsics.c(cLTakePhotoActivity.f29261w, "OK_CARD") ? "OK_CARD_RAISE" : "CASH_LOAN_RAISE";
            }
            cLTakePhotoActivity.f29138D0 = str2;
        }
        IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
        OcApplyData ocApplyData = cLTakePhotoActivity.f29248B;
        iApiCreditServiceH.comparePhoto(new CLComparePhotoReq(ocApplyData != null ? ocApplyData.getApplyId() : null, str, cLTakePhotoActivity.f29261w, cLTakePhotoActivity.f29138D0)).k(f.f42629b).i(b.a()).subscribe(new C2055q(cLTakePhotoActivity, 4));
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onError(Exception exc) {
        CLTakePhotoActivity cLTakePhotoActivity = this.f42505a;
        cLTakePhotoActivity.runOnUiThread(new q0(cLTakePhotoActivity, 0));
        if (exc != null) {
            exc.printStackTrace();
        }
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onProgressChanged(long j6, long j10) {
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onStartSync(String str, File file) {
    }
}
