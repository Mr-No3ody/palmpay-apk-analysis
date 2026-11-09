package com.transsnet.palmpay.contacts.ui.fragment;

import L6.b;
import R9.a;
import R9.e;
import R9.f;
import U9.d;
import Uc.I0;
import W9.t;
import Y9.c;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import com.transsnet.palmpay.contacts.contract.MobileContactListContract$IView;
import com.transsnet.palmpay.contacts.ui.view.SideBarView;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MobileContactsListFragment extends BaseMVPFragment<d> implements MobileContactListContract$IView {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String[] f27272B = {"android.permission.READ_CONTACTS"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f27274j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SwipeRecyclerView f27275o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SideBarView f27276p;
    public t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f27277v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f27278w = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f27273A = "";

    @Override // com.transsnet.palmpay.contacts.contract.MobileContactListContract$IView
    public final void completed() {
        showLoadingDialog(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return e.ct_mobile_contacts_list_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        t tVar = new t(getContext());
        this.t = tVar;
        tVar.f4986c = new c(this);
        this.f27275o.getRecyclerView().setVerticalScrollBarEnabled(false);
        this.f27275o.getRecyclerView().setLayoutManager(new LinearLayoutManager(getContext()));
        C1548f c1548f = new C1548f(getContext().getColor(b.ppColorDividerLine), 1, 30, 30);
        c1548f.f31336e = false;
        this.f27275o.setRefreshEnable(false);
        this.f27275o.setLoadMoreEnable(false);
        this.f27275o.getRecyclerView().addItemDecoration(c1548f);
        this.f27275o.getRecyclerView().addItemDecoration(new StickyRecyclerHeadersDecoration(this.t));
        this.f27275o.setAdapter(this.t);
        return 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        String[] strArr = f27272B;
        if (!PermissionUtils.isGranted(strArr)) {
            requestPermissions(strArr, 100);
        } else {
            showLoadingDialog(true);
            ((d) this.f27328i).queryPhoneContact(false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f27274j = this.f27318b.findViewById(R9.d.viewSearch);
        this.f27276p = (SideBarView) this.f27318b.findViewById(R9.d.side_bar);
        this.f27275o = (SwipeRecyclerView) this.f27318b.findViewById(R9.d.contact_rv);
        try {
            this.f27274j.setOnClickListener(new I0(this, 26));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f27276p.setLetters(getResources().getStringArray(a.ct_slide_bar_value_no_favourite_list));
        this.f27276p.setOnLetterChangeListener(new Y9.b(this));
        return 1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (iArr.length <= 0) {
            return;
        }
        for (int i10 : iArr) {
            if (i10 != 0) {
                ToastUtils.showShort(f.ct_denied_permission_pick_contact);
                return;
            }
        }
        if (i7 == 100) {
            showLoadingDialog(true);
            ((d) this.f27328i).queryPhoneContact(false);
            Ga.c.f3194a.periodUploadV3();
        }
    }

    @Override // com.transsnet.palmpay.contacts.contract.MobileContactListContract$IView
    public final void showError(String str) {
        showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // com.transsnet.palmpay.contacts.contract.MobileContactListContract$IView
    public final void showLikeQueryPhoneContact(List list) {
        t tVar = this.t;
        tVar.f4985b = list;
        tVar.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.contacts.contract.MobileContactListContract$IView
    public final void showPhoneContact(List list) {
        showLoadingDialog(false);
        this.f27277v = list;
        t tVar = this.t;
        tVar.f4985b = list;
        tVar.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new d();
    }
}
