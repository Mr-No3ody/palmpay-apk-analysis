package com.transsnet.palmpay.core.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CheckPayReq f27748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PayByOrderResp f27749c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CashierPaymentMethodBean f27751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f27752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27754h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f27759m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f27750d = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27755i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f27756j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27757k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f27758l = false;

    public d0(Context context) {
        this.f27747a = context;
    }

    public final void a() {
        Intent intent = new Intent(this.f27747a, (Class<?>) PayVerificationActivity.class);
        PayByOrderResp payByOrderResp = this.f27749c;
        if (payByOrderResp != null) {
            intent.putExtra("key_pay_response", payByOrderResp.getData());
        }
        CashierPaymentMethodBean cashierPaymentMethodBean = this.f27751e;
        if (cashierPaymentMethodBean != null) {
            intent.putExtra("payment_method", cashierPaymentMethodBean);
        }
        CheckPayReq checkPayReq = this.f27748b;
        if (checkPayReq != null) {
            intent.putExtra("verify_content", checkPayReq);
        }
        Integer num = this.f27750d;
        if (num != null) {
            intent.putExtra("receiver_account_type", num);
        }
        HashMap map = this.f27752f;
        if (map != null) {
            intent.putExtra("key_extra_payment_info", map);
        }
        String str = this.f27754h;
        if (str != null) {
            intent.putExtra("key_extra_calculation_info", str);
        }
        String str2 = this.f27753g;
        if (str2 != null) {
            intent.putExtra("key_extra_detainment_content", str2);
        }
        intent.putExtra("key_extra_show_payment_rewards", this.f27755i);
        intent.putExtra("FORCE_NO_NIGHT_MODE", this.f27757k);
        intent.putExtra("key_extra_used_new_pay_check", this.f27756j);
        intent.putExtra("key_extra_is_withdrawal", this.f27758l);
        if (!TextUtils.isEmpty(this.f27759m)) {
            intent.putExtra("key_payment_retry_token", this.f27759m);
        }
        ActivityUtils.startActivity(intent);
    }
}
