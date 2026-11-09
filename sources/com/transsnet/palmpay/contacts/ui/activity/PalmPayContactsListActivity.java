package com.transsnet.palmpay.contacts.ui.activity;

import L6.b;
import Pa.H;
import Pa.a0;
import Pa.r0;
import R9.e;
import Uc.I0;
import V9.C;
import V9.q;
import W9.B;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.contacts.ui.view.SideBarView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactListResp;
import com.transsnet.palmpay.custom_view.C1548f;
import df.d;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import p298tf.f;
import p367ya.a;

/* JADX INFO: loaded from: classes3.dex */
public class PalmPayContactsListActivity extends BaseActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27233e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f27234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SideBarView f27235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public B f27236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27237d = "";

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ct_palmpay_contacts_list_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        this.f27237d = getIntent().getStringExtra("click_item_action");
        this.f27236c = new B(this, true);
        this.f27234a.setLayoutManager(new LinearLayoutManager(this));
        C1548f c1548f = new C1548f(getColor(b.ppColorDividerLine), 1, 30, 30);
        c1548f.f31336e = false;
        this.f27234a.addItemDecoration(c1548f);
        this.f27234a.addItemDecoration(new StickyRecyclerHeadersDecoration(this.f27236c));
        this.f27234a.setAdapter(this.f27236c);
        this.f27236c.f4986c = new q(this, 3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        goBackToHome();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (BaseApplication.hasLogin()) {
            String strB = H.b(a.d().i() + "_palmpay_contacts");
            d.d(r0.H1(PalmPayContactListResp.class, strB), ((ContactsApiService) S9.a.f8824a.f41079b).queryMemberContactsList().c(new a0(strB, 0))).k(f.f42629b).i(p071ef.b.a()).subscribe(new C(this));
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUpdate(PalmPayContact msg) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        c.b().j(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Z4.e.I(this);
        this.f27234a = (RecyclerView) findViewById(R9.d.contact_rv);
        this.f27235b = (SideBarView) findViewById(R9.d.side_bar);
        ((PpTitleBar) findViewById(R9.d.titleBar)).setBackButtonClickListener(new I0(this, 3));
        this.f27235b.setLetters(getResources().getStringArray(R9.a.ct_slide_bar_value_with_favourite_list));
        this.f27235b.setOnLetterChangeListener(new V9.B(this));
    }
}
