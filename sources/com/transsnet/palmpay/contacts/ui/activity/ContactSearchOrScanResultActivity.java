package com.transsnet.palmpay.contacts.ui.activity;

import Pa.r0;
import R9.d;
import R9.e;
import S9.a;
import V9.p;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.contacts.ui.activity.ContactMenuActivity;
import com.transsnet.palmpay.contacts.ui.activity.ContactSearchOrScanResultActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.req.AddContactReq;
import com.transsnet.palmpay.core.network.PayApiService;
import java.util.ArrayList;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import p071ef.b;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/search_san_result")
public class ContactSearchOrScanResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f27183i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f27184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f27185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f27186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f27187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PpButton f27188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PalmPayContact f27190g;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ct_contact_search_or_scan_result_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        PalmPayContact palmPayContact = (PalmPayContact) getIntent().getSerializableExtra("contact");
        this.f27190g = palmPayContact;
        if (palmPayContact == null && !TextUtils.isEmpty(this.f27189f)) {
            String str = this.f27189f;
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            ((ContactsApiService) a.f8824a.f41079b).queryMobileContacts(arrayList).k(f.f42629b).i(b.a()).subscribe(new p(this, 1));
        }
        l();
    }

    public final void l() {
        PalmPayContact palmPayContact = this.f27190g;
        if (palmPayContact == null) {
            return;
        }
        Z4.e.t(this, palmPayContact.getPhotoPath(), this.f27184a);
        this.f27185b.setText(this.f27190g.getAlias());
        this.f27186c.setText(this.f27190g.getFullName());
        this.f27187d.setText(r0.E0(this.f27190g.getPhone()));
        this.f27188e.setText(getString(R9.f.ct_add));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUpdate(PalmPayContact msg) {
        if (msg != null) {
            this.f27190g.setAlias(msg.getAlias());
            this.f27185b.setText(this.f27190g.getAlias());
            this.f27185b.setVisibility(0);
            this.f27186c.setText(this.f27190g.getFullName());
            this.f27186c.setVisibility(0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        c.b().j(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Z4.e.I(this);
        this.f27188e = (PpButton) findViewById(d.add_status_bt);
        this.f27187d = (TextView) findViewById(d.mobile_num_tv);
        this.f27186c = (TextView) findViewById(d.full_name_tv);
        this.f27185b = (TextView) findViewById(d.note_name_tv);
        this.f27184a = (ImageView) findViewById(d.avatar_iv);
        try {
            final int i7 = 0;
            this.f27188e.setOnClickListener(new View.OnClickListener(this) { // from class: V9.o

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ContactSearchOrScanResultActivity f10212b;

                {
                    this.f10212b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactSearchOrScanResultActivity contactSearchOrScanResultActivity = this.f10212b;
                    switch (i7) {
                        case 0:
                            int i10 = ContactSearchOrScanResultActivity.f27183i;
                            if (view.getId() == R9.d.add_status_bt) {
                                contactSearchOrScanResultActivity.showLoadingDialog(true);
                                AddContactReq addContactReq = new AddContactReq();
                                addContactReq.setContactsMemberId(contactSearchOrScanResultActivity.f27190g.getContactsMemberId());
                                addContactReq.setRequestSource(contactSearchOrScanResultActivity.f27190g.getRequestSource());
                                ((PayApiService) p324va.c.f43141a.f14621b).addContact(addContactReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p(contactSearchOrScanResultActivity, 0));
                            }
                            break;
                        default:
                            PalmPayContact palmPayContact = contactSearchOrScanResultActivity.f27190g;
                            int i11 = ContactMenuActivity.f27163d;
                            contactSearchOrScanResultActivity.startActivity(new Intent(contactSearchOrScanResultActivity, (Class<?>) ContactMenuActivity.class).putExtra("contact", palmPayContact));
                            break;
                    }
                }
            });
            PpTitleBar ppTitleBar = (PpTitleBar) findViewById(d.titleBar);
            ppTitleBar.getRightImageView1().setImageDrawable(p059e1.a.h(this, S6.a.pay_More, null, getColor(L6.b.ppColorTextPrimary), 24.0f));
            final int i10 = 1;
            ppTitleBar.setRightImageView1ClickListener(new View.OnClickListener(this) { // from class: V9.o

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ContactSearchOrScanResultActivity f10212b;

                {
                    this.f10212b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactSearchOrScanResultActivity contactSearchOrScanResultActivity = this.f10212b;
                    switch (i10) {
                        case 0:
                            int i11 = ContactSearchOrScanResultActivity.f27183i;
                            if (view.getId() == R9.d.add_status_bt) {
                                contactSearchOrScanResultActivity.showLoadingDialog(true);
                                AddContactReq addContactReq = new AddContactReq();
                                addContactReq.setContactsMemberId(contactSearchOrScanResultActivity.f27190g.getContactsMemberId());
                                addContactReq.setRequestSource(contactSearchOrScanResultActivity.f27190g.getRequestSource());
                                ((PayApiService) p324va.c.f43141a.f14621b).addContact(addContactReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new p(contactSearchOrScanResultActivity, 0));
                            }
                            break;
                        default:
                            PalmPayContact palmPayContact = contactSearchOrScanResultActivity.f27190g;
                            int i12 = ContactMenuActivity.f27163d;
                            contactSearchOrScanResultActivity.startActivity(new Intent(contactSearchOrScanResultActivity, (Class<?>) ContactMenuActivity.class).putExtra("contact", palmPayContact));
                            break;
                    }
                }
            });
        } catch (Exception unused) {
        }
    }
}
