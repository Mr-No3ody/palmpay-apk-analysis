package C9;

import C0.AbstractC0130w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import V9.C0714c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import androidx.preference.Preference;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.daimajia.swipe.SwipeLayout;
import com.google.api.Service;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.ui.activity.VerificationPatternPinActivity;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthPinFragment;
import com.transsnet.palmpay.account.ui.fragment.history.VerifyAccountHistoryFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationConfirmBvnFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationGetBvnFragment;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.ui.activity.ConfirmAndPayWithdrawOrderActivity;
import com.transsnet.palmpay.cash_in.ui.activity.FundResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.InterBankCashInInstructionDetailActivity;
import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.contacts.ui.activity.ContactMenuActivity;
import com.transsnet.palmpay.contacts.ui.fragment.CloseContactsFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.QueryLimitAmountV2Req;
import com.transsnet.palmpay.core.bean.req.ShareOrderReq;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.dialog.CouponListDialog;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.activity.HandleResultPayWithUSSDActivity;
import com.transsnet.palmpay.core.ui.activity.HandleResultPayWithUSSDByPushActivity;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckMobileFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckVoucherCodeFragment;
import com.transsnet.palmpay.core.util.PayStringUtils$OperatorType;
import com.transsnet.palmpay.core.util.PayStringUtils$USSDCode;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.viewmodel.ModelPageTitleAreaInPayVerifyPage;
import com.transsnet.palmpay.custom_view.model.ModelPageTitleArea;
import com.transsnet.palmpay.managemoney.bean.resp.WithdrawOrderDetailResp;
import com.transsnet.palmpay.photograph.PhotoPickerActivity;
import com.transsnet.palmpay.share.ShareChooseActivity;
import com.transsnet.palmpay.ui.activity.PalmPayStatementActivity;
import com.transsnet.palmpay.ui.activity.PayMerchantResultActivity;
import com.transsnet.palmpay.ui.activity.bankcard.BankCardAndAccountActivity;
import com.transsnet.palmpay.ui.activity.detail.CommissionDetailActivity;
import com.transsnet.palmpay.ui.activity.detail.MerchantOrderDetailActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC0146m implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1318b;

    public /* synthetic */ ViewOnClickListenerC0146m(Object obj, int i7) {
        this.f1317a = i7;
        this.f1318b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View v3) {
        AdapterView adapterView;
        int positionForView;
        String str;
        int i7;
        int i10 = 2;
        Object obj = this.f1318b;
        switch (this.f1317a) {
            case 0:
                if (v3.getId() == p366y9.b.awcap_complete_btn) {
                    int i11 = ConfirmAndPayWithdrawOrderActivity.f26830Y;
                    ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity = (ConfirmAndPayWithdrawOrderActivity) obj;
                    if (confirmAndPayWithdrawOrderActivity.f571b == null) {
                        ToastUtils.showShort("please select a bank account");
                    } else if (!r0.U0()) {
                        String strValueOf = String.valueOf(6);
                        String strValueOf2 = String.valueOf(1);
                        confirmAndPayWithdrawOrderActivity.showLoadingDialog(true);
                        QueryLimitAmountV2Req queryLimitAmountV2Req = new QueryLimitAmountV2Req();
                        queryLimitAmountV2Req.countryCode = BaseApplication.getCountryLocale();
                        queryLimitAmountV2Req.currency = BaseApplication.getCurrency();
                        queryLimitAmountV2Req.transType = "02";
                        queryLimitAmountV2Req.payeeAccountType = strValueOf;
                        queryLimitAmountV2Req.payerAccountType = strValueOf2;
                        ((PayApiService) p324va.c.f43141a.f14621b).queryLimitAmountV2(queryLimitAmountV2Req).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0149p(confirmAndPayWithdrawOrderActivity));
                        n0.g().l("PalmPay_Wthd_Btn_Pay");
                    }
                }
                break;
            case 1:
                FundResultActivity fundResultActivity = (FundResultActivity) obj;
                BillDetail billDetail = fundResultActivity.f26855j;
                if (billDetail != null) {
                    OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                    orderInfoForCustomerService.paymentType = billDetail.transactionTypeDesc;
                    orderInfoForCustomerService.time = billDetail.orderSuccessTime;
                    orderInfoForCustomerService.amount = billDetail.totalAmount;
                    orderInfoForCustomerService.orderNumber = billDetail.orderNo;
                    orderInfoForCustomerService.orderStatus = billDetail.orderStatusDesc;
                    orderInfoForCustomerService.faqUrl = billDetail.orderStatusInfo.faqLink;
                    orderInfoForCustomerService.transType = billDetail.transType;
                    i0.M(fundResultActivity, orderInfoForCustomerService);
                }
                break;
            case 2:
                InterBankCashInInstructionDetailActivity interBankCashInInstructionDetailActivity = (InterBankCashInInstructionDetailActivity) obj;
                if (TextUtils.isEmpty(interBankCashInInstructionDetailActivity.f26993a.appUrl)) {
                    interBankCashInInstructionDetailActivity.finish();
                } else if (!IntentUtils.checkAppInstalled(interBankCashInInstructionDetailActivity, interBankCashInInstructionDetailActivity.f26993a.appUrl)) {
                    ToastUtils.showLong(interBankCashInInstructionDetailActivity.getString(p366y9.d.ci_app_not_installed, interBankCashInInstructionDetailActivity.f26993a.bankName.text));
                } else {
                    Intent launchIntentForPackage = interBankCashInInstructionDetailActivity.getPackageManager().getLaunchIntentForPackage(interBankCashInInstructionDetailActivity.f26993a.appUrl);
                    if (launchIntentForPackage == null) {
                        ToastUtils.showLong(interBankCashInInstructionDetailActivity.getString(p366y9.d.ci_app_not_installed, interBankCashInInstructionDetailActivity.f26993a.bankName.text));
                    } else {
                        interBankCashInInstructionDetailActivity.startActivity(launchIntentForPackage);
                    }
                }
                break;
            case 3:
                if (v3.getId() == p025ba.e.cmf_next_btn) {
                    CheckMobileFragment checkMobileFragment = (CheckMobileFragment) obj;
                    ((PayVerificationCallback) checkMobileFragment.getActivity()).verifyPayMethod(checkMobileFragment.f27985j.getEditText(), 4);
                }
                break;
            case 4:
                int id2 = v3.getId();
                CheckVoucherCodeFragment checkVoucherCodeFragment = (CheckVoucherCodeFragment) obj;
                if (id2 == p025ba.e.cmf_next_btn) {
                    ((PayVerificationCallback) checkVoucherCodeFragment.getActivity()).verifyPayMethod(checkVoucherCodeFragment.f28045i.getEditText(), 6);
                } else if (id2 == p025ba.e.voucher_guide_tv) {
                    p039cb.c cVar = new p039cb.c(checkVoucherCodeFragment.f27319c, 12);
                    cVar.f18902c = PayStringUtils$OperatorType.VODAFONE;
                    cVar.g();
                }
                break;
            case 5:
                VerificationPatternPinActivity verificationPatternPinActivity = (VerificationPatternPinActivity) obj;
                int i12 = VerificationPatternPinActivity.f26054i;
                Intent intentQ = i0.q(verificationPatternPinActivity);
                intentQ.putExtra("extra_use_night_mode", !verificationPatternPinActivity.isForceNoNightMode());
                verificationPatternPinActivity.startActivityForResult(intentQ, 145);
                break;
            case 6:
                ((ShareChooseActivity) obj).finish();
                break;
            case 7:
                com.palmpay.lib.apm.launchcounter.util.d.H("/account/verifyAccount", "extra_type", SecurityVerifyMethodReq.LOGIN_RESET_PIN);
                AuthPinFragment authPinFragment = (AuthPinFragment) obj;
                if (authPinFragment.getActivity() != null) {
                    authPinFragment.getActivity().finish();
                }
                break;
            case 8:
                i0.b0("/h5/help/service");
                androidx.fragment.app.E activity = ((VerifyAccountHistoryFragment) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 9:
                if (v3.getId() == com.transsnet.palmpay.custom_view.s.cmpta_back_iv) {
                    int i13 = ModelPageTitleAreaInPayVerifyPage.f28393p;
                    Context context = ((ModelPageTitleAreaInPayVerifyPage) obj).f31417a;
                    if (context instanceof PayVerificationActivity) {
                        ((PayVerificationActivity) context).n();
                    } else if (context instanceof Activity) {
                        ((Activity) context).finish();
                    }
                }
                break;
            case 10:
                C0.U u6 = new C0.U(false, false, F8.d.fragment_identity_verification_confirm_bvn, true, false, -1, -1, -1, -1);
                AbstractC0130w abstractC0130w = ((IdentityVerificationConfirmBvnFragment) obj).f26168p;
                if (abstractC0130w != null) {
                    abstractC0130w.h(F8.d.fragment_identity_verification_step_id, null, u6);
                }
                break;
            case 11:
                AbstractC0130w abstractC0130w2 = ((IdentityVerificationGetBvnFragment) obj).f26170p;
                if (abstractC0130w2 != null) {
                    abstractC0130w2.j();
                }
                break;
            case 12:
                ContactMenuActivity contactMenuActivity = (ContactMenuActivity) obj;
                if (contactMenuActivity.f27166c != null) {
                    contactMenuActivity.showLoadingDialog(true, false);
                    ((ContactsApiService) S9.a.f8824a.f41079b).deleteMemberContact(contactMenuActivity.f27166c.getContactsMemberId()).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(contactMenuActivity, i10));
                    break;
                }
                break;
            case 13:
                int id3 = v3.getId();
                if (id3 == com.transsnet.palmpay.custom_view.s.cmpta_back_iv) {
                    Context context2 = ((ModelPageTitleArea) obj).f31417a;
                    if (context2 instanceof Activity) {
                        ((Activity) context2).finish();
                    }
                } else if (id3 == com.transsnet.palmpay.custom_view.s.cmpta_root) {
                    F6.d.h("ModelPageTitleArea", 3, "for fucking sonar!");
                }
                break;
            case 14:
                int i14 = SwipeLayout.f21093u0;
                SwipeLayout swipeLayout = (SwipeLayout) obj;
                if (swipeLayout.getOpenStatus() == Y1.d.f11282c) {
                    ViewParent parent = swipeLayout.getParent();
                    if ((parent instanceof AdapterView) && (positionForView = (adapterView = (AdapterView) parent).getPositionForView(swipeLayout)) != -1) {
                        adapterView.performItemClick(adapterView.getChildAt(positionForView - adapterView.getFirstVisiblePosition()), positionForView, adapterView.getAdapter().getItemId(positionForView));
                        break;
                    }
                }
                break;
            case 15:
                if (v3.getId() == R9.d.cfcc_add_contact_tv || v3.getId() == R9.d.rtvAddBeneficiary) {
                    ARouter.getInstance().build("/contact/edit_close_contact").withString("transType", ((CloseContactsFragment) obj).f27264A).navigation();
                }
                break;
            case 16:
                ((Zc.c) obj).a();
                break;
            case 17:
                PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) obj;
                Zc.c cVar2 = photoPickerActivity.f33077e;
                if (cVar2 != null && cVar2.f11619b.getVisibility() == 0) {
                    photoPickerActivity.f33077e.a();
                } else {
                    if (photoPickerActivity.f33077e == null) {
                        Zc.c cVar3 = new Zc.c();
                        RecyclerView recyclerView = (RecyclerView) photoPickerActivity.findViewById(Zc.l.photo_folder_rv);
                        cVar3.f11619b = recyclerView;
                        View viewFindViewById = photoPickerActivity.findViewById(Zc.l.mask_view);
                        cVar3.f11618a = viewFindViewById;
                        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0146m(cVar3, 16));
                        recyclerView.setLayoutManager(new LinearLayoutManager(photoPickerActivity));
                        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(photoPickerActivity, 1);
                        dividerItemDecoration.setDrawable(photoPickerActivity.getDrawable(Zc.k.photo_folder_divider));
                        recyclerView.addItemDecoration(dividerItemDecoration);
                        Zc.a aVar = new Zc.a();
                        aVar.f11612b = photoPickerActivity;
                        aVar.f11611a = new ArrayList();
                        cVar3.f11620c = aVar;
                        aVar.f11613c = cVar3;
                        recyclerView.setAdapter(aVar);
                        cVar3.f11621d = photoPickerActivity;
                        cVar3.f11622e = AnimationUtils.loadAnimation(photoPickerActivity, Zc.h.pop_enter_anim);
                        cVar3.f11623f = AnimationUtils.loadAnimation(photoPickerActivity, Zc.h.pop_exit_anim);
                        photoPickerActivity.f33077e = cVar3;
                        ArrayList arrayList = photoPickerActivity.f33078f;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            Zc.c cVar4 = photoPickerActivity.f33077e;
                            ArrayList arrayList2 = photoPickerActivity.f33078f;
                            Zc.a aVar2 = cVar4.f11620c;
                            if (aVar2 != null) {
                                ArrayList arrayList3 = aVar2.f11611a;
                                arrayList3.clear();
                                arrayList3.addAll(arrayList2);
                                aVar2.notifyDataSetChanged();
                            }
                        }
                    }
                    Zc.c cVar5 = photoPickerActivity.f33077e;
                    if (cVar5.f11620c.f11611a.size() > 0) {
                        cVar5.f11618a.setVisibility(0);
                    }
                    RecyclerView recyclerView2 = cVar5.f11619b;
                    recyclerView2.startAnimation(cVar5.f11622e);
                    recyclerView2.setVisibility(0);
                }
                break;
            case 18:
                ((Preference) obj).s(v3);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(v3, "v");
                int id4 = v3.getId();
                if (id4 == com.flexibank.sdk.p.fb_mdp_close_iv || id4 == com.flexibank.sdk.p.fb_mdp_confirm_btn) {
                    ((p033c4.b) obj).dismiss();
                }
                break;
            case 20:
                ((p033c4.c) obj).dismiss();
                break;
            case 21:
                int id5 = v3.getId();
                HandleResultPayWithUSSDActivity handleResultPayWithUSSDActivity = (HandleResultPayWithUSSDActivity) obj;
                if (id5 != p025ba.e.ciap_complete_btn) {
                    if (id5 == p025ba.e.ussd_guide_tv) {
                        p039cb.c cVar6 = new p039cb.c(handleResultPayWithUSSDActivity, 12);
                        cVar6.f18902c = handleResultPayWithUSSDActivity.f27642e;
                        cVar6.g();
                    } else if (id5 == p025ba.e.aatur_done_tv) {
                        i0.H(null);
                    }
                } else if (!handleResultPayWithUSSDActivity.f27644g) {
                    i0.H(null);
                } else if (!TextUtils.isEmpty(handleResultPayWithUSSDActivity.f27642e)) {
                    String str2 = handleResultPayWithUSSDActivity.f27642e;
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1334844874:
                            i10 = !str2.equals(PayStringUtils$OperatorType.VODAFONE) ? -1 : 0;
                            break;
                        case 76679:
                            i10 = !str2.equals(PayStringUtils$OperatorType.MTN) ? -1 : 1;
                            break;
                        case 2574877:
                            if (!str2.equals(PayStringUtils$OperatorType.AIRTELTIGO)) {
                                i10 = -1;
                            }
                            break;
                        default:
                            i10 = -1;
                            break;
                    }
                    switch (i10) {
                        case 0:
                            str = PayStringUtils$USSDCode.VODAFONE;
                            break;
                        case 1:
                            str = PayStringUtils$USSDCode.MTN;
                            break;
                        case 2:
                            str = PayStringUtils$USSDCode.AIRTELTIGO;
                            break;
                        default:
                            str = "";
                            break;
                    }
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                    intent.setFlags(268435456);
                    handleResultPayWithUSSDActivity.startActivity(intent);
                } else {
                    ToastUtils.showShort("No mobile channel");
                }
                break;
            case 22:
                int id6 = v3.getId();
                if (id6 == p025ba.e.ciap_complete_btn) {
                    i0.H(null);
                } else if (id6 == p025ba.e.ussd_guide_tv) {
                    HandleResultPayWithUSSDByPushActivity handleResultPayWithUSSDByPushActivity = (HandleResultPayWithUSSDByPushActivity) obj;
                    p039cb.c cVar7 = new p039cb.c(handleResultPayWithUSSDByPushActivity, 12);
                    cVar7.f18902c = handleResultPayWithUSSDByPushActivity.f27649d;
                    cVar7.g();
                } else if (id6 == p025ba.e.aatur_done_tv) {
                    i0.H(null);
                }
                break;
            case 23:
                Postcard postcardBuild = ARouter.getInstance().build("/manage_money/plan_detail_activity");
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                WithdrawOrderDetailResp withdrawOrderDetailResp = (WithdrawOrderDetailResp) commonBeanResult.data;
                Postcard postcardWithString = postcardBuild.withString("orderNo", withdrawOrderDetailResp != null ? withdrawOrderDetailResp.getOrderId() : null);
                WithdrawOrderDetailResp withdrawOrderDetailResp2 = (WithdrawOrderDetailResp) commonBeanResult.data;
                postcardWithString.withString("transType", withdrawOrderDetailResp2 != null ? withdrawOrderDetailResp2.getTransType() : null).navigation();
                break;
            case 24:
                if (v3.getId() == Ac.e.tvMonth) {
                    PalmPayStatementActivity palmPayStatementActivity = (PalmPayStatementActivity) obj;
                    palmPayStatementActivity.f34522v.show();
                    palmPayStatementActivity.f34522v.setCanceledOnTouchOutside(true);
                    int i15 = palmPayStatementActivity.f34509H;
                    if (i15 > 0 && (i7 = palmPayStatementActivity.f34510L) > 0) {
                        palmPayStatementActivity.f34522v.setNowPickDate(i7, i15);
                        break;
                    }
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int id7 = v3.getId();
                PayMerchantResultActivity payMerchantResultActivity = (PayMerchantResultActivity) obj;
                if (id7 == Ac.e.actur_complete_btn) {
                    int i16 = PayMerchantResultActivity.f34525p0;
                    Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
                    if (activityIsActivityExistsInStack != null) {
                        ActivityUtils.finishToActivity(activityIsActivityExistsInStack, false);
                    }
                } else if (id7 == Ac.e.actur_done_tv) {
                    payMerchantResultActivity.finish();
                } else if (id7 == Ac.e.ussd_guide_tv) {
                    p039cb.c cVar8 = new p039cb.c(payMerchantResultActivity, 12);
                    cVar8.f18902c = payMerchantResultActivity.f34530L;
                    cVar8.g();
                } else if (id7 == Ac.e.imageViewShare) {
                    long j6 = payMerchantResultActivity.f34533X;
                    String str3 = payMerchantResultActivity.f34534Y;
                    payMerchantResultActivity.showLoadingDialog(true);
                    ShareOrderReq shareOrderReq = new ShareOrderReq();
                    shareOrderReq.orderNo = str3;
                    shareOrderReq.transType = TransType.TRANS_TYPE_PARTNER_MERCHANT_C_SCAN_B;
                    ((PayApiService) p324va.c.f43141a.f14621b).shareOrder(shareOrderReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p102ge.I(payMerchantResultActivity, BaseApplication.getInstance().getUser(), j6));
                }
                break;
            case 26:
                n0.g().q(new ClickEvent("banksandcardsPagebackClick"));
                ((BankCardAndAccountActivity) obj).goBackToHome();
                break;
            case 27:
                CommissionDetailActivity commissionDetailActivity = (CommissionDetailActivity) obj;
                commissionDetailActivity.n(commissionDetailActivity.f34676a);
                break;
            case 28:
                MerchantOrderDetailActivity merchantOrderDetailActivity = (MerchantOrderDetailActivity) obj;
                merchantOrderDetailActivity.n(merchantOrderDetailActivity.f34710a);
                break;
            default:
                if (v3.getId() == p025ba.e.cdcl_close_iv) {
                    ((CouponListDialog) obj).dismiss();
                }
                break;
        }
    }
}
