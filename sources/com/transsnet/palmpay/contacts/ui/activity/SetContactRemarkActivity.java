package com.transsnet.palmpay.contacts.ui.activity;

import L6.f;
import R9.d;
import R9.e;
import S9.a;
import Tb.b;
import Tb.c;
import V9.C0714c;
import V9.ViewOnFocusChangeListenerC0713b;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.contacts.bean.req.UpdateContactReq;
import com.transsnet.palmpay.contacts.ui.activity.SetContactRemarkActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.PalmPayContact;

/* JADX INFO: loaded from: classes3.dex */
public class SetContactRemarkActivity extends BaseActivity implements TextWatcher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27258f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f27259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f27260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f27261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PpTitleBar f27262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PalmPayContact f27263e;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f27261c.setVisibility(8);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ct_set_contacts_remark_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        PalmPayContact palmPayContact = (PalmPayContact) getIntent().getSerializableExtra("contact");
        this.f27263e = palmPayContact;
        if (palmPayContact != null) {
            this.f27259a.setText(palmPayContact.getAlias());
        }
        this.f27259a.setInputType(1);
        this.f27259a.setFilters(new InputFilter[]{new b(), new c(40, 0)});
        this.f27259a.addTextChangedListener(this);
        this.f27259a.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0713b(this, 1));
    }

    public final void l(View view) {
        int id2 = view.getId();
        if (id2 != f.tv_right) {
            if (id2 == d.ivDelete) {
                this.f27259a.getText().clear();
            }
        } else {
            if (TextUtils.isDigitsOnly(this.f27259a.getText().toString().trim().replace(" ", ""))) {
                this.f27261c.setVisibility(0);
                this.f27261c.setText(getString(R9.f.ct_note_name_invalid_error_msg));
                return;
            }
            showLoadingDialog(true);
            UpdateContactReq updateContactReq = new UpdateContactReq();
            updateContactReq.setContactsMemberId(this.f27263e.getContactsMemberId());
            updateContactReq.setAlias(this.f27259a.getText().toString());
            ((ContactsApiService) a.f8824a.f41079b).updateMemberContact(updateContactReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(this, 3));
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (TextUtils.isEmpty(this.f27259a.getText().toString().trim()) || TextUtils.equals(this.f27263e.getAlias(), this.f27259a.getText().toString().trim())) {
            this.f27262d.setRightText("");
        } else {
            this.f27262d.setRightText(getString(R9.f.ct_save));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Z4.e.I(this);
        this.f27259a = (EditText) findViewById(d.remake_name_et);
        this.f27260b = findViewById(d.ivDelete);
        this.f27261c = (TextView) findViewById(d.name_error);
        try {
            PpTitleBar ppTitleBar = (PpTitleBar) findViewById(d.titleBar);
            this.f27262d = ppTitleBar;
            final int i7 = 0;
            ppTitleBar.setRightTextViewClickListener(new View.OnClickListener(this) { // from class: V9.H

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SetContactRemarkActivity f10186b;

                {
                    this.f10186b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SetContactRemarkActivity setContactRemarkActivity = this.f10186b;
                    switch (i7) {
                        case 0:
                            int i10 = SetContactRemarkActivity.f27258f;
                            setContactRemarkActivity.l(view);
                            break;
                        default:
                            int i11 = SetContactRemarkActivity.f27258f;
                            setContactRemarkActivity.l(view);
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.f27260b.setOnClickListener(new View.OnClickListener(this) { // from class: V9.H

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ SetContactRemarkActivity f10186b;

                {
                    this.f10186b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SetContactRemarkActivity setContactRemarkActivity = this.f10186b;
                    switch (i10) {
                        case 0:
                            int i11 = SetContactRemarkActivity.f27258f;
                            setContactRemarkActivity.l(view);
                            break;
                        default:
                            int i12 = SetContactRemarkActivity.f27258f;
                            setContactRemarkActivity.l(view);
                            break;
                    }
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f27262d.setRightText("");
    }
}
