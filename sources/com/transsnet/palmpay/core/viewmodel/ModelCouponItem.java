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
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.custom_view.model.BaseModel2;
import com.transsnet.palmpay.custom_view.x;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class ModelCouponItem extends BaseModel2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f28301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f28302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f28303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f28304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28306g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CouponItem f28307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f28308j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f28309o;

    public ModelCouponItem(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel2
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvBaseModel, i7, 0);
        this.f28302c = typedArrayObtainStyledAttributes.getText(x.CvBaseModel_cv_bm_title);
        this.f28305f = typedArrayObtainStyledAttributes.getBoolean(x.CvBaseModel_cv_bm_show_tips, true);
        this.f28303d = typedArrayObtainStyledAttributes.getText(x.CvBaseModel_cv_bm_tips_text);
        a(context);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel2
    public final View c(Context context) {
        View.inflate(context, g.core_model_coupon_item, this);
        this.f28301b = (TextView) findViewById(e.mci_title_tv);
        this.f28306g = (TextView) findViewById(e.mci_msg_tv);
        ImageView imageView = (ImageView) findViewById(e.mci_tips_iv);
        this.f28304e = imageView;
        imageView.setOnClickListener(new d(this, 16));
        if (!TextUtils.isEmpty(this.f28302c)) {
            this.f28301b.setText(this.f28302c);
        }
        if (this.f28305f) {
            this.f28304e.setVisibility(0);
        }
        d();
        return this;
    }

    public final void d() {
        if (this.f28309o <= 0) {
            this.f28306g.setTextColor(this.f31419a.getResources().getColor(L6.b.ppColorTextDisable));
            this.f28306g.setText(k.core_no_coupon_available);
            return;
        }
        this.f28306g.setTextColor(this.f31419a.getResources().getColor(L6.b.ppColorWarning));
        if (this.f28307i == null) {
            this.f28306g.setTextColor(this.f31419a.getResources().getColor(L6.b.ppColorTextPrimary));
            this.f28306g.setText(this.f31419a.getResources().getString(k.core_no_of_coupon_available, Integer.valueOf(this.f28309o)));
        } else {
            this.f28306g.setText("- " + r0.B(this.f28308j, false));
        }
    }

    public CouponItem getCoupon() {
        return this.f28307i;
    }

    public ImageView getTipsIv() {
        return this.f28304e;
    }

    public void setAvailableCouponCount(int count) {
        this.f28309o = count;
    }

    public void setCoupon(CouponItem item) {
        this.f28307i = item;
        if (item != null) {
            this.f28308j = item.nominaValue;
        }
        d();
    }

    public void setCouponDeductAmount(long amount) {
        this.f28308j = amount;
        d();
    }

    public void setTipsText(CharSequence text) {
        this.f28303d = text;
    }

    public ModelCouponItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelCouponItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
