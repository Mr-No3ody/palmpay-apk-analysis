package R8;

import Bc.C0107d;
import Bc.C0108e;
import C0.G;
import N8.C0463g;
import N8.D;
import N8.q0;
import Pa.b0;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Ua.E0;
import Uc.C;
import Uc.C0659h;
import Wf.AbstractC0780y;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.EditText;
import androidx.activity.I;
import androidx.fragment.app.E;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPageTitleAreaInPayVerifyPage;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentPromotionItem;
import com.google.api.Service;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.account.bean.req.SubmitGuardianReq;
import com.transsnet.palmpay.account.ui.activity.AuthenticationActivity;
import com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthTouchIdV2Fragment;
import com.transsnet.palmpay.account.ui.fragment.auth.BaseVerifyFragment;
import com.transsnet.palmpay.account.ui.fragment.changemobile.ChangeMobileStep2Fragment;
import com.transsnet.palmpay.account.ui.fragment.changemobile.ChangeMobileStep3Fragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianResultFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveAuthorizationConfirmFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveBirthCertificateFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveReviewPendingFragment;
import com.transsnet.palmpay.account.ui.viewmodel.AddGuardianViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.rsp.OkCardPreCreditInfoRsp;
import com.transsnet.palmpay.core.ui.dialog.PaymentFeeDetailDialog;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.viewmodel.MobileNumberInputV4View;
import com.transsnet.palmpay.core.viewmodel.ModelApplyOkCard;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelDiscountItem;
import com.transsnet.palmpay.core.viewmodel.ModelEnterPhoneNumber1;
import com.transsnet.palmpay.core.viewmodel.ModelFreeFeeItem;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.core.viewmodel.ModelUsePointsWithSwitch;
import com.transsnet.palmpay.core.viewmodel.ReportTransactionItem;
import com.transsnet.palmpay.core.viewmodel.TimeRemindViewHandler$CallBack1;
import com.transsnet.palmpay.custom_view.dialog.TipsDialog;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryAppointmentDetailResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingNotesPage;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.AboutDialog;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.StatusDialog;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlin.text.y;
import p051d9.C1612i;
import p097g9.C1703a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7940b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f7939a = i7;
        this.f7940b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String mobileNumber;
        I onBackPressedDispatcher;
        I onBackPressedDispatcher2;
        int i7;
        Object obj = this.f7940b;
        switch (this.f7939a) {
            case 0:
                AuthTouchIdV2Fragment.a aVar = AuthTouchIdV2Fragment.f26106A;
                AuthenticationActivity authenticationActivityT = ((AuthTouchIdV2Fragment) obj).t();
                if (authenticationActivityT != null) {
                    authenticationActivityT.m(null, null, false);
                }
                break;
            case 1:
                BaseVerifyFragment baseVerifyFragment = (BaseVerifyFragment) obj;
                if (baseVerifyFragment.getActivity() instanceof PinSafeWithPatternActivity) {
                    E activity = baseVerifyFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PinSafeWithPatternActivity");
                    PinSafeWithPatternActivity pinSafeWithPatternActivity = (PinSafeWithPatternActivity) activity;
                    pinSafeWithPatternActivity.showLoadingDialog(true);
                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(pinSafeWithPatternActivity);
                    p042cg.f fVar = Wf.I.f10809a;
                    AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new D(pinSafeWithPatternActivity, null), 2);
                }
                break;
            case 2:
                S1.c this$0 = (S1.c) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                R1.a aVar2 = this$0.f8645d;
                if (aVar2 == R1.a.f7909c) {
                    this$0.i();
                } else if (aVar2 == R1.a.f7907a) {
                    this$0.i();
                }
                break;
            case 3:
                int i10 = FlexiBankModelPageTitleAreaInPayVerifyPage.f22044p;
                if (view.getId() == com.flexibank.sdk.p.fb_cmpta_back_iv) {
                    FlexiBankModelPageTitleAreaInPayVerifyPage flexiBankModelPageTitleAreaInPayVerifyPage = (FlexiBankModelPageTitleAreaInPayVerifyPage) obj;
                    if (flexiBankModelPageTitleAreaInPayVerifyPage.getMContext() instanceof FlexiBankPayVerificationActivity) {
                        Context mContext = flexiBankModelPageTitleAreaInPayVerifyPage.getMContext();
                        Intrinsics.f(mContext, "null cannot be cast to non-null type com.flexibank.sdk.cashier.ui.activity.FlexiBankPayVerificationActivity");
                        ((FlexiBankPayVerificationActivity) mContext).g();
                    } else if (flexiBankModelPageTitleAreaInPayVerifyPage.getMContext() instanceof Activity) {
                        Context mContext2 = flexiBankModelPageTitleAreaInPayVerifyPage.getMContext();
                        Intrinsics.f(mContext2, "null cannot be cast to non-null type android.app.Activity");
                        ((Activity) mContext2).finish();
                    }
                }
                break;
            case 4:
                KProperty[] kPropertyArr = FlexiBankModelPaymentPromotionItem.f22053e;
                ((FlexiBankModelPaymentPromotionItem.OnPromotionItemListener) obj).onPromotionItemClick();
                break;
            case 5:
                ChangeMobileStep2Fragment.a aVar3 = ChangeMobileStep2Fragment.f26124o;
                ChangeMobileStep2Fragment changeMobileStep2Fragment = (ChangeMobileStep2Fragment) obj;
                C0107d c0107d = changeMobileStep2Fragment.f26125j;
                String strL0 = r0.L0((c0107d == null || (mobileNumber = ((PpFormVertical) c0107d.f681c).getMobileNumber()) == null) ? "" : mobileNumber);
                if (TextUtils.isEmpty(strL0)) {
                    String string = changeMobileStep2Fragment.getString(p025ba.k.core_msg_sth_is_empty, changeMobileStep2Fragment.getString(F8.h.ac_mobile_number));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    changeMobileStep2Fragment.u(string);
                } else if (y.h(strL0, r0.w0(BaseApplication.get().getUser().getPhoneNumber()), true)) {
                    String string2 = changeMobileStep2Fragment.getString(F8.h.ac_msg_same_number);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    changeMobileStep2Fragment.u(string2);
                } else {
                    String strV0 = r0.v0(strL0);
                    Intrinsics.checkNotNullExpressionValue(strV0, "getPhoneNumberWithCountryCode(...)");
                    ((C1612i) changeMobileStep2Fragment.f27328i).checkPhoneIsReg(strV0);
                }
                break;
            case 6:
                ChangeMobileStep3Fragment.a aVar4 = ChangeMobileStep3Fragment.f26126w;
                ((ChangeMobileStep3Fragment) obj).w();
                break;
            case 7:
                i0.H(null);
                E activity2 = ((AddGuardianResultFragment) obj).getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                break;
            case 8:
                E activity3 = ((BaseAddGuardianFragment) obj).getActivity();
                if (activity3 != null && (onBackPressedDispatcher = activity3.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
            case 9:
                if (!r0.U0()) {
                    GuardianApproveAuthorizationConfirmFragment guardianApproveAuthorizationConfirmFragment = (GuardianApproveAuthorizationConfirmFragment) obj;
                    C0108e c0108e = guardianApproveAuthorizationConfirmFragment.f26146p;
                    if (c0108e == null || !((IconicsCheckBox) c0108e.f690g).isChecked()) {
                        p220oa.h.y(guardianApproveAuthorizationConfirmFragment, guardianApproveAuthorizationConfirmFragment.getString(F8.h.ac_guardian_please_agree_terms));
                    } else {
                        n0.g().l("Btn_Minor_InfoConfirm_Continue_Click");
                        SubmitGuardianReq submitGuardianReq = new SubmitGuardianReq();
                        submitGuardianReq.guardianPhone = G.A();
                        AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) guardianApproveAuthorizationConfirmFragment.f27333i;
                        if (addGuardianViewModel != null) {
                            p140j8.f.s(addGuardianViewModel, new C1703a(submitGuardianReq, null), addGuardianViewModel.f26411j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                    }
                    break;
                }
                break;
            case 10:
                ((M3.f) obj).invoke();
                break;
            case 11:
                GuardianApproveBirthCertificateFragment guardianApproveBirthCertificateFragment = (GuardianApproveBirthCertificateFragment) obj;
                guardianApproveBirthCertificateFragment.f26141j = true;
                E activity4 = guardianApproveBirthCertificateFragment.getActivity();
                if (activity4 != null && (onBackPressedDispatcher2 = activity4.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher2.d();
                    break;
                }
                break;
            case 12:
                i0.H(null);
                E activity5 = ((GuardianApproveReviewPendingFragment) obj).getActivity();
                if (activity5 != null) {
                    activity5.finish();
                }
                break;
            case 13:
                View.OnClickListener onClickListener = ((MobileNumberInputV4View) obj).f28237w;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                break;
            case 14:
                ModelApplyOkCard modelApplyOkCard = (ModelApplyOkCard) obj;
                OkCardPreCreditInfoRsp okCardPreCreditInfoRsp = modelApplyOkCard.f28244f;
                if (okCardPreCreditInfoRsp == null) {
                    q0.u("/credit_score/oc_main_activity");
                } else {
                    if (okCardPreCreditInfoRsp.okCardWhiteType == 2) {
                        ARouter.getInstance().build("/credit_score/oc_apply_lite_activity").withLong("extra_data_1", okCardPreCreditInfoRsp.okCardPreCreditAmount).withLong("extra_data_2", okCardPreCreditInfoRsp.okCardPreCreditDiscountAmount).navigation();
                    } else {
                        q0.u("/credit_score/oc_main_activity");
                    }
                    p220oa.h.s(modelApplyOkCard, false);
                    modelApplyOkCard.f28245g = true;
                }
                break;
            case 15:
                int i11 = ModelAvailableCouponItem.f28246o;
                if (!r0.U0()) {
                    ModelAvailableCouponItem modelAvailableCouponItem = (ModelAvailableCouponItem) obj;
                    ArrayList arrayList = modelAvailableCouponItem.f28252f;
                    if (arrayList == null || arrayList.isEmpty()) {
                        modelAvailableCouponItem.d(new b0(10));
                    } else {
                        modelAvailableCouponItem.f();
                    }
                    n0.g().k(new ClickEvent("PPay_Biller_Btn_Coupon").add("element_name", modelAvailableCouponItem.f28250d));
                    break;
                }
                break;
            case 16:
                ModelCouponItem modelCouponItem = (ModelCouponItem) obj;
                if (!TextUtils.isEmpty(modelCouponItem.f28303d)) {
                    Context context = modelCouponItem.f31419a;
                    String string3 = modelCouponItem.f28303d.toString();
                    TipsDialog tipsDialog = new TipsDialog(context, t.cv_tips_dialog);
                    tipsDialog.setMessage(string3);
                    tipsDialog.setButtonText(null);
                    tipsDialog.setMessageGravity(17);
                    tipsDialog.show();
                    break;
                }
                break;
            case 17:
                int i12 = ModelDiscountItem.f28335j;
                ModelDiscountItem modelDiscountItem = (ModelDiscountItem) obj;
                String string4 = modelDiscountItem.f31417a.getString(p025ba.k.core_amount_used_tips);
                TipsDialog tipsDialog2 = new TipsDialog(modelDiscountItem.f31417a, t.cv_tips_dialog);
                tipsDialog2.setMessage(string4);
                tipsDialog2.setButtonText(null);
                tipsDialog2.setMessageGravity(17);
                tipsDialog2.show();
                break;
            case 18:
                ((ModelEnterPhoneNumber1) obj).f28343c.setText("");
                break;
            case 19:
                ModelFreeFeeItem modelFreeFeeItem = (ModelFreeFeeItem) obj;
                if (!TextUtils.isEmpty(modelFreeFeeItem.f28354d)) {
                    Context context2 = modelFreeFeeItem.f31419a;
                    String string5 = modelFreeFeeItem.f28354d.toString();
                    TipsDialog tipsDialog3 = new TipsDialog(context2, t.cv_tips_dialog);
                    tipsDialog3.setMessage(string5);
                    tipsDialog3.setButtonText(null);
                    tipsDialog3.setMessageGravity(17);
                    tipsDialog3.show();
                    break;
                }
                break;
            case 20:
                ModelItemFee modelItemFee = (ModelItemFee) obj;
                if (modelItemFee.f28360A != null) {
                    PaymentFeeDetailDialog paymentFeeDetailDialog = new PaymentFeeDetailDialog(modelItemFee.f31419a);
                    paymentFeeDetailDialog.show();
                    paymentFeeDetailDialog.update(modelItemFee.f28360A);
                    break;
                } else if (!TextUtils.isEmpty(modelItemFee.f28368j)) {
                    Context context3 = modelItemFee.f31419a;
                    String string6 = modelItemFee.f28368j.toString();
                    int i13 = modelItemFee.f28372w;
                    TipsDialog tipsDialog4 = new TipsDialog(context3, t.cv_tips_dialog);
                    tipsDialog4.setMessage(string6);
                    tipsDialog4.setButtonText(null);
                    tipsDialog4.setMessageGravity(i13);
                    tipsDialog4.show();
                    break;
                }
                break;
            case 21:
                int i14 = ModelUsePointsWithSwitch.t;
                StringBuilder sb2 = new StringBuilder();
                ModelUsePointsWithSwitch modelUsePointsWithSwitch = (ModelUsePointsWithSwitch) obj;
                sb2.append(modelUsePointsWithSwitch.f31417a.getString(p025ba.k.core_msg_points_exchange_rate, String.valueOf(modelUsePointsWithSwitch.f28432p), BaseApplication.getCurrencySymbol()));
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                sb2.append(modelUsePointsWithSwitch.f31417a.getString(p025ba.k.core_amount_used_tips));
                String string7 = sb2.toString();
                TipsDialog tipsDialog5 = new TipsDialog(modelUsePointsWithSwitch.f31417a, t.cv_tips_dialog);
                tipsDialog5.setMessage(string7);
                tipsDialog5.setButtonText(null);
                tipsDialog5.setMessageGravity(17);
                tipsDialog5.show();
                break;
            case 22:
                com.transsnet.palmpay.core.viewmodel.c cVar = (com.transsnet.palmpay.core.viewmodel.c) obj;
                EditText editText = cVar.f28579d;
                if (editText != null) {
                    editText.clearFocus();
                }
                cVar.d();
                break;
            case 23:
                ((ReportTransactionItem) obj).f28573f.onClick(view);
                break;
            case 24:
                E0 e10 = (E0) obj;
                if (view.getId() == p025ba.e.cltr_remind_period_tv) {
                    List list = e10.f9328r;
                    List<String> list2 = list;
                    ArrayList arrayList2 = new ArrayList(r.l(list2, 10));
                    for (String str : list2) {
                        arrayList2.add(Intrinsics.c(str, e10.f9321k) ? "Every Week" : Intrinsics.c(str, e10.f9322l) ? "Every Day" : "Every Month");
                    }
                    e10.h(p025ba.k.core_reminder_period, arrayList2, list.indexOf(e10.f9325o), new C0463g(e10, 13));
                } else if (view.getId() == p025ba.e.cltr_remind_time_tv) {
                    String str2 = e10.f9325o;
                    List listI = e10.i(str2);
                    int i15 = Intrinsics.c(str2, e10.f9322l) ? p025ba.k.core_time : p025ba.k.core_day;
                    Iterator it = listI.iterator();
                    int i16 = 0;
                    while (it.hasNext()) {
                        i7 = 1;
                        if (y.h((String) it.next(), e10.f9326p, true)) {
                            e10.h(i15, listI, i16, new D6.a(listI, i7, e10, str2));
                        } else {
                            i16++;
                        }
                        break;
                    }
                    i7 = 1;
                    i16 = -1;
                    e10.h(i15, listI, i16, new D6.a(listI, i7, e10, str2));
                } else if (view.getId() == p025ba.e.clt_airtime_check_iv) {
                    e10.e(0);
                    TimeRemindViewHandler$CallBack1 timeRemindViewHandler$CallBack1 = e10.f9330u;
                    if (timeRemindViewHandler$CallBack1 != null) {
                        timeRemindViewHandler$CallBack1.onSelectBillType(0);
                    }
                } else if (view.getId() == p025ba.e.clt_bundle_check_iv) {
                    e10.e(1);
                    TimeRemindViewHandler$CallBack1 timeRemindViewHandler$CallBack2 = e10.f9330u;
                    if (timeRemindViewHandler$CallBack2 != null) {
                        timeRemindViewHandler$CallBack2.onSelectBillType(1);
                    }
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                C0659h c0659h = (C0659h) obj;
                c0659h.getClass();
                BookingDetailPage bookingDetailPage = c0659h.f9648a;
                Intrinsics.checkNotNullParameter(bookingDetailPage, "<this>");
                StatusDialog statusDialog = new StatusDialog(bookingDetailPage);
                statusDialog.show();
                int i17 = BookingDetailPage.f32801H;
                int iQ = bookingDetailPage.q().b().q();
                if (iQ == 1) {
                    ArrayList arrayList3 = new ArrayList();
                    Wc.p pVar = new Wc.p();
                    pVar.f10699a = "Booking Submitted";
                    String str3 = new SimpleDateFormat("MMM d, yyyy, HH:mm").format(new Date(bookingDetailPage.q().b().i()));
                    pVar.f10700b = str3 == null ? "" : str3;
                    pVar.f10701c = true;
                    Wc.p pVarD = q0.d(arrayList3, pVar);
                    pVarD.f10699a = "Awaiting Confirmation";
                    pVarD.f10700b = "Booking awaiting Agent's confirmation";
                    pVarD.f10701c = true;
                    Wc.p pVarD2 = q0.d(arrayList3, pVarD);
                    pVarD2.f10699a = "Awaiting Withdrawal";
                    pVarD2.f10700b = "Visit Agent location at the appointed time and provide the booking code to confirm your appointment.";
                    pVarD2.f10701c = false;
                    Wc.p pVarD3 = q0.d(arrayList3, pVarD2);
                    pVarD3.f10699a = "Awaiting Payment";
                    pVarD3.f10700b = "Transfer money to Agent and withdraw your notes";
                    pVarD3.f10701c = false;
                    Wc.p pVarD4 = q0.d(arrayList3, pVarD3);
                    pVarD4.f10699a = "Completed";
                    pVarD4.f10700b = "The transaction is completed, please confirm your notes";
                    pVarD4.f10701c = false;
                    arrayList3.add(pVarD4);
                    statusDialog.setData(arrayList3);
                    break;
                } else if (iQ == 2) {
                    if (bookingDetailPage.q().b().t()) {
                        ArrayList arrayList4 = new ArrayList();
                        Wc.p pVar2 = new Wc.p();
                        pVar2.f10699a = "Booked Successfully";
                        pVar2.f10700b = "";
                        pVar2.f10701c = true;
                        Wc.p pVarD5 = q0.d(arrayList4, pVar2);
                        pVarD5.f10699a = "Awaiting Withdrawal";
                        pVarD5.f10700b = "Appointment has been extended by 4 hours. Please go as soon as possible";
                        pVarD5.f10701c = true;
                        pVarD5.f10702d = true;
                        Wc.p pVarD6 = q0.d(arrayList4, pVarD5);
                        pVarD6.f10699a = "Awaiting Payment";
                        pVarD6.f10700b = "Transfer money to Agent and withdraw your notes";
                        pVarD6.f10701c = false;
                        Wc.p pVarD7 = q0.d(arrayList4, pVarD6);
                        pVarD7.f10699a = "Completed";
                        pVarD7.f10700b = "The transaction is completed, please confirm your notes";
                        pVarD7.f10701c = false;
                        arrayList4.add(pVarD7);
                        statusDialog.setData(arrayList4);
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        Wc.p pVar3 = new Wc.p();
                        pVar3.f10699a = "Booked Successfully";
                        pVar3.f10700b = "";
                        pVar3.f10701c = true;
                        Wc.p pVarD8 = q0.d(arrayList5, pVar3);
                        pVarD8.f10699a = "Awaiting Withdrawal";
                        pVarD8.f10700b = "Please visit the Agent location at the appointment time with your Booking Code to pick up your notes.";
                        pVarD8.f10701c = true;
                        Wc.p pVarD9 = q0.d(arrayList5, pVarD8);
                        pVarD9.f10699a = "Awaiting Payment";
                        pVarD9.f10700b = "Transfer money to Agent and withdraw your notes.";
                        pVarD9.f10701c = false;
                        Wc.p pVarD10 = q0.d(arrayList5, pVarD9);
                        pVarD10.f10699a = "Completed";
                        pVarD10.f10700b = "The transaction is completed, please confirm your notes";
                        pVarD10.f10701c = false;
                        arrayList5.add(pVarD10);
                        statusDialog.setData(arrayList5);
                    }
                    break;
                } else if (iQ == 3) {
                    ArrayList arrayList6 = new ArrayList();
                    Wc.p pVar4 = new Wc.p();
                    pVar4.f10699a = "Booking Successful";
                    pVar4.f10700b = "";
                    pVar4.f10701c = true;
                    Wc.p pVarD11 = q0.d(arrayList6, pVar4);
                    pVarD11.f10699a = "Booking Code Checked";
                    pVarD11.f10700b = "";
                    pVarD11.f10701c = true;
                    Wc.p pVarD12 = q0.d(arrayList6, pVarD11);
                    pVarD12.f10699a = "Awaiting Payment";
                    pVarD12.f10700b = "Transfer money to Agent and withdraw your notes";
                    pVarD12.f10701c = true;
                    Wc.p pVarD13 = q0.d(arrayList6, pVarD12);
                    pVarD13.f10699a = "Completed";
                    pVarD13.f10700b = "The transaction is completed, please confirm your notes";
                    pVarD13.f10701c = false;
                    arrayList6.add(pVarD13);
                    statusDialog.setData(arrayList6);
                    break;
                } else if (iQ == 4) {
                    ArrayList arrayList7 = new ArrayList();
                    Wc.p pVar5 = new Wc.p();
                    pVar5.f10699a = "Booking Successful";
                    pVar5.f10700b = "";
                    pVar5.f10701c = true;
                    Wc.p pVarD14 = q0.d(arrayList7, pVar5);
                    pVarD14.f10699a = "Booking Code Checked";
                    pVarD14.f10700b = "";
                    pVarD14.f10701c = true;
                    Wc.p pVarD15 = q0.d(arrayList7, pVarD14);
                    pVarD15.f10699a = "Transfer Successful";
                    pVarD15.f10700b = "";
                    pVarD15.f10701c = true;
                    Wc.p pVarD16 = q0.d(arrayList7, pVarD15);
                    pVarD16.f10699a = "Completed";
                    pVarD16.f10700b = "The transaction is completed, please confirm your notes";
                    pVarD16.f10701c = true;
                    arrayList7.add(pVarD16);
                    statusDialog.setData(arrayList7);
                    break;
                } else if (iQ == 5) {
                    QueryAppointmentDetailResp.DataBean dataBeanC = bookingDetailPage.q().c();
                    Intrinsics.e(dataBeanC);
                    int i18 = dataBeanC.orderStatus;
                    if (i18 == 2 || i18 == 3) {
                        ArrayList arrayList8 = new ArrayList();
                        Wc.p pVar6 = new Wc.p();
                        pVar6.f10699a = "Booking Submitted";
                        pVar6.f10700b = "";
                        pVar6.f10701c = true;
                        Wc.p pVarD17 = q0.d(arrayList8, pVar6);
                        pVarD17.f10699a = "Cancelled";
                        pVarD17.f10700b = "";
                        pVarD17.f10701c = true;
                        arrayList8.add(pVarD17);
                        statusDialog.setData(arrayList8);
                    } else if (i18 == 5 || i18 == 6 || i18 == 7 || i18 == 8) {
                        ArrayList arrayList9 = new ArrayList();
                        Wc.p pVar7 = new Wc.p();
                        pVar7.f10699a = "Booked Successfully";
                        pVar7.f10700b = "";
                        pVar7.f10701c = true;
                        Wc.p pVarD18 = q0.d(arrayList9, pVar7);
                        pVarD18.f10699a = "Cancelled";
                        pVarD18.f10700b = "";
                        pVarD18.f10701c = true;
                        arrayList9.add(pVarD18);
                        statusDialog.setData(arrayList9);
                    } else if (i18 != 10) {
                        ArrayList arrayList10 = new ArrayList();
                        Wc.p pVar8 = new Wc.p();
                        pVar8.f10699a = "Booking Submitted";
                        pVar8.f10700b = "";
                        pVar8.f10701c = true;
                        Wc.p pVarD19 = q0.d(arrayList10, pVar8);
                        pVarD19.f10699a = "Cancelled";
                        pVarD19.f10700b = "";
                        pVarD19.f10701c = true;
                        arrayList10.add(pVarD19);
                        statusDialog.setData(arrayList10);
                    } else {
                        ArrayList arrayList11 = new ArrayList();
                        Wc.p pVar9 = new Wc.p();
                        pVar9.f10699a = "Booked Successfully";
                        pVar9.f10700b = "";
                        pVar9.f10701c = true;
                        Wc.p pVarD20 = q0.d(arrayList11, pVar9);
                        pVarD20.f10699a = "Booking Code Checked";
                        pVarD20.f10700b = "";
                        pVarD20.f10701c = true;
                        Wc.p pVarD21 = q0.d(arrayList11, pVarD20);
                        pVarD21.f10699a = "Cancelled";
                        pVarD21.f10700b = "";
                        pVarD21.f10701c = true;
                        arrayList11.add(pVarD21);
                        statusDialog.setData(arrayList11);
                    }
                    break;
                }
                break;
            case 26:
                BookingNotesPage bookingNotesPage = ((C) obj).f9534a;
                Intrinsics.checkNotNullParameter(bookingNotesPage, "<this>");
                AboutDialog aboutDialog = new AboutDialog(bookingNotesPage);
                aboutDialog.show();
                int iE = StringsKt.E("For the Agent to reserve notes for you, you will pay a booking deposit. This deposit will be held by PalmPay and will be refunded to your Balance if you cancel the booking before the appointment time or if the Agent declines the booking.\n\nGuidelines\n1、When you visit the Agent's location to withdraw cash, the booking deposit will be taken from the withdrawal amount.\n\n2、If you cancel the booking before the appointment time, the booking deposit will be refunded to your Balance.\n\n3、Your booking deposit will not be refunded when your appointment is overdue and cancelled.\n\n4、If the Agent cancels the appointment, the booking deposit will be refunded to your Balance.\n\n5、Your withdrawal amount is subject to your account KYC level. If your daily withdrawal limit has been reached at the time of withdrawal, you will not be able to withdraw and the N100 booking deposit will be forfeited.", "Guidelines", 0, false, 6);
                int i19 = 10 + iE;
                if (iE >= 0) {
                    SpannableString spannableString = new SpannableString("For the Agent to reserve notes for you, you will pay a booking deposit. This deposit will be held by PalmPay and will be refunded to your Balance if you cancel the booking before the appointment time or if the Agent declines the booking.\n\nGuidelines\n1、When you visit the Agent's location to withdraw cash, the booking deposit will be taken from the withdrawal amount.\n\n2、If you cancel the booking before the appointment time, the booking deposit will be refunded to your Balance.\n\n3、Your booking deposit will not be refunded when your appointment is overdue and cancelled.\n\n4、If the Agent cancels the appointment, the booking deposit will be refunded to your Balance.\n\n5、Your withdrawal amount is subject to your account KYC level. If your daily withdrawal limit has been reached at the time of withdrawal, you will not be able to withdraw and the N100 booking deposit will be forfeited.");
                    spannableString.setSpan(new StyleSpan(1), iE, i19, 33);
                    spannableString.setSpan(new AbsoluteSizeSpan(14, true), iE, i19, 33);
                    aboutDialog.setContent(spannableString);
                } else {
                    aboutDialog.setContent("For the Agent to reserve notes for you, you will pay a booking deposit. This deposit will be held by PalmPay and will be refunded to your Balance if you cancel the booking before the appointment time or if the Agent declines the booking.\n\nGuidelines\n1、When you visit the Agent's location to withdraw cash, the booking deposit will be taken from the withdrawal amount.\n\n2、If you cancel the booking before the appointment time, the booking deposit will be refunded to your Balance.\n\n3、Your booking deposit will not be refunded when your appointment is overdue and cancelled.\n\n4、If the Agent cancels the appointment, the booking deposit will be refunded to your Balance.\n\n5、Your withdrawal amount is subject to your account KYC level. If your daily withdrawal limit has been reached at the time of withdrawal, you will not be able to withdraw and the N100 booking deposit will be forfeited.");
                }
                aboutDialog.setBtnText(bookingNotesPage.getString(p025ba.k.core_next));
                break;
            case 27:
                if (ActivityUtils.isActivityExistsInStack((Class<?>) NearbyAgent2Page.class)) {
                    ActivityUtils.finishToActivity((Class<?>) NearbyAgent2Page.class, false);
                } else {
                    ((BookingNotesPage) obj).finish();
                }
                break;
            case 28:
                String str4 = ((ShopHomeByMemberIdResp.NearbyShopListBean) obj).networkMobile;
                if (str4 != null) {
                    PhoneUtils.dial(r0.w0(str4));
                }
                break;
            default:
                String strI = ((Vc.a) obj).i();
                if (strI != null) {
                    PhoneUtils.dial(r0.w0(strI));
                }
                break;
        }
    }
}
