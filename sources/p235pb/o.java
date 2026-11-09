package p235pb;

import Z4.e;
import com.transsnet.palmpay.credit.bean.resp.OcReferEarnWithdrawResp;
import com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract;
import com.transsnet.palmpay.credit.ui.dialog.OcReferEarnWithdrawDialog;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f41292f;

    public o(p pVar) {
        this.f41292f = pVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f41292f.addSubscription(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        ((OcReferEarnHomeContract.View) this.f41292f.f27351a).showLoadingView(false);
        ToastUtils.showLong(message, new Object[0]);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        OcReferEarnWithdrawResp response = (OcReferEarnWithdrawResp) obj;
        Intrinsics.checkNotNullParameter(response, "response");
        p pVar = this.f41292f;
        ((OcReferEarnHomeContract.View) pVar.f27351a).showLoadingView(false);
        if (!response.isSuccess()) {
            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
            return;
        }
        int withdrawStatus = response.getData().getWithdrawStatus();
        if (withdrawStatus == 0) {
            ((OcReferEarnHomeContract.View) pVar.f27351a).withdrawResult(OcReferEarnWithdrawDialog.INSTANCE.getWITHDRAW_TYPE_PENDING());
        } else if (withdrawStatus == 1) {
            ((OcReferEarnHomeContract.View) pVar.f27351a).withdrawResult(OcReferEarnWithdrawDialog.INSTANCE.getWITHDRAW_TYPE_SUCC());
        } else {
            if (withdrawStatus != 9) {
                return;
            }
            ((OcReferEarnHomeContract.View) pVar.f27351a).withdrawResult(OcReferEarnWithdrawDialog.INSTANCE.getWITHDRAW_TYPE_FAIL_RISK());
        }
    }
}
