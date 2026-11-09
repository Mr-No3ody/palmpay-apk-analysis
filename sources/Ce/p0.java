package Ce;

import N8.ViewOnClickListenerC0467k;
import Ua.E0;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.navigation.fragment.NavHostFragment;
import com.transsnet.palmpay.account.bean.ChangeTempPinRsp;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.SignUpRsp;
import com.transsnet.palmpay.account.bean.rsp.PreSignUpRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.activity.SetNewPinV2Activity;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStepInputPinV2Fragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.dialog.CashierPayMethodRetryDialog;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeMobileInstalmentTabFragment;
import com.transsnet.palmpay.databundle.ui.fragment.DataBundleWalletFragment;
import com.transsnet.palmpay.main.export.bean.rsp.GetCoinRsp;
import com.transsnet.palmpay.send_money.ui.fragment.kkcar.KkCarPassengerFragment;
import com.transsnet.palmpay.teller.ui.dialog.DataBundleWalletDialog;
import com.transsnet.palmpay.ui.activity.GetCoinRewardsActivity;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p0 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1514c;

    public /* synthetic */ p0(int i7, Object obj, Object obj2) {
        this.f1512a = i7;
        this.f1513b = obj;
        this.f1514c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C0.P pF;
        String orderNo;
        int i7 = 0;
        switch (this.f1512a) {
            case 0:
                TransactionHistoryFragment transactionHistoryFragment = (TransactionHistoryFragment) this.f1513b;
                if (transactionHistoryFragment.f35262w == ((X6.o) this.f1514c)) {
                    transactionHistoryFragment.f35262w = null;
                    return;
                }
                return;
            case 1:
                int i10 = KkCarPassengerFragment.f33729B;
                if (((kotlin.jvm.internal.B) this.f1513b).f38947a) {
                    return;
                }
                int iOrdinal = ((Dd.i) this.f1514c).ordinal();
                if (iOrdinal == 0) {
                    Pa.n0.g().k((ClickEvent) C0.G.f("keke_turnon_accounttopup_close_click", "app", "native"));
                    return;
                } else {
                    if (iOrdinal != 1) {
                        throw new p355xf.l();
                    }
                    Pa.n0.g().k((ClickEvent) C0.G.f("keke_qr_biz_error_popup_close_click", "app", "native"));
                    return;
                }
            case 2:
                int i11 = LogInActivity.f25877p0;
                int i12 = F8.h.ac_warning;
                LogInActivity logInActivity = (LogInActivity) this.f1513b;
                String string = logInActivity.getString(i12);
                int i13 = F8.c.ac_icon_secure_login;
                String securityDeviceTitle = ((SignUpRsp) this.f1514c).securityDeviceTitle;
                Intrinsics.checkNotNullExpressionValue(securityDeviceTitle, "securityDeviceTitle");
                String string2 = logInActivity.getString(F8.h.ac_change_pin_2);
                ViewOnClickListenerC0467k viewOnClickListenerC0467k = new ViewOnClickListenerC0467k(logInActivity, 5);
                int i14 = p025ba.k.core_confirm;
                ViewOnClickListenerC0467k viewOnClickListenerC0467k2 = new ViewOnClickListenerC0467k(logInActivity, i7);
                int i15 = p025ba.k.core_opps;
                O6.c cVar = new O6.c(logInActivity);
                cVar.f6614u = 1;
                cVar.e(i15);
                if (string != null) {
                    cVar.f(string);
                }
                cVar.f6607m = i13;
                cVar.f6598d = securityDeviceTitle;
                if (string2 != null) {
                    cVar.f6600f = string2;
                    cVar.f6602h = viewOnClickListenerC0467k;
                }
                cVar.c(i14, viewOnClickListenerC0467k2);
                cVar.f6605k = true;
                cVar.f6606l = 1;
                C0.G.v(cVar, false, false);
                return;
            case 3:
                int i16 = LogInActivity.f25877p0;
                String str = (String) this.f1513b;
                if (CommonResult.CODE_SMS_CODE_ERROR.equals(str) || "VL000107".equals(str) || CommonResult.CODE_SMS_TOKEN_EXPIRED.equals(str)) {
                    LogInActivity logInActivity2 = (LogInActivity) this.f1514c;
                    logInActivity2.n();
                    logInActivity2.A(300, null);
                    LogInReq logInReq = logInActivity2.f25888b;
                    if (logInReq != null) {
                        logInReq.verifyToken = null;
                    }
                    NavHostFragment navHostFragment = logInActivity2.f25886Y;
                    if (navHostFragment == null || (pF = navHostFragment.f()) == null) {
                        return;
                    }
                    pF.k(F8.d.fragment_login_input_mobile, false);
                    return;
                }
                return;
            case 4:
                int i17 = SetNewPinV2Activity.f25976v;
                T t = ((CommonBeanResult) this.f1513b).data;
                if (((ChangeTempPinRsp) t) != null) {
                    ChangeTempPinRsp changeTempPinRsp = (ChangeTempPinRsp) t;
                    boolean z3 = changeTempPinRsp.backToLogin;
                    SetNewPinV2Activity setNewPinV2Activity = (SetNewPinV2Activity) this.f1514c;
                    if (z3) {
                        setNewPinV2Activity.p();
                        return;
                    }
                    String token = changeTempPinRsp.token;
                    Intrinsics.checkNotNullExpressionValue(token, "token");
                    if (setNewPinV2Activity.f27350a == null) {
                        return;
                    }
                    if (!TextUtils.isEmpty(token)) {
                        p051d9.M m7 = (p051d9.M) setNewPinV2Activity.f27350a;
                        if (m7 != null) {
                            m7.b(token, BaseApplication.getInstance().getUser().getMemberId());
                            return;
                        }
                        return;
                    }
                    String phoneNumber = setNewPinV2Activity.f25982g;
                    if (TextUtils.isEmpty(phoneNumber)) {
                        phoneNumber = BaseApplication.getInstance().getUser().getPhoneNumber();
                    }
                    p051d9.M m10 = (p051d9.M) setNewPinV2Activity.f27350a;
                    if (m10 != null) {
                        m10.login(setNewPinV2Activity.f25985o, phoneNumber);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                E0 e10 = (E0) this.f1513b;
                if (e10.f9327q == ((X6.r) this.f1514c)) {
                    e10.f9327q = null;
                    return;
                }
                return;
            case 6:
                SignUpStepInputPinV2Fragment.a aVar = SignUpStepInputPinV2Fragment.f26273A;
                ((SignUpStepInputPinV2Fragment) this.f1513b).x((PreSignUpRsp) ((CommonBeanResult) this.f1514c).data);
                return;
            case 7:
                int i18 = CoreCashierPreviewActivity.f27486Y0;
                String paymentRetryToken = ((CashierPayMethodRetryDialog) this.f1513b).getPaymentRetryToken();
                if (paymentRetryToken == null || StringsKt.F(paymentRetryToken)) {
                    return;
                }
                CoreCashierPreviewActivity coreCashierPreviewActivity = (CoreCashierPreviewActivity) this.f1514c;
                coreCashierPreviewActivity.E(paymentRetryToken);
                coreCashierPreviewActivity.I();
                coreCashierPreviewActivity.finish();
                return;
            case 8:
                DataBundleWalletFragment dataBundleWalletFragment = (DataBundleWalletFragment) this.f1513b;
                if (dataBundleWalletFragment.f31775L == ((DataBundleWalletDialog) this.f1514c)) {
                    dataBundleWalletFragment.f31775L = null;
                    return;
                }
                return;
            case 9:
                GetCoinRewardsActivity.a aVar2 = GetCoinRewardsActivity.f34458e;
                Pa.n0 n0VarG = Pa.n0.g();
                ClickEvent clickEvent = new ClickEvent("PalmPay_GiftRain_Reward_Click");
                GetCoinRsp getCoinRsp = (GetCoinRsp) this.f1513b;
                GetCoinRsp.DataBean dataBean = getCoinRsp.data;
                ClickEvent clickEventAdd = clickEvent.add("activityId", dataBean != null ? dataBean.activityId : null);
                GetCoinRsp.DataBean dataBean2 = getCoinRsp.data;
                n0VarG.k(clickEventAdd.add("randomId", dataBean2 != null ? dataBean2.randomId : null));
                ((GetCoinRewardsActivity) this.f1514c).finish();
                return;
            default:
                OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment = (OcHomeMobileInstalmentTabFragment) this.f1513b;
                QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto = (QueryLoanDialogPopUpsBean.PhoneModelDto) this.f1514c;
                ocHomeMobileInstalmentTabFragment.f30434A = false;
                if (!Eb.e.f2273a && (orderNo = phoneModelDto.getOrderNo()) != null) {
                    String str2 = orderNo.length() > 0 ? orderNo : null;
                    if (str2 != null) {
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().confirmHirePurchaseRepaymentAppLogin(str2).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p382zb.W(ocHomeMobileInstalmentTabFragment));
                    }
                }
                ocHomeMobileInstalmentTabFragment.x().d();
                return;
        }
    }
}
