package Oc;

import C0.AbstractC0130w;
import Pa.g0;
import Pa.n0;
import Pa.r0;
import Qc.K;
import Qc.L;
import Rd.C0598n;
import Ua.O;
import Uc.C0654e0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierTaxDetailBean;
import com.flexibank.sdk.cashier.bean.FlexiBankPaymentFeeDetailBean;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankCashierCommonPreviewActivity;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentEarnLayout;
import com.google.api.Service;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethod;
import com.transsnet.palmpay.account.ui.dialog.SignUpPermissionDialog;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep0Fragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInInputMobileFragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInSelectVerifyMethodFragment;
import com.transsnet.palmpay.contacts.bean.resp.MemberRelationshipLogMessageDTO;
import com.transsnet.palmpay.contacts.bean.resp.RelationShipLogListBean;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.CloseContactBean;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonErrorResult;
import com.transsnet.palmpay.core.bean.CorePointInfoBean;
import com.transsnet.palmpay.core.bean.RecommendedItem;
import com.transsnet.palmpay.core.bean.req.DeleteFamilyAccontReq;
import com.transsnet.palmpay.core.ui.dialog.PaymentFeeDetailDialog;
import com.transsnet.palmpay.core.viewmodel.ModelAvailablePointItem;
import com.transsnet.palmpay.core.viewmodel.ReportTransactionItem;
import com.transsnet.palmpay.custom_view.bean.OrderDetailItemBean;
import com.transsnet.palmpay.custom_view.dialog.TipsDialog;
import com.transsnet.palmpay.custom_view.interfac.OnOrderDetailItemClickListener;
import com.transsnet.palmpay.custom_view.model.ModelPaymentEarnLayout;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.PaymentMethodListResp;
import com.transsnet.palmpay.managemoney.bean.PayoutOption;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxTermsConditionsDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WhyTurnOffSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WithdrawInterceptDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import com.transsnet.palmpay.p2pcash.ui.atm.dialog.PayByNoticeDialog;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.ui.activity.BeneficiariesActivity;
import com.transsnet.palmpay.teller.ui.activity.BillPaymentOrderDetailActivity;
import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import com.transsnet.palmpay.teller.ui.activity.JambHomeActivity;
import com.transsnet.palmpay.teller.ui.activity.WaecHomeActivity;
import com.transsnet.palmpay.teller.ui.dialog.BillerRenewalItemDialog;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentHomeNGFragment;
import com.transsnet.palmpay.teller.viewmodel.BeneficiariesListViewModel;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeNGViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p086fe.C1656b;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6771c;

    public /* synthetic */ j(int i7, Object obj, Object obj2) {
        this.f6769a = i7;
        this.f6770b = obj;
        this.f6771c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MemberRelationshipLogMessageDTO memberRelationshipLogMessageDTO;
        C0654e0 c0654e0 = null;
        str = null;
        String str = null;
        c0654e0 = null;
        Object obj = this.f6771c;
        Object obj2 = this.f6770b;
        switch (this.f6769a) {
            case 0:
                CashBoxTermsConditionsDialogFragment.a aVar = CashBoxTermsConditionsDialogFragment.f32284Q;
                CashBoxTermsConditionsDialogFragment cashBoxTermsConditionsDialogFragment = (CashBoxTermsConditionsDialogFragment) obj2;
                if (cashBoxTermsConditionsDialogFragment.getActivity() instanceof BaseActivity) {
                    androidx.fragment.app.E activity = cashBoxTermsConditionsDialogFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                    ((BaseActivity) activity).showLoadingDialog(true);
                    ((View) obj).setVisibility(4);
                    CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) cashBoxTermsConditionsDialogFragment.j();
                    PayoutOption payoutOption = (PayoutOption) cashBoxTermsConditionsDialogFragment.f32286M.getValue();
                    int type = payoutOption != null ? payoutOption.getType() : 2;
                    cashBoxViewModel.getClass();
                    p140j8.f.s(cashBoxViewModel, new K(type, null), cashBoxViewModel.f32751p0, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                break;
            case 1:
                WhyTurnOffSaveDialogFragment whyTurnOffSaveDialogFragment = (WhyTurnOffSaveDialogFragment) obj2;
                if (whyTurnOffSaveDialogFragment.f32332Q != 1) {
                    ((PpButton) obj).b(true);
                    CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) whyTurnOffSaveDialogFragment.j();
                    String str2 = (String) whyTurnOffSaveDialogFragment.f32330L.getValue();
                    cashBoxViewModel2.i(0, str2 != null ? str2 : "", whyTurnOffSaveDialogFragment.f32333X);
                } else {
                    whyTurnOffSaveDialogFragment.dismiss();
                    Bundle bundle = new Bundle();
                    bundle.putString("canCloseAutoSave", "1");
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "AutoSaveSetting");
                }
                break;
            case 2:
                WithdrawInterceptDialogFragment.a aVar2 = WithdrawInterceptDialogFragment.f32335L;
                PpButton ppButton = (PpButton) obj2;
                if (ppButton != null) {
                    ppButton.b(true);
                }
                CashBoxViewModel cashBoxViewModel3 = (CashBoxViewModel) ((WithdrawInterceptDialogFragment) obj).j();
                if (cashBoxViewModel3 != null) {
                    kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
                    PaymentMethodListResp.DataBean.Data data = new PaymentMethodListResp.DataBean.Data();
                    f10.f38951a = data;
                    data.setType(40);
                    p140j8.f.s(cashBoxViewModel3, new L(f10, null), cashBoxViewModel3.f32758v0, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                break;
            case 3:
                p355xf.t tVar = ((FlexiBankCashierCommonPreviewActivity) obj2).f6885Y;
                ((Q3.f) tVar.getValue()).show();
                Q3.f fVar = (Q3.f) tVar.getValue();
                FlexiBankCashierTaxDetailBean flexiBankCashierTaxDetailBean = (FlexiBankCashierTaxDetailBean) obj;
                Q3.e eVar = fVar.f7603f;
                if (eVar != null) {
                    List listC = flexiBankCashierTaxDetailBean.getPayerTaxDetails();
                    eVar.setList(listC != null ? listC : new ArrayList<>());
                }
                x4.j jVar = fVar.f7602e;
                if (jVar != null) {
                    TextView textView = jVar.f43623g;
                    Long lF = flexiBankCashierTaxDetailBean.getTotalPayerTax();
                    textView.setText(p118hf.a.t(lF != null ? lF.longValue() : 0L, false));
                }
                break;
            case 4:
                p355xf.t tVar2 = ((FlexiBankCashierCommonPreviewActivity) obj2).f6884X;
                ((Q3.d) tVar2.getValue()).show();
                Q3.d dVar = (Q3.d) tVar2.getValue();
                FlexiBankPaymentFeeDetailBean flexiBankPaymentFeeDetailBean = (FlexiBankPaymentFeeDetailBean) obj;
                P8.a aVar3 = dVar.f7601f;
                if (aVar3 != null) {
                    aVar3.setList(flexiBankPaymentFeeDetailBean.getDetail());
                }
                x4.j jVar2 = dVar.f7600e;
                if (jVar2 != null) {
                    TextView textView2 = jVar2.f43623g;
                    Long lD = flexiBankPaymentFeeDetailBean.getTotalAmount();
                    textView2.setText(p118hf.a.t(lD != null ? lD.longValue() : 0L, false));
                }
                break;
            case 5:
                ((ViewGroup) obj2).removeView((ImageView) obj);
                break;
            case 6:
                Intent intentA = Pa.F.a((Activity) obj2, ((CommonErrorResult) obj).jumpBtnAndroidLink);
                if (intentA != null) {
                    ActivityUtils.startActivity(intentA);
                }
                break;
            case 7:
                p038ca.a aVar4 = (p038ca.a) obj2;
                if (aVar4 == null) {
                    ((g0) obj).a();
                } else {
                    p038ca.a.f(aVar4);
                }
                break;
            case 8:
                SignUpPermissionDialog.initViews$lambda$0((SignUpPermissionDialog) obj2, (View) obj, view);
                break;
            case 9:
                int i7 = FlexiBankModelPaymentEarnLayout.f22045e;
                Context context = (Context) obj2;
                O6.c cVar = new O6.c(context);
                cVar.f6605k = false;
                String str3 = ((FlexiBankModelPaymentEarnLayout) obj).f22047b;
                cVar.f6598d = str3 != null ? str3 : "";
                cVar.f6600f = context.getString(com.flexibank.sdk.r.fb_got_it);
                cVar.f6602h = null;
                O6.d dVarA = cVar.a();
                Intrinsics.checkNotNullExpressionValue(dVarA, "create(...)");
                dVarA.setCanceledOnTouchOutside(false);
                dVarA.setCancelable(false);
                dVarA.show();
                break;
            case 10:
                int i10 = ModelAvailablePointItem.f28256i;
                CorePointInfoBean corePointInfoBean = (CorePointInfoBean) obj2;
                String str4 = corePointInfoBean.url;
                if (str4 != null && str4.length() > 0) {
                    ActivityUtils.startActivity(Pa.F.a(((ModelAvailablePointItem) obj).getContext(), corePointInfoBean.url));
                    break;
                }
                break;
            case 11:
                RecommendedItem recommendedItem = (RecommendedItem) obj2;
                String str5 = recommendedItem.description;
                if (str5 != null && str5.length() > 0) {
                    Intrinsics.e(view);
                    String str6 = recommendedItem.description;
                    Intrinsics.e(str6);
                    CommonViewExtKt.showBalloon(view, str6, ((O) obj).f9357b, (2089452 & 4) != 0 ? view : null, (2089452 & 8) != 0 ? 80 : 0, (2089452 & 16) != 0 ? true : true, (2089452 & 32) != 0 ? 0.7f : 0.0f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? L6.b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : G7.c.f3054a, (2089452 & 2048) != 0 ? 10 : 8, (2089452 & 4096) != 0 ? 0 : 2, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? view.getContext().getDrawable(com.transsnet.palmpay.custom_view.r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? L6.b.ppColorTextPrimary : 0, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                    break;
                }
                break;
            case 12:
                EditText editText = (EditText) obj2;
                if (!editText.hasFocus()) {
                    editText.requestFocus();
                } else {
                    com.transsnet.palmpay.core.viewmodel.c cVar2 = (com.transsnet.palmpay.core.viewmodel.c) obj;
                    cVar2.f28579d = editText;
                    cVar2.g();
                }
                break;
            case 13:
                ReportTransactionItem reportTransactionItem = (ReportTransactionItem) obj2;
                if (!TextUtils.isEmpty(reportTransactionItem.f28571d)) {
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"support@palmpay.co"});
                    intent.putExtra("android.intent.extra.SUBJECT", reportTransactionItem.f28571d);
                    intent.putExtra("android.intent.extra.TEXT", reportTransactionItem.f28572e);
                    Context context2 = (Context) obj;
                    if (intent.resolveActivity(context2.getPackageManager()) == null) {
                        ToastUtils.showShort(context2.getString(p025ba.k.core_no_email_app), new Object[0]);
                    } else {
                        context2.startActivity(intent);
                    }
                    break;
                }
                break;
            case 14:
                int i11 = MapPage.f32859u0;
                MapPage mapPage = (MapPage) obj;
                if (mapPage.r().a().latitude > 0.0d && mapPage.r().a().longitude > 0.0d) {
                    c0654e0 = (C0654e0) obj2;
                }
                if (c0654e0 != null) {
                    Intrinsics.checkNotNullParameter(mapPage, "<this>");
                    r0.P0(mapPage, mapPage.r().a().latitude, mapPage.r().a().longitude);
                }
                break;
            case 15:
                int i12 = NearbyAgent2Page.f32889k0;
                ((NearbyAgent2Page) obj2).q().a(1, ((Vc.a) obj).h());
                break;
            case 16:
                n0.g().l("QuickVerificationPopupWait");
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("extra_data", (Parcelable) ((CommonBeanResult) obj2).data);
                AbstractC0130w abstractC0130w = ((IdentityVerificationStep0Fragment) obj).t;
                if (abstractC0130w != null) {
                    abstractC0130w.h(F8.d.fragment_identity_verification_confirm_bvn, bundle2, null);
                }
                break;
            case 17:
                ModelPaymentEarnLayout modelPaymentEarnLayout = (ModelPaymentEarnLayout) obj2;
                Function0 function0 = modelPaymentEarnLayout.f31531c;
                if (function0 != null) {
                    function0.invoke();
                }
                Context context3 = (Context) obj;
                O6.c cVar3 = new O6.c(context3);
                cVar3.f6605k = false;
                String str7 = modelPaymentEarnLayout.f31532d;
                cVar3.f6598d = str7 != null ? str7 : "";
                cVar3.f6600f = context3.getString(com.transsnet.palmpay.custom_view.v.cv_got_it);
                cVar3.f6602h = null;
                O6.d dVarA2 = cVar3.a();
                Intrinsics.checkNotNullExpressionValue(dVarA2, "create(...)");
                dVarA2.setCanceledOnTouchOutside(false);
                dVarA2.setCancelable(false);
                dVarA2.show();
                break;
            case 18:
                int i13 = OrderResultItemModel.f31624w;
                OnOrderDetailItemClickListener onOrderDetailItemClickListener = (OnOrderDetailItemClickListener) obj2;
                if (onOrderDetailItemClickListener != null) {
                    onOrderDetailItemClickListener.onClick((OrderDetailItemBean) obj);
                }
                break;
            case 19:
                int i14 = LogInInputMobileFragment.f26194C;
                T data2 = ((CommonBeanResult) obj).data;
                Intrinsics.checkNotNullExpressionValue(data2, "data");
                ((LogInInputMobileFragment) obj2).y((PreCheckPhoneRsp) data2);
                break;
            case 20:
                n0.g().l("PalmPayLogin_OtherVerifyMethod_click");
                IconicsTextView iconicsTextView = (IconicsTextView) obj2;
                iconicsTextView.setEnabled(false);
                LogInSelectVerifyMethodFragment logInSelectVerifyMethodFragment = (LogInSelectVerifyMethodFragment) obj;
                SecurityVerifyMethod securityVerifyMethod = logInSelectVerifyMethodFragment.f26204p;
                if (securityVerifyMethod != null) {
                    iconicsTextView.animate().alpha(0.0f).setDuration(250L).withEndAction(new Da.h(iconicsTextView, 16, logInSelectVerifyMethodFragment, securityVerifyMethod)).start();
                }
                break;
            case 21:
                Postcard postcardBuild = ARouter.getInstance().build("/contact/add_new_fave");
                RelationShipLogListBean relationShipLogListBean = (RelationShipLogListBean) obj2;
                if (relationShipLogListBean != null && (memberRelationshipLogMessageDTO = relationShipLogListBean.memberRelationshipLogMessageDTO) != null) {
                    str = memberRelationshipLogMessageDTO.phone;
                }
                W9.k kVar = (W9.k) obj;
                postcardBuild.withString("key_phone", str).withString("key_binding_memberid", kVar.f10640e).withString("key_final_source", "3").navigation(kVar.f4984a);
                break;
            case 22:
                ((PayByNoticeDialog) obj2).lambda$setDetail$2((PayByNoticeDialog.Listener) obj, view);
                break;
            case 23:
                CloseContactBean closeContactBean = (CloseContactBean) obj2;
                DeleteFamilyAccontReq deleteFamilyAccontReq = new DeleteFamilyAccontReq(closeContactBean != null ? closeContactBean.accountId : null);
                int i15 = BeneficiariesActivity.f34148v;
                BeneficiariesListViewModel beneficiariesListViewModel = (BeneficiariesListViewModel) ((BeneficiariesActivity) obj).l();
                beneficiariesListViewModel.getClass();
                p140j8.f.s(beneficiariesListViewModel, new C1656b(deleteFamilyAccontReq, null), beneficiariesListViewModel.f34385f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                break;
            case 24:
                BillPaymentOrderDetailActivity.a aVar5 = BillPaymentOrderDetailActivity.f34162i;
                BillPaymentOrderDetailRsp billPaymentOrderDetailRsp = (BillPaymentOrderDetailRsp) obj2;
                BillPaymentOrderDetailActivity billPaymentOrderDetailActivity = (BillPaymentOrderDetailActivity) obj;
                if (billPaymentOrderDetailRsp.getFeeDetailList() == null) {
                    Long vatFee = billPaymentOrderDetailRsp.getVatFee();
                    if ((vatFee != null ? vatFee.longValue() : 0L) > 0) {
                        Long vatFee2 = billPaymentOrderDetailRsp.getVatFee();
                        String strW = r0.W(billPaymentOrderDetailActivity, vatFee2 != null ? vatFee2.longValue() : 0L);
                        TipsDialog tipsDialog = new TipsDialog(billPaymentOrderDetailActivity, com.transsnet.palmpay.custom_view.t.cv_tips_dialog);
                        tipsDialog.setMessage(strW);
                        tipsDialog.setButtonText(null);
                        tipsDialog.setMessageGravity(17);
                        tipsDialog.show();
                    }
                } else {
                    PaymentFeeDetailDialog paymentFeeDetailDialog = new PaymentFeeDetailDialog(billPaymentOrderDetailActivity);
                    paymentFeeDetailDialog.show();
                    paymentFeeDetailDialog.update(billPaymentOrderDetailRsp.getFeeDetailList());
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((BillerTransactionResultActivity) obj2).f34189X.onClick(((C0598n) obj).f8414v);
                break;
            case 26:
                int i16 = JambHomeActivity.f34222B;
                CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj2;
                if (createTellerOrderReq != null) {
                    createTellerOrderReq.verifyNetwork = false;
                    BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) ((JambHomeActivity) obj).l();
                    if (billPaymentHomeNGViewModel != null) {
                        billPaymentHomeNGViewModel.d(createTellerOrderReq);
                    }
                }
                break;
            case 27:
                int i17 = WaecHomeActivity.f34237Q;
                CreateTellerOrderReq createTellerOrderReq2 = (CreateTellerOrderReq) obj2;
                if (createTellerOrderReq2 != null) {
                    createTellerOrderReq2.verifyNetwork = false;
                    BillPaymentHomeNGViewModel billPaymentHomeNGViewModel2 = (BillPaymentHomeNGViewModel) ((WaecHomeActivity) obj).l();
                    if (billPaymentHomeNGViewModel2 != null) {
                        billPaymentHomeNGViewModel2.d(createTellerOrderReq2);
                    }
                }
                break;
            case 28:
                BillerRenewalItemDialog.initViews$lambda$4((BillerRenewalItemDialog) obj2, (String) obj, view);
                break;
            default:
                int i18 = BillPaymentHomeNGFragment.f34279r0;
                BillPaymentHomeNGViewModel billPaymentHomeNGViewModel3 = (BillPaymentHomeNGViewModel) ((BillPaymentHomeNGFragment) obj2).f27333i;
                if (billPaymentHomeNGViewModel3 != null) {
                    billPaymentHomeNGViewModel3.i(C1850q.e((String) obj));
                }
                break;
        }
    }
}
