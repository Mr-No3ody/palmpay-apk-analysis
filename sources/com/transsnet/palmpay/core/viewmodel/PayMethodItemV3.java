package com.transsnet.palmpay.core.viewmodel;

import C0.G;
import Pa.r0;
import android.content.Context;
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
public class PayMethodItemV3 extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f28548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28552g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f28553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f28554j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f28555o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f28556p;
    public PaymentMethod t;

    public PayMethodItemV3(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, g.core_model_bank_card_item_v3, this);
        this.f28553i = findViewById(e.mbci_root);
        this.f28548c = (ImageView) findViewById(e.mbci_access_bank_iv);
        this.f28549d = (TextView) findViewById(e.mbci_bankname_tv);
        this.f28550e = (TextView) findViewById(e.mbci_bank_card_number_tv);
        this.f28554j = (ImageView) findViewById(e.mbci_right_iv);
        this.f28555o = (TextView) findViewById(e.cii_apply_tv);
        this.f28556p = findViewById(e.mbci_bottom_line);
        this.f28551f = (TextView) findViewById(e.mbci_hint1);
        this.f28552g = (TextView) findViewById(e.mbci_hint2);
        return this;
    }

    public final void d(PaymentMethod paymentMethod, boolean z3) {
        setEnabled(z3);
        View view = this.f28553i;
        if (view != null) {
            view.setEnabled(z3);
        }
        if (z3) {
            if (paymentMethod == null || TextUtils.isEmpty(paymentMethod.acTips)) {
                this.f28551f.setVisibility(8);
            } else {
                TextView textView = this.f28551f;
                String str = paymentMethod.acTips;
                if (textView != null) {
                    if (TextUtils.isEmpty(str)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setTextColor(-1);
                        textView.setBackgroundResource(r.cv_button_bg_yellow_corner_2);
                        textView.setText(str);
                        textView.setVisibility(0);
                    }
                }
            }
            this.f28548c.setAlpha(1.0f);
            this.f28549d.setAlpha(1.0f);
            this.f28550e.setAlpha(1.0f);
        } else {
            this.f28551f.setVisibility(8);
            this.f28548c.setAlpha(0.6f);
            this.f28549d.setAlpha(0.5f);
            this.f28550e.setAlpha(0.5f);
        }
        this.f28555o.setVisibility(8);
    }

    public final void e(String str) {
        if (this.f28551f == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f28551f.setVisibility(8);
            return;
        }
        this.f28551f.setVisibility(0);
        this.f28551f.setTextColor(this.f31417a.getColor(L6.b.ppColorTextPrimary));
        this.f28551f.setBackground(null);
        this.f28551f.setText(str);
    }

    public PaymentMethod getPaymethodMethod() {
        return this.t;
    }

    public void setBankCardInfo(BankCardInfo bankCardInfo) {
        if (TextUtils.isEmpty(bankCardInfo.bankName)) {
            this.f28549d.setText("");
        } else {
            this.f28549d.setText(r0.g0(bankCardInfo.bankName));
        }
        if ("MobileWallet".equals(bankCardInfo.accountType)) {
            r0.o1(bankCardInfo.bankUrl, this.f28548c);
            this.f28549d.setText(r0.g0(bankCardInfo.bankName));
            return;
        }
        int i7 = bankCardInfo.payeeAccountType;
        if (i7 == 8) {
            r0.s1(this.f28548c, r.cv_mobile_wallet);
            StringBuilder sb2 = new StringBuilder("(");
            if (!TextUtils.isEmpty(bankCardInfo.phone)) {
                sb2.append(r0.D0(bankCardInfo.phone));
            }
            sb2.append(")");
            this.f28550e.setText(sb2.toString());
            return;
        }
        if (i7 == 1) {
            this.f28548c.setImageResource(r.cv_palmpay_icon_circle_purple);
            this.f28550e.setText("");
            return;
        }
        r0.o1(bankCardInfo.bankUrl, this.f28548c);
        if (TextUtils.isEmpty(bankCardInfo.bankName)) {
            if (!TextUtils.isEmpty(bankCardInfo.cardNo)) {
                this.f28550e.setText(r0.I(bankCardInfo.cardNo));
                return;
            } else {
                if (TextUtils.isEmpty(bankCardInfo.bankAccountNo)) {
                    return;
                }
                this.f28550e.setText(r0.G(bankCardInfo.bankAccountNo));
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
        this.f28550e.setText(sb3.toString());
    }

    public void setPaymentMethod(PaymentMethod pm) {
        this.t = pm;
        AutoTrackUtil.addViewRemark(this.f28553i, pm.bankName);
        d(pm, true);
        int i7 = pm.senderAccountType;
        if (i7 == 1) {
            AutoTrackUtil.addViewRemark(this.f28553i, this.f31417a.getString(k.core_palmpay_payment_balance));
            this.f28548c.setImageResource(r.cv_palmpay_icon_circle_purple);
            this.f28549d.setText(k.core_palmpay_payment_balance);
            this.f28550e.setText(" (" + r0.B(pm.availableBalance, false) + ")");
            if (pm.availableBalance < 0) {
                d(null, true);
                e(this.f31417a.getString(k.core_insufficient_balance_and_top_up));
                this.f28555o.setText(k.core_add_money);
                this.f28555o.setVisibility(0);
            }
            if (TextUtils.isEmpty(pm.okcardTips)) {
                this.f28552g.setVisibility(8);
                return;
            } else {
                this.f28552g.setText(pm.okcardTips);
                this.f28552g.setVisibility(0);
                return;
            }
        }
        if (i7 == 5 || i7 == 12) {
            this.f28549d.setText(pm.bankName);
            if (TextUtils.isEmpty(pm.cardNo)) {
                e("");
            } else {
                e(r0.I(pm.cardNo));
            }
            r0.o1(pm.bankUrl, this.f28548c);
            if (TextUtils.isEmpty(pm.okcardTips)) {
                this.f28552g.setVisibility(8);
                return;
            } else {
                this.f28552g.setText(pm.okcardTips);
                this.f28552g.setVisibility(0);
                return;
            }
        }
        if (i7 == 6) {
            this.f28549d.setText(pm.bankName);
            if (!TextUtils.isEmpty(pm.bankAccountNo)) {
                e(r0.G(pm.bankAccountNo));
            }
            if (!TextUtils.isEmpty(pm.cardNo)) {
                e(r0.G(pm.cardNo));
            }
            r0.o1(pm.bankUrl, this.f28548c);
            if (TextUtils.isEmpty(pm.okcardTips)) {
                this.f28552g.setVisibility(8);
                return;
            } else {
                this.f28552g.setText(pm.okcardTips);
                this.f28552g.setVisibility(0);
                return;
            }
        }
        if (i7 == 8 || i7 == 13) {
            this.f28549d.setText(pm.bankName);
            this.f28550e.setText(" (" + r0.D0(pm.bankAccountNo) + ")");
            r0.u1(this.f28548c, pm.bankUrl, r.cv_operator_icon);
            if (TextUtils.isEmpty(pm.okcardTips)) {
                this.f28552g.setVisibility(8);
                return;
            } else {
                this.f28552g.setText(pm.okcardTips);
                this.f28552g.setVisibility(0);
                return;
            }
        }
        if (i7 == 23) {
            this.f28549d.setText(r0.g0(pm.bankName));
            if (TextUtils.isEmpty(pm.cardNo)) {
                this.f28550e.setText("");
            } else {
                G.y("(", r0.I(pm.cardNo), ")", this.f28550e);
            }
            r0.o1(pm.bankUrl, this.f28548c);
            if (TextUtils.isEmpty(pm.okcardTips)) {
                this.f28552g.setVisibility(8);
                return;
            } else {
                this.f28552g.setText(pm.okcardTips);
                this.f28552g.setVisibility(0);
                return;
            }
        }
        if (i7 == 28) {
            this.f28548c.setImageResource(r.cv_ok_card_icon);
            this.f28549d.setText(k.core_oc_limit);
            AutoTrackUtil.addViewRemark(this.f28553i, this.f31417a.getString(k.core_oc_limit));
            this.f28550e.setText(" (" + r0.B(pm.availableBalance, false) + ")");
            boolean z3 = pm.enable;
            if (z3 && pm.availableBalance < 0) {
                d(null, true);
                e(this.f31417a.getString(k.core_insufficient_balance));
            } else if (z3) {
                d(pm, true);
            } else {
                d(pm, false);
            }
            if (TextUtils.isEmpty(pm.okcardTips)) {
                this.f28552g.setVisibility(8);
            } else {
                this.f28552g.setText(pm.okcardTips);
                this.f28552g.setVisibility(0);
            }
        }
    }

    public void setViewHeight(int h7) {
        this.f28553i.getLayoutParams().height = h7;
    }

    public PayMethodItemV3(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PayMethodItemV3(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
