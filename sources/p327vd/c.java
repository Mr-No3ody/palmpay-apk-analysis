package p327vd;

import D6.a;
import N8.q0;
import Pa.AbstractC0512i;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import X6.m;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.I;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.api.Service;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.betting.ui.view.ModelBillerSelection;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.manager.LoanCreditService;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeGuestFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanProductListFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanRepaymentListFragment;
import com.transsnet.palmpay.credit.ui.fragment.MobileContactsListFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideDoubleOpenFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcProtocolNoLockFragment;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardPrizeItem;
import com.transsnet.palmpay.main.export.bean.rsp.HotProductBean;
import com.transsnet.palmpay.main.export.bean.rsp.WelcomeCouponBean;
import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import com.transsnet.palmpay.send_money.bean.EditRecipientReq;
import com.transsnet.palmpay.send_money.bean.RecipientDetailData;
import com.transsnet.palmpay.send_money.bean.RecipientDetailResp;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.settings.TransferSettingsActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableOrderListActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.BankAccountBeneficiaryActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.PersonalHomePageActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.ReceiveMoneyResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.RequestPermissionDetailsActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayContactActivity;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.SelectBankForTransferViaUssdDialog;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.TransferViaUssdActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.MainUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import p025ba.k;
import p099gb.j;
import p141j9.C1807o;
import p159kd.e;
import p188md.b;
import p295tc.n;
import p298tf.f;
import p310ub.O;
import p339wb.d;
import p339wb.g;
import p354xe.h;
import p355xf.t;
import p368yb.C2140h;
import p368yb.C2157z;
import p369yd.i;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43160b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f43159a = i7;
        this.f43160b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p352xc.c cVar;
        n nVar;
        String string;
        MemberDetailResp memberDetailResp;
        RecipientDetailData data;
        String recipientId;
        RecipientDetailData data2;
        String recipientPhone;
        I onBackPressedDispatcher;
        TextView textView;
        Context context;
        String string2;
        int i7 = 10;
        text = null;
        CharSequence text = null;
        int i10 = 0;
        String str = "";
        Object obj = this.f43160b;
        switch (this.f43159a) {
            case 0:
                int i11 = TransferSettingsActivity.f33424d;
                ((TransferSettingsActivity) obj).finish();
                break;
            case 1:
                ModelBillerSelection.BillerSelectionCallback billerSelectionCallback = ((ModelBillerSelection) obj).f26755c;
                if (billerSelectionCallback != null) {
                    billerSelectionCallback.onMoreClick();
                }
                n0.g().l("PPay_Betting_Btn_More");
                break;
            case 2:
                d dVar = (d) obj;
                dVar.getClass();
                if (!r0.U0()) {
                    dVar.closeAllItems();
                    break;
                }
                break;
            case 3:
                ((g) obj).invoke(view);
                break;
            case 4:
                ((g) obj).invoke(view);
                break;
            case 5:
                ((a) obj).invoke(view);
                break;
            case 6:
                int i12 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                ScheduleTransferForBankUnstableOrderListActivity scheduleTransferForBankUnstableOrderListActivity = (ScheduleTransferForBankUnstableOrderListActivity) obj;
                m mVar = new m(scheduleTransferForBankUnstableOrderListActivity);
                mVar.f11028c = 3;
                mVar.f11030e = scheduleTransferForBankUnstableOrderListActivity.f33480j;
                mVar.f11032g = new C1807o(scheduleTransferForBankUnstableOrderListActivity, i7);
                mVar.f11029d = 1672502400000L;
                mVar.f11031f = Long.valueOf(System.currentTimeMillis());
                mVar.a().show();
                break;
            case 7:
                if (!r0.U0() && (nVar = (cVar = (p352xc.c) obj).f43848d) != null) {
                    boolean z3 = nVar.f42581b;
                    if (z3) {
                        if (z3) {
                            nVar.f42581b = false;
                            nVar.a();
                        }
                    } else if (!z3) {
                        nVar.f42581b = true;
                        nVar.a();
                    }
                    cVar.a();
                }
                break;
            case 8:
                int i13 = BankAccountBeneficiaryActivity.f33494g;
                BankAccountBeneficiaryActivity bankAccountBeneficiaryActivity = (BankAccountBeneficiaryActivity) obj;
                bankAccountBeneficiaryActivity.getClass();
                n0.g().k(new ClickEvent("to_bank_all_beneficiaries_page_element_click").add("module_name", bankAccountBeneficiaryActivity.f33500f).add("element_name", "Bank Card"));
                ARouter.getInstance().build("/sm/add_beneficiary").withInt("beneficiary_type", 2).navigation(bankAccountBeneficiaryActivity);
                break;
            case 9:
                h hVar = (h) obj;
                WelcomeCouponBean welcomeCouponBean = hVar.f43943g;
                if (welcomeCouponBean != null) {
                    n0 n0VarG = n0.g();
                    ClickEvent clickEventAdd = new ClickEvent("homePageoldusercouponClick").add(FirebaseAnalytics.Param.COUPON, welcomeCouponBean.title);
                    Integer num = welcomeCouponBean.priority;
                    if (num == null || (string = num.toString()) == null) {
                        string = "0";
                    }
                    n0VarG.k(clickEventAdd.add("priority", string));
                    if (!TextUtils.isEmpty(welcomeCouponBean.androidUrl)) {
                        View view2 = hVar.f43937a;
                        ActivityUtils.startActivity(F.a(view2 != null ? view2.getContext() : null, welcomeCouponBean.androidUrl));
                    }
                }
                break;
            case 10:
                q0.u("/coreImpl/use_new_card");
                Context context2 = ((C2140h) obj).f4991a;
                Intrinsics.f(context2, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context2).finish();
                break;
            case 11:
                O o10 = ((C2157z) obj).f44275c;
                if (o10 != null) {
                    o10.addImg();
                }
                break;
            case 12:
                int i14 = PersonalHomePageActivity.f33557L;
                int id2 = view.getId();
                PersonalHomePageActivity personalHomePageActivity = (PersonalHomePageActivity) obj;
                if (id2 == e.ll_tag) {
                    Object systemService = personalHomePageActivity.getSystemService("clipboard");
                    Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ClipboardManager clipboardManager = (ClipboardManager) systemService;
                    MemberDetailResp memberDetailResp2 = personalHomePageActivity.t;
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(ReactTextInputShadowNode.PROP_TEXT, memberDetailResp2 != null ? memberDetailResp2.getPalmPayTag() : null));
                    p220oa.h.x(personalHomePageActivity, personalHomePageActivity.getString(k.core_core_copy_successfully));
                    break;
                } else if (id2 == e.tvSend) {
                    MemberDetailResp memberDetailResp3 = personalHomePageActivity.t;
                    if (memberDetailResp3 != null) {
                        r0.O0("03", Integer.valueOf(personalHomePageActivity.f33559B), personalHomePageActivity.f33560C, p002a.a.e(new Pair("MEMBER_ID", memberDetailResp3.getMemberId()), !TextUtils.isEmpty(memberDetailResp3.getPpAccountNo()) ? new Pair("extra_data", memberDetailResp3.getPpAccountNo()) : new Pair("extra_data", null)));
                    }
                    break;
                } else if (id2 == e.tvRequest && (memberDetailResp = personalHomePageActivity.t) != null) {
                    r0.O0("03", Integer.valueOf(personalHomePageActivity.f33559B), personalHomePageActivity.f33560C, p002a.a.e(new Pair("MEMBER_ID", memberDetailResp.getMemberId()), !TextUtils.isEmpty(memberDetailResp.getPpAccountNo()) ? new Pair("extra_data", memberDetailResp.getPpAccountNo()) : new Pair("extra_data", null)));
                    break;
                }
                break;
            case 13:
                int i15 = ReceiveMoneyResultActivity.f33573f;
                ReceiveMoneyResultActivity receiveMoneyResultActivity = (ReceiveMoneyResultActivity) obj;
                receiveMoneyResultActivity.getClass();
                if (view.getId() == e.collect_money_complete) {
                    ARouter.getInstance().build("/main/home").navigation();
                    receiveMoneyResultActivity.finish();
                }
                break;
            case 14:
                int i16 = RequestPermissionDetailsActivity.f33585f;
                int id3 = view.getId();
                RequestPermissionDetailsActivity requestPermissionDetailsActivity = (RequestPermissionDetailsActivity) obj;
                if (id3 == e.saveLocalContact) {
                    RecipientDetailResp recipientDetailResp = requestPermissionDetailsActivity.f33589d;
                    if (recipientDetailResp != null && (data2 = recipientDetailResp.getData()) != null && (recipientPhone = data2.getRecipientPhone()) != null) {
                        String recipientNickname = data2.getRecipientNickname();
                        str = recipientNickname != null ? recipientNickname : "";
                        String strW0 = r0.w0(recipientPhone);
                        try {
                            Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
                            intent.putExtra("name", str);
                            intent.putExtra("phone", strW0);
                            if (intent.resolveActivity(requestPermissionDetailsActivity.getPackageManager()) != null) {
                                requestPermissionDetailsActivity.startActivity(intent);
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                            return;
                        }
                        break;
                    }
                } else if (id3 == e.f38747cb) {
                    Object value = requestPermissionDetailsActivity.f33587b.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    boolean zIsChecked = ((CheckBox) value).isChecked();
                    RecipientDetailResp recipientDetailResp2 = requestPermissionDetailsActivity.f33589d;
                    if (recipientDetailResp2 != null && (data = recipientDetailResp2.getData()) != null && (recipientId = data.getRecipientId()) != null) {
                        requestPermissionDetailsActivity.showLoadingDialog(true);
                        EditRecipientReq editRecipientReq = new EditRecipientReq();
                        editRecipientReq.setRequest(zIsChecked);
                        editRecipientReq.setRecipientId(recipientId);
                        ((SendMoneyApiService) b.f39648a.f6830b).editRecipient(editRecipientReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new i(requestPermissionDetailsActivity, i10));
                        break;
                    }
                }
                break;
            case 15:
                int i17 = TransferToPalmPayContactActivity.f33591j;
                ARouter.getInstance().build("/sm/add_beneficiary").withInt("beneficiary_type", 1).navigation((TransferToPalmPayContactActivity) obj);
                break;
            case 16:
                Integer num2 = (Integer) obj;
                HomeRewardPrizeItem.itemClick(num2 != null ? num2.intValue() : 0);
                break;
            case 17:
                LoanHomeGuestFragment.a aVar = LoanHomeGuestFragment.f30353o;
                E activity = ((LoanHomeGuestFragment) obj).getActivity();
                if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
            case 18:
                LoanProductListFragment.a aVar2 = LoanProductListFragment.f30354p;
                if (!NQEManager.INSTANCE.isNetworkOffline()) {
                    LoanProductListFragment loanProductListFragment = (LoanProductListFragment) obj;
                    p099gb.i iVar = (p099gb.i) loanProductListFragment.f27335j;
                    if (iVar != null) {
                        iVar.f37165e.setRefreshing(true);
                    }
                    loanProductListFragment.u();
                    break;
                }
                break;
            case 19:
                LoanRepaymentListFragment.a aVar3 = LoanRepaymentListFragment.f30356w;
                if (!r0.U0() && !NQEManager.INSTANCE.isNetworkOffline()) {
                    LoanRepaymentListFragment loanRepaymentListFragment = (LoanRepaymentListFragment) obj;
                    j jVar = (j) loanRepaymentListFragment.f27335j;
                    if (jVar != null) {
                        jVar.f37173e.setRefreshing(true);
                    }
                    loanRepaymentListFragment.v(false, false);
                }
                break;
            case 20:
                MobileContactsListFragment mobileContactsListFragment = (MobileContactsListFragment) obj;
                mobileContactsListFragment.getClass();
                if (!r0.U0()) {
                    AbstractC0512i.a(mobileContactsListFragment.f30366w);
                    Bundle arguments = mobileContactsListFragment.getArguments();
                    if (arguments != null) {
                        ARouter.getInstance().build("/contact/seach_all_contact").navigation(mobileContactsListFragment.getActivity(), arguments.getInt("oc_contact_type", 1000));
                    }
                    break;
                }
                break;
            case 21:
                int i18 = OcGuideDoubleOpenFragment.f30417r0;
                OcGuideDoubleOpenFragment ocGuideDoubleOpenFragment = (OcGuideDoubleOpenFragment) obj;
                if (BaseApplication.hasLogin()) {
                    ProductContentInfo productContentInfo = ocGuideDoubleOpenFragment.f30421q0;
                    if (TextUtils.isEmpty(productContentInfo != null ? productContentInfo.loanProduct : null)) {
                        LoanCreditService loanCreditService = new LoanCreditService(ocGuideDoubleOpenFragment);
                        Z childFragmentManager = ocGuideDoubleOpenFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        androidx.camera.core.impl.utils.n.y(loanCreditService, childFragmentManager, "CASH_INSTANT_LOAN", "CASH_DOUBLE_OPEN_FLEXI", null, 8);
                    } else {
                        LoanCreditService loanCreditService2 = new LoanCreditService(ocGuideDoubleOpenFragment);
                        Z childFragmentManager2 = ocGuideDoubleOpenFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                        ProductContentInfo productContentInfo2 = ocGuideDoubleOpenFragment.f30421q0;
                        androidx.camera.core.impl.utils.n.y(loanCreditService2, childFragmentManager2, productContentInfo2 != null ? productContentInfo2.loanProduct : null, null, productContentInfo2 != null ? productContentInfo2.applyId : null, 4);
                    }
                } else {
                    i0.K(null, null);
                }
                n0 n0VarG2 = n0.g();
                String strConcat = ocGuideDoubleOpenFragment.getClass().getSimpleName().concat("_element_click");
                p099gb.b bVar = ocGuideDoubleOpenFragment.f30418Z;
                if (bVar != null && (textView = bVar.openFlexiTv) != null) {
                    text = textView.getText();
                }
                n0VarG2.m(strConcat, String.valueOf(text), "");
                break;
            case 22:
                E activity2 = ((OcProtocolNoLockFragment) obj).getActivity();
                Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.credit.ui.activity.okcard.OcProtocolActivity");
                ((OcProtocolActivity) activity2).m();
                n0.g().m("OcProtocolNoLockFragment_element_click", "next_bt", "");
                break;
            case 23:
                SelectBankForTransferViaUssdDialog.a aVar4 = SelectBankForTransferViaUssdDialog.f33621Y;
                ((SelectBankForTransferViaUssdDialog) obj).dismiss();
                break;
            case 24:
                int i19 = TransferViaUssdActivity.f33628A;
                int id4 = view.getId();
                TransferViaUssdActivity transferViaUssdActivity = (TransferViaUssdActivity) obj;
                if (id4 == e.tv_select_bank) {
                    SelectBankForTransferViaUssdDialog selectBankForTransferViaUssdDialogNewInstance = SelectBankForTransferViaUssdDialog.f33621Y.newInstance();
                    Z supportFragmentManager = transferViaUssdActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    selectBankForTransferViaUssdDialogNewInstance.show(supportFragmentManager, "SelectBankForTransferViaUssdDialog");
                } else if (id4 == e.tv_next) {
                    EditText editTextL = transferViaUssdActivity.l();
                    if (y.k(String.valueOf(editTextL != null ? editTextL.getText() : null), " ", "").length() >= 10) {
                        transferViaUssdActivity.n().setErrorMessage("");
                        BankInfo bankInfo = transferViaUssdActivity.f33636i;
                        t tVar = transferViaUssdActivity.f33631c;
                        if (bankInfo != null) {
                            Object value2 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            ((ModelErrorDivider) value2).setErrorMessage("");
                            PpAmountEditText ppAmountEditTextM = transferViaUssdActivity.m();
                            if ((ppAmountEditTextM != null ? ppAmountEditTextM.getLongAmount() : 0L) >= 1000) {
                                PpAmountEditText ppAmountEditTextM2 = transferViaUssdActivity.m();
                                if ((ppAmountEditTextM2 != null ? ppAmountEditTextM2.getLongAmount() : 0L) <= 500000000) {
                                    transferViaUssdActivity.m().setError("");
                                    String str2 = transferViaUssdActivity.f33640v;
                                    if (str2 != null) {
                                        String str3 = TextUtils.isEmpty(str2) ? null : str2;
                                        if (str3 != null) {
                                            PhoneUtils.dial(Uri.encode(str3));
                                        }
                                    }
                                } else {
                                    String string3 = transferViaUssdActivity.getString(p159kd.h.sm_amount_must_be_below_, r0.B(500000000L, false));
                                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                                    transferViaUssdActivity.m().setError(string3);
                                }
                            } else {
                                String string4 = transferViaUssdActivity.getString(p159kd.h.sm_amount_must_be_above_, r0.B(1000L, false));
                                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                                transferViaUssdActivity.m().setError(string4);
                            }
                        } else {
                            Object value3 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                            ((ModelErrorDivider) value3).setErrorMessage("Please select corresponding bank.");
                        }
                    } else {
                        transferViaUssdActivity.n().setErrorMessage("Please enter 10 digits account number.");
                    }
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                n0.g().l("CashBox_WithdrawPop_Cancel_Click");
                View view3 = ((p385ze.a) obj).itemView;
                if (view3 != null && (context = view3.getContext()) != null) {
                    i0.O(context);
                    break;
                }
                break;
            default:
                if (!BaseApplication.hasLogin()) {
                    MainUtils.jumpLoginWithParam(MainUtils.MAIN_WEALTH_TAB_PATH);
                } else {
                    n0 n0VarG3 = n0.g();
                    ClickEvent clickEvent = new ClickEvent("FinanceTab_FixedSavings_Save_Click");
                    HotProductBean hotProductBean = (HotProductBean) obj;
                    Long l5 = hotProductBean.productId;
                    if (l5 != null && (string2 = l5.toString()) != null) {
                        str = string2;
                    }
                    n0VarG3.k(clickEvent.add("element_name", str));
                    Postcard postcardBuild = ARouter.getInstance().build("/manage_money/create_plan_activity");
                    Long l6 = hotProductBean.productId;
                    postcardBuild.withLong(FirebaseAnalytics.Param.PRODUCT_ID, l6 != null ? l6.longValue() : 0L).withLong("duration_day", hotProductBean.durationDay).navigation();
                }
                break;
        }
    }

    public /* synthetic */ c(d dVar, int i7) {
        this.f43159a = 2;
        this.f43160b = dVar;
    }
}
