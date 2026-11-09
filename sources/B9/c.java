package B9;

import android.view.View;
import com.transsnet.palmpay.cash_in.ui.activity.ConfirmAndPayWithdrawOrderActivity;
import com.transsnet.palmpay.cash_in.ui.dialog.SelectPaymentBankCardDialog;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.core.bean.MessageBean;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p025ba.k;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SelectPaymentBankCardDialog f570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BankCardInfo f571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public User f572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f575f = new a(this);

    public static void l(ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity, String str) {
        confirmAndPayWithdrawOrderActivity.getClass();
        O6.c cVar = new O6.c(confirmAndPayWithdrawOrderActivity);
        cVar.e(k.core_title_error_info);
        cVar.f6598d = str;
        cVar.d(k.core_confirm, new A8.b(confirmAndPayWithdrawOrderActivity, 16));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void initData() {
        SelectPaymentBankCardDialog selectPaymentBankCardDialog = new SelectPaymentBankCardDialog(this);
        this.f570a = selectPaymentBankCardDialog;
        selectPaymentBankCardDialog.setAddBankCardTitle(getString(k.core_add_bank_card));
        this.f570a.setDialogTitle(getString(k.core_select_bank_account));
        this.f570a.setCallBack(this.f575f);
        org.greenrobot.eventbus.c.b().j(this);
        new ArrayList();
        this.f572c = BaseApplication.getInstance().getUserDataSource().b();
    }

    public final void m() {
        if (this.f571b == null) {
            ToastUtils.showShort("please select a bank account");
            return;
        }
        PayByOrderReq payByOrderReq = new PayByOrderReq();
        payByOrderReq.amount = this.f573d;
        payByOrderReq.currency = BaseApplication.getCurrency();
        payByOrderReq.orderNo = this.f574e;
        payByOrderReq.orderType = "3";
        payByOrderReq.payType = 1;
        payByOrderReq.payerAccountId = this.f572c.getBalanceAccountId();
        BankCardInfo bankCardInfo = this.f571b;
        payByOrderReq.payerCardCvv = bankCardInfo.cvv;
        payByOrderReq.payerCardExpiryMon = bankCardInfo.expiryMonth;
        payByOrderReq.payerCardExpiryYear = bankCardInfo.expiryYear;
        payByOrderReq.payerBankAccountNo = bankCardInfo.bankAccountNo;
        payByOrderReq.payerBankCode = bankCardInfo.bankCode;
        if ("MobileWallet".equals(bankCardInfo.accountType)) {
            BankCardInfo bankCardInfo2 = this.f571b;
            payByOrderReq.walletChannel = bankCardInfo2.bankCode;
            payByOrderReq.walletPhone = bankCardInfo2.phone;
        }
        payByOrderReq.reUseable = 1;
        payByOrderReq.amount = this.f573d;
        payByOrderReq.currency = BaseApplication.getCurrency();
        payByOrderReq.orderNo = this.f574e;
        payByOrderReq.payType = 7;
        payByOrderReq.transType = "02";
        ConfirmAndPayWithdrawOrderActivity confirmAndPayWithdrawOrderActivity = (ConfirmAndPayWithdrawOrderActivity) this;
        PreviewPayInfoResp.DataBean dataBean = confirmAndPayWithdrawOrderActivity.f26836M;
        payByOrderReq.cacheKey = dataBean != null ? dataBean.cacheKey : null;
        ((PayApiService) p324va.c.f43141a.f14621b).payByNewOrderNoV2(payByOrderReq).k(f.f42629b).i(p071ef.b.a()).subscribe(new b(confirmAndPayWithdrawOrderActivity));
    }

    public abstract void n();

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageBean messageBean) {
        if (messageBean != null && messageBean.key == 19) {
            Object obj = messageBean.msg;
            if (obj instanceof BankCardInfo) {
                String str = ((BankCardInfo) obj).bankAccountNo;
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void setupView() {
        initStatusBar(true);
        setWindowBackground(p.cv_preview_window_bg);
        View viewFindViewById = findViewById(s.ivBack);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new A8.b(this, 15));
        }
    }
}
