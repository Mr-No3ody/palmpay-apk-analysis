package com.transsnet.palmpay.send_money.ui.activity.st4bu;

import Ed.ViewOnFocusChangeListenerC0235o;
import V8.w;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.custom_view.PpSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableBeneficiariesListActivity;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferForBankUnstableViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p141j9.s;
import p159kd.e;
import p159kd.f;
import p173ld.g;
import p270rd.C1976t;
import p341wd.a;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/schedule_transfer_for_bank_unstable_beneficiaries_list")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableBeneficiariesListActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/ScheduleTransferForBankUnstableViewModel;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferForBankUnstableBeneficiariesListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferForBankUnstableBeneficiariesListActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableBeneficiariesListActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n152#2:187\n169#2:188\n1#3:189\n*S KotlinDebug\n*F\n+ 1 ScheduleTransferForBankUnstableBeneficiariesListActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableBeneficiariesListActivity\n*L\n119#1:187\n119#1:188\n*E\n"})
public final class ScheduleTransferForBankUnstableBeneficiariesListActivity extends BaseMvvmActivity<ScheduleTransferForBankUnstableViewModel> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f33425o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33430g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33431i = C2131j.b(new C1976t(26));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33432j = C2131j.b(new C1976t(27));

    public ScheduleTransferForBankUnstableBeneficiariesListActivity() {
        final int i7 = 0;
        this.f33426c = C2131j.b(new Function0(this) { // from class: wd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableBeneficiariesListActivity f43404b;

            {
                this.f43404b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity = this.f43404b;
                switch (i7) {
                    case 0:
                        int i10 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (RecyclerView) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.rv_schedule_transfer_list);
                    case 1:
                        int i11 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (PpSwipeRefreshLayout) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.srl_refresh);
                    case 2:
                        int i12 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (CompatStateEditText) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.search_et);
                    default:
                        int i13 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (IconicsImageView) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.search_iv);
                }
            }
        });
        final int i10 = 1;
        this.f33427d = C2131j.b(new Function0(this) { // from class: wd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableBeneficiariesListActivity f43404b;

            {
                this.f43404b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity = this.f43404b;
                switch (i10) {
                    case 0:
                        int i11 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (RecyclerView) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.rv_schedule_transfer_list);
                    case 1:
                        int i12 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (PpSwipeRefreshLayout) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.srl_refresh);
                    case 2:
                        int i13 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (CompatStateEditText) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.search_et);
                    default:
                        int i14 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (IconicsImageView) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.search_iv);
                }
            }
        });
        final int i11 = 2;
        this.f33428e = C2131j.b(new Function0(this) { // from class: wd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableBeneficiariesListActivity f43404b;

            {
                this.f43404b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity = this.f43404b;
                switch (i11) {
                    case 0:
                        int i12 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (RecyclerView) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.rv_schedule_transfer_list);
                    case 1:
                        int i13 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (PpSwipeRefreshLayout) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.srl_refresh);
                    case 2:
                        int i14 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (CompatStateEditText) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.search_et);
                    default:
                        int i15 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (IconicsImageView) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.search_iv);
                }
            }
        });
        final int i12 = 3;
        this.f33429f = C2131j.b(new Function0(this) { // from class: wd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableBeneficiariesListActivity f43404b;

            {
                this.f43404b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity = this.f43404b;
                switch (i12) {
                    case 0:
                        int i13 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (RecyclerView) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.rv_schedule_transfer_list);
                    case 1:
                        int i14 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (PpSwipeRefreshLayout) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.srl_refresh);
                    case 2:
                        int i15 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (CompatStateEditText) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.search_et);
                    default:
                        int i16 = ScheduleTransferForBankUnstableBeneficiariesListActivity.f33425o;
                        return (IconicsImageView) scheduleTransferForBankUnstableBeneficiariesListActivity.findViewById(e.search_iv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_schedule_transfer_for_bank_untable_beneficiaries_list;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((ScheduleTransferForBankUnstableViewModel) l()).t;
        if (lVar != null) {
            lVar.e(this, new s(new w(this, 28), (byte) 0, (char) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final g m() {
        return (g) this.f33431i.getValue();
    }

    public final CompatStateEditText n() {
        Object value = this.f33428e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CompatStateEditText) value;
    }

    public final PpSwipeRefreshLayout o() {
        Object value = this.f33427d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpSwipeRefreshLayout) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        PpSwipeRefreshLayout ppSwipeRefreshLayoutO = o();
        ppSwipeRefreshLayoutO.setRefreshing(true);
        SwipeRefreshLayout.OnRefreshListener onRefreshListener = ppSwipeRefreshLayoutO.f31095a;
        if (onRefreshListener != null) {
            onRefreshListener.onRefresh();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(true);
        n().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 27));
        n().addTextChangedListener(new R3.e(this, 24));
        o().setOnRefreshListener(new a(this));
        t tVar = this.f33426c;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        C1548f c1548f = new C1548f(getColor(p.transparent), DensityUtil.dp2px(12.0f));
        c1548f.f31336e = true;
        ((RecyclerView) value).addItemDecoration(c1548f);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setLayoutManager(new LinearLayoutManager(this));
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RecyclerView) value3).setAdapter(m());
        m().setOnItemClickListener(new a(this));
    }
}
