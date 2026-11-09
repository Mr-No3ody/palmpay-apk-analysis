package Ab;

import Bc.C0105b;
import Bc.C0106c;
import C0.G;
import Fe.J;
import Gb.T;
import Pa.r0;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.adjust.sdk.network.ErrorCodes;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.horcrux.svg.d0;
import com.transsnet.adsdk.widgets.banner.bannerview.BannerViewPager;
import com.transsnet.palmpay.account.bean.RealNameAuthInfoRsp;
import com.transsnet.palmpay.account.bean.ResetPinVerifyListRsp;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import com.transsnet.palmpay.account.bean.UserValidIdInfoRsp;
import com.transsnet.palmpay.account.kotlin.ui.activity.SelectResetPinVerifyTypeActivity;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification3Fragment;
import com.transsnet.palmpay.account.kotlin.ui.fragment.auth.ResetPinVerification5Fragment;
import com.transsnet.palmpay.account.ui.activity.EnableCashBoxAutoSaveActivity;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthPinFragment;
import com.transsnet.palmpay.cash_in.bean.BillDetail;
import com.transsnet.palmpay.cash_in.bean.response.BankCashInInstructionBean;
import com.transsnet.palmpay.cash_in.bean.response.FundInstructionRsp;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeUSSDResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.InterBankCashInInstructionActivity;
import com.transsnet.palmpay.cash_in.ui.view.ModelUssdInfo;
import com.transsnet.palmpay.contacts.contract.LocalContactsListContract$IView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.TransferByLoanResult;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.bean.rsp.FundOtpRsp;
import com.transsnet.palmpay.core.bean.rsp.MobileContactListResp;
import com.transsnet.palmpay.core.bean.rsp.PayFailResultAdRsp;
import com.transsnet.palmpay.core.bean.rsp.QueryMemberEmailRsp;
import com.transsnet.palmpay.core.bean.rsp.R2CUssdDialNoResp;
import com.transsnet.palmpay.core.bean.rsp.ShareAccountDetailBean;
import com.transsnet.palmpay.core.bean.rsp.WithdrawBettingOtpRsp;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckAirtimeSharePinFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBankAccountOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBettingWithdrawOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPostPayOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckUbaBankAccountOTPFragment;
import com.transsnet.palmpay.core.ui.widget.CustomFloatingView;
import com.transsnet.palmpay.core.viewmodel.FailResultPageAdView;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV2View;
import com.transsnet.palmpay.core.viewmodel.ReportTransactionItem;
import com.transsnet.palmpay.credit.bean.resp.CLInstallmentLoanMainPageResp;
import com.transsnet.palmpay.credit.bean.resp.CardRiskLevelResp;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanMainPageData;
import com.transsnet.palmpay.credit.bean.resp.LoanConfig;
import com.transsnet.palmpay.credit.bean.resp.QueryFlexiPaymentViewSwitchBean;
import com.transsnet.palmpay.credit.bean.resp.QueryFlexiPaymentViewSwitchResp;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainResp;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeSuccFragment;
import com.transsnet.palmpay.credit.view.CustomTextSwitcher;
import com.transsnet.palmpay.credit.view.FlexiPaymentMenuView;
import com.transsnet.palmpay.credit.view.FlexiUserEvaluationView;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.model.ModelAmountList;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem1;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.main.export.bean.rsp.InviteeListResp;
import com.transsnet.palmpay.mall.bean.rsp.MallPaymentOrderDetailRsp;
import com.transsnet.palmpay.mall.ui.activity.GrabOrderDetailActivity;
import com.transsnet.palmpay.mall.ui.activity.MallPaymentOrderDetailActivity;
import com.transsnet.palmpay.p2pcash.ui.atm.ReasonForCancellationPage;
import com.transsnet.palmpay.send_money.ui.fragment.QrcodeScanFragment;
import com.transsnet.palmpay.ui.dialog.EditNameDialogFragment;
import com.transsnet.palmpay.ui.dialog.MoneyRequestDialog;
import com.transsnet.palmpay.ui.mvp.contract.InviteeListContract$IView;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.observable.C1762n;
import io.reactivex.internal.operators.observable.L;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f107g;

    public /* synthetic */ D(Object obj, int i7) {
        this.f106f = i7;
        this.f107g = obj;
    }

    private final void R(Object obj) {
        C0105b c0105b;
        CommonListResultV2 commonListResultV2 = (CommonListResultV2) obj;
        if (commonListResultV2 != null) {
            if (!commonListResultV2.isSuccess()) {
                ToastUtils.showLong(commonListResultV2.getRespMsg(), new Object[0]);
                return;
            }
            if (commonListResultV2.data.isEmpty() || (c0105b = ((ResetPinVerification3Fragment) this.f107g).f25803o) == null) {
                return;
            }
            BannerViewPager bannerViewPager = (BannerViewPager) c0105b.f666f;
            try {
                bannerViewPager.setAdapter(new K8.b(0));
            } catch (Exception unused) {
            }
            bannerViewPager.setIndicatorSlideMode(3);
            bannerViewPager.setIndicatorSliderRadius(SizeUtils.dp2px(2.0f));
            bannerViewPager.setIndicatorSliderColor(bannerViewPager.getContext().getColor(L6.b.ppColorDividerLineDark), bannerViewPager.getContext().getColor(L6.b.ppColorPrimary));
            bannerViewPager.setAutoPlay(false);
            bannerViewPager.setCanLoop(false);
            bannerViewPager.setPageStyle(8);
            bannerViewPager.setPageMargin(SizeUtils.dp2px(0.0f));
            bannerViewPager.setRevealWidth(SizeUtils.dp2px(25.0f));
            bannerViewPager.create(commonListResultV2.data);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void S(Object obj) {
        CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
        ResetPinVerification5Fragment resetPinVerification5Fragment = (ResetPinVerification5Fragment) this.f107g;
        resetPinVerification5Fragment.showLoadingDialog(false);
        if (commonBeanResult != null) {
            if (!commonBeanResult.isSuccess()) {
                ToastUtils.showLong(commonBeanResult.getRespMsg(), new Object[0]);
                return;
            }
            UserValidIdInfoRsp userValidIdInfoRsp = (UserValidIdInfoRsp) commonBeanResult.data;
            if (userValidIdInfoRsp != null) {
                resetPinVerification5Fragment.f25807j = userValidIdInfoRsp;
                I8.v vVar = resetPinVerification5Fragment.f25808o;
                if (vVar != null) {
                    vVar.f4240d.setText(userValidIdInfoRsp.certificatesName);
                }
                I8.v vVar2 = resetPinVerification5Fragment.f25808o;
                if (vVar2 != null) {
                    vVar2.f4239c.setMaxLength(userValidIdInfoRsp.maxLength);
                }
                String str = userValidIdInfoRsp.rule;
                StringBuilder sb2 = new StringBuilder();
                for (int i7 = userValidIdInfoRsp.maxLength; i7 > 0; i7--) {
                    sb2.append("0");
                }
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (Pattern.matches(str, string)) {
                    String str2 = userValidIdInfoRsp.rule;
                    StringBuilder sb3 = new StringBuilder("A");
                    for (int i10 = userValidIdInfoRsp.maxLength; i10 > 1; i10--) {
                        sb3.append("0");
                    }
                    String string2 = sb3.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    if (!Pattern.matches(str2, string2)) {
                        I8.v vVar3 = resetPinVerification5Fragment.f25808o;
                        if (vVar3 != null) {
                            vVar3.f4239c.setInputType(2);
                        }
                        I8.v vVar4 = resetPinVerification5Fragment.f25808o;
                        if (vVar4 != null) {
                            vVar4.f4239c.setInputFilter(new InputFilter[]{new Tb.c(userValidIdInfoRsp.maxLength, 0)});
                            return;
                        }
                        return;
                    }
                }
                I8.v vVar5 = resetPinVerification5Fragment.f25808o;
                if (vVar5 != null) {
                    vVar5.f4239c.setInputType(1);
                }
                I8.v vVar6 = resetPinVerification5Fragment.f25808o;
                if (vVar6 != null) {
                    vVar6.f4239c.setInputFilter(new InputFilter[]{new Tb.c(userValidIdInfoRsp.maxLength, 0), new Tb.b("[`~!@#$%^&*()+=|{}':;',\\[\\].<>?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？] \n")});
                }
            }
        }
    }

    private final void T(Object obj) {
        RealNameAuthInfoRsp realNameAuthInfoRsp;
        User user = (User) obj;
        p082f9.b bVar = ((PalmPayLevelV2Activity) this.f107g).f25927d;
        if (bVar != null) {
            String mobileMoneyAccountTier = user != null ? user.getMobileMoneyAccountTier() : null;
            if (TextUtils.isEmpty(mobileMoneyAccountTier) || (realNameAuthInfoRsp = bVar.f36426d) == null) {
                return;
            }
            realNameAuthInfoRsp.mobileMoneyAccountTier = mobileMoneyAccountTier;
            bVar.g(realNameAuthInfoRsp);
        }
    }

    private final void U(Object obj) {
        File file = (File) obj;
        SetUserPhotoActivity setUserPhotoActivity = (SetUserPhotoActivity) this.f107g;
        if (!setUserPhotoActivity.bOriginPhoto) {
            setUserPhotoActivity.uploadFile(file);
        } else {
            setUserPhotoActivity.setResult("", file);
            setUserPhotoActivity.finish();
        }
    }

    private final void V(Object obj) {
        CommonStringResult commonStringResult = (CommonStringResult) obj;
        boolean zIsSuccess = commonStringResult.isSuccess();
        AuthPinFragment authPinFragment = (AuthPinFragment) this.f107g;
        if (zIsSuccess) {
            authPinFragment.t(commonStringResult.data, null);
            return;
        }
        PinEntryView pinEntryView = authPinFragment.f26095i;
        if (pinEntryView != null) {
            pinEntryView.b();
        }
        authPinFragment.u(commonStringResult.getRespMsg());
    }

    private final void W(Object obj) {
        MobileContactListResp mobileContactListResp = (MobileContactListResp) obj;
        IBaseView iBaseView = ((U9.a) this.f107g).f27351a;
        if (iBaseView != null) {
            ((LocalContactsListContract$IView) iBaseView).showPhoneContactResp(mobileContactListResp);
        }
    }

    private final void X(Object obj) {
        PayFailResultAdRsp payFailResultAdRsp = (PayFailResultAdRsp) obj;
        if (payFailResultAdRsp == null || !payFailResultAdRsp.isSuccess()) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(payFailResultAdRsp.data);
        FailResultPageAdView failResultPageAdView = (FailResultPageAdView) this.f107g;
        if (zIsEmpty) {
            failResultPageAdView.setVisibility(8);
        } else {
            failResultPageAdView.setVisibility(0);
            failResultPageAdView.setSlotId(payFailResultAdRsp.data);
        }
    }

    private final void Y(Object obj) {
        QueryMemberEmailRsp queryMemberEmailRsp = (QueryMemberEmailRsp) obj;
        boolean zIsSuccess = queryMemberEmailRsp.isSuccess();
        OneTimeCodeV2View oneTimeCodeV2View = (OneTimeCodeV2View) this.f107g;
        if (!zIsSuccess || TextUtils.isEmpty(queryMemberEmailRsp.data)) {
            oneTimeCodeV2View.f28463v = false;
        } else {
            oneTimeCodeV2View.f28464w = queryMemberEmailRsp.data;
            oneTimeCodeV2View.f28463v = true;
        }
        int i7 = OneTimeCodeV2View.f28450B;
        oneTimeCodeV2View.c();
    }

    @Override // Z4.e, io.reactivex.Observer
    public void onComplete() {
        switch (this.f106f) {
            case 26:
                IBaseView iBaseView = ((U9.a) this.f107g).f27351a;
                if (iBaseView != null) {
                    ((LocalContactsListContract$IView) iBaseView).complete();
                }
                break;
            default:
                super.onComplete();
                break;
        }
    }

    @Override // Z4.e, io.reactivex.Observer
    public void onError(Throwable th) {
        switch (this.f106f) {
            case 13:
                super.onError(th);
                ToastUtils.showLong(th.getMessage());
                break;
            case 14:
                super.onError(th);
                ((CheckBettingWithdrawOtpFragment) this.f107g).showLoadingDialog(false);
                ToastUtils.showLong(th.getMessage());
                break;
            default:
                super.onError(th);
                break;
        }
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f106f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CLInstallmentUpGradeSuccFragment) this.f107g).f(d2);
                break;
            case 1:
                EditNameDialogFragment editNameDialogFragment = (EditNameDialogFragment) this.f107g;
                if (editNameDialogFragment.f35050c == null) {
                    editNameDialogFragment.f35050c = new p103gf.a();
                }
                editNameDialogFragment.f35050c.add(d2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(d2, "disposable");
                ((MoneyRequestDialog) this.f107g).addSubscription(d2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "disposable");
                ((RechargeUSSDResultActivity) this.f107g).addSubscription(d2);
                break;
            case 4:
                ((QrcodeScanFragment) this.f107g).f(d2);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((InterBankCashInInstructionActivity) this.f107g).addSubscription(d2);
                break;
            case 6:
                ((J) this.f107g).addSubscription(d2);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(d2, "d");
                p103gf.a mCompositeDisposableNet = ((FlexiPaymentMenuView) this.f107g).getMCompositeDisposableNet();
                if (mCompositeDisposableNet != null) {
                    mCompositeDisposableNet.add(d2);
                }
                break;
            case 8:
                Intrinsics.checkNotNullParameter(d2, "d");
                p103gf.a mCompositeDisposableNet2 = ((FlexiUserEvaluationView) this.f107g).getMCompositeDisposableNet();
                if (mCompositeDisposableNet2 != null) {
                    mCompositeDisposableNet2.add(d2);
                }
                break;
            case 9:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((GrabOrderDetailActivity) this.f107g).addSubscription(d2);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((MallPaymentOrderDetailActivity) this.f107g).addSubscription(d2);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((SelectResetPinVerifyTypeActivity) this.f107g).addSubscription(d2);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CheckAirtimeSharePinFragment) this.f107g).f(d2);
                break;
            case 13:
                ((CheckBankAccountOtpFragment) this.f107g).f(d2);
                break;
            case 14:
                ((CheckBettingWithdrawOtpFragment) this.f107g).f(d2);
                break;
            case 15:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CheckPostPayOtpFragment) this.f107g).f(d2);
                break;
            case 16:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CheckUbaBankAccountOTPFragment) this.f107g).f(d2);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((ResetPinVerification3Fragment) this.f107g).f(d2);
                break;
            case 18:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((ResetPinVerification5Fragment) this.f107g).f(d2);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((EnableCashBoxAutoSaveActivity) this.f107g).addSubscription(d2);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((IdentityVerificationActivity) this.f107g).addSubscription(d2);
                break;
            case 21:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((PalmPayLevelUpTier3V2Activity) this.f107g).addSubscription(d2);
                break;
            case 22:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((PalmPayLevelV2Activity) this.f107g).addSubscription(d2);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((SetUserPhotoActivity) this.f107g).addSubscription(d2);
                break;
            case 24:
                Intrinsics.checkNotNullParameter(d2, "d");
                p103gf.a aVar = ((CustomFloatingView) this.f107g).f28118A;
                if (aVar != null) {
                    aVar.add(d2);
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((AuthPinFragment) this.f107g).f(d2);
                break;
            case 26:
                ((U9.a) this.f107g).addSubscription(d2);
                break;
            case 27:
                Intrinsics.checkNotNullParameter(d2, "d");
                break;
            case 28:
                OneTimeCodeV2View oneTimeCodeV2View = (OneTimeCodeV2View) this.f107g;
                if (oneTimeCodeV2View.t == null) {
                    oneTimeCodeV2View.t = new p103gf.a();
                }
                oneTimeCodeV2View.t.add(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((ReasonForCancellationPage) this.f107g).addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f106f) {
            case 0:
                ((CLInstallmentUpGradeSuccFragment) this.f107g).showLoadingDialog(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 1:
                ToastUtils.showLong(message);
                ((EditNameDialogFragment) this.f107g).dismissAllowingStateLoss();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(message, "message");
                ((RechargeUSSDResultActivity) this.f107g).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 4:
                ((QrcodeScanFragment) this.f107g).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(message, "message");
                ((InterBankCashInInstructionActivity) this.f107g).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 6:
                IBaseView iBaseView = ((J) this.f107g).f27351a;
                if (iBaseView != null) {
                    ((InviteeListContract$IView) iBaseView).showError(message);
                }
                break;
            case 7:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                p220oa.h.s((FlexiPaymentMenuView) this.f107g, false);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                FrameLayout frameLayout = ((FlexiUserEvaluationView) this.f107g).f30764e;
                if (frameLayout != null) {
                    p220oa.h.s(frameLayout, false);
                }
                break;
            case 9:
                ((GrabOrderDetailActivity) this.f107g).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 10:
                ((MallPaymentOrderDetailActivity) this.f107g).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 11:
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(message, "message");
                CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = (CheckAirtimeSharePinFragment) this.f107g;
                checkAirtimeSharePinFragment.showLoadingDialog(false);
                p220oa.h.y(checkAirtimeSharePinFragment, message);
                break;
            case 13:
                ToastUtils.showLong(message);
                break;
            case 14:
                ((CheckBettingWithdrawOtpFragment) this.f107g).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 15:
                ((CheckPostPayOtpFragment) this.f107g).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 16:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                ((CheckUbaBankAccountOTPFragment) this.f107g).showLoadingDialog(false);
                break;
            case 17:
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 18:
                ((ResetPinVerification5Fragment) this.f107g).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(message, "message");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 21:
                Intrinsics.checkNotNullParameter(message, "message");
                break;
            case 22:
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 23:
                Intrinsics.checkNotNullParameter(message, "message");
                SetUserPhotoActivity.gotoFail$default((SetUserPhotoActivity) this.f107g, null, 1, null);
                break;
            case 24:
                Intrinsics.checkNotNullParameter(message, "message");
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                AuthPinFragment authPinFragment = (AuthPinFragment) this.f107g;
                PinEntryView pinEntryView = authPinFragment.f26095i;
                if (pinEntryView != null) {
                    pinEntryView.b();
                }
                authPinFragment.u(message);
                break;
            case 26:
                IBaseView iBaseView2 = ((U9.a) this.f107g).f27351a;
                if (iBaseView2 != null) {
                    ((LocalContactsListContract$IView) iBaseView2).showContactError(message);
                }
                break;
            case 27:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 28:
                ToastUtils.showLong(message);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "msg");
                ((ReasonForCancellationPage) this.f107g).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        String loanRatio;
        LoanConfig loanConfig;
        LoanConfig loanConfig2;
        CardRiskLevelResp riskLevelResp;
        LoanConfig loanConfig3;
        CardRiskLevelResp riskLevelResp2;
        LoanConfig loanConfig4;
        CardRiskLevelResp riskLevelResp3;
        LoanConfig loanConfig5;
        LoanConfig loanConfig6;
        LoanConfig loanConfig7;
        Long availableAmount;
        LoanConfig loanConfig8;
        CardRiskLevelResp riskLevelResp4;
        LoanConfig loanConfig9;
        List<BankCashInInstructionBean> list;
        Boolean dataSwitch;
        ModelBillDetailTextItem1 modelBillDetailTextItem1;
        TextView textView;
        ModelBillDetailTextItem1 modelBillDetailTextItem2;
        ModelBillDetailTextItem1 modelBillDetailTextItem3;
        ModelBillDetailTextItem1 modelBillDetailTextItem4;
        TextView textView2;
        ModelBillDetailTextItem1 modelBillDetailTextItem5;
        ModelBillDetailTextItem1 modelBillDetailTextItem6;
        TextView textView3;
        ModelBillDetailTextItem1 modelBillDetailTextItem7;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        ModelBillDetailTextItem1 modelBillDetailTextItem8;
        ModelBillDetailTextItem1 modelBillDetailTextItem9;
        ModelBillDetailTextItem1 modelBillDetailTextItem10;
        ModelBillDetailTextItem1 modelBillDetailTextItem11;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        J8.b bVar;
        List list2;
        List list3;
        T t;
        int i7 = 7;
        int i10 = 3;
        int i11 = 2;
        int i12 = 4;
        boolean z3 = true;
        z3 = true;
        boolean zBooleanValue = false;
        zBooleanValue = false;
        Object obj2 = this.f107g;
        switch (this.f106f) {
            case 0:
                Pair pair = (Pair) obj;
                CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = (CLInstallmentUpGradeSuccFragment) obj2;
                cLInstallmentUpGradeSuccFragment.showLoadingDialog(false);
                CLMainResp cLMainResp = pair != null ? (CLMainResp) pair.f38891a : null;
                CLInstallmentLoanMainPageResp cLInstallmentLoanMainPageResp = pair != null ? (CLInstallmentLoanMainPageResp) pair.f38892b : null;
                if (cLInstallmentLoanMainPageResp == null || !cLInstallmentLoanMainPageResp.isSuccess()) {
                    ToastUtils.showShort(cLInstallmentLoanMainPageResp != null ? cLInstallmentLoanMainPageResp.getRespMsg() : null, new Object[0]);
                } else {
                    TextView textView10 = (TextView) cLInstallmentUpGradeSuccFragment.f30609X.getValue();
                    if (textView10 != null) {
                        SpannableStringBuilder spannableStringBuilderB = p220oa.h.B("Daily Interest", null, Integer.valueOf(Color.parseColor("#202046")), null, null, "sans-serif-black", null, 1005);
                        InstallmentLoanMainPageData data = cLInstallmentLoanMainPageResp.getData();
                        textView10.setText(spannableStringBuilderB.append((CharSequence) p220oa.h.B(G.o(" ", (data == null || (loanConfig9 = data.getLoanConfig()) == null) ? null : loanConfig9.getLoanRatioString()), null, null, Integer.valueOf(Ya.b.cs_overdue_today_txt_color), null, "sans-serif-black", null, ErrorCodes.MALFORMED_URL_EXCEPTION)));
                    }
                    TextView textView11 = (TextView) cLInstallmentUpGradeSuccFragment.f30607M.getValue();
                    if (textView11 != null) {
                        SpannableStringBuilder spannableStringBuilderB2 = p220oa.h.B("Get money at once, repay in ", null, Integer.valueOf(Color.parseColor("#906948")), null, null, null, null, 1021);
                        InstallmentLoanMainPageData data2 = cLInstallmentLoanMainPageResp.getData();
                        textView11.setText(spannableStringBuilderB2.append((CharSequence) p220oa.h.B(((data2 == null || (loanConfig8 = data2.getLoanConfig()) == null || (riskLevelResp4 = loanConfig8.getRiskLevelResp()) == null) ? null : riskLevelResp4.getTerm()) + " terms", null, null, Integer.valueOf(Ya.b.cs_overdue_today_txt_color), null, null, null, 1019)));
                    }
                    TextView textView12 = (TextView) cLInstallmentUpGradeSuccFragment.f30606L.getValue();
                    if (textView12 != null) {
                        InstallmentLoanMainPageData data3 = cLInstallmentLoanMainPageResp.getData();
                        String strF = r0.F((data3 == null || (loanConfig7 = data3.getLoanConfig()) == null || (availableAmount = loanConfig7.getAvailableAmount()) == null) ? 0L : availableAmount.longValue());
                        Intrinsics.checkNotNullExpressionValue(strF, "getAmountThousandNoPointWithCurrency(...)");
                        textView12.setText(p220oa.h.B(strF, null, null, null, 32, null, null, 919));
                    }
                    TextView textView13 = (TextView) cLInstallmentUpGradeSuccFragment.f30605H.getValue();
                    if (textView13 != null) {
                        InstallmentLoanMainPageData data4 = cLInstallmentLoanMainPageResp.getData();
                        textView13.setText(p220oa.h.B(String.valueOf((data4 == null || (loanConfig6 = data4.getLoanConfig()) == null) ? null : loanConfig6.getMaxLoanDays()), null, null, null, 32, null, null, 919).append((CharSequence) p220oa.h.B(" Days", null, null, null, 12, null, null, 1015)));
                    }
                    TextView textView14 = (TextView) cLInstallmentUpGradeSuccFragment.f30604C.getValue();
                    if (textView14 != null) {
                        InstallmentLoanMainPageData data5 = cLInstallmentLoanMainPageResp.getData();
                        textView14.setText(((data5 == null || (loanConfig5 = data5.getLoanConfig()) == null) ? null : loanConfig5.getMaxLoanDays()) + " Days");
                    }
                    TextView textView15 = (TextView) cLInstallmentUpGradeSuccFragment.f30603B.getValue();
                    if (textView15 != null) {
                        InstallmentLoanMainPageData data6 = cLInstallmentLoanMainPageResp.getData();
                        textView15.setText(((data6 == null || (loanConfig4 = data6.getLoanConfig()) == null || (riskLevelResp3 = loanConfig4.getRiskLevelResp()) == null) ? null : riskLevelResp3.getTerm()) + " terms");
                    }
                    TextView textView16 = (TextView) cLInstallmentUpGradeSuccFragment.f30618w.getValue();
                    if (textView16 != null) {
                        InstallmentLoanMainPageData data7 = cLInstallmentLoanMainPageResp.getData();
                        textView16.setText(String.valueOf((data7 == null || (loanConfig3 = data7.getLoanConfig()) == null || (riskLevelResp2 = loanConfig3.getRiskLevelResp()) == null) ? null : riskLevelResp2.getTermSpan()));
                    }
                    TextView textView17 = (TextView) cLInstallmentUpGradeSuccFragment.f30602A.getValue();
                    if (textView17 != null) {
                        InstallmentLoanMainPageData data8 = cLInstallmentLoanMainPageResp.getData();
                        textView17.setText(Intrinsics.c((data8 == null || (loanConfig2 = data8.getLoanConfig()) == null || (riskLevelResp = loanConfig2.getRiskLevelResp()) == null) ? null : riskLevelResp.getTermSpanUnit(), "D") ? " Days/term" : "Month/term");
                    }
                    TextView textView18 = (TextView) cLInstallmentUpGradeSuccFragment.f30617v.getValue();
                    if (textView18 != null) {
                        p220oa.h.l(new A(cLInstallmentUpGradeSuccFragment, true ? 1 : 0), textView18);
                    }
                    LinearLayout linearLayout = (LinearLayout) cLInstallmentUpGradeSuccFragment.t.getValue();
                    if (linearLayout != null) {
                        p220oa.h.l(new A8.b(cLInstallmentLoanMainPageResp, i10), linearLayout);
                    }
                    CLMainData data9 = cLMainResp != null ? cLMainResp.getData() : null;
                    InstallmentLoanMainPageData data10 = cLInstallmentLoanMainPageResp.getData();
                    if (data10 == null || (loanConfig = data10.getLoanConfig()) == null || (loanRatio = loanConfig.getLoanRatio()) == null) {
                        loanRatio = IdManager.DEFAULT_VERSION_NAME;
                    }
                    p221ob.c.f40268a.getInstance().getClass();
                    p221ob.c.a().queryCashInfo(7).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new E(cLInstallmentUpGradeSuccFragment, loanRatio, data9, data10));
                }
                F6.d.h(cLInstallmentUpGradeSuccFragment.f27317a, 3, "countDownForBorrow");
                p161kf.e eVar = cLInstallmentUpGradeSuccFragment.f30616p0;
                if (eVar != null) {
                    p001if.a.a(eVar);
                }
                io.reactivex.internal.operators.observable.y yVarG = df.d.g(0L, 1L, TimeUnit.SECONDS, p071ef.b.a());
                A8.a aVar = new A8.a(new B(false ? 1 : 0), i12);
                p161kf.e eVar2 = new p161kf.e(new A8.a(new C(cLInstallmentUpGradeSuccFragment, false ? 1 : 0), 5), new A8.a(new B(true ? 1 : 0), 6), new A8.a(cLInstallmentUpGradeSuccFragment, i7));
                try {
                    try {
                        yVarG.subscribe(new L(new C1762n(eVar2, aVar, 1)));
                        cLInstallmentUpGradeSuccFragment.f30616p0 = eVar2;
                        return;
                    } catch (NullPointerException e10) {
                        throw e10;
                    } catch (Throwable th) {
                        D3.a.H(th);
                        org.chromium.support_lib_boundary.util.b.V(th);
                        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                        nullPointerException.initCause(th);
                        throw nullPointerException;
                    }
                } catch (NullPointerException e11) {
                    throw e11;
                } catch (Throwable th2) {
                    D3.a.H(th2);
                    org.chromium.support_lib_boundary.util.b.V(th2);
                    NullPointerException nullPointerException2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                    nullPointerException2.initCause(th2);
                    throw nullPointerException2;
                }
            case 1:
                CommonResult commonResult = (CommonResult) obj;
                EditNameDialogFragment editNameDialogFragment = (EditNameDialogFragment) obj2;
                if (commonResult.isSuccess()) {
                    if (editNameDialogFragment.f35049b) {
                        ToastUtils.showShort(com.transsnet.palmpay.custom_view.v.cv_operation_success);
                    } else if (!editNameDialogFragment.isDetached() && !editNameDialogFragment.isRemoving() && editNameDialogFragment.isVisible()) {
                        d0.g(1, "/core/common_result", "extra_result").withString("extra_title", editNameDialogFragment.getString(Ac.h.main_name_change_submitted)).withString("extra_message", editNameDialogFragment.getString(Ac.h.main_msg_name_change_submitted)).withString("extra_Btn1Text", editNameDialogFragment.getString(p025ba.k.core_complete)).withInt("extra_Btn1Text_action", 1).navigation();
                    }
                    p156ka.a userDataSource = BaseApplication.getInstance().getUserDataSource();
                    User user = editNameDialogFragment.f35048a;
                    userDataSource.getClass();
                    p156ka.a.c(user);
                    G.u(4, org.greenrobot.eventbus.c.b());
                } else {
                    if (editNameDialogFragment.f35049b) {
                        editNameDialogFragment.g(commonResult.getRespMsg(), true);
                        return;
                    }
                    ToastUtils.showLong(commonResult.getRespMsg());
                }
                editNameDialogFragment.dismissAllowingStateLoss();
                return;
            case 2:
                ((MoneyRequestDialog) obj2).dismiss();
                return;
            case 3:
                CommonBeanResult response = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                RechargeUSSDResultActivity rechargeUSSDResultActivity = (RechargeUSSDResultActivity) obj2;
                rechargeUSSDResultActivity.showLoadingDialog(false);
                if (!response.isSuccess() || response.data == 0) {
                    return;
                }
                int i13 = RechargeUSSDResultActivity.f26885p;
                Object value = rechargeUSSDResultActivity.f26890e.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setText(r0.B(((BillDetail) response.data).totalAmount, false));
                p355xf.t tVar = rechargeUSSDResultActivity.f26889d;
                Object value2 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((ModelItemFee) value2).setContent(r0.B(((BillDetail) response.data).businessAmount, false));
                p355xf.t tVar2 = rechargeUSSDResultActivity.f26888c;
                Object value3 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                BillDetail billDetail = (BillDetail) response.data;
                ((ModelItemFee) value3).setContent(r0.B(billDetail.payFee + billDetail.vat, false));
                if (((BillDetail) response.data).feeDetailList != null) {
                    Object value4 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                    ((ModelItemFee) value4).setFeeDetails(((BillDetail) response.data).feeDetailList);
                }
                p355xf.t tVar3 = rechargeUSSDResultActivity.f26887b;
                Object value5 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((ModelItemFee) value5).setContent("P" + r0.E(((BillDetail) response.data).loyaltyAmount) + " = " + r0.B(((BillDetail) response.data).loyaltyAmount, false));
                Object value6 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                p220oa.h.s((ModelItemFee) value6, ((BillDetail) response.data).loyaltyAmount > 0);
                Object value7 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                ModelItemFee modelItemFee = (ModelItemFee) value7;
                BillDetail billDetail2 = (BillDetail) response.data;
                p220oa.h.s(modelItemFee, billDetail2.payFee + billDetail2.vat > 0 || billDetail2.loyaltyAmount > 0);
                Object value8 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                ModelItemFee modelItemFee2 = (ModelItemFee) value8;
                BillDetail billDetail3 = (BillDetail) response.data;
                if (billDetail3.payFee + billDetail3.vat <= 0 && billDetail3.loyaltyAmount <= 0) {
                    z3 = false;
                }
                p220oa.h.s(modelItemFee2, z3);
                Object value9 = rechargeUSSDResultActivity.f26886a.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                ModelUssdInfo modelUssdInfo = (ModelUssdInfo) value9;
                Long l5 = ((BillDetail) response.data).rechargePINExpireTime;
                modelUssdInfo.f(l5 != null ? l5.longValue() : System.currentTimeMillis() + 300000);
                return;
            case 4:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                ((QrcodeScanFragment) obj2).showLoadingDialog(false);
                if (!commonBeanResult.isSuccess()) {
                    ToastUtils.showLong(commonBeanResult.getRespMsg());
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("core_order_source_type", "SCAN");
                bundle.putString("MEMBER_ID", ((ShareAccountDetailBean) commonBeanResult.data).getMemberId());
                r0.O0(((ShareAccountDetailBean) commonBeanResult.data).getTransType(), Integer.valueOf(((ShareAccountDetailBean) commonBeanResult.data).getBusinessType()), ((ShareAccountDetailBean) commonBeanResult.data).getAccountNo(), bundle);
                return;
            case 5:
                CommonBeanResult response2 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                InterBankCashInInstructionActivity interBankCashInInstructionActivity = (InterBankCashInInstructionActivity) obj2;
                interBankCashInInstructionActivity.showLoadingDialog(false);
                if (!response2.isSuccess()) {
                    O6.c cVar = new O6.c(interBankCashInInstructionActivity);
                    cVar.e(p025ba.k.core_title_error_info);
                    cVar.f6598d = response2.getRespMsg();
                    cVar.d(p025ba.k.core_try_again, new D9.f(interBankCashInInstructionActivity, i11));
                    cVar.c(p025ba.k.core_cancel, null);
                    cVar.g();
                    return;
                }
                FundInstructionRsp fundInstructionRsp = (FundInstructionRsp) response2.data;
                InterBankCashInInstructionActivity.a aVar2 = InterBankCashInInstructionActivity.f26981p;
                if (fundInstructionRsp == null || (list = fundInstructionRsp.fundInstructionList) == null) {
                    return;
                }
                D9.h hVar = interBankCashInInstructionActivity.f26990j;
                if (hVar != null) {
                    hVar.f4985b = list;
                }
                if (hVar != null) {
                    hVar.notifyDataSetChanged();
                    return;
                }
                return;
            case 6:
                InviteeListResp inviteeListResp = (InviteeListResp) obj;
                IBaseView iBaseView = ((J) obj2).f27351a;
                if (iBaseView != null) {
                    ((InviteeListContract$IView) iBaseView).showInviteeListResp(inviteeListResp);
                    return;
                }
                return;
            case 7:
                QueryFlexiPaymentViewSwitchResp response3 = (QueryFlexiPaymentViewSwitchResp) obj;
                Intrinsics.checkNotNullParameter(response3, "response");
                if (!response3.isSuccess()) {
                    ToastUtils.showShort(response3.getRespMsg(), new Object[0]);
                    return;
                }
                QueryFlexiPaymentViewSwitchBean data11 = response3.getData();
                if (data11 != null && (dataSwitch = data11.getDataSwitch()) != null) {
                    zBooleanValue = dataSwitch.booleanValue();
                }
                p220oa.h.s((FlexiPaymentMenuView) obj2, zBooleanValue);
                return;
            case 8:
                CommonBeanResult response4 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(response4, "response");
                FlexiUserEvaluationView flexiUserEvaluationView = (FlexiUserEvaluationView) obj2;
                FrameLayout frameLayout = flexiUserEvaluationView.f30764e;
                if (frameLayout != null) {
                    ArrayList arrayList = (ArrayList) response4.data;
                    p220oa.h.s(frameLayout, (arrayList != null ? arrayList.size() : 0) > 0);
                }
                if ((!response4.isSuccess() ? (char) 0 : (char) 1) == 0) {
                    ToastUtils.showShort(response4.getRespMsg(), new Object[0]);
                    return;
                }
                CustomTextSwitcher customTextSwitcher = flexiUserEvaluationView.f30768j;
                if (customTextSwitcher != null) {
                    customTextSwitcher.setInAnimation(AnimationUtils.loadAnimation(customTextSwitcher.getContext(), Ya.a.cs_animation_down_up_in_animation));
                    customTextSwitcher.setOutAnimation(AnimationUtils.loadAnimation(customTextSwitcher.getContext(), Ya.a.cs_animation_down_up_out_animation));
                    ArrayList<String> data12 = (ArrayList) response4.data;
                    if (data12 == null) {
                        data12 = new ArrayList<>();
                    }
                    Intrinsics.checkNotNullParameter(data12, "data");
                    customTextSwitcher.setMData(data12);
                    customTextSwitcher.f30732b = 3000L;
                    if (customTextSwitcher.getMData() == null || customTextSwitcher.getMData().size() == 0) {
                        throw new RuntimeException("data is empty");
                    }
                    customTextSwitcher.f30734d.sendEmptyMessage(0);
                    return;
                }
                return;
            case 9:
                CommonBeanResult commonBeanResult2 = (CommonBeanResult) obj;
                GrabOrderDetailActivity grabOrderDetailActivity = (GrabOrderDetailActivity) obj2;
                grabOrderDetailActivity.showLoadingDialog(false);
                if (commonBeanResult2 != null) {
                    if (!commonBeanResult2.isSuccess()) {
                        ToastUtils.showLong(commonBeanResult2.getRespMsg(), new Object[0]);
                        return;
                    }
                    MallPaymentOrderDetailRsp mallPaymentOrderDetailRsp = (MallPaymentOrderDetailRsp) commonBeanResult2.data;
                    Bc.f fVar = grabOrderDetailActivity.f32001b;
                    if (fVar != null && (textView6 = ((ModelBillDetailTitle) fVar.f699e).f31467d) != null) {
                        G.x("-", r0.A(mallPaymentOrderDetailRsp.payAmount), textView6);
                    }
                    Bc.f fVar2 = grabOrderDetailActivity.f32001b;
                    if (fVar2 != null && (textView5 = ((ModelBillDetailTitle) fVar2.f699e).f31468e) != null) {
                        textView5.setText(mallPaymentOrderDetailRsp.orderStatusDesc);
                    }
                    Bc.f fVar3 = grabOrderDetailActivity.f32001b;
                    if (fVar3 != null && (modelBillDetailTextItem7 = ((ModelAmountList) fVar3.f698d).f31430c) != null && (textView4 = modelBillDetailTextItem7.f31455d) != null) {
                        textView4.setText(r0.B(mallPaymentOrderDetailRsp.orderAmount, false));
                    }
                    Bc.f fVar4 = grabOrderDetailActivity.f32001b;
                    if (fVar4 != null && (modelBillDetailTextItem6 = ((ModelAmountList) fVar4.f698d).f31432e) != null && (textView3 = modelBillDetailTextItem6.f31455d) != null) {
                        textView3.setText(r0.B(mallPaymentOrderDetailRsp.payFee, false));
                    }
                    Bc.f fVar5 = grabOrderDetailActivity.f32001b;
                    if (fVar5 != null && (modelBillDetailTextItem5 = ((ModelAmountList) fVar5.f698d).f31432e) != null) {
                        modelBillDetailTextItem5.setTips(r0.W(grabOrderDetailActivity, mallPaymentOrderDetailRsp.payFee));
                    }
                    Bc.f fVar6 = grabOrderDetailActivity.f32001b;
                    if (fVar6 != null && (modelBillDetailTextItem4 = ((ModelAmountList) fVar6.f698d).f31440w) != null && (textView2 = modelBillDetailTextItem4.f31455d) != null) {
                        textView2.setText(r0.B(mallPaymentOrderDetailRsp.payAmount, false));
                    }
                    if (mallPaymentOrderDetailRsp.couponAmount > 0) {
                        Bc.f fVar7 = grabOrderDetailActivity.f32001b;
                        if (fVar7 != null && (modelBillDetailTextItem3 = ((ModelAmountList) fVar7.f698d).f31437o) != null) {
                            modelBillDetailTextItem3.setVisibility(0);
                        }
                        Bc.f fVar8 = grabOrderDetailActivity.f32001b;
                        if (fVar8 != null && (modelBillDetailTextItem2 = ((ModelAmountList) fVar8.f698d).f31437o) != null) {
                            modelBillDetailTextItem2.setContent("- " + r0.B(mallPaymentOrderDetailRsp.couponAmount, true));
                        }
                    } else {
                        Bc.f fVar9 = grabOrderDetailActivity.f32001b;
                        if (fVar9 != null && (modelBillDetailTextItem1 = ((ModelAmountList) fVar9.f698d).f31437o) != null) {
                            modelBillDetailTextItem1.setVisibility(8);
                        }
                    }
                    Bc.f fVar10 = grabOrderDetailActivity.f32001b;
                    if (fVar10 != null && (textView = ((ModelTitleContentImg) fVar10.f700f).f31588d) != null) {
                        textView.setText(Fc.d.ma_ten_deals);
                    }
                    Bc.f fVar11 = grabOrderDetailActivity.f32001b;
                    r0.S1(fVar11 != null ? (ModelTitleContentImg) fVar11.f702i : null, mallPaymentOrderDetailRsp.payerAccountType, mallPaymentOrderDetailRsp.payerBankName, mallPaymentOrderDetailRsp.payerBankUrl, mallPaymentOrderDetailRsp.payerCardNo);
                    Bc.f fVar12 = grabOrderDetailActivity.f32001b;
                    if (fVar12 != null) {
                        ((ModelCopyableText) fVar12.f696b).setMessage(mallPaymentOrderDetailRsp.orderNo);
                    }
                    Bc.f fVar13 = grabOrderDetailActivity.f32001b;
                    if (fVar13 != null) {
                        ((TextView) fVar13.f703j).setText(grabOrderDetailActivity.getString(p025ba.k.core_transaction_date, r0.Q(mallPaymentOrderDetailRsp.createTime)));
                    }
                    Bc.f fVar14 = grabOrderDetailActivity.f32001b;
                    if (fVar14 != null) {
                        ((TextView) fVar14.f701g).setText(grabOrderDetailActivity.getString(p025ba.k.core_post_date, r0.Q(mallPaymentOrderDetailRsp.paySuccessTime)));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                CommonBeanResult commonBeanResult3 = (CommonBeanResult) obj;
                MallPaymentOrderDetailActivity mallPaymentOrderDetailActivity = (MallPaymentOrderDetailActivity) obj2;
                mallPaymentOrderDetailActivity.showLoadingDialog(false);
                if (commonBeanResult3 != null) {
                    if (!commonBeanResult3.isSuccess()) {
                        ToastUtils.showLong(commonBeanResult3.getRespMsg(), new Object[0]);
                        return;
                    }
                    T data13 = commonBeanResult3.data;
                    Intrinsics.checkNotNullExpressionValue(data13, "data");
                    MallPaymentOrderDetailRsp mallPaymentOrderDetailRsp2 = (MallPaymentOrderDetailRsp) data13;
                    C0106c c0106c = mallPaymentOrderDetailActivity.f32006d;
                    if (c0106c != null && (textView9 = ((ModelBillDetailTitle) c0106c.f678p).f31467d) != null) {
                        G.x("-", r0.A(mallPaymentOrderDetailRsp2.payAmount), textView9);
                    }
                    C0106c c0106c2 = mallPaymentOrderDetailActivity.f32006d;
                    if (c0106c2 != null && (textView8 = ((ModelBillDetailTitle) c0106c2.f678p).f31468e) != null) {
                        textView8.setText(mallPaymentOrderDetailRsp2.orderStatusDesc);
                    }
                    C0106c c0106c3 = mallPaymentOrderDetailActivity.f32006d;
                    if (c0106c3 != null && (modelBillDetailTextItem11 = ((ModelAmountList) c0106c3.f670c).f31430c) != null && (textView7 = modelBillDetailTextItem11.f31455d) != null) {
                        textView7.setText(r0.B(mallPaymentOrderDetailRsp2.orderAmount, false));
                    }
                    C0106c c0106c4 = mallPaymentOrderDetailActivity.f32006d;
                    if (c0106c4 != null && (modelBillDetailTextItem10 = ((ModelAmountList) c0106c4.f670c).f31432e) != null) {
                        modelBillDetailTextItem10.setContent(r0.B(mallPaymentOrderDetailRsp2.payFee, false));
                    }
                    C0106c c0106c5 = mallPaymentOrderDetailActivity.f32006d;
                    if (c0106c5 != null && (modelBillDetailTextItem9 = ((ModelAmountList) c0106c5.f670c).f31432e) != null) {
                        modelBillDetailTextItem9.setTips(r0.W(mallPaymentOrderDetailActivity, 0L));
                    }
                    C0106c c0106c6 = mallPaymentOrderDetailActivity.f32006d;
                    if (c0106c6 != null && (modelBillDetailTextItem8 = ((ModelAmountList) c0106c6.f670c).f31440w) != null) {
                        modelBillDetailTextItem8.setContent(r0.B(mallPaymentOrderDetailRsp2.payAmount, false));
                    }
                    C0106c c0106c7 = mallPaymentOrderDetailActivity.f32006d;
                    if (c0106c7 != null) {
                        ((ModelTitleContentImg) c0106c7.f673f).setVisibility(0);
                    }
                    C0106c c0106c8 = mallPaymentOrderDetailActivity.f32006d;
                    r0.S1(c0106c8 != null ? (ModelTitleContentImg) c0106c8.f673f : null, mallPaymentOrderDetailRsp2.payerAccountType, mallPaymentOrderDetailRsp2.payerBankName, mallPaymentOrderDetailRsp2.payerBankUrl, mallPaymentOrderDetailRsp2.payerCardNo);
                    if (!TextUtils.isEmpty(mallPaymentOrderDetailRsp2.errorMessage)) {
                        TextView textView19 = mallPaymentOrderDetailActivity.f32004b;
                        if (textView19 != null) {
                            textView19.setText(mallPaymentOrderDetailRsp2.errorMessage);
                        }
                        View view = mallPaymentOrderDetailActivity.f32005c;
                        if (view != null) {
                            view.setVisibility(0);
                        }
                    }
                    C0106c c0106c9 = mallPaymentOrderDetailActivity.f32006d;
                    if (c0106c9 != null) {
                        ((ModelCopyableText) c0106c9.t).setMessage(mallPaymentOrderDetailRsp2.orderNo);
                    }
                    C0106c c0106c10 = mallPaymentOrderDetailActivity.f32006d;
                    if (c0106c10 != null) {
                        ((TextView) c0106c10.f672e).setText(mallPaymentOrderDetailActivity.getString(p025ba.k.core_transaction_date, r0.Q(mallPaymentOrderDetailRsp2.createTime)));
                    }
                    C0106c c0106c11 = mallPaymentOrderDetailActivity.f32006d;
                    if (c0106c11 != null) {
                        c0106c11.f669b.setText(mallPaymentOrderDetailActivity.getString(p025ba.k.core_post_date, r0.Q(mallPaymentOrderDetailRsp2.paySuccessTime)));
                    }
                    if ("fail".equalsIgnoreCase(mallPaymentOrderDetailRsp2.orderStatusDesc) || TransferByLoanResult.STATUS_FAILED.equalsIgnoreCase(mallPaymentOrderDetailRsp2.orderStatusDesc)) {
                        C0106c c0106c12 = mallPaymentOrderDetailActivity.f32006d;
                        if (c0106c12 != null) {
                            ((ModelAmountList) c0106c12.f670c).d();
                        }
                        C0106c c0106c13 = mallPaymentOrderDetailActivity.f32006d;
                        if (c0106c13 != null) {
                            ((ModelTitleContentImg) c0106c13.f673f).d();
                        }
                        C0106c c0106c14 = mallPaymentOrderDetailActivity.f32006d;
                        if (c0106c14 != null) {
                            ((ModelTitleContentImg) c0106c14.f674g).d();
                        }
                        C0106c c0106c15 = mallPaymentOrderDetailActivity.f32006d;
                        if (c0106c15 != null) {
                            ((ReportTransactionItem) c0106c15.f671d).setEmailData(mallPaymentOrderDetailActivity.m(mallPaymentOrderDetailRsp2));
                        }
                    }
                    mallPaymentOrderDetailActivity.findViewById(com.transsnet.palmpay.custom_view.s.atubd_contact_service_tv).setOnClickListener(new T(i12, mallPaymentOrderDetailActivity, mallPaymentOrderDetailRsp2));
                    return;
                }
                return;
            case 11:
                CommonBeanResult commonBeanResult4 = (CommonBeanResult) obj;
                if (commonBeanResult4 != null) {
                    if (!commonBeanResult4.isSuccess()) {
                        ToastUtils.showLong(commonBeanResult4.getRespMsg(), new Object[0]);
                        return;
                    }
                    ResetPinVerifyListRsp resetPinVerifyListRsp = (ResetPinVerifyListRsp) commonBeanResult4.data;
                    if (resetPinVerifyListRsp != null) {
                        SelectResetPinVerifyTypeActivity selectResetPinVerifyTypeActivity = (SelectResetPinVerifyTypeActivity) obj2;
                        selectResetPinVerifyTypeActivity.f25795d = resetPinVerifyListRsp.token;
                        List<String> list4 = resetPinVerifyListRsp.verification;
                        if (list4 != null && ResetPinVerifyTypeRsp.VERIFY_TYPE_NO.equals(list4.get(0))) {
                            ARouter.getInstance().build("/account/setnewpin").withString("_token", selectResetPinVerifyTypeActivity.f25792a).withString("extra_data_2", selectResetPinVerifyTypeActivity.f25793b).withInt("mode", 2).navigation();
                            selectResetPinVerifyTypeActivity.finish();
                            return;
                        }
                        J8.b bVar2 = selectResetPinVerifyTypeActivity.f25796e;
                        if (bVar2 != null && (list3 = bVar2.f4985b) != null) {
                            list3.clear();
                        }
                        List<String> list5 = resetPinVerifyListRsp.verification;
                        if (list5 != null) {
                            for (String str : list5) {
                                if (!ResetPinVerifyTypeRsp.VERIFY_TYPE_SQ.equals(str) && (bVar = selectResetPinVerifyTypeActivity.f25796e) != null && (list2 = bVar.f4985b) != null) {
                                    list2.add(str);
                                }
                            }
                        }
                        J8.b bVar3 = selectResetPinVerifyTypeActivity.f25796e;
                        if (bVar3 != null) {
                            bVar3.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                CommonBeanResult commonBeanResult5 = (CommonBeanResult) obj;
                CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = (CheckAirtimeSharePinFragment) obj2;
                checkAirtimeSharePinFragment.showLoadingDialog(false);
                if ((commonBeanResult5 != null ? (R2CUssdDialNoResp) commonBeanResult5.data : null) != null) {
                    R2CUssdDialNoResp r2CUssdDialNoResp = (R2CUssdDialNoResp) commonBeanResult5.data;
                    if (TextUtils.isEmpty(r2CUssdDialNoResp != null ? r2CUssdDialNoResp.phone : null)) {
                        return;
                    }
                    R2CUssdDialNoResp r2CUssdDialNoResp2 = (R2CUssdDialNoResp) commonBeanResult5.data;
                    String str2 = r2CUssdDialNoResp2 != null ? r2CUssdDialNoResp2.phone : null;
                    Intent intent = new Intent("android.intent.action.DIAL");
                    if (!TextUtils.isEmpty(str2)) {
                        Uri uri = Uri.parse("tel:" + Uri.encode(str2));
                        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                        intent.setData(uri);
                    }
                    intent.addFlags(268435456);
                    checkAirtimeSharePinFragment.startActivity(intent);
                    return;
                }
                return;
            case 13:
                CommonBeanResult commonBeanResult6 = (CommonBeanResult) obj;
                if (!commonBeanResult6.isSuccess() || (t = commonBeanResult6.data) == 0) {
                    ToastUtils.showLong(commonBeanResult6.getRespMsg());
                    return;
                } else {
                    ((CheckBankAccountOtpFragment) obj2).f27945v = ((FundOtpRsp) t).reference;
                    return;
                }
            case 14:
                CommonBeanResult commonBeanResult7 = (CommonBeanResult) obj;
                CheckBettingWithdrawOtpFragment checkBettingWithdrawOtpFragment = (CheckBettingWithdrawOtpFragment) obj2;
                checkBettingWithdrawOtpFragment.showLoadingDialog(false);
                if (!commonBeanResult7.isSuccess()) {
                    ToastUtils.showLong(commonBeanResult7.getRespMsg());
                    return;
                }
                checkBettingWithdrawOtpFragment.f27964p = ((WithdrawBettingOtpRsp) commonBeanResult7.data).getReference();
                TextView textView20 = checkBettingWithdrawOtpFragment.f27966w;
                if (textView20 != null) {
                    textView20.removeCallbacks(checkBettingWithdrawOtpFragment.f27961i);
                    checkBettingWithdrawOtpFragment.f27966w.setTag(Long.valueOf(SystemClock.elapsedRealtime()));
                    checkBettingWithdrawOtpFragment.f27966w.post(checkBettingWithdrawOtpFragment.f27961i);
                    return;
                }
                return;
            case 15:
                CommonResult commonResult2 = (CommonResult) obj;
                CheckPostPayOtpFragment checkPostPayOtpFragment = (CheckPostPayOtpFragment) obj2;
                checkPostPayOtpFragment.showLoadingDialog(false);
                if (commonResult2 != null) {
                    if (commonResult2.isSuccess()) {
                        ToastUtils.showLong(p025ba.k.core_one_time_code_sent);
                        return;
                    }
                    String respMsg = commonResult2.getRespMsg();
                    Intrinsics.checkNotNullExpressionValue(respMsg, "getRespMsg(...)");
                    checkPostPayOtpFragment.u(respMsg, true);
                    return;
                }
                return;
            case 16:
                CommonResult response5 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(response5, "response");
                CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = (CheckUbaBankAccountOTPFragment) obj2;
                checkUbaBankAccountOTPFragment.showLoadingDialog(false);
                if (!response5.isSuccess()) {
                    ToastUtils.showLong(response5.getRespMsg(), new Object[0]);
                    return;
                }
                Gb.L l6 = new Gb.L(checkUbaBankAccountOTPFragment, i12);
                checkUbaBankAccountOTPFragment.f28029H = l6;
                l6.start();
                return;
            case 17:
                R(obj);
                return;
            case 18:
                S(obj);
                return;
            case 19:
                Intrinsics.checkNotNullParameter((User) obj, "response");
                EnableCashBoxAutoSaveActivity.a aVar3 = EnableCashBoxAutoSaveActivity.f25851j;
                return;
            case 20:
                Intrinsics.checkNotNullParameter((User) obj, "response");
                int i14 = IdentityVerificationActivity.f25861A;
                ((IdentityVerificationActivity) obj2).getClass();
                return;
            case 21:
                Intrinsics.checkNotNullParameter((User) obj, "response");
                G.u(4, org.greenrobot.eventbus.c.b());
                return;
            case 22:
                T(obj);
                return;
            case 23:
                U(obj);
                return;
            case 24:
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                V(obj);
                return;
            case 26:
                W(obj);
                return;
            case 27:
                X(obj);
                return;
            case 28:
                Y(obj);
                return;
            default:
                CommonResult resp = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(resp, "resp");
                ReasonForCancellationPage reasonForCancellationPage = (ReasonForCancellationPage) obj2;
                reasonForCancellationPage.showLoadingDialog(false);
                if ((resp.isSuccess() ? resp : null) != null) {
                    reasonForCancellationPage.finish();
                }
                if ((resp.isSuccess() ? resp : null) == null) {
                    ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                    Unit unit = Unit.f38893a;
                    return;
                }
                return;
        }
    }
}
