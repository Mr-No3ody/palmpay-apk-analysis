package com.transsnet.palmpay.core.viewmodel;

import C0.G;
import Pa.r0;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.r;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class PayMethodItem extends BaseModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f28527A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f28528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28532g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f28533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f28534j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f28535o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f28536p;
    public View t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f28537v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f28538w;

    public PayMethodItem(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, g.core_model_bank_card_item, this);
        this.f28533i = findViewById(e.mbci_root);
        this.f28528c = (ImageView) findViewById(e.mbci_access_bank_iv);
        this.f28529d = (TextView) findViewById(e.mbci_bankname_tv);
        this.f28530e = (TextView) findViewById(e.mbci_bank_card_number_tv);
        this.f28534j = (ImageView) findViewById(e.mbci_right_iv);
        this.f28535o = (TextView) findViewById(e.cii_apply_tv);
        this.f28536p = findViewById(e.mbci_bottom_line);
        this.f28531f = (TextView) findViewById(e.mbci_hint1);
        this.f28532g = (TextView) findViewById(e.mbci_hint2);
        this.t = findViewById(e.mbci_mantle);
        this.f28537v = (TextView) findViewById(e.mbci_expire);
        this.f28538w = (TextView) findViewById(e.mbci_recent);
        this.f28527A = (TextView) findViewById(e.mbci_discount_amount_tv);
        return this;
    }

    public final void d(PaymentMethod paymentMethod, boolean z3) {
        setEnabled(z3);
        View view = this.f28533i;
        if (view != null) {
            view.setEnabled(z3);
        }
        if (z3) {
            if (paymentMethod == null || TextUtils.isEmpty(paymentMethod.acTips)) {
                this.f28531f.setVisibility(8);
            } else {
                f(this.f28531f, paymentMethod.acTips);
            }
            this.f28528c.setAlpha(1.0f);
            this.f28529d.setAlpha(1.0f);
            this.f28530e.setAlpha(1.0f);
        } else {
            this.f28531f.setVisibility(8);
            this.f28528c.setAlpha(0.6f);
            this.f28529d.setAlpha(0.5f);
            this.f28530e.setAlpha(0.5f);
        }
        this.f28535o.setVisibility(8);
        this.f28534j.setVisibility(0);
    }

    public final void e(PaymentMethod paymentMethod, long j6) {
        AutoTrackUtil.addViewRemark(this.f28533i, paymentMethod.bankName);
        d(paymentMethod, true);
        this.f28530e.setText("");
        this.f28527A.setVisibility(8);
        int i7 = paymentMethod.senderAccountType;
        if (i7 == 1) {
            AutoTrackUtil.addViewRemark(this.f28533i, this.f31417a.getString(k.core_palmpay_payment_balance));
            this.f28528c.setImageResource(r.cv_palmpay_icon_circle_purple);
            this.f28529d.setText(k.core_palmpay_payment_balance);
            this.f28530e.setText(" (" + r0.B(paymentMethod.availableBalance, false) + ")");
            if (paymentMethod.availableBalance < j6) {
                d(null, true);
                g(this.f31417a.getString(k.core_insufficient_balance_and_top_up));
                this.f28535o.setText(k.core_add_money);
                this.f28535o.setVisibility(0);
                this.f28534j.setVisibility(8);
            } else {
                d(null, paymentMethod.enable);
            }
            if (TextUtils.isEmpty(paymentMethod.acTips)) {
                return;
            }
            f(this.f28531f, paymentMethod.acTips);
            return;
        }
        if (i7 == 40) {
            this.f28528c.setImageResource(r.cv_cash_box_icon_circle_cashier);
            this.f28529d.setText(this.f31417a.getString(k.core_palmpay_payment_cash_box) + " (" + r0.B(paymentMethod.availableBalance, true) + ")");
            if (!TextUtils.isEmpty(paymentMethod.acTips)) {
                f(this.f28531f, paymentMethod.acTips);
            }
            d(null, paymentMethod.availableBalance >= j6 && paymentMethod.enable);
            return;
        }
        if (i7 == 5 || i7 == 12) {
            this.f28529d.setText(paymentMethod.bankName);
            if (TextUtils.isEmpty(paymentMethod.cardNo)) {
                g("");
            } else {
                g(r0.I(paymentMethod.cardNo));
            }
            r0.o1(paymentMethod.bankUrl, this.f28528c);
            return;
        }
        if (i7 == 6) {
            this.f28529d.setText(paymentMethod.bankName);
            if (!TextUtils.isEmpty(paymentMethod.bankAccountNo)) {
                g(r0.G(paymentMethod.bankAccountNo));
            }
            if (!TextUtils.isEmpty(paymentMethod.cardNo)) {
                g(r0.G(paymentMethod.cardNo));
            }
            r0.o1(paymentMethod.bankUrl, this.f28528c);
            return;
        }
        if (i7 == 8 || i7 == 13) {
            this.f28529d.setText(paymentMethod.bankName);
            this.f28530e.setText(" (" + r0.D0(paymentMethod.bankAccountNo) + ")");
            r0.u1(this.f28528c, paymentMethod.bankUrl, r.cv_operator_icon);
            return;
        }
        if (i7 == 23) {
            this.f28529d.setText(r0.g0(paymentMethod.bankName));
            if (TextUtils.isEmpty(paymentMethod.cardNo)) {
                this.f28530e.setText("");
            } else {
                G.y("(", r0.I(paymentMethod.cardNo), ")", this.f28530e);
            }
            r0.o1(paymentMethod.bankUrl, this.f28528c);
            return;
        }
        if (i7 == 28 || paymentMethod.payType == 36) {
            this.f28528c.setImageResource(r.cv_ok_card_icon);
            if (paymentMethod.installmentRaiseAmountEnable || paymentMethod.installmentActiveGuide) {
                this.f28529d.setText(k.core_okcard_instalments);
                g(this.f31417a.getString(k.core_buy_now_pay_later));
                if (TextUtils.isEmpty(paymentMethod.okcardTips)) {
                    this.f28532g.setVisibility(8);
                } else {
                    this.f28532g.setText(paymentMethod.okcardTips);
                    this.f28532g.setVisibility(0);
                }
                this.f28535o.setVisibility(0);
                this.f28535o.setText(k.core_apply);
                this.f28534j.setVisibility(8);
                return;
            }
            this.f28529d.setText(k.core_oc_limit);
            AutoTrackUtil.addViewRemark(this.f28533i, this.f31417a.getString(k.core_oc_limit));
            this.f28530e.setText(" (" + r0.B(paymentMethod.availableBalance, false) + ")");
            boolean z3 = paymentMethod.enable;
            if (z3 && paymentMethod.availableBalance < j6) {
                d(null, true);
                g(this.f31417a.getString(k.core_insufficient_balance));
            } else if (z3) {
                d(paymentMethod, true);
            } else {
                d(paymentMethod, false);
            }
            if (TextUtils.isEmpty(paymentMethod.tips)) {
                return;
            }
            g(paymentMethod.tips);
            if (TextUtils.isEmpty(paymentMethod.tipsColor)) {
                return;
            }
            try {
                this.f28531f.setTextColor(Color.parseColor(paymentMethod.tipsColor));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void f(TextView textView, String str) {
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setTextColor(-1);
        textView.setBackgroundResource(r.cv_button_bg_yellow_corner_2);
        textView.setText(str);
        textView.setVisibility(0);
    }

    public final void g(String str) {
        if (this.f28531f == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f28531f.setVisibility(8);
            return;
        }
        this.f28531f.setVisibility(0);
        this.f28531f.setTextColor(this.f31417a.getColor(L6.b.ppColorTextPrimary));
        this.f28531f.setBackground(null);
        this.f28531f.setText(str);
    }

    public void setBankCardInfo(BankCardInfo bankCardInfo) {
        if (TextUtils.isEmpty(bankCardInfo.bankName)) {
            this.f28529d.setText("");
        } else {
            this.f28529d.setText(r0.g0(bankCardInfo.bankName));
        }
        if ("MobileWallet".equals(bankCardInfo.accountType)) {
            r0.o1(bankCardInfo.bankUrl, this.f28528c);
            this.f28529d.setText(r0.g0(bankCardInfo.bankName));
            return;
        }
        int i7 = bankCardInfo.payeeAccountType;
        if (i7 == 8) {
            r0.s1(this.f28528c, r.cv_mobile_wallet);
            StringBuilder sb2 = new StringBuilder("(");
            if (!TextUtils.isEmpty(bankCardInfo.phone)) {
                sb2.append(r0.D0(bankCardInfo.phone));
            }
            sb2.append(")");
            this.f28530e.setText(sb2.toString());
            return;
        }
        if (i7 == 1) {
            this.f28528c.setImageResource(r.cv_palmpay_icon_circle_purple);
            this.f28530e.setText("");
            return;
        }
        r0.o1(bankCardInfo.bankUrl, this.f28528c);
        if (TextUtils.isEmpty(bankCardInfo.bankName)) {
            if (!TextUtils.isEmpty(bankCardInfo.cardNo)) {
                this.f28530e.setText(r0.I(bankCardInfo.cardNo));
                return;
            } else {
                if (TextUtils.isEmpty(bankCardInfo.bankAccountNo)) {
                    return;
                }
                this.f28530e.setText(r0.G(bankCardInfo.bankAccountNo));
                return;
            }
        }
        StringBuilder sb3 = new StringBuilder("(");
        if (!TextUtils.isEmpty(bankCardInfo.cardNo)) {
            sb3.append(r0.I(bankCardInfo.cardNo));
        } else if (!TextUtils.isEmpty(bankCardInfo.bankAccountNo)) {
            sb3.append(r0.G(bankCardInfo.bankAccountNo));
        }
        sb3.append(")");
        this.f28530e.setText(sb3.toString());
    }

    public void setPaymentMethod(PaymentMethod pm) {
        e(pm, 0L);
    }

    public void setViewHeight(int h7) {
        this.f28533i.getLayoutParams().height = h7;
    }

    public PayMethodItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PayMethodItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
