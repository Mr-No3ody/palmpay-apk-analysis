package p235pb;

import O6.c;
import O6.d;
import Z4.e;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.resp.OcOrderRsp;
import com.transsnet.palmpay.credit.contract.OcPrePayPreviewContract;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRePayPreviewActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f41297f;

    public u(v vVar) {
        this.f41297f = vVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f41297f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        this.f41297f.f41298f.showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        OcOrderRsp ocOrderRsp = (OcOrderRsp) obj;
        v vVar = this.f41297f;
        vVar.f41298f.showLoadingDialog(false);
        if (ocOrderRsp.isSuccess() && ocOrderRsp.getData() != null) {
            ((OcPrePayPreviewContract.IPreviewView) vVar.f27351a).launchPay(ocOrderRsp);
            return;
        }
        if (!CommonResult.CODE_POST_PAY_ERROR_ONE.equals(ocOrderRsp.getRespCode()) && !CommonResult.CODE_POST_PAY_ERROR_TWO.equals(ocOrderRsp.getRespCode()) && !CommonResult.CODE_POST_PAY_ERROR_THREE.equals(ocOrderRsp.getRespCode())) {
            ToastUtils.showLong(ocOrderRsp.getRespMsg());
            return;
        }
        OcRePayPreviewActivity ocRePayPreviewActivity = vVar.f41298f;
        c cVar = new c(ocRePayPreviewActivity);
        cVar.f6596b = d.f("");
        cVar.f6598d = ocOrderRsp.getRespMsg();
        cVar.f6606l = 8388611;
        cVar.f6600f = ocRePayPreviewActivity.getString(k.core_confirm);
        cVar.f6602h = null;
        d dVarA = cVar.a();
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.setCancelable(true);
        dVarA.show();
    }
}
