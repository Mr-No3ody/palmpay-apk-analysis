package com.transsnet.palmpay.contacts.ui.fragment;

import L6.b;
import Pa.H;
import Pa.a0;
import Pa.r0;
import R9.e;
import Uc.I0;
import W9.B;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import com.transsnet.palmpay.contacts.api.ContactsApiService;
import com.transsnet.palmpay.contacts.ui.view.SideBarView;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.rsp.PalmPayContactListResp;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import df.d;
import java.util.List;
import p298tf.f;
import p367ya.a;

/* JADX INFO: loaded from: classes3.dex */
public class PalmPayContactsListFragment extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SwipeRecyclerView f27279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SideBarView f27280j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f27281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public B f27282p;
    public List t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f27283v = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f27284w = "";

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return e.ct_palmpay_contacts_list_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        this.f27282p = new B(getContext(), false);
        this.f27279i.setRefreshEnable(false);
        this.f27279i.setLoadMoreEnable(false);
        this.f27279i.getRecyclerView().setLayoutManager(new LinearLayoutManager(getContext()));
        C1548f c1548f = new C1548f(getContext().getColor(b.ppColorDividerLine), 1, 30, 30);
        c1548f.f31336e = false;
        this.f27279i.getRecyclerView().addItemDecoration(c1548f);
        this.f27279i.getRecyclerView().addItemDecoration(new StickyRecyclerHeadersDecoration(this.f27282p));
        this.f27279i.setAdapter(this.f27282p);
        this.f27282p.f4986c = new Y9.e(this);
        return 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        String strB = H.b(a.d().i() + "_palmpay_contacts");
        d.d(r0.H1(PalmPayContactListResp.class, strB), ((ContactsApiService) S9.a.f8824a.f41079b).queryMemberContactsList().c(new a0(strB, 0))).k(f.f42629b).i(p071ef.b.a()).subscribe(new Y9.f(this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f27281o = this.f27318b.findViewById(R9.d.viewSearch);
        this.f27280j = (SideBarView) this.f27318b.findViewById(R9.d.side_bar);
        this.f27279i = (SwipeRecyclerView) this.f27318b.findViewById(R9.d.contact_rv);
        try {
            this.f27281o.setOnClickListener(new I0(this, 27));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f27280j.setLetters(getResources().getStringArray(R9.a.ct_slide_bar_value_with_favourite_list));
        this.f27280j.setOnLetterChangeListener(new Y9.d(this));
        return 1;
    }
}
