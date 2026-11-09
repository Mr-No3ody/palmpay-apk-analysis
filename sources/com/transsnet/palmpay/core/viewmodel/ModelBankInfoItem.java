package com.transsnet.palmpay.core.viewmodel;

import N8.q0;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SizeUtils;
import p025ba.d;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public class ModelBankInfoItem extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f28266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f28268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f28269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f28270g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f28271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f28272j;

    public ModelBankInfoItem(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, g.core_model_bank_info_item, this);
        this.f28268e = (RelativeLayout) findViewById(e.mbci_root);
        this.f28270g = (ImageView) findViewById(e.cmbii_view_default_card);
        this.f28266c = (ImageView) findViewById(e.mbci_access_bank_iv);
        this.f28267d = (TextView) findViewById(e.mbci_bank_name_tv);
        this.f28269f = (ImageView) findViewById(e.mbci_right_iv);
        this.f28271i = findViewById(e.mbci_bottom_line);
        this.f28272j = (TextView) findViewById(e.mbci_hint_text_tv);
        return this;
    }

    public final void d() {
        this.f28266c.setVisibility(0);
        this.f28267d.setVisibility(0);
        this.f28272j.setVisibility(8);
    }

    public final void e(boolean z3) {
        if (z3) {
            this.f28267d.setVisibility(0);
            this.f28272j.setVisibility(8);
        } else {
            this.f28267d.setVisibility(8);
            this.f28272j.setVisibility(0);
        }
    }

    public final void f(boolean z3) {
        this.f28270g.setVisibility(z3 ? 0 : 8);
        if (z3) {
            this.f28268e.getLayoutParams().height = SizeUtils.dp2px(70.0f);
        } else {
            this.f28268e.getLayoutParams().height = SizeUtils.dp2px(50.0f);
        }
    }

    public void setBankCardInfo(BankInfo bankInfo) {
        d();
        if (TextUtils.isEmpty(bankInfo.bankCode)) {
            this.f28267d.setBackgroundResource(d.core_bank_loading_name_bg);
            this.f28266c.setImageResource(d.core_bank_loading_icon);
            this.f28269f.setVisibility(8);
        } else {
            this.f28267d.setBackground(null);
            this.f28267d.setText(bankInfo.bankName);
            if (i0.X(this.f31417a)) {
                com.bumptech.glide.b.e(this.f31417a).load(bankInfo.bankUrl).a(new G1.d().x(r.cv_default_bank_logo)).S(this.f28266c);
            }
            this.f28269f.setImageResource(r.cv_check);
        }
    }

    public void setPaymehtMethod(PaymentMethod paymentMethod) {
        d();
        if (TextUtils.isEmpty(paymentMethod.bankCode)) {
            this.f28267d.setBackgroundResource(d.core_bank_loading_name_bg);
            this.f28266c.setImageResource(d.core_bank_loading_icon);
            this.f28267d.setText("");
            this.f28269f.setVisibility(8);
            return;
        }
        this.f28267d.setBackground(null);
        String strG0 = r0.g0(paymentMethod.bankName);
        if (!TextUtils.isEmpty(paymentMethod.cardNo)) {
            strG0 = q0.l(strG0, "(", r0.I(paymentMethod.cardNo), ")");
        }
        this.f28267d.setText(strG0);
        if (i0.X(this.f31417a)) {
            com.bumptech.glide.b.e(this.f31417a).load(paymentMethod.bankUrl).a(new G1.d().x(r.cv_default_bank_logo)).S(this.f28266c);
        }
        this.f28269f.setImageResource(r.cv_check);
    }

    public ModelBankInfoItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelBankInfoItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
