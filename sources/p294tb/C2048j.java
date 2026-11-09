package p294tb;

import C0.G;
import F6.d;
import Pa.r0;
import Z4.e;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.core.impl.utils.n;
import com.transsnet.adsdk.widgets.banner.bannerview.b;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowRepaymentPlanResp;
import com.transsnet.palmpay.credit.bean.resp.CLFirstRepaymentData;
import com.transsnet.palmpay.credit.bean.resp.CLFirstRepaymentResp;
import com.transsnet.palmpay.credit.bean.rsp.QueryLoanUserConfigBean;
import com.transsnet.palmpay.credit.bean.rsp.QueryLoanUserConfigResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBorrowResultActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLDirectDebitHintDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLFirstBorrowDialog;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p221ob.c;
import p298tf.f;
import p355xf.o;
import p355xf.q;

/* JADX INFO: renamed from: tb.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2048j extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CLBorrowResultActivity f42479g;

    public /* synthetic */ C2048j(CLBorrowResultActivity cLBorrowResultActivity, int i7) {
        this.f42478f = i7;
        this.f42479g = cLBorrowResultActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42478f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42479g.addSubscription(d2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42479g.addSubscription(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42479g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42479g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42478f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                CLBorrowResultActivity cLBorrowResultActivity = this.f42479g;
                cLBorrowResultActivity.showLoadingDialog(false);
                CLBorrowResultActivity.m(cLBorrowResultActivity);
                Intrinsics.checkNotNullExpressionValue(2, "STATUS_FAIL");
                cLBorrowResultActivity.p(2, null);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(message, "message");
                this.f42479g.showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 2:
                CLBorrowResultActivity cLBorrowResultActivity2 = this.f42479g;
                cLBorrowResultActivity2.showLoadingDialog(false);
                if (!TextUtils.isEmpty(message)) {
                    h.x(cLBorrowResultActivity2, message);
                }
                break;
            default:
                CLBorrowResultActivity cLBorrowResultActivity3 = this.f42479g;
                cLBorrowResultActivity3.showLoadingDialog(false);
                if (!TextUtils.isEmpty(message)) {
                    h.x(cLBorrowResultActivity3, message);
                }
                break;
        }
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CLBorrowRepaymentPlanData data;
        CLBorrowRepaymentPlanData data2;
        Integer withdrawStatus;
        Integer withdrawStatus2;
        Integer withdrawStatus3;
        Integer withdrawStatus4;
        Object objF;
        Long repaymentDate;
        CLBorrowResultActivity cLBorrowResultActivity = this.f42479g;
        switch (this.f42478f) {
            case 0:
                CLBorrowRepaymentPlanResp cLBorrowRepaymentPlanResp = (CLBorrowRepaymentPlanResp) obj;
                cLBorrowResultActivity.showLoadingDialog(false);
                if (cLBorrowRepaymentPlanResp == null || !cLBorrowRepaymentPlanResp.isSuccess() || cLBorrowRepaymentPlanResp.getData() == null) {
                    CLBorrowResultActivity.m(cLBorrowResultActivity);
                    Intrinsics.checkNotNullExpressionValue(2, "STATUS_FAIL");
                    cLBorrowResultActivity.p(2, null);
                    ToastUtils.showShort(cLBorrowRepaymentPlanResp != null ? cLBorrowRepaymentPlanResp.getRespMsg() : null, new Object[0]);
                } else {
                    CLBorrowRepaymentPlanData data3 = cLBorrowRepaymentPlanResp.getData();
                    if ((data3 == null || (withdrawStatus4 = data3.getWithdrawStatus()) == null || withdrawStatus4.intValue() != -1) && (((data = cLBorrowRepaymentPlanResp.getData()) == null || (withdrawStatus3 = data.getWithdrawStatus()) == null || withdrawStatus3.intValue() != 0) && ((data2 = cLBorrowRepaymentPlanResp.getData()) == null || (withdrawStatus2 = data2.getWithdrawStatus()) == null || withdrawStatus2.intValue() != 1))) {
                        CLBorrowRepaymentPlanData data4 = cLBorrowRepaymentPlanResp.getData();
                        if (data4 == null || (withdrawStatus = data4.getWithdrawStatus()) == null || withdrawStatus.intValue() != 3) {
                            CLBorrowResultActivity.m(cLBorrowResultActivity);
                            Intrinsics.checkNotNullExpressionValue(2, "STATUS_FAIL");
                            cLBorrowResultActivity.p(2, null);
                        } else {
                            CLBorrowResultActivity.m(cLBorrowResultActivity);
                            Intrinsics.checkNotNullExpressionValue(1, "STATUS_SUCCESS");
                            cLBorrowResultActivity.p(1, cLBorrowRepaymentPlanResp.getData());
                        }
                    } else {
                        cLBorrowResultActivity.f28886Z.postDelayed(new b(cLBorrowResultActivity, 28), 2000L);
                        Intrinsics.checkNotNullExpressionValue(3, "STATUS_PENDING");
                        cLBorrowResultActivity.p(3, null);
                    }
                }
                break;
            case 1:
                CLFirstRepaymentResp cLFirstRepaymentResp = (CLFirstRepaymentResp) obj;
                cLBorrowResultActivity.showLoadingDialog(false);
                if (cLFirstRepaymentResp != null && cLFirstRepaymentResp.isSuccess()) {
                    CLFirstRepaymentData data5 = cLFirstRepaymentResp.getData();
                    if (data5 != null ? Intrinsics.c(data5.getIfPopUp(), Boolean.TRUE) : false) {
                        CLFirstRepaymentData data6 = cLFirstRepaymentResp.getData();
                        new CLFirstBorrowDialog(cLBorrowResultActivity, Long.valueOf((data6 == null || (repaymentDate = data6.getRepaymentDate()) == null) ? 0L : repaymentDate.longValue()), 1000000L).show();
                    }
                }
                if (cLFirstRepaymentResp != null && cLFirstRepaymentResp.isSuccess()) {
                    CLFirstRepaymentData data7 = cLFirstRepaymentResp.getData();
                    if (data7 != null ? Intrinsics.c(data7.getIfFirstTrade(), Boolean.TRUE) : false) {
                        int i7 = CLBorrowResultActivity.f28876k0;
                        try {
                            o oVar = q.f43977a;
                            String strX1 = r0.X1(cLBorrowResultActivity.f28885Y, "MMM dd");
                            if (strX1 != null && strX1.length() != 0) {
                                new CLDirectDebitHintDialog(cLBorrowResultActivity, strX1).show();
                                objF = Unit.f38893a;
                                Throwable thA = q.a(objF);
                                if (thA != null) {
                                    d.c(cLBorrowResultActivity.TAG, thA);
                                }
                            }
                        } catch (Throwable th) {
                            o oVar2 = q.f43977a;
                            objF = g.f(th);
                        }
                    }
                }
                break;
            case 2:
                QueryLoanUserConfigResp response = (QueryLoanUserConfigResp) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                cLBorrowResultActivity.showLoadingDialog(false);
                QueryLoanUserConfigBean data8 = response.getData();
                if ((data8 != null ? data8.getLanguageType() : null) == null) {
                    int i10 = CLBorrowResultActivity.f28876k0;
                    cLBorrowResultActivity.showLoadingDialog(true);
                    G.h(c.f40268a).querySysConfig("CREDIT_LANGUAGE", Boolean.FALSE).k(f.f42629b).i(p071ef.b.a()).subscribe(new C2050l(cLBorrowResultActivity));
                }
                break;
            default:
                CommonResult commonResult = (CommonResult) obj;
                cLBorrowResultActivity.showLoadingDialog(false);
                n.u(commonResult != null ? commonResult.getRespMsg() : null);
                break;
        }
    }
}
