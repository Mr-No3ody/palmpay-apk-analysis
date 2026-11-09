package com.transsnet.palmpay.contacts.ui.activity;

import C9.ViewOnClickListenerC0146m;
import O6.c;
import R9.d;
import R9.e;
import R9.f;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.contacts.ui.activity.ContactMenuActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class ContactMenuActivity extends BaseActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27163d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f27164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PpButton f27165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PalmPayContact f27166c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ct_contacts_menu_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        PalmPayContact palmPayContact = (PalmPayContact) getIntent().getSerializableExtra("contact");
        this.f27166c = palmPayContact;
        if (palmPayContact != null) {
            this.f27164a.setText(palmPayContact.getAlias());
            this.f27165b.setVisibility(this.f27166c.isFriend() ? 0 : 8);
        }
    }

    public final void l(View view) {
        int id2 = view.getId();
        if (id2 == d.set_remake_name) {
            startActivity(new Intent(this, (Class<?>) SetContactRemarkActivity.class).putExtra("contact", this.f27166c));
        } else if (id2 == d.delete_btn) {
            String string = getString(f.ct_delete_dialog_msg);
            c cVar = new c(this);
            cVar.e(k.core_title_attention);
            cVar.f6605k = true;
            cVar.f6598d = string;
            cVar.c(k.core_cancel, null);
            cVar.d(k.core_confirm, new ViewOnClickListenerC0146m(this, 12));
            cVar.a().show();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUpdate(PalmPayContact msg) {
        if (msg != null) {
            this.f27166c.setAlias(msg.getAlias());
            this.f27164a.setText(this.f27166c.getAlias());
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        org.greenrobot.eventbus.c.b().j(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Z4.e.I(this);
        this.f27165b = (PpButton) findViewById(d.delete_btn);
        this.f27164a = (TextView) findViewById(d.remake_name_tv);
        try {
            final int i7 = 0;
            this.f27165b.setOnClickListener(new View.OnClickListener(this) { // from class: V9.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ContactMenuActivity f10206b;

                {
                    this.f10206b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactMenuActivity contactMenuActivity = this.f10206b;
                    switch (i7) {
                        case 0:
                            int i10 = ContactMenuActivity.f27163d;
                            contactMenuActivity.l(view);
                            break;
                        default:
                            int i11 = ContactMenuActivity.f27163d;
                            contactMenuActivity.l(view);
                            break;
                    }
                }
            });
            final int i10 = 1;
            findViewById(d.set_remake_name).setOnClickListener(new View.OnClickListener(this) { // from class: V9.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ContactMenuActivity f10206b;

                {
                    this.f10206b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactMenuActivity contactMenuActivity = this.f10206b;
                    switch (i10) {
                        case 0:
                            int i11 = ContactMenuActivity.f27163d;
                            contactMenuActivity.l(view);
                            break;
                        default:
                            int i12 = ContactMenuActivity.f27163d;
                            contactMenuActivity.l(view);
                            break;
                    }
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
