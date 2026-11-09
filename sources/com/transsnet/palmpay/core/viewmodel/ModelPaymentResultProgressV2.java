package com.transsnet.palmpay.core.viewmodel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class ModelPaymentResultProgressV2 extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f28407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f28408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28411g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28412i;

    public ModelPaymentResultProgressV2(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        setOrientation(1);
        View.inflate(context, g.core_model_payment_result_progress_v2, this);
        this.f28407c = (TextView) findViewById(e.tvLine1);
        this.f28408d = findViewById(e.viewLine1);
        this.f28409e = (TextView) findViewById(e.tvLine2);
        this.f28410f = (TextView) findViewById(e.tvLine21);
        this.f28411g = (TextView) findViewById(e.tvLine31);
        this.f28412i = (TextView) findViewById(e.tvLine32);
        return this;
    }

    public void setFirstStepContent(String firstContent) {
        this.f28407c.setText(firstContent);
    }

    public void setTransType(String mTransType) {
        if ("03".equals(mTransType) || "02".equals(mTransType) || "01".equals(mTransType)) {
            this.f28409e.setText(k.core_msg_transaction_processing_by_bank);
        }
    }

    public ModelPaymentResultProgressV2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelPaymentResultProgressV2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
