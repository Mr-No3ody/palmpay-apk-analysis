package p294tb;

import C0.G;
import L6.i;
import Pa.C0525w;
import Ya.d;
import Ya.g;
import Z4.e;
import android.text.TextUtils;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.req.OcRouterReq;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.CLInitResp;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountResp;
import com.transsnet.palmpay.credit.bean.resp.OcInstallmentRaiseAmountRsp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.a;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f42393g;

    public /* synthetic */ A(a aVar, int i7) {
        this.f42392f = i7;
        this.f42393g = aVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42392f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42393g.addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42393g.addSubscription(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42393g.addSubscription(d2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42393g.addSubscription(d2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42393g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42393g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42392f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f42393g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f42393g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f42393g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        Integer sceneType;
        switch (this.f42392f) {
            case 0:
                CLInitResp cLInitResp = (CLInitResp) obj;
                a aVar = this.f42393g;
                if (cLInitResp != null && cLInitResp.isSuccess()) {
                    if (cLInitResp.getData() != null) {
                        CLInitData data = cLInitResp.getData();
                        if (!TextUtils.isEmpty(data != null ? data.getApplyId() : null)) {
                            CLInitData data2 = cLInitResp.getData();
                            aVar.f29204g = data2;
                            aVar.f29203f = data2 != null ? data2.getApplyId() : null;
                            aVar.showLoadingDialog(true);
                            aVar.f29202e = "";
                            G.h(c.f40268a).getRouterList(new OcRouterReq(Boolean.FALSE, aVar.f29209v, 2, aVar.t, Boolean.valueOf(aVar.f29197B), aVar.f29196A, aVar.f29203f)).k(f.f42629b).i(b.a()).subscribe(new C2063z(aVar));
                        }
                    }
                    aVar.showLoadingDialog(false);
                    ToastUtils.showShort(aVar.getString(g.cs_apply_id_empty), new Object[0]);
                } else {
                    aVar.showLoadingDialog(false);
                    if (TextUtils.equals("LOAN_BIND_KYC_NUMBER_ERROR", cLInitResp != null ? cLInitResp.getRespCode() : null)) {
                        O6.c cVar = new O6.c(aVar);
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
                a aVar2 = this.f42393g;
                aVar2.showLoadingDialog(false);
                if (cLOpenAccountResp != null) {
                    if (((!cLOpenAccountResp.isSuccess() || cLOpenAccountResp.getData() == null) ? null : cLOpenAccountResp) != null) {
                        CLOpenAccountData data3 = cLOpenAccountResp.getData();
                        CLInitData cLInitData = aVar2.f29204g;
                        if (cLInitData == null || (sceneType = cLInitData.getSceneType()) == null || sceneType.intValue() != 1) {
                            ARouter.getInstance().build(Intrinsics.c(aVar2.f29209v, "INSTALLMENT_LOAN") ? "/credit_score/ol_upgrade_installment_result_activity" : "/credit_score/ol_open_result_activity").withString("cl_open_result", ((Gson) C0525w.f().f7166b).toJson(data3)).withString("cl_loan_product_type", aVar2.f29209v).navigation();
                        } else {
                            com.palmpay.lib.apm.launchcounter.util.d.x(null, "CreditBindSuccess");
                        }
                    }
                }
                break;
            case 2:
                OcInstallmentRaiseAmountRsp ocInstallmentRaiseAmountRsp = (OcInstallmentRaiseAmountRsp) obj;
                a aVar3 = this.f42393g;
                aVar3.showLoadingDialog(false);
                if (ocInstallmentRaiseAmountRsp == null || !ocInstallmentRaiseAmountRsp.isSuccess() || ocInstallmentRaiseAmountRsp.data == null) {
                    ToastUtils.showShort(ocInstallmentRaiseAmountRsp != null ? ocInstallmentRaiseAmountRsp.getRespMsg() : null, new Object[0]);
                } else {
                    ARouter.getInstance().build("/credit_score/ol_open_result_activity").withString("cl_open_result", ((Gson) C0525w.f().f7166b).toJson(ocInstallmentRaiseAmountRsp.data)).withString("cl_loan_product_type", aVar3.f29209v).navigation();
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
                    ToastUtils.showShort(commonResult2 != null ? commonResult2.getRespMsg() : null, new Object[0]);
                }
                break;
            default:
                break;
        }
    }

    private final void R(String str) {
    }
}
