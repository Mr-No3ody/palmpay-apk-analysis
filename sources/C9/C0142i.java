package C9;

import C0.AbstractC0130w;
import Pa.i0;
import Wf.AbstractC0780y;
import android.content.Intent;
import android.net.Uri;
import androidx.camera.camera2.internal.P0;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.palmpay.lib.webview.container.PPWebView;
import com.transsnet.palmpay.account.bean.req.AddUserExtraInfoReq;
import com.transsnet.palmpay.account.bean.req.CheckIdentifyReq;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayTier3ApplicationDetailActivity;
import com.transsnet.palmpay.account.ui.dialog.IdentityVerificationErrorDialog;
import com.transsnet.palmpay.account.ui.dialog.KycDetailsDialog;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep1Fragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStepFace2Fragment;
import com.transsnet.palmpay.account.ui.fragment.login.LogInInputMobileFragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepOtcFragment;
import com.transsnet.palmpay.account.ui.fragment.verify.VerifyAccountOtpFragment;
import com.transsnet.palmpay.cash_in.ui.activity.CashInReceiptActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.RecommendedItem;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.core.ui.activity.CoreTransactionReceiptActivity;
import com.transsnet.palmpay.core.web.PWebActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopTransReceiptActivity;
import com.transsnet.palmpay.databundle.ui.activity.BuyFlashSaleActivity;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.photograph.PhotoViewerActivity;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import com.transsnet.palmpay.ui.activity.LifeBillsHomeActivity;
import com.transsnet.palmpay.ui.fragment.HomeFinanceFragment;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.ui.fragment.HomeSavingsUserV2Fragment;
import com.transsnet.palmpay.ui.fragment.InvestGuideFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.viewmodule.HomeSavingsViewModel;
import com.transsnet.palmpay.viewmodule.LifeBillsHomeViewModel;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0142i implements CompleteCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1309b;

    public /* synthetic */ C0142i(Object obj, int i7) {
        this.f1308a = i7;
        this.f1309b = obj;
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(Object[] objArr) {
        Uri uriFromFile;
        AddUserExtraInfoReq addUserExtraInfoReqL;
        CheckIdentifyReq checkIdentifyReqN;
        AddUserExtraInfoReq addUserExtraInfoReqL2;
        CheckIdentifyReq checkIdentifyReqN2;
        Function0 function0;
        Function0 function1;
        Boolean bool;
        Boolean bool2;
        DataBundleHomeViewModel dataBundleHomeViewModel;
        int i7 = 3;
        int i10 = 1;
        int i11 = 0;
        Object obj = this.f1309b;
        switch (this.f1308a) {
            case 0:
                CashInReceiptActivity cashInReceiptActivity = (CashInReceiptActivity) obj;
                int i12 = CashInReceiptActivity.f26800w0;
                M.q qVarA = AbstractC1859i.a((File[]) objArr);
                while (qVarA.hasNext()) {
                    try {
                        com.facebook.imagepipeline.nativecode.b.F(cashInReceiptActivity, androidx.core.content.f.getUriForFile(BaseApplication.getContext(), i0.w(cashInReceiptActivity), (File) qVarA.next()));
                    } catch (Exception unused) {
                    }
                }
                break;
            case 1:
                int i13 = HomeFinanceFragment.f35071H;
                ((HomeFinanceFragment) obj).onRefresh();
                break;
            case 2:
                int i14 = HomePalmZoneTabV2.f35134Z;
                ((HomePalmZoneTabV2) obj).y();
                break;
            case 3:
                HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                ((HomeSavingsViewModel) ((HomeSavingsUserV2Fragment) obj).f27327p).d();
                break;
            case 4:
                InvestGuideFragment.a aVar2 = InvestGuideFragment.f35185t0;
                ((HomeSavingsViewModel) ((InvestGuideFragment) obj).f27327p).d();
                break;
            case 5:
                File[] fileArr = (File[]) objArr;
                PalmPayTier3ApplicationDetailActivity.a aVar3 = PalmPayTier3ApplicationDetailActivity.f25934d;
                PalmPayTier3ApplicationDetailActivity palmPayTier3ApplicationDetailActivity = (PalmPayTier3ApplicationDetailActivity) obj;
                palmPayTier3ApplicationDetailActivity.showLoadingDialog(false);
                try {
                    File file = fileArr[0];
                    if (file != null && (uriFromFile = Uri.fromFile(file)) != null) {
                        Intent intent = new Intent(palmPayTier3ApplicationDetailActivity, (Class<?>) PhotoViewerActivity.class);
                        intent.setData(uriFromFile);
                        ActivityUtils.startActivity(intent);
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 6:
                KycDetailsDialog.showFacePhoto$lambda$5$lambda$4((KycDetailsDialog) obj, (File[]) objArr);
                break;
            case 7:
                String[] strArr = (String[]) objArr;
                int i15 = IdentityVerificationStep1Fragment.f26173w;
                String str = strArr != null ? strArr[0] : null;
                IdentityVerificationStep1Fragment identityVerificationStep1Fragment = (IdentityVerificationStep1Fragment) obj;
                if (Intrinsics.c(str, "face")) {
                    androidx.fragment.app.E activity = identityVerificationStep1Fragment.getActivity();
                    if (activity != null) {
                        p220oa.h.g(activity, "FacialRecognitionFailedPopupFace");
                    }
                    identityVerificationStep1Fragment.f26174o = true;
                    androidx.fragment.app.E activity2 = identityVerificationStep1Fragment.getActivity();
                    if (activity2 != null) {
                        activity2.onBackPressed();
                    }
                } else if (Intrinsics.c(str, IdentityVerificationErrorDialog.BUTTON_BYHAND)) {
                    androidx.fragment.app.E activity3 = identityVerificationStep1Fragment.getActivity();
                    if (activity3 != null) {
                        p220oa.h.g(activity3, "FacialRecognitionFailedPopupManual");
                    }
                    IdentityVerificationActivity identityVerificationActivityA = identityVerificationStep1Fragment.A();
                    if (identityVerificationActivityA != null && (checkIdentifyReqN = identityVerificationActivityA.n()) != null) {
                        checkIdentifyReqN.faceToken = null;
                    }
                    IdentityVerificationActivity identityVerificationActivityA2 = identityVerificationStep1Fragment.A();
                    if (identityVerificationActivityA2 != null && (addUserExtraInfoReqL = identityVerificationActivityA2.l()) != null) {
                        addUserExtraInfoReqL.faceToken = null;
                    }
                    AbstractC0130w abstractC0130w = identityVerificationStep1Fragment.f26175p;
                    if (abstractC0130w != null) {
                        abstractC0130w.h(F8.d.fragment_identity_verification_step2, null, null);
                    }
                }
                break;
            case 8:
                String[] strArr2 = (String[]) objArr;
                String str2 = strArr2 != null ? strArr2[0] : null;
                IdentityVerificationStepFace2Fragment identityVerificationStepFace2Fragment = (IdentityVerificationStepFace2Fragment) obj;
                if (Intrinsics.c(str2, "id")) {
                    androidx.fragment.app.E activity4 = identityVerificationStepFace2Fragment.getActivity();
                    if (activity4 != null) {
                        p220oa.h.g(activity4, "FacialRecognitionFailedPopupFace");
                    }
                    identityVerificationStepFace2Fragment.f26179o = true;
                    androidx.fragment.app.E activity5 = identityVerificationStepFace2Fragment.getActivity();
                    if (activity5 != null) {
                        activity5.onBackPressed();
                    }
                } else if (Intrinsics.c(str2, IdentityVerificationErrorDialog.BUTTON_BYHAND)) {
                    androidx.fragment.app.E activity6 = identityVerificationStepFace2Fragment.getActivity();
                    if (activity6 != null) {
                        p220oa.h.g(activity6, "FacialRecognitionFailedPopupManual");
                    }
                    IdentityVerificationActivity identityVerificationActivityU = identityVerificationStepFace2Fragment.u();
                    if (identityVerificationActivityU != null && (checkIdentifyReqN2 = identityVerificationActivityU.n()) != null) {
                        checkIdentifyReqN2.faceToken = null;
                    }
                    IdentityVerificationActivity identityVerificationActivityU2 = identityVerificationStepFace2Fragment.u();
                    if (identityVerificationActivityU2 != null && (addUserExtraInfoReqL2 = identityVerificationActivityU2.l()) != null) {
                        addUserExtraInfoReqL2.faceToken = null;
                    }
                    AbstractC0130w abstractC0130w2 = identityVerificationStepFace2Fragment.t;
                    if (abstractC0130w2 != null) {
                        abstractC0130w2.h(F8.d.fragment_identity_verification_step2, null, null);
                    }
                }
                break;
            case 9:
                PWebActivity pWebActivity = (PWebActivity) obj;
                PPWebView pPWebView = pWebActivity.f28607p;
                if (pPWebView != null) {
                    pPWebView.reload();
                }
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = androidx.lifecycle.V.f(pWebActivity);
                p042cg.f fVar = Wf.I.f10809a;
                AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new Va.f(pWebActivity, null), 2);
                break;
            case 10:
                int i16 = LogInInputMobileFragment.f26194C;
                Boolean bool3 = ((Boolean[]) objArr)[0];
                if (bool3 != null) {
                    LogInInputMobileFragment logInInputMobileFragment = (LogInInputMobileFragment) obj;
                    if (!bool3.booleanValue()) {
                        logInInputMobileFragment.f26199p = false;
                        androidx.fragment.app.E eRequireActivity = logInInputMobileFragment.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        String string = logInInputMobileFragment.getString(F8.h.ac_msg_double_confirm_permission);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        int i17 = p025ba.k.core_agree;
                        W8.c cVar = new W8.c(logInInputMobileFragment, i11);
                        String string2 = logInInputMobileFragment.getString(F8.h.ac_quit);
                        W8.c cVar2 = new W8.c(logInInputMobileFragment, i10);
                        int i18 = p025ba.k.core_opps;
                        O6.c cVar3 = new O6.c(eRequireActivity);
                        cVar3.f6614u = 1;
                        cVar3.e(i18);
                        cVar3.f("");
                        cVar3.f6598d = string;
                        cVar3.d(i17, cVar);
                        if (string2 != null) {
                            cVar3.f6601g = string2;
                            cVar3.f6603i = cVar2;
                        }
                        cVar3.f6605k = true;
                        cVar3.f6606l = 1;
                        C0.G.v(cVar3, true, true);
                    } else {
                        logInInputMobileFragment.v();
                    }
                }
                break;
            case 11:
                if (!((Boolean[]) objArr)[0].booleanValue() && (function0 = (Function0) ((P0) obj).f13247b) != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 12:
                if (!((Boolean[]) objArr)[0].booleanValue() && (function1 = (Function0) ((Zd.E) obj).f13247b) != null) {
                    function1.invoke();
                    break;
                }
                break;
            case 13:
                SignUpStep1Fragment.a aVar4 = SignUpStep1Fragment.f26251u0;
                Boolean bool4 = ((Boolean[]) objArr)[0];
                if (bool4 != null) {
                    SignUpStep1Fragment signUpStep1Fragment = (SignUpStep1Fragment) obj;
                    if (!bool4.booleanValue()) {
                        signUpStep1Fragment.f26271v = false;
                        androidx.fragment.app.E activity7 = signUpStep1Fragment.getActivity();
                        if (activity7 != null) {
                            String string3 = signUpStep1Fragment.getString(F8.h.ac_msg_double_confirm_permission);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                            int i19 = p025ba.k.core_agree;
                            p010a9.a aVar5 = new p010a9.a(signUpStep1Fragment, i7);
                            String string4 = signUpStep1Fragment.getString(F8.h.ac_quit);
                            p010a9.a aVar6 = new p010a9.a(signUpStep1Fragment, 4);
                            int i20 = p025ba.k.core_opps;
                            O6.c cVar4 = new O6.c(activity7);
                            cVar4.f6614u = 1;
                            cVar4.e(i20);
                            cVar4.f("");
                            cVar4.f6598d = string3;
                            cVar4.d(i19, aVar5);
                            if (string4 != null) {
                                cVar4.f6601g = string4;
                                cVar4.f6603i = aVar6;
                            }
                            cVar4.f6605k = true;
                            cVar4.f6606l = 1;
                            C0.G.v(cVar4, true, true);
                        }
                    } else {
                        signUpStep1Fragment.D(true);
                        signUpStep1Fragment.u();
                    }
                }
                break;
            case 14:
                Boolean[] boolArr = (Boolean[]) objArr;
                SignUpStepOtcFragment.a aVar7 = SignUpStepOtcFragment.f26279v;
                if (boolArr != null && (bool = boolArr[0]) != null) {
                    ((SignUpStepOtcFragment) obj).showLoadingDialog(bool.booleanValue());
                    break;
                }
                break;
            case 15:
                Boolean[] boolArr2 = (Boolean[]) objArr;
                int i21 = VerifyAccountOtpFragment.f26314H;
                if (boolArr2 != null && (bool2 = boolArr2[0]) != null) {
                    ((VerifyAccountOtpFragment) obj).showLoadingDialog(bool2.booleanValue());
                    break;
                }
                break;
            case 16:
                int i22 = CoreTransactionReceiptActivity.f27593B;
                F6.d.h(((CoreTransactionReceiptActivity) obj).TAG, 3, "do nothing with file");
                if (((File[]) objArr)[0] != null) {
                    ToastUtils.showLong(p025ba.k.core_msg_save_receipt_to_gallery);
                }
                break;
            case 17:
                String[] strArr3 = (String[]) objArr;
                BuyFlashSaleActivity buyFlashSaleActivity = (BuyFlashSaleActivity) obj;
                RecommendedItem recommendedItem = buyFlashSaleActivity.f31764d;
                if (recommendedItem == null) {
                    buyFlashSaleActivity.finish();
                    break;
                } else {
                    String str3 = strArr3[0];
                    DataBundleWalletItemBean dataBundleWalletItemBean = new DataBundleWalletItemBean();
                    dataBundleWalletItemBean.setBillerName(recommendedItem.billerName);
                    dataBundleWalletItemBean.setBillerId(recommendedItem.billerId);
                    dataBundleWalletItemBean.setItemId(recommendedItem.itemId);
                    dataBundleWalletItemBean.setInstitutionLogo(recommendedItem.billerIcon);
                    dataBundleWalletItemBean.setItemName(recommendedItem.itemName);
                    dataBundleWalletItemBean.setValidity(recommendedItem.validity);
                    dataBundleWalletItemBean.setVolume(recommendedItem.volume);
                    dataBundleWalletItemBean.setVolumeUnit(recommendedItem.volumeUnit);
                    dataBundleWalletItemBean.setDiscountPackageId(recommendedItem.discountPackageId);
                    Long l5 = recommendedItem.price;
                    if (str3 != null && l5 != null && (dataBundleHomeViewModel = (DataBundleHomeViewModel) buyFlashSaleActivity.l()) != null) {
                        long jLongValue = l5.longValue();
                        int i23 = DataBundleHomeViewModel.f31793M;
                        dataBundleHomeViewModel.d(dataBundleWalletItemBean, str3, jLongValue, true, null, TransType.TRANS_TYPE_EX_GRATIA_OTHER);
                        break;
                    }
                }
                break;
            case 18:
                int i24 = LifeBillsHomeActivity.f34485A;
                if (!((Boolean[]) objArr)[0].booleanValue()) {
                    LifeBillsHomeActivity lifeBillsHomeActivity = (LifeBillsHomeActivity) obj;
                    ((LifeBillsHomeViewModel) lifeBillsHomeActivity.l()).f();
                    ((LifeBillsHomeViewModel) lifeBillsHomeActivity.l()).e();
                    ((LifeBillsHomeViewModel) lifeBillsHomeActivity.l()).d();
                }
                break;
            default:
                PayShopTransReceiptActivity payShopTransReceiptActivity = (PayShopTransReceiptActivity) obj;
                int i25 = PayShopTransReceiptActivity.f28760Z;
                M.q qVarA2 = AbstractC1859i.a((File[]) objArr);
                while (qVarA2.hasNext()) {
                    try {
                        com.facebook.imagepipeline.nativecode.b.F(payShopTransReceiptActivity, androidx.core.content.f.getUriForFile(BaseApplication.getContext(), i0.w(BaseApplication.getContext()), (File) qVarA2.next()));
                    } catch (Exception unused3) {
                    }
                }
                break;
        }
    }
}
