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

/* JADX INFO: loaded from: classes3.dex */
public class ModelFreeFeeItem extends BaseModel2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f28352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f28353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f28354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f28355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28357g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CouponItem f28358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f28359j;

    public ModelFreeFeeItem(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel2
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvBaseModel, i7, 0);
        this.f28353c = typedArrayObtainStyledAttributes.getText(x.CvBaseModel_cv_bm_title);
        this.f28356f = typedArrayObtainStyledAttributes.getBoolean(x.CvBaseModel_cv_bm_show_tips, true);
        this.f28354d = typedArrayObtainStyledAttributes.getText(x.CvBaseModel_cv_bm_tips_text);
        a(context);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel2
    public final View c(Context context) {
        View.inflate(context, g.core_free_fee_item, this);
        this.f28352b = (TextView) findViewById(e.mci_title_tv);
        this.f28357g = (TextView) findViewById(e.mci_msg_tv);
        ImageView imageView = (ImageView) findViewById(e.mci_tips_iv);
        this.f28355e = imageView;
        imageView.setOnClickListener(new d(this, 19));
        if (!TextUtils.isEmpty(this.f28353c)) {
            this.f28352b.setText(this.f28353c);
        }
        if (this.f28356f) {
            this.f28355e.setVisibility(0);
        }
        d();
        return this;
    }

    public final void d() {
        this.f28357g.setTextColor(this.f31419a.getResources().getColor(L6.b.ppColorError));
        this.f28357g.setText(r0.I0(this.f28359j));
    }

    public CouponItem getCoupon() {
        return this.f28358i;
    }

    public void setCoupon(CouponItem item) {
        this.f28358i = item;
        if (item != null) {
            this.f28359j = item.nominaValue;
        }
        d();
    }

    public void setCouponDeductAmount(long amount) {
        this.f28359j = amount;
        d();
    }

    public void setTipsText(CharSequence text) {
        this.f28354d = text;
    }

    public ModelFreeFeeItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelFreeFeeItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
