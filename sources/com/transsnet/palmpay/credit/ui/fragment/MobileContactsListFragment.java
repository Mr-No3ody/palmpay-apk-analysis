package com.transsnet.palmpay.credit.ui.fragment;

import L6.b;
import Ya.f;
import Ya.g;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.credit.contract.MobileContactListContract$IView;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.n;
import com.transsnet.palmpay.sidebar.SideBarView;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import p161kf.e;
import p235pb.h;
import p327vd.c;
import p339wb.m;
import p382zb.A;
import p382zb.B;
import p382zb.C;

/* JADX INFO: loaded from: classes4.dex */
public class MobileContactsListFragment extends BaseMVPFragment<h> implements MobileContactListContract$IView {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String[] f30360B = {"android.permission.READ_CONTACTS"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public e f30361A;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CompatStateEditText f30362j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f30363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SwipeRecyclerView f30364p;
    public SideBarView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m f30365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f30366w;

    @Override // com.transsnet.palmpay.credit.contract.MobileContactListContract$IView
    public final void completed() {
        showLoadingDialog(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_mobile_contacts_list_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        m mVar = new m(getContext());
        this.f30365v = mVar;
        mVar.f4986c = new C(this);
        this.f30364p.getRecyclerView().setVerticalScrollBarEnabled(false);
        this.f30364p.getRecyclerView().setLayoutManager(new LinearLayoutManager(getContext()));
        C1548f c1548f = new C1548f(getContext().getColor(b.ppColorDividerLine), 1, 30, 30);
        c1548f.f31336e = false;
        this.f30364p.setRefreshEnable(false);
        this.f30364p.setLoadMoreEnable(false);
        this.f30364p.getRecyclerView().addItemDecoration(c1548f);
        this.f30364p.getRecyclerView().addItemDecoration(new StickyRecyclerHeadersDecoration(this.f30365v));
        this.f30364p.setAdapter(this.f30365v);
        return 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        super.n();
        String[] strArr = f30360B;
        if (!PermissionUtils.isGranted(strArr)) {
            requestPermissions(strArr, 100);
        } else {
            showLoadingDialog(true);
            ((h) this.f27328i).queryPhoneContact(false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f30362j = (CompatStateEditText) this.f27318b.findViewById(Ya.e.search_et);
        this.f30363o = this.f27318b.findViewById(Ya.e.search_view);
        this.t = (SideBarView) this.f27318b.findViewById(Ya.e.side_bar);
        this.f30364p = (SwipeRecyclerView) this.f27318b.findViewById(Ya.e.contact_rv);
        try {
            this.f30363o.setOnClickListener(new c(this, 20));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f30362j.setHint(g.cs_name_or_mobile_number);
        this.f30362j.addTextChangedListener(new A(this, 0));
        this.t.setLetters(getResources().getStringArray(n.cv_slide_bar_value_no_favourite_list));
        this.t.setOnLetterChangeListener(new B(this));
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
                ToastUtils.showShort("You denied the permission, can not add phone contacts");
                return;
            }
        }
        if (i7 == 100) {
            showLoadingDialog(true);
            ((h) this.f27328i).queryPhoneContact(false);
            Ga.c.f3194a.periodUploadV3();
        }
    }

    @Override // com.transsnet.palmpay.credit.contract.MobileContactListContract$IView
    public final void showError(String str) {
        showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // com.transsnet.palmpay.credit.contract.MobileContactListContract$IView
    public final void showLikeQueryPhoneContact(List list) {
        m mVar = this.f30365v;
        mVar.f4985b = list;
        mVar.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.credit.contract.MobileContactListContract$IView
    public final void showPhoneContact(List list) {
        showLoadingDialog(false);
        this.f30366w = list;
        m mVar = this.f30365v;
        mVar.f4985b = list;
        mVar.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new h();
    }
}
