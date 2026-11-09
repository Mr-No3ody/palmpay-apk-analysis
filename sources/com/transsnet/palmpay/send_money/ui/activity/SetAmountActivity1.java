package com.transsnet.palmpay.send_money.ui.activity;

import V9.ViewOnFocusChangeListenerC0713b;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.model.ModelPageTitleArea;
import p159kd.e;
import p159kd.f;
import p173ld.o;

/* JADX INFO: loaded from: classes4.dex */
public class SetAmountActivity1 extends h implements TextWatcher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f33206g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AmountEditText f33207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f33208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f33209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f33210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ModelPageTitleArea f33211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33212f;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_set_amount_activity1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String stringExtra = getIntent().getStringExtra("extra_title");
        this.f33212f = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f33211e.f31520c.setText(this.f33212f);
        }
        String stringExtra2 = getIntent().getStringExtra("key_shop_name");
        if (TextUtils.isEmpty(stringExtra2)) {
            this.f33210d.setVisibility(8);
        } else {
            this.f33210d.setVisibility(0);
            this.f33209c.setText(stringExtra2);
        }
        this.f33208b.setEnabled(false);
        this.f33207a.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (!TextUtils.isEmpty(this.f33207a.getString())) {
            AmountEditText amountEditText = this.f33207a;
            if (!TextUtils.isEmpty(amountEditText.getString()) && amountEditText.getDouble() > 0.0d && !TextUtils.isEmpty(this.f33207a.getString())) {
                this.f33208b.setEnabled(true);
                return;
            }
        }
        this.f33208b.setEnabled(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        this.f33207a.setFocusable(true);
        this.f33207a.setFocusableInTouchMode(true);
        this.f33207a.requestFocus();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f33211e = (ModelPageTitleArea) findViewById(e.ssma_page_title);
        this.f33210d = (LinearLayout) findViewById(e.set_money_store_name_item);
        this.f33209c = (TextView) findViewById(e.set_money_store_name_tv);
        this.f33208b = (Button) findViewById(e.set_money_confirm_bt);
        this.f33207a = (AmountEditText) findViewById(e.set_money_et);
        this.f33208b.setOnClickListener(new o(this, 16));
        initStatusBar(true);
        this.f33207a.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0713b(this, 7));
    }
}
