package com.transsnet.palmpay.contacts.ui.activity;

import Pa.r0;
import R9.d;
import R9.e;
import S9.a;
import V9.n;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.navigation.NavigationBarView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.contacts.bean.req.AcceptContactReq;
import com.transsnet.palmpay.contacts.bean.req.UpdateContactReq;
import com.transsnet.palmpay.contacts.ui.activity.ContactMenuActivity;
import com.transsnet.palmpay.contacts.ui.activity.ContactProfileActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.bean.req.QueryContactReq;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p025ba.k;
import p071ef.b;
import p298tf.f;
import p324va.c;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/profile")
public class ContactProfileActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f27167C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f27168A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public PalmPayContact f27169B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f27170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f27171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f27172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f27173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f27174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f27175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f27176g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ViewGroup f27177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f27178j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ViewGroup f27179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f27180p;
    public View t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f27181v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f27182w;

    public static void n(Context context, PalmPayContact palmPayContact) {
        context.startActivity(new Intent(context, (Class<?>) ContactProfileActivity.class).putExtra("contact", palmPayContact));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ct_contact_profile_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        PalmPayContact palmPayContact = (PalmPayContact) getIntent().getSerializableExtra("contact");
        this.f27169B = palmPayContact;
        if (palmPayContact != null) {
            o();
            return;
        }
        String stringExtra = getIntent().getStringExtra("MEMBER_ID");
        showLoadingDialog(true);
        QueryContactReq queryContactReq = new QueryContactReq();
        queryContactReq.setContactsMemberId(stringExtra);
        ((MemberApiService) c.f43141a.f14622c).queryMemberContact(queryContactReq).k(f.f42629b).i(b.a()).subscribe(new n(this, 2));
    }

    public final boolean l() {
        User user = BaseApplication.getInstance().getUser();
        if (user == null || !user.shouldApplyForBalance()) {
            return true;
        }
        ARouter.getInstance().build("/account/ask_apply_for_balance").navigation(this, 11);
        return false;
    }

    public final void m(boolean z3) {
        ViewGroup viewGroup = this.f27177i;
        if (viewGroup != null) {
            viewGroup.setVisibility(z3 ? 0 : 8);
        }
        TextView textView = this.f27174e;
        if (textView != null) {
            textView.setVisibility(z3 ? 0 : 8);
        }
        ImageView imageView = this.f27175f;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    public final void o() {
        String string;
        byte b7 = 1;
        PalmPayContact palmPayContact = this.f27169B;
        if (palmPayContact != null) {
            Z4.e.t(this, palmPayContact.getPhotoPath(), this.f27170a);
            this.f27171b.setText(this.f27169B.getAlias());
            this.f27172c.setText(this.f27169B.getFullName());
            this.f27173d.setText(r0.D0(this.f27169B.getPhone()));
            if (this.f27169B.isFriend()) {
                m(false);
                ViewStub viewStub = (ViewStub) findViewById(d.contact_action_stub);
                if (viewStub != null) {
                    viewStub.inflate();
                }
                if (this.f27179o == null) {
                    this.f27179o = (ViewGroup) findViewById(d.contact_action_view);
                    View viewFindViewById = findViewById(d.send_money_tv);
                    this.f27180p = viewFindViewById;
                    viewFindViewById.setOnClickListener(this);
                    View viewFindViewById2 = findViewById(d.request_money_tv);
                    this.t = viewFindViewById2;
                    viewFindViewById2.setOnClickListener(this);
                    this.t.setVisibility(8);
                    View viewFindViewById3 = findViewById(d.airtime_tv);
                    this.f27181v = viewFindViewById3;
                    viewFindViewById3.setOnClickListener(this);
                    View viewFindViewById4 = findViewById(d.data_bundles_tv);
                    this.f27182w = viewFindViewById4;
                    viewFindViewById4.setOnClickListener(this);
                }
                ViewGroup viewGroup = this.f27179o;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ImageView imageView = this.f27176g;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                boolean zEquals = "1".equals(this.f27169B.getIsFavourite());
                this.f27168A = zEquals;
                this.f27176g.setSelected(zEquals);
                return;
            }
            ViewStub viewStub2 = (ViewStub) findViewById(d.contact_accept_stub);
            if (viewStub2 != null) {
                viewStub2.inflate();
            }
            if (this.f27177i == null) {
                this.f27177i = (ViewGroup) findViewById(d.contact_accept_view);
                ((Button) findViewById(d.accept_bt)).setOnClickListener(this);
                this.f27178j = (TextView) findViewById(d.contact_from_tv);
            }
            m(true);
            TextView textView = this.f27178j;
            String requestSource = this.f27169B.getRequestSource();
            if (!TextUtils.isEmpty(requestSource)) {
                requestSource.getClass();
                switch (requestSource.hashCode()) {
                    case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                        b7 = !requestSource.equals("1") ? (byte) -1 : (byte) 0;
                        break;
                    case 50:
                        if (!requestSource.equals("2")) {
                            b7 = -1;
                        }
                        break;
                    case 51:
                        b7 = !requestSource.equals("3") ? (byte) -1 : (byte) 2;
                        break;
                    case 52:
                        b7 = !requestSource.equals("4") ? (byte) -1 : (byte) 3;
                        break;
                    case 53:
                        b7 = !requestSource.equals("5") ? (byte) -1 : (byte) 4;
                        break;
                    case 54:
                        b7 = !requestSource.equals(AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE) ? (byte) -1 : (byte) 5;
                        break;
                    case 55:
                        b7 = !requestSource.equals("7") ? (byte) -1 : (byte) 6;
                        break;
                    case 56:
                        b7 = !requestSource.equals("8") ? (byte) -1 : (byte) 7;
                        break;
                    case 57:
                        b7 = !requestSource.equals("9") ? (byte) -1 : (byte) 8;
                        break;
                    default:
                        b7 = -1;
                        break;
                }
                switch (b7) {
                    case 0:
                        string = getString(R9.f.ct_from_type_qr_code);
                        break;
                    case 1:
                        string = getString(R9.f.ct_from_type_mobile_number);
                        break;
                    case 2:
                        string = getString(R9.f.ct_from_type_referral);
                        break;
                    case 3:
                        string = getString(R9.f.ct_from_type_mobile_contact);
                        break;
                    case 4:
                        string = getString(R9.f.ct_from_type_money_transfer);
                        break;
                    case 5:
                        string = getString(R9.f.ct_from_type_lucky_money);
                        break;
                    case 6:
                        string = getString(R9.f.ct_from_type_top_up_airtime);
                        break;
                    case 7:
                        string = getString(R9.f.ct_from_type_buy_data_bundle);
                        break;
                    case 8:
                        string = getString(k.core_group_discount);
                        break;
                    default:
                        string = getString(R9.f.ct_from_type_mobile_number);
                        break;
                }
            } else {
                string = getString(R9.f.ct_from_type_qr_code);
            }
            textView.setText(string);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == d.accept_bt) {
            showLoadingDialog(true);
            ((ContactsApiService) a.f8824a.f41079b).acceptContact(new AcceptContactReq(this.f27169B.getContactsMemberId(), this.f27169B.getRequestSource())).k(f.f42629b).i(b.a()).subscribe(new n(this, 1));
            return;
        }
        if (id2 == d.send_money_tv) {
            if (l()) {
                ARouter.getInstance().build("/sm/personal_transfer").withString("MEMBER_ID", this.f27169B.getContactsMemberId()).navigation(this);
            }
        } else if (id2 == d.request_money_tv) {
            if (l()) {
                ARouter.getInstance().build("/sm/personal_transfer").withString("MEMBER_ID", this.f27169B.getContactsMemberId()).navigation(this);
            }
        } else if (id2 == d.airtime_tv) {
            if (l()) {
                ARouter.getInstance().build("/airtime/top_up_airtime").withString("phone_number", this.f27169B.getPhone()).navigation(this);
            }
        } else if (id2 == d.data_bundles_tv && l()) {
            ARouter.getInstance().build("/quick_teller/buy_bundle_ng").withString("phone_number", this.f27169B.getPhone()).navigation(this);
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
            this.f27169B.setAlias(msg.getAlias());
            this.f27171b.setText(this.f27169B.getAlias());
            this.f27171b.setVisibility(0);
            this.f27172c.setText(this.f27169B.getFullName());
            this.f27172c.setVisibility(0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        org.greenrobot.eventbus.c.b().j(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Z4.e.I(this);
        this.f27176g = (ImageView) findViewById(d.favorite_bt);
        this.f27175f = (ImageView) findViewById(d.apply_arrow_icon);
        this.f27170a = (ImageView) findViewById(d.avatar_iv);
        this.f27171b = (TextView) findViewById(d.note_name_tv);
        this.f27172c = (TextView) findViewById(d.full_name_tv);
        this.f27173d = (TextView) findViewById(d.mobile_num_tv);
        this.f27174e = (TextView) findViewById(d.apply_desc_tv);
        try {
            final int i7 = 0;
            this.f27176g.setOnClickListener(new View.OnClickListener(this) { // from class: V9.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ContactProfileActivity f10208b;

                {
                    this.f10208b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactProfileActivity contactProfileActivity = this.f10208b;
                    switch (i7) {
                        case 0:
                            int i10 = ContactProfileActivity.f27167C;
                            if (view.getId() == R9.d.favorite_bt) {
                                contactProfileActivity.showLoadingDialog(true);
                                UpdateContactReq updateContactReq = new UpdateContactReq();
                                updateContactReq.setContactsMemberId(contactProfileActivity.f27169B.getContactsMemberId());
                                updateContactReq.setIsFavourite(contactProfileActivity.f27168A ? "0" : "1");
                                ((ContactsApiService) S9.a.f8824a.f41079b).updateMemberContact(updateContactReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new n(contactProfileActivity, 0));
                            }
                            break;
                        default:
                            PalmPayContact palmPayContact = contactProfileActivity.f27169B;
                            int i11 = ContactMenuActivity.f27163d;
                            contactProfileActivity.startActivity(new Intent(contactProfileActivity, (Class<?>) ContactMenuActivity.class).putExtra("contact", palmPayContact));
                            break;
                    }
                }
            });
            PpTitleBar ppTitleBar = (PpTitleBar) findViewById(d.titleBar);
            ppTitleBar.getRightImageView1().setImageDrawable(p059e1.a.h(this, S6.a.pay_More, null, getColor(L6.b.ppColorTextPrimary), 24.0f));
            final int i10 = 1;
            ppTitleBar.setRightImageView1ClickListener(new View.OnClickListener(this) { // from class: V9.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ContactProfileActivity f10208b;

                {
                    this.f10208b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ContactProfileActivity contactProfileActivity = this.f10208b;
                    switch (i10) {
                        case 0:
                            int i11 = ContactProfileActivity.f27167C;
                            if (view.getId() == R9.d.favorite_bt) {
                                contactProfileActivity.showLoadingDialog(true);
                                UpdateContactReq updateContactReq = new UpdateContactReq();
                                updateContactReq.setContactsMemberId(contactProfileActivity.f27169B.getContactsMemberId());
                                updateContactReq.setIsFavourite(contactProfileActivity.f27168A ? "0" : "1");
                                ((ContactsApiService) S9.a.f8824a.f41079b).updateMemberContact(updateContactReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new n(contactProfileActivity, 0));
                            }
                            break;
                        default:
                            PalmPayContact palmPayContact = contactProfileActivity.f27169B;
                            int i12 = ContactMenuActivity.f27163d;
                            contactProfileActivity.startActivity(new Intent(contactProfileActivity, (Class<?>) ContactMenuActivity.class).putExtra("contact", palmPayContact));
                            break;
                    }
                }
            });
        } catch (Exception unused) {
        }
    }
}
