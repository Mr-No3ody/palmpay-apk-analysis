package com.transsnet.palmpay.core.ui.activity;

import N8.q0;
import Pa.C0525w;
import Pa.i0;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.maps.android.BuildConfig;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.MessageBean;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.bill.TransTypeUtils;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.CheckPayResp;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.req.USSDFundResultReq;
import com.transsnet.palmpay.core.bean.rsp.QueryPaymentRewardRsp;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.fragment.PayLoadingFragment;
import com.transsnet.palmpay.core.ui.fragment.UpgradeT2ReminderFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.AddLinkCardWebFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.BaseCheckPinFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.BaseVerifyFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckAirtimeSharePinFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBankAccountOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBankOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBankPinFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBettingWithdrawOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBirthdayFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckCVVFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckFraudAlertFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckMobileFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPalmPayOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPostPayOtpFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQAFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckUbaBankAccountOTPFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckUssdAirtimeSharePinFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckVoucherCodeFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckWithFaceRecognitionFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.QueryTransactionResultFragment;
import com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IView;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeView;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.internal.operators.observable.C1765q;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/core/pay_verification_page")
public class PayVerificationActivity extends com.transsnet.palmpay.core.base.h implements PayVerificationCallback, CheckPayContract$IView {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f27688C = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p161kf.e f27690B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CheckPayReq f27692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public La.v f27693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CashierPaymentMethodBean f27695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f27696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27697g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27698i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27700o;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f27699j = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f27701p = false;
    public String t = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f27702v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f27703w = new AtomicBoolean(false);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f27689A = false;

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IView
    public final void checkPayFail(String str) {
        showLoadingDialog(false);
        int i7 = p025ba.k.core_title_error_info;
        if (CommonResult.ERROR_MSG_CONNECT_TIMEOUT.equals(str)) {
            i7 = p025ba.k.core_title_attention;
            str = getString(p025ba.k.core_msg_pay_order_time_out);
        }
        O6.c cVar = new O6.c(this);
        cVar.e(i7);
        cVar.f6598d = str;
        cVar.f6605k = true;
        String string = getString(p025ba.k.core_confirm);
        c0 c0Var = new c0(this, 0);
        cVar.f6600f = string;
        cVar.f6602h = c0Var;
        O6.d dVarA = cVar.a();
        dVarA.setCancelable(false);
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.show();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        o();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        if (Build.VERSION.SDK_INT < 35) {
            requestLayoutFullScreen();
        }
        return p025ba.g.core_activity_pay_verification;
    }

    @Override // com.transsnet.palmpay.core.callback.PayVerificationCallback
    public final void gotoAddCardWebPage(String str) {
        initStatusBar(0);
        AddLinkCardWebFragment addLinkCardWebFragment = new AddLinkCardWebFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        addLinkCardWebFragment.setArguments(bundle);
        m(addLinkCardWebFragment);
    }

    @Override // com.transsnet.palmpay.core.callback.PayVerificationCallback
    public final void gotoCheckVoucherCode() {
        initStatusBar(0);
        m(new CheckVoucherCodeFragment());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        getIntent().getIntExtra("receiver_account_type", 0);
        this.f27694d = getIntent().getIntExtra("payer_account_type", 0);
        this.f27692b = (CheckPayReq) getIntent().getSerializableExtra("verify_content");
        this.f27701p = getIntent().getBooleanExtra("key_extra_show_payment_rewards", false);
        this.t = getIntent().getStringExtra("key_extra_detainment_content");
        CheckPayReq checkPayReq = this.f27692b;
        if (checkPayReq != null) {
            this.f27691a = checkPayReq.verifyMethod;
        } else {
            this.f27691a = 7;
        }
        CashierPaymentMethodBean cashierPaymentMethodBean = (CashierPaymentMethodBean) getIntent().getParcelableExtra("payment_method");
        this.f27695e = cashierPaymentMethodBean;
        if (cashierPaymentMethodBean != null) {
            this.f27694d = cashierPaymentMethodBean.senderAccountType;
        }
        this.f27696f = (HashMap) getIntent().getSerializableExtra("key_extra_payment_info");
        this.f27697g = getIntent().getStringExtra("key_extra_calculation_info");
        this.f27698i = getIntent().getBooleanExtra("key_extra_used_new_pay_check", false);
        this.f27699j = getIntent().getBooleanExtra("key_extra_is_withdrawal", false);
        this.f27700o = getIntent().getStringExtra("key_payment_retry_token");
        if (!this.f27702v || p() == null) {
            t(this.f27691a, (PayByOrderResp.DataBean) getIntent().getParcelableExtra("key_pay_response"));
        }
        if (this.f27692b != null) {
            HashMap map = new HashMap();
            map.put(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, this.f27692b.transType);
            map.put(LogConstants.Autotrack.ELEMENT_ORDER_TYPE, this.f27692b.orderType);
            map.put("orderNo", this.f27692b.orderNo);
            map.put(LogConstants.Autotrack.ELEMENT_PAYER_ACCOUNT_TYPE, Integer.valueOf(this.f27694d));
            map.put(LogConstants.Autotrack.ELEMENT_SUB_TRANS_TYPE, this.f27692b.subTransTypeCode);
            map.put(LogConstants.Autotrack.ELEMENT_VERIFY_TYPE, Integer.valueOf(this.f27691a));
            AutoTrackUtil.trackActivityProperties(this, map);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return getIntent().getBooleanExtra("FORCE_NO_NIGHT_MODE", true);
    }

    public final void m(BaseFragment baseFragment) {
        androidx.fragment.app.Z supportFragmentManager = getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(p025ba.e.fragmentContainer, baseFragment, null);
        c1161aE.h(true);
    }

    public final void n() {
        Fragment fragmentD = getSupportFragmentManager().D(p025ba.e.fragmentContainer);
        if (fragmentD != null && (fragmentD instanceof BaseVerifyFragment)) {
            BaseVerifyFragment baseVerifyFragment = (BaseVerifyFragment) fragmentD;
            if (baseVerifyFragment.v()) {
                baseVerifyFragment.onBackPressed();
                return;
            }
        }
        if (this.f27701p) {
            r();
            finish();
            return;
        }
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_payment_not_complete);
        cVar.f6598d = TextUtils.isEmpty(this.t) ? getString(p025ba.k.core_confirm_leave_pin) : this.t;
        String string = getString(p025ba.k.core_leave);
        c0 c0Var = new c0(this, 1);
        cVar.f6601g = string;
        cVar.f6603i = c0Var;
        cVar.d(p025ba.k.core_continue, null);
        cVar.g();
        this.f27701p = true;
    }

    public final void o() {
        if (this.f27689A) {
            F6.d.h("PayVerificationActivity", 3, "finishTopCashierActivity: payment retry，保留收银台");
            return;
        }
        AtomicBoolean atomicBoolean = this.f27703w;
        if (!atomicBoolean.compareAndSet(false, true)) {
            F6.d.h("PayVerificationActivity", 3, "finishTopCashierActivity: 已执行过，跳过重复调用");
            return;
        }
        try {
            List<Activity> activityList = ActivityUtils.getActivityList();
            if (activityList != null && !activityList.isEmpty()) {
                F6.d.h("PayVerificationActivity", 3, "finishTopCashierActivity: 开始查找收银台Activity，当前Activity总数: " + activityList.size());
                for (int size = activityList.size() - 1; size >= 0; size--) {
                    Activity activity = activityList.get(size);
                    if (activity instanceof BaseCoreCashierPreviewActivity) {
                        if (activity.isFinishing()) {
                            F6.d.h("PayVerificationActivity", 3, "finishTopCashierActivity: 收银台Activity已在关闭中");
                            return;
                        }
                        F6.d.h("PayVerificationActivity", 3, "finishTopCashierActivity: 找到并关闭收银台Activity: " + activity.getClass().getSimpleName());
                        activity.finish();
                        return;
                    }
                }
                return;
            }
            F6.d.h("PayVerificationActivity", 5, "finishTopCashierActivity: Activity列表为空");
        } catch (Exception e10) {
            F6.d.c("PayVerificationActivity", "finishTopCashierActivity: 关闭收银台Activity时发生异常", e10);
            atomicBoolean.set(false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f27702v = bundle != null;
        super.onCreate(bundle);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
        La.v vVar = this.f27693c;
        if (vVar != null) {
            vVar.detachView();
        }
        o();
        p161kf.e eVar = this.f27690B;
        if (eVar == null || eVar.isDisposed()) {
            return;
        }
        p161kf.e eVar2 = this.f27690B;
        eVar2.getClass();
        p001if.a.a(eVar2);
        this.f27690B = null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageBean messageBean) {
        if (messageBean == null) {
            return;
        }
        int i7 = messageBean.key;
        if (i7 == 307 || i7 == 308 || i7 == 406) {
            finish();
        }
    }

    public final Fragment p() {
        return getSupportFragmentManager().D(p025ba.e.fragmentContainer);
    }

    @Override // com.transsnet.palmpay.core.callback.PayVerificationCallback
    public final void payLoading() {
        m(new PayLoadingFragment());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        La.v vVar = new La.v();
        this.f27693c = vVar;
        vVar.f27351a = this;
        CheckPayReq checkPayReq = this.f27692b;
        if (checkPayReq != null) {
            vVar.queryPaymentReward(this.f27694d, checkPayReq.transType);
        }
        try {
            List<Activity> activityList = ActivityUtils.getActivityList();
            for (int size = activityList.size() - 1; size >= 0; size--) {
                Activity activity = activityList.get(size);
                if (activity instanceof AbstractActivityC1479m) {
                    activity.finish();
                    return;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void q(CheckPayResp checkPayResp) {
        long jC;
        long jC2;
        if (!"3".equals(this.f27692b.orderType)) {
            boolean z3 = this.f27699j;
        }
        if (!"7".equals(this.f27692b.orderType)) {
            Pa.J j6 = new Pa.J();
            CheckPayReq checkPayReq = this.f27692b;
            j6.f7024c = checkPayReq.orderNo;
            j6.f7022a = checkPayReq.orderType;
            j6.f7025d = checkPayReq.transType;
            j6.f7026e = checkPayReq.payAmount;
            j6.f7027f = checkPayReq.subTransTypeCode;
            j6.f7028g = this.f27697g;
            j6.f7023b = checkPayResp.getData();
            if (Pa.K.a(j6)) {
                finish();
                return;
            }
            return;
        }
        if (!Objects.equals(this.f27692b.transType, TransType.TRANS_TYPE_BIND_BANK_CARD)) {
            Postcard postcardWithString = ARouter.getInstance().build("/main/add_card_complete").withString("payStatus", C0525w.j(checkPayResp.getData().businessData, "payStatus"));
            String str = checkPayResp.getData().businessData;
            String strJ = C0525w.j(str, "errorMsg");
            if (TextUtils.isEmpty(strJ) || TextUtils.equals(strJ, BuildConfig.TRAVIS)) {
                strJ = !TextUtils.isEmpty(C0525w.j(str, "channelErrorCode")) ? C0525w.j(str, "desc") : null;
            }
            postcardWithString.withString("errorMsg", strJ).navigation();
        } else if (!TextUtils.isEmpty(this.f27692b.orderNo)) {
            HashMap map = this.f27696f;
            if (map == null || !map.containsKey("extra_type")) {
                jC = 0;
                jC2 = 0;
            } else {
                jC = Pa.E.c((String) this.f27696f.get("extra_type"));
                jC2 = Pa.E.c((String) this.f27696f.get("extra_entry_type"));
            }
            ARouter.getInstance().build("/cash_in_out/bind_bank_card_result").withParcelable("extra_data", checkPayResp.getData()).withLong("extra_type", jC).withLong("extra_entry_type", jC2).navigation();
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.callback.PayVerificationCallback
    public final void queryDefinitePayResult(String str, String str2) {
        if (this.f27693c != null) {
            showLoadingDialog(true, false);
            CheckPayReq checkPayReq = this.f27692b;
            checkPayReq.token = str;
            checkPayReq.channelTransactionId = str2;
            checkPayReq.endFlag = true;
            if (this.f27698i || TransTypeUtils.isUseNewCashierDesk(checkPayReq.transType)) {
                this.f27693c.querySavingPayResult(this.f27692b);
            } else {
                this.f27693c.queryPayResult(this.f27692b);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.callback.PayVerificationCallback
    public final void queryPayResult(String str, String str2) {
        if (this.f27693c != null) {
            showLoadingDialog(true, false);
            CheckPayReq checkPayReq = this.f27692b;
            checkPayReq.token = str;
            checkPayReq.channelTransactionId = str2;
            checkPayReq.endFlag = false;
            if (this.f27698i || TransTypeUtils.isUseNewCashierDesk(checkPayReq.transType)) {
                this.f27693c.querySavingPayResult(this.f27692b);
            } else {
                this.f27693c.queryPayResult(this.f27692b);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IView
    public final void queryPaymentRewardOk(QueryPaymentRewardRsp queryPaymentRewardRsp) {
        if (queryPaymentRewardRsp.data != null) {
            queryPaymentRewardRsp.isSuccess();
        }
    }

    public final void r() {
        CheckPayReq checkPayReq = this.f27692b;
        if (checkPayReq == null) {
            return;
        }
        String str = checkPayReq.orderNo;
        String str2 = checkPayReq.transType;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        C1765q c1765qI = ((PayApiService) p324va.c.f43141a.f14621b).noticeCashierCloseRx(str2, BaseApplication.get().getUser().getMemberId(), str).k(p298tf.f.f42629b).i(p071ef.b.a());
        p161kf.e eVar = new p161kf.e(p147jf.a.f38600d, p147jf.a.f38601e, p147jf.a.f38599c);
        c1765qI.subscribe(eVar);
        this.f27690B = eVar;
    }

    public final void s(String str, CharSequence charSequence) {
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_title_error_info);
        cVar.f6598d = charSequence;
        cVar.f6605k = true;
        if ("000099".equalsIgnoreCase(str) || "SM000026".equalsIgnoreCase(str)) {
            cVar.d(p025ba.k.core_confirm, null);
        } else if ((!TextUtils.isEmpty(str) && str.startsWith("CFRONT_TCE")) || CommonResult.CODE_OUT_OF_TRANSACTION_LIMIT_ERROR.equalsIgnoreCase(str) || CommonResult.CODE_ACCOUNT_STATE_ERROR.equalsIgnoreCase(str)) {
            cVar.d(p025ba.k.core_confirm, new c0(this, 2));
        } else {
            cVar.d(p025ba.k.core_try_again, new c0(this, 3));
        }
        O6.d dVarA = cVar.a();
        dVarA.setCancelable(false);
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.show();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        org.greenrobot.eventbus.c.b().j(this);
        Handler uIHandler = getUIHandler();
        Pa.e0 e0Var = Pa.g0.f7080h;
        Objects.requireNonNull(e0Var);
        uIHandler.post(new com.transsnet.adsdk.widgets.banner.bannerview.b(e0Var, 6));
    }

    @Override // com.transsnet.palmpay.core.callback.PayVerificationCallback
    public final void showAlertDialog(CharSequence charSequence) {
        s("", charSequence);
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IView
    public final void showCheckPayResult(int i7, CheckPayResp checkPayResp) {
        PinEntryView pinEntryView;
        showLoadingDialog(false);
        if (this.f27692b != null && checkPayResp != null && (i7 == 7 || i7 == 16 || i7 == Integer.MAX_VALUE)) {
            String str = i7 == Integer.MAX_VALUE ? "fingerprint" : "pin";
            if (!checkPayResp.isSuccess() || checkPayResp.getData() == null || checkPayResp.getData().flag) {
                String respCode = checkPayResp.getRespCode();
                checkPayResp.getRespMsg();
                Pair pairU = D3.a.u(respCode);
                D3.a.M(this.f27692b.transType, str, false, (String) pairU.f38891a, (String) pairU.f38892b, D3.a.D(checkPayResp.getRespMsg(), checkPayResp.getRespCode(), null, checkPayResp.isSuccess()));
            } else {
                D3.a.M(this.f27692b.transType, str, true, null, null, null);
            }
        }
        if (checkPayResp.isSuccess() && checkPayResp.getData() != null && Boolean.TRUE.equals(checkPayResp.getData().needPaymentRetry)) {
            MessageEvent messageEvent = new MessageEvent(MessageEvent.EVENT_PAYMENT_RETRY);
            HashMap map = new HashMap();
            map.put("orderNo", this.f27692b.orderNo);
            map.put("transType", this.f27692b.transType);
            if (!TextUtils.isEmpty(checkPayResp.getData().paymentRetryToken)) {
                map.put("paymentRetryToken", checkPayResp.getData().paymentRetryToken);
            }
            messageEvent.setEventContent(C0525w.c(map));
            org.greenrobot.eventbus.c.b().f(messageEvent);
            this.f27689A = true;
            finish();
            return;
        }
        MessageEvent messageEvent2 = new MessageEvent(MessageEvent.EVENT_PAY_ORDER_FINISH);
        HashMap map2 = new HashMap();
        map2.put("orderNo", this.f27692b.orderNo);
        map2.put("transType", this.f27692b.transType);
        if (!TextUtils.isEmpty(this.f27700o)) {
            map2.put("paymentRetryToken", this.f27700o);
        }
        if (checkPayResp.isSuccess() && checkPayResp.getData() != null) {
            map2.put("result", Boolean.valueOf(checkPayResp.isSuccess()));
            map2.put("orderData", checkPayResp.getData().orderData);
        }
        messageEvent2.setEventContent(C0525w.c(map2));
        org.greenrobot.eventbus.c.b().f(messageEvent2);
        if (checkPayResp.isSuccess() && checkPayResp.getData() != null) {
            Fragment fragmentD = getSupportFragmentManager().D(p025ba.e.fragmentContainer);
            if (fragmentD != null && (fragmentD instanceof BaseVerifyFragment)) {
                ((BaseVerifyFragment) fragmentD).w();
            }
            if (checkPayResp.getData().flag) {
                this.f27692b.payId = checkPayResp.getData().payId;
                this.f27692b.subPayId = checkPayResp.getData().subPayId;
                this.f27692b.url = checkPayResp.getData().url;
                this.f27692b.verifyMethod = checkPayResp.getData().verifyMethod;
                this.f27692b.payRouteId = checkPayResp.getData().payRouteId;
                this.f27692b.otpReference = checkPayResp.getData().otpReference;
                this.f27692b.queryMaxSec = checkPayResp.getData().queryMaxSec;
                int i10 = this.f27692b.verifyMethod;
                this.f27691a = i10;
                t(i10, checkPayResp.getData());
                return;
            }
            String str2 = checkPayResp.getData().businessData;
            if (8 == checkPayResp.getData().payStatus) {
                Pa.K.c(this.f27692b.orderType, str2);
                finish();
                return;
            }
            if (!Pa.K.b(Integer.valueOf(checkPayResp.getData().extVerifyMethod), this.f27692b.orderType, str2)) {
                q(checkPayResp);
                return;
            }
            if (checkPayResp.getData().extVerifyMethod != 3) {
                finish();
                return;
            }
            La.v vVar = this.f27693c;
            long j6 = this.f27692b.payAmount;
            String str3 = this.f27695e.bankCode;
            String str4 = checkPayResp.getData().payId;
            CheckPayReq checkPayReq = this.f27692b;
            String str5 = checkPayReq.transType;
            String str6 = checkPayReq.orderNo;
            vVar.getClass();
            USSDFundResultReq uSSDFundResultReq = new USSDFundResultReq();
            uSSDFundResultReq.amout = j6;
            uSSDFundResultReq.bankCode = str3;
            uSSDFundResultReq.payId = str4;
            uSSDFundResultReq.transType = str5;
            ((PayApiService) p324va.c.f43141a.f14621b).getUSSDResult(uSSDFundResultReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new La.u(vVar, str5, str6, j6));
            return;
        }
        if ("7".equals(this.f27692b.orderType)) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_ADD_NEW_CARD_ERROR));
        }
        Fragment fragmentP = p();
        if (i7 == 8) {
            if (fragmentP instanceof CheckPalmPayOtpFragment) {
                CheckPalmPayOtpFragment checkPalmPayOtpFragment = (CheckPalmPayOtpFragment) fragmentP;
                checkPalmPayOtpFragment.getClass();
                String respCode2 = checkPayResp.getRespCode();
                if ("VL000003".equalsIgnoreCase(respCode2) || "VL000004".equalsIgnoreCase(respCode2) || "VL000005".equalsIgnoreCase(respCode2)) {
                    OneTimeCodeView oneTimeCodeViewT = checkPalmPayOtpFragment.t();
                    if (oneTimeCodeViewT != null) {
                        oneTimeCodeViewT.setSendOtcButtonState(true);
                    }
                    OneTimeCodeView oneTimeCodeViewT2 = checkPalmPayOtpFragment.t();
                    if (oneTimeCodeViewT2 != null) {
                        oneTimeCodeViewT2.setError(checkPayResp.getRespMsg());
                    }
                    OneTimeCodeView oneTimeCodeViewT3 = checkPalmPayOtpFragment.t();
                    if (oneTimeCodeViewT3 != null && (pinEntryView = oneTimeCodeViewT3.f28509c) != null) {
                        pinEntryView.setText("");
                    }
                    OneTimeCodeView oneTimeCodeViewT4 = checkPalmPayOtpFragment.t();
                    if (oneTimeCodeViewT4 != null) {
                        oneTimeCodeViewT4.b();
                        return;
                    }
                    return;
                }
            }
        } else if (i7 == 7 || i7 == 16) {
            if ((fragmentP instanceof BaseCheckPinFragment) && ((BaseCheckPinFragment) fragmentP).z(checkPayResp)) {
                return;
            }
        } else if (i7 == 10 && (fragmentP instanceof CheckBankAccountOtpFragment)) {
            CheckBankAccountOtpFragment checkBankAccountOtpFragment = (CheckBankAccountOtpFragment) fragmentP;
            checkBankAccountOtpFragment.getClass();
            String respCode3 = checkPayResp.getRespCode();
            if ("VL000003".equalsIgnoreCase(respCode3) || "VL000004".equalsIgnoreCase(respCode3) || "VL000005".equalsIgnoreCase(respCode3)) {
                checkBankAccountOtpFragment.f27943o.setVisibility(0);
                return;
            }
        }
        if (!"CFRONT_800048".equals(checkPayResp.getRespCode())) {
            s(checkPayResp.getRespCode(), checkPayResp.getRespMsg());
            return;
        }
        String respMsg = checkPayResp.getRespMsg();
        if (BaseApplication.isNG()) {
            showDialogFragment(new UpgradeT2ReminderFragment());
            return;
        }
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_upgrade_reminder);
        cVar.f6598d = respMsg;
        cVar.c(p025ba.k.core_cancel, new ViewOnClickListenerC1478l(4));
        cVar.d(p025ba.k.core_upgrade_now, new c0(this, 4));
        cVar.f6605k = true;
        O6.d dVarA = cVar.a();
        dVarA.setCancelable(false);
        dVarA.setCanceledOnTouchOutside(false);
        if (i0.W(this)) {
            dVarA.show();
        }
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CheckPayContract$IView
    public final void showQueryPayResult(CheckPayResp checkPayResp) {
        showLoadingDialog(false);
        if (!checkPayResp.isSuccess() || checkPayResp.getData() == null) {
            showAlertDialog(checkPayResp.getRespMsg());
            return;
        }
        if (!checkPayResp.getData().flag) {
            q(checkPayResp);
            return;
        }
        this.f27692b.payId = checkPayResp.getData().payId;
        if (!TextUtils.isEmpty(checkPayResp.getData().subPayId)) {
            this.f27692b.subPayId = checkPayResp.getData().subPayId;
        }
        this.f27692b.url = checkPayResp.getData().url;
        this.f27692b.verifyMethod = checkPayResp.getData().verifyMethod;
        t(this.f27692b.verifyMethod, checkPayResp.getData());
    }

    public final void t(int i7, PayByOrderResp.DataBean dataBean) {
        if (i7 == 15) {
            if (p() instanceof CheckBettingWithdrawOtpFragment) {
                if (dataBean.extVerifyMethod != 2) {
                    ToastUtils.showLong(p025ba.k.core_betting_withdraw_opt_wrong);
                    return;
                }
                ToastUtils.showLong(p025ba.k.core_betting_withdraw_opt_invalid);
            }
            CheckPayReq checkPayReq = this.f27692b;
            String str = checkPayReq.orderNo;
            long j6 = checkPayReq.payAmount;
            String str2 = checkPayReq.transType;
            long j10 = checkPayReq.orderAmount;
            long j11 = checkPayReq.feeAmount;
            CheckBettingWithdrawOtpFragment checkBettingWithdrawOtpFragment = new CheckBettingWithdrawOtpFragment();
            Bundle bundle = new Bundle();
            bundle.putString("_order_no", str);
            bundle.putLong("payAmount", j6);
            bundle.putLong("orderAmount", j10);
            bundle.putLong("feeAmount", j11);
            bundle.putString("transType", str2);
            checkBettingWithdrawOtpFragment.setArguments(bundle);
            m(checkBettingWithdrawOtpFragment);
            return;
        }
        if (i7 != 16) {
            if (i7 == 23) {
                initStatusBar(0);
                HashMap map = this.f27696f;
                String str3 = (map == null || !map.containsKey("core_calculation_ext_info")) ? "" : (String) this.f27696f.get("core_calculation_ext_info");
                if (TextUtils.isEmpty(str3) || !str3.toUpperCase().contains("AIRTEL")) {
                    m(CheckAirtimeSharePinFragment.f27934C.newInstance(dataBean));
                    return;
                } else {
                    m(CheckUssdAirtimeSharePinFragment.f28035L.newInstance(dataBean, this.f27692b, str3));
                    return;
                }
            }
            if (i7 == 24) {
                if (p() instanceof CheckWithFaceRecognitionFragment) {
                    return;
                }
                initStatusBar(getColor(L6.b.ppColorBackgroundLight));
                m(CheckWithFaceRecognitionFragment.f28049B.newInstance(dataBean));
                return;
            }
            if (i7 == 30) {
                m(CheckFraudAlertFragment.f27979w.newInstance(dataBean));
                return;
            }
            if (i7 == 31) {
                initStatusBar(0, true);
                m(CheckSafetyAssessmentQAFragment.f28014A.newInstance(dataBean));
                return;
            }
            if (i7 == 99) {
                int i10 = this.f27692b.queryMaxSec;
                if (p() instanceof QueryTransactionResultFragment) {
                    return;
                }
                initStatusBar(getColor(L6.b.ppColorBackgroundLight));
                CheckPayReq checkPayReq2 = this.f27692b;
                boolean z3 = this.f27698i;
                QueryTransactionResultFragment queryTransactionResultFragment = new QueryTransactionResultFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("_wait_time", i10);
                bundle2.putBoolean("_use_new_pay_check", z3);
                bundle2.putSerializable("_checkpayreq", checkPayReq2);
                queryTransactionResultFragment.setArguments(bundle2);
                m(queryTransactionResultFragment);
                return;
            }
            switch (i7) {
                case 1:
                    initStatusBar(0);
                    m(CheckBankPinFragment.f27954A.newInstance());
                    break;
                case 2:
                    String string = getString(p025ba.k.core_confirm_otc);
                    if (dataBean != null && !TextUtils.isEmpty(dataBean.promptMessage)) {
                        string = dataBean.promptMessage;
                    }
                    initStatusBar(0);
                    m(CheckBankOtpFragment.f27947B.newInstance(string));
                    break;
                case 3:
                case 11:
                    initStatusBar(0);
                    m(CheckBirthdayFragment.f27967w.newInstance(i7, dataBean != null ? dataBean.errorMsg : null));
                    break;
                case 4:
                    if (!(p() instanceof CheckMobileFragment)) {
                        initStatusBar(0);
                        String str4 = this.f27692b.bankCardNo;
                        CheckMobileFragment checkMobileFragment = new CheckMobileFragment();
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("card_no", str4);
                        checkMobileFragment.setArguments(bundle3);
                        m(checkMobileFragment);
                        break;
                    }
                    break;
                case 5:
                    gotoAddCardWebPage(this.f27692b.url);
                    break;
                case 6:
                    gotoCheckVoucherCode();
                    break;
                case 8:
                    if (!(p() instanceof CheckPalmPayOtpFragment)) {
                        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
                        m(CheckPalmPayOtpFragment.f27988o.newInstance());
                        break;
                    }
                    break;
                case 9:
                    if (!(p() instanceof CheckCVVFragment)) {
                        initStatusBar(0);
                        m(CheckCVVFragment.f27973A.newInstance());
                        break;
                    }
                    break;
                case 10:
                    if (!(p() instanceof CheckBankAccountOtpFragment)) {
                        String str5 = dataBean == null ? this.f27692b.otpReference : dataBean.otpReference;
                        if (!TextUtils.isEmpty(str5)) {
                            CheckBankAccountOtpFragment checkBankAccountOtpFragment = new CheckBankAccountOtpFragment();
                            Bundle bundle4 = new Bundle();
                            bundle4.putString("otp_reference", str5);
                            checkBankAccountOtpFragment.setArguments(bundle4);
                            m(checkBankAccountOtpFragment);
                            break;
                        }
                    }
                    break;
                case 12:
                    if (!(p() instanceof CheckPostPayOtpFragment) && dataBean != null) {
                        m(CheckPostPayOtpFragment.f28004B.newInstance(dataBean.otpReference, dataBean.payId, dataBean.errorMsg));
                        break;
                    }
                    break;
                case 13:
                    if (!(p() instanceof CheckUbaBankAccountOTPFragment)) {
                        String str6 = dataBean == null ? this.f27692b.otpReference : dataBean.otpReference;
                        if (!TextUtils.isEmpty(str6)) {
                            m(CheckUbaBankAccountOTPFragment.f28025L.newInstance(str6, dataBean != null ? dataBean.promptMessage : null));
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        if (p() instanceof BaseCheckPinFragment) {
            return;
        }
        CheckPayReq checkPayReq3 = this.f27692b;
        if (checkPayReq3 != null && dataBean != null) {
            checkPayReq3.showPayAmount = dataBean.showPayAmount;
        }
        m(BaseCheckPinFragment.f27928A.newInstance(checkPayReq3));
    }

    @Override // com.transsnet.palmpay.core.callback.PayVerificationCallback
    public final void verifyPayMethod(String str, int i7) {
        if (this.f27693c != null) {
            showLoadingDialog(true, false);
            CheckPayReq checkPayReq = this.f27692b;
            checkPayReq.verifyCode = str;
            int i10 = this.f27691a;
            checkPayReq.verifyMethod = i10 == 16 ? i10 : i7;
            if (i7 == Integer.MAX_VALUE) {
                if (i10 != 16) {
                    i10 = 7;
                }
                checkPayReq.verifyMethod = i10;
            }
            String str2 = checkPayReq.orderType;
            if (this.f27699j) {
                this.f27693c.checkWithdrawalPay(checkPayReq);
            } else if (this.f27698i || TransTypeUtils.isUseNewCashierDesk(checkPayReq.transType)) {
                this.f27693c.checkNewPay(this.f27692b);
            } else {
                this.f27693c.checkPay(this.f27692b);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.callback.PayVerificationCallback
    public final void verifyPayMethodWithReference(String str, int i7, String str2) {
        this.f27692b.otpReference = str2;
        verifyPayMethod(str, i7);
    }
}
