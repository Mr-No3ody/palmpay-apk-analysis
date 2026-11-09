package A8;

import Ab.l;
import C0.G;
import Ed.D;
import G7.u;
import Kd.U0;
import L6.i;
import Pa.n0;
import Pa.r0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.m;
import com.bumptech.glide.request.target.Target;
import com.google.api.Service;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.bean.TaxItem;
import com.transsnet.palmpay.cash_in.bean.response.FundViewBean;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentPaymentResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.AddMoneyHomeActivity;
import com.transsnet.palmpay.cash_in.ui.dialog.CashInTaxDetailDialog;
import com.transsnet.palmpay.cash_in.ui.fragment.FundDetailFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.LinkBankCardResp;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.core.ui.dialog.BillDetailProcessDialog;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CashRepaymentInfo;
import com.transsnet.palmpay.credit.bean.resp.CurrentRepaymentDetail;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanMainPageData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCashLoanBill;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.ui.dialog.CLCouponDialog;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLBorrowBaseFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.credit.ui.view.BorrowCLInfoView;
import com.transsnet.palmpay.credit.ui.view.BorrowCLInfoView2;
import com.transsnet.palmpay.credit.view.OcCommonBillCard;
import com.transsnet.palmpay.main.export.bean.rsp.MeTabTotalAssetInfo;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.resp.LabelBean;
import com.transsnet.palmpay.send_money.ui.dialog.ExceedsDailyLimitDialog;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToBankFragment;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToPalmPayFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankAddBankAccountFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayAddMobileAccountFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayContactViewModel;
import com.transsnet.palmpay.ui.fragment.BankCardAndAccountFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p025ba.k;
import p223od.o;
import p223od.p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f84c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f82a = i7;
        this.f83b = obj;
        this.f84c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:195:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:251:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:85:0x0132  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        CLBorrowCouponData coupon;
        Long nominaValue;
        PpFormVertical ppFormVertical;
        AppCompatEditText editText;
        PpFormVertical ppFormVertical2;
        AppCompatEditText editText2;
        String unselectedUrl;
        String unselectedUrl2;
        CLMainCashLoanBill currentCashLoanBill;
        CLMainCashLoanBill currentCashLoanBill2;
        CLMainCashLoanBill currentCashLoanBill3;
        CLMainCashLoanBill currentCashLoanBill4;
        CLMainCashLoanBill currentCashLoanBill5;
        Long billId;
        Integer outstandingBillCount;
        Integer accountStatus;
        Long nextCycleInstallmentAmount;
        CurrentRepaymentDetail currentRepaymentDetail;
        CashRepaymentInfo cashRepaymentInfo;
        CurrentRepaymentDetail currentRepaymentDetail2;
        CashRepaymentInfo cashRepaymentInfo2;
        CurrentRepaymentDetail currentRepaymentDetail3;
        CashRepaymentInfo cashRepaymentInfo3;
        CurrentRepaymentDetail currentRepaymentDetail4;
        CashRepaymentInfo cashRepaymentInfo4;
        CurrentRepaymentDetail currentRepaymentDetail5;
        CashRepaymentInfo cashRepaymentInfo5;
        Long outstandingAmount;
        Executor executor = J1.g.f4461a;
        int i7 = 1;
        String loanProduct = null;
        Object obj = this.f84c;
        Object obj2 = this.f83b;
        switch (this.f82a) {
            case 0:
                d dVar = (d) obj2;
                dVar.getClass();
                p073f.a aVar = (p073f.a) obj;
                p073f.c.a().f36336d = aVar.f36329c;
                String strR = G.r(new StringBuilder("com.transsnet.mtn.sdk.ui.bank."), aVar.f36330d, ".LoginActivity");
                Intent intent = new Intent();
                e eVar = dVar.f88c;
                intent.setComponent(new ComponentName(eVar.f89a.getPackageName(), strR));
                eVar.f89a.startActivity(intent);
                break;
            case 1:
                int i10 = CLBorrowBaseFragment.f30503H1;
                int selectedIndex = ((CLCouponDialog) obj).getSelectedIndex();
                CLBorrowBaseFragment cLBorrowBaseFragment = (CLBorrowBaseFragment) obj2;
                cLBorrowBaseFragment.f30556m1 = selectedIndex;
                if (selectedIndex == -1) {
                    CLRepaymentPlanData cLRepaymentPlanDataX = cLBorrowBaseFragment.X();
                    if (cLRepaymentPlanDataX != null) {
                        cLRepaymentPlanDataX.setCouponId(null);
                    }
                    CLRepaymentPlanData cLRepaymentPlanDataX2 = cLBorrowBaseFragment.X();
                    if (cLRepaymentPlanDataX2 != null) {
                        cLRepaymentPlanDataX2.setCoupon(null);
                    }
                    cLBorrowBaseFragment.f0();
                } else {
                    CLRepaymentPlanData cLRepaymentPlanDataX3 = cLBorrowBaseFragment.X();
                    ArrayList arrayList = cLBorrowBaseFragment.f30557n1;
                    if (cLRepaymentPlanDataX3 != null) {
                        cLRepaymentPlanDataX3.setCouponId(((CLBorrowCouponData) arrayList.get(cLBorrowBaseFragment.f30556m1)).getCouponId());
                    }
                    CLRepaymentPlanData cLRepaymentPlanDataX4 = cLBorrowBaseFragment.X();
                    if (cLRepaymentPlanDataX4 != null) {
                        cLRepaymentPlanDataX4.setCoupon((CLBorrowCouponData) arrayList.get(cLBorrowBaseFragment.f30556m1));
                    }
                    cLBorrowBaseFragment.f0();
                }
                break;
            case 2:
                int i11 = CLBorrowBaseFragment.f30503H1;
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment = (CLInstallmentBorrowFragment) obj2;
                CLRepaymentPlanData cLRepaymentPlanDataX5 = cLInstallmentBorrowFragment.X();
                if (cLRepaymentPlanDataX5 != null ? Intrinsics.c(cLRepaymentPlanDataX5.getUpperLimit(), Boolean.TRUE) : false) {
                    O6.c cVar = new O6.c((Context) obj);
                    cVar.f6615v = i.ppFlexiCashDialogTheme;
                    CLRepaymentPlanData cLRepaymentPlanDataX6 = cLInstallmentBorrowFragment.X();
                    cVar.f6598d = G.o("The deduction amount cannot exceed the upper limit ", r0.B((cLRepaymentPlanDataX6 == null || (coupon = cLRepaymentPlanDataX6.getCoupon()) == null || (nominaValue = coupon.getNominaValue()) == null) ? 0L : nominaValue.longValue(), true));
                    cVar.d(k.core_got_it, null);
                    cVar.a().show();
                }
                break;
            case 3:
                int i12 = CLInstallmentBorrowFragment.f30584M1;
                int selectedIndex2 = ((CLCouponDialog) obj).getSelectedIndex();
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment2 = (CLInstallmentBorrowFragment) obj2;
                cLInstallmentBorrowFragment2.f30587K1 = selectedIndex2;
                if (selectedIndex2 == -1) {
                    CLRepaymentPlanData cLRepaymentPlanData = cLInstallmentBorrowFragment2.f30564q1;
                    if (cLRepaymentPlanData != null) {
                        cLRepaymentPlanData.setCouponId(null);
                    }
                    CLRepaymentPlanData cLRepaymentPlanData2 = cLInstallmentBorrowFragment2.f30564q1;
                    if (cLRepaymentPlanData2 != null) {
                        cLRepaymentPlanData2.setCoupon(null);
                    }
                    cLInstallmentBorrowFragment2.t0();
                } else {
                    CLRepaymentPlanData cLRepaymentPlanData3 = cLInstallmentBorrowFragment2.f30564q1;
                    ArrayList arrayList2 = cLInstallmentBorrowFragment2.f30588L1;
                    if (cLRepaymentPlanData3 != null) {
                        cLRepaymentPlanData3.setCouponId(((CLBorrowCouponData) arrayList2.get(selectedIndex2)).getCouponId());
                    }
                    CLRepaymentPlanData cLRepaymentPlanData4 = cLInstallmentBorrowFragment2.f30564q1;
                    if (cLRepaymentPlanData4 != null) {
                        cLRepaymentPlanData4.setCoupon((CLBorrowCouponData) arrayList2.get(cLInstallmentBorrowFragment2.f30587K1));
                    }
                    cLInstallmentBorrowFragment2.t0();
                }
                break;
            case 4:
                ExceedsDailyLimitDialog.setData$lambda$9((String) obj2, (ExceedsDailyLimitDialog) obj, it);
                break;
            case 5:
                WithdrawAgentPaymentResultActivity.m((WithdrawAgentPaymentResultActivity) obj2, "TransferPaymentResultsClick", "ViewDetail");
                QueryOrderDetailRsp queryOrderDetailRsp = (QueryOrderDetailRsp) obj;
                com.palmpay.lib.apm.launchcounter.util.d.x(p002a.a.e(new Pair("orderNo", queryOrderDetailRsp.orderNo), new Pair("transType", queryOrderDetailRsp.transType)), "CommonDetail");
                break;
            case 6:
                int i13 = BorrowCLInfoView.f30622w;
                F f10 = new F();
                BorrowCLInfoView borrowCLInfoView = (BorrowCLInfoView) obj2;
                O6.c cVar2 = new O6.c(borrowCLInfoView.getContext());
                cVar2.f6615v = i.ppFlexiCashDialogTheme;
                cVar2.f6596b = O6.d.f(borrowCLInfoView.getContext().getString(p116hb.f.cs_cl_stamp_duty_dialog_title));
                CLRepaymentPlanData cLRepaymentPlanData5 = (CLRepaymentPlanData) obj;
                cVar2.f6598d = cLRepaymentPlanData5 != null ? cLRepaymentPlanData5.getStampDutyText() : null;
                String string = borrowCLInfoView.getContext().getString(k.core_got_it);
                l lVar = new l(f10, i7);
                cVar2.f6600f = string;
                cVar2.f6602h = lVar;
                O6.d dVarA = cVar2.a();
                f10.f38951a = dVarA;
                dVarA.show();
                break;
            case 7:
                int i14 = BorrowCLInfoView2.f30633A;
                F f11 = new F();
                BorrowCLInfoView2 borrowCLInfoView2 = (BorrowCLInfoView2) obj2;
                O6.c cVar3 = new O6.c(borrowCLInfoView2.getContext());
                cVar3.f6615v = i.ppFlexiCashDialogTheme;
                cVar3.f6596b = O6.d.f(borrowCLInfoView2.getContext().getString(p116hb.f.cs_cl_stamp_duty_dialog_title));
                CLRepaymentPlanData cLRepaymentPlanData6 = (CLRepaymentPlanData) obj;
                cVar3.f6598d = cLRepaymentPlanData6 != null ? cLRepaymentPlanData6.getStampDutyText() : null;
                String string2 = borrowCLInfoView2.getContext().getString(k.core_got_it);
                l lVar2 = new l(f11, 2);
                cVar3.f6600f = string2;
                cVar3.f6602h = lVar2;
                O6.d dVarA2 = cVar3.a();
                f11.f38951a = dVarA2;
                dVarA2.show();
                break;
            case 8:
                ScheduleTransferPaymentToBankFragment.a aVar2 = ScheduleTransferPaymentToBankFragment.f33711H;
                o oVar = (o) ((ScheduleTransferPaymentToBankFragment) obj2).f27335j;
                if (oVar != null && (ppFormVertical = oVar.f40439c) != null && (editText = ppFormVertical.getEditText()) != null) {
                    editText.setText((String) obj);
                    break;
                }
                break;
            case 9:
                ScheduleTransferPaymentToPalmPayFragment.a aVar3 = ScheduleTransferPaymentToPalmPayFragment.f33719H;
                p pVar = (p) ((ScheduleTransferPaymentToPalmPayFragment) obj2).f27335j;
                if (pVar != null && (ppFormVertical2 = pVar.f40445c) != null && (editText2 = ppFormVertical2.getEditText()) != null) {
                    editText2.setText((String) obj);
                    break;
                }
                break;
            case 10:
                BankCardAndAccountFragment bankCardAndAccountFragment = (BankCardAndAccountFragment) obj2;
                bankCardAndAccountFragment.f35063w = obj;
                ARouter.getInstance().build("/account/authentication").navigation(bankCardAndAccountFragment.f27319c, 100);
                break;
            case 11:
                BankCardAndAccountFragment bankCardAndAccountFragment2 = (BankCardAndAccountFragment) obj2;
                LinkBankCardResp.LinkBankCard linkBankCard = (LinkBankCardResp.LinkBankCard) obj;
                bankCardAndAccountFragment2.f35058A = linkBankCard;
                if (linkBankCard != null) {
                    bankCardAndAccountFragment2.showLoadingDialog(true);
                    bankCardAndAccountFragment2.C(bankCardAndAccountFragment2.f35058A);
                }
                break;
            case 12:
                FundViewBean fundViewBean = (FundViewBean) obj;
                String str = fundViewBean.name;
                ((D9.b) obj2).getClass();
                n0.g().m("AddMoney_Method_Click", str, "");
                ActivityUtils.startActivity(Pa.F.a(it.getContext(), fundViewBean.jumpPath));
                break;
            case 13:
                n0.g().v("AddMoney_KYC_Click");
                MeTabTotalAssetInfo meTabTotalAssetInfo = (MeTabTotalAssetInfo) obj2;
                if (TextUtils.isEmpty(meTabTotalAssetInfo.authAndroidLinkUrl)) {
                    com.palmpay.lib.apm.launchcounter.util.d.F("/account/palmpayLevel");
                } else {
                    ActivityUtils.startActivity(Pa.F.a((AddMoneyHomeActivity) obj, meTabTotalAssetInfo.authAndroidLinkUrl));
                }
                break;
            case 14:
                n0.g().v("AddMoney_Share_Click");
                AddMoneyHomeActivity addMoneyHomeActivity = (AddMoneyHomeActivity) obj2;
                com.facebook.imagepipeline.nativecode.b.D(addMoneyHomeActivity, addMoneyHomeActivity.getString(p366y9.d.ci_bank_transfer_content, ((D9.c) obj).f1711g.getText(), !TextUtils.isEmpty(BaseApplication.getInstance().getUser().getFullName()) ? BaseApplication.getInstance().getUser().getFullName() : BaseApplication.getInstance().getUser().getNickName()));
                break;
            case 15:
                BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment = (BankAccountBeneficiaryFragment) obj2;
                bankAccountBeneficiaryFragment.showLoadingDialog(true);
                TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) bankAccountBeneficiaryFragment.f27333i;
                if (transferToBankHomeViewModel != null) {
                    p140j8.f.s(transferToBankHomeViewModel, new U0(((RecipientListResp.RecipientBean) obj).getRecipientId(), null), transferToBankHomeViewModel.f34050i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                break;
            case 16:
                TransferToBankHomeViewModel transferToBankHomeViewModel2 = (TransferToBankHomeViewModel) ((BankAccountFavoriteFragment) obj2).f27333i;
                if (transferToBankHomeViewModel2 != null) {
                    p140j8.f.s(transferToBankHomeViewModel2, new U0(((RecipientListResp.RecipientBean) obj).getRecipientId(), null), transferToBankHomeViewModel2.f34050i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                break;
            case 17:
                TransferToPalmPayContactViewModel transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) ((BankAccountPalmPayContactFragment) obj2).f27333i;
                if (transferToPalmPayContactViewModel != null) {
                    transferToPalmPayContactViewModel.g(((RecipientBeanV2) obj).getRelationId());
                }
                break;
            case 18:
                TransferToBankAddBankAccountFragment.a aVar4 = TransferToBankAddBankAccountFragment.f33758M;
                TransferToBankAddBankAccountFragment transferToBankAddBankAccountFragment = (TransferToBankAddBankAccountFragment) obj2;
                LabelBean labelBean = (LabelBean) obj;
                String label = labelBean.getLabel();
                LabelBean labelBean2 = transferToBankAddBankAccountFragment.f33764o;
                if (!y.h(label, labelBean2 != null ? labelBean2.getLabel() : null, false)) {
                    transferToBankAddBankAccountFragment.f33764o = labelBean;
                    p223od.k kVar = (p223od.k) transferToBankAddBankAccountFragment.f27335j;
                    int childCount = kVar != null ? kVar.f40407b.getChildCount() : 0;
                    for (int i15 = 0; i15 < childCount; i15++) {
                        p223od.k kVar2 = (p223od.k) transferToBankAddBankAccountFragment.f27335j;
                        View childAt = kVar2 != null ? kVar2.f40407b.getChildAt(i15) : null;
                        ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                        List list = transferToBankAddBankAccountFragment.f33767w;
                        LabelBean labelBean3 = list != null ? (LabelBean) list.get(i15) : null;
                        if (imageView != null) {
                            if (transferToBankAddBankAccountFragment.m()) {
                                if (y.h(labelBean3 != null ? labelBean3.getLabel() : null, labelBean.getLabel(), false)) {
                                    if (labelBean3 != null) {
                                        unselectedUrl = labelBean3.getSelectedDarkUrl();
                                    } else {
                                        unselectedUrl = null;
                                    }
                                } else if (labelBean3 != null) {
                                    unselectedUrl = labelBean3.getUnselectedDarkUrl();
                                } else {
                                    unselectedUrl = null;
                                }
                            } else if (y.h(labelBean3 != null ? labelBean3.getLabel() : null, labelBean.getLabel(), false)) {
                                if (labelBean3 != null) {
                                    unselectedUrl = labelBean3.getSelectedUrl();
                                } else {
                                    unselectedUrl = null;
                                }
                            } else if (labelBean3 != null) {
                                unselectedUrl = labelBean3.getUnselectedUrl();
                            } else {
                                unselectedUrl = null;
                            }
                            Target d2 = new D(imageView, 0);
                            if (r0.n(imageView)) {
                                m mVarLoad = com.bumptech.glide.b.f(imageView).b().load(new Rb.a(unselectedUrl));
                                mVarLoad.T(d2, null, mVarLoad, executor);
                            }
                        }
                    }
                    transferToBankAddBankAccountFragment.x();
                    break;
                }
                break;
            case 19:
                ActivityUtils.startActivity(Pa.F.a(((TransferToBankHomeFragment) obj2).getContext(), (String) obj));
                break;
            case 20:
                TransferToPalmPayAddMobileAccountFragment.a aVar5 = TransferToPalmPayAddMobileAccountFragment.f33787L;
                TransferToPalmPayAddMobileAccountFragment transferToPalmPayAddMobileAccountFragment = (TransferToPalmPayAddMobileAccountFragment) obj2;
                LabelBean labelBean4 = (LabelBean) obj;
                String label2 = labelBean4.getLabel();
                LabelBean labelBean5 = transferToPalmPayAddMobileAccountFragment.f33792o;
                if (!y.h(label2, labelBean5 != null ? labelBean5.getLabel() : null, false)) {
                    transferToPalmPayAddMobileAccountFragment.f33792o = labelBean4;
                    p223od.m mVar = (p223od.m) transferToPalmPayAddMobileAccountFragment.f27335j;
                    int childCount2 = mVar != null ? mVar.f40424b.getChildCount() : 0;
                    for (int i16 = 0; i16 < childCount2; i16++) {
                        p223od.m mVar2 = (p223od.m) transferToPalmPayAddMobileAccountFragment.f27335j;
                        View childAt2 = mVar2 != null ? mVar2.f40424b.getChildAt(i16) : null;
                        ImageView imageView2 = childAt2 instanceof ImageView ? (ImageView) childAt2 : null;
                        List list2 = transferToPalmPayAddMobileAccountFragment.f33795w;
                        LabelBean labelBean6 = list2 != null ? (LabelBean) list2.get(i16) : null;
                        if (imageView2 != null) {
                            if (transferToPalmPayAddMobileAccountFragment.m()) {
                                if (y.h(labelBean6 != null ? labelBean6.getLabel() : null, labelBean4.getLabel(), false)) {
                                    if (labelBean6 != null) {
                                        unselectedUrl2 = labelBean6.getSelectedDarkUrl();
                                    } else {
                                        unselectedUrl2 = null;
                                    }
                                } else if (labelBean6 != null) {
                                    unselectedUrl2 = labelBean6.getUnselectedDarkUrl();
                                } else {
                                    unselectedUrl2 = null;
                                }
                            } else if (y.h(labelBean6 != null ? labelBean6.getLabel() : null, labelBean4.getLabel(), false)) {
                                if (labelBean6 != null) {
                                    unselectedUrl2 = labelBean6.getSelectedUrl();
                                } else {
                                    unselectedUrl2 = null;
                                }
                            } else if (labelBean6 != null) {
                                unselectedUrl2 = labelBean6.getUnselectedUrl();
                            } else {
                                unselectedUrl2 = null;
                            }
                            Target d10 = new D(imageView2, 1);
                            if (r0.n(imageView2)) {
                                m mVarLoad2 = com.bumptech.glide.b.f(imageView2).b().load(new Rb.a(unselectedUrl2));
                                mVarLoad2.T(d10, null, mVarLoad2, executor);
                            }
                        }
                    }
                    transferToPalmPayAddMobileAccountFragment.w();
                    break;
                }
                break;
            case 21:
                TransferToPalmPayContactViewModel transferToPalmPayContactViewModel2 = (TransferToPalmPayContactViewModel) ((TransferToPalmPayContactAllFragment) obj2).f27333i;
                if (transferToPalmPayContactViewModel2 != null) {
                    transferToPalmPayContactViewModel2.g(((RecipientBeanV2) obj).getRelationId());
                }
                break;
            case 22:
                TransferToPalmPayContactViewModel transferToPalmPayContactViewModel3 = (TransferToPalmPayContactViewModel) ((TransferToPalmPayContactFavoriteFragment) obj2).f27333i;
                if (transferToPalmPayContactViewModel3 != null) {
                    transferToPalmPayContactViewModel3.g(((RecipientBeanV2) obj).getRelationId());
                }
                break;
            case 23:
                ActivityUtils.startActivity(Pa.F.a(((TransferToPalmPayHomeFragment) obj2).requireContext(), (String) obj));
                break;
            case 24:
                Balloon this$0 = (Balloon) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                u uVar = (u) obj2;
                if (uVar != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    uVar.onBalloonClick(it);
                }
                if (this$0.f25223b.f3072K) {
                    this$0.f();
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                FundDetailFragment.a aVar6 = FundDetailFragment.f27008X;
                FundDetailFragment fundDetailFragment = (FundDetailFragment) obj2;
                fundDetailFragment.getClass();
                E mActivity = fundDetailFragment.f27319c;
                Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                CashInTaxDetailDialog cashInTaxDetailDialog = new CashInTaxDetailDialog(mActivity);
                cashInTaxDetailDialog.show();
                cashInTaxDetailDialog.update((TaxItem) obj);
                break;
            case 26:
                FundDetailFragment.a aVar7 = FundDetailFragment.f27008X;
                E mActivity2 = ((FundDetailFragment) obj2).f27319c;
                Intrinsics.checkNotNullExpressionValue(mActivity2, "mActivity");
                BillDetailProcessDialog billDetailProcessDialog = new BillDetailProcessDialog(mActivity2);
                billDetailProcessDialog.show();
                billDetailProcessDialog.fillData(((BillDetail) obj).orderStatusInfo);
                break;
            case 27:
                int i17 = OcCommonBillCard.f30814w;
                CLMainData cLMainData = (CLMainData) obj2;
                if ((cLMainData != null ? cLMainData.getCurrentCashLoanBill() : null) != null) {
                    if (cLMainData == null || (currentCashLoanBill5 = cLMainData.getCurrentCashLoanBill()) == null || currentCashLoanBill5.getOutstandingAmount() != 0) {
                        Bundle bundle = new Bundle();
                        OcCommonBillCard ocCommonBillCard = (OcCommonBillCard) obj;
                        CLMainData cLMainData2 = ocCommonBillCard.t;
                        bundle.putString("billId", String.valueOf((cLMainData2 == null || (currentCashLoanBill4 = cLMainData2.getCurrentCashLoanBill()) == null) ? null : currentCashLoanBill4.getBillId()));
                        CLMainData cLMainData3 = ocCommonBillCard.t;
                        bundle.putString("accountType", (cLMainData3 == null || (currentCashLoanBill3 = cLMainData3.getCurrentCashLoanBill()) == null) ? null : currentCashLoanBill3.getAccountType());
                        CLMainData cLMainData4 = ocCommonBillCard.t;
                        bundle.putString("cardNo", (cLMainData4 == null || (currentCashLoanBill2 = cLMainData4.getCurrentCashLoanBill()) == null) ? null : currentCashLoanBill2.getCardNo());
                        CLMainData cLMainData5 = ocCommonBillCard.t;
                        if (cLMainData5 != null && (currentCashLoanBill = cLMainData5.getCurrentCashLoanBill()) != null) {
                            loanProduct = currentCashLoanBill.getLoanProduct();
                        }
                        bundle.putString("loanProduct", loanProduct);
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOutstandingBill");
                    }
                }
                break;
            case 28:
                OcCommonBillCard ocCommonBillCard2 = (OcCommonBillCard) obj2;
                OkCardMainPageRspData okCardMainPageRspData = ocCommonBillCard2.f30825p;
                OkCardMainPageRspData okCardMainPageRspData2 = (OkCardMainPageRspData) obj;
                if (okCardMainPageRspData != null && (accountStatus = okCardMainPageRspData.getAccountStatus()) != null && accountStatus.intValue() == 1) {
                    if (((okCardMainPageRspData2 == null || (nextCycleInstallmentAmount = okCardMainPageRspData2.getNextCycleInstallmentAmount()) == null) ? 0L : nextCycleInstallmentAmount.longValue()) > 0) {
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                        OkCardMainPageRspData okCardMainPageRspData3 = ocCommonBillCard2.f30825p;
                        postcardBuild.withString("oc_card_no", okCardMainPageRspData3 != null ? okCardMainPageRspData3.getCardNo() : null).withString("oc_bill_list_type", "oc_all_bill").navigation();
                    }
                }
                if (okCardMainPageRspData2 != null && okCardMainPageRspData2.getBillOutstandingAmount() != 0) {
                    OkCardMainPageRspData okCardMainPageRspData4 = ocCommonBillCard2.f30825p;
                    if (okCardMainPageRspData4 == null || (outstandingBillCount = okCardMainPageRspData4.getOutstandingBillCount()) == null || outstandingBillCount.intValue() != 1) {
                        OkCardMainPageRspData okCardMainPageRspData5 = ocCommonBillCard2.f30825p;
                        if (okCardMainPageRspData5 != null) {
                            billId = okCardMainPageRspData5.getBillId();
                        } else {
                            billId = null;
                        }
                    } else {
                        OkCardMainPageRspData okCardMainPageRspData6 = ocCommonBillCard2.f30825p;
                        if (okCardMainPageRspData6 != null) {
                            billId = okCardMainPageRspData6.getOutstandingBillId();
                        } else {
                            billId = null;
                        }
                    }
                    Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/oc_bill_activity");
                    OkCardMainPageRspData okCardMainPageRspData7 = ocCommonBillCard2.f30825p;
                    Postcard postcardWithLong = postcardBuild2.withString("oc_card_no", okCardMainPageRspData7 != null ? okCardMainPageRspData7.getCardNo() : null).withLong("oc_bill_id", billId != null ? billId.longValue() : 0L);
                    OkCardMainPageRspData okCardMainPageRspData8 = ocCommonBillCard2.f30825p;
                    postcardWithLong.withLong("oc_future_repayment_date", okCardMainPageRspData8 != null ? okCardMainPageRspData8.getRepaymentDateStamp() : 0L).navigation();
                    break;
                }
                break;
            default:
                int i18 = OcCommonBillCard.f30814w;
                InstallmentLoanMainPageData installmentLoanMainPageData = (InstallmentLoanMainPageData) obj2;
                if ((installmentLoanMainPageData != null ? installmentLoanMainPageData.getCurrentRepaymentDetail() : null) != null) {
                    if (installmentLoanMainPageData == null || (currentRepaymentDetail5 = installmentLoanMainPageData.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo5 = currentRepaymentDetail5.getCashRepaymentInfo()) == null || (outstandingAmount = cashRepaymentInfo5.getOutstandingAmount()) == null || outstandingAmount.longValue() != 0) {
                        Bundle bundle2 = new Bundle();
                        OcCommonBillCard ocCommonBillCard3 = (OcCommonBillCard) obj;
                        InstallmentLoanMainPageData installmentLoanMainPageData2 = ocCommonBillCard3.f30826v;
                        bundle2.putString("billId", String.valueOf((installmentLoanMainPageData2 == null || (currentRepaymentDetail4 = installmentLoanMainPageData2.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo4 = currentRepaymentDetail4.getCashRepaymentInfo()) == null) ? null : cashRepaymentInfo4.getBillId()));
                        InstallmentLoanMainPageData installmentLoanMainPageData3 = ocCommonBillCard3.f30826v;
                        bundle2.putString("accountType", (installmentLoanMainPageData3 == null || (currentRepaymentDetail3 = installmentLoanMainPageData3.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo3 = currentRepaymentDetail3.getCashRepaymentInfo()) == null) ? null : cashRepaymentInfo3.getAccountType());
                        InstallmentLoanMainPageData installmentLoanMainPageData4 = ocCommonBillCard3.f30826v;
                        bundle2.putString("cardNo", (installmentLoanMainPageData4 == null || (currentRepaymentDetail2 = installmentLoanMainPageData4.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo2 = currentRepaymentDetail2.getCashRepaymentInfo()) == null) ? null : cashRepaymentInfo2.getCardNo());
                        InstallmentLoanMainPageData installmentLoanMainPageData5 = ocCommonBillCard3.f30826v;
                        if (installmentLoanMainPageData5 != null && (currentRepaymentDetail = installmentLoanMainPageData5.getCurrentRepaymentDetail()) != null && (cashRepaymentInfo = currentRepaymentDetail.getCashRepaymentInfo()) != null) {
                            loanProduct = cashRepaymentInfo.getLoanProduct();
                        }
                        bundle2.putString("loanProduct", loanProduct);
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "LoanOutstandingBill");
                    }
                }
                break;
        }
    }
}
