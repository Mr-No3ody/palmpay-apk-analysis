package com.transsnet.palmpay.core.viewmodel;

import G1.d;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.bean.BankCardInfo;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.r;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class ModelBankCardItem1 extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f28262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f28264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f28265f;

    public ModelBankCardItem1(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, g.core_model_bank_card_item1, this);
        this.f28262c = (TextView) findViewById(e.mbci_bank_card_number_tv);
        this.f28265f = (ImageView) findViewById(e.mbci_access_bank_iv);
        this.f28263d = (TextView) findViewById(e.mbci_bankname_tv);
        this.f28264e = findViewById(e.mbci_bottom_line);
        return this;
    }

    public void setBankCardInfo(BankCardInfo bankCardInfo) {
        if (bankCardInfo == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("(");
        if (!TextUtils.isEmpty(bankCardInfo.cardNo)) {
            sb2.append(r0.I(bankCardInfo.cardNo));
        } else if (!TextUtils.isEmpty(bankCardInfo.bankAccountNo)) {
            sb2.append(r0.I(bankCardInfo.bankAccountNo));
        }
        sb2.append(")");
        this.f28262c.setText(sb2.toString());
        if (!TextUtils.isEmpty(bankCardInfo.bankName)) {
            this.f28263d.setText(i0.f(bankCardInfo.bankName));
        }
        r0.o1(bankCardInfo.bankUrl, this.f28265f);
    }

    public void setBankInfo(BankInfo bankInfo) {
        if (bankInfo == null) {
            return;
        }
        if (!TextUtils.isEmpty(bankInfo.bankName)) {
            this.f28263d.setText(bankInfo.bankName);
        }
        r0.o1(bankInfo.bankUrl, this.f28265f);
    }

    public void setBottomLineHeight(int height) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f28264e.getLayoutParams();
        layoutParams.height = height;
        this.f28264e.setLayoutParams(layoutParams);
    }

    public void setPaymentMethod(PaymentMethod payMethod) {
        int i7 = payMethod.payType;
        if (i7 == 2) {
            this.f28262c.setText("(" + r0.I(payMethod.cardNo) + ")");
            if (!TextUtils.isEmpty(payMethod.bankName)) {
                this.f28263d.setText(i0.f(payMethod.bankName));
            }
            com.bumptech.glide.b.e(this.f31417a).load(payMethod.bankUrl).a(((d) new d().x(r.cv_default_bank_logo)).d()).S(this.f28265f);
            return;
        }
        if (i7 == 1) {
            this.f28262c.setText("(" + r0.B(payMethod.availableBalance, false) + ")");
            this.f28263d.setText(k.core_palmpay_payment_name);
            com.bumptech.glide.b.e(this.f31417a).load(Integer.valueOf(r.cv_palmpay_logo_small)).a(new d().d()).S(this.f28265f);
        }
    }

    public ModelBankCardItem1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelBankCardItem1(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
