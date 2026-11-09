package com.transsnet.palmpay.core.viewmodel;

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
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class PayMethodItemV2 extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f28539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28543g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f28544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f28545j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f28546o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f28547p;

    public PayMethodItemV2(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, g.core_model_bank_card_item, this);
        this.f28544i = findViewById(e.mbci_root);
        this.f28539c = (ImageView) findViewById(e.mbci_access_bank_iv);
        this.f28540d = (TextView) findViewById(e.mbci_bankname_tv);
        this.f28541e = (TextView) findViewById(e.mbci_bank_card_number_tv);
        this.f28545j = (ImageView) findViewById(e.mbci_right_iv);
        this.f28546o = (TextView) findViewById(e.cii_apply_tv);
        this.f28547p = findViewById(e.mbci_bottom_line);
        this.f28542f = (TextView) findViewById(e.mbci_hint1);
        this.f28543g = (TextView) findViewById(e.mbci_hint2);
        return this;
    }

    public final void d(PaymentMethod paymentMethod, boolean z3) {
        setEnabled(z3);
        View view = this.f28544i;
        if (view != null) {
            view.setEnabled(z3);
        }
        if (z3) {
            if (paymentMethod == null || TextUtils.isEmpty(paymentMethod.acTips)) {
                this.f28542f.setVisibility(8);
            } else {
                TextView textView = this.f28542f;
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
            this.f28539c.setAlpha(1.0f);
            this.f28540d.setAlpha(1.0f);
            this.f28541e.setAlpha(1.0f);
            this.f28542f.setAlpha(1.0f);
            this.f28543g.setAlpha(1.0f);
        } else {
            this.f28542f.setVisibility(8);
            this.f28539c.setAlpha(0.6f);
            this.f28540d.setAlpha(0.5f);
            this.f28541e.setAlpha(0.5f);
            this.f28542f.setAlpha(0.5f);
            this.f28543g.setAlpha(0.5f);
        }
        this.f28546o.setVisibility(8);
        this.f28545j.setVisibility(0);
    }

    public final void e(String str) {
        if (this.f28542f == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f28542f.setVisibility(8);
            return;
        }
        this.f28542f.setVisibility(0);
        this.f28542f.setTextColor(this.f31417a.getColor(L6.b.ppColorTextPrimary));
        this.f28542f.setBackground(null);
        this.f28542f.setText(str);
    }

    public void setBankCardInfo(BankCardInfo bankCardInfo) {
        if (TextUtils.isEmpty(bankCardInfo.bankName)) {
            this.f28540d.setText("");
        } else {
            this.f28540d.setText(r0.g0(bankCardInfo.bankName));
        }
        if ("MobileWallet".equals(bankCardInfo.accountType)) {
            r0.o1(bankCardInfo.bankUrl, this.f28539c);
            this.f28540d.setText(r0.g0(bankCardInfo.bankName));
            return;
        }
        int i7 = bankCardInfo.payeeAccountType;
        if (i7 == 8) {
            r0.s1(this.f28539c, r.cv_mobile_wallet);
            StringBuilder sb2 = new StringBuilder("(");
            if (!TextUtils.isEmpty(bankCardInfo.phone)) {
                sb2.append(r0.D0(bankCardInfo.phone));
            }
            sb2.append(")");
            this.f28541e.setText(sb2.toString());
            return;
        }
        if (i7 == 1) {
            this.f28539c.setImageResource(r.cv_palmpay_icon_circle_purple);
            this.f28541e.setText("");
            return;
        }
        r0.o1(bankCardInfo.bankUrl, this.f28539c);
        if (TextUtils.isEmpty(bankCardInfo.bankName)) {
            if (!TextUtils.isEmpty(bankCardInfo.cardNo)) {
                this.f28541e.setText(r0.I(bankCardInfo.cardNo));
                return;
            } else {
                if (TextUtils.isEmpty(bankCardInfo.bankAccountNo)) {
                    return;
                }
                this.f28541e.setText(r0.G(bankCardInfo.bankAccountNo));
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
        this.f28541e.setText(sb3.toString());
    }

    public void setPaymentMethod(PaymentMethod pm) {
        AutoTrackUtil.addViewRemark(this.f28544i, pm.bankName);
        d(pm, true);
        this.f28541e.setText("");
        this.f28542f.setTextColor(this.f31417a.getColor(p.text_color_gray14_646970));
        int i7 = pm.senderAccountType;
        if (i7 == 1) {
            AutoTrackUtil.addViewRemark(this.f28544i, this.f31417a.getString(k.core_palmpay_payment_balance));
            this.f28539c.setImageResource(r.cv_palmpay_icon_circle_purple);
            this.f28540d.setText(k.core_palmpay_payment_name);
            if (!pm.enable) {
                d(pm, false);
                if (TextUtils.isEmpty(pm.tips)) {
                    return;
                }
                e(pm.tips);
                if (TextUtils.isEmpty(pm.tipsColor)) {
                    return;
                }
                try {
                    this.f28542f.setTextColor(Color.parseColor(pm.tipsColor));
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            PreviewPayInfoResp.DataBean dataBean = pm.calculationDto;
            if (pm.availableBalance < (dataBean != null ? dataBean.payAmount : 0L)) {
                d(null, true);
                e(this.f31417a.getString(k.core_balance_x, r0.B(pm.availableBalance, true)));
                this.f28546o.setText(k.core_add_money);
                this.f28546o.setVisibility(0);
                this.f28545j.setVisibility(8);
            }
            e(this.f31417a.getString(k.core_balance_x, r0.B(pm.availableBalance, true)));
            if (TextUtils.isEmpty(pm.okcardTips)) {
                this.f28543g.setVisibility(8);
                return;
            } else {
                this.f28543g.setText(pm.okcardTips);
                this.f28543g.setVisibility(0);
                return;
            }
        }
        if (i7 == 28 || pm.payType == 36) {
            this.f28539c.setImageResource(r.cv_ok_card_icon);
            if (pm.installmentRaiseAmountEnable || pm.installmentActiveGuide) {
                this.f28540d.setText(k.core_okcard_instalments);
                e(this.f31417a.getString(k.core_buy_now_pay_later));
                this.f28546o.setVisibility(0);
                this.f28546o.setText(k.core_apply);
                this.f28545j.setVisibility(8);
            } else {
                this.f28540d.setText(k.core_okcard_instalments);
                AutoTrackUtil.addViewRemark(this.f28544i, this.f31417a.getString(k.core_oc_limit));
                d(pm, pm.enable);
            }
            if (!TextUtils.isEmpty(pm.tips)) {
                e(pm.tips);
                if (!TextUtils.isEmpty(pm.tipsColor)) {
                    try {
                        this.f28542f.setTextColor(Color.parseColor(pm.tipsColor));
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
            if (pm.installmentRaiseAmountEnable || pm.installmentActiveGuide || pm.enable) {
                if (TextUtils.isEmpty(pm.okcardTips)) {
                    this.f28543g.setVisibility(8);
                    return;
                } else {
                    this.f28543g.setText(pm.okcardTips);
                    this.f28543g.setVisibility(0);
                    return;
                }
            }
            return;
        }
        if (i7 == 5 || i7 == 12) {
            this.f28540d.setText(pm.bankName);
            if (TextUtils.isEmpty(pm.cardNo)) {
                e("");
            } else {
                e(r0.I(pm.cardNo));
            }
            r0.o1(pm.bankUrl, this.f28539c);
            if (TextUtils.isEmpty(pm.okcardTips)) {
                this.f28543g.setVisibility(8);
                return;
            } else {
                this.f28543g.setText(pm.okcardTips);
                this.f28543g.setVisibility(0);
                return;
            }
        }
        if (i7 == 6) {
            this.f28540d.setText(pm.bankName);
            if (!TextUtils.isEmpty(pm.bankAccountNo)) {
                e(r0.G(pm.bankAccountNo));
            }
            if (!TextUtils.isEmpty(pm.cardNo)) {
                e(r0.G(pm.cardNo));
            }
            r0.o1(pm.bankUrl, this.f28539c);
            if (TextUtils.isEmpty(pm.okcardTips)) {
                this.f28543g.setVisibility(8);
            } else {
                this.f28543g.setText(pm.okcardTips);
                this.f28543g.setVisibility(0);
            }
        }
    }

    public void setViewHeight(int h7) {
        this.f28544i.getLayoutParams().height = h7;
    }

    public PayMethodItemV2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PayMethodItemV2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
