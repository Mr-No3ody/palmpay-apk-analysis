package com.transsnet.palmpay.send_money.ui.activity.schedule_transfer;

import android.os.Bundle;
import android.os.Handler;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferPaymentViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p159kd.f;
import p7.h;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/schedule_transfer_payment_select")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferPaymentSelectActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/ScheduleTransferPaymentViewModel;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferPaymentSelectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferPaymentSelectActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferPaymentSelectActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,61:1\n562#2,10:62\n*S KotlinDebug\n*F\n+ 1 ScheduleTransferPaymentSelectActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferPaymentSelectActivity\n*L\n39#1:62,10\n*E\n"})
public final class ScheduleTransferPaymentSelectActivity extends BaseMvvmActivity<ScheduleTransferPaymentViewModel> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f33417c = 0;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_schedule_transfer_payment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new h(uIHandler, 14, this, false));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(CommonViewExtKt.colorInt(p.transparent, this), !isDarkMode());
    }
}
