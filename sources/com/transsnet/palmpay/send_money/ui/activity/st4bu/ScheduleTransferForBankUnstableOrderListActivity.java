package com.transsnet.palmpay.send_money.ui.activity.st4bu;

import Kd.F;
import M1.j;
import N8.q0;
import V8.w;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.PpSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableOrderResp;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableOrderListActivity;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferForBankUnstableViewModel;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p141j9.s;
import p159kd.e;
import p159kd.f;
import p173ld.h;
import p270rd.C1976t;
import p327vd.c;
import p341wd.r;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "银行宕机预约订单记录", path = "/sm/schedule_transfer_for_bank_unstable_list")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableOrderListActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/ScheduleTransferForBankUnstableViewModel;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferForBankUnstableOrderListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferForBankUnstableOrderListActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableOrderListActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,332:1\n152#2:333\n169#2:334\n562#3,10:335\n1#4:345\n*S KotlinDebug\n*F\n+ 1 ScheduleTransferForBankUnstableOrderListActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableOrderListActivity\n*L\n92#1:333\n92#1:334\n134#1:335,10\n*E\n"})
public final class ScheduleTransferForBankUnstableOrderListActivity extends BaseMvvmActivity<ScheduleTransferForBankUnstableViewModel> {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f33471C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f33472A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33475d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33478g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33479i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f33481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Integer f33482p;
    public RecyclerView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f33483v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f33484w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33476e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33477f = C2131j.b(new C1976t(29));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f33480j = 0L;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f33473B = true;

    public ScheduleTransferForBankUnstableOrderListActivity() {
        final int i7 = 0;
        this.f33474c = C2131j.b(new Function0(this) { // from class: wd.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableOrderListActivity f43435b;

            {
                this.f43435b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableOrderListActivity scheduleTransferForBankUnstableOrderListActivity = this.f43435b;
                switch (i7) {
                    case 0:
                        int i10 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        return (RecyclerView) scheduleTransferForBankUnstableOrderListActivity.findViewById(e.rv_schedule_transfer_list);
                    case 1:
                        int i11 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        return (PpSwipeRefreshLayout) scheduleTransferForBankUnstableOrderListActivity.findViewById(e.srl_refresh);
                    case 2:
                        int i12 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        h hVar = new h();
                        hVar.setOnItemClickListener(new r(scheduleTransferForBankUnstableOrderListActivity, 3));
                        return hVar;
                    default:
                        int i13 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        return scheduleTransferForBankUnstableOrderListActivity.getLayoutInflater().inflate(f.sm_layout_schedule_transfer_for_bank_unstable_header, (ViewGroup) null);
                }
            }
        });
        final int i10 = 1;
        this.f33475d = C2131j.b(new Function0(this) { // from class: wd.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableOrderListActivity f43435b;

            {
                this.f43435b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableOrderListActivity scheduleTransferForBankUnstableOrderListActivity = this.f43435b;
                switch (i10) {
                    case 0:
                        int i11 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        return (RecyclerView) scheduleTransferForBankUnstableOrderListActivity.findViewById(e.rv_schedule_transfer_list);
                    case 1:
                        int i12 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        return (PpSwipeRefreshLayout) scheduleTransferForBankUnstableOrderListActivity.findViewById(e.srl_refresh);
                    case 2:
                        int i13 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        h hVar = new h();
                        hVar.setOnItemClickListener(new r(scheduleTransferForBankUnstableOrderListActivity, 3));
                        return hVar;
                    default:
                        int i14 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        return scheduleTransferForBankUnstableOrderListActivity.getLayoutInflater().inflate(f.sm_layout_schedule_transfer_for_bank_unstable_header, (ViewGroup) null);
                }
            }
        });
        final int i11 = 2;
        this.f33478g = C2131j.b(new Function0(this) { // from class: wd.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableOrderListActivity f43435b;

            {
                this.f43435b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableOrderListActivity scheduleTransferForBankUnstableOrderListActivity = this.f43435b;
                switch (i11) {
                    case 0:
                        int i12 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        return (RecyclerView) scheduleTransferForBankUnstableOrderListActivity.findViewById(e.rv_schedule_transfer_list);
                    case 1:
                        int i13 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        return (PpSwipeRefreshLayout) scheduleTransferForBankUnstableOrderListActivity.findViewById(e.srl_refresh);
                    case 2:
                        int i14 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        h hVar = new h();
                        hVar.setOnItemClickListener(new r(scheduleTransferForBankUnstableOrderListActivity, 3));
                        return hVar;
                    default:
                        int i15 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        return scheduleTransferForBankUnstableOrderListActivity.getLayoutInflater().inflate(f.sm_layout_schedule_transfer_for_bank_unstable_header, (ViewGroup) null);
                }
            }
        });
        final int i12 = 3;
        this.f33479i = C2131j.b(new Function0(this) { // from class: wd.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableOrderListActivity f43435b;

            {
                this.f43435b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableOrderListActivity scheduleTransferForBankUnstableOrderListActivity = this.f43435b;
                switch (i12) {
                    case 0:
                        int i13 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        return (RecyclerView) scheduleTransferForBankUnstableOrderListActivity.findViewById(e.rv_schedule_transfer_list);
                    case 1:
                        int i14 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        return (PpSwipeRefreshLayout) scheduleTransferForBankUnstableOrderListActivity.findViewById(e.srl_refresh);
                    case 2:
                        int i15 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        h hVar = new h();
                        hVar.setOnItemClickListener(new r(scheduleTransferForBankUnstableOrderListActivity, 3));
                        return hVar;
                    default:
                        int i16 = ScheduleTransferForBankUnstableOrderListActivity.f33471C;
                        return scheduleTransferForBankUnstableOrderListActivity.getLayoutInflater().inflate(f.sm_layout_schedule_transfer_for_bank_unstable_header, (ViewGroup) null);
                }
            }
        });
    }

    public static final void m(ScheduleTransferForBankUnstableOrderListActivity scheduleTransferForBankUnstableOrderListActivity) {
        scheduleTransferForBankUnstableOrderListActivity.r().setOnRefreshListener(new r(scheduleTransferForBankUnstableOrderListActivity, 0));
        t tVar = scheduleTransferForBankUnstableOrderListActivity.f33474c;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        C1548f c1548f = new C1548f(scheduleTransferForBankUnstableOrderListActivity.getColor(p.transparent), DensityUtil.dp2px(12.0f));
        c1548f.f31336e = true;
        ((RecyclerView) value).addItemDecoration(c1548f);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setLayoutManager(new LinearLayoutManager(scheduleTransferForBankUnstableOrderListActivity));
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RecyclerView) value3).setAdapter(scheduleTransferForBankUnstableOrderListActivity.o());
        scheduleTransferForBankUnstableOrderListActivity.o().setOnItemClickListener(new r(scheduleTransferForBankUnstableOrderListActivity, 1));
        scheduleTransferForBankUnstableOrderListActivity.o().getLoadMoreModule().setOnLoadMoreListener(new r(scheduleTransferForBankUnstableOrderListActivity, 2));
        scheduleTransferForBankUnstableOrderListActivity.o().getLoadMoreModule().getClass();
        scheduleTransferForBankUnstableOrderListActivity.o().getLoadMoreModule().f8647f = false;
        scheduleTransferForBankUnstableOrderListActivity.o().setHeaderWithEmptyEnable(true);
        scheduleTransferForBankUnstableOrderListActivity.f33483v = (TextView) scheduleTransferForBankUnstableOrderListActivity.q().findViewById(e.tv_active_booking_title);
        RecyclerView recyclerView = (RecyclerView) scheduleTransferForBankUnstableOrderListActivity.q().findViewById(e.rv_active_booking_list);
        if (recyclerView != null) {
            C1548f c1548f2 = new C1548f(scheduleTransferForBankUnstableOrderListActivity.getColor(p.transparent), DensityUtil.dp2px(12.0f));
            c1548f2.f31336e = true;
            recyclerView.addItemDecoration(c1548f2);
            recyclerView.setLayoutManager(new LinearLayoutManager(scheduleTransferForBankUnstableOrderListActivity));
            recyclerView.setAdapter((h) scheduleTransferForBankUnstableOrderListActivity.f33478g.getValue());
        } else {
            recyclerView = null;
        }
        scheduleTransferForBankUnstableOrderListActivity.t = recyclerView;
        scheduleTransferForBankUnstableOrderListActivity.f33484w = (TextView) scheduleTransferForBankUnstableOrderListActivity.q().findViewById(e.tv_completed_booking_title);
        TextView textView = (TextView) scheduleTransferForBankUnstableOrderListActivity.q().findViewById(e.tv_date);
        textView.setOnClickListener(new c(scheduleTransferForBankUnstableOrderListActivity, 6));
        scheduleTransferForBankUnstableOrderListActivity.f33472A = textView;
        j.setHeaderView$default(scheduleTransferForBankUnstableOrderListActivity.o(), scheduleTransferForBankUnstableOrderListActivity.q(), 0, 0, 6, null);
        scheduleTransferForBankUnstableOrderListActivity.f33476e = 1;
        scheduleTransferForBankUnstableOrderListActivity.p();
    }

    public static void s(ScheduleTransferForBankUnstableOrderResp scheduleTransferForBankUnstableOrderResp) {
        String orderNo;
        String str;
        if (scheduleTransferForBankUnstableOrderResp != null) {
            Integer bookStatus = scheduleTransferForBankUnstableOrderResp.getBookStatus();
            if ((bookStatus != null && bookStatus.intValue() == 1) || ((bookStatus != null && bookStatus.intValue() == 2) || (bookStatus != null && bookStatus.intValue() == 5))) {
                String bookNo = scheduleTransferForBankUnstableOrderResp.getBookNo();
                if (bookNo != null) {
                    str = TextUtils.isEmpty(bookNo) ? null : bookNo;
                    if (str != null) {
                        q0.v("/sm/schedule_transfer_for_bank_unstable_detail", "orderId", str);
                        return;
                    }
                    return;
                }
                return;
            }
            if (((bookStatus != null && bookStatus.intValue() == 4) || (bookStatus != null && bookStatus.intValue() == 3)) && (orderNo = scheduleTransferForBankUnstableOrderResp.getOrderNo()) != null) {
                str = TextUtils.isEmpty(orderNo) ? null : orderNo;
                if (str != null) {
                    q0.v("/smorder/detail", "orderId", str);
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_schedule_transfer_for_bank_untable_list;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((ScheduleTransferForBankUnstableViewModel) l()).f33993e;
        if (lVar != null) {
            lVar.e(this, new s(new w(this, 29), (byte) 0, 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void n(Long l5) {
        if (l5 == null || l5.longValue() <= 0) {
            return;
        }
        this.f33480j = l5;
        this.f33482p = Integer.valueOf(TimeUtils.getMonth(l5.longValue()));
        this.f33481o = Integer.valueOf(TimeUtils.getYear(l5.longValue()));
        TextView textView = this.f33472A;
        if (textView != null) {
            p220oa.h.C(textView);
        }
        TextView textView2 = this.f33472A;
        if (textView2 != null) {
            textView2.setText(TimeUtils.millis2String(l5.longValue(), new SimpleDateFormat("MMM yyyy", Locale.US)));
        }
    }

    public final h o() {
        return (h) this.f33477f.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f33473B) {
            this.f33473B = false;
        } else {
            this.f33476e = 1;
            p();
        }
    }

    public final void p() {
        ScheduleTransferForBankUnstableViewModel scheduleTransferForBankUnstableViewModel = (ScheduleTransferForBankUnstableViewModel) l();
        int i7 = this.f33476e;
        Integer num = this.f33481o;
        Integer num2 = this.f33482p;
        scheduleTransferForBankUnstableViewModel.getClass();
        p140j8.f.s(scheduleTransferForBankUnstableViewModel, new F(num, num2, i7, null), scheduleTransferForBankUnstableViewModel.f33993e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new p7.h(uIHandler, 18, this, false));
    }

    public final View q() {
        Object value = this.f33479i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    public final PpSwipeRefreshLayout r() {
        Object value = this.f33475d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpSwipeRefreshLayout) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(CommonViewExtKt.colorInt(p.transparent, this), !isDarkMode());
    }
}
