package com.transsnet.palmpay.contacts.ui.activity;

import Bc.p;
import C0.G;
import L6.b;
import R9.d;
import R9.e;
import T8.f;
import V8.w;
import V9.F;
import V9.q;
import W9.A;
import Wf.AbstractC0780y;
import Z9.k;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import com.transsnet.palmpay.contacts.ui.view.SideBarView;
import com.transsnet.palmpay.contacts.ui.viewmodel.PalmPayFriendsViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.C1548f;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/palmpay_list")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/contacts/ui/activity/PalmPayLinkFavesFriendsActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/contacts/ui/viewmodel/PalmPayFriendsViewModel;", "<init>", "()V", "module_contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPalmPayLinkFavesFriendsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PalmPayLinkFavesFriendsActivity.kt\ncom/transsnet/palmpay/contacts/ui/activity/PalmPayLinkFavesFriendsActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,127:1\n171#2,12:128\n215#2:140\n*S KotlinDebug\n*F\n+ 1 PalmPayLinkFavesFriendsActivity.kt\ncom/transsnet/palmpay/contacts/ui/activity/PalmPayLinkFavesFriendsActivity\n*L\n91#1:128,12\n91#1:140\n*E\n"})
public final class PalmPayLinkFavesFriendsActivity extends BaseMvvmActivity<PalmPayFriendsViewModel> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27245e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f27246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public A f27247d;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(e.ct_palmpay_contacts_link_list_activity, (ViewGroup) null, false);
        int i7 = d.contact_rv;
        RecyclerView recyclerView = (RecyclerView) a.m(i7, viewInflate);
        if (recyclerView != null) {
            i7 = d.side_bar;
            SideBarView sideBarView = (SideBarView) a.m(i7, viewInflate);
            if (sideBarView != null) {
                i7 = d.titleBar;
                if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                    p pVar = new p((LinearLayout) viewInflate, recyclerView, sideBarView, 16);
                    this.f27246c = pVar;
                    return pVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        PalmPayFriendsViewModel palmPayFriendsViewModel;
        super.onResume();
        if (!BaseApplication.hasLogin() || (palmPayFriendsViewModel = (PalmPayFriendsViewModel) l()) == null) {
            return;
        }
        AbstractC0780y.m(V.h(palmPayFriendsViewModel), null, null, new k(palmPayFriendsViewModel.f27302e, G.p("Pref_", p367ya.a.d().i(), "_queryPalmPayContactList_", BaseApplication.getCountryLocale()), null), 3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        A a3 = new A(this);
        a3.f10600e = true;
        this.f27247d = a3;
        p pVar = this.f27246c;
        if (pVar != null) {
            ((RecyclerView) pVar.f812c).setLayoutManager(new LinearLayoutManager(this));
        }
        C1548f c1548f = new C1548f(getColor(b.ppColorDividerLine), 1, 30, 30);
        c1548f.f31336e = false;
        p pVar2 = this.f27246c;
        if (pVar2 != null) {
            ((RecyclerView) pVar2.f812c).addItemDecoration(c1548f);
        }
        p pVar3 = this.f27246c;
        if (pVar3 != null) {
            ((RecyclerView) pVar3.f812c).addItemDecoration(new StickyRecyclerHeadersDecoration(this.f27247d));
        }
        p pVar4 = this.f27246c;
        if (pVar4 != null) {
            ((RecyclerView) pVar4.f812c).setAdapter(this.f27247d);
        }
        A a10 = this.f27247d;
        if (a10 != null) {
            a10.f4986c = new q(this, 4);
        }
        l lVar = ((PalmPayFriendsViewModel) l()).f27302e;
        if (lVar != null) {
            lVar.e(this, new f(new w(2, this, this)));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        Z4.e.I(this);
        p pVar = this.f27246c;
        if (pVar != null) {
            ((SideBarView) pVar.f813d).setLetters(getResources().getStringArray(R9.a.ct_slide_bar_value_with_favourite_list));
        }
        p pVar2 = this.f27246c;
        if (pVar2 != null) {
            ((SideBarView) pVar2.f813d).setOnLetterChangeListener(new F(this));
        }
    }
}
