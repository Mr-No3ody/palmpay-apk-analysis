package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;

/* JADX INFO: loaded from: classes4.dex */
public class ModelAddBankCard extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f31422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f31423d;

    public ModelAddBankCard(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_model_add_bank_card, this);
        this.f31422c = (TextView) findViewById(s.mabc_title_text_tv);
        this.f31423d = (TextView) findViewById(s.mabc_hint_text_tv);
        return this;
    }

    public void setTitle(String str) {
        this.f31422c.setText(str);
    }

    public ModelAddBankCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setTitle(int i7) {
        this.f31422c.setText(i7);
    }

    public ModelAddBankCard(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
