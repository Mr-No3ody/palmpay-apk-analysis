package com.transsnet.palmpay.ui.activity.minor;

import Bc.k;
import Pe.N;
import S6.a;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.viewmodule.MinorViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p054dd.d;
import p140j8.f;
import p141j9.C1794b;
import p141j9.s;
import p141j9.t;
import p207ne.h;
import p207ne.i;
import p328ve.q;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/minor_account_list")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/minor/MinorAccountListActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/MinorViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMinorAccountListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinorAccountListActivity.kt\ncom/transsnet/palmpay/ui/activity/minor/MinorAccountListActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,119:1\n260#2,10:120\n296#2:130\n*S KotlinDebug\n*F\n+ 1 MinorAccountListActivity.kt\ncom/transsnet/palmpay/ui/activity/minor/MinorAccountListActivity\n*L\n93#1:120,10\n93#1:130\n*E\n"})
public final class MinorAccountListActivity extends BaseMvvmActivity<MinorViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34767f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f34768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f34769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34770e = true;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((MinorViewModel) l()).f35379f;
        if (lVar != null) {
            lVar.e(this, new s(new t(this, this, 8), (short) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(0, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        k kVarC = k.c(getLayoutInflater());
        this.f34768c = kVarC;
        return kVarC;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        MinorViewModel minorViewModel = (MinorViewModel) l();
        boolean z3 = this.f34770e;
        minorViewModel.getClass();
        f.s(minorViewModel, new N(1, null), minorViewModel.f35379f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0 ? true : z3, (28 & 16) == 0);
        this.f34770e = false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        k kVar = this.f34768c;
        if (kVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        this.f34769d = new q(1);
        TextView textView = (TextView) kVar.f749c;
        textView.setVisibility(0);
        textView.setOnClickListener(new d(26));
        PpTitleBar ppTitleBar = (PpTitleBar) kVar.f750d;
        ImageView rightImageView1 = ppTitleBar.getRightImageView1();
        if (rightImageView1 != null) {
            rightImageView1.setVisibility(8);
        }
        ppTitleBar.setRightImageView1Icon(a.pay_Invite);
        ppTitleBar.setRightImageView1ClickListener(new d(27));
        SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) kVar.f752f;
        swipeRecyclerView.setRefreshEnable(true);
        swipeRecyclerView.setLoadMoreEnable(false);
        swipeRecyclerView.getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        swipeRecyclerView.getRecyclerView().addItemDecoration(new h());
        q qVar = this.f34769d;
        if (qVar == null) {
            Intrinsics.n("mAccountHistoryAdapter");
            throw null;
        }
        swipeRecyclerView.setAdapter(qVar);
        q qVar2 = this.f34769d;
        if (qVar2 == null) {
            Intrinsics.n("mAccountHistoryAdapter");
            throw null;
        }
        qVar2.setOnItemClickListener(new C1794b(this, 17));
        swipeRecyclerView.setOnLoadListener(new i(this, kVar));
    }
}
