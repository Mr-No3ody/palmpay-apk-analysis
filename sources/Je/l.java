package Je;

import Bc.C0105b;
import Bc.C0107d;
import C0.G;
import I8.v;
import Me.q;
import Me.r;
import N8.C0457a;
import Pa.F;
import Pa.g0;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.flexibank.sdk.cashier.adapter.FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem;
import com.flexibank.sdk.cashier.ui.dialog.FlexiBankCashierSelectPayMethodDialog$CallBack;
import com.flexibank.sdk.p;
import com.google.api.Service;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.horcrux.svg.d0;
import com.palmpay.lib.scanplus.view.CodePointView;
import com.palmpay.lib.ui.button.PpButton;
import com.swmansion.rnscreens.CustomSearchView;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.ScreenStackHeaderConfig;
import com.swmansion.rnscreens.SearchBarView;
import com.transsnet.palmpay.account.bean.ResetPinVerificationReq;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import com.transsnet.palmpay.account.bean.UserValidIdInfoRsp;
import com.transsnet.palmpay.account.bean.req.ChangeUserInfoReq;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.kotlin.ui.activity.ResetPinVerificationActivity;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification1Fragment;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification2Fragment;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification3Fragment;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification4Fragment;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification5Fragment;
import com.transsnet.palmpay.account.ui.activity.AskEnableTouchIdActivity;
import com.transsnet.palmpay.account.ui.activity.EditUserNameActivity;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.activity.KycUploadPhotoGuideActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3EntryActivity;
import com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity;
import com.transsnet.palmpay.account.ui.activity.ResetPinActivity;
import com.transsnet.palmpay.account.ui.activity.SetNewPinV2Activity;
import com.transsnet.palmpay.account.ui.activity.SetTouchIdActivity;
import com.transsnet.palmpay.account.ui.activity.SetTouchIdV2Activity;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountFaceActivity;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneReferEarnHomeResp;
import com.transsnet.palmpay.main.export.bean.rsp.SlideMenuListRsp;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.ui.adapter.CashBoxTransactionMonthViewHolder$OnMonthClickListener;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.RegexUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p051d9.D;
import p051d9.u0;
import p185ma.t;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4824b;

    public /* synthetic */ l(Object obj, int i7) {
        this.f4823a = i7;
        this.f4824b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TitleEditView titleEditView;
        TitleEditView titleEditView2;
        TitleEditView titleEditView3;
        TitleEditView titleEditView4;
        TitleEditView titleEditView5;
        TitleEditView titleEditView6;
        TitleEditView titleEditView7;
        TitleEditView titleEditView8;
        Q3.h hVar;
        ProductBean productBean;
        boolean zM = false;
        Object[] objArr = 0;
        editText = null;
        String editText = null;
        editText = null;
        String editText2 = null;
        editText = null;
        String editText3 = null;
        editText = null;
        String editText4 = null;
        Object obj = this.f4824b;
        switch (this.f4823a) {
            case 0:
                if (!r0.U0()) {
                    n0.g().k((ClickEvent) G.f("refer_earn_page_element_click", LogConstants.Autotrack.ELEMENT_CONTENT, "Invite to Earn"));
                    n nVar = (n) obj;
                    PalmZoneReferEarnHomeResp palmZoneReferEarnHomeResp = nVar.f4832g;
                    String str = palmZoneReferEarnHomeResp != null ? palmZoneReferEarnHomeResp.id : null;
                    if (str != null && str.length() != 0) {
                        HomePalmZoneTabV2 homePalmZoneTabV2 = nVar.f4829d;
                        E activity = homePalmZoneTabV2 != null ? homePalmZoneTabV2.getActivity() : null;
                        E e10 = activity != null ? activity : null;
                        if (e10 != null) {
                            if (!com.transsnet.palmpay.core.config.d.t()) {
                                ShareDialog shareDialog = new ShareDialog(e10);
                                shareDialog.setShareBusinessType(16);
                                shareDialog.setReferEarnId(str);
                                shareDialog.show();
                            } else {
                                t tVar = new t(e10);
                                tVar.f39628d = str;
                                tVar.s(16);
                            }
                            break;
                        }
                    }
                }
                break;
            case 1:
                int i7 = CodePointView.f24008A;
                CodePointView this$0 = (CodePointView) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Function0 function0 = this$0.f24010b;
                if (function0 != null) {
                    function0.invoke();
                }
                this$0.a();
                break;
            case 2:
                ResetPinVerification1Fragment resetPinVerification1Fragment = (ResetPinVerification1Fragment) obj;
                E activity2 = resetPinVerification1Fragment.getActivity();
                Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.account.kotlin.ui.activity.ResetPinVerificationActivity");
                ResetPinVerificationActivity resetPinVerificationActivity = (ResetPinVerificationActivity) activity2;
                ResetPinVerificationReq resetPinVerificationReq = new ResetPinVerificationReq();
                C0105b c0105b = resetPinVerification1Fragment.f25798i;
                resetPinVerificationReq.firstName = (c0105b != null ? (TitleEditView) c0105b.f666f : null) != null ? c0105b != null ? ((TitleEditView) c0105b.f666f).getEditText() : null : "";
                C0105b c0105b2 = resetPinVerification1Fragment.f25798i;
                resetPinVerificationReq.middleName = (c0105b2 != null ? (TitleEditView) c0105b2.f667g : null) != null ? c0105b2 != null ? ((TitleEditView) c0105b2.f667g).getEditText() : null : "";
                C0105b c0105b3 = resetPinVerification1Fragment.f25798i;
                resetPinVerificationReq.lastName = (c0105b3 != null ? (TitleEditView) c0105b3.f665e : null) != null ? c0105b3 != null ? ((TitleEditView) c0105b3.f665e).getEditText() : null : "";
                resetPinVerificationReq.verification = ResetPinVerifyTypeRsp.VERIFY_TYPE_FULL_NAME;
                resetPinVerificationActivity.p(resetPinVerificationReq);
                break;
            case 3:
                ResetPinVerification2Fragment resetPinVerification2Fragment = (ResetPinVerification2Fragment) obj;
                C0107d c0107d = resetPinVerification2Fragment.f25799i;
                if (RegexUtils.isEmail((c0107d == null || (titleEditView3 = (TitleEditView) c0107d.f681c) == null) ? null : titleEditView3.getEditText())) {
                    E activity3 = resetPinVerification2Fragment.getActivity();
                    Intrinsics.f(activity3, "null cannot be cast to non-null type com.transsnet.palmpay.account.kotlin.ui.activity.ResetPinVerificationActivity");
                    ResetPinVerificationActivity resetPinVerificationActivity2 = (ResetPinVerificationActivity) activity3;
                    ResetPinVerificationReq resetPinVerificationReq2 = new ResetPinVerificationReq();
                    C0107d c0107d2 = resetPinVerification2Fragment.f25799i;
                    if (c0107d2 != null && (titleEditView = (TitleEditView) c0107d2.f681c) != null) {
                        editText4 = titleEditView.getEditText();
                    }
                    resetPinVerificationReq2.verificationValue = String.valueOf(editText4);
                    resetPinVerificationReq2.verification = ResetPinVerifyTypeRsp.VERIFY_TYPE_EMAIL;
                    resetPinVerificationActivity2.p(resetPinVerificationReq2);
                    break;
                } else {
                    C0107d c0107d3 = resetPinVerification2Fragment.f25799i;
                    if (c0107d3 != null && (titleEditView2 = (TitleEditView) c0107d3.f681c) != null) {
                        titleEditView2.setError(resetPinVerification2Fragment.getString(p025ba.k.core_invalid_email_address));
                        break;
                    }
                }
                break;
            case 4:
                ResetPinVerification3Fragment resetPinVerification3Fragment = (ResetPinVerification3Fragment) obj;
                if (!Intrinsics.c(resetPinVerification3Fragment.f25801i, ResetPinVerifyTypeRsp.VERIFY_TYPE_BANKCARD) || resetPinVerification3Fragment.t(true)) {
                    E activity4 = resetPinVerification3Fragment.getActivity();
                    Intrinsics.f(activity4, "null cannot be cast to non-null type com.transsnet.palmpay.account.kotlin.ui.activity.ResetPinVerificationActivity");
                    ResetPinVerificationActivity resetPinVerificationActivity3 = (ResetPinVerificationActivity) activity4;
                    ResetPinVerificationReq resetPinVerificationReq3 = new ResetPinVerificationReq();
                    C0105b c0105b4 = resetPinVerification3Fragment.f25803o;
                    if (c0105b4 != null && (titleEditView4 = (TitleEditView) c0105b4.f667g) != null) {
                        editText3 = titleEditView4.getEditText();
                    }
                    resetPinVerificationReq3.verificationValue = String.valueOf(editText3);
                    resetPinVerificationReq3.verification = resetPinVerification3Fragment.f25801i;
                    resetPinVerificationActivity3.p(resetPinVerificationReq3);
                }
                break;
            case 5:
                ResetPinVerification4Fragment resetPinVerification4Fragment = (ResetPinVerification4Fragment) obj;
                E activity5 = resetPinVerification4Fragment.getActivity();
                Intrinsics.f(activity5, "null cannot be cast to non-null type com.transsnet.palmpay.account.kotlin.ui.activity.ResetPinVerificationActivity");
                ResetPinVerificationActivity resetPinVerificationActivity4 = (ResetPinVerificationActivity) activity5;
                ResetPinVerificationReq resetPinVerificationReq4 = new ResetPinVerificationReq();
                v vVar = resetPinVerification4Fragment.f25804i;
                if (vVar != null && (titleEditView5 = vVar.f4239c) != null) {
                    editText2 = titleEditView5.getEditText();
                }
                resetPinVerificationReq4.verificationValue = String.valueOf(editText2);
                resetPinVerificationReq4.verification = ResetPinVerifyTypeRsp.VERIFY_TYPE_BVN;
                resetPinVerificationActivity4.p(resetPinVerificationReq4);
                break;
            case 6:
                ResetPinVerification5Fragment resetPinVerification5Fragment = (ResetPinVerification5Fragment) obj;
                UserValidIdInfoRsp userValidIdInfoRsp = resetPinVerification5Fragment.f25807j;
                if (userValidIdInfoRsp != null) {
                    String str2 = userValidIdInfoRsp.rule;
                    v vVar2 = resetPinVerification5Fragment.f25808o;
                    if (RegexUtils.isMatch(str2, (vVar2 == null || (titleEditView8 = vVar2.f4239c) == null) ? null : titleEditView8.getEditText())) {
                        E activity6 = resetPinVerification5Fragment.getActivity();
                        Intrinsics.f(activity6, "null cannot be cast to non-null type com.transsnet.palmpay.account.kotlin.ui.activity.ResetPinVerificationActivity");
                        ResetPinVerificationActivity resetPinVerificationActivity5 = (ResetPinVerificationActivity) activity6;
                        ResetPinVerificationReq resetPinVerificationReq5 = new ResetPinVerificationReq();
                        v vVar3 = resetPinVerification5Fragment.f25808o;
                        if (vVar3 != null && (titleEditView6 = vVar3.f4239c) != null) {
                            editText = titleEditView6.getEditText();
                        }
                        resetPinVerificationReq5.verificationValue = String.valueOf(editText);
                        resetPinVerificationReq5.verification = ResetPinVerifyTypeRsp.VERIFY_TYPE_ID;
                        resetPinVerificationActivity5.p(resetPinVerificationReq5);
                        break;
                    } else {
                        v vVar4 = resetPinVerification5Fragment.f25808o;
                        if (vVar4 != null && (titleEditView7 = vVar4.f4239c) != null) {
                            titleEditView7.setError(userValidIdInfoRsp.caseMsg);
                            break;
                        }
                    }
                }
                break;
            case 7:
                SlideMenuListRsp.BusinessMenuData businessMenuData = (SlideMenuListRsp.BusinessMenuData) obj;
                F.f(businessMenuData.buttonJumpUrl, businessMenuData.buttonJumpType, "");
                break;
            case 8:
                Ke.c cVar = (Ke.c) obj;
                cVar.f5432c = true;
                p059e1.a.V(System.currentTimeMillis(), "main_sp_close_security_center");
                View view2 = cVar.f5430a;
                if (view2 != null) {
                    p220oa.h.s(view2, false);
                }
                break;
            case 9:
                int i10 = FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.f21961g;
                int id2 = view.getId();
                M3.e eVar = (M3.e) obj;
                if (id2 == p.fb_model_payment_add_bank_card) {
                    Q3.h hVar2 = eVar.f5757e;
                    if (hVar2 != null) {
                        hVar2.onAddNewBankCardClick();
                    }
                    break;
                } else if (id2 == p.fb_model_payment_add_bank_account) {
                    Q3.h hVar3 = eVar.f5757e;
                    if (hVar3 != null) {
                        hVar3.onAddNewBankAccountClick();
                    }
                    break;
                } else if (id2 == p.fb_model_payment_add_bank_card_and_bank_account && (hVar = eVar.f5757e) != null) {
                    hVar.onAddNewBankCardOrBankAccountClick();
                    break;
                }
                break;
            case 10:
                FlexiBankCashierSelectPayMethodDialog$CallBack flexiBankCashierSelectPayMethodDialog$CallBack = ((M3.g) obj).f5763b;
                if (flexiBankCashierSelectPayMethodDialog$CallBack != null) {
                    flexiBankCashierSelectPayMethodDialog$CallBack.onAddNewBankCardOrBankAccountClick();
                }
                break;
            case 11:
                CustomSearchView customSearchView = (CustomSearchView) obj;
                View.OnClickListener onClickListener = customSearchView.f25249N0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                customSearchView.f25250O0.d();
                break;
            case 12:
                ScreenStackHeaderConfig.a((ScreenStackHeaderConfig) obj);
                break;
            case 13:
                SearchBarView.d((SearchBarView) obj);
                break;
            case 14:
                if (!d0.t()) {
                    r rVar = (r) obj;
                    Bc.E e11 = rVar.f5999g;
                    if (e11 != null) {
                        ((PpButton) e11.f634Q).b(true);
                    }
                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = rVar.f5996d;
                    if (lifecycleCoroutineScopeImpl != null) {
                        p042cg.f fVar = I.f10809a;
                        AbstractC0780y.m(lifecycleCoroutineScopeImpl, p042cg.e.f19009c, null, new q(rVar, null), 2);
                    }
                } else {
                    com.palmpay.lib.apm.launchcounter.util.d.F("/account/add_extra");
                }
                break;
            case 15:
                Screen screen = (Screen) obj;
                if (screen.getSheetClosesOnTouchOutside()) {
                    Fragment fragment = screen.getFragment();
                    Intrinsics.f(fragment, "null cannot be cast to non-null type com.swmansion.rnscreens.ScreenStackFragment");
                    ((ScreenStackFragment) fragment).g();
                }
                break;
            case 16:
                AskEnableTouchIdActivity.a aVar = AskEnableTouchIdActivity.f25828b;
                AskEnableTouchIdActivity askEnableTouchIdActivity = (AskEnableTouchIdActivity) obj;
                Intent intent = new Intent(askEnableTouchIdActivity, (Class<?>) SetTouchIdV2Activity.class);
                Intent intent2 = askEnableTouchIdActivity.getIntent();
                if (intent2 != null) {
                    intent.putExtra("extra_data", intent2.getStringExtra("extra_data"));
                }
                askEnableTouchIdActivity.getF28604i().f(intent, new C0457a(askEnableTouchIdActivity, objArr == true ? 1 : 0));
                break;
            case 17:
                EditUserNameActivity editUserNameActivity = (EditUserNameActivity) obj;
                List list = editUserNameActivity.f25849f;
                if (list == null || list.isEmpty()) {
                    ((u0) editUserNameActivity.f27350a).getRegularRule(true);
                } else {
                    zM = editUserNameActivity.m();
                }
                if (zM) {
                    ChangeUserInfoReq changeUserInfoReq = new ChangeUserInfoReq();
                    TitleEditView titleEditView9 = editUserNameActivity.f25845b;
                    changeUserInfoReq.firstName = titleEditView9 != null ? titleEditView9.getEditText() : "";
                    TitleEditView titleEditView10 = editUserNameActivity.f25846c;
                    changeUserInfoReq.middleName = titleEditView10 != null ? titleEditView10.getEditText() : "";
                    TitleEditView titleEditView11 = editUserNameActivity.f25847d;
                    changeUserInfoReq.lastName = titleEditView11 != null ? titleEditView11.getEditText() : "";
                    ((u0) editUserNameActivity.f27350a).changeName(changeUserInfoReq);
                    break;
                }
                break;
            case 18:
                int i11 = IdentityVerificationActivity.f25861A;
                ((IdentityVerificationActivity) obj).onBackPressed();
                break;
            case 19:
                int i12 = KycUploadPhotoGuideActivity.f25875b;
                ((KycUploadPhotoGuideActivity) obj).finish();
                break;
            case 20:
                int i13 = PalmPayLevelUpTier3EntryActivity.f25913d;
                ((PalmPayLevelUpTier3EntryActivity) obj).finish();
                break;
            case 21:
                int i14 = PinSafeWithPatternActivity.f25946g;
                ((PinSafeWithPatternActivity) obj).n(false);
                break;
            case 22:
                int i15 = ResetPinActivity.f25967o;
                ResetPinActivity resetPinActivity = (ResetPinActivity) obj;
                D d2 = (D) resetPinActivity.f27350a;
                if (d2 != null) {
                    d2.getSecurityFlow(resetPinActivity.f25971e);
                }
                break;
            case 23:
                int i16 = SetNewPinV2Activity.f25976v;
                SetNewPinV2Activity setNewPinV2Activity = (SetNewPinV2Activity) obj;
                KeyboardUtils.hideSoftInput(setNewPinV2Activity);
                Bc.i iVar = setNewPinV2Activity.f25986p;
                setNewPinV2Activity.o(SetNewPinV2Activity.n(iVar != null ? (PinEntryView) iVar.f727e : null));
                break;
            case 24:
                int i17 = SetTouchIdActivity.f26012o;
                SetTouchIdActivity setTouchIdActivity = (SetTouchIdActivity) obj;
                setTouchIdActivity.setResult(0);
                setTouchIdActivity.finish();
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i18 = VerifyAccountFaceActivity.f26070d;
                g0 e0Var = g0.f7080h.getInstance();
                VerifyAccountFaceActivity verifyAccountFaceActivity = (VerifyAccountFaceActivity) obj;
                GetSecurityFlowRsp getSecurityFlowRsp = verifyAccountFaceActivity.f26071a;
                e0Var.f7087f = getSecurityFlowRsp != null ? getSecurityFlowRsp.flowId : null;
                g0.e(e0Var, verifyAccountFaceActivity, getSecurityFlowRsp != null ? getSecurityFlowRsp.scene : 12, verifyAccountFaceActivity, verifyAccountFaceActivity.f26072b, getSecurityFlowRsp != null ? getSecurityFlowRsp.mobile : null, null, 448);
                break;
            case 26:
                Na.b.a((Na.b) obj);
                break;
            case 27:
                Na.d.a((Na.d) obj);
                break;
            case 28:
                Object tag = view.getTag();
                Intrinsics.f(tag, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) tag).intValue();
                List list2 = ((Nc.c) obj).f6310a;
                if (list2 != null) {
                    List list3 = list2.size() >= iIntValue ? list2 : null;
                    if (list3 != null && (productBean = (ProductBean) list3.get(iIntValue)) != null) {
                        if (productBean.getProductStatus() == 7 || productBean.getProductStatus() == 1) {
                            ToastUtils.showLong("The event is over", new Object[0]);
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/manage_money/create_plan_activity");
                            Long productId = productBean.getProductId();
                            postcardBuild.withLong(FirebaseAnalytics.Param.PRODUCT_ID, productId != null ? productId.longValue() : 0L).withLong("duration_day", productBean.getDurationDay()).navigation();
                        }
                        break;
                    }
                }
                break;
            default:
                CashBoxTransactionMonthViewHolder$OnMonthClickListener cashBoxTransactionMonthViewHolder$OnMonthClickListener = ((Nc.f) obj).f6316b;
                if (cashBoxTransactionMonthViewHolder$OnMonthClickListener != null) {
                    cashBoxTransactionMonthViewHolder$OnMonthClickListener.onMonthClick();
                }
                break;
        }
    }
}
