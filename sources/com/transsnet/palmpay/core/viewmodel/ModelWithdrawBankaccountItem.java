package com.transsnet.palmpay.core.viewmodel;

import C0.G;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.r;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class ModelWithdrawBankaccountItem extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f28433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public IconicsImageView f28437g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f28438i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f28439j;

    public ModelWithdrawBankaccountItem(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, g.core_withdraw_bank_account_item, this);
        this.f28438i = (ImageView) findViewById(e.mbci_iv_icon);
        this.f28436f = (TextView) findViewById(e.mbci_tv_line1);
        this.f28433c = (TextView) findViewById(e.mbci_tv_line2);
        this.f28434d = (TextView) findViewById(e.mbci_tv_line3);
        this.f28435e = (TextView) findViewById(e.cwb_auth_name);
        this.f28439j = (ImageView) findViewById(e.cwb_authed_iv);
        this.f28437g = (IconicsImageView) findViewById(e.mbci_iv_arrow);
        setPaymentMethod(null);
        return this;
    }

    public final void d(boolean z3) {
        this.f28436f.setAlpha(1.0f);
        this.f28433c.setAlpha(1.0f);
        this.f28438i.setAlpha(1.0f);
        this.f28437g.setAlpha(1.0f);
    }

    public void setPaymentMethod(PaymentMethod payMethod) {
        if (payMethod == null) {
            if (BaseApplication.isNG()) {
                this.f28436f.setText(k.core_add_a_withdrawl_account);
            } else {
                this.f28436f.setText(k.core_select_payment_method_title);
            }
            this.f28433c.setVisibility(8);
            return;
        }
        this.f28433c.setVisibility(0);
        this.f28434d.setText(this.f31417a.getString(k.core_value_x, payMethod.userName));
        if (payMethod.authFlag == 1) {
            this.f28439j.setVisibility(0);
            this.f28435e.setText(k.core_verified_recipient_name);
        } else {
            this.f28439j.setVisibility(8);
            this.f28435e.setText(k.core_recipient_name);
        }
        int i7 = payMethod.senderAccountType;
        if (i7 == 5 || i7 == 12) {
            if (TextUtils.isEmpty(payMethod.cardNo)) {
                this.f28433c.setText("");
            } else {
                this.f28433c.setText(r0.I(payMethod.cardNo));
            }
            if (!TextUtils.isEmpty(payMethod.bankName)) {
                this.f28436f.setText(payMethod.bankName);
            }
            r0.o1(payMethod.bankUrl, this.f28438i);
            d(true);
            return;
        }
        if (i7 == 6) {
            if (!TextUtils.isEmpty(payMethod.bankAccountNo)) {
                G.y("(", r0.G(payMethod.bankAccountNo), ")", this.f28433c);
            }
            if (!TextUtils.isEmpty(payMethod.cardNo)) {
                G.y("(", r0.G(payMethod.cardNo), ")", this.f28433c);
            }
            if (!TextUtils.isEmpty(payMethod.bankName)) {
                this.f28436f.setText(payMethod.bankName);
            }
            r0.o1(payMethod.bankUrl, this.f28438i);
            d(true);
            return;
        }
        if (i7 == 1) {
            this.f28433c.setText(r0.B(payMethod.availableBalance, false));
            this.f28436f.setText(k.core_palmpay_payment_balance);
            r0.s1(this.f28438i, r.cv_palmpay_icon_circle_purple);
            return;
        }
        if (i7 == 8 || i7 == 13) {
            if (!TextUtils.isEmpty(payMethod.bankAccountNo)) {
                this.f28433c.setText(r0.D0(payMethod.bankAccountNo));
            } else if (TextUtils.isEmpty(payMethod.phone)) {
                this.f28433c.setText("");
            } else {
                this.f28433c.setText(r0.w0(payMethod.phone));
            }
            if (!TextUtils.isEmpty(payMethod.bankName)) {
                this.f28436f.setText(payMethod.bankName);
            }
            r0.o1(payMethod.bankUrl, this.f28438i);
            return;
        }
        if (i7 != 23) {
            if (i7 == 28) {
                G.y("(", r0.B(payMethod.availableBalance, false), ")", this.f28433c);
                this.f28436f.setText(k.core_oc_limit);
                r0.s1(this.f28438i, r.cv_ok_card_icon);
                return;
            }
            return;
        }
        this.f28433c.setVisibility(8);
        if (!TextUtils.isEmpty(payMethod.bankName)) {
            this.f28436f.setText(payMethod.bankName + " (USSD)");
        }
        r0.o1(payMethod.bankUrl, this.f28438i);
        d(true);
    }

    public ModelWithdrawBankaccountItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelWithdrawBankaccountItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
