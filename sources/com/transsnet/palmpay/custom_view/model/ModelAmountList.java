package com.transsnet.palmpay.custom_view.model;

import L6.b;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.v;

/* JADX INFO: loaded from: classes4.dex */
public class ModelAmountList extends BaseModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f31424A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public View f31425B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f31426C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f31427H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public TextView f31428L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public TextView f31429M;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ModelBillDetailTextItem1 f31430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ModelBillDetailTextItem1 f31431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ModelBillDetailTextItem1 f31432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ModelBillDetailTextItem1 f31433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ModelBillDetailTextItem1 f31434g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ModelBillDetailTextItem1 f31435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ModelBillDetailTextItem1 f31436j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ModelBillDetailTextItem1 f31437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ModelBillDetailTextItem1 f31438p;
    public ModelBillDetailTextItem1 t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ModelBillDetailTextItem1 f31439v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ModelBillDetailTextItem1 f31440w;

    public ModelAmountList(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_model_amount_list, this);
        this.f31430c = (ModelBillDetailTextItem1) findViewById(s.cmal_amount);
        this.f31431d = (ModelBillDetailTextItem1) findViewById(s.cmal_vat);
        this.f31432e = (ModelBillDetailTextItem1) findViewById(s.cmal_fee);
        this.f31433f = (ModelBillDetailTextItem1) findViewById(s.cmal_point_used);
        this.f31434g = (ModelBillDetailTextItem1) findViewById(s.cmal_point_earn);
        this.f31435i = (ModelBillDetailTextItem1) findViewById(s.cmal_data_bonus_used);
        this.f31436j = (ModelBillDetailTextItem1) findViewById(s.cmal_data_bonus_earn);
        this.f31437o = (ModelBillDetailTextItem1) findViewById(s.cmal_coupon);
        this.f31438p = (ModelBillDetailTextItem1) findViewById(s.cmal_discount);
        this.t = (ModelBillDetailTextItem1) findViewById(s.cmal_cash_back);
        this.f31439v = (ModelBillDetailTextItem1) findViewById(s.cmal_pay_shop_coupon);
        this.f31440w = (ModelBillDetailTextItem1) findViewById(s.cmal_total);
        this.f31424A = findViewById(s.cmal_bottom_divider);
        this.f31437o.f31455d.setTextColor(getResources().getColor(b.ppColorWarning));
        this.f31430c.f31454c.setTypeface(Typeface.defaultFromStyle(1));
        this.f31430c.f31455d.setTypeface(Typeface.defaultFromStyle(1));
        this.f31433f.f31454c.setTypeface(Typeface.defaultFromStyle(0));
        this.f31434g.f31454c.setTypeface(Typeface.defaultFromStyle(0));
        this.f31436j.f31454c.setTypeface(Typeface.defaultFromStyle(0));
        this.f31435i.f31454c.setTypeface(Typeface.defaultFromStyle(0));
        this.f31440w.f31455d.setTypeface(Typeface.defaultFromStyle(1));
        this.f31425B = findViewById(s.extra_item_ll);
        this.f31426C = (TextView) findViewById(s.entidade_tv);
        this.f31427H = (TextView) findViewById(s.referencia_tv);
        this.f31428L = (TextView) findViewById(s.montante_tv);
        this.f31429M = (TextView) findViewById(s.data_limite_tv);
        this.f31430c.f31454c.setTextColor(getResources().getColor(b.ppColorTextPrimary));
        this.f31431d.f31454c.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31432e.f31454c.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31433f.f31454c.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31434g.f31454c.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31436j.f31454c.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31435i.f31454c.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31437o.f31454c.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31438p.f31454c.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.t.f31454c.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31439v.f31454c.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31440w.f31454c.setTextColor(getResources().getColor(b.ppColorPrimary));
        this.f31430c.f31455d.setTextColor(getResources().getColor(b.ppColorTextPrimary));
        this.f31431d.f31455d.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31432e.f31455d.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31433f.f31455d.setTextColor(getResources().getColor(b.ppColorError));
        this.f31434g.f31455d.setTextColor(getResources().getColor(b.ppColorError));
        this.f31436j.f31455d.setTextColor(getResources().getColor(b.ppColorError));
        this.f31435i.f31455d.setTextColor(getResources().getColor(b.ppColorError));
        this.f31437o.f31455d.setTextColor(getResources().getColor(b.ppColorError));
        this.f31438p.f31455d.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.t.f31455d.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31439v.f31455d.setTextColor(getResources().getColor(b.ppColorTextNormal));
        this.f31440w.f31455d.setTextColor(getResources().getColor(b.ppColorPrimary));
        this.f31430c.f31454c.setText(getResources().getString(v.cv_all_cap_amount));
        this.f31431d.f31454c.setText(getResources().getString(v.cv_all_cap_vat));
        this.f31432e.f31454c.setText(getResources().getString(v.cv_all_cap_fee));
        this.f31433f.f31454c.setText(getResources().getString(v.cv_all_cap_points_used));
        this.f31434g.f31454c.setText(getResources().getString(v.cv_all_cap_earned));
        this.f31436j.f31454c.setText(getResources().getString(v.cv_all_cap_data_bonus_earned));
        this.f31435i.f31454c.setText(getResources().getString(v.cv_all_cap_data_bonus_used));
        this.f31437o.f31454c.setText(getResources().getString(v.cv_all_cap_coupon));
        this.f31438p.f31454c.setText(getResources().getString(v.cv_all_cap_discount));
        this.t.f31454c.setText(getResources().getString(v.cv_all_cap_cash_back));
        this.f31439v.f31454c.setText(getResources().getString(v.cv_all_cap_pay_shop_coupon));
        this.f31440w.f31454c.setText(getResources().getString(v.cv_all_cap_total));
        return this;
    }

    public final void d() {
        this.f31430c.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31431d.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31432e.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31433f.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31434g.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31436j.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31435i.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31437o.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31438p.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.t.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31439v.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31440w.f31454c.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31430c.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31431d.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31432e.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31433f.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31434g.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31436j.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31435i.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31437o.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31438p.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.t.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31439v.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
        this.f31440w.f31455d.setTextColor(getResources().getColor(b.ppColorTextDisable));
    }

    public final void e(boolean z3) {
        this.f31433f.setVisibility(z3 ? 0 : 8);
        this.f31434g.setVisibility(z3 ? 0 : 8);
    }

    public ModelAmountList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModelAmountList(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
