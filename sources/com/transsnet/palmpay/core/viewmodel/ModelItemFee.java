package com.transsnet.palmpay.core.viewmodel;

import Pa.r0;
import R8.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.payment.PaymentFeeDetail;
import com.transsnet.palmpay.custom_view.model.BaseModel2;
import com.transsnet.palmpay.custom_view.x;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public class ModelItemFee extends BaseModel2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PaymentFeeDetail f28360A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f28361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f28362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f28364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f28365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f28366g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f28367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f28368j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28369o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f28370p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ImageView f28371v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f28372w;

    public ModelItemFee(Context context) {
        super(context);
        this.f28372w = 17;
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel2
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvBaseModel, i7, 0);
        this.f28365f = typedArrayObtainStyledAttributes.getText(x.CvBaseModel_cv_bm_title);
        this.f28366g = typedArrayObtainStyledAttributes.getText(x.CvBaseModel_cv_bm_default_text);
        this.f28370p = typedArrayObtainStyledAttributes.getInt(x.CvBaseModel_cv_bm_text_color, 0);
        this.f28367i = typedArrayObtainStyledAttributes.getText(x.CvBaseModel_cv_bm_amount_sign);
        this.f28369o = typedArrayObtainStyledAttributes.getBoolean(x.CvBaseModel_cv_bm_show_amount_sign, false);
        if (!TextUtils.isEmpty(this.f28367i)) {
            this.f28369o = true;
        } else if (this.f28369o) {
            this.f28367i = BaseApplication.getCurrencySymbol();
        }
        this.t = typedArrayObtainStyledAttributes.getBoolean(x.CvBaseModel_cv_bm_show_tips, false);
        this.f28368j = typedArrayObtainStyledAttributes.getText(x.CvBaseModel_cv_bm_tips_text);
        typedArrayObtainStyledAttributes.recycle();
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel2
    public final View c(Context context) {
        View.inflate(context, g.core_model_fee_item, this);
        this.f28361b = (TextView) findViewById(e.mfi_title_tv);
        this.f28362c = (TextView) findViewById(e.mfi_amount_tv);
        this.f28363d = (TextView) findViewById(e.origin_amount_tv);
        this.f28371v = (ImageView) findViewById(e.mfi_tips_iv);
        this.f28364e = (ImageView) findViewById(e.iv_right);
        this.f28371v.setOnClickListener(new d(this, 20));
        if (!TextUtils.isEmpty(this.f28366g)) {
            this.f28362c.setText(this.f28366g);
        }
        if (!TextUtils.isEmpty(this.f28365f)) {
            this.f28361b.setText(this.f28365f);
        }
        int i7 = this.f28370p;
        if (i7 != 0) {
            this.f28362c.setTextColor(i7);
        }
        if (this.t) {
            this.f28371v.setVisibility(0);
        }
        return this;
    }

    public final void d(boolean z3) {
        if (!z3) {
            this.f28362c.setTextColor(getResources().getColor(L6.b.ppColorTextNormal));
            return;
        }
        int i7 = this.f28370p;
        if (i7 != 0) {
            this.f28362c.setTextColor(i7);
        } else {
            this.f28362c.setTextColor(getResources().getColor(L6.b.ppColorTextPrimary));
        }
    }

    public final void e(long j6, long j10) {
        if (j10 <= 0) {
            this.t = false;
            this.f28371v.setVisibility(8);
        } else {
            this.t = true;
            this.f28371v.setVisibility(0);
            this.f28368j = r0.W(this.f31419a, j10);
        }
        TextView textView = this.f28362c;
        if (textView != null) {
            long j11 = j6 + j10;
            if (this.f28369o) {
                textView.setText(r0.B(j11, false));
            } else {
                textView.setText(r0.A(j11));
            }
        }
    }

    public final void f() {
        this.f28361b.setTextColor(getResources().getColor(L6.b.ppColorTextPrimary));
        this.f28361b.setTypeface(null, 1);
        this.f28362c.setTextColor(getResources().getColor(L6.b.ppColorTextPrimary));
        this.f28362c.setTypeface(null, 1);
    }

    public void setAmount(CharSequence amountStr) {
        setContent(amountStr);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    public void setContent(CharSequence content) {
        if (!this.f28369o || TextUtils.isEmpty(content)) {
            this.f28362c.setText(content);
        } else {
            if ((TextUtils.isEmpty(this.f28367i) || TextUtils.isEmpty(content)) ? false : content.toString().startsWith(this.f28367i.toString())) {
                this.f28362c.setText(content);
            } else {
                this.f28362c.setText(((Object) this.f28367i) + " " + ((Object) content));
            }
        }
        setVisibility(0);
    }

    public void setFeeDetails(PaymentFeeDetail details) {
        this.f28360A = details;
        if (details == null) {
            this.t = false;
            this.f28371v.setVisibility(8);
        } else {
            this.t = true;
            this.f28371v.setVisibility(0);
        }
    }

    public void setMessageGravity(int gravity) {
        this.f28372w = gravity;
    }

    public void setTips(String tips) {
        this.f28368j = tips;
        if (TextUtils.isEmpty(tips)) {
            this.t = false;
            this.f28371v.setVisibility(8);
        } else {
            this.t = true;
            this.f28371v.setVisibility(0);
        }
    }

    public void setTipsText(CharSequence text) {
        this.f28368j = text;
    }

    public void setValueMaxLine(int line) {
        this.f28362c.setMaxLines(line);
        this.f28362c.setEllipsize(TextUtils.TruncateAt.END);
    }

    public ModelItemFee(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f28372w = 17;
    }

    public ModelItemFee(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f28372w = 17;
    }
}
