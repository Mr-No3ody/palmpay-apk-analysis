package Ce;

import Ab.ViewOnClickListenerC0053e;
import Kd.L0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.bean.response.CashHomeRewardsInfo;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.InterBankCashInInstructionDetailActivity;
import com.transsnet.palmpay.cash_in.ui.dialog.FundUSSDCompleteLastOrderDialog;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawHomeFragment;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawRecordDetailFragment;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawV2Fragment;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.dialog.MonthPickDialog;
import com.transsnet.palmpay.core.dialog.NgSelectBankCardDialog;
import com.transsnet.palmpay.core.ui.dialog.BillDetailProcessDialog;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.OutstandingAccount;
import com.transsnet.palmpay.credit.bean.OutstandingContentInfo;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.AgentInformationCardData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.CLPhoneInstallmentMainData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.DefaultInfoData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.VirtualAccountData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCashLoanBill;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.ui.dialog.AvailableCouponListDialogFragment;
import com.transsnet.palmpay.credit.ui.viewmodel.AvailableCouponItem;
import com.transsnet.palmpay.credit.view.AgentInformationView;
import com.transsnet.palmpay.credit.view.CLMultipleCashProductView;
import com.transsnet.palmpay.credit.view.DefaultInfoView;
import com.transsnet.palmpay.credit.view.OcCommonBillCard;
import com.transsnet.palmpay.credit.view.TotalOutstandingView;
import com.transsnet.palmpay.credit.view.VaTransferRepaymentInfoView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.OrderCompensateBean;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeRecentlyFragment;
import com.transsnet.palmpay.send_money.ui.view.BankCustomerServiceView;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayAccountView;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayProgressView;
import com.transsnet.palmpay.ui.fragment.BankAccountFragment;
import com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.ui.fragment.MeBalanceStatementFragment;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.MainUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ce.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0159a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1461b;

    public /* synthetic */ ViewOnClickListenerC0159a(Object obj, int i7) {
        this.f1460a = i7;
        this.f1461b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ImageView view2;
        int i7;
        MonthPickDialog monthPickDialog;
        NgSelectBankCardDialog ngSelectBankCardDialog;
        CLBorrowCouponData coupon;
        CLMainCashLoanBill currentCashLoanBill;
        OutstandingAccount outstandingAccount;
        OutstandingAccount outstandingAccount2;
        OutstandingAccount outstandingAccount3;
        OutstandingAccount outstandingAccount4;
        Long l5;
        VirtualAccountData virtualAccountData;
        str = null;
        String str = null;
        loanNo = null;
        String loanNo = null;
        Object obj = this.f1461b;
        switch (this.f1460a) {
            case 0:
                BankAccountFragment bankAccountFragment = (BankAccountFragment) obj;
                bankAccountFragment.getClass();
                User user = BaseApplication.getInstance().getUser();
                if (user == null || !(user.shouldApplyForBalance() || user.getSvaStatus() == 2)) {
                    ARouter.getInstance().build("/coreImpl/bind_new_bank_account").withInt("extra_type", 2).withBoolean("real_name_auth", true).navigation(bankAccountFragment.getActivity());
                    return;
                } else {
                    N8.q0.u("/account/ask_apply_for_balance");
                    return;
                }
            case 1:
                BankCardAndAccountFragment bankCardAndAccountFragment = (BankCardAndAccountFragment) obj;
                bankCardAndAccountFragment.f35062v.a();
                bankCardAndAccountFragment.f35061p.setVisibility(8);
                bankCardAndAccountFragment.B();
                return;
            case 2:
                MainUtils.requestNotificationPermission(((HomeFragment) obj).getActivity());
                return;
            case 3:
                int i10 = HomePalmZoneTabV2.f35134Z;
                HomePalmZoneTabV2 homePalmZoneTabV2 = (HomePalmZoneTabV2) obj;
                Context contextRequireContext = homePalmZoneTabV2.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Ge.i iVar = new Ge.i(contextRequireContext, new N(homePalmZoneTabV2));
                Object value = iVar.f3404c.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                p220oa.h.s((View) value, false);
                Object value2 = iVar.f3403b.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                p220oa.h.s((View) value2, false);
                Bc.i iVar2 = homePalmZoneTabV2.f35139L;
                if (iVar2 == null || (view2 = ((PpTitleBar) iVar2.f725c).getRightImageView1()) == null) {
                    return;
                }
                int dp = CommonViewExtKt.getDp(-16.0f);
                Intrinsics.checkNotNullParameter(view2, "view");
                iVar.showAsDropDown(view2, 0, dp, 5);
                return;
            case 4:
                MeBalanceStatementFragment.a aVar = MeBalanceStatementFragment.f35209Z;
                if (view.getId() == Ac.e.tvMonth) {
                    MeBalanceStatementFragment meBalanceStatementFragment = (MeBalanceStatementFragment) obj;
                    MonthPickDialog monthPickDialog2 = meBalanceStatementFragment.f35223w;
                    if (monthPickDialog2 != null) {
                        monthPickDialog2.show();
                    }
                    MonthPickDialog monthPickDialog3 = meBalanceStatementFragment.f35223w;
                    if (monthPickDialog3 != null) {
                        monthPickDialog3.setCanceledOnTouchOutside(true);
                    }
                    int i11 = meBalanceStatementFragment.f35214L;
                    if (i11 <= 0 || (i7 = meBalanceStatementFragment.f35215M) <= 0 || (monthPickDialog = meBalanceStatementFragment.f35223w) == null) {
                        return;
                    }
                    monthPickDialog.setNowPickDate(i7, i11);
                    return;
                }
                return;
            case 5:
                Pa.n0.g().v("AddMoney_Copy_Click");
                CharSequence text = ((D9.c) obj).f1711g.getText();
                if (TextUtils.isEmpty(text)) {
                    return;
                }
                ClipboardUtils.copyText(kotlin.text.y.k(text.toString(), " ", ""));
                androidx.camera.core.impl.utils.n.w("Copied Successfully");
                return;
            case 6:
                int i12 = InterBankCashInInstructionDetailActivity.f26992g;
                ((InterBankCashInInstructionDetailActivity) obj).finish();
                return;
            case 7:
                AvailableCouponItem availableCouponItem = (AvailableCouponItem) obj;
                List list = availableCouponItem.f30671o;
                if (list != null) {
                    List list2 = list.isEmpty() ? null : list;
                    if (list2 != null) {
                        AvailableCouponListDialogFragment availableCouponListDialogFragmentNewInstance = AvailableCouponListDialogFragment.f29932H.newInstance(new ArrayList<>(list2));
                        Context context = availableCouponItem.getContext();
                        Intrinsics.f(context, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                        androidx.fragment.app.Z supportFragmentManager = ((BaseActivity) context).getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                        availableCouponListDialogFragmentNewInstance.show(supportFragmentManager, "showAvailableCouponListDialog");
                        return;
                    }
                    return;
                }
                return;
            case 8:
                com.horcrux.svg.d0.g(2, "/sm/add_beneficiary", "beneficiary_type").navigation(((BankAccountFavoriteFragment) obj).requireContext());
                return;
            case 9:
                com.horcrux.svg.d0.g(2, "/sm/add_beneficiary", "beneficiary_type").navigation(((TransferToBankHomeFavoriteFragment) obj).requireContext());
                return;
            case 10:
                FundUSSDCompleteLastOrderDialog.mOnclickListener$lambda$2((FundUSSDCompleteLastOrderDialog) obj, view);
                return;
            case 11:
                com.horcrux.svg.d0.g(1, "/sm/add_beneficiary", "beneficiary_type").navigation(((TransferToPalmPayContactFavoriteFragment) obj).requireContext());
                return;
            case 12:
                int i13 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                ARouter.getInstance().build("/sm/transfer_to_palmpay_contact").withString("core_order_source_type", ((TransferToPalmPayHomeRecentlyFragment) obj).t).navigation();
                return;
            case 13:
                int i14 = WithdrawHomeFragment.f27021t0;
                int id2 = view.getId();
                if (id2 == p366y9.b.ivScan) {
                    N8.q0.v("/qrcode/scan", "core_order_source_type", "WITHDRAW");
                    return;
                }
                WithdrawHomeFragment withdrawHomeFragment = (WithdrawHomeFragment) obj;
                if (id2 == p366y9.b.tv_account_no) {
                    Postcard postcardBuild = ARouter.getInstance().build("/cashout/withdraw_query_account");
                    if (withdrawHomeFragment.v().getData() != null && withdrawHomeFragment.v().getData().size() > 0) {
                        List<Object> data = withdrawHomeFragment.v().getData();
                        Intrinsics.f(data, "null cannot be cast to non-null type java.io.Serializable");
                        postcardBuild.withSerializable("KEY_DATA", (Serializable) data);
                    }
                    postcardBuild.navigation();
                    return;
                }
                if (id2 == p366y9.b.iv_turn_on) {
                    withdrawHomeFragment.getClass();
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    Uri uriFromParts = Uri.fromParts("package", withdrawHomeFragment.requireActivity().getPackageName(), null);
                    Intrinsics.checkNotNullExpressionValue(uriFromParts, "fromParts(...)");
                    intent.setData(uriFromParts);
                    withdrawHomeFragment.startActivityForResult(intent, 16705);
                    return;
                }
                if (id2 != p366y9.b.iv_close) {
                    if (id2 == p366y9.b.tvMore) {
                        com.palmpay.lib.apm.launchcounter.util.d.F("/p2p/nearby_agent_real");
                        return;
                    }
                    return;
                } else {
                    ConstraintLayout constraintLayoutT = withdrawHomeFragment.t();
                    if (constraintLayoutT != null) {
                        constraintLayoutT.setVisibility(8);
                        return;
                    }
                    return;
                }
            case 14:
                WithdrawRecordDetailFragment withdrawRecordDetailFragment = (WithdrawRecordDetailFragment) obj;
                BillDetail billDetail = withdrawRecordDetailFragment.f27046v;
                if (billDetail != null) {
                    Context contextRequireContext2 = withdrawRecordDetailFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    BillDetailProcessDialog billDetailProcessDialog = new BillDetailProcessDialog(contextRequireContext2);
                    billDetailProcessDialog.show();
                    billDetailProcessDialog.fillData(billDetail.orderStatusInfo);
                    return;
                }
                return;
            case 15:
                WithdrawV2Fragment withdrawV2Fragment = (WithdrawV2Fragment) obj;
                NgSelectBankCardDialog ngSelectBankCardDialog2 = withdrawV2Fragment.f27056Z;
                if (ngSelectBankCardDialog2 != null) {
                    ngSelectBankCardDialog2.show();
                }
                if (TextUtils.isEmpty(withdrawV2Fragment.f27052M) || (ngSelectBankCardDialog = withdrawV2Fragment.f27056Z) == null) {
                    return;
                }
                ngSelectBankCardDialog.findNowSelectedPositionByAccountNo(withdrawV2Fragment.f27052M);
                return;
            case 16:
                AgentInformationCardData agentInformationCardData = (AgentInformationCardData) obj;
                int i15 = AgentInformationView.f30713b;
                try {
                    PhoneUtils.dial(Uri.encode(agentInformationCardData.getAgentPhoneNo()));
                    return;
                } catch (Exception unused) {
                    ToastUtils.showLong(view.getContext().getString(Ya.g.cs_mi_no_dial_application), new Object[0]);
                    return;
                }
            case 17:
                int i16 = CLMultipleCashProductView.f30722c;
                Bundle bundle = new Bundle();
                CLRepaymentPlanData cLRepaymentPlanData = (CLRepaymentPlanData) obj;
                bundle.putString("loanAmount", String.valueOf(cLRepaymentPlanData != null ? cLRepaymentPlanData.getLoanAmount() : null));
                bundle.putString("repaymentDate", String.valueOf(cLRepaymentPlanData != null ? cLRepaymentPlanData.getRepaymentDate() : null));
                bundle.putString("couponId", String.valueOf((cLRepaymentPlanData == null || (coupon = cLRepaymentPlanData.getCoupon()) == null) ? null : coupon.getCouponId()));
                bundle.putString("productSubId", String.valueOf(cLRepaymentPlanData != null ? cLRepaymentPlanData.getProductSubId() : null));
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "NormalLoanAgreement");
                return;
            case 18:
                DefaultInfoData defaultInfoData = (DefaultInfoData) obj;
                int i17 = DefaultInfoView.f30736c;
                try {
                    PhoneUtils.dial(Uri.encode(defaultInfoData.customerServicePhone));
                    return;
                } catch (Exception unused2) {
                    ToastUtils.showLong(view.getContext().getString(Ya.g.cs_mi_no_dial_application), new Object[0]);
                    return;
                }
            case 19:
                ((D4.f) obj).getClass();
                Pa.r0.U0();
                return;
            case 20:
                int i18 = OcCommonBillCard.f30814w;
                Bundle bundle2 = new Bundle();
                CLMainData cLMainData = (CLMainData) obj;
                if (cLMainData != null && (currentCashLoanBill = cLMainData.getCurrentCashLoanBill()) != null) {
                    loanNo = currentCashLoanBill.getLoanNo();
                }
                bundle2.putString("loanNo", loanNo);
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "LoanOverview");
                return;
            case 21:
                int i19 = TotalOutstandingView.f30883d;
                OutstandingContentInfo outstandingContentInfo = (OutstandingContentInfo) obj;
                boolean zEquals = TextUtils.equals("currentSettled", outstandingContentInfo.style);
                List<OutstandingAccount> list3 = outstandingContentInfo.outstandingAccounts;
                long jLongValue = (list3 == null || (outstandingAccount4 = list3.get(0)) == null || (l5 = outstandingAccount4.billId) == null) ? 0L : l5.longValue();
                List<OutstandingAccount> list4 = outstandingContentInfo.outstandingAccounts;
                Integer num = (list4 == null || (outstandingAccount3 = list4.get(0)) == null) ? null : outstandingAccount3.accountType;
                List<OutstandingAccount> list5 = outstandingContentInfo.outstandingAccounts;
                String str2 = (list5 == null || (outstandingAccount2 = list5.get(0)) == null) ? null : outstandingAccount2.cardNo;
                List<OutstandingAccount> list6 = outstandingContentInfo.outstandingAccounts;
                if (list6 != null && (outstandingAccount = list6.get(0)) != null) {
                    str = outstandingAccount.loanProduct;
                }
                if (!zEquals || jLongValue <= 0) {
                    return;
                }
                Bundle bundle3 = new Bundle();
                bundle3.putString("billId", String.valueOf(jLongValue));
                bundle3.putString("accountType", String.valueOf(num));
                bundle3.putString("cardNo", String.valueOf(str2));
                bundle3.putString("loanProduct", String.valueOf(str));
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle3, "LoanOutstandingBill");
                return;
            case 22:
                CLPhoneInstallmentMainData cLPhoneInstallmentMainData = ((VaTransferRepaymentInfoView) obj).f30888b;
                if (cLPhoneInstallmentMainData == null || (virtualAccountData = cLPhoneInstallmentMainData.getVirtualAccountData()) == null) {
                    return;
                }
                Bundle bundle4 = new Bundle();
                bundle4.putString("virtualAccountNo", virtualAccountData.getVirtualAccountNo());
                bundle4.putString("accountName", virtualAccountData.getAccountName());
                bundle4.putString("bankName", virtualAccountData.getBankName());
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle4, "MobileInstallmentVaRepaymentGuide");
                return;
            case 23:
                p270rd.B b7 = ((BankCustomerServiceView) obj).f33831b;
                if (b7 != null) {
                    Intrinsics.e(view);
                    b7.onClick(view);
                    return;
                }
                return;
            case 24:
                L0 l6 = ((TransferToBankAccountView) obj).f33903f;
                if (l6 != null) {
                    l6.f5081o.k(1);
                    return;
                } else {
                    Intrinsics.n("sharedViewModel");
                    throw null;
                }
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                TransferToPalmPayAccountView.a((TransferToPalmPayAccountView) obj);
                return;
            case 26:
                int i20 = TransferToPalmPayProgressView.f33939f;
                Pa.i0.b0(((OrderCompensateBean) obj).getCompensateQuestionJumpUrl());
                return;
            case 27:
                ((Ge.f) obj).dismiss();
                return;
            case 28:
                if (Pa.r0.U0()) {
                    return;
                }
                Object tag = view.getTag();
                CashHomeRewardsInfo cashHomeRewardsInfo = tag instanceof CashHomeRewardsInfo ? (CashHomeRewardsInfo) tag : null;
                if (cashHomeRewardsInfo == null) {
                    return;
                }
                H9.b bVar = (H9.b) obj;
                bVar.getClass();
                Pa.n0 n0VarG = Pa.n0.g();
                ClickEvent clickEventAdd = new ClickEvent("AddMoney_RewardTask_Click").add("buttonContent", cashHomeRewardsInfo.getButtonContent());
                String taskNo = cashHomeRewardsInfo.getTaskNo();
                n0VarG.k(clickEventAdd.add("taskNo", taskNo != null ? taskNo : ""));
                boolean zH = kotlin.text.y.h(cashHomeRewardsInfo.getButtonContent(), "Claim", true);
                View view3 = bVar.f3768a;
                if (zH) {
                    Pa.F.g(view3.getContext(), "arouter://main/home?tab=palmzone");
                    return;
                }
                if (kotlin.text.y.h(cashHomeRewardsInfo.getButtonContent(), "Go", true)) {
                    O6.c cVar = new O6.c(view3.getContext());
                    cVar.f6596b = O6.d.f("Task Guide");
                    cVar.b(p366y9.d.ci_add_money_rewards_go_tip);
                    cVar.d(p025ba.k.core_confirm, new ViewOnClickListenerC0053e(17));
                    cVar.g();
                    return;
                }
                return;
            default:
                ((BillDetailProcessDialog) obj).dismiss();
                return;
        }
    }
}
