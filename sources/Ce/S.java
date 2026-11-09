package Ce;

import Pa.C0521s;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.perf.util.Constants;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.ui.activity.AddGuardianActivity;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.MemberInfo;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.provider.IOkCardModule;
import com.transsnet.palmpay.core.service.CollectDeviceInfoService;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.custom_view.dialog.SuccessFailDialog;
import com.transsnet.palmpay.main.export.bean.rsp.HomeCouponRewardsItems;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneCouponRsp;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import com.transsnet.palmpay.managemoney.bean.PayoutOptionsChangeEvent;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxAutoSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.SelectPayoutOptionsDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WhyTurnOffSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WithdrawInterceptDialogFragment;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneCouponRewardsDialog;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class S implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1450d;

    public S(IdentityVerificationActivity identityVerificationActivity, IdentityVerificationActivity identityVerificationActivity2, Function1 function1, Function1 function2) {
        this.f1447a = 1;
        this.f1448b = identityVerificationActivity2;
        this.f1449c = function1;
        this.f1450d = function2;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x027a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        Context context;
        IdentityVerificationActivity identityVerificationActivity;
        Object obj2 = this.f1448b;
        Object obj3 = this.f1449c;
        Object obj4 = this.f1450d;
        switch (this.f1447a) {
            case 0:
                com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                HomePalmZoneTabV2 homePalmZoneTabV2 = (HomePalmZoneTabV2) obj2;
                if (it instanceof com.transsnet.palmpay.core.base.o) {
                    homePalmZoneTabV2.showLoadingDialog(true);
                } else if (it instanceof com.transsnet.palmpay.core.base.p) {
                    homePalmZoneTabV2.showLoadingDialog(false);
                    Object obj5 = ((com.transsnet.palmpay.core.base.l) obj4).f27356m;
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it).f27360a;
                    Integer num = (Integer) obj5;
                    HomePalmZoneTabV2 homePalmZoneTabV3 = (HomePalmZoneTabV2) obj3;
                    if (commonBeanResult.isSuccess() && (context = homePalmZoneTabV3.getContext()) != null) {
                        PalmZoneCouponRewardsDialog palmZoneCouponRewardsDialog = new PalmZoneCouponRewardsDialog(context);
                        palmZoneCouponRewardsDialog.show();
                        palmZoneCouponRewardsDialog.updateUi(((PalmZoneCouponRsp) commonBeanResult.data).comboItems);
                        palmZoneCouponRewardsDialog.setOnDismissListener(new T(homePalmZoneTabV3, 0));
                    }
                    Me.r rVar = homePalmZoneTabV3.f35148w;
                    if (rVar != null) {
                        int iIntValue = num != null ? num.intValue() : 0;
                        Me.o oVar = rVar.f6000i;
                        if (oVar != null) {
                            if (commonBeanResult.isSuccess()) {
                                P8.a aVar = oVar.f5989c;
                                if (iIntValue < (aVar != null ? aVar.getItemCount() : 0)) {
                                    P8.a aVar2 = oVar.f5989c;
                                    HomeCouponRewardsItems homeCouponRewardsItems = aVar2 != null ? (HomeCouponRewardsItems) aVar2.getItem(iIntValue) : null;
                                    if (homeCouponRewardsItems != null) {
                                        homeCouponRewardsItems.isLoading = false;
                                        homeCouponRewardsItems.status = "Claimed";
                                        P8.a aVar3 = oVar.f5989c;
                                        if (aVar3 != null) {
                                            aVar3.notifyItemChanged(iIntValue);
                                        }
                                    }
                                }
                            } else {
                                if (!TextUtils.isEmpty(commonBeanResult.getRespMsg())) {
                                    Pa.n0.g().v("new_reward_hub_fail_pop_show");
                                    String respMsg = commonBeanResult.getRespMsg();
                                    Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                                    p220oa.h.z(oVar.f5990d, respMsg, null, null, 57);
                                }
                                oVar.a(iIntValue, false);
                            }
                        }
                    }
                } else if (it instanceof com.transsnet.palmpay.core.base.m) {
                    homePalmZoneTabV2.showLoadingDialog(false);
                } else {
                    if (!(it instanceof com.transsnet.palmpay.core.base.n)) {
                        throw new p355xf.l();
                    }
                    homePalmZoneTabV2.showLoadingDialog(false);
                    ((com.transsnet.palmpay.core.base.n) it).getClass();
                }
                return Unit.f38893a;
            case 1:
                com.transsnet.palmpay.core.base.q it2 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (!(it2 instanceof com.transsnet.palmpay.core.base.o)) {
                    IdentityVerificationActivity identityVerificationActivity2 = (IdentityVerificationActivity) obj2;
                    if (it2 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonBeanResult commonBeanResult2 = (CommonBeanResult) ((com.transsnet.palmpay.core.base.p) it2).f27360a;
                        if (commonBeanResult2.isSuccess()) {
                            identityVerificationActivity2.f25863b = (SignUpRsp) commonBeanResult2.data;
                            C0521s c0521s = C0521s.f7158a;
                            C0521s.b();
                            p059e1.a.W("firebase_sp_appsflyer_campaign", "");
                            String memberId = ((SignUpRsp) commonBeanResult2.data).getMemberId();
                            Pa.n0.g().D(memberId);
                            ViewEvent viewEventAfEvt = new ViewEvent("Signup_Result_Success").afEvt(true);
                            viewEventAfEvt.add("memberId", memberId);
                            Pa.n0.g().q(viewEventAfEvt);
                            L8.a.f(viewEventAfEvt);
                            try {
                                p183m6.m mVar = p183m6.n.f39523a;
                                mVar.instance().e(memberId);
                                mVar.instance().a(null, new String[0]);
                                break;
                            } catch (Exception unused) {
                            }
                            if (((SignUpRsp) commonBeanResult2.data).isNeedAddGuardian()) {
                                identityVerificationActivity = identityVerificationActivity2;
                            } else {
                                BaseApplication.get().setToken(((SignUpRsp) commonBeanResult2.data).getToken());
                                MemberInfo memberInfo = ((SignUpRsp) commonBeanResult2.data).memberInfo;
                                if (memberInfo != null) {
                                    p156ka.a userDataSource = BaseApplication.get().getUserDataSource();
                                    if (userDataSource != null) {
                                        userDataSource.d(memberInfo, false);
                                    }
                                    org.greenrobot.eventbus.c.b().f(new MessageEvent(4));
                                    BaseApplication.get().getUser();
                                } else {
                                    BaseApplication.get().getUserDataSource().a().i(p071ef.b.a()).subscribe(new Ab.D(identityVerificationActivity2, 20));
                                }
                                F6.d.h(identityVerificationActivity2.TAG, 3, "uploadAppList >>>");
                                identityVerificationActivity = identityVerificationActivity2;
                                CollectDeviceInfoService.f27401o.enqueueWork(identityVerificationActivity, true, false, true, false, UUID.randomUUID().toString(), "palmpay", GetCustomerServiceUrlReq.ENTER_TYPE_SIGNUP);
                                IOkCardModule iOkCardModule = (IOkCardModule) ARouter.getInstance().navigation(IOkCardModule.class);
                                if (iOkCardModule != null) {
                                    iOkCardModule.collectDeviceInfo();
                                }
                            }
                            if (((SignUpRsp) commonBeanResult2.data).isNeedAddGuardian()) {
                                BaseApplication.get().setToken(null);
                                AddGuardianActivity.a aVar4 = AddGuardianActivity.f25811i;
                                T data = commonBeanResult2.data;
                                Intrinsics.checkNotNullExpressionValue(data, "data");
                                aVar4.start(identityVerificationActivity, (SignUpRsp) data);
                                identityVerificationActivity.finish();
                            } else if ("/account/enableAutoSave".equals(((SignUpRsp) commonBeanResult2.data).jumpPath)) {
                                identityVerificationActivity.o();
                            } else {
                                SignUpRsp signUpRsp = identityVerificationActivity.f25863b;
                                String str = signUpRsp != null ? signUpRsp.jumpPath : null;
                                C0.U u6 = new C0.U(false, false, F8.d.fragment_identity_verification_step_id, true, false, -1, -1, -1, -1);
                                C0.P p3 = identityVerificationActivity.f25872p;
                                if (p3 != null) {
                                    int i7 = F8.d.fragment_identity_verification_account_activate_success;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("extra_path", str);
                                    bundle.putString("_number", identityVerificationActivity.f25864c);
                                    Unit unit = Unit.f38893a;
                                    p3.h(i7, bundle, u6);
                                }
                            }
                        } else {
                            identityVerificationActivity2.f25863b = null;
                            io.fastkv.n.O(identityVerificationActivity2, 0, Integer.valueOf(p025ba.k.core_opps), null, null, null, null, commonBeanResult2.getRespMsg(), Integer.valueOf(p025ba.k.core_confirm), null, null, null, null, null, null, false, 0, 8388221);
                            ((Function1) obj3).invoke("");
                        }
                    } else if (!(it2 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it2 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        com.transsnet.palmpay.core.base.n nVar = (com.transsnet.palmpay.core.base.n) it2;
                        ToastUtils.showLong(nVar.f27358a, new Object[0]);
                        String str2 = nVar.f27358a;
                        identityVerificationActivity2.f25863b = null;
                        ((Function1) obj4).invoke(str2);
                    }
                }
                return Unit.f38893a;
            case 2:
                com.transsnet.palmpay.core.base.q it3 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!(it3 instanceof com.transsnet.palmpay.core.base.o)) {
                    PpButton ppButton = (PpButton) obj4;
                    if (it3 instanceof com.transsnet.palmpay.core.base.p) {
                        CashBoxAutoSaveDialogFragment cashBoxAutoSaveDialogFragment = (CashBoxAutoSaveDialogFragment) obj2;
                        if (((CommonResult) ((com.transsnet.palmpay.core.base.p) it3).f27360a).isSuccess()) {
                            cashBoxAutoSaveDialogFragment.dismiss();
                            com.transsnet.palmpay.custom_view.dialog.t tVar = new com.transsnet.palmpay.custom_view.dialog.t(cashBoxAutoSaveDialogFragment.requireContext());
                            tVar.b();
                            tVar.c(Jc.f.mm_successfully);
                            tVar.f31303b = "";
                            SuccessFailDialog successFailDialogD = tVar.d(Constants.MAX_URL_LENGTH);
                            successFailDialogD.setCanceledOnTouchOutside(false);
                            successFailDialogD.setCancelable(false);
                        } else {
                            ((ConstraintLayout) obj3).setVisibility(0);
                            com.transsnet.palmpay.custom_view.dialog.t tVar2 = new com.transsnet.palmpay.custom_view.dialog.t(cashBoxAutoSaveDialogFragment.requireContext());
                            tVar2.a();
                            tVar2.c(p025ba.k.core_failed);
                            tVar2.f31303b = "";
                            SuccessFailDialog successFailDialogD2 = tVar2.d(Constants.MAX_URL_LENGTH);
                            successFailDialogD2.setCanceledOnTouchOutside(false);
                            successFailDialogD2.setCancelable(false);
                        }
                    } else if (!(it3 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it3 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it3).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it3).getClass();
                    }
                    ppButton.b(false);
                }
                return Unit.f38893a;
            case 3:
                com.transsnet.palmpay.core.base.q it4 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof com.transsnet.palmpay.core.base.o)) {
                    SelectPayoutOptionsDialogFragment selectPayoutOptionsDialogFragment = (SelectPayoutOptionsDialogFragment) obj2;
                    if (it4 instanceof com.transsnet.palmpay.core.base.p) {
                        CommonResult commonResult = (CommonResult) ((com.transsnet.palmpay.core.base.p) it4).f27360a;
                        if (commonResult.isSuccess()) {
                            SelectPayoutOptionsDialogFragment.a aVar5 = SelectPayoutOptionsDialogFragment.f32319X;
                            ArrayList arrayList = (ArrayList) selectPayoutOptionsDialogFragment.f32321M.getValue();
                            ArrayList<PayoutOption> arrayListZ = arrayList != null ? CollectionsKt.Z(arrayList) : null;
                            PayoutOption payoutOption = selectPayoutOptionsDialogFragment.f32322Q;
                            if (arrayListZ != null) {
                                for (PayoutOption payoutOption2 : arrayListZ) {
                                    payoutOption2.setSelected(payoutOption != null && payoutOption2.getType() == payoutOption.getType());
                                }
                            }
                            selectPayoutOptionsDialogFragment.dismiss();
                            PayoutOption payoutOption3 = selectPayoutOptionsDialogFragment.f32322Q;
                            if (payoutOption3 != null) {
                                org.greenrobot.eventbus.c.b().f(new PayoutOptionsChangeEvent(payoutOption3.getType(), payoutOption3.getName()));
                            }
                            com.transsnet.palmpay.custom_view.dialog.t tVar3 = new com.transsnet.palmpay.custom_view.dialog.t(selectPayoutOptionsDialogFragment.requireContext());
                            tVar3.b();
                            tVar3.c(Jc.f.mm_submitted_succ);
                            tVar3.f31303b = "";
                            SuccessFailDialog successFailDialogD3 = tVar3.d(Constants.MAX_URL_LENGTH);
                            successFailDialogD3.setCanceledOnTouchOutside(false);
                            successFailDialogD3.setCancelable(false);
                        } else {
                            ((ConstraintLayout) obj3).setVisibility(0);
                            SelectPayoutOptionsDialogFragment.a aVar6 = SelectPayoutOptionsDialogFragment.f32319X;
                            Nc.u uVar = (Nc.u) obj4;
                            uVar.f6357a = (ArrayList) selectPayoutOptionsDialogFragment.f32321M.getValue();
                            uVar.notifyDataSetChanged();
                            if (!TextUtils.isEmpty(commonResult.getRespMsg())) {
                                ToastUtils.showLong(commonResult.getRespMsg(), new Object[0]);
                            }
                        }
                        if (selectPayoutOptionsDialogFragment.getActivity() instanceof BaseActivity) {
                            androidx.fragment.app.E activity = selectPayoutOptionsDialogFragment.getActivity();
                            Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                            ((BaseActivity) activity).showLoadingDialog(false);
                        }
                    } else if (!(it4 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it4 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it4).f27358a, new Object[0]);
                        if (selectPayoutOptionsDialogFragment.getActivity() instanceof BaseActivity) {
                            androidx.fragment.app.E activity2 = selectPayoutOptionsDialogFragment.getActivity();
                            Intrinsics.f(activity2, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                            ((BaseActivity) activity2).showLoadingDialog(false);
                        }
                    } else if (selectPayoutOptionsDialogFragment.getActivity() instanceof BaseActivity) {
                        androidx.fragment.app.E activity3 = selectPayoutOptionsDialogFragment.getActivity();
                        Intrinsics.f(activity3, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                        ((BaseActivity) activity3).showLoadingDialog(false);
                    }
                }
                return Unit.f38893a;
            case 4:
                com.transsnet.palmpay.core.base.q it5 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                if (!(it5 instanceof com.transsnet.palmpay.core.base.o)) {
                    PpButton ppButton2 = (PpButton) obj4;
                    if (it5 instanceof com.transsnet.palmpay.core.base.p) {
                        WhyTurnOffSaveDialogFragment whyTurnOffSaveDialogFragment = (WhyTurnOffSaveDialogFragment) obj2;
                        if (((CommonResult) ((com.transsnet.palmpay.core.base.p) it5).f27360a).isSuccess()) {
                            Function0 function0 = whyTurnOffSaveDialogFragment.f32334Y;
                            if (function0 != null) {
                                function0.invoke();
                            }
                            com.transsnet.palmpay.custom_view.dialog.t tVar4 = new com.transsnet.palmpay.custom_view.dialog.t(whyTurnOffSaveDialogFragment.requireContext());
                            tVar4.b();
                            tVar4.f31304c = "Turn Off Successfully";
                            tVar4.f31303b = "";
                            SuccessFailDialog successFailDialogD4 = tVar4.d(Constants.MAX_URL_LENGTH);
                            successFailDialogD4.setCanceledOnTouchOutside(false);
                            successFailDialogD4.setCancelable(false);
                            whyTurnOffSaveDialogFragment.dismiss();
                        } else {
                            ((ConstraintLayout) obj3).setVisibility(0);
                            com.transsnet.palmpay.custom_view.dialog.t tVar5 = new com.transsnet.palmpay.custom_view.dialog.t(whyTurnOffSaveDialogFragment.requireContext());
                            tVar5.a();
                            tVar5.c(p025ba.k.core_failed);
                            tVar5.f31303b = "";
                            SuccessFailDialog successFailDialogD5 = tVar5.d(Constants.MAX_URL_LENGTH);
                            successFailDialogD5.setCanceledOnTouchOutside(false);
                            successFailDialogD5.setCancelable(false);
                        }
                    } else if (!(it5 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it5 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it5).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it5).getClass();
                    }
                    ppButton2.b(false);
                }
                return Unit.f38893a;
            case 5:
                com.transsnet.palmpay.core.base.q it6 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                if (!(it6 instanceof com.transsnet.palmpay.core.base.o)) {
                    PpButton ppButton3 = (PpButton) obj4;
                    if (it6 instanceof com.transsnet.palmpay.core.base.p) {
                        WithdrawInterceptDialogFragment withdrawInterceptDialogFragment = (WithdrawInterceptDialogFragment) obj2;
                        if (((CommonResult) ((com.transsnet.palmpay.core.base.p) it6).f27360a).isSuccess()) {
                            withdrawInterceptDialogFragment.dismiss();
                            com.transsnet.palmpay.custom_view.dialog.t tVar6 = new com.transsnet.palmpay.custom_view.dialog.t(withdrawInterceptDialogFragment.requireContext());
                            tVar6.b();
                            tVar6.c(Jc.f.mm_successfully);
                            tVar6.f31303b = "";
                            SuccessFailDialog successFailDialogD6 = tVar6.d(Constants.MAX_URL_LENGTH);
                            successFailDialogD6.setCanceledOnTouchOutside(false);
                            successFailDialogD6.setCancelable(false);
                        } else {
                            ((ConstraintLayout) obj3).setVisibility(0);
                            com.transsnet.palmpay.custom_view.dialog.t tVar7 = new com.transsnet.palmpay.custom_view.dialog.t(withdrawInterceptDialogFragment.requireContext());
                            tVar7.a();
                            tVar7.c(p025ba.k.core_failed);
                            tVar7.f31303b = "";
                            SuccessFailDialog successFailDialogD7 = tVar7.d(Constants.MAX_URL_LENGTH);
                            successFailDialogD7.setCanceledOnTouchOutside(false);
                            successFailDialogD7.setCancelable(false);
                        }
                    } else if (!(it6 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it6 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it6).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it6).getClass();
                    }
                    ppButton3.b(false);
                }
                return Unit.f38893a;
            default:
                com.transsnet.palmpay.core.base.q it7 = (com.transsnet.palmpay.core.base.q) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                if (!(it7 instanceof com.transsnet.palmpay.core.base.o)) {
                    PpButton ppButton4 = (PpButton) obj4;
                    if (it7 instanceof com.transsnet.palmpay.core.base.p) {
                        WithdrawInterceptDialogFragment withdrawInterceptDialogFragment2 = (WithdrawInterceptDialogFragment) obj3;
                        if (((CommonResult) ((com.transsnet.palmpay.core.base.p) it7).f27360a).isSuccess()) {
                            ((PpButton) obj2).setVisibility(8);
                            CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog = CommonTipsDialogFragment.f31249X.createDialog(withdrawInterceptDialogFragment2.getString(p025ba.k.core_reminder), "Setup successful! CashBox will appear first at checkout when you make payments", withdrawInterceptDialogFragment2.getString(p025ba.k.core_confirm), Boolean.TRUE);
                            androidx.fragment.app.Z childFragmentManager = withdrawInterceptDialogFragment2.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                            commonTipsDialogFragmentCreateDialog.show(childFragmentManager, "showCashFirstDialog");
                        } else {
                            com.transsnet.palmpay.custom_view.dialog.t tVar8 = new com.transsnet.palmpay.custom_view.dialog.t(withdrawInterceptDialogFragment2.requireContext());
                            tVar8.a();
                            tVar8.c(p025ba.k.core_failed);
                            tVar8.f31303b = "";
                            SuccessFailDialog successFailDialogD8 = tVar8.d(Constants.MAX_URL_LENGTH);
                            successFailDialogD8.setCanceledOnTouchOutside(false);
                            successFailDialogD8.setCancelable(false);
                        }
                    } else if (!(it7 instanceof com.transsnet.palmpay.core.base.m)) {
                        if (!(it7 instanceof com.transsnet.palmpay.core.base.n)) {
                            throw new p355xf.l();
                        }
                        ToastUtils.showLong(((com.transsnet.palmpay.core.base.n) it7).f27358a, new Object[0]);
                        ((com.transsnet.palmpay.core.base.n) it7).getClass();
                    }
                    ppButton4.b(false);
                }
                return Unit.f38893a;
        }
    }

    public S(HomePalmZoneTabV2 homePalmZoneTabV2, com.transsnet.palmpay.core.base.l lVar, HomePalmZoneTabV2 homePalmZoneTabV3) {
        this.f1447a = 0;
        this.f1448b = homePalmZoneTabV2;
        this.f1450d = lVar;
        this.f1449c = homePalmZoneTabV3;
    }

    public /* synthetic */ S(Object obj, int i7, Object obj2, Object obj3) {
        this.f1447a = i7;
        this.f1448b = obj;
        this.f1449c = obj2;
        this.f1450d = obj3;
    }
}
