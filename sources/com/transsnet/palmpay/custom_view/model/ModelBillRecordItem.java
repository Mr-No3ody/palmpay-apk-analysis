package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;

/* JADX INFO: loaded from: classes4.dex */
public class ModelBillRecordItem extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f31476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f31477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f31478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f31479g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f31480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RelativeLayout f31481j;

    public ModelBillRecordItem(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_model_bill_record_item, this);
        this.f31475c = (TextView) findViewById(s.mbri_title_tv);
        this.f31476d = (TextView) findViewById(s.mbri_time_tv);
        this.f31477e = (TextView) findViewById(s.mbri_trade_amount_tv);
        this.f31478f = (TextView) findViewById(s.mbri_trade_state_tv);
        this.f31479g = (TextView) findViewById(s.tv_booked);
        this.f31480i = (ImageView) findViewById(s.mbri_iv);
        this.f31481j = (RelativeLayout) findViewById(s.mbri_root);
        return this;
    }

    public void setTitle(String str) {
        this.f31475c.setText(str);
    }

    public ModelBillRecordItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setTitle(int i7) {
        this.f31475c.setText(i7);
    }

    public ModelBillRecordItem(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
