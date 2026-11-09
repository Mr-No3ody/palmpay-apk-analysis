package p382zb;

import L6.i;
import Ya.d;
import Ya.g;
import Z4.e;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.req.OcRouterReq;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.CLInitResp;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountResp;
import com.transsnet.palmpay.credit.bean.resp.OcInstallmentRaiseAmountRsp;
import com.transsnet.palmpay.credit.ui.fragment.OpenAccountBaseFragment;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f44604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OpenAccountBaseFragment f44605g;

    public /* synthetic */ m0(OpenAccountBaseFragment openAccountBaseFragment, int i7) {
        this.f44604f = i7;
        this.f44605g = openAccountBaseFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f44604f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44605g.f(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44605g.f(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44605g.f(d2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44605g.f(d2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44605g.f(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f44605g.f(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f44604f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f44605g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f44605g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f44605g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(message, "message");
                if (!TextUtils.isEmpty(message)) {
                    ToastUtils.showShort(message, new Object[0]);
                }
                break;
            default:
                if (!TextUtils.isEmpty(message)) {
                    ToastUtils.showShort(message, new Object[0]);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CLOpenAccountData cLOpenAccountData;
        switch (this.f44604f) {
            case 0:
                CLInitResp cLInitResp = (CLInitResp) obj;
                OpenAccountBaseFragment openAccountBaseFragment = this.f44605g;
                if (cLInitResp != null && cLInitResp.isSuccess()) {
                    if (cLInitResp.getData() != null) {
                        CLInitData data = cLInitResp.getData();
                        if (!TextUtils.isEmpty(data != null ? data.getApplyId() : null)) {
                            CLInitData data2 = cLInitResp.getData();
                            openAccountBaseFragment.f30492A = data2;
                            openAccountBaseFragment.f30493B = data2 != null ? data2.getApplyId() : null;
                            openAccountBaseFragment.showLoadingDialog(true);
                            Boolean bool = Boolean.FALSE;
                            OcRouterReq ocRouterReq = new OcRouterReq(bool, openAccountBaseFragment.f30502w, 2, openAccountBaseFragment.f30495H, bool, openAccountBaseFragment.f30501v, openAccountBaseFragment.f30493B);
                            c.f40268a.getInstance().getClass();
                            c.a().getRouterList(ocRouterReq).k(f.f42629b).i(b.a()).subscribe(new l0(openAccountBaseFragment));
                        }
                    }
                    openAccountBaseFragment.showLoadingDialog(false);
                    ToastUtils.showShort(openAccountBaseFragment.getString(g.cs_apply_id_empty), new Object[0]);
                } else {
                    openAccountBaseFragment.showLoadingDialog(false);
                    if (TextUtils.equals("LOAN_BIND_KYC_NUMBER_ERROR", cLInitResp != null ? cLInitResp.getRespCode() : null)) {
                        O6.c cVar = new O6.c(openAccountBaseFragment.requireContext());
                        cVar.f6607m = d.cs_authentication_failed_icon;
                        cVar.e(g.cs_cl_authentication_failed);
                        cVar.f6598d = cLInitResp != null ? cLInitResp.getRespMsg() : null;
                        cVar.d(g.cs_confirm, null);
                        cVar.f6615v = i.ppFlexiCashDialogTheme;
                        cVar.g();
                    } else if (!TextUtils.isEmpty(cLInitResp != null ? cLInitResp.getRespMsg() : null)) {
                        ToastUtils.showShort(cLInitResp != null ? cLInitResp.getRespMsg() : null, new Object[0]);
                    }
                }
                break;
            case 1:
                CLOpenAccountResp cLOpenAccountResp = (CLOpenAccountResp) obj;
                OpenAccountBaseFragment openAccountBaseFragment2 = this.f44605g;
                openAccountBaseFragment2.showLoadingDialog(false);
                if (cLOpenAccountResp != null) {
                    if (((!cLOpenAccountResp.isSuccess() || cLOpenAccountResp.getData() == null) ? null : cLOpenAccountResp) != null) {
                        OpenAccountBaseFragment.w(openAccountBaseFragment2, cLOpenAccountResp.getData());
                    }
                }
                break;
            case 2:
                OcInstallmentRaiseAmountRsp ocInstallmentRaiseAmountRsp = (OcInstallmentRaiseAmountRsp) obj;
                OpenAccountBaseFragment openAccountBaseFragment3 = this.f44605g;
                openAccountBaseFragment3.showLoadingDialog(false);
                if (ocInstallmentRaiseAmountRsp == null || !ocInstallmentRaiseAmountRsp.isSuccess() || (cLOpenAccountData = ocInstallmentRaiseAmountRsp.data) == null) {
                    ToastUtils.showShort(ocInstallmentRaiseAmountRsp != null ? ocInstallmentRaiseAmountRsp.getRespMsg() : null, new Object[0]);
                } else {
                    OpenAccountBaseFragment.w(openAccountBaseFragment3, cLOpenAccountData);
                }
                break;
            case 3:
                CommonResult commonResult = (CommonResult) obj;
                if (commonResult == null || !commonResult.isSuccess()) {
                    ToastUtils.showShort(commonResult != null ? commonResult.getRespMsg() : null, new Object[0]);
                }
                break;
            case 4:
                CommonResult commonResult2 = (CommonResult) obj;
                if (commonResult2 == null || !commonResult2.isSuccess()) {
                    if (!TextUtils.isEmpty(commonResult2 != null ? commonResult2.getRespMsg() : null)) {
                        ToastUtils.showShort(commonResult2 != null ? commonResult2.getRespMsg() : null, new Object[0]);
                    }
                }
                break;
            default:
                CommonResult commonResult3 = (CommonResult) obj;
                if (commonResult3 == null || !commonResult3.isSuccess()) {
                    if (!TextUtils.isEmpty(commonResult3 != null ? commonResult3.getRespMsg() : null)) {
                        ToastUtils.showShort(commonResult3 != null ? commonResult3.getRespMsg() : null, new Object[0]);
                    }
                }
                break;
        }
    }
}
