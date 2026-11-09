package Yd;

import V9.C0714c;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import com.google.api.Service;
import com.luck.lib.camerax.CustomCameraView;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdDialog;
import com.transsnet.adsdk.widgets.MarqueeTextView.ShowTextDialog;
import com.transsnet.palmpay.account.bean.SignUpReq;
import com.transsnet.palmpay.account.bean.req.SecurityVerifyMethodReq;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.account.ui.fragment.setpin.SetNewPswFragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepInputPinV2Fragment;
import com.transsnet.palmpay.account.ui.fragment.verify.BaseVerifyAccountFragment;
import com.transsnet.palmpay.account.ui.fragment.verify.VerifyAccountIdTypeFragment;
import com.transsnet.palmpay.account.ui.fragment.verify.VerifyAccountPinFragment;
import com.transsnet.palmpay.account.ui.fragment.verify.VerifyAccountPswFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommentImgItem;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.CommentAddReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.activity.AddBankCardAccountActivity;
import com.transsnet.palmpay.core.ui.activity.AddNewCardWithPaymentActivity;
import com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity;
import com.transsnet.palmpay.core.ui.activity.BindNewBankAccountActivity;
import com.transsnet.palmpay.core.ui.activity.CoreCommentActivity;
import com.transsnet.palmpay.core.ui.activity.InputCardPinActivity;
import com.transsnet.palmpay.core.ui.dialog.OcSwitchRouterDialog;
import com.transsnet.palmpay.core.ui.fragment.AddBankCardFragmentV2;
import com.transsnet.palmpay.credit.businessLoan.location.LocationServiceManager$LocationServiceCallback;
import com.transsnet.palmpay.credit.ui.dialog.AgentAutoRepaymentDialog;
import com.transsnet.palmpay.credit.ui.dialog.AvailableCouponListDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.CLBorrowInstallmentAccountDialog;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.photograph.PhotoPickerActivity;
import com.transsnet.palmpay.photograph.PhotoViewerActivity;
import com.transsnet.palmpay.teller.bean.CheckCustomerIdRsp;
import com.transsnet.palmpay.teller.bean.TvRenewDataInfoBean;
import com.transsnet.palmpay.teller.bean.resp.QueryCustomerIdIsExitResp;
import com.transsnet.palmpay.teller.ui.dialog.DataBundleWalletDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerNewDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickMobileNetWorkDialog;
import com.transsnet.palmpay.teller.ui.dialog.RulesDialog;
import com.transsnet.palmpay.teller.ui.view.ModelTvRenewItem;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import p052da.D;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11339b;

    public /* synthetic */ i(Object obj, int i7) {
        this.f11338a = i7;
        this.f11339b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PinEntryView pinEntryView;
        EditText editText;
        String billerName;
        String billerId;
        String billerLogo;
        String customerId;
        String itemName;
        String itemId;
        String userIdTips;
        long price;
        long minAmount;
        long renewalAmount;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo;
        List<CheckCustomerIdRsp.Item> items;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo2;
        QueryCustomerIdIsExitResp.RenewalInfoBean renewalInfo;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo3;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo4;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo5;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo6;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo7;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo8;
        QueryCustomerIdIsExitResp.RenewalInfoBean renewalInfo2;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo9;
        QueryCustomerIdIsExitResp.RenewalInfoBean renewalInfo3;
        QueryCustomerIdIsExitResp.CustomerInfoBean customerInfo10;
        QueryCustomerIdIsExitResp.RenewalInfoBean renewalInfo4;
        ArrayList arrayList;
        boolean zC = false;
        Editable editableText = null;
        address = null;
        String address = null;
        String str = null;
        editableText = null;
        editableText = null;
        Object obj = this.f11339b;
        switch (this.f11338a) {
            case 0:
                ((DataBundleWalletDialog) obj).dismiss();
                return;
            case 1:
                ((PickBillerDialog) obj).dismiss();
                return;
            case 2:
                ((PickBillerNewDialog) obj).dismiss();
                return;
            case 3:
                ((PickMobileNetWorkDialog) obj).dismiss();
                return;
            case 4:
                ((RulesDialog) obj).dismiss();
                return;
            case 5:
                SetNewPswFragment setNewPswFragment = (SetNewPswFragment) obj;
                Bc.f fVar = setNewPswFragment.f26250i;
                if (fVar != null && (pinEntryView = (PinEntryView) fVar.f698d) != null && (editText = pinEntryView.getEditText()) != null) {
                    editableText = editText.getEditableText();
                }
                setNewPswFragment.u(String.valueOf(editableText));
                return;
            case 6:
                String[] strArr = PhotoPickerActivity.f33071j;
                ((PhotoPickerActivity) obj).finish();
                return;
            case 7:
                int i7 = PhotoViewerActivity.f33081c;
                ((PhotoViewerActivity) obj).finish();
                return;
            case 8:
                SignUpActivity signUpActivity = (SignUpActivity) obj;
                SignUpStepInputPinV2Fragment.a aVar = SignUpStepInputPinV2Fragment.f26273A;
                try {
                    SignUpActivity.a aVar2 = SignUpActivity.f26029C;
                    signUpActivity.r(300, null);
                    SignUpReq signUpReqM = signUpActivity.m();
                    if (signUpReqM != null) {
                        signUpReqM.verifyToken = null;
                    }
                    signUpActivity.getSupportFragmentManager().T(0, "SignUpStep1Fragment");
                    signUpActivity.t();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 9:
                VerifyAccountActivity verifyAccountActivityW = ((BaseVerifyAccountFragment) obj).w();
                if (verifyAccountActivityW != null) {
                    verifyAccountActivityW.onBackPressed();
                    return;
                }
                return;
            case 10:
                VerifyAccountActivity verifyAccountActivityW2 = ((VerifyAccountIdTypeFragment) obj).w();
                if (verifyAccountActivityW2 != null) {
                    verifyAccountActivityW2.onBackPressed();
                    return;
                }
                return;
            case 11:
                VerifyAccountPinFragment verifyAccountPinFragment = (VerifyAccountPinFragment) obj;
                VerifyAccountActivity verifyAccountActivityW3 = verifyAccountPinFragment.w();
                if (verifyAccountActivityW3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_type", BaseApplication.hasLogin() ? SecurityVerifyMethodReq.LOGIN_RESET_PIN : SecurityVerifyMethodReq.UNLOGIN_RESET_PIN);
                    VerifyAccountActivity verifyAccountActivityW4 = verifyAccountPinFragment.w();
                    bundle.putString("_number", verifyAccountActivityW4 != null ? verifyAccountActivityW4.q() : null);
                    VerifyAccountActivity verifyAccountActivityW5 = verifyAccountPinFragment.w();
                    if (verifyAccountActivityW5 != null) {
                        String str2 = verifyAccountActivityW5.f26065e;
                        str = str2 != null ? str2 : "";
                    }
                    bundle.putString("_email", str);
                    com.palmpay.lib.apm.launchcounter.util.d.E(bundle, "/account/verifyAccount");
                    verifyAccountActivityW3.finish();
                    return;
                }
                return;
            case 12:
                Bundle bundle2 = new Bundle();
                bundle2.putString("extra_type", BaseApplication.hasLogin() ? SecurityVerifyMethodReq.LOGIN_RESET_PASSWORD : SecurityVerifyMethodReq.UNLOGIN_RESET_PASSWORD);
                VerifyAccountActivity verifyAccountActivityW6 = ((VerifyAccountPswFragment) obj).w();
                bundle2.putString("_number", verifyAccountActivityW6 != null ? verifyAccountActivityW6.q() : null);
                com.palmpay.lib.apm.launchcounter.util.d.E(bundle2, "/account/verifyAccount");
                return;
            case 13:
                F6.d.h("LocationServiceManager", 3, "showGpsEnableDialogInternal - User chose not to enable GPS");
                LocationServiceManager$LocationServiceCallback locationServiceManager$LocationServiceCallback = (LocationServiceManager$LocationServiceCallback) obj;
                if (locationServiceManager$LocationServiceCallback != null) {
                    locationServiceManager$LocationServiceCallback.onUserChooseNotToEnableGps();
                    return;
                }
                return;
            case 14:
                int i10 = ModelTvRenewItem.f34348b;
                TvRenewDataInfoBean tvRenewDataInfoBean = new TvRenewDataInfoBean();
                Boolean bool = Boolean.TRUE;
                tvRenewDataInfoBean.setOnlyRenewal(bool);
                QueryCustomerIdIsExitResp.DataBean dataBean = (QueryCustomerIdIsExitResp.DataBean) obj;
                if (dataBean == null || (billerName = dataBean.getBillerName()) == null) {
                    billerName = "";
                }
                tvRenewDataInfoBean.setBillerName(billerName);
                if (dataBean == null || (billerId = dataBean.getBillerId()) == null) {
                    billerId = "";
                }
                tvRenewDataInfoBean.setBillerId(billerId);
                if (dataBean == null || (billerLogo = dataBean.getBillerLogo()) == null) {
                    billerLogo = "";
                }
                tvRenewDataInfoBean.setBillerIcon(billerLogo);
                if (dataBean == null || (customerId = dataBean.getCustomerId()) == null) {
                    customerId = "";
                }
                tvRenewDataInfoBean.setAccountNumber(customerId);
                if (dataBean == null || (customerInfo10 = dataBean.getCustomerInfo()) == null || (renewalInfo4 = customerInfo10.getRenewalInfo()) == null || (itemName = renewalInfo4.getItemName()) == null) {
                    itemName = "";
                }
                tvRenewDataInfoBean.setPaymentItemName(itemName);
                if (dataBean == null || (customerInfo9 = dataBean.getCustomerInfo()) == null || (renewalInfo3 = customerInfo9.getRenewalInfo()) == null || (itemId = renewalInfo3.getItemId()) == null) {
                    itemId = "";
                }
                tvRenewDataInfoBean.setPaymentItemId(itemId);
                if (dataBean == null || (userIdTips = dataBean.getUserIdTips()) == null) {
                    userIdTips = "";
                }
                tvRenewDataInfoBean.setAccountNmberTitleName(userIdTips);
                if (dataBean == null || (customerInfo8 = dataBean.getCustomerInfo()) == null || (renewalInfo2 = customerInfo8.getRenewalInfo()) == null || (price = renewalInfo2.getPrice()) == null) {
                    price = 0L;
                }
                tvRenewDataInfoBean.setAccountAmount(price);
                if (dataBean != null && (customerInfo7 = dataBean.getCustomerInfo()) != null) {
                    zC = Intrinsics.c(customerInfo7.getAvailable(), bool);
                }
                tvRenewDataInfoBean.setAvailable(Boolean.valueOf(zC));
                tvRenewDataInfoBean.setFullName((dataBean == null || (customerInfo6 = dataBean.getCustomerInfo()) == null) ? null : customerInfo6.getFullName());
                tvRenewDataInfoBean.setReferenceId((dataBean == null || (customerInfo5 = dataBean.getCustomerInfo()) == null) ? null : customerInfo5.getReferenceId());
                if (dataBean != null && (customerInfo4 = dataBean.getCustomerInfo()) != null) {
                    address = customerInfo4.getAddress();
                }
                tvRenewDataInfoBean.setAddress(address);
                if (dataBean == null || (customerInfo3 = dataBean.getCustomerInfo()) == null || (minAmount = customerInfo3.getMinAmount()) == null) {
                    minAmount = 0L;
                }
                tvRenewDataInfoBean.setMinAmount(minAmount);
                if (dataBean == null || (customerInfo2 = dataBean.getCustomerInfo()) == null || (renewalInfo = customerInfo2.getRenewalInfo()) == null || (renewalAmount = renewalInfo.getRenewalAmount()) == null) {
                    renewalAmount = 0L;
                }
                tvRenewDataInfoBean.setRenewalAmount(renewalAmount);
                tvRenewDataInfoBean.setViewDoc("");
                tvRenewDataInfoBean.setViewPic("");
                tvRenewDataInfoBean.setItems(new ArrayList<>());
                if (dataBean != null && (customerInfo = dataBean.getCustomerInfo()) != null && (items = customerInfo.getItems()) != null) {
                    for (CheckCustomerIdRsp.Item item : items) {
                        ArrayList<TvRenewDataInfoBean.Item> items2 = tvRenewDataInfoBean.getItems();
                        if (items2 != null) {
                            items2.add(new TvRenewDataInfoBean.Item(item.key, item.value));
                        }
                    }
                }
                ARouter.getInstance().build("/quick_teller/tv_home_pre").withSerializable("extra_renew_data", tvRenewDataInfoBean).navigation();
                return;
            case 15:
                ((ch.h) obj).f();
                return;
            case 16:
                ReactViewManager.setFocusable$lambda$2((ReactViewGroup) obj, view);
                return;
            case 17:
                ((CustomCameraView) obj).lambda$initView$0(view);
                return;
            case 18:
                ((InterstitialAdDialog) obj).lambda$initRemoteWebViewAd$0(view);
                return;
            case 19:
                ((ShowTextDialog) obj).lambda$onCreate$0(view);
                return;
            case 20:
                AddBankCardAccountActivity addBankCardAccountActivity = (AddBankCardAccountActivity) obj;
                Fragment fragment = (Fragment) addBankCardAccountActivity.f27416e.get(addBankCardAccountActivity.l().getCurrentItem());
                if (fragment instanceof AddBankCardAccountActivity.BackPressedListener) {
                    ((AddBankCardAccountActivity.BackPressedListener) fragment).onBackPressed();
                    return;
                } else {
                    addBankCardAccountActivity.finish();
                    return;
                }
            case 21:
                ((AddNewCardWithPaymentActivity.CheckCvvDialog) obj).dismiss();
                return;
            case 22:
                int i11 = BaseCoreCashierPreviewActivity.f27451C;
                ((BaseCoreCashierPreviewActivity) obj).finish();
                return;
            case 23:
                int i12 = BindNewBankAccountActivity.f27464H;
                BindNewBankAccountActivity bindNewBankAccountActivity = (BindNewBankAccountActivity) obj;
                bindNewBankAccountActivity.getClass();
                new OcSwitchRouterDialog(bindNewBankAccountActivity, OcSwitchRouterDialog.SWITCH_BANK_CARD, bindNewBankAccountActivity.f27471e).show();
                return;
            case 24:
                int i13 = CoreCommentActivity.f27529j;
                CoreCommentActivity coreCommentActivity = (CoreCommentActivity) obj;
                coreCommentActivity.showLoadingDialog(true);
                boolean zIsChecked = ((CheckBox) coreCommentActivity.f27530a.getValue()).isChecked();
                String str3 = coreCommentActivity.f27536g;
                String string = ((EditText) coreCommentActivity.f27534e.getValue()).getEditableText().toString();
                String fullName = BaseApplication.get().getUser().getFullName();
                String str4 = coreCommentActivity.f27535f;
                D d2 = coreCommentActivity.f27537i;
                if (d2 == null) {
                    Intrinsics.n("mAdapter");
                    throw null;
                }
                if (d2.f35677c.isEmpty()) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    D d10 = coreCommentActivity.f27537i;
                    if (d10 == null) {
                        Intrinsics.n("mAdapter");
                        throw null;
                    }
                    ListIterator listIterator = d10.f35677c.listIterator();
                    Intrinsics.checkNotNullExpressionValue(listIterator, "listIterator(...)");
                    while (listIterator.hasNext()) {
                        arrayList2.add(((CommentImgItem) listIterator.next()).url);
                    }
                    arrayList = arrayList2;
                }
                ((PayApiService) p324va.c.f43141a.f14621b).addComment(new CommentAddReq(zIsChecked, str3, string, fullName, str4, arrayList)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(coreCommentActivity, 5));
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i14 = InputCardPinActivity.f27654c;
                InputCardPinActivity inputCardPinActivity = (InputCardPinActivity) obj;
                String string2 = ((EditText) inputCardPinActivity.f27656b.getValue()).getText().toString();
                if (TextUtils.isEmpty(string2)) {
                    ToastUtils.showShort("Please input Card PIN", new Object[0]);
                    return;
                } else {
                    org.greenrobot.eventbus.c.b().f(new MessageEvent(339, string2));
                    inputCardPinActivity.finish();
                    return;
                }
            case 26:
                ((AddBankCardFragmentV2.CheckCvvDialog) obj).dismiss();
                return;
            case 27:
                AgentAutoRepaymentDialog.initViews$lambda$1((AgentAutoRepaymentDialog) obj, view);
                return;
            case 28:
                AvailableCouponListDialogFragment.a aVar3 = AvailableCouponListDialogFragment.f29932H;
                ((AvailableCouponListDialogFragment) obj).dismiss();
                return;
            default:
                CLBorrowInstallmentAccountDialog.initViews$lambda$0((CLBorrowInstallmentAccountDialog) obj, view);
                return;
        }
    }
}
