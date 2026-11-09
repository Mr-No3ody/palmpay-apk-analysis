package p171lb;

import C0.G;
import Ja.q;
import Z4.e;
import android.os.Bundle;
import androidx.camera.core.impl.utils.n;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.resp.CLQueryFirstLoanBean;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLShortCashRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLWithdrawData;
import com.transsnet.palmpay.credit.bean.resp.CLWithdrawResp;
import com.transsnet.palmpay.credit.logicmanager.OneTouchBorrowManager$OneTouchBorrowListener;
import com.transsnet.palmpay.util.SPUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p221ob.c;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f39294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f39295g;

    public /* synthetic */ b(c cVar, int i7) {
        this.f39294f = i7;
        this.f39295g = cVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f39294f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                c.a(this.f39295g, d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                c.a(this.f39295g, d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                c.a(this.f39295g, d2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "d");
                c.a(this.f39295g, d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                c.a(this.f39295g, d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String str) {
        switch (this.f39294f) {
            case 0:
                n.u(str);
                OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener = this.f39295g.f39302e;
                if (oneTouchBorrowManager$OneTouchBorrowListener != null) {
                    oneTouchBorrowManager$OneTouchBorrowListener.onOneTouchBorrowInfoFail();
                }
                break;
            case 1:
                OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener2 = this.f39295g.f39302e;
                if (oneTouchBorrowManager$OneTouchBorrowListener2 != null) {
                    oneTouchBorrowManager$OneTouchBorrowListener2.onOneTouchBorrowInfoFail();
                }
                break;
            case 2:
                OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener3 = this.f39295g.f39302e;
                if (oneTouchBorrowManager$OneTouchBorrowListener3 != null) {
                    oneTouchBorrowManager$OneTouchBorrowListener3.onOneTouchBorrowInfoFail();
                }
                break;
            case 3:
                OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener4 = this.f39295g.f39302e;
                if (oneTouchBorrowManager$OneTouchBorrowListener4 != null) {
                    oneTouchBorrowManager$OneTouchBorrowListener4.onOneTouchBorrowInfoFail();
                }
                break;
            default:
                n.u(str);
                OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener5 = this.f39295g.f39302e;
                if (oneTouchBorrowManager$OneTouchBorrowListener5 != null) {
                    oneTouchBorrowManager$OneTouchBorrowListener5.onOneTouchBorrowInfoFail();
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        String orderId;
        Long loanAmount;
        Integer signType;
        switch (this.f39294f) {
            case 0:
                CLWithdrawResp response = (CLWithdrawResp) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                boolean zIsSuccess = response.isSuccess();
                c cVar = this.f39295g;
                if (!zIsSuccess) {
                    n.u(response.getRespMsg());
                    OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener = cVar.f39302e;
                    if (oneTouchBorrowManager$OneTouchBorrowListener != null) {
                        oneTouchBorrowManager$OneTouchBorrowListener.onOneTouchBorrowInfoFail();
                    }
                } else {
                    Bundle bundle = new Bundle();
                    CLWithdrawData data = response.getData();
                    bundle.putString("mOrderNo", data != null ? data.getOrderId() : null);
                    CLRepaymentPlanData cLRepaymentPlanData = cVar.f39300c;
                    bundle.putLong("mOrderAmount", (cLRepaymentPlanData == null || (loanAmount = cLRepaymentPlanData.getLoanAmount()) == null) ? 0L : loanAmount.longValue());
                    bundle.putBoolean("cl_free_pass_word", cVar.f39298a);
                    d.E(bundle, "/credit_score/cl_borrow_preview_activity");
                    SPUtils sPUtils = SPUtils.getInstance();
                    CLWithdrawData data2 = response.getData();
                    if (data2 == null || (orderId = data2.getOrderId()) == null) {
                        orderId = "";
                    }
                    sPUtils.put("cl_borrow_last_order_id", orderId);
                    OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener2 = cVar.f39302e;
                    if (oneTouchBorrowManager$OneTouchBorrowListener2 != null) {
                        oneTouchBorrowManager$OneTouchBorrowListener2.onOneTouchBorrowCreateOrderSuccess();
                    }
                }
                break;
            case 1:
                CLShortCashRepaymentPlanResp response2 = (CLShortCashRepaymentPlanResp) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                boolean zIsSuccess2 = response2.isSuccess();
                c cVar2 = this.f39295g;
                if (!zIsSuccess2) {
                    OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener3 = cVar2.f39302e;
                    if (oneTouchBorrowManager$OneTouchBorrowListener3 != null) {
                        oneTouchBorrowManager$OneTouchBorrowListener3.onOneTouchBorrowInfoFail();
                    }
                } else {
                    c.b(cVar2, response2);
                }
                break;
            case 2:
                CLShortCashRepaymentPlanResp response3 = (CLShortCashRepaymentPlanResp) obj;
                Intrinsics.checkNotNullParameter(response3, "response");
                boolean zIsSuccess3 = response3.isSuccess();
                c cVar3 = this.f39295g;
                if (!zIsSuccess3) {
                    OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener4 = cVar3.f39302e;
                    if (oneTouchBorrowManager$OneTouchBorrowListener4 != null) {
                        oneTouchBorrowManager$OneTouchBorrowListener4.onOneTouchBorrowInfoFail();
                    }
                } else {
                    c.b(cVar3, response3);
                }
                break;
            case 3:
                CLShortCashRepaymentPlanResp response4 = (CLShortCashRepaymentPlanResp) obj;
                Intrinsics.checkNotNullParameter(response4, "response");
                boolean zIsSuccess4 = response4.isSuccess();
                c cVar4 = this.f39295g;
                if (!zIsSuccess4) {
                    OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener5 = cVar4.f39302e;
                    if (oneTouchBorrowManager$OneTouchBorrowListener5 != null) {
                        oneTouchBorrowManager$OneTouchBorrowListener5.onOneTouchBorrowInfoFail();
                    }
                } else {
                    c.b(cVar4, response4);
                }
                break;
            default:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                c cVar5 = this.f39295g;
                if (commonBeanResult != null && commonBeanResult.isSuccess() && Intrinsics.c(((CLQueryFirstLoanBean) commonBeanResult.data).getFirstLoanFlag(), Boolean.TRUE) && (signType = ((CLQueryFirstLoanBean) commonBeanResult.data).getSignType()) != null && signType.intValue() == 2) {
                    Boolean freePasswordFlag = ((CLQueryFirstLoanBean) commonBeanResult.data).getFreePasswordFlag();
                    cVar5.f39298a = freePasswordFlag != null ? freePasswordFlag.booleanValue() : false;
                    int productSubId = ((CLQueryFirstLoanBean) commonBeanResult.data).getProductSubId();
                    G.h(c.f40268a).getProductDetail(Integer.valueOf(productSubId)).k(f.f42629b).i(p071ef.b.a()).subscribe(new q(cVar5, productSubId, 1));
                } else {
                    OneTouchBorrowManager$OneTouchBorrowListener oneTouchBorrowManager$OneTouchBorrowListener6 = cVar5.f39302e;
                    if (oneTouchBorrowManager$OneTouchBorrowListener6 != null) {
                        oneTouchBorrowManager$OneTouchBorrowListener6.onOneTouchBorrowInfoFail();
                    }
                }
                break;
        }
    }
}
