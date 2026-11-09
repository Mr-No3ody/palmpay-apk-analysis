package Ha;

import Ab.D;
import Bc.C0106c;
import Hb.L;
import Ie.n;
import Ie.o;
import Ie.v;
import Ie.w;
import Ie.x;
import Pa.C0521s;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.camera.camera2.internal.P0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import com.google.api.Service;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.transsnet.palmpay.account.kotlin.ui.activity.ResetPinVerificationActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.activity.PayVerificationActivity;
import com.transsnet.palmpay.core.ui.dialog.CoinRewardDialog;
import com.transsnet.palmpay.core.ui.dialog.ConfirmPaymentFeeDialog;
import com.transsnet.palmpay.core.ui.fragment.verify.BaseCheckPinFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.BaseVerifyFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBankAccountOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBankOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBankPinFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckCVVFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPalmPayOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPostPayOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQAFragment;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.main.export.bean.rsp.AssetBannerBean;
import com.transsnet.palmpay.main.export.bean.rsp.AssetsBalanceItem;
import com.transsnet.palmpay.main.export.bean.rsp.QueryFundModuleResp;
import com.transsnet.palmpay.mall.ui.activity.MallPaymentOrderDetailActivity;
import com.transsnet.palmpay.mall.ui.activity.MallPhotoViewActivity;
import com.transsnet.palmpay.ui.activity.welcome.WelcomeBackActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.MainUtils;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3775b;

    public /* synthetic */ d(Object obj, int i7) {
        this.f3774a = i7;
        this.f3775b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ModelBillDetailTitle modelBillDetailTitle;
        ImageView imageView;
        String str;
        String str2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        Integer num;
        AssetBannerBean assetBannerBean;
        String str3;
        String str4;
        String str5;
        String str6;
        Editable editableText;
        String str7 = "";
        string = null;
        String string = null;
        context = null;
        Context context = null;
        Object obj = this.f3775b;
        switch (this.f3774a) {
            case 0:
                CoinRewardDialog.onClickListener$lambda$9((CoinRewardDialog) obj, view);
                break;
            case 1:
                ConfirmPaymentFeeDialog.initViews$lambda$5((ConfirmPaymentFeeDialog) obj, view);
                break;
            case 2:
                ((L) obj).invoke();
                break;
            case 3:
                MallPaymentOrderDetailActivity mallPaymentOrderDetailActivity = (MallPaymentOrderDetailActivity) obj;
                C0106c c0106c = mallPaymentOrderDetailActivity.f32006d;
                if (c0106c != null && (modelBillDetailTitle = (ModelBillDetailTitle) c0106c.f678p) != null && (imageView = modelBillDetailTitle.t) != null) {
                    imageView.setVisibility(4);
                }
                String str8 = mallPaymentOrderDetailActivity.f32003a;
                C0106c c0106c2 = mallPaymentOrderDetailActivity.f32006d;
                r0.L1(str8, mallPaymentOrderDetailActivity, c0106c2 != null ? (ModelBillDetailTitle) c0106c2.f678p : null, c0106c2 != null ? (ScrollView) c0106c2.f676j : null);
                break;
            case 4:
                int i7 = MallPhotoViewActivity.f32007g;
                ((MallPhotoViewActivity) obj).supportFinishAfterTransition();
                break;
            case 5:
                ((Ie.a) obj).getClass();
                break;
            case 6:
                n0.g().m("new_user_bonus_page_element_click", "Jump Button", "");
                Ie.c cVar = (Ie.c) obj;
                String str9 = cVar.f4313b;
                if (str9 != null) {
                    ActivityUtils.startActivity(F.a(cVar.f4312a.getContext(), str9));
                }
                break;
            case 7:
                n0.g().l("FinanceTab_FixedSavings_Click");
                if (!BaseApplication.hasLogin()) {
                    MainUtils.jumpLoginWithParam(MainUtils.MAIN_WEALTH_TAB_PATH);
                } else {
                    Ie.d dVar = (Ie.d) obj;
                    if (dVar.f4323i != null) {
                        View view2 = dVar.f4315a;
                        ActivityUtils.startActivity(F.a(view2 != null ? view2.getContext() : null, dVar.f4323i));
                    }
                }
                break;
            case 8:
                QueryFundModuleResp queryFundModuleResp = (QueryFundModuleResp) obj;
                if (queryFundModuleResp != null) {
                    if (!BaseApplication.hasLogin()) {
                        MainUtils.jumpLoginWithParam(MainUtils.MAIN_WEALTH_TAB_PATH);
                    } else {
                        n0.g().k(new ClickEvent("FinanceTab_MutualFunds_Invest_Click").add("element_name", queryFundModuleResp.fundName));
                        com.palmpay.lib.apm.launchcounter.util.d.x(p002a.a.e(new Pair("fundId", queryFundModuleResp.fundId)), "FundDetail");
                    }
                }
                break;
            case 9:
                if (!BaseApplication.hasLogin()) {
                    MainUtils.jumpLoginWithParam(MainUtils.MAIN_WEALTH_TAB_PATH);
                } else {
                    n0.g().l("FinanceTab_MutualFunds_Click");
                    Ie.e eVar = (Ie.e) obj;
                    if (eVar.f4329d != null) {
                        View view3 = eVar.f4327b;
                        Intrinsics.e(view3);
                        ActivityUtils.startActivity(F.a(view3.getContext(), eVar.f4329d));
                    }
                }
                break;
            case 10:
                Ie.h hVar = (Ie.h) obj;
                n0 n0VarG = n0.g();
                ClickEvent clickEvent = new ClickEvent("Home_FundBanner_Click");
                AssetBannerBean assetBannerBean2 = hVar.f4348g;
                if (assetBannerBean2 == null || (str = assetBannerBean2.businessSign) == null) {
                    str = "";
                }
                ClickEvent clickEventAdd = clickEvent.add("businessSign", str);
                AssetBannerBean assetBannerBean3 = hVar.f4348g;
                if (assetBannerBean3 != null && (str4 = assetBannerBean3.content) != null) {
                    str7 = str4;
                }
                n0VarG.k(clickEventAdd.add(FirebaseAnalytics.Param.CONTENT, str7));
                AssetBannerBean assetBannerBean4 = hVar.f4348g;
                if (assetBannerBean4 != null && (num = assetBannerBean4.needClickReport) != null && num.intValue() == 1 && (assetBannerBean = hVar.f4348g) != null && (str3 = assetBannerBean.businessId) != null) {
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        V v3 = V.f10828a;
                        p042cg.f fVar = I.f10809a;
                        AbstractC0780y.m(v3, p042cg.e.f19009c, null, new Ie.g(str3, null), 2);
                    }
                }
                AssetBannerBean assetBannerBean5 = hVar.f4348g;
                if (assetBannerBean5 != null && (str2 = assetBannerBean5.androidJumpUrl) != null) {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        Bc.k kVar = hVar.f4345d;
                        if (((kVar == null || (constraintLayout2 = (ConstraintLayout) kVar.f751e) == null) ? null : constraintLayout2.getContext()) != null) {
                            Bc.f fVar2 = hVar.f4344c;
                            if (fVar2 != null && (constraintLayout = (ConstraintLayout) fVar2.f697c) != null) {
                                context = constraintLayout.getContext();
                            }
                            Intent intentA = F.a(context, str2);
                            if (intentA != null) {
                                ActivityUtils.startActivity(intentA);
                            }
                        }
                    }
                    break;
                }
                break;
            case 11:
                n0.g().l("homePageoldusermoreClick");
                WelcomeBackActivity.a aVar = WelcomeBackActivity.f35031o;
                Context context2 = ((n) obj).f4380a.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                aVar.launch(context2);
                break;
            case 12:
                ((o) obj).getClass();
                if (!BaseApplication.hasLogin()) {
                    MainUtils.jumpLoginWithParam(MainUtils.MAIN_WEALTH_TAB_PATH);
                } else {
                    n0.g().l("FinanceTab_Insurance_Click");
                    com.palmpay.lib.apm.launchcounter.util.d.x(null, "InsuranceHome");
                }
                break;
            case 13:
                AssetsBalanceItem assetsBalanceItem = (AssetsBalanceItem) ((P0) obj).f13250e;
                if (assetsBalanceItem != null) {
                    n0.g().k(new ClickEvent("TotalAssetsServicesClick").add("item", assetsBalanceItem.title));
                    String str10 = assetsBalanceItem.jumpUrl;
                    if (str10 != null) {
                        if (TextUtils.isEmpty(str10)) {
                            str10 = null;
                        }
                        if (str10 != null) {
                            if (!y.m(str10, "arouter://", false)) {
                                F.f(assetsBalanceItem.jumpUrl, assetsBalanceItem.jumpType, null);
                            } else {
                                ActivityUtils.startActivity(F.a(view.getContext(), str10));
                            }
                        }
                    }
                }
                break;
            case 14:
                n0 n0VarG2 = n0.g();
                ClickEvent clickEvent2 = new ClickEvent("TotalAssetsServicesClick");
                p1.d dVar2 = (p1.d) obj;
                AssetsBalanceItem assetsBalanceItem2 = (AssetsBalanceItem) dVar2.f41179c;
                if (assetsBalanceItem2 != null && (str6 = assetsBalanceItem2.title) != null) {
                    str7 = str6;
                }
                n0VarG2.k(clickEvent2.add("item", str7));
                AssetsBalanceItem assetsBalanceItem3 = (AssetsBalanceItem) dVar2.f41179c;
                if (assetsBalanceItem3 != null && (str5 = assetsBalanceItem3.jumpUrl) != null) {
                    if (TextUtils.isEmpty(str5)) {
                        str5 = null;
                    }
                    if (str5 != null) {
                        if (!y.m(str5, "arouter://", false)) {
                            F.f(assetsBalanceItem3.jumpUrl, assetsBalanceItem3.jumpType, null);
                        } else {
                            ActivityUtils.startActivity(F.a(view.getContext(), str5));
                        }
                    }
                    break;
                }
                break;
            case 15:
                ((Ie.a) obj).getClass();
                break;
            case 16:
                n0.g().l("FinanceTab_USStock_Click");
                String str11 = ((v) obj).f4408d;
                if (str11 != null) {
                    i0.b0(str11);
                }
                break;
            case 17:
                n0.g().q(new ClickEvent("FinanceTab_TargetSavings_Click"));
                w wVar = (w) obj;
                String str12 = wVar.f4413d;
                if (str12 != null) {
                    View view4 = wVar.f4410a;
                    Intent intentA2 = F.a(view4 != null ? view4.getContext() : null, str12);
                    if (intentA2 != null) {
                        ActivityUtils.startActivity(intentA2);
                    }
                }
                break;
            case 18:
                ((x) obj).getClass();
                MainUtils.jumpLoginWithParam(MainUtils.MAIN_WEALTH_TAB_PATH);
                break;
            case 19:
                int i10 = ResetPinVerificationActivity.f25784i;
                ((ResetPinVerificationActivity) obj).finish();
                break;
            case 20:
                BaseCheckPinFragment.a aVar2 = BaseCheckPinFragment.f27928A;
                E activity = ((BaseCheckPinFragment) obj).getActivity();
                if (activity != null) {
                    C0521s c0521s = C0521s.f7158a;
                    C0521s.f(BaseApplication.get().getUser().getPhoneNumber());
                    activity.finish();
                }
                break;
            case 21:
                BaseVerifyFragment baseVerifyFragment = (BaseVerifyFragment) obj;
                if (baseVerifyFragment.getActivity() instanceof PayVerificationActivity) {
                    ((PayVerificationActivity) baseVerifyFragment.getActivity()).n();
                } else if (baseVerifyFragment.getActivity() != null) {
                    baseVerifyFragment.getActivity().finish();
                }
                break;
            case 22:
                CheckBankAccountOtpFragment checkBankAccountOtpFragment = (CheckBankAccountOtpFragment) obj;
                ((PayVerificationCallback) checkBankAccountOtpFragment.getActivity()).verifyPayMethod(checkBankAccountOtpFragment.f27942j.f31581d.getText().toString(), 10);
                break;
            case 23:
                CheckBankOtpFragment.a aVar3 = CheckBankOtpFragment.f27947B;
                CheckBankOtpFragment checkBankOtpFragment = (CheckBankOtpFragment) obj;
                PayVerificationCallback payVerificationCallbackU = checkBankOtpFragment.u();
                if (payVerificationCallbackU != null) {
                    AppCompatEditText appCompatEditText = (AppCompatEditText) checkBankOtpFragment.f27950o.getValue();
                    if (appCompatEditText != null && (editableText = appCompatEditText.getEditableText()) != null) {
                        string = editableText.toString();
                    }
                    payVerificationCallbackU.verifyPayMethod(string, 2);
                }
                break;
            case 24:
                CheckBankPinFragment.a aVar4 = CheckBankPinFragment.f27954A;
                CheckBankPinFragment checkBankPinFragment = (CheckBankPinFragment) obj;
                PayVerificationCallback payVerificationCallbackU2 = checkBankPinFragment.u();
                if (payVerificationCallbackU2 != null) {
                    AppCompatEditText appCompatEditTextZ = checkBankPinFragment.z();
                    payVerificationCallbackU2.verifyPayMethod(String.valueOf(appCompatEditTextZ != null ? appCompatEditTextZ.getEditableText() : null), 1);
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((CheckCVVFragment.CheckCvvDialog) obj).dismiss();
                break;
            case 26:
                CheckPalmPayOtpFragment.a aVar5 = CheckPalmPayOtpFragment.f27988o;
                CheckPalmPayOtpFragment checkPalmPayOtpFragment = (CheckPalmPayOtpFragment) obj;
                E activity2 = checkPalmPayOtpFragment.getActivity();
                if (!(activity2 instanceof PayVerificationActivity)) {
                    E activity3 = checkPalmPayOtpFragment.getActivity();
                    if (activity3 != null) {
                        activity3.finish();
                    }
                } else {
                    ((PayVerificationActivity) activity2).n();
                }
                break;
            case 27:
                CheckPostPayOtpFragment.a aVar6 = CheckPostPayOtpFragment.f28004B;
                CheckPostPayOtpFragment checkPostPayOtpFragment = (CheckPostPayOtpFragment) obj;
                checkPostPayOtpFragment.t(false);
                checkPostPayOtpFragment.showLoadingDialog(true);
                ((PayApiService) p324va.c.f43141a.f14621b).sendPostPayOtp(checkPostPayOtpFragment.f28010v).i(p071ef.b.a()).k(p298tf.f.f42629b).subscribe(new D(checkPostPayOtpFragment, 15));
                break;
            case 28:
                CheckSafetyAssessmentQAFragment.a aVar7 = CheckSafetyAssessmentQAFragment.f28014A;
                ((CheckSafetyAssessmentQAFragment) obj).z();
                break;
            default:
                IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) obj;
                if (!iconicsCheckBox.isChecked()) {
                    iconicsCheckBox.setChecked(true);
                }
                break;
        }
    }
}
