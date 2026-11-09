package com.transsnet.palmpay.airtime.ui;

import G9.i;
import L6.b;
import Wd.N;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.timehop.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeTopupViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.teller.bean.HistoryOrderReq;
import io.fastkv.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.C1910o;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068ec.d;
import p140j8.f;
import p141j9.C1794b;
import p141j9.C1807o;
import p141j9.u;
import p141j9.v;
import p155k9.q;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "话费/充值记录", path = "/airtime/bill_history_record", remark = "ignore")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/TopUpRecordActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/airtime/viewmodel/AirTimeTopupViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "msg", "", "onTransferResultMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "Wd/N", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTopUpRecordActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopUpRecordActivity.kt\ncom/transsnet/palmpay/airtime/ui/TopUpRecordActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n295#2,2:203\n*S KotlinDebug\n*F\n+ 1 TopUpRecordActivity.kt\ncom/transsnet/palmpay/airtime/ui/TopUpRecordActivity\n*L\n89#1:203,2\n*E\n"})
public final class TopUpRecordActivity extends BaseMvvmActivity<AirTimeTopupViewModel> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f26486p = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SwipeRecyclerView f26487c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26491g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26488d = C2131j.b(new d(this, 4));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f26489e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26490f = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f26492i = 15;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.activity.result.a f26493j = registerForActivityResult(new N(this, 1), new i(this, 7));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1794b f26494o = new C1794b(this, 1);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) TopUpRecordActivity.class));
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Pd.d.qt_airtime_activity_top_up_record;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        int i7 = 1;
        n.B(this, ((AirTimeTopupViewModel) l()).f26618L, this, new C1807o(this, i7), new u(this, i7), false, null, 240);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m(int i7) {
        HistoryOrderReq req = new HistoryOrderReq();
        req.pageNum = i7;
        req.pageSize = this.f26492i;
        AirTimeTopupViewModel airTimeTopupViewModel = (AirTimeTopupViewModel) l();
        u function = new u(this, 0);
        airTimeTopupViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(function, "function");
        if (BaseApplication.hasLogin()) {
            C1910o c1910o = new C1910o(req, null);
            l lVar = airTimeTopupViewModel.f26618L;
            lVar.f27356m = function;
            Unit unit = Unit.f38893a;
            f.v(airTimeTopupViewModel, c1910o, lVar, 0L);
        }
    }

    public final q n() {
        return (q) this.f26488d.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onTransferResultMessage(@Nullable MessageEvent msg) {
        if (msg != null && msg.getEventType() == 5) {
            this.f26490f = 1;
            m(1);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        m(this.f26490f);
        c.b().j(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(b.ppColorBackgroundLight));
        SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) findViewById(Pd.c.atur_record_rcv);
        this.f26487c = swipeRecyclerView;
        if (swipeRecyclerView == null) {
            Intrinsics.n("mSwipeRecyclerView");
            throw null;
        }
        swipeRecyclerView.getRecyclerView().setLayoutManager(new LinearLayoutManager(this, 1, false));
        SwipeRecyclerView swipeRecyclerView2 = this.f26487c;
        if (swipeRecyclerView2 == null) {
            Intrinsics.n("mSwipeRecyclerView");
            throw null;
        }
        swipeRecyclerView2.setAdapter(n());
        StickyRecyclerHeadersDecoration stickyRecyclerHeadersDecoration = new StickyRecyclerHeadersDecoration(n());
        SwipeRecyclerView swipeRecyclerView3 = this.f26487c;
        if (swipeRecyclerView3 == null) {
            Intrinsics.n("mSwipeRecyclerView");
            throw null;
        }
        swipeRecyclerView3.getRecyclerView().addItemDecoration(stickyRecyclerHeadersDecoration);
        n().f4986c = this.f26494o;
        SwipeRecyclerView swipeRecyclerView4 = this.f26487c;
        if (swipeRecyclerView4 == null) {
            Intrinsics.n("mSwipeRecyclerView");
            throw null;
        }
        swipeRecyclerView4.setRefreshEnable(false);
        SwipeRecyclerView swipeRecyclerView5 = this.f26487c;
        if (swipeRecyclerView5 != null) {
            swipeRecyclerView5.setOnLoadListener(new v(this));
        } else {
            Intrinsics.n("mSwipeRecyclerView");
            throw null;
        }
    }
}
