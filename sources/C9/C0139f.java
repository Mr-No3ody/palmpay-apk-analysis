package C9;

import C0.AbstractC0130w;
import Ce.ViewOnClickListenerC0159a;
import Ed.C0241v;
import N8.C0457a;
import N8.l0;
import Oc.C0503f;
import Pa.AbstractC0511h;
import Pa.C0510g;
import Pa.i0;
import Pa.r0;
import Wf.AbstractC0780y;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.alibaba.android.arouter.launcher.ARouter;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity;
import com.google.api.Service;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.req.ApplyBalanceV2Req;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.bean.req.SubmitGuardianReq;
import com.transsnet.palmpay.account.bean.rsp.CheckIdentifyRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckPasswordRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckSecurityVerifyMethodRsp;
import com.transsnet.palmpay.account.bean.rsp.GuardianConfig;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryBvnRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryGuardianInfoRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryTeenStatusRsp;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethod;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethodRsp;
import com.transsnet.palmpay.account.bean.rsp.SubmitGuardianRsp;
import com.transsnet.palmpay.account.bean.rsp.TeenAuthRecord;
import com.transsnet.palmpay.account.ui.activity.AddGuardianActivity;
import com.transsnet.palmpay.account.ui.activity.AuthenticationActivity;
import com.transsnet.palmpay.account.ui.activity.ChangeMobileActivity;
import com.transsnet.palmpay.account.ui.activity.GuardianApproveActivity;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpSuccessActivity;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.account.ui.activity.quota.Tier3QuotaManageActivity;
import com.transsnet.palmpay.account.ui.dialog.SignUpRewardOnBackDialog;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthPswFragment;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthTouchIdV2Fragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianInfoFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianRelationShipFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianResubmitFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationConfirmBvnFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationGetBvnFragment;
import com.transsnet.palmpay.account.ui.fragment.quota.Tier3QuotaAgreementFragment;
import com.transsnet.palmpay.account.ui.fragment.quota.Tier3QuotaManageFragment;
import com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment;
import com.transsnet.palmpay.account.ui.fragment.verify.VerifyAccountPswFragment;
import com.transsnet.palmpay.account.ui.viewmodel.IdentityVerificationViewModel;
import com.transsnet.palmpay.cash_in.bean.response.GetFundConfigResp;
import com.transsnet.palmpay.cash_in.bean.response.WithdrawHomeEntranceBean;
import com.transsnet.palmpay.cash_in.ui.activity.BindBankCardResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentPaymentResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawHomeActivity;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawHomeViewModel;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.bean.rsp.GetCashBoxNewcomerResp;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.PpSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.bean.resp.CashCouponWriteOffResp;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxNewUserOpenDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashCouponFailDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashCouponSuccessDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.SelectPayoutOptionsDialogFragment;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.resp.RecipientResp;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeBeneficiariesFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomePalmPayContactsFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeRecentlyFragment;
import com.transsnet.palmpay.send_money.ui.view.SideBarView;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayContactViewModel;
import com.transsnet.palmpay.ui.fragment.QrReceiveMoneyFragment;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0139f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1303b;

    public /* synthetic */ C0139f(int i7, Object obj, Object obj2) {
        this.f1302a = i7;
        this.f1303b = obj2;
    }

    private final Object a(Object obj) {
        CashCouponFailDialogFragment cashCouponFailDialogFragmentNewInstance;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            boolean z3 = it instanceof com.transsnet.palmpay.core.base.p;
            CashBoxNewUserOpenDialogFragment cashBoxNewUserOpenDialogFragment = (CashBoxNewUserOpenDialogFragment) this.f1303b;
            if (z3) {
                CashCouponWriteOffResp cashCouponWriteOffResp = (CashCouponWriteOffResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (cashBoxNewUserOpenDialogFragment.getActivity() instanceof BaseActivity) {
                    androidx.fragment.app.E activity = cashBoxNewUserOpenDialogFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                    ((BaseActivity) activity).showLoadingDialog(false);
                }
                if (cashCouponWriteOffResp.isSuccess()) {
                    CashCouponWriteOffResp.CashCouponWriteOff data = cashCouponWriteOffResp.getData();
                    if (data != null && data.getCouponAmount() != null && data.getCouponAmount().longValue() > 0) {
                        Integer status = data.getStatus();
                        if (status != null && status.intValue() == 2) {
                            CashCouponSuccessDialogFragment cashCouponSuccessDialogFragmentNewInstance = CashCouponSuccessDialogFragment.f32291C.newInstance(data.getCouponAmount().longValue(), i0.T());
                            if (cashCouponSuccessDialogFragmentNewInstance != null) {
                                cashCouponSuccessDialogFragmentNewInstance.f31248w = new C0503f(cashCouponSuccessDialogFragmentNewInstance);
                                androidx.fragment.app.Z childFragmentManager = cashBoxNewUserOpenDialogFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                cashCouponSuccessDialogFragmentNewInstance.show(childFragmentManager, "showCongratulationsDialog");
                            }
                        } else {
                            Integer status2 = data.getStatus();
                            if (status2 != null && status2.intValue() == 3 && (cashCouponFailDialogFragmentNewInstance = CashCouponFailDialogFragment.f32290C.newInstance(data.getCouponAmount().longValue(), i0.T())) != null) {
                                cashCouponFailDialogFragmentNewInstance.f31248w = new Oc.g(cashCouponFailDialogFragmentNewInstance);
                                androidx.fragment.app.Z childFragmentManager2 = cashBoxNewUserOpenDialogFragment.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                cashCouponFailDialogFragmentNewInstance.show(childFragmentManager2, "showFailDialog");
                            }
                        }
                    }
                } else if (Intrinsics.c(cashCouponWriteOffResp.getRespCode(), "fb_open_error_code")) {
                    String respMsg = cashCouponWriteOffResp.getRespMsg();
                    if (respMsg != null) {
                        CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxNewUserOpenDialogFragment.getResources().getString(Jc.f.mm_fb_open_code_title), respMsg, cashBoxNewUserOpenDialogFragment.getResources().getString(p025ba.k.core_confirm), null, 8, null);
                        androidx.fragment.app.Z childFragmentManager3 = cashBoxNewUserOpenDialogFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                        commonTipsDialogFragmentCreateDialog$default.show(childFragmentManager3, "showErrorDialog");
                    }
                } else {
                    String respMsg2 = cashCouponWriteOffResp.getRespMsg();
                    if (respMsg2 != null) {
                        CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, cashBoxNewUserOpenDialogFragment.getResources().getString(p025ba.k.core_oops), respMsg2, cashBoxNewUserOpenDialogFragment.getResources().getString(p025ba.k.core_ok1), null, 8, null);
                        androidx.fragment.app.Z childFragmentManager4 = cashBoxNewUserOpenDialogFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                        commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager4, "showErrorDialog");
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                String str = ((com.transsnet.palmpay.core.base.n) it).f27358a;
                if (cashBoxNewUserOpenDialogFragment.getActivity() instanceof BaseActivity) {
                    androidx.fragment.app.E activity2 = cashBoxNewUserOpenDialogFragment.getActivity();
                    Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                    ((BaseActivity) activity2).showLoadingDialog(false);
                }
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default3 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, null, str, cashBoxNewUserOpenDialogFragment.getString(Jc.f.mm_action_okay), null, 8, null);
                androidx.fragment.app.Z supportFragmentManager = cashBoxNewUserOpenDialogFragment.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default3.show(supportFragmentManager, "showNoSlotsAvailableDialog");
                cashBoxNewUserOpenDialogFragment.dismiss();
            }
        }
        return Unit.f38893a;
    }

    private final Object b(Object obj) {
        Collection collection;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                CommonListResultV2 commonListResultV2 = (CommonListResultV2) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonListResultV2.isSuccess() && (collection = commonListResultV2.data) != null && !collection.isEmpty()) {
                    for (T t : commonListResultV2.data) {
                        if (t.getType() == 40 && t.getPrefered() != 1) {
                            ((PpButton) this.f1303b).setVisibility(0);
                            break;
                        }
                        System.out.println("Processing item with type: " + t.getType());
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                ((com.transsnet.palmpay.core.base.n) it).getClass();
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj) {
        String respMsg;
        CheckPasswordRsp checkPasswordRsp;
        CheckPasswordRsp checkPasswordRsp2;
        CheckPasswordRsp checkPasswordRsp3;
        Intent intent;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            boolean z3 = false;
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                AuthPswFragment.a aVar = AuthPswFragment.f26101w;
                AuthPswFragment authPswFragment = (AuthPswFragment) this.f1303b;
                androidx.fragment.app.E activity = authPswFragment.getActivity();
                String error = null;
                error = null;
                AuthenticationActivity authenticationActivity = activity instanceof AuthenticationActivity ? (AuthenticationActivity) activity : null;
                if (authenticationActivity != null && (intent = authenticationActivity.getIntent()) != null) {
                    intent.getStringExtra("extra_scene");
                }
                String str = authenticationActivity != null ? authenticationActivity.f25831b : null;
                Object[] objArr = str == null || str.length() == 0;
                String str2 = objArr == false ? "payment" : "setting";
                String str3 = objArr == false ? "cashier" : "settings";
                if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
                    PinEntryView pinEntryView = authPswFragment.f26102j;
                    if (pinEntryView != null) {
                        pinEntryView.b();
                    }
                    String respCode = commonBeanResult != null ? commonBeanResult.getRespCode() : null;
                    if (commonBeanResult != null) {
                        commonBeanResult.getRespMsg();
                    }
                    Pair pairT = D3.a.t(respCode, (commonBeanResult == null || (checkPasswordRsp3 = (CheckPasswordRsp) commonBeanResult.data) == null || !checkPasswordRsp3.lock) ? false : true, (commonBeanResult == null || (checkPasswordRsp2 = (CheckPasswordRsp) commonBeanResult.data) == null || !checkPasswordRsp2.passwordCheck) ? false : true);
                    String str4 = (String) pairT.f38891a;
                    String str5 = (String) pairT.f38892b;
                    if (commonBeanResult != null && commonBeanResult.isSuccess()) {
                        z3 = true;
                    }
                    String respMsg2 = commonBeanResult != null ? commonBeanResult.getRespMsg() : null;
                    String respCode2 = commonBeanResult != null ? commonBeanResult.getRespCode() : null;
                    if (commonBeanResult != null && (checkPasswordRsp = (CheckPasswordRsp) commonBeanResult.data) != null) {
                        error = checkPasswordRsp.getError();
                    }
                    AuthPswFragment.v(str2, str3, "fail", str4, str5, D3.a.D(respMsg2, respCode2, error, z3));
                    if (commonBeanResult == null || (respMsg = commonBeanResult.getRespMsg()) == null) {
                        respMsg = "Verify fail";
                    }
                    AuthPswFragment.t(authPswFragment, respMsg);
                } else if (((CheckPasswordRsp) commonBeanResult.data).passwordCheck) {
                    AuthPswFragment.v(str2, str3, "success", null, null, null);
                    PinEntryView pinEntryView2 = authPswFragment.f26102j;
                    String strA = SecurityUtils.a(String.valueOf(pinEntryView2 != null ? pinEntryView2.getText() : null));
                    Intrinsics.checkNotNullExpressionValue(strA, "encryptPin(...)");
                    AuthenticationActivity authenticationActivity2 = (AuthenticationActivity) authPswFragment.getActivity();
                    if (authenticationActivity2 != null) {
                        int i7 = authPswFragment.t;
                        if (i7 == 1) {
                            PinEntryView pinEntryView3 = authPswFragment.f26102j;
                            p220oa.h.i(authenticationActivity2, F8.d.fragment_container, AuthTouchIdV2Fragment.f26106A.newInstance(i7, authenticationActivity2.f25832c, SecurityUtils.a(String.valueOf(pinEntryView3 != null ? pinEntryView3.getText() : null)), authenticationActivity2.getIntent().getStringExtra("extra_scene")));
                        } else {
                            authenticationActivity2.m(strA, null, true);
                        }
                    }
                } else {
                    PinEntryView pinEntryView4 = authPswFragment.f26102j;
                    if (pinEntryView4 != null) {
                        pinEntryView4.b();
                    }
                    CheckPasswordRsp checkPasswordRsp4 = (CheckPasswordRsp) commonBeanResult.data;
                    if (checkPasswordRsp4.lock) {
                        String error2 = checkPasswordRsp4.getError();
                        if (error2 == null) {
                            error2 = authPswFragment.getString(F8.h.ac_msg_account_locked);
                            Intrinsics.checkNotNullExpressionValue(error2, "getString(...)");
                        }
                        AuthPswFragment.v(str2, str3, "fail", "user_action", "too_many_attempts", error2);
                        String string = authPswFragment.getString(F8.h.ac_msg_account_locked);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        AuthPswFragment.t(authPswFragment, string);
                    } else {
                        AuthPswFragment.v(str2, str3, "fail", "user_action", "password_incorrect", D3.a.D(commonBeanResult.getRespMsg(), commonBeanResult.getRespCode(), ((CheckPasswordRsp) commonBeanResult.data).getError(), true));
                        String string2 = authPswFragment.getString(F8.h.ac_msg_pin_retry_times_left, Integer.valueOf(((CheckPasswordRsp) commonBeanResult.data).remainCount));
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        AuthPswFragment.t(authPswFragment, string2);
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
            }
        }
        return Unit.f38893a;
    }

    private final Object d(Object obj) {
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            boolean z3 = it instanceof com.transsnet.palmpay.core.base.p;
            AuthTouchIdV2Fragment authTouchIdV2Fragment = (AuthTouchIdV2Fragment) this.f1303b;
            if (z3) {
                CommonStringResult commonStringResult = (CommonStringResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonStringResult.isSuccess()) {
                    AuthTouchIdV2Fragment.a aVar = AuthTouchIdV2Fragment.f26106A;
                    AuthenticationActivity authenticationActivityT = authTouchIdV2Fragment.t();
                    if (authenticationActivityT != null) {
                        authenticationActivityT.m(null, commonStringResult.data, true);
                    }
                } else {
                    p220oa.h.y(authTouchIdV2Fragment, commonStringResult.getRespMsg());
                    AuthTouchIdV2Fragment.a aVar2 = AuthTouchIdV2Fragment.f26106A;
                    authTouchIdV2Fragment.u();
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                p220oa.h.y(authTouchIdV2Fragment, nVar.f27358a);
                AuthTouchIdV2Fragment.a aVar3 = AuthTouchIdV2Fragment.f26106A;
                authTouchIdV2Fragment.u();
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj) {
        ArrayList<String> arrayList;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonBeanResult.isSuccess()) {
                    AddGuardianInfoFragment addGuardianInfoFragment = (AddGuardianInfoFragment) this.f1303b;
                    AddGuardianActivity addGuardianActivityV = addGuardianInfoFragment.v();
                    if (addGuardianActivityV != null) {
                        addGuardianActivityV.f25817f = (GuardianConfig) commonBeanResult.data;
                    }
                    Context context = addGuardianInfoFragment.getContext();
                    GuardianConfig guardianConfig = (GuardianConfig) commonBeanResult.data;
                    r0.D1(context, guardianConfig != null ? guardianConfig.unGuardianShipPic : null);
                    Context context2 = addGuardianInfoFragment.getContext();
                    GuardianConfig guardianConfig2 = (GuardianConfig) commonBeanResult.data;
                    r0.D1(context2, guardianConfig2 != null ? guardianConfig2.birthCertificatePic : null);
                    GuardianConfig guardianConfig3 = (GuardianConfig) commonBeanResult.data;
                    Bc.i iVar = addGuardianInfoFragment.f26135p;
                    if (iVar != null) {
                        LinearLayout linearLayout = (LinearLayout) iVar.f730i;
                        TextView textView = new TextView(addGuardianInfoFragment.getContext());
                        textView.setText(p220oa.h.B("Note:", textView.getContext(), Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, textView.getContext())), null, 14, "sans-serif-medium", null, 996));
                        linearLayout.addView(textView);
                        if (guardianConfig3 != null && (arrayList = guardianConfig3.notes) != null) {
                            for (String str : arrayList) {
                                TextView textView2 = new TextView(addGuardianInfoFragment.getContext());
                                textView2.setText(p220oa.h.B(C0.G.o("· ", str), textView2.getContext(), Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, textView2.getContext())), null, 12, null, null, 1012));
                                linearLayout.addView(textView2);
                                p220oa.h.k(textView2, Integer.valueOf(CommonViewExtKt.getDp(12.0f)), null, null, null, 14);
                            }
                        }
                        p220oa.h.C(linearLayout);
                    }
                    Bc.i iVar2 = addGuardianInfoFragment.f26135p;
                    if (iVar2 != null) {
                        ((TextView) iVar2.f729g).setText(((GuardianConfig) commonBeanResult.data).addGuardianTitle);
                    }
                    Bc.i iVar3 = addGuardianInfoFragment.f26135p;
                    if (iVar3 != null) {
                        ((TextView) iVar3.f728f).setText(((GuardianConfig) commonBeanResult.data).addGuardianContent);
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it).f27358a, new Object[0]);
                ((com.transsnet.palmpay.core.base.n) it).getClass();
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x0205  */
    /* JADX WARN: Code duplicated, block: B:78:0x0238 A[PHI: r0
      0x0238: PHI (r0v8 Bc.f) = (r0v6 Bc.f), (r0v7 Bc.f), (r0v26 Bc.f) binds: [B:87:0x025f, B:82:0x0246, B:77:0x0236] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object f(Object obj) {
        Bc.f fVar;
        androidx.fragment.app.E activity;
        AddGuardianActivity addGuardianActivityV;
        SubmitGuardianReq submitGuardianReqL;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            boolean z3 = it instanceof com.transsnet.palmpay.core.base.p;
            AddGuardianRelationShipFragment addGuardianRelationShipFragment = (AddGuardianRelationShipFragment) this.f1303b;
            if (z3) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                if (commonBeanResult.isSuccess()) {
                    addGuardianRelationShipFragment.x(Integer.valueOf(F8.d.fragment_add_guardian_step_relation), (SubmitGuardianRsp) commonBeanResult.data);
                } else {
                    String respCode = commonBeanResult.getRespCode();
                    if (respCode != null) {
                        switch (respCode.hashCode()) {
                            case 1599549338:
                                if (!respCode.equals("11501000")) {
                                    if (Intrinsics.c(commonBeanResult.getRespCode(), "11501027") && (addGuardianActivityV = addGuardianRelationShipFragment.v()) != null && (submitGuardianReqL = addGuardianActivityV.l()) != null) {
                                        submitGuardianReqL.otpToken = null;
                                    }
                                    if (commonBeanResult.getRichTextErrorDialog(addGuardianRelationShipFragment.getActivity()) == null && (activity = addGuardianRelationShipFragment.getActivity()) != null) {
                                        io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, null, null, null, null, false, 0, 8388221);
                                    }
                                } else {
                                    androidx.fragment.app.E activity2 = addGuardianRelationShipFragment.getActivity();
                                    if (activity2 != null) {
                                        io.fastkv.n.O(activity2, 0, null, "Guardian's Age Ineligible", null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_change_guardian), null, new T8.k(addGuardianRelationShipFragment, 1), null, null, null, null, false, 0, 8387195);
                                    }
                                }
                                break;
                            case 1599549341:
                                if (!respCode.equals("11501003")) {
                                    if (Intrinsics.c(commonBeanResult.getRespCode(), "11501027")) {
                                        submitGuardianReqL.otpToken = null;
                                    }
                                    if (commonBeanResult.getRichTextErrorDialog(addGuardianRelationShipFragment.getActivity()) == null) {
                                        io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, null, null, null, null, false, 0, 8388221);
                                    }
                                } else {
                                    androidx.fragment.app.E activity3 = addGuardianRelationShipFragment.getActivity();
                                    if (activity3 != null) {
                                        io.fastkv.n.O(activity3, 0, null, addGuardianRelationShipFragment.getString(F8.h.ac_authorization_limit), null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_change_guardian), null, new T8.k(addGuardianRelationShipFragment, 2), null, null, null, null, false, 0, 8387195);
                                    }
                                }
                                break;
                            case 1599549345:
                                if (!respCode.equals("11501007")) {
                                    if (Intrinsics.c(commonBeanResult.getRespCode(), "11501027")) {
                                        submitGuardianReqL.otpToken = null;
                                    }
                                    if (commonBeanResult.getRichTextErrorDialog(addGuardianRelationShipFragment.getActivity()) == null) {
                                        io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, null, null, null, null, false, 0, 8388221);
                                    }
                                } else {
                                    AbstractC0130w abstractC0130w = addGuardianRelationShipFragment.f26142o;
                                    if (abstractC0130w != null) {
                                        abstractC0130w.h(F8.d.fragment_add_guardian_step_extra_2, null, BaseAddGuardianFragment.u(null, false));
                                    }
                                }
                                break;
                            case 1599549347:
                                if (!respCode.equals("11501009")) {
                                    if (Intrinsics.c(commonBeanResult.getRespCode(), "11501027")) {
                                        submitGuardianReqL.otpToken = null;
                                    }
                                    if (commonBeanResult.getRichTextErrorDialog(addGuardianRelationShipFragment.getActivity()) == null) {
                                        io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, null, null, null, null, false, 0, 8388221);
                                    }
                                } else {
                                    AbstractC0130w abstractC0130w2 = addGuardianRelationShipFragment.f26142o;
                                    if (abstractC0130w2 != null) {
                                        abstractC0130w2.h(F8.d.fragment_add_guardian_step_extra, null, BaseAddGuardianFragment.u(null, false));
                                    }
                                }
                                break;
                            case 1599549402:
                                if (!respCode.equals("11501022")) {
                                    if (Intrinsics.c(commonBeanResult.getRespCode(), "11501027")) {
                                        submitGuardianReqL.otpToken = null;
                                    }
                                    if (commonBeanResult.getRichTextErrorDialog(addGuardianRelationShipFragment.getActivity()) == null) {
                                        io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, null, null, null, null, false, 0, 8388221);
                                    }
                                } else {
                                    androidx.fragment.app.E activity4 = addGuardianRelationShipFragment.getActivity();
                                    if (activity4 != null) {
                                        io.fastkv.n.O(activity4, 2, null, "Guardian Needs PalmPay Account", null, null, null, commonBeanResult.getRespMsg(), null, "Register Now", new T8.k(addGuardianRelationShipFragment, 7), Integer.valueOf(F8.h.ac_change_guardian), null, new T8.k(addGuardianRelationShipFragment, 6), new K8.a(23), false, 0, 8343930);
                                    }
                                }
                                break;
                            case 1599549403:
                                if (!respCode.equals("11501023")) {
                                    if (Intrinsics.c(commonBeanResult.getRespCode(), "11501027")) {
                                        submitGuardianReqL.otpToken = null;
                                    }
                                    if (commonBeanResult.getRichTextErrorDialog(addGuardianRelationShipFragment.getActivity()) == null) {
                                        io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, null, null, null, null, false, 0, 8388221);
                                    }
                                } else {
                                    androidx.fragment.app.E activity5 = addGuardianRelationShipFragment.getActivity();
                                    if (activity5 != null) {
                                        io.fastkv.n.O(activity5, 0, null, addGuardianRelationShipFragment.getString(F8.h.ac_guardian_palmpay_account_alert), null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_change_guardian), null, new T8.k(addGuardianRelationShipFragment, 0), null, null, null, null, false, 0, 8387195);
                                    }
                                }
                                break;
                            case 1599549406:
                                if (!respCode.equals("11501026")) {
                                    if (Intrinsics.c(commonBeanResult.getRespCode(), "11501027")) {
                                        submitGuardianReqL.otpToken = null;
                                    }
                                    if (commonBeanResult.getRichTextErrorDialog(addGuardianRelationShipFragment.getActivity()) == null) {
                                        io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, null, null, null, null, false, 0, 8388221);
                                    }
                                } else {
                                    Intent intentC = Pa.F.c(addGuardianRelationShipFragment.getActivity(), ARouter.getInstance().build("/account/verifyAccount"));
                                    if (intentC != null) {
                                        intentC.putExtra("extra_use_night_mode", true);
                                        intentC.putExtra("extra_type", SecurityVerifyMethodReq.TEENAGER_AUTH_APPLY);
                                        Bc.f fVar2 = addGuardianRelationShipFragment.t;
                                        intentC.putExtra("_number", r0.a0(AddGuardianRelationShipFragment.z(fVar2 != null ? (PpFormVertical) fVar2.f699e : null)));
                                        (addGuardianRelationShipFragment.getActivity() instanceof BaseActivity ? ((BaseActivity) addGuardianRelationShipFragment.getActivity()).getF28604i() : null).f(intentC, new C0457a(addGuardianRelationShipFragment, 22));
                                    }
                                }
                                break;
                            default:
                                if (Intrinsics.c(commonBeanResult.getRespCode(), "11501027")) {
                                    submitGuardianReqL.otpToken = null;
                                }
                                if (commonBeanResult.getRichTextErrorDialog(addGuardianRelationShipFragment.getActivity()) == null) {
                                    io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, null, null, null, null, false, 0, 8388221);
                                }
                                break;
                        }
                    } else {
                        if (Intrinsics.c(commonBeanResult.getRespCode(), "11501027")) {
                            submitGuardianReqL.otpToken = null;
                        }
                        if (commonBeanResult.getRichTextErrorDialog(addGuardianRelationShipFragment.getActivity()) == null) {
                            io.fastkv.n.O(activity, 0, Integer.valueOf(p025ba.k.core_oops), null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, null, null, null, null, false, 0, 8388221);
                        }
                    }
                }
                fVar = addGuardianRelationShipFragment.t;
                if (fVar != null) {
                    ((PpButton) fVar.f698d).b(false);
                }
            } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                fVar = addGuardianRelationShipFragment.t;
                if (fVar != null) {
                    ((PpButton) fVar.f698d).b(false);
                }
            } else {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                fVar = addGuardianRelationShipFragment.t;
                if (fVar != null) {
                    ((PpButton) fVar.f698d).b(false);
                }
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0123  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj) {
        Bc.D d2;
        ArrayList<String> arrayList;
        String str;
        CharSequence charSequenceB;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            if (it instanceof com.transsnet.palmpay.core.base.p) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                boolean zIsSuccess = commonBeanResult.isSuccess();
                AddGuardianResubmitFragment addGuardianResubmitFragment = (AddGuardianResubmitFragment) this.f1303b;
                if (zIsSuccess) {
                    QueryTeenStatusRsp queryTeenStatusRsp = (QueryTeenStatusRsp) commonBeanResult.data;
                    SpannableStringBuilder spannableStringBuilderB = null;
                    addGuardianResubmitFragment.t = queryTeenStatusRsp != null ? queryTeenStatusRsp.lastApplyOrderRecord : null;
                    TeenAuthRecord teenAuthRecord = queryTeenStatusRsp != null ? queryTeenStatusRsp.lastApplyOrderRecord : null;
                    if (TextUtils.isEmpty(teenAuthRecord != null ? teenAuthRecord.guardianName : null)) {
                        d2 = addGuardianResubmitFragment.f26139p;
                        if (d2 != null) {
                            p220oa.h.c((ConstraintLayout) d2.f627w);
                        }
                    } else if (TextUtils.isEmpty(teenAuthRecord != null ? teenAuthRecord.guardianPhone : null)) {
                        d2 = addGuardianResubmitFragment.f26139p;
                        if (d2 != null) {
                            p220oa.h.c((ConstraintLayout) d2.f627w);
                        }
                    } else {
                        Bc.D d10 = addGuardianResubmitFragment.f26139p;
                        if (d10 != null) {
                            p220oa.h.C((ConstraintLayout) d10.f627w);
                        }
                        Bc.D d11 = addGuardianResubmitFragment.f26139p;
                        if (d11 != null) {
                            d11.f619e.setText(teenAuthRecord != null ? teenAuthRecord.guardianName : null);
                        }
                        Bc.D d12 = addGuardianResubmitFragment.f26139p;
                        if (d12 != null) {
                            d12.f620f.setText(r0.Y(teenAuthRecord != null ? teenAuthRecord.guardianPhone : null));
                        }
                        Bc.D d13 = addGuardianResubmitFragment.f26139p;
                        r0.m1(teenAuthRecord != null ? teenAuthRecord.guardianHeadPoint : null, d13 != null ? (ImageView) d13.f616b : null);
                        Bc.D d14 = addGuardianResubmitFragment.f26139p;
                        if (d14 != null) {
                            TextView textView = d14.f621g;
                            Integer numValueOf = teenAuthRecord != null ? Integer.valueOf(teenAuthRecord.guardianAuthStatus) : null;
                            if (numValueOf != null && numValueOf.intValue() == 1) {
                                charSequenceB = p220oa.h.B("Processing", null, Integer.valueOf(L6.b.ppColorWarning), null, null, null, null, 1021);
                            } else if (numValueOf != null && numValueOf.intValue() == 2) {
                                charSequenceB = p220oa.h.B("Success", null, Integer.valueOf(L6.b.ppColorSuccess), null, null, null, null, 1021);
                            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                                charSequenceB = p220oa.h.B("Reject", null, Integer.valueOf(L6.b.ppColorError), null, null, null, null, 1021);
                            } else {
                                charSequenceB = (numValueOf != null && numValueOf.intValue() == 4) ? p220oa.h.B("Time Out", null, Integer.valueOf(L6.b.ppColorError), null, null, null, null, 1021) : "";
                            }
                            textView.setText(charSequenceB);
                        }
                    }
                    QueryTeenStatusRsp queryTeenStatusRsp2 = (QueryTeenStatusRsp) commonBeanResult.data;
                    TeenAuthRecord teenAuthRecord2 = queryTeenStatusRsp2 != null ? queryTeenStatusRsp2.lastApplyOrderRecord : null;
                    Bc.D d15 = addGuardianResubmitFragment.f26139p;
                    if (d15 != null) {
                        LinearLayout linearLayout = (LinearLayout) d15.f618d;
                        ArrayList<String> arrayList2 = teenAuthRecord2 != null ? teenAuthRecord2.describeDetail : null;
                        p220oa.h.s(linearLayout, !(arrayList2 == null || arrayList2.isEmpty()));
                    }
                    Bc.D d16 = addGuardianResubmitFragment.f26139p;
                    if (d16 != null) {
                        LinearLayout linearLayout2 = (LinearLayout) d16.f614A;
                        TextView textView2 = new TextView(addGuardianResubmitFragment.getContext());
                        if (teenAuthRecord2 != null && (str = teenAuthRecord2.describeTitle) != null) {
                            spannableStringBuilderB = p220oa.h.B(str, textView2.getContext(), Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, textView2.getContext())), null, 14, "sans-serif-medium", null, 996);
                        }
                        textView2.setText(spannableStringBuilderB);
                        linearLayout2.addView(textView2);
                        if (teenAuthRecord2 != null && (arrayList = teenAuthRecord2.describeDetail) != null) {
                            for (String str2 : arrayList) {
                                TextView textView3 = new TextView(addGuardianResubmitFragment.getContext());
                                textView3.setText(p220oa.h.B(str2, textView3.getContext(), Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, textView3.getContext())), null, 12, null, null, 1012));
                                linearLayout2.addView(textView3);
                                p220oa.h.k(textView3, Integer.valueOf(CommonViewExtKt.getDp(12.0f)), null, null, null, 14);
                            }
                        }
                        p220oa.h.C(linearLayout2);
                    }
                    Bc.D d17 = addGuardianResubmitFragment.f26139p;
                    if (d17 != null) {
                        ((PpButton) d17.t).setEnabled(true);
                    }
                } else {
                    androidx.fragment.app.E activity = addGuardianResubmitFragment.getActivity();
                    if (activity != null) {
                        io.fastkv.n.O(activity, 0, null, null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(F8.h.ac_confirm), null, null, Integer.valueOf(p025ba.k.core_retry), null, new T8.m(addGuardianResubmitFragment, 0), null, false, 0, 8377983);
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object h(Object obj) {
        PreCheckPhoneRsp preCheckPhoneRsp;
        PreCheckPhoneRsp preCheckPhoneRsp2;
        PreCheckPhoneRsp preCheckPhoneRsp3;
        PreCheckPhoneRsp preCheckPhoneRsp4;
        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
            boolean z3 = it instanceof com.transsnet.palmpay.core.base.p;
            IdentityVerificationConfirmBvnFragment identityVerificationConfirmBvnFragment = (IdentityVerificationConfirmBvnFragment) this.f1303b;
            if (z3) {
                CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                I8.q qVar = (I8.q) identityVerificationConfirmBvnFragment.f27335j;
                if (qVar != null) {
                    qVar.f4190d.b(false);
                }
                if (commonBeanResult.isSuccess()) {
                    IdentityVerificationActivity identityVerificationActivityV = identityVerificationConfirmBvnFragment.v();
                    ApplyBalanceV2Req applyBalanceV2ReqM = identityVerificationActivityV != null ? identityVerificationActivityV.m() : null;
                    if (applyBalanceV2ReqM != null) {
                        applyBalanceV2ReqM.verifyToken = ((CheckIdentifyRsp) commonBeanResult.data).verifyToken;
                    }
                    if (TextUtils.isEmpty(((CheckIdentifyRsp) commonBeanResult.data).verifyToken)) {
                        IdentityVerificationActivity identityVerificationActivityV2 = identityVerificationConfirmBvnFragment.v();
                        if (identityVerificationActivityV2 == null || (preCheckPhoneRsp4 = identityVerificationActivityV2.f25869i) == null || !preCheckPhoneRsp4.needIndustry) {
                            IdentityVerificationActivity identityVerificationActivityV3 = identityVerificationConfirmBvnFragment.v();
                            if (identityVerificationActivityV3 == null || (preCheckPhoneRsp3 = identityVerificationActivityV3.f25869i) == null || !preCheckPhoneRsp3.needAddress) {
                                ToastUtils.showLong("Verify Token is empty", new Object[0]);
                            } else {
                                AbstractC0130w abstractC0130w = identityVerificationConfirmBvnFragment.f26168p;
                                if (abstractC0130w != null) {
                                    abstractC0130w.h(F8.d.fragment_identity_verification_step_address, null, null);
                                }
                            }
                        } else {
                            AbstractC0130w abstractC0130w2 = identityVerificationConfirmBvnFragment.f26168p;
                            if (abstractC0130w2 != null) {
                                abstractC0130w2.h(F8.d.fragment_identity_verification_step_profile, null, null);
                            }
                        }
                    } else {
                        IdentityVerificationActivity identityVerificationActivityV4 = identityVerificationConfirmBvnFragment.v();
                        if (identityVerificationActivityV4 == null || (preCheckPhoneRsp2 = identityVerificationActivityV4.f25869i) == null || !preCheckPhoneRsp2.needIndustry) {
                            IdentityVerificationActivity identityVerificationActivityV5 = identityVerificationConfirmBvnFragment.v();
                            if (identityVerificationActivityV5 == null || (preCheckPhoneRsp = identityVerificationActivityV5.f25869i) == null || !preCheckPhoneRsp.needAddress) {
                                IdentityVerificationActivity identityVerificationActivityV6 = identityVerificationConfirmBvnFragment.v();
                                if (identityVerificationActivityV6 == null || !identityVerificationActivityV6.r()) {
                                    I8.q qVar2 = (I8.q) identityVerificationConfirmBvnFragment.f27335j;
                                    if (qVar2 != null) {
                                        qVar2.f4190d.b(true);
                                    }
                                    IdentityVerificationViewModel identityVerificationViewModel = (IdentityVerificationViewModel) identityVerificationConfirmBvnFragment.f27333i;
                                    if (identityVerificationViewModel != null) {
                                        identityVerificationViewModel.e(applyBalanceV2ReqM);
                                    }
                                } else {
                                    IdentityVerificationActivity identityVerificationActivityV7 = identityVerificationConfirmBvnFragment.v();
                                    if (identityVerificationActivityV7 != null) {
                                        identityVerificationActivityV7.t(((CheckIdentifyRsp) commonBeanResult.data).verifyToken);
                                    }
                                }
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putString("_token", ((CheckIdentifyRsp) commonBeanResult.data).verifyToken);
                                AbstractC0130w abstractC0130w3 = identityVerificationConfirmBvnFragment.f26168p;
                                if (abstractC0130w3 != null) {
                                    abstractC0130w3.h(F8.d.fragment_identity_verification_step_address, bundle, null);
                                }
                            }
                        } else {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("_token", ((CheckIdentifyRsp) commonBeanResult.data).verifyToken);
                            AbstractC0130w abstractC0130w4 = identityVerificationConfirmBvnFragment.f26168p;
                            if (abstractC0130w4 != null) {
                                abstractC0130w4.h(F8.d.fragment_identity_verification_step_profile, bundle2, null);
                            }
                        }
                    }
                } else {
                    I8.q qVar3 = (I8.q) identityVerificationConfirmBvnFragment.f27335j;
                    if (qVar3 != null) {
                        qVar3.f4190d.b(false);
                    }
                    if (Intrinsics.c(commonBeanResult.getRespCode(), "CFRONT_800406")) {
                        androidx.fragment.app.E activity = identityVerificationConfirmBvnFragment.getActivity();
                        if (activity != null) {
                            io.fastkv.n.O(activity, 0, null, "Birthday verification failed", null, null, null, commonBeanResult.getRespMsg(), null, "Enter Information to Verify", new ViewOnClickListenerC0146m(identityVerificationConfirmBvnFragment, 10), null, null, null, null, true, 0, 8305019);
                        }
                    } else if (Intrinsics.c(commonBeanResult.getRespCode(), "CFRONT_800407")) {
                        I8.q qVar4 = (I8.q) identityVerificationConfirmBvnFragment.f27335j;
                        if (qVar4 != null) {
                            qVar4.f4188b.setBottomText(commonBeanResult.getRespMsg());
                        }
                        I8.q qVar5 = (I8.q) identityVerificationConfirmBvnFragment.f27335j;
                        if (qVar5 != null) {
                            qVar5.f4188b.setBottomTextColor(CommonViewExtKt.colorInt(L6.b.ppColorError, identityVerificationConfirmBvnFragment.requireContext()));
                        }
                    } else {
                        androidx.fragment.app.E activity2 = identityVerificationConfirmBvnFragment.getActivity();
                        if (activity2 != null) {
                            io.fastkv.n.O(activity2, 0, null, null, null, null, null, commonBeanResult.getRespMsg(), Integer.valueOf(p025ba.k.core_retry), null, null, null, null, null, null, false, 0, 8388223);
                        }
                    }
                }
            } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                    throw new p355xf.l();
                }
                com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                ToastUtils.showLong(nVar.f27358a, new Object[0]);
                String str = nVar.f27358a;
                I8.q qVar6 = (I8.q) identityVerificationConfirmBvnFragment.f27335j;
                if (qVar6 != null) {
                    qVar6.f4190d.b(false);
                }
                p220oa.h.y(identityVerificationConfirmBvnFragment, str);
            }
        }
        return Unit.f38893a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:146:0x0248  */
    /* JADX WARN: Code duplicated, block: B:148:0x0255  */
    /* JADX WARN: Code duplicated, block: B:150:0x025b  */
    /* JADX WARN: Code duplicated, block: B:152:0x0260  */
    /* JADX WARN: Code duplicated, block: B:155:0x0270  */
    /* JADX WARN: Code duplicated, block: B:166:0x0298  */
    /* JADX WARN: Code duplicated, block: B:168:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:179:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:182:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:184:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:186:0x02f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WithdrawHomeEntranceBean newData;
        List<RecipientListResp.RecipientBean> data;
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel;
        List<RecipientListResp.RecipientBean> data2;
        List<RecipientListResp.RecipientBean> data3;
        TransferToPalmPayContactViewModel transferToPalmPayContactViewModel2;
        CommonListResult.CommonList<T> commonList;
        List<RecipientBeanV2> data4;
        List<SecurityVerifyMethod> list;
        int i7 = 11;
        int i10 = 3;
        int i11 = 1;
        Boolean bool = null;
        Boolean bool2 = null;
        PayByOrderResp.DataBean dataBean = null;
        int i12 = 0;
        Object obj2 = this.f1303b;
        switch (this.f1302a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(it instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it instanceof com.transsnet.palmpay.core.base.p) {
                        CheckPayResp checkPayResp = (CheckPayResp) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                        BindBankCardResultActivity bindBankCardResultActivity = (BindBankCardResultActivity) obj2;
                        if (checkPayResp.isSuccess()) {
                            PayByOrderResp.DataBean data5 = checkPayResp.getData();
                            if (data5 != null) {
                                bindBankCardResultActivity.f26795g = data5;
                                bindBankCardResultActivity.o();
                            }
                        } else {
                            p220oa.h.x(bindBankCardResultActivity, checkPayResp.getRespMsg());
                        }
                    } else if (!(it instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        nVar.getClass();
                    }
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        C0510g c0510g = AbstractC0511h.f7089a;
                        RechargeActivity rechargeActivity = (RechargeActivity) obj2;
                        Object value = rechargeActivity.f26871c.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        TextView textView = (TextView) value;
                        GetFundConfigResp getFundConfigResp = (GetFundConfigResp) commonBeanResult.data;
                        c0510g.richText(textView, getFundConfigResp != null ? getFundConfigResp.nibssFundContent : null, getFundConfigResp != null ? getFundConfigResp.nibssFundHighlightContent : null, new C0155w(i12, rechargeActivity, commonBeanResult));
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it2).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a;
                        WithdrawAgentPaymentResultActivity withdrawAgentPaymentResultActivity = (WithdrawAgentPaymentResultActivity) obj2;
                        if (commonBeanResult2.isSuccess()) {
                            QueryOrderDetailRsp queryOrderDetailRsp = (QueryOrderDetailRsp) commonBeanResult2.data;
                            if (queryOrderDetailRsp != null) {
                                withdrawAgentPaymentResultActivity.t = queryOrderDetailRsp;
                                PayByOrderResp.DataBean dataBean2 = withdrawAgentPaymentResultActivity.f26921p;
                                if (dataBean2 != null) {
                                    dataBean2.payStatus = queryOrderDetailRsp.orderStatus;
                                    dataBean2.orderNo = dataBean2.orderNo;
                                    dataBean2.payId = dataBean2.payId;
                                    dataBean2.payStatusDesc = queryOrderDetailRsp.orderStatusDesc;
                                    dataBean = dataBean2;
                                }
                                withdrawAgentPaymentResultActivity.f26921p = dataBean;
                                withdrawAgentPaymentResultActivity.p();
                            }
                        } else {
                            p220oa.h.x(withdrawAgentPaymentResultActivity, commonBeanResult2.getRespMsg());
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar2 = (com.transsnet.palmpay.core.base.n) it3;
                        ToastUtils.showLong(nVar2.f27358a, new Object[0]);
                        nVar2.getClass();
                    }
                }
                return Unit.f38893a;
            case 3:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult3 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        if (commonBeanResult3.isSuccess() && (newData = (WithdrawHomeEntranceBean) commonBeanResult3.data) != null) {
                            WithdrawHomeActivity withdrawHomeActivity = (WithdrawHomeActivity) obj2;
                            WithdrawHomeViewModel withdrawHomeViewModel = (WithdrawHomeViewModel) withdrawHomeActivity.t.getValue();
                            withdrawHomeViewModel.getClass();
                            Intrinsics.checkNotNullParameter(newData, "newData");
                            withdrawHomeViewModel.f27109e.k(newData);
                            p355xf.t tVar = withdrawHomeActivity.f26938g;
                            Object value2 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                            r0.k1((ImageView) value2, newData.pic, newData.darkPic);
                            if (!TextUtils.isEmpty(newData.jumpUrl)) {
                                Object value3 = tVar.getValue();
                                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                                ((ImageView) value3).setOnClickListener(new V(i12, withdrawHomeActivity, newData));
                            }
                        }
                    } else if (!(it4 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it4).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 4:
                QrReceiveMoneyFragment qrReceiveMoneyFragment = (QrReceiveMoneyFragment) obj2;
                if (((File) obj) != null) {
                    ToastUtils.showShort(qrReceiveMoneyFragment.getString(Ac.h.main_qrcode_save_in));
                } else {
                    ToastUtils.showShort(qrReceiveMoneyFragment.getString(p025ba.k.core_operation_fail));
                }
                return null;
            case 5:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                        RecipientListResp recipientListResp = (RecipientListResp) ((com.transsnet.palmpay.core.base.p) it5).f27360a;
                        if (recipientListResp.isSuccess()) {
                            List<RecipientListResp.RecipientBean> data6 = recipientListResp.getData();
                            if (data6 == null) {
                                data6 = kotlin.collections.z.f38935a;
                            }
                            BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment = (BankAccountBeneficiaryFragment) obj2;
                            bankAccountBeneficiaryFragment.f33738H = data6;
                            boolean zIsEmpty = data6.isEmpty();
                            p355xf.t tVar2 = bankAccountBeneficiaryFragment.f33741o;
                            p355xf.t tVar3 = bankAccountBeneficiaryFragment.f33740j;
                            p355xf.t tVar4 = bankAccountBeneficiaryFragment.f33743v;
                            if (zIsEmpty) {
                                LinearLayout linearLayout = (LinearLayout) tVar4.getValue();
                                if (linearLayout != null) {
                                    p220oa.h.s(linearLayout, false);
                                }
                                View view = (View) tVar3.getValue();
                                if (view != null) {
                                    p220oa.h.s(view, true);
                                }
                                SideBarView sideBarView = (SideBarView) tVar2.getValue();
                                if (sideBarView != null) {
                                    p220oa.h.s(sideBarView, false);
                                }
                            } else {
                                LinearLayout linearLayout2 = (LinearLayout) tVar4.getValue();
                                if (linearLayout2 != null) {
                                    p220oa.h.s(linearLayout2, true);
                                }
                                View view2 = (View) tVar3.getValue();
                                if (view2 != null) {
                                    p220oa.h.s(view2, false);
                                }
                                SideBarView sideBarView2 = (SideBarView) tVar2.getValue();
                                if (sideBarView2 != null) {
                                    p220oa.h.s(sideBarView2, true);
                                }
                            }
                            bankAccountBeneficiaryFragment.u().setList(Jd.c.h(bankAccountBeneficiaryFragment.f33738H));
                        }
                    } else if (!(it5 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it5).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 6:
                com.transsnet.palmpay.core.base.q it6 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (!(it6 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it6 instanceof com.transsnet.palmpay.core.base.p) {
                        RecipientListResp recipientListResp2 = (RecipientListResp) ((com.transsnet.palmpay.core.base.p) it6).f27360a;
                        if (recipientListResp2.isSuccess() && (data = recipientListResp2.getData()) != null) {
                            BankAccountFavoriteFragment bankAccountFavoriteFragment = (BankAccountFavoriteFragment) obj2;
                            if (data.size() > 5) {
                                bankAccountFavoriteFragment.getClass();
                            } else {
                                int size = data.size();
                                if (1 <= size && size < 6) {
                                    bankAccountFavoriteFragment.getClass();
                                }
                            }
                            bankAccountFavoriteFragment.t().setList(data);
                        }
                    } else if (!(it6 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it6 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar3 = (com.transsnet.palmpay.core.base.n) it6;
                        ToastUtils.showLong(nVar3.f27358a, new Object[0]);
                        nVar3.getClass();
                    }
                }
                return Unit.f38893a;
            case 7:
                com.transsnet.palmpay.core.base.q it7 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                if (!(it7 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it7 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResult commonListResult = (CommonListResult) ((com.transsnet.palmpay.core.base.p) it7).f27360a;
                        if (commonListResult.isSuccess()) {
                            BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment = (BankAccountPalmPayContactFragment) obj2;
                            bankAccountPalmPayContactFragment.u().clear();
                            CopyOnWriteArrayList copyOnWriteArrayListU = bankAccountPalmPayContactFragment.u();
                            CommonListResult.CommonList<T> commonList2 = commonListResult.data;
                            Collection collection = commonList2 != 0 ? commonList2.list : null;
                            if (collection == null) {
                                collection = kotlin.collections.z.f38935a;
                            }
                            copyOnWriteArrayListU.addAll(collection);
                            View view3 = (View) bankAccountPalmPayContactFragment.t.getValue();
                            if (view3 != null) {
                                p220oa.h.s(view3, !bankAccountPalmPayContactFragment.u().isEmpty());
                            }
                            boolean z3 = !bankAccountPalmPayContactFragment.u().isEmpty();
                            SideBarView sideBarView3 = (SideBarView) bankAccountPalmPayContactFragment.f33753j.getValue();
                            if (sideBarView3 != null) {
                                p220oa.h.s(sideBarView3, z3);
                            }
                            bankAccountPalmPayContactFragment.t().setList(androidx.camera.core.impl.utils.n.q(bankAccountPalmPayContactFragment.u(), new Ab.B(i7)));
                            if (!TextUtils.isEmpty(bankAccountPalmPayContactFragment.f33748A) && (transferToPalmPayContactViewModel = (TransferToPalmPayContactViewModel) bankAccountPalmPayContactFragment.f27333i) != null) {
                                AbstractC0780y.m(androidx.lifecycle.V.h(transferToPalmPayContactViewModel), null, null, new C0241v(bankAccountPalmPayContactFragment, null), 3);
                            }
                        }
                    } else if (!(it7 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it7 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it7).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 8:
                com.transsnet.palmpay.core.base.q it8 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!(it8 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it8 instanceof com.transsnet.palmpay.core.base.p) {
                        RecipientListResp recipientListResp3 = (RecipientListResp) ((com.transsnet.palmpay.core.base.p) it8).f27360a;
                        if (recipientListResp3.isSuccess() && (data2 = recipientListResp3.getData()) != null) {
                            TransferToBankHomeBeneficiariesFragment transferToBankHomeBeneficiariesFragment = (TransferToBankHomeBeneficiariesFragment) obj2;
                            if (data2.size() <= 5) {
                                data2.size();
                            }
                            List<RecipientListResp.RecipientBean> list2 = data2;
                            transferToBankHomeBeneficiariesFragment.t().setList(list2);
                            if (!list2.isEmpty()) {
                                View viewInflate = transferToBankHomeBeneficiariesFragment.getLayoutInflater().inflate(p159kd.f.sm_item_foot_view_all, (ViewGroup) null);
                                viewInflate.setOnClickListener(new Ed.H(transferToBankHomeBeneficiariesFragment, i12));
                                M1.j.setFooterView$default(transferToBankHomeBeneficiariesFragment.t(), viewInflate, 0, 0, 6, null);
                            }
                        }
                    } else if (!(it8 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it8 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it8).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 9:
                com.transsnet.palmpay.core.base.q it9 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (!(it9 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it9 instanceof com.transsnet.palmpay.core.base.p) {
                        RecipientListResp recipientListResp4 = (RecipientListResp) ((com.transsnet.palmpay.core.base.p) it9).f27360a;
                        if (recipientListResp4.isSuccess() && (data3 = recipientListResp4.getData()) != null) {
                            TransferToBankHomeFavoriteFragment transferToBankHomeFavoriteFragment = (TransferToBankHomeFavoriteFragment) obj2;
                            if (data3.size() > 5) {
                                transferToBankHomeFavoriteFragment.getClass();
                            } else {
                                int size2 = data3.size();
                                if (1 <= size2 && size2 < 6) {
                                    transferToBankHomeFavoriteFragment.getClass();
                                }
                            }
                            transferToBankHomeFavoriteFragment.t().setList(data3);
                        }
                    } else if (!(it9 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it9 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar4 = (com.transsnet.palmpay.core.base.n) it9;
                        ToastUtils.showLong(nVar4.f27358a, new Object[0]);
                        nVar4.getClass();
                    }
                }
                return Unit.f38893a;
            case 10:
                com.transsnet.palmpay.core.base.q it10 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (!(it10 instanceof com.transsnet.palmpay.core.base.o)) {
                    TransferToBankHomePalmPayContactsFragment transferToBankHomePalmPayContactsFragment = (TransferToBankHomePalmPayContactsFragment) obj2;
                    if (it10 instanceof com.transsnet.palmpay.core.base.p) {
                        RecipientResp recipientResp = (RecipientResp) ((com.transsnet.palmpay.core.base.p) it10).f27360a;
                        PpSwipeRefreshLayout ppSwipeRefreshLayoutU = transferToBankHomePalmPayContactsFragment.u();
                        if (ppSwipeRefreshLayoutU != null) {
                            ppSwipeRefreshLayoutU.setRefreshing(false);
                        }
                        if (recipientResp.isSuccess()) {
                            List<RecipientBeanV2> data7 = recipientResp.getData();
                            if (data7 == null) {
                                data7 = new ArrayList<>();
                            }
                            transferToBankHomePalmPayContactsFragment.t().setList(data7);
                            if (data7.isEmpty()) {
                                transferToBankHomePalmPayContactsFragment.w();
                            }
                        } else {
                            transferToBankHomePalmPayContactsFragment.w();
                        }
                    } else if (!(it10 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it10 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it10).getClass();
                        PpSwipeRefreshLayout ppSwipeRefreshLayoutU2 = transferToBankHomePalmPayContactsFragment.u();
                        if (ppSwipeRefreshLayoutU2 != null) {
                            ppSwipeRefreshLayoutU2.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
            case 11:
                com.transsnet.palmpay.core.base.q it11 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                if (!(it11 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it11 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResult commonListResult2 = (CommonListResult) ((com.transsnet.palmpay.core.base.p) it11).f27360a;
                        if (commonListResult2.isSuccess()) {
                            TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = (TransferToPalmPayContactAllFragment) obj2;
                            transferToPalmPayContactAllFragment.u().clear();
                            CopyOnWriteArrayList copyOnWriteArrayListU2 = transferToPalmPayContactAllFragment.u();
                            CommonListResult.CommonList<T> commonList3 = commonListResult2.data;
                            Collection collection2 = commonList3 != 0 ? commonList3.list : null;
                            if (collection2 == null) {
                                collection2 = kotlin.collections.z.f38935a;
                            }
                            copyOnWriteArrayListU2.addAll(collection2);
                            View view4 = (View) transferToPalmPayContactAllFragment.t.getValue();
                            if (view4 != null) {
                                p220oa.h.s(view4, !transferToPalmPayContactAllFragment.u().isEmpty());
                            }
                            boolean z8 = !transferToPalmPayContactAllFragment.u().isEmpty();
                            SideBarView sideBarView4 = (SideBarView) transferToPalmPayContactAllFragment.f33800j.getValue();
                            if (sideBarView4 != null) {
                                p220oa.h.s(sideBarView4, z8);
                            }
                            transferToPalmPayContactAllFragment.t().setList(androidx.camera.core.impl.utils.n.q(transferToPalmPayContactAllFragment.u(), new Ab.B(15)));
                            if (!TextUtils.isEmpty(transferToPalmPayContactAllFragment.f33804w) && (transferToPalmPayContactViewModel2 = (TransferToPalmPayContactViewModel) transferToPalmPayContactAllFragment.f27333i) != null) {
                                AbstractC0780y.m(androidx.lifecycle.V.h(transferToPalmPayContactViewModel2), null, null, new Fd.i(transferToPalmPayContactAllFragment, null), 3);
                            }
                        }
                    } else if (!(it11 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it11 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it11).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 12:
                com.transsnet.palmpay.core.base.q it12 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                if (!(it12 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it12 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonListResult commonListResult3 = (CommonListResult) ((com.transsnet.palmpay.core.base.p) it12).f27360a;
                        if (commonListResult3.isSuccess() && (commonList = commonListResult3.data) != 0) {
                            TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment = (TransferToPalmPayContactFavoriteFragment) obj2;
                            transferToPalmPayContactFavoriteFragment.u().clear();
                            Collection collection3 = commonList.list;
                            if (collection3 != null) {
                                transferToPalmPayContactFavoriteFragment.u().addAll(collection3);
                            }
                            View view5 = (View) transferToPalmPayContactFavoriteFragment.f33807p.getValue();
                            if (view5 != null) {
                                p220oa.h.s(view5, !transferToPalmPayContactFavoriteFragment.u().isEmpty());
                            }
                            transferToPalmPayContactFavoriteFragment.u().isEmpty();
                            transferToPalmPayContactFavoriteFragment.t().setList(transferToPalmPayContactFavoriteFragment.u());
                        }
                    } else if (!(it12 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it12 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it12).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 13:
                com.transsnet.palmpay.core.base.q it13 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it13, "it");
                if (!(it13 instanceof com.transsnet.palmpay.core.base.o)) {
                    TransferToPalmPayHomeFavoriteFragment transferToPalmPayHomeFavoriteFragment = (TransferToPalmPayHomeFavoriteFragment) obj2;
                    if (it13 instanceof com.transsnet.palmpay.core.base.p) {
                        RecipientResp recipientResp2 = (RecipientResp) ((com.transsnet.palmpay.core.base.p) it13).f27360a;
                        PpSwipeRefreshLayout ppSwipeRefreshLayoutU3 = transferToPalmPayHomeFavoriteFragment.u();
                        if (ppSwipeRefreshLayoutU3 != null) {
                            ppSwipeRefreshLayoutU3.setRefreshing(false);
                        }
                        if (!recipientResp2.isSuccess() || (data4 = recipientResp2.getData()) == null || data4.isEmpty()) {
                            transferToPalmPayHomeFavoriteFragment.w();
                        } else {
                            transferToPalmPayHomeFavoriteFragment.t().setList(recipientResp2.getData());
                            View viewInflate2 = transferToPalmPayHomeFavoriteFragment.getLayoutInflater().inflate(p159kd.f.sm_item_foot_view_all, (ViewGroup) null);
                            viewInflate2.setOnClickListener(new Fd.v(transferToPalmPayHomeFavoriteFragment, i11));
                            M1.j.setFooterView$default(transferToPalmPayHomeFavoriteFragment.t(), viewInflate2, 0, 0, 6, null);
                        }
                    } else if (!(it13 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it13 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it13).getClass();
                        PpSwipeRefreshLayout ppSwipeRefreshLayoutU4 = transferToPalmPayHomeFavoriteFragment.u();
                        if (ppSwipeRefreshLayoutU4 != null) {
                            ppSwipeRefreshLayoutU4.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
            case 14:
                com.transsnet.palmpay.core.base.q it14 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it14, "it");
                if (!(it14 instanceof com.transsnet.palmpay.core.base.o)) {
                    TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment = (TransferToPalmPayHomeRecentlyFragment) obj2;
                    if (it14 instanceof com.transsnet.palmpay.core.base.p) {
                        RecipientResp recipientResp3 = (RecipientResp) ((com.transsnet.palmpay.core.base.p) it14).f27360a;
                        int i13 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        PpSwipeRefreshLayout ppSwipeRefreshLayoutU5 = transferToPalmPayHomeRecentlyFragment.u();
                        if (ppSwipeRefreshLayoutU5 != null) {
                            ppSwipeRefreshLayoutU5.setRefreshing(false);
                        }
                        if (recipientResp3.isSuccess()) {
                            List<RecipientBeanV2> data8 = recipientResp3.getData();
                            if (data8 == null) {
                                data8 = new ArrayList<>();
                            }
                            transferToPalmPayHomeRecentlyFragment.t().setList(data8);
                            if (data8.isEmpty()) {
                                if (transferToPalmPayHomeRecentlyFragment.f33827v == null) {
                                    C0.G.u(MessageEvent.EVENT_EMPTY_PALMPAY_RECENTLY, org.greenrobot.eventbus.c.b());
                                }
                                transferToPalmPayHomeRecentlyFragment.w();
                            } else {
                                View viewInflate3 = transferToPalmPayHomeRecentlyFragment.getLayoutInflater().inflate(p159kd.f.sm_item_foot_view_all, (ViewGroup) null);
                                viewInflate3.setOnClickListener(new ViewOnClickListenerC0159a(transferToPalmPayHomeRecentlyFragment, 12));
                                M1.j.setFooterView$default(transferToPalmPayHomeRecentlyFragment.t(), viewInflate3, 0, 0, 6, null);
                            }
                        } else {
                            transferToPalmPayHomeRecentlyFragment.w();
                        }
                    } else if (!(it14 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it14 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ((com.transsnet.palmpay.core.base.n) it14).getClass();
                        int i14 = TransferToPalmPayHomeRecentlyFragment.f33823A;
                        PpSwipeRefreshLayout ppSwipeRefreshLayoutU6 = transferToPalmPayHomeRecentlyFragment.u();
                        if (ppSwipeRefreshLayoutU6 != null) {
                            ppSwipeRefreshLayoutU6.setRefreshing(false);
                        }
                    }
                }
                return Unit.f38893a;
            case 15:
                com.transsnet.palmpay.core.base.q it15 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it15, "it");
                if (!(it15 instanceof com.transsnet.palmpay.core.base.o)) {
                    GuardianApproveActivity guardianApproveActivity = (GuardianApproveActivity) obj2;
                    if (it15 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult4 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it15).f27360a;
                        if (commonBeanResult4.isSuccess()) {
                            guardianApproveActivity.f25860d = (QueryGuardianInfoRsp) commonBeanResult4.data;
                            guardianApproveActivity.m();
                        } else {
                            ToastUtils.showLong(TextUtils.isEmpty(commonBeanResult4.getRespMsg()) ? guardianApproveActivity.getString(p025ba.k.core_no_network) : commonBeanResult4.getRespMsg(), new Object[0]);
                            guardianApproveActivity.finish();
                        }
                    } else if (!(it15 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it15 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        String string = ((com.transsnet.palmpay.core.base.n) it15).f27358a;
                        if (TextUtils.isEmpty(string)) {
                            string = guardianApproveActivity.getString(p025ba.k.core_no_network);
                        }
                        ToastUtils.showLong(string, new Object[0]);
                        guardianApproveActivity.finish();
                    }
                }
                return Unit.f38893a;
            case 16:
                androidx.activity.z addCallback = (androidx.activity.z) obj;
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                SignUpSuccessActivity signUpSuccessActivity = (SignUpSuccessActivity) obj2;
                if (signUpSuccessActivity.f26052i == null || signUpSuccessActivity.f26046b) {
                    i0.H(null);
                } else {
                    signUpSuccessActivity.f26046b = true;
                    new SignUpRewardOnBackDialog(signUpSuccessActivity, signUpSuccessActivity.f26052i).show();
                }
                return Unit.f38893a;
            case 17:
                com.transsnet.palmpay.core.base.q it16 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it16, "it");
                if (!(it16 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it16 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult5 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it16).f27360a;
                        VerifyAccountActivity verifyAccountActivity = (VerifyAccountActivity) obj2;
                        if (!verifyAccountActivity.isFinishing() && !verifyAccountActivity.isDestroyed()) {
                            if (!commonBeanResult5.isSuccess()) {
                                BaseVerifyAccountFragment baseVerifyAccountFragmentM = VerifyAccountActivity.m(verifyAccountActivity);
                                if (baseVerifyAccountFragmentM != null) {
                                    baseVerifyAccountFragmentM.x(commonBeanResult5);
                                    bool2 = Boolean.FALSE;
                                }
                                if (Intrinsics.c(bool2, Boolean.FALSE) && !VerifyAccountActivity.o(verifyAccountActivity, new l0(verifyAccountActivity, commonBeanResult5, 2))) {
                                    verifyAccountActivity.finish();
                                }
                            } else if (TextUtils.isEmpty(((CheckSecurityVerifyMethodRsp) commonBeanResult5.data).verifyToken)) {
                                BaseVerifyAccountFragment baseVerifyAccountFragmentM2 = VerifyAccountActivity.m(verifyAccountActivity);
                                if (baseVerifyAccountFragmentM2 != null) {
                                    baseVerifyAccountFragmentM2.y(commonBeanResult5);
                                    bool = Boolean.FALSE;
                                }
                                if (!Intrinsics.c(bool, Boolean.TRUE)) {
                                    SecurityVerifyMethodRsp securityVerifyMethodRsp = ((CheckSecurityVerifyMethodRsp) commonBeanResult5.data).nextStep;
                                    if (securityVerifyMethodRsp != null && (list = securityVerifyMethodRsp.verifyMethodList) != null && !list.isEmpty()) {
                                        VerifyAccountActivity.n(verifyAccountActivity, ((CheckSecurityVerifyMethodRsp) commonBeanResult5.data).nextStep);
                                    } else if (!TextUtils.isEmpty(((CheckSecurityVerifyMethodRsp) commonBeanResult5.data).errorMsg) && !VerifyAccountActivity.o(verifyAccountActivity, new l0(verifyAccountActivity, commonBeanResult5, i10)) && !((CheckSecurityVerifyMethodRsp) commonBeanResult5.data).retryFlag) {
                                        verifyAccountActivity.finish();
                                    }
                                }
                            } else {
                                BaseVerifyAccountFragment baseVerifyAccountFragmentM3 = VerifyAccountActivity.m(verifyAccountActivity);
                                if ((baseVerifyAccountFragmentM3 instanceof VerifyAccountPswFragment ? (VerifyAccountPswFragment) baseVerifyAccountFragmentM3 : null) != null) {
                                    VerifyAccountPswFragment.A("success", null, null, null);
                                }
                                CheckSecurityVerifyMethodRsp checkSecurityVerifyMethodRsp = (CheckSecurityVerifyMethodRsp) commonBeanResult5.data;
                                if (TextUtils.isEmpty(checkSecurityVerifyMethodRsp != null ? checkSecurityVerifyMethodRsp.verifyToken : null)) {
                                    p220oa.h.x(verifyAccountActivity, "Empty verify token");
                                } else {
                                    String str = verifyAccountActivity.f26063c;
                                    if (str != null) {
                                        switch (str) {
                                            case "modifyPin":
                                                Bundle bundle = new Bundle();
                                                if (Intrinsics.c(verifyAccountActivity.f26063c, SecurityVerifyMethodReq.LOGIN_RESET_PIN)) {
                                                    bundle.putInt("mode", BaseApplication.hasLogin() ? 1 : 3);
                                                } else {
                                                    bundle.putInt("mode", 0);
                                                }
                                                bundle.putString("extra_data_2", verifyAccountActivity.q());
                                                CheckSecurityVerifyMethodRsp checkSecurityVerifyMethodRsp2 = (CheckSecurityVerifyMethodRsp) commonBeanResult5.data;
                                                bundle.putString("_security_token", checkSecurityVerifyMethodRsp2 != null ? checkSecurityVerifyMethodRsp2.verifyToken : null);
                                                com.palmpay.lib.apm.launchcounter.util.d.E(bundle, "/account/setnewpin");
                                                verifyAccountActivity.finish();
                                                break;
                                            case "unLoginModifyPhone":
                                            case "modifyPhone":
                                                ChangeMobileActivity.a aVar = ChangeMobileActivity.f25839e;
                                                CheckSecurityVerifyMethodRsp checkSecurityVerifyMethodRsp3 = (CheckSecurityVerifyMethodRsp) commonBeanResult5.data;
                                                aVar.start(verifyAccountActivity, checkSecurityVerifyMethodRsp3 != null ? checkSecurityVerifyMethodRsp3.verifyToken : null, verifyAccountActivity.f26064d);
                                                verifyAccountActivity.finish();
                                                break;
                                            case "resetPin":
                                                Bundle bundle2 = new Bundle();
                                                if (Intrinsics.c(verifyAccountActivity.f26063c, SecurityVerifyMethodReq.LOGIN_RESET_PIN)) {
                                                    bundle2.putInt("mode", BaseApplication.hasLogin() ? 1 : 3);
                                                } else {
                                                    bundle2.putInt("mode", 0);
                                                }
                                                bundle2.putString("extra_data_2", verifyAccountActivity.q());
                                                CheckSecurityVerifyMethodRsp checkSecurityVerifyMethodRsp4 = (CheckSecurityVerifyMethodRsp) commonBeanResult5.data;
                                                bundle2.putString("_security_token", checkSecurityVerifyMethodRsp4 != null ? checkSecurityVerifyMethodRsp4.verifyToken : null);
                                                com.palmpay.lib.apm.launchcounter.util.d.E(bundle2, "/account/setnewpin");
                                                verifyAccountActivity.finish();
                                                break;
                                            case "resetPassword":
                                                Bundle bundle3 = new Bundle();
                                                if (Intrinsics.c(verifyAccountActivity.f26063c, SecurityVerifyMethodReq.LOGIN_RESET_PASSWORD)) {
                                                    bundle3.putInt("mode", BaseApplication.hasLogin() ? 4 : 5);
                                                } else {
                                                    bundle3.putInt("mode", 6);
                                                }
                                                bundle3.putString("extra_data_2", verifyAccountActivity.q());
                                                CheckSecurityVerifyMethodRsp checkSecurityVerifyMethodRsp5 = (CheckSecurityVerifyMethodRsp) commonBeanResult5.data;
                                                bundle3.putString("_security_token", checkSecurityVerifyMethodRsp5 != null ? checkSecurityVerifyMethodRsp5.verifyToken : null);
                                                com.palmpay.lib.apm.launchcounter.util.d.E(bundle3, "/account/set_new_psw");
                                                verifyAccountActivity.finish();
                                                break;
                                            case "unLoginResetPin":
                                                Bundle bundle4 = new Bundle();
                                                if (Intrinsics.c(verifyAccountActivity.f26063c, SecurityVerifyMethodReq.LOGIN_RESET_PIN)) {
                                                    bundle4.putInt("mode", BaseApplication.hasLogin() ? 1 : 3);
                                                } else {
                                                    bundle4.putInt("mode", 0);
                                                }
                                                bundle4.putString("extra_data_2", verifyAccountActivity.q());
                                                CheckSecurityVerifyMethodRsp checkSecurityVerifyMethodRsp6 = (CheckSecurityVerifyMethodRsp) commonBeanResult5.data;
                                                bundle4.putString("_security_token", checkSecurityVerifyMethodRsp6 != null ? checkSecurityVerifyMethodRsp6.verifyToken : null);
                                                com.palmpay.lib.apm.launchcounter.util.d.E(bundle4, "/account/setnewpin");
                                                verifyAccountActivity.finish();
                                                break;
                                            case "modifyPassword":
                                            case "unLoginResetPassword":
                                                Bundle bundle5 = new Bundle();
                                                if (Intrinsics.c(verifyAccountActivity.f26063c, SecurityVerifyMethodReq.LOGIN_RESET_PASSWORD)) {
                                                    bundle5.putInt("mode", BaseApplication.hasLogin() ? 4 : 5);
                                                } else {
                                                    bundle5.putInt("mode", 6);
                                                }
                                                bundle5.putString("extra_data_2", verifyAccountActivity.q());
                                                CheckSecurityVerifyMethodRsp checkSecurityVerifyMethodRsp7 = (CheckSecurityVerifyMethodRsp) commonBeanResult5.data;
                                                bundle5.putString("_security_token", checkSecurityVerifyMethodRsp7 != null ? checkSecurityVerifyMethodRsp7.verifyToken : null);
                                                com.palmpay.lib.apm.launchcounter.util.d.E(bundle5, "/account/set_new_psw");
                                                verifyAccountActivity.finish();
                                                break;
                                            default:
                                                Intent intent = new Intent();
                                                CheckSecurityVerifyMethodRsp checkSecurityVerifyMethodRsp8 = (CheckSecurityVerifyMethodRsp) commonBeanResult5.data;
                                                intent.putExtra("extra_data", checkSecurityVerifyMethodRsp8 != null ? checkSecurityVerifyMethodRsp8.verifyToken : null);
                                                verifyAccountActivity.setResult(-1, intent);
                                                verifyAccountActivity.finish();
                                                break;
                                        }
                                    } else {
                                        Intent intent2 = new Intent();
                                        CheckSecurityVerifyMethodRsp checkSecurityVerifyMethodRsp9 = (CheckSecurityVerifyMethodRsp) commonBeanResult5.data;
                                        intent2.putExtra("extra_data", checkSecurityVerifyMethodRsp9 != null ? checkSecurityVerifyMethodRsp9.verifyToken : null);
                                        verifyAccountActivity.setResult(-1, intent2);
                                        verifyAccountActivity.finish();
                                    }
                                }
                            }
                        }
                    } else if (!(it16 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it16 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it16).f27358a, new Object[0]);
                    }
                }
                return Unit.f38893a;
            case 18:
                androidx.activity.z addCallback2 = (androidx.activity.z) obj;
                Intrinsics.checkNotNullParameter(addCallback2, "$this$addCallback");
                int i15 = Tier3QuotaManageActivity.f26091f;
                Tier3QuotaManageActivity tier3QuotaManageActivity = (Tier3QuotaManageActivity) obj2;
                Fragment fragmentD = tier3QuotaManageActivity.getSupportFragmentManager().D(F8.d.fragmentContainer);
                if (fragmentD == null) {
                    tier3QuotaManageActivity.finish();
                } else if (fragmentD instanceof Tier3QuotaAgreementFragment) {
                    Tier3QuotaManageActivity tier3QuotaManageActivity2 = (Tier3QuotaManageActivity) ((Tier3QuotaAgreementFragment) fragmentD).getActivity();
                    if (tier3QuotaManageActivity2 != null) {
                        p220oa.h.i(tier3QuotaManageActivity2, F8.d.fragmentContainer, (Tier3QuotaManageFragment) tier3QuotaManageActivity2.f26094e.getValue());
                    }
                } else if (fragmentD instanceof Tier3QuotaManageFragment) {
                    androidx.fragment.app.E activity = ((Tier3QuotaManageFragment) fragmentD).getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                } else {
                    tier3QuotaManageActivity.finish();
                }
                return Unit.f38893a;
            case 19:
                return a(obj);
            case 20:
                com.transsnet.palmpay.core.base.q it17 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it17, "it");
                if (!(it17 instanceof com.transsnet.palmpay.core.base.o)) {
                    if (it17 instanceof com.transsnet.palmpay.core.base.p) {
                        GetCashBoxNewcomerResp getCashBoxNewcomerResp = (GetCashBoxNewcomerResp) ((CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it17).f27360a).data;
                        ((SelectPayoutOptionsDialogFragment) obj2).f32320L = getCashBoxNewcomerResp != null ? Boolean.valueOf(getCashBoxNewcomerResp.cashBoxMemberStatus) : null;
                    } else if (!(it17 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it17 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it17).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it17).getClass();
                    }
                }
                return Unit.f38893a;
            case 21:
                return b(obj);
            case 22:
                K3.n it18 = (K3.n) obj;
                Intrinsics.checkNotNullParameter(it18, "it");
                if (!(it18 instanceof K3.l)) {
                    if (it18 instanceof K3.m) {
                        p006a4.i iVar = (p006a4.i) ((K3.m) it18).f4935a;
                        if (iVar != null && iVar.c() && iVar.getData() != null) {
                            ((FlexiBankPayVerificationActivity) obj2).f21979X = iVar.getData();
                        }
                    } else {
                        if (!(it18 instanceof K3.k)) {
                            throw new p355xf.l();
                        }
                        ((K3.k) it18).getClass();
                    }
                }
                return Unit.f38893a;
            case 23:
                return c(obj);
            case 24:
                return d(obj);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return e(obj);
            case 26:
                return f(obj);
            case 27:
                return g(obj);
            case 28:
                return h(obj);
            default:
                com.transsnet.palmpay.core.base.q it19 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it19, "it");
                if (!(it19 instanceof com.transsnet.palmpay.core.base.o)) {
                    IdentityVerificationGetBvnFragment identityVerificationGetBvnFragment = (IdentityVerificationGetBvnFragment) obj2;
                    if (it19 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult6 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it19).f27360a;
                        if (commonBeanResult6.isSuccess()) {
                            if (identityVerificationGetBvnFragment.getActivity() instanceof IdentityVerificationActivity) {
                                androidx.fragment.app.E activity2 = identityVerificationGetBvnFragment.getActivity();
                                Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity");
                                IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) activity2;
                                QueryBvnRsp queryBvnRsp = (QueryBvnRsp) commonBeanResult6.data;
                                identityVerificationActivity.f25870j = queryBvnRsp != null ? queryBvnRsp.verifyNumber : null;
                            }
                            AbstractC0130w abstractC0130w = identityVerificationGetBvnFragment.f26170p;
                            if (abstractC0130w != null) {
                                abstractC0130w.j();
                            }
                        } else {
                            Context context = identityVerificationGetBvnFragment.getContext();
                            if (context != null) {
                                io.fastkv.n.O(context, 2, null, "Sorry", null, null, null, commonBeanResult6.getRespMsg(), null, "Re-enter Bank Account", null, null, "Enter BVN number manually", new ViewOnClickListenerC0146m(identityVerificationGetBvnFragment, i7), null, false, 0, 8375674);
                            }
                        }
                    } else if (!(it19 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it19 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it19).f27358a, new Object[0]);
                    }
                    int i16 = IdentityVerificationGetBvnFragment.t;
                    identityVerificationGetBvnFragment.v(false);
                }
                return Unit.f38893a;
        }
    }

    public /* synthetic */ C0139f(Object obj, int i7) {
        this.f1302a = i7;
        this.f1303b = obj;
    }
}
