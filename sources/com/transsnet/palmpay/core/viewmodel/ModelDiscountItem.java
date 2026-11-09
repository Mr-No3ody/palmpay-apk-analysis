package com.transsnet.palmpay.core.viewmodel;

import Pa.r0;
import R8.d;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public class ModelDiscountItem extends BaseModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28335j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f28336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SwitchCompat f28339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f28340g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f28341i;

    public ModelDiscountItem(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, g.core_model_discount_item, this);
        this.f28336c = (TextView) findViewById(e.cmup_money_num_title_tv);
        this.f28338e = (TextView) findViewById(e.cmup_default_money_num_tv);
        this.f28337d = (TextView) findViewById(e.cmup_money_num_tv);
        this.f28339f = (SwitchCompat) findViewById(e.cmup_switch);
        ((ImageView) findViewById(e.cmup_tips_iv)).setOnClickListener(new d(this, 17));
        return this;
    }

    public final void d(boolean z3, boolean z8) {
        if (!z8) {
            this.f28339f.setChecked(z3);
            this.f28337d.setVisibility(z3 ? 0 : 4);
            return;
        }
        this.f28339f.setChecked(z3);
        if (z3) {
            this.f28337d.setVisibility(0);
            this.f28338e.setVisibility(8);
        } else {
            this.f28337d.setVisibility(8);
            this.f28338e.setVisibility(0);
        }
    }

    public final void e(long j6, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            sb2.append(" ");
        }
        sb2.append("- " + r0.B(j6, true));
        this.f28337d.setText(sb2.toString());
    }

    public void setDiscountAmount(long amount) {
        this.f28340g = amount;
        e(amount, this.f28341i);
    }

    public void setDiscountTariffName(String name) {
        this.f28341i = name;
        e(this.f28340g, name);
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener listener) {
        this.f28339f.setOnCheckedChangeListener(listener);
    }

    public void setTitle(String title) {
        this.f28336c.setText(title);
    }

    public ModelDiscountItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelDiscountItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
