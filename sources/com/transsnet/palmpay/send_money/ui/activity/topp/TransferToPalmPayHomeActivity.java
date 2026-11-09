package com.transsnet.palmpay.send_money.ui.activity.topp;

import Kd.S1;
import L6.b;
import N8.q0;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p159kd.e;
import p159kd.f;
import p325vb.a;
import p355xf.C2131j;
import p355xf.t;
import p7.h;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "To PP 主页", path = "/send/money")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/topp/TransferToPalmPayHomeActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToPalmPayHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToPalmPayHomeActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/topp/TransferToPalmPayHomeActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,93:1\n562#2,10:94\n*S KotlinDebug\n*F\n+ 1 TransferToPalmPayHomeActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/topp/TransferToPalmPayHomeActivity\n*L\n64#1:94,10\n*E\n"})
public final class TransferToPalmPayHomeActivity extends BaseActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33598d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33600b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33599a = "COMMON";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33601c = C2131j.b(new a(this, 6));

    public static final void l(TransferToPalmPayHomeActivity transferToPalmPayHomeActivity) {
        Object objNavigation = ARouter.getInstance().build("/sm/trans_to_palmpay_home").withString("core_order_source_type", transferToPalmPayHomeActivity.f33599a).navigation();
        Intrinsics.f(objNavigation, "null cannot be cast to non-null type com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment");
        Z supportFragmentManager = transferToPalmPayHomeActivity.getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(e.fl_container, (TransferToPalmPayHomeFragment) objNavigation, null);
        c1161aE.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_transfer_to_palmpay_home_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f33600b)) {
            return;
        }
        ((S1) this.f33601c.getValue()).f5135d = this.f33600b;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isMainBusiness() {
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (bundle == null) {
            Handler uIHandler = getUIHandler();
            Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
            getWindow().getDecorView().post(new h(uIHandler, 24, this, false));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this));
        ARouter.getInstance().inject(this);
    }
}
