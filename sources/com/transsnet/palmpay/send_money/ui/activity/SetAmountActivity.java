package com.transsnet.palmpay.send_money.ui.activity;

import V9.ViewOnFocusChangeListenerC0713b;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.TitleEditView;
import com.transsnet.palmpay.custom_view.model.ModelPageTitleArea;
import p159kd.e;
import p159kd.f;
import p173ld.o;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/set_amount")
public class SetAmountActivity extends h implements TextWatcher {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f33199g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ModelPageTitleArea f33200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AmountEditText f33201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TitleEditView f33202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f33203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33205f;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_set_amount_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String stringExtra = getIntent().getStringExtra("extra_title");
        this.f33205f = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f33200a.f31520c.setText(this.f33205f);
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f33204e = intent.getBooleanExtra("key_show_what_its_for", true);
        }
        if (this.f33204e) {
            this.f33202c.setVisibility(0);
        } else {
            this.f33202c.setVisibility(8);
        }
        this.f33203d.setEnabled(false);
        this.f33201b.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (!TextUtils.isEmpty(this.f33201b.getString())) {
            AmountEditText amountEditText = this.f33201b;
            if (!TextUtils.isEmpty(amountEditText.getString()) && amountEditText.getDouble() > 0.0d && !TextUtils.isEmpty(this.f33201b.getString())) {
                this.f33203d.setEnabled(true);
                return;
            }
        }
        this.f33203d.setEnabled(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        this.f33201b.setFocusable(true);
        this.f33201b.setFocusableInTouchMode(true);
        this.f33201b.requestFocus();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(true);
        this.f33200a = (ModelPageTitleArea) findViewById(e.ssma_page_title);
        this.f33201b = (AmountEditText) findViewById(e.set_money_et);
        this.f33202c = (TitleEditView) findViewById(e.set_money_remark);
        Button button = (Button) findViewById(e.set_money_confirm_bt);
        this.f33203d = button;
        button.setOnClickListener(new o(this, 15));
        this.f33201b.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0713b(this, 6));
    }
}
