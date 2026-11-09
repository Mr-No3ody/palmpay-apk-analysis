package com.transsnet.palmpay.ui.activity.minor;

import Ac.h;
import Bc.k;
import Pe.S;
import android.os.Bundle;
import android.widget.ImageView;
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
import p140j8.f;
import p141j9.s;
import p141j9.t;
import p207ne.g;
import p328ve.q;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/minor_account_history_list")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/minor/MinorAccountHistoryListActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/MinorViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMinorAccountHistoryListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MinorAccountHistoryListActivity.kt\ncom/transsnet/palmpay/ui/activity/minor/MinorAccountHistoryListActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,95:1\n260#2,10:96\n296#2:106\n*S KotlinDebug\n*F\n+ 1 MinorAccountHistoryListActivity.kt\ncom/transsnet/palmpay/ui/activity/minor/MinorAccountHistoryListActivity\n*L\n74#1:96,10\n74#1:106\n*E\n"})
public final class MinorAccountHistoryListActivity extends BaseMvvmActivity<MinorViewModel> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34764e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f34765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f34766d;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((MinorViewModel) l()).f35379f;
        if (lVar != null) {
            lVar.e(this, new s(new t(this, this, 7), 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(0, true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        k kVarC = k.c(getLayoutInflater());
        this.f34765c = kVarC;
        return kVarC;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        MinorViewModel minorViewModel = (MinorViewModel) l();
        minorViewModel.getClass();
        f.s(minorViewModel, new S(1, null), minorViewModel.f35379f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        k kVar = this.f34765c;
        if (kVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        this.f34766d = new q(2);
        String string = getString(h.main_minor_authorization_history);
        PpTitleBar ppTitleBar = (PpTitleBar) kVar.f750d;
        ppTitleBar.setTitle(string);
        ImageView rightImageView1 = ppTitleBar.getRightImageView1();
        if (rightImageView1 != null) {
            rightImageView1.setVisibility(8);
        }
        SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) kVar.f752f;
        swipeRecyclerView.setRefreshEnable(true);
        swipeRecyclerView.setLoadMoreEnable(false);
        swipeRecyclerView.getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        q qVar = this.f34766d;
        if (qVar == null) {
            Intrinsics.n("mAccountHistoryAdapter");
            throw null;
        }
        swipeRecyclerView.setAdapter(qVar);
        swipeRecyclerView.getRecyclerView().addItemDecoration(new p207ne.f());
        swipeRecyclerView.setOnLoadListener(new g(this, kVar));
    }
}
