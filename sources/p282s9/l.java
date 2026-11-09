package p282s9;

import Pa.n0;
import android.content.Intent;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.betting.ui.view.ModelBettingRootView;
import com.transsnet.palmpay.betting.viewmodel.BettingDepositViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.teller.bean.CreateBettingOrderReq;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.ui.activity.BeneficiariesActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p270rd.C1976t;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements ModelBettingRootView.BettingRootCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BettingHomeActivity f42087a;

    public l(BettingHomeActivity bettingHomeActivity) {
        this.f42087a = bettingHomeActivity;
    }

    @Override // com.transsnet.palmpay.betting.ui.view.ModelBettingRootView.BettingRootCallback
    public final void onBillerClick() {
        BettingHomeActivity bettingHomeActivity = this.f42087a;
        if (bettingHomeActivity.f26668Q == null) {
            ((BettingDepositViewModel) bettingHomeActivity.l()).e(new f(bettingHomeActivity, 3));
        } else {
            BettingHomeActivity.q(bettingHomeActivity);
        }
    }

    @Override // com.transsnet.palmpay.betting.ui.view.ModelBettingRootView.BettingRootCallback
    public final void onBillerItemSelected(BettingBillerListItemBean biller) {
        Intrinsics.checkNotNullParameter(biller, "biller");
        BettingHomeActivity bettingHomeActivity = this.f42087a;
        KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
        bettingHomeActivity.t(biller, true, new C1976t(2));
    }

    @Override // com.transsnet.palmpay.betting.ui.view.ModelBettingRootView.BettingRootCallback
    public final void onContactsClick() {
        BettingHomeActivity bettingHomeActivity = this.f42087a;
        Intent intent = new Intent(bettingHomeActivity, (Class<?>) BeneficiariesActivity.class);
        intent.putExtra("KEY_CATEGORY_ID", "8");
        bettingHomeActivity.f26684v0.a(intent);
        n0.g().l("PPay_Betting_Btn_Contacts");
    }

    @Override // com.transsnet.palmpay.betting.ui.view.ModelBettingRootView.BettingRootCallback
    public final void onGoNextClick() {
        KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
        BettingHomeActivity bettingHomeActivity = this.f42087a;
        BettingBillerListItemBean bettingBillerListItemBeanR = bettingHomeActivity.r();
        String billerId = bettingBillerListItemBeanR != null ? bettingBillerListItemBeanR.getBillerId() : null;
        BettingBillerListItemBean bettingBillerListItemBeanR2 = bettingHomeActivity.r();
        String billerName = bettingBillerListItemBeanR2 != null ? bettingBillerListItemBeanR2.getBillerName() : null;
        ModelBettingRootView modelBettingRootView = bettingHomeActivity.f26676p;
        Long lValueOf = Long.valueOf(modelBettingRootView != null ? modelBettingRootView.getAmount() : 0L);
        String str = null;
        String str2 = billerName;
        String currency = BaseApplication.getCurrency();
        ModelBettingRootView modelBettingRootView2 = bettingHomeActivity.f26676p;
        String customerId = modelBettingRootView2 != null ? modelBettingRootView2.getCustomerId() : null;
        BettingBillerListItemBean bettingBillerListItemBeanR3 = bettingHomeActivity.r();
        String institutionLogo = bettingBillerListItemBeanR3 != null ? bettingBillerListItemBeanR3.getInstitutionLogo() : null;
        PaymentItemBean paymentItemBean = bettingHomeActivity.f26671Z;
        String str3 = paymentItemBean != null ? paymentItemBean.paymentItemId : null;
        if (paymentItemBean != null) {
            str = paymentItemBean.paymentItemName;
        }
        CreateBettingOrderReq createBettingOrderReq = new CreateBettingOrderReq(billerId, str2, lValueOf, currency, customerId, institutionLogo, str3, str, TransType.TRANS_TYPE_BILLER_BETTING, true, bettingHomeActivity.f26675o);
        BettingDepositViewModel bettingDepositViewModel = (BettingDepositViewModel) bettingHomeActivity.l();
        if (bettingDepositViewModel != null) {
            bettingDepositViewModel.d(createBettingOrderReq);
        }
    }
}
