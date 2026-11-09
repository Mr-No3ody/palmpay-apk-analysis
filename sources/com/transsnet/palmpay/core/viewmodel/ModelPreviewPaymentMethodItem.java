package com.transsnet.palmpay.core.viewmodel;

import C0.G;
import Pa.k0;
import Pa.r0;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.r;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class ModelPreviewPaymentMethodItem extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f28413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f28415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f28416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28417g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28418i;

    public ModelPreviewPaymentMethodItem(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, g.core_model_preview_payment_method_item, this);
        this.f28416f = (ImageView) findViewById(e.mbci_iv_icon);
        this.f28414d = (TextView) findViewById(e.mbci_tv_line1);
        this.f28413c = (TextView) findViewById(e.mbci_tv_line2);
        this.f28417g = (TextView) findViewById(e.mbci_tv_line3);
        this.f28415e = (ImageView) findViewById(e.mbci_iv_arrow);
        this.f28418i = (TextView) findViewById(e.mbci_discount_amount_tv);
        setPaymentMethod(null);
        return this;
    }

    public final void d(boolean z3) {
        if (z3) {
            this.f28414d.setAlpha(1.0f);
            this.f28413c.setAlpha(1.0f);
            this.f28416f.setAlpha(1.0f);
            this.f28415e.setAlpha(1.0f);
            return;
        }
        this.f28414d.setText(k.core_insufficient_balance);
        this.f28414d.setAlpha(0.5f);
        this.f28413c.setAlpha(0.5f);
        this.f28416f.setAlpha(0.5f);
        this.f28415e.setAlpha(0.5f);
    }

    public void setPaymentMethod(PaymentMethod payMethod) {
        if (payMethod == null) {
            if (BaseApplication.isNG()) {
                this.f28414d.setText(k.core_select_payment_method_title);
            } else {
                this.f28414d.setText(k.core_select_payment_method_title);
            }
            this.f28413c.setVisibility(8);
            this.f28417g.setVisibility(8);
            this.f28418i.setVisibility(8);
            return;
        }
        this.f28413c.setVisibility(0);
        if (TextUtils.isEmpty(payMethod.tips)) {
            this.f28417g.setVisibility(8);
        } else {
            this.f28417g.setVisibility(0);
            this.f28417g.setText(payMethod.tips);
            if (TextUtils.isEmpty(payMethod.tipsColor)) {
                try {
                    this.f28417g.setTextColor(Color.parseColor(payMethod.tipsColor));
                } catch (Exception unused) {
                }
            }
        }
        if (payMethod.payMentMethodsDiscount > 0) {
            this.f28418i.setText("-" + r0.B(payMethod.payMentMethodsDiscount, true));
            this.f28418i.setVisibility(0);
        } else {
            this.f28418i.setVisibility(8);
        }
        int i7 = payMethod.senderAccountType;
        if (i7 == 5 || i7 == 12) {
            if (TextUtils.isEmpty(payMethod.cardNo)) {
                this.f28413c.setText("");
            } else {
                this.f28413c.setText(r0.I(payMethod.cardNo));
            }
            if (!TextUtils.isEmpty(payMethod.bankName)) {
                this.f28414d.setText(payMethod.bankName);
            }
            r0.o1(payMethod.bankUrl, this.f28416f);
            d(true);
            return;
        }
        if (i7 == 6) {
            if (!TextUtils.isEmpty(payMethod.bankAccountNo)) {
                G.y("(", r0.G(payMethod.bankAccountNo), ")", this.f28413c);
            }
            if (!TextUtils.isEmpty(payMethod.cardNo)) {
                G.y("(", r0.G(payMethod.cardNo), ")", this.f28413c);
            }
            if (!TextUtils.isEmpty(payMethod.bankName)) {
                this.f28414d.setText(payMethod.bankName);
            }
            r0.o1(payMethod.bankUrl, this.f28416f);
            d(true);
            return;
        }
        if (i7 == 1) {
            this.f28413c.setText(r0.B(payMethod.availableBalance, false));
            this.f28414d.setText(k.core_palmpay_payment_balance);
            r0.s1(this.f28416f, r.cv_palmpay_icon_circle_purple);
            return;
        }
        if (i7 == 40) {
            this.f28413c.setText(r0.B(payMethod.availableBalance, false));
            this.f28414d.setText(k.core_palmpay_payment_cash_box);
            r0.s1(this.f28416f, r.cv_cash_box_icon_circle_cashier);
            return;
        }
        if (i7 == 8 || i7 == 13) {
            if (!TextUtils.isEmpty(payMethod.bankAccountNo)) {
                this.f28413c.setText(r0.D0(payMethod.bankAccountNo));
            } else if (TextUtils.isEmpty(payMethod.phone)) {
                this.f28413c.setText("");
            } else {
                this.f28413c.setText(r0.w0(payMethod.phone));
            }
            if (!TextUtils.isEmpty(payMethod.bankName)) {
                this.f28414d.setText(payMethod.bankName);
            }
            r0.o1(payMethod.bankUrl, this.f28416f);
            return;
        }
        if (i7 != 23) {
            if (i7 == 28) {
                this.f28413c.setText(r0.B(payMethod.availableBalance, false));
                this.f28414d.setText(k0.a());
                r0.s1(this.f28416f, r.cv_ok_card_icon);
                return;
            }
            return;
        }
        this.f28413c.setVisibility(8);
        if (!TextUtils.isEmpty(payMethod.bankName)) {
            this.f28414d.setText(payMethod.bankName + " (USSD)");
        }
        r0.o1(payMethod.bankUrl, this.f28416f);
        d(true);
    }

    public ModelPreviewPaymentMethodItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelPreviewPaymentMethodItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
