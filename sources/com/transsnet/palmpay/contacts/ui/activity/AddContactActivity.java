package com.transsnet.palmpay.contacts.ui.activity;

import Pa.r0;
import R9.d;
import R9.e;
import R9.f;
import V9.C0714c;
import V9.ViewOnFocusChangeListenerC0713b;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IView;
import com.transsnet.palmpay.contacts.ui.activity.AddContactActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.req.QueryContactReq;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import com.transsnet.palmpay.util.ToastUtils;
import p025ba.k;
import p071ef.b;
import p324va.c;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/add")
public class AddContactActivity extends i implements PersonalQRCodeContract$IView, TextWatcher {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f27130j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EditText f27131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f27132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewGroup f27133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Button f27134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f27135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f27136g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewGroup f27137i;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ct_add_contacts_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String firstName = BaseApplication.getInstance().getUser().getFirstName();
        if (TextUtils.isEmpty(firstName)) {
            this.f27135f.setText(getString(k.core_personal_qr_code));
        } else {
            this.f27135f.setText(getString(f.ct_personal_qr_code_name_format, firstName));
        }
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new U9.f();
    }

    public final void m(View view) {
        int id2 = view.getId();
        if (id2 == d.back_bt) {
            finish();
            return;
        }
        if (id2 == d.search_btn) {
            showLoadingDialog(true);
            QueryContactReq queryContactReq = new QueryContactReq();
            queryContactReq.setPhone(r0.v0(this.f27131b.getText().toString()));
            ((MemberApiService) c.f43141a.f14622c).queryMemberContact(queryContactReq).k(p298tf.f.f42629b).i(b.a()).subscribe(new C0714c(this, 0));
            return;
        }
        if (id2 == d.scan_qr_code_view) {
            ARouter.getInstance().build("/qrcode/scan").navigation(this);
        } else if (id2 == d.add_local_contacts_view) {
            startActivity(new Intent(this, (Class<?>) LocalPalmPayContactsListActivity.class));
        } else if (id2 == d.ivDelete) {
            this.f27131b.getText().clear();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (TextUtils.isEmpty(this.f27131b.getText().toString())) {
            this.f27132c.setVisibility(8);
            this.f27134e.setEnabled(false);
        } else {
            this.f27132c.setVisibility(0);
            this.f27134e.setEnabled(true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        ((U9.f) this.f27350a).getPersonalQRCodeInfo();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f27136g = (ImageView) findViewById(d.caca_qrcode);
        this.f27135f = (TextView) findViewById(d.caca_name_title);
        this.f27134e = (Button) findViewById(d.search_btn);
        this.f27133d = (ViewGroup) findViewById(d.content_view);
        this.f27132c = findViewById(d.ivDelete);
        this.f27131b = (EditText) findViewById(d.editSearch);
        try {
            final int i7 = 0;
            findViewById(d.back_bt).setOnClickListener(new View.OnClickListener(this) { // from class: V9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AddContactActivity f10188b;

                {
                    this.f10188b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddContactActivity addContactActivity = this.f10188b;
                    switch (i7) {
                        case 0:
                            int i10 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 1:
                            int i11 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 2:
                            int i12 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 3:
                            int i13 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        default:
                            int i14 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                    }
                }
            });
            final int i10 = 1;
            findViewById(d.scan_qr_code_view).setOnClickListener(new View.OnClickListener(this) { // from class: V9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AddContactActivity f10188b;

                {
                    this.f10188b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddContactActivity addContactActivity = this.f10188b;
                    switch (i10) {
                        case 0:
                            int i11 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 1:
                            int i12 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 2:
                            int i13 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 3:
                            int i14 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        default:
                            int i15 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                    }
                }
            });
            final int i11 = 2;
            findViewById(d.add_local_contacts_view).setOnClickListener(new View.OnClickListener(this) { // from class: V9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AddContactActivity f10188b;

                {
                    this.f10188b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddContactActivity addContactActivity = this.f10188b;
                    switch (i11) {
                        case 0:
                            int i12 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 1:
                            int i13 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 2:
                            int i14 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 3:
                            int i15 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        default:
                            int i16 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                    }
                }
            });
            findViewById(d.add_local_contacts_view).setVisibility(8);
            final int i12 = 3;
            this.f27134e.setOnClickListener(new View.OnClickListener(this) { // from class: V9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AddContactActivity f10188b;

                {
                    this.f10188b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddContactActivity addContactActivity = this.f10188b;
                    switch (i12) {
                        case 0:
                            int i13 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 1:
                            int i14 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 2:
                            int i15 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 3:
                            int i16 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        default:
                            int i17 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                    }
                }
            });
            final int i13 = 4;
            this.f27132c.setOnClickListener(new View.OnClickListener(this) { // from class: V9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AddContactActivity f10188b;

                {
                    this.f10188b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddContactActivity addContactActivity = this.f10188b;
                    switch (i13) {
                        case 0:
                            int i14 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 1:
                            int i15 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 2:
                            int i16 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        case 3:
                            int i17 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                        default:
                            int i18 = AddContactActivity.f27130j;
                            addContactActivity.m(view);
                            break;
                    }
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        Z4.e.I(this);
        this.f27131b.addTextChangedListener(this);
        this.f27131b.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0713b(this, 0));
        this.f27134e.setEnabled(false);
    }

    @Override // com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IView
    public final void showError(String str) {
        showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IView
    public final void showPersonalQRCodeInfo(CommonResult commonResult) {
    }

    @Override // com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IView
    public final void showQrcodeImg(Bitmap bitmap) {
        showLoadingDialog(false);
        this.f27136g.setImageBitmap(bitmap);
    }

    @Override // com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IView
    public final void showSavePath(String str) {
    }
}
