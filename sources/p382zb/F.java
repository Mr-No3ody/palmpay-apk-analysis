package p382zb;

import Z4.e;
import com.transsnet.palmpay.credit.bean.resp.OcInterestRulesResp;
import com.transsnet.palmpay.credit.bean.rsp.OcBillDetailResp;
import com.transsnet.palmpay.credit.bean.rsp.OcCurBillData;
import com.transsnet.palmpay.credit.ui.fragment.OcBillFragment;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f44524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OcBillFragment f44525g;

    public /* synthetic */ F(OcBillFragment ocBillFragment, int i7) {
        this.f44524f = i7;
        this.f44525g = ocBillFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f44524f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44525g.f(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44525g.f(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44525g.f(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f44524f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f44525g.showLoadingDialog(false);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        switch (this.f44524f) {
            case 0:
                OcBillDetailResp ocBillDetailResp = (OcBillDetailResp) obj;
                if (ocBillDetailResp != null && ocBillDetailResp.isSuccess()) {
                    OcCurBillData data = ocBillDetailResp.getData();
                    OcBillFragment ocBillFragment = this.f44525g;
                    ocBillFragment.f30373A0 = data;
                    OcBillFragment.u(ocBillFragment);
                    OcBillFragment.t(ocBillFragment);
                    ocBillFragment.w(true);
                } else {
                    ToastUtils.showShort(ocBillDetailResp != null ? ocBillDetailResp.getRespMsg() : null, new Object[0]);
                }
                break;
            case 1:
                OcBillDetailResp ocBillDetailResp2 = (OcBillDetailResp) obj;
                if (ocBillDetailResp2 != null && ocBillDetailResp2.isSuccess()) {
                    OcCurBillData data2 = ocBillDetailResp2.getData();
                    OcBillFragment ocBillFragment2 = this.f44525g;
                    ocBillFragment2.f30373A0 = data2;
                    OcBillFragment.u(ocBillFragment2);
                    OcBillFragment.t(ocBillFragment2);
                    ocBillFragment2.w(true);
                } else {
                    ToastUtils.showShort(ocBillDetailResp2 != null ? ocBillDetailResp2.getRespMsg() : null, new Object[0]);
                }
                break;
            default:
                OcInterestRulesResp ocInterestRulesResp = (OcInterestRulesResp) obj;
                if (ocInterestRulesResp != null && ocInterestRulesResp.isSuccess()) {
                    this.f44525g.f30375B0 = ocInterestRulesResp.getData();
                } else {
                    ToastUtils.showShort(ocInterestRulesResp != null ? ocInterestRulesResp.getRespMsg() : null, new Object[0]);
                }
                break;
        }
    }
}
