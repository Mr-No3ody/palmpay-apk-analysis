package com.transsnet.palmpay.send_money.ui.activity.schedule_transfer;

import Kd.C0380h0;
import Kd.C0392l0;
import M1.j;
import S1.c;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferOrderResp;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferViewModel;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p052da.K;
import p059e1.a;
import p159kd.e;
import p159kd.f;
import p173ld.k;
import p220oa.h;
import p223od.d;
import p223od.v;
import p270rd.C1976t;
import p284sb.C2023v;
import p312ud.m;
import p312ud.n;
import p312ud.o;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "定时转账详情页", path = "/sm/schedule_transfer_order_detail")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferOrderDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/ScheduleTransferViewModel;", "Lod/d;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferOrderDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferOrderDetailActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferOrderDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,462:1\n171#2,12:463\n215#2:475\n171#2,12:476\n215#2:488\n171#2,12:489\n215#2:501\n1#3:502\n1869#4,2:503\n*S KotlinDebug\n*F\n+ 1 ScheduleTransferOrderDetailActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferOrderDetailActivity\n*L\n135#1:463,12\n135#1:475\n145#1:476,12\n145#1:488\n155#1:489,12\n155#1:501\n317#1:503,2\n*E\n"})
public final class ScheduleTransferOrderDetailActivity extends BaseMvvmVBActivity<ScheduleTransferViewModel, d> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f33409p = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33410d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ScheduleTransferOrderResp f33412f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f33415j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33411e = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33413g = C2131j.b(new p068ec.d(this, 28));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33414i = C2131j.b(new C1976t(21));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f33416o = new ArrayList();

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((ScheduleTransferViewModel) l()).f34017o;
        if (lVar != null) {
            lVar.e(this, new C2023v(new o(this, this, 0), 12));
        }
        l lVar2 = ((ScheduleTransferViewModel) l()).f34018p;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new o(this, this, 1), 12));
        }
        l lVar3 = ((ScheduleTransferViewModel) l()).t;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new o(this, this, 2), 12));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(p.transparent, this), !isDarkMode());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(f.sm_activity_schedule_transfer_order_detail, (ViewGroup) null, false);
        int i7 = e.rv_orders;
        RecyclerView recyclerView = (RecyclerView) a.m(i7, viewInflate);
        if (recyclerView != null) {
            i7 = e.titleBar;
            if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                i7 = e.tv_turn_off;
                TextView textView = (TextView) a.m(i7, viewInflate);
                if (textView != null) {
                    d dVar = new d((LinearLayout) viewInflate, recyclerView, textView);
                    Intrinsics.checkNotNullExpressionValue(dVar, "inflate(...)");
                    return dVar;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final k n() {
        return (k) this.f33414i.getValue();
    }

    public final v o() {
        return (v) this.f33413g.getValue();
    }

    public final OrderResultItemModel p(int i7, String str, String str2) {
        SpanUtils spanUtils = new SpanUtils();
        if (str2 == null) {
            str2 = "";
        }
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(this, i7, str, spanUtils.append(str2).setFontFamily("sans-serif-medium").create(), 12.0f, 12.0f, CommonViewExtKt.getDp(40));
        v vVarO = o();
        if (vVarO != null) {
            vVarO.f40520b.addView(orderResultItemModel);
        }
        return orderResultItemModel;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String str = this.f33410d;
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str != null) {
                ScheduleTransferViewModel scheduleTransferViewModel = (ScheduleTransferViewModel) l();
                scheduleTransferViewModel.getClass();
                p140j8.f.s(scheduleTransferViewModel, new C0380h0(str, null), scheduleTransferViewModel.f34017o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                ScheduleTransferViewModel scheduleTransferViewModel2 = (ScheduleTransferViewModel) l();
                int i7 = this.f33411e;
                scheduleTransferViewModel2.getClass();
                p140j8.f.s(scheduleTransferViewModel2, new C0392l0(i7, str, null), scheduleTransferViewModel2.f34018p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        LinearLayout linearLayout;
        super.setupView();
        ARouter.getInstance().inject(this);
        n().setOnItemClickListener(new m(this));
        n().getLoadMoreModule().setOnLoadMoreListener(new m(this));
        c loadMoreModule = n().getLoadMoreModule();
        K k2 = new K(this, 30);
        loadMoreModule.getClass();
        Intrinsics.checkNotNullParameter(k2, "<set-?>");
        loadMoreModule.f8646e = k2;
        n().getLoadMoreModule().getClass();
        n().getLoadMoreModule().f8647f = false;
        d dVar = (d) this.f27334c;
        if (dVar != null) {
            dVar.f40323b.setAdapter(n());
        }
        d dVar2 = (d) this.f27334c;
        if (dVar2 != null) {
            dVar2.f40323b.setLayoutManager(new LinearLayoutManager(this));
        }
        v vVarO = o();
        if (vVarO != null && (linearLayout = vVarO.f40519a) != null) {
            j.setHeaderView$default(n(), linearLayout, 0, 0, 6, null);
            n().setHeaderWithEmptyEnable(true);
        }
        View viewInflate = getLayoutInflater().inflate(f.sm_layout_to_palmpay_empty_view_168, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(e.iv_empty_icon);
        TextView textView = (TextView) viewInflate.findViewById(e.tv_empty_title);
        if (textView != null) {
            h.c(textView);
        }
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(e.ll_empty_content);
        if (linearLayout2 != null) {
            linearLayout2.setBackgroundResource(r.cv_rect_corner_bl_br_12_bg_white);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(e.tv_empty_tip);
        imageView.setImageResource(r.cv_empty_no_transaction_history);
        textView2.setText("No Transaction History");
        n().setEmptyView(viewInflate);
        d dVar3 = (d) this.f27334c;
        if (dVar3 != null) {
            dVar3.f40324c.setOnClickListener(new n(this, 0));
        }
    }
}
