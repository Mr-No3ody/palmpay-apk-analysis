package com.transsnet.palmpay.custom_view.model;

import Uc.I0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;

/* JADX INFO: loaded from: classes4.dex */
public class ModelBillDetailTitle extends BaseModel {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f31465v = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f31467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f31468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f31469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f31470g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f31471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f31472j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f31473o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f31474p;
    public ImageView t;

    public ModelBillDetailTitle(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_model_bill_detail_top_area, this);
        this.f31466c = (TextView) findViewById(s.mbdta_title_tv);
        this.f31467d = (TextView) findViewById(s.mbdta_trade_amount_tv);
        this.f31468e = (TextView) findViewById(s.mbdta_trade_state_tv);
        this.f31469f = (TextView) findViewById(s.mbdta_check_state_tv);
        this.f31471i = (ImageView) findViewById(s.mbdta_iv);
        this.f31472j = (ImageView) findViewById(s.mbdta_back_iv);
        this.f31470g = (TextView) findViewById(s.right_top_tv);
        this.f31474p = findViewById(s.mbdta_root);
        this.f31473o = (ImageView) findViewById(s.mbdta_share_iv);
        this.t = (ImageView) findViewById(s.mbdta_download_iv);
        this.f31472j.setOnClickListener(new I0(this, 6));
        return this;
    }

    public void setTitle(String str) {
        this.f31466c.setText(str);
    }

    public ModelBillDetailTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setTitle(int i7) {
        this.f31466c.setText(i7);
    }

    public ModelBillDetailTitle(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
