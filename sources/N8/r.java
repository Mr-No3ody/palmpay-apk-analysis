package N8;

import Pa.C0525w;
import Uc.A0;
import Uc.C0651d;
import Uc.C0661i;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckPinRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthPinFragment;
import com.transsnet.palmpay.contacts.ui.activity.ContactProfileActivity;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayNewContactsListActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.bean.req.SmsActionReq;
import com.transsnet.palmpay.core.bean.rsp.CommonStringResult;
import com.transsnet.palmpay.core.bean.rsp.GetCustomerServiceUrlRsp;
import com.transsnet.palmpay.core.bean.rsp.InvitationCodeResp;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactQueryResp;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.ui.dialog.CoinRewardDialog;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV2View;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.CLInitResp;
import com.transsnet.palmpay.credit.bean.resp.OcOrderData;
import com.transsnet.palmpay.credit.bean.resp.OcOrderRsp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInstallmentRepayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOtpVerifyActivity;
import com.transsnet.palmpay.credit.ui.fragment.LoanCreditFragment;
import com.transsnet.palmpay.echat.EchatActivity;
import com.transsnet.palmpay.main.export.bean.req.MerchantOrderCheckSignReq;
import com.transsnet.palmpay.main.export.bean.rsp.GetCoinRsp;
import com.transsnet.palmpay.p2pcash.bean.rsp.CreateBizOrderResp;
import com.transsnet.palmpay.p2pcash.bean.rsp.QueryCancelOrderReasonResp;
import com.transsnet.palmpay.p2pcash.ui.atm.BookingDetailPage;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import com.transsnet.palmpay.p2pcash.ui.atm.ReasonForCancellationPage;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.ui.activity.GetCoinRewardsActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantActivity;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.ThirdPartyMerchantPreviewActivity;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p052da.ViewOnClickListenerC1649v;
import p102ge.C1742o;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6253g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6254i;

    public /* synthetic */ r(int i7, Object obj, Object obj2) {
        this.f6252f = i7;
        this.f6253g = obj;
        this.f6254i = obj2;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f6252f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((LogInActivity) this.f6253g).addSubscription(d2);
                break;
            case 1:
                Activity activity = (Activity) this.f6253g;
                if (activity instanceof BaseActivity) {
                    ((BaseActivity) activity).addSubscription(d2);
                }
                break;
            case 2:
                ((AuthPinFragment) this.f6254i).f(d2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((BookingDetailPage) this.f6253g).addSubscription(d2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((CashierDeskPage) this.f6253g).addSubscription(d2);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((ReasonForCancellationPage) this.f6253g).addSubscription(d2);
                break;
            case 6:
                ((PalmPayNewContactsListActivity) this.f6254i).addSubscription(d2);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((GetCoinRewardsActivity) this.f6253g).addSubscription(d2);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(d2, "d");
                p143jb.g.a((p143jb.g) this.f6253g, d2);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((p143jb.o) this.f6253g).i().add(d2);
                break;
            case 10:
                ((EchatActivity) this.f6254i).addSubscription(d2);
                break;
            case 11:
                ((ThirdPartyMerchantActivity) this.f6254i).addSubscription(d2);
                break;
            case 12:
                ((ThirdPartyMerchantActivity) this.f6254i).addSubscription(d2);
                break;
            case 13:
                ((p103gf.a) ((Ab.r) this.f6254i).f139b).add(d2);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcInstallmentRepayActivity) this.f6253g).addSubscription(d2);
                break;
            case 15:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((OcOtpVerifyActivity) this.f6254i).addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                ((p383zc.y) this.f6254i).addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        Object obj = this.f6254i;
        Object obj2 = this.f6253g;
        switch (this.f6252f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                LogInActivity logInActivity = (LogInActivity) obj2;
                logInActivity.showLoadingDialog(false);
                int i7 = LogInActivity.f25877p0;
                logInActivity.B("", message);
                break;
            case 1:
                Activity activity = (Activity) obj2;
                if (activity instanceof BaseActivity) {
                    ((BaseActivity) activity).showLoadingDialog(false);
                }
                ToastUtils.showLong(message);
                break;
            case 2:
                ToastUtils.showLong(message);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(message, "msg");
                ((BookingDetailPage) obj2).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(message, "msg");
                CashierDeskPage cashierDeskPage = (CashierDeskPage) obj2;
                cashierDeskPage.showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                cashierDeskPage.finish();
                break;
            case 5:
                Intrinsics.checkNotNullParameter(message, "msg");
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 6:
                ((PalmPayNewContactsListActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                GetCoinRewardsActivity getCoinRewardsActivity = (GetCoinRewardsActivity) obj2;
                getCoinRewardsActivity.showLoadingDialog(false);
                getCoinRewardsActivity.finish();
                break;
            case 8:
                Intrinsics.checkNotNullParameter(message, "message");
                ((p143jb.g) obj2).k(false);
                ToastUtils.showShort(message, new Object[0]);
                break;
            case 9:
                if (message != null) {
                    if (TextUtils.isEmpty(message)) {
                        message = null;
                    }
                    if (message != null) {
                        ToastUtils.showLong(message, new Object[0]);
                    }
                }
                break;
            case 10:
                ((EchatActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 11:
                ((ThirdPartyMerchantActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 12:
                ((ThirdPartyMerchantActivity) obj).showLoadingDialog(false);
                ToastUtils.showLong(message);
                break;
            case 13:
                ((p279s5.d) obj2).onFail(message);
                break;
            case 14:
                ((OcInstallmentRepayActivity) obj2).showLoadingDialog(false);
                ToastUtils.showLong(message, new Object[0]);
                break;
            case 15:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showLong(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z4.e
    public final void y(Object obj) {
        CreateBizOrderResp createBizOrderResp;
        String respMsg;
        Unit unit;
        int i7 = 3;
        Object obj2 = this.f6254i;
        Object obj3 = this.f6253g;
        switch (this.f6252f) {
            case 0:
                Intrinsics.checkNotNullParameter((User) obj, "response");
                LogInActivity logInActivity = (LogInActivity) obj3;
                logInActivity.showLoadingDialog(false);
                T data = ((CommonBeanResult) obj2).data;
                Intrinsics.checkNotNullExpressionValue(data, "data");
                int i10 = LogInActivity.f25877p0;
                logInActivity.w((SignUpRsp) data);
                return;
            case 1:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                Activity activity = (Activity) obj3;
                if (activity instanceof BaseActivity) {
                    ((BaseActivity) activity).showLoadingDialog(false);
                }
                if (!commonBeanResult.isSuccess()) {
                    ToastUtils.showLong(commonBeanResult.getRespMsg());
                    return;
                } else {
                    try {
                        ARouter.getInstance().build("/main/echat").withString("extra_type", ((GetCustomerServiceUrlReq) obj2).entryType).withString("linkUrl", ((GetCustomerServiceUrlRsp) commonBeanResult.data).url).navigation();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            case 2:
                CommonBeanResult commonBeanResult2 = (CommonBeanResult) obj;
                AuthPinFragment authPinFragment = (AuthPinFragment) obj2;
                if (commonBeanResult2 == null || commonBeanResult2.data == 0 || !commonBeanResult2.isSuccess()) {
                    authPinFragment.f26095i.b();
                    authPinFragment.u(authPinFragment.getResources().getString(F8.h.ac_msg_authentication_fail));
                    return;
                }
                CheckPinRsp checkPinRsp = (CheckPinRsp) commonBeanResult2.data;
                if (!checkPinRsp.isValidate()) {
                    authPinFragment.f26095i.b();
                    if (checkPinRsp.isLock()) {
                        authPinFragment.u(authPinFragment.getString(F8.h.ac_msg_account_locked));
                        return;
                    } else {
                        authPinFragment.u(authPinFragment.getString(F8.h.ac_msg_pin_retry_times_left, Integer.valueOf(checkPinRsp.getValidateCount())));
                        return;
                    }
                }
                String str = (String) obj3;
                if (!authPinFragment.f26099v || TextUtils.isEmpty(checkPinRsp.getToken())) {
                    authPinFragment.t(SecurityUtils.a(str), null);
                    return;
                } else {
                    authPinFragment.t(SecurityUtils.a(str), checkPinRsp.getToken());
                    return;
                }
            case 3:
                CommonResult resp = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(resp, "resp");
                BookingDetailPage bookingDetailPage = (BookingDetailPage) obj3;
                bookingDetailPage.showLoadingDialog(false);
                if ((resp.isSuccess() ? resp : null) != null) {
                    ((C0651d) obj2).d();
                    C0661i c0661i = (C0661i) bookingDetailPage.f32804C.getValue();
                    c0661i.getClass();
                    BookingDetailPage bookingDetailPage2 = c0661i.f9652a;
                    Intrinsics.checkNotNullParameter(bookingDetailPage2, "<this>");
                    Intent intent = new Intent(bookingDetailPage2, (Class<?>) ReasonForCancellationPage.class);
                    intent.putExtra("APPOINTMENT_ORDER_ID", bookingDetailPage2.q().b().r());
                    bookingDetailPage2.startActivity(intent);
                    C0.G.u(407, org.greenrobot.eventbus.c.b());
                }
                if ((resp.isSuccess() ? resp : null) == null) {
                    ToastUtils.showLong(resp.getRespMsg(), new Object[0]);
                    Unit unit2 = Unit.f38893a;
                    return;
                }
                return;
            case 4:
                CommonBeanResult resp2 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(resp2, "resp");
                CashierDeskPage cashierDeskPage = (CashierDeskPage) obj3;
                cashierDeskPage.showLoadingDialog(false);
                CommonBeanResult commonBeanResult3 = resp2.isSuccess() ? resp2 : null;
                if (commonBeanResult3 != null && (createBizOrderResp = (CreateBizOrderResp) commonBeanResult3.data) != null) {
                    Uc.K k2 = (Uc.K) obj2;
                    k2.f9567a.setValue(k2, Uc.K.f9566i[0], createBizOrderResp);
                }
                if ((resp2.isSuccess() ? resp2 : null) == null) {
                    ToastUtils.showLong(resp2.getRespMsg(), new Object[0]);
                    cashierDeskPage.finish();
                    Unit unit3 = Unit.f38893a;
                    return;
                }
                return;
            case 5:
                QueryCancelOrderReasonResp resp3 = (QueryCancelOrderReasonResp) obj;
                Intrinsics.checkNotNullParameter(resp3, "resp");
                QueryCancelOrderReasonResp queryCancelOrderReasonResp = resp3.isSuccess() ? resp3 : null;
                if (queryCancelOrderReasonResp != null) {
                    List<String> list = queryCancelOrderReasonResp.data;
                    ArrayList arrayList = new ArrayList(list != null ? list : kotlin.collections.z.f38935a);
                    arrayList.add("Other");
                    A0 a3 = (A0) obj2;
                    Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
                    a3.f9526a.setValue(a3, A0.f9525e[0], arrayList);
                }
                if ((resp3.isSuccess() ? resp3 : null) == null) {
                    ToastUtils.showLong(resp3.getRespMsg(), new Object[0]);
                    Unit unit4 = Unit.f38893a;
                    return;
                }
                return;
            case 6:
                PalmPayContactQueryResp palmPayContactQueryResp = (PalmPayContactQueryResp) obj;
                PalmPayNewContactsListActivity palmPayNewContactsListActivity = (PalmPayNewContactsListActivity) obj2;
                palmPayNewContactsListActivity.showLoadingDialog(false);
                if (!palmPayContactQueryResp.isSuccess()) {
                    ToastUtils.showLong(palmPayContactQueryResp.getRespMsg());
                    return;
                }
                if (palmPayContactQueryResp.getData().isFriend()) {
                    ContactProfileActivity.n(palmPayNewContactsListActivity, palmPayContactQueryResp.getData());
                    return;
                }
                PalmPayContact palmPayContact = new PalmPayContact();
                RequestContact requestContact = (RequestContact) obj3;
                palmPayContact.setAlias(requestContact.getAlias());
                palmPayContact.setContactsMemberId(requestContact.getContactsMemberId());
                palmPayContact.setFullName(requestContact.getFullName());
                palmPayContact.setIsFavourite(requestContact.getIsFavourite());
                palmPayContact.setFriend(requestContact.isFriend());
                palmPayContact.setPhone(requestContact.getPhone());
                palmPayContact.setPhotoPath(requestContact.getPhotoPath());
                palmPayContact.setRequestSource(requestContact.getRequestSource());
                ContactProfileActivity.n(palmPayNewContactsListActivity, palmPayContact);
                return;
            case 7:
                GetCoinRsp response = (GetCoinRsp) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                GetCoinRewardsActivity getCoinRewardsActivity = (GetCoinRewardsActivity) obj3;
                P6.a aVar = (P6.a) getCoinRewardsActivity.f34462d.getValue();
                if (aVar != null) {
                    aVar.hide();
                }
                if (response == null) {
                    return;
                }
                if (response.isSuccess()) {
                    GetCoinRsp.DataBean dataBean = response.data;
                    if ((dataBean != null ? dataBean.popWindowsDTO : null) == null) {
                        getCoinRewardsActivity.finish();
                        return;
                    }
                    CoinRewardDialog coinRewardDialog = new CoinRewardDialog(getCoinRewardsActivity, new C1742o((String) obj2, getCoinRewardsActivity));
                    coinRewardDialog.setOnDismissListener(new Ce.p0(9, response, getCoinRewardsActivity));
                    coinRewardDialog.show();
                    coinRewardDialog.fillData(response.data.popWindowsDTO, getCoinRewardsActivity.f34460b, getCoinRewardsActivity.f34459a);
                    return;
                }
                O6.c cVar = new O6.c(getCoinRewardsActivity);
                cVar.f6605k = false;
                cVar.f6596b = O6.d.f(getCoinRewardsActivity.getString(p025ba.k.core_oops));
                String respMsg2 = response.getRespMsg();
                if (respMsg2 == null) {
                    respMsg2 = "";
                }
                cVar.f6598d = respMsg2;
                String string = getCoinRewardsActivity.getString(com.transsnet.palmpay.custom_view.v.cv_confirm);
                ViewOnClickListenerC1649v viewOnClickListenerC1649v = new ViewOnClickListenerC1649v(getCoinRewardsActivity, i7);
                cVar.f6600f = string;
                cVar.f6602h = viewOnClickListenerC1649v;
                O6.d dVarA = cVar.a();
                Intrinsics.checkNotNullExpressionValue(dVarA, "create(...)");
                dVarA.setCanceledOnTouchOutside(false);
                dVarA.setCancelable(false);
                dVarA.show();
                return;
            case 8:
                CLInitResp cLInitResp = (CLInitResp) obj;
                p143jb.g gVar = (p143jb.g) obj3;
                if (cLInitResp == null || !cLInitResp.isSuccess()) {
                    gVar.k(false);
                    ToastUtils.showShort(cLInitResp != null ? cLInitResp.getRespMsg() : null, new Object[0]);
                    return;
                }
                if (cLInitResp.getData() != null) {
                    CLInitData data2 = cLInitResp.getData();
                    if (!TextUtils.isEmpty(data2 != null ? data2.getApplyId() : null)) {
                        CLInitData data3 = cLInitResp.getData();
                        gVar.f38515c = data3;
                        gVar.f38516d = data3 != null ? data3.getApplyId() : null;
                        gVar.f((BaseFragment) obj2);
                        return;
                    }
                }
                gVar.k(false);
                return;
            case 9:
                CommonResult commonResult = (CommonResult) obj;
                if (commonResult != null) {
                    if ((commonResult.isSuccess() ? commonResult : null) != null) {
                        p143jb.o oVar = (p143jb.o) obj3;
                        if (Intrinsics.c((Boolean) obj2, Boolean.TRUE)) {
                            WeakReference weakReference = oVar.f38544b;
                            if (weakReference == null) {
                                Intrinsics.n("mLoanCreditFragmentRef");
                                throw null;
                            }
                            LoanCreditFragment loanCreditFragment = (LoanCreditFragment) weakReference.get();
                            if (loanCreditFragment != null) {
                                p143jb.o.z(oVar, loanCreditFragment, null, "LOAN_WITHDRAW", 0, null, 26);
                                unit = Unit.f38893a;
                            } else {
                                unit = null;
                            }
                        } else {
                            oVar.e(null);
                            unit = Unit.f38893a;
                        }
                        if (unit != null) {
                            return;
                        }
                    }
                }
                if (commonResult == null || (respMsg = commonResult.getRespMsg()) == null) {
                    return;
                }
                String str2 = TextUtils.isEmpty(respMsg) ? null : respMsg;
                if (str2 != null) {
                    ToastUtils.showShort(str2, new Object[0]);
                    return;
                }
                return;
            case 10:
                CommonBeanResult commonBeanResult4 = (CommonBeanResult) obj;
                EchatActivity echatActivity = (EchatActivity) obj2;
                if (!commonBeanResult4.isSuccess()) {
                    echatActivity.showLoadingDialog(false);
                    ToastUtils.showLong(commonBeanResult4.getRespMsg());
                    return;
                }
                T t = commonBeanResult4.data;
                if (t == 0 || TextUtils.isEmpty(((GetCustomerServiceUrlRsp) t).url)) {
                    return;
                }
                p059e1.a.I("main_sp_customerServiceUrl" + ((String) obj3), ((GetCustomerServiceUrlRsp) commonBeanResult4.data).url);
                echatActivity.f31828a.loadUrl(((GetCustomerServiceUrlRsp) commonBeanResult4.data).url);
                return;
            case 11:
                CommonBeanResult commonBeanResult5 = (CommonBeanResult) obj;
                ThirdPartyMerchantActivity thirdPartyMerchantActivity = (ThirdPartyMerchantActivity) obj2;
                thirdPartyMerchantActivity.showLoadingDialog(false);
                if (!commonBeanResult5.isSuccess()) {
                    ToastUtils.showLong(commonBeanResult5.getRespMsg());
                    return;
                }
                String json = ((Gson) C0525w.f().f7166b).toJson(commonBeanResult5.data);
                int i11 = ThirdPartyMerchantActivity.f34991g;
                thirdPartyMerchantActivity.l(json, (String) obj3);
                return;
            case 12:
                CommonResult commonResult2 = (CommonResult) obj;
                ThirdPartyMerchantActivity thirdPartyMerchantActivity2 = (ThirdPartyMerchantActivity) obj2;
                thirdPartyMerchantActivity2.showLoadingDialog(false);
                if (!commonResult2.isSuccess()) {
                    ToastUtils.showLong(commonResult2.getRespMsg());
                    return;
                }
                String orderNo = ((MerchantOrderCheckSignReq) obj3).getOrderNo();
                int i12 = ThirdPartyMerchantPreviewActivity.f35020w0;
                thirdPartyMerchantActivity2.startActivity(new Intent(thirdPartyMerchantActivity2, (Class<?>) ThirdPartyMerchantPreviewActivity.class).putExtra("orderNo", orderNo));
                return;
            case 13:
                CommonBeanResult commonBeanResult6 = (CommonBeanResult) obj;
                p279s5.d dVar = (p279s5.d) obj3;
                if (!commonBeanResult6.isSuccess()) {
                    dVar.onFail(commonBeanResult6.getRespMsg());
                    return;
                }
                p367ya.a.d().f44149a.i("key_invitation_code", ((InvitationCodeResp) commonBeanResult6.data).invitQrCode);
                if (TextUtils.isEmpty(((InvitationCodeResp) commonBeanResult6.data).invitQrCode)) {
                    return;
                }
                dVar.onSuccess(((InvitationCodeResp) commonBeanResult6.data).invitQrCode);
                return;
            case 14:
                OcOrderRsp ocOrderRsp = (OcOrderRsp) obj;
                if (ocOrderRsp != null) {
                    OcInstallmentRepayActivity ocInstallmentRepayActivity = (OcInstallmentRepayActivity) obj3;
                    ocInstallmentRepayActivity.showLoadingDialog(false);
                    if (!ocOrderRsp.isSuccess()) {
                        ToastUtils.showLong(ocOrderRsp.getRespMsg(), new Object[0]);
                        return;
                    }
                    Long l5 = (Long) obj2;
                    Postcard postcardWithLong = ARouter.getInstance().build("/credit_score/oc_repay_preview_activity").withLong("ok_card_repay_amount", l5 != null ? l5.longValue() : 0L).withString("ok_card_repay_card_no", ocInstallmentRepayActivity.f29535Z).withLong("ok_card_repay_bill_id", ocInstallmentRepayActivity.f29542k0);
                    OcOrderData data4 = ocOrderRsp.getData();
                    postcardWithLong.withString("ok_card_repay_order_no", data4 != null ? data4.getOrderId() : null).navigation();
                    return;
                }
                return;
            case 15:
                CommonResult commonResult3 = (CommonResult) obj;
                if (commonResult3 != null && commonResult3.isSuccess()) {
                    SmsActionReq smsActionReq = (SmsActionReq) obj3;
                    int i13 = smsActionReq.voiceSms;
                    if (i13 == 3) {
                        ToastUtils.showLong(Pa.i0.C(i13, smsActionReq.phoneNo, smsActionReq.getSecurityEmail()), new Object[0]);
                        return;
                    } else {
                        ToastUtils.showLong(Pa.i0.C(i13, smsActionReq.phoneNo, null), new Object[0]);
                        return;
                    }
                }
                ToastUtils.showLong(commonResult3 != null ? commonResult3.getRespMsg() : null, new Object[0]);
                int i14 = OcOtpVerifyActivity.f29624v0;
                OcOtpVerifyActivity ocOtpVerifyActivity = (OcOtpVerifyActivity) obj2;
                ocOtpVerifyActivity.z().setSendOtcButtonState(true);
                if (CommonResult.CODE_SMS_CODE_OVER_ACQUIRED.equalsIgnoreCase(commonResult3 != null ? commonResult3.getRespCode() : null)) {
                    OneTimeCodeV2View oneTimeCodeV2ViewZ = ocOtpVerifyActivity.z();
                    oneTimeCodeV2ViewZ.f28459i.setVisibility(4);
                    oneTimeCodeV2ViewZ.f28460j.setVisibility(4);
                    return;
                }
                return;
            default:
                CommonStringResult response2 = (CommonStringResult) obj;
                Intrinsics.checkNotNullParameter(response2, "response");
                if (!response2.isSuccess()) {
                    ToastUtils.showShort(response2.getRespMsg(), new Object[0]);
                    return;
                }
                String str3 = (String) obj3;
                String strSubstring = str3.substring(1, 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = str3.substring(5);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                PhoneUtils.sendSms(q0.k("+", strSubstring, strSubstring2), response2.data);
                return;
        }
    }

    public /* synthetic */ r(Object obj, int i7, Object obj2, boolean z3) {
        this.f6252f = i7;
        this.f6254i = obj;
        this.f6253g = obj2;
    }
}
