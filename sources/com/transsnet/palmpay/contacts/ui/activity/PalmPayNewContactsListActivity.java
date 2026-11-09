package com.transsnet.palmpay.contacts.ui.activity;

import L6.b;
import R9.d;
import R9.e;
import U9.g;
import W9.G;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.tencent.mmkv.MMKV;
import com.transsnet.palmpay.contacts.contract.RequestContactListContract$IView;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import p018b2.a;
import p045d3.k;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/new_contacts_list")
public class PalmPayNewContactsListActivity extends i implements RequestContactListContract$IView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f27248d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SwipeRecyclerView f27249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public G f27250c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ct_palmpay_new_contacts_list_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        G g7 = new G();
        g7.f10612b = this;
        g7.f10613c = new ArrayList();
        this.f27250c = g7;
        g7.setMode(a.f18758a);
        this.f27250c.f10614d = new C2085k0(this, 10);
        this.f27249b.getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        C1548f c1548f = new C1548f(getColor(b.ppColorDividerLine), 1, 30, 30);
        c1548f.f31336e = false;
        this.f27249b.setRefreshEnable(false);
        this.f27249b.setLoadMoreEnable(false);
        this.f27249b.getRecyclerView().addItemDecoration(c1548f);
        this.f27249b.setAdapter(this.f27250c);
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        g gVar = new g();
        gVar.f9298d = new k(this);
        return gVar;
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onUpdate(PalmPayContact msg) {
        for (int i7 = 0; i7 < this.f27250c.f10613c.size(); i7++) {
            RequestContact requestContact = (RequestContact) this.f27250c.f10613c.get(i7);
            if (requestContact.getContactsMemberId().equals(msg.getContactsMemberId())) {
                requestContact.setMemberId(p367ya.a.d().i());
                requestContact.setContactsMemberId(msg.getContactsMemberId());
                requestContact.setAlias(msg.getAlias());
                requestContact.setFriend(msg.isFriend());
                this.f27250c.notifyItemChanged(i7);
                ((g) this.f27350a).updateContact(requestContact);
                return;
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        c.b().j(this);
        MMKV mmkv = p367ya.a.d().f44149a;
        mmkv.remove("key_new_contact_request_num");
        mmkv.remove("key_new_contact_request_member");
        ((g) this.f27350a).queryRequestContactsList(p367ya.a.d().i());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Z4.e.I(this);
        this.f27249b = (SwipeRecyclerView) findViewById(d.contact_rv);
    }

    @Override // com.transsnet.palmpay.contacts.contract.RequestContactListContract$IView
    public final void showDeleteResult(RequestContact requestContact) {
        G g7 = this.f27250c;
        ArrayList arrayList = g7.f10613c;
        int iIndexOf = arrayList.indexOf(requestContact);
        arrayList.remove(iIndexOf);
        g7.notifyItemRemoved(iIndexOf);
        g7.notifyItemRangeChanged(iIndexOf, arrayList.size() - iIndexOf);
    }

    @Override // com.transsnet.palmpay.contacts.contract.RequestContactListContract$IView
    public final void showRequestContactsList(List list) {
        G g7 = this.f27250c;
        g7.f10613c.addAll(list);
        g7.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.contacts.contract.RequestContactListContract$IView
    public final void showUpdateResult(RequestContact requestContact) {
    }
}
