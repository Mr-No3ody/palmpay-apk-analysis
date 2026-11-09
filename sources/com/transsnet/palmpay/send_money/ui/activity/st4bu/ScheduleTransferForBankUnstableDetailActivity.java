package com.transsnet.palmpay.send_money.ui.activity.st4bu;

import L6.b;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableOrderResp;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableDetailActivity;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferForBankUnstableViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p159kd.e;
import p159kd.f;
import p284sb.C2023v;
import p341wd.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "银行宕机预约订单详情", path = "/sm/schedule_transfer_for_bank_unstable_detail")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/ScheduleTransferForBankUnstableViewModel;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferForBankUnstableDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferForBankUnstableDetailActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,226:1\n171#2,12:227\n215#2:239\n171#2,12:240\n215#2:252\n562#3,10:253\n*S KotlinDebug\n*F\n+ 1 ScheduleTransferForBankUnstableDetailActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableDetailActivity\n*L\n66#1:227,12\n66#1:239\n75#1:240,12\n75#1:252\n93#1:253,10\n*E\n"})
public final class ScheduleTransferForBankUnstableDetailActivity extends BaseMvvmActivity<ScheduleTransferForBankUnstableViewModel> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f33433o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33438g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f33439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ScheduleTransferForBankUnstableOrderResp f33440j;

    public ScheduleTransferForBankUnstableDetailActivity() {
        final int i7 = 0;
        this.f33434c = C2131j.b(new Function0(this) { // from class: wd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableDetailActivity f43416b;

            {
                this.f43416b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity = this.f43416b;
                switch (i7) {
                    case 0:
                        int i10 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (OrderResultViewReceiptModel) scheduleTransferForBankUnstableDetailActivity.findViewById(e.model_transfer_detail_bottom);
                    case 1:
                        int i11 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (LinearLayout) scheduleTransferForBankUnstableDetailActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i12 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (LinearLayout) scheduleTransferForBankUnstableDetailActivity.findViewById(e.ll_fee_detail);
                    case 3:
                        int i13 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (OrderResultHeaderModel) scheduleTransferForBankUnstableDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i14 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (PpTitleBar) scheduleTransferForBankUnstableDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i10 = 1;
        this.f33435d = C2131j.b(new Function0(this) { // from class: wd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableDetailActivity f43416b;

            {
                this.f43416b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity = this.f43416b;
                switch (i10) {
                    case 0:
                        int i11 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (OrderResultViewReceiptModel) scheduleTransferForBankUnstableDetailActivity.findViewById(e.model_transfer_detail_bottom);
                    case 1:
                        int i12 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (LinearLayout) scheduleTransferForBankUnstableDetailActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i13 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (LinearLayout) scheduleTransferForBankUnstableDetailActivity.findViewById(e.ll_fee_detail);
                    case 3:
                        int i14 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (OrderResultHeaderModel) scheduleTransferForBankUnstableDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i15 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (PpTitleBar) scheduleTransferForBankUnstableDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i11 = 2;
        this.f33436e = C2131j.b(new Function0(this) { // from class: wd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableDetailActivity f43416b;

            {
                this.f43416b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity = this.f43416b;
                switch (i11) {
                    case 0:
                        int i12 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (OrderResultViewReceiptModel) scheduleTransferForBankUnstableDetailActivity.findViewById(e.model_transfer_detail_bottom);
                    case 1:
                        int i13 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (LinearLayout) scheduleTransferForBankUnstableDetailActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i14 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (LinearLayout) scheduleTransferForBankUnstableDetailActivity.findViewById(e.ll_fee_detail);
                    case 3:
                        int i15 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (OrderResultHeaderModel) scheduleTransferForBankUnstableDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i16 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (PpTitleBar) scheduleTransferForBankUnstableDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i12 = 3;
        this.f33437f = C2131j.b(new Function0(this) { // from class: wd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableDetailActivity f43416b;

            {
                this.f43416b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity = this.f43416b;
                switch (i12) {
                    case 0:
                        int i13 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (OrderResultViewReceiptModel) scheduleTransferForBankUnstableDetailActivity.findViewById(e.model_transfer_detail_bottom);
                    case 1:
                        int i14 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (LinearLayout) scheduleTransferForBankUnstableDetailActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i15 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (LinearLayout) scheduleTransferForBankUnstableDetailActivity.findViewById(e.ll_fee_detail);
                    case 3:
                        int i16 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (OrderResultHeaderModel) scheduleTransferForBankUnstableDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i17 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (PpTitleBar) scheduleTransferForBankUnstableDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i13 = 4;
        this.f33438g = C2131j.b(new Function0(this) { // from class: wd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableDetailActivity f43416b;

            {
                this.f43416b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity = this.f43416b;
                switch (i13) {
                    case 0:
                        int i14 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (OrderResultViewReceiptModel) scheduleTransferForBankUnstableDetailActivity.findViewById(e.model_transfer_detail_bottom);
                    case 1:
                        int i15 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (LinearLayout) scheduleTransferForBankUnstableDetailActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i16 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (LinearLayout) scheduleTransferForBankUnstableDetailActivity.findViewById(e.ll_fee_detail);
                    case 3:
                        int i17 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (OrderResultHeaderModel) scheduleTransferForBankUnstableDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i18 = ScheduleTransferForBankUnstableDetailActivity.f33433o;
                        return (PpTitleBar) scheduleTransferForBankUnstableDetailActivity.findViewById(e.title_bar);
                }
            }
        });
    }

    public static void m(ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity, String str, String str2) {
        scheduleTransferForBankUnstableDetailActivity.getClass();
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(scheduleTransferForBankUnstableDetailActivity, 1002, str, str2);
        Object value = scheduleTransferForBankUnstableDetailActivity.f33435d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LinearLayout) value).addView(orderResultItemModel);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_schedule_transfer_for_bank_unstable_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((ScheduleTransferForBankUnstableViewModel) l()).f33996i;
        if (lVar != null) {
            lVar.e(this, new C2023v(new h(this, this, 0), 15));
        }
        l lVar2 = ((ScheduleTransferForBankUnstableViewModel) l()).f33997j;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new h(this, this, 1), 15));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final OrderResultViewReceiptModel n() {
        Object value = this.f33434c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OrderResultViewReceiptModel) value;
    }

    public final OrderResultHeaderModel o() {
        Object value = this.f33437f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OrderResultHeaderModel) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new p7.h(uIHandler, 17, this, false));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
    }
}
