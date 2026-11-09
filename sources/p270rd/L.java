package p270rd;

import Kd.F0;
import Pa.n0;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.send_money.bean.TransferData;
import com.transsnet.palmpay.send_money.bean.event.CouponEvent;
import com.transsnet.palmpay.send_money.bean.event.TransactionEvent;
import com.transsnet.palmpay.send_money.bean.resp.AddFavoriteReq;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.viewmodel.TransferResultViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.c;
import p068ec.d;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class L implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferResultActivity f41693b;

    public /* synthetic */ L(TransferResultActivity transferResultActivity, int i7) {
        this.f41692a = i7;
        this.f41693b = transferResultActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TransferResultActivity transferResultActivity = this.f41693b;
        switch (this.f41692a) {
            case 0:
                TransferResultActivity.p(transferResultActivity, "TransferPaymentResultsClick", "CustomerService");
                if (transferResultActivity.f33249e != null) {
                    transferResultActivity.r();
                }
                break;
            case 1:
                ArrayList arrayList = TransferResultActivity.f33237Z;
                transferResultActivity.getOnBackPressedDispatcher().d();
                break;
            case 2:
                PayByOrderResp.DataBean dataBean = transferResultActivity.f33248d;
                if (dataBean != null) {
                    if (dataBean.payStatus == 1) {
                        n0.g().l("Transfer_SuccessfulResult_Complete_Click");
                        transferResultActivity.q();
                    } else {
                        c.b().f(new CouponEvent());
                        c cVarB = c.b();
                        TransactionEvent transactionEvent = new TransactionEvent();
                        transactionEvent.setSendAgain(true);
                        cVarB.f(transactionEvent);
                        for (Class cls : TransferResultActivity.f33238k0) {
                            if (ActivityUtils.isActivityExistsInStack((Class<?>) cls)) {
                                ActivityUtils.finishToActivity((Class<?>) cls, false);
                                transferResultActivity.finish();
                                break;
                            }
                        }
                        transferResultActivity.q();
                    }
                }
                break;
            case 3:
                ArrayList arrayList2 = TransferResultActivity.f33237Z;
                n0.g().l("Transfer_SuccessfulResult_ShareReceipt_Click");
                PayByOrderResp.DataBean dataBean2 = transferResultActivity.f33248d;
                if (dataBean2 != null) {
                    ARouter.getInstance().build("/sm/receipt").withString("extra_id", dataBean2.orderNo).navigation();
                }
                break;
            case 4:
                if (transferResultActivity.f33248d != null) {
                    n0.g().l("Transfer_SuccessfulResult_AddToFavorite_Click");
                    TransferResultViewModel transferResultViewModel = (TransferResultViewModel) transferResultActivity.l();
                    AddFavoriteReq req = new AddFavoriteReq();
                    TransferData transferData = transferResultActivity.f33249e;
                    if (transferData != null) {
                        req.setOrderId(transferData.getOrderNo());
                        req.setRecipientBankAccount(transferData.recipientBankAccount);
                        req.setRecipientBankCode(transferData.recipientBankCode);
                        req.setRecipientBankName(transferData.recipientBankName);
                        req.setRecipientMobileNo(transferData.recipientPhone);
                    }
                    d function = new d(transferResultActivity, 12);
                    transferResultViewModel.getClass();
                    Intrinsics.checkNotNullParameter(req, "req");
                    Intrinsics.checkNotNullParameter(function, "function");
                    F0 f1 = new F0(req, null);
                    l lVar = transferResultViewModel.f34038j;
                    lVar.f27356m = function;
                    Unit unit = Unit.f38893a;
                    f.v(transferResultViewModel, f1, lVar, 0L);
                }
                break;
            default:
                TransferResultActivity.p(transferResultActivity, "TransferPaymentResultsClick", "CustomerService");
                if (transferResultActivity.f33249e != null) {
                    transferResultActivity.r();
                }
                break;
        }
    }
}
