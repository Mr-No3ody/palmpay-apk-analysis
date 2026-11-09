package com.transsnet.palmpay.ui.activity.minor;

import Ac.e;
import Ac.f;
import Ac.h;
import Bc.C0106c;
import Bc.j;
import L6.b;
import Pa.F;
import Pe.W;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.camera2.internal.V;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransHistoryReqV2;
import com.transsnet.palmpay.custom_view.EmptyView;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.custom_view.dialog.c;
import com.transsnet.palmpay.custom_view.dialog.v;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.activity.minor.MinorAccountDetailActivity;
import com.transsnet.palmpay.viewmodule.MinorViewModel;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p025ba.k;
import p054dd.q;
import p207ne.a;
import p207ne.d;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/minor_account_detail")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/minor/MinorAccountDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/MinorViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMinorAccountDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinorAccountDetailActivity.kt\ncom/transsnet/palmpay/ui/activity/minor/MinorAccountDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,312:1\n260#2,10:313\n296#2:323\n260#2,10:324\n296#2:334\n260#2,10:335\n296#2:345\n260#2,10:346\n296#2:356\n260#2,10:357\n296#2:367\n260#2,10:368\n296#2:378\n*S KotlinDebug\n*F\n+ 1 MinorAccountDetailActivity.kt\ncom/transsnet/palmpay/ui/activity/minor/MinorAccountDetailActivity\n*L\n150#1:313,10\n150#1:323\n185#1:324,10\n185#1:334\n198#1:335,10\n198#1:345\n209#1:346,10\n209#1:356\n220#1:357,10\n220#1:367\n231#1:368,10\n231#1:378\n*E\n"})
public final class MinorAccountDetailActivity extends BaseMvvmActivity<MinorViewModel> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f34759g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f34760c = C2131j.b(new a(this, 1));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34761d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f34762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public P8.a f34763f;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((MinorViewModel) l()).f35378e;
        if (lVar != null) {
            lVar.e(this, new q(new d(this, this, 0), 16));
        }
        l lVar2 = ((MinorViewModel) l()).f35382j;
        if (lVar2 != null) {
            lVar2.e(this, new q(new d(this, this, 1), 16));
        }
        l lVar3 = ((MinorViewModel) l()).f35380g;
        if (lVar3 != null) {
            lVar3.e(this, new q(new d(this, this, 2), 16));
        }
        l lVar4 = ((MinorViewModel) l()).t;
        if (lVar4 != null) {
            lVar4.e(this, new q(new d(this, this, 3), 16));
        }
        l lVar5 = ((MinorViewModel) l()).f35383o;
        if (lVar5 != null) {
            lVar5.e(this, new q(new d(this, this, 4), 16));
        }
        l lVar6 = ((MinorViewModel) l()).f35381i;
        if (lVar6 != null) {
            lVar6.e(this, new q(new d(this, this, 5), 16));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(0, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewM2;
        View viewM3;
        View viewM4;
        View viewInflate = getLayoutInflater().inflate(f.main_activity_minor_account_detail, (ViewGroup) null, false);
        int i7 = e.cslManager;
        if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null && (viewM = p059e1.a.m((i7 = e.cslTop), viewInflate)) != null) {
            C0106c c0106cA = C0106c.a(viewM);
            i7 = e.divider;
            View viewM5 = p059e1.a.m(i7, viewInflate);
            if (viewM5 != null && (viewM2 = p059e1.a.m((i7 = e.divider1), viewInflate)) != null && (viewM3 = p059e1.a.m((i7 = e.dividerRevoke), viewInflate)) != null) {
                i7 = e.emptyView;
                EmptyView emptyView = (EmptyView) p059e1.a.m(i7, viewInflate);
                if (emptyView != null) {
                    i7 = e.groupExtend;
                    Group group = (Group) p059e1.a.m(i7, viewInflate);
                    if (group != null) {
                        i7 = e.refreshLayout;
                        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout = (VerticalSwipeRefreshLayout) p059e1.a.m(i7, viewInflate);
                        if (verticalSwipeRefreshLayout != null) {
                            i7 = e.rvTransactionList;
                            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                            if (recyclerView != null) {
                                i7 = e.titleBar;
                                PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                if (ppTitleBar != null) {
                                    i7 = e.tv1;
                                    IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                    if (iconicsTextView != null) {
                                        i7 = e.tvEnd;
                                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView != null) {
                                            i7 = e.tvExtendOp;
                                            IconicsTextView iconicsTextView2 = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                            if (iconicsTextView2 != null) {
                                                i7 = e.tvMore;
                                                IconicsTextView iconicsTextView3 = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                                if (iconicsTextView3 != null) {
                                                    i7 = e.tvRecentTransaction;
                                                    if (((IconicsTextView) p059e1.a.m(i7, viewInflate)) != null) {
                                                        i7 = e.tvRevokeOp;
                                                        IconicsTextView iconicsTextView4 = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                                        if (iconicsTextView4 != null && (viewM4 = p059e1.a.m((i7 = e.vDivider), viewInflate)) != null) {
                                                            j jVar = new j((LinearLayout) viewInflate, c0106cA, viewM5, viewM2, viewM3, emptyView, group, verticalSwipeRefreshLayout, recyclerView, ppTitleBar, iconicsTextView, textView, iconicsTextView2, iconicsTextView3, iconicsTextView4, viewM4);
                                                            this.f34762e = jVar;
                                                            return jVar;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        MinorViewModel minorViewModel = (MinorViewModel) l();
        TransHistoryReqV2 req = new TransHistoryReqV2();
        req.pageNum = 1;
        req.endTime = Long.valueOf(jCurrentTimeMillis);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.add(2, -3);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        req.beginTime = Long.valueOf(calendar.getTimeInMillis());
        req.pageSize = 10;
        req.wardMemberId = o();
        minorViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p140j8.f.s(minorViewModel, new W(req, null), minorViewModel.f35382j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void n(int i7, String str) {
        Intent intentA = F.a(this, "/main/palm_safe_scan_face");
        if (intentA != null) {
            intentA.putExtra("extra_type", 1);
            intentA.putExtra("extra_data", true);
            p038ca.e f28604i = getF28604i();
            if (f28604i != null) {
                f28604i.f(intentA, new V(i7, this, str));
            }
        }
    }

    public final String o() {
        return (String) this.f34760c.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (o().length() > 0) {
            MinorViewModel minorViewModel = (MinorViewModel) l();
            String accountId = o();
            boolean z3 = this.f34761d;
            minorViewModel.getClass();
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            p140j8.f.s(minorViewModel, new Pe.V(accountId, null), minorViewModel.f35378e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0 ? true : z3, (28 & 16) == 0);
        }
        this.f34761d = false;
    }

    public final void p() {
        CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, new v(getString(h.main_minor_revoke_authorization)), new v(getString(h.main_minor_revoke_confirm), 14.0f, b.ppColorTextNormal), new c(getString(h.main_minor_big_revoke), new a(this, 0)), new c(getString(k.core_cancel)), null, 16, null);
        Z supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showCommonTipsDialog");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        m();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        j jVar = this.f34762e;
        if (jVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        this.f34763f = new P8.a(6);
        S6.a aVar = S6.a.pay_CustomerService;
        int iColorInt = CommonViewExtKt.colorInt(b.ppColorTextPrimary, this);
        PpTitleBar ppTitleBar = (PpTitleBar) jVar.t;
        ImageView imageView = ppTitleBar.f24624e;
        if (imageView != null) {
            imageView.setImageDrawable(p059e1.a.h(ppTitleBar.getContext(), aVar, null, iColorInt, 24));
        }
        ((VerticalSwipeRefreshLayout) jVar.f743o).setOnRefreshListener(new p207ne.b(this));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = (RecyclerView) jVar.f744p;
        recyclerView.setLayoutManager(linearLayoutManager);
        P8.a aVar2 = this.f34763f;
        if (aVar2 == null) {
            Intrinsics.n("mCashBoxTransactionAdapter");
            throw null;
        }
        recyclerView.setAdapter(aVar2);
        P8.a aVar3 = this.f34763f;
        if (aVar3 == null) {
            Intrinsics.n("mCashBoxTransactionAdapter");
            throw null;
        }
        aVar3.setOnItemClickListener(new p207ne.b(this));
        final int i7 = 0;
        ((IconicsTextView) ((C0106c) jVar.f737d).t).setOnClickListener(new View.OnClickListener(this) { // from class: ne.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MinorAccountDetailActivity f39939b;

            {
                this.f39939b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MinorAccountDetailActivity minorAccountDetailActivity = this.f39939b;
                switch (i7) {
                    case 0:
                        int i10 = MinorAccountDetailActivity.f34759g;
                        minorAccountDetailActivity.p();
                        break;
                    default:
                        int i11 = MinorAccountDetailActivity.f34759g;
                        ARouter.getInstance().build("/main/trans_history").withString("extra_id", minorAccountDetailActivity.o()).navigation();
                        break;
                }
            }
        });
        final int i10 = 1;
        ((IconicsTextView) jVar.f731A).setOnClickListener(new View.OnClickListener(this) { // from class: ne.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MinorAccountDetailActivity f39939b;

            {
                this.f39939b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MinorAccountDetailActivity minorAccountDetailActivity = this.f39939b;
                switch (i10) {
                    case 0:
                        int i11 = MinorAccountDetailActivity.f34759g;
                        minorAccountDetailActivity.p();
                        break;
                    default:
                        int i12 = MinorAccountDetailActivity.f34759g;
                        ARouter.getInstance().build("/main/trans_history").withString("extra_id", minorAccountDetailActivity.o()).navigation();
                        break;
                }
            }
        });
    }
}
