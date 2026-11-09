package com.transsnet.palmpay.core.viewmodel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.model.BaseModel2;
import com.transsnet.palmpay.custom_view.x;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public class ModelPaymentMethodItem extends BaseModel2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f28394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f28395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28396d;

    public ModelPaymentMethodItem(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel2
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        getContext().obtainStyledAttributes(attributeSet, x.CvBaseModel, i7, 0).recycle();
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel2
    public final View c(Context context) {
        View.inflate(context, g.core_model_payment_method_item, this);
        this.f28394b = (TextView) findViewById(e.cmpm_title);
        this.f28395c = (TextView) findViewById(e.cmpm_name);
        this.f28396d = (TextView) findViewById(e.cmpm_number);
        return this;
    }

    public void setTextColor(int color) {
        this.f28394b.setTextColor(color);
        this.f28396d.setTextColor(color);
        this.f28395c.setTextColor(color);
    }

    public ModelPaymentMethodItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelPaymentMethodItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
