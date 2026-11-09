package com.transsnet.palmpay.send_money.ui.activity.tobank;

import Ed.W;
import L6.b;
import N8.q0;
import Wf.AbstractC0780y;
import Wf.I;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.apm.network.bean.NQEQualityBean;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p015ag.o;
import p159kd.e;
import p159kd.f;
import p7.h;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "To Bank 主页", path = "/sm/trans_to_bank")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/tobank/TransferToBankAccountActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToBankAccountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToBankAccountActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/tobank/TransferToBankAccountActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,105:1\n562#2,10:106\n*S KotlinDebug\n*F\n+ 1 TransferToBankAccountActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/tobank/TransferToBankAccountActivity\n*L\n75#1:106,10\n*E\n"})
public final class TransferToBankAccountActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33519a = "COMMON";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33520b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TransferToBankHomeFragment f33521c;

    public static final void l(TransferToBankAccountActivity transferToBankAccountActivity) {
        transferToBankAccountActivity.initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, transferToBankAccountActivity));
        TransferToBankHomeFragment transferToBankHomeFragment = new TransferToBankHomeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("core_order_source_type", transferToBankAccountActivity.f33519a);
        bundle.putString("accountNo", transferToBankAccountActivity.f33520b);
        transferToBankHomeFragment.setArguments(bundle);
        transferToBankAccountActivity.f33521c = transferToBankHomeFragment;
        Z supportFragmentManager = transferToBankAccountActivity.getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.e(e.fl_container, transferToBankHomeFragment, null);
        c1161aE.h(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_transfer_bank_account_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
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
    public final void onNetworkStateChanged(int i7, int i10, NQEQualityBean nQEQualityBean) {
        TransferToBankHomeViewModel transferToBankHomeViewModel;
        super.onNetworkStateChanged(i7, i10, nQEQualityBean);
        TransferToBankHomeFragment transferToBankHomeFragment = this.f33521c;
        if (transferToBankHomeFragment != null) {
            Intrinsics.f(transferToBankHomeFragment, "null cannot be cast to non-null type com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment");
            if (NQEManager.INSTANCE.isNetworkOffline() || i10 == 1) {
                TransferToBankHomeViewModel transferToBankHomeViewModel2 = (TransferToBankHomeViewModel) transferToBankHomeFragment.f27333i;
                if (transferToBankHomeViewModel2 != null) {
                    CoroutineScope coroutineScopeH = V.h(transferToBankHomeViewModel2);
                    p042cg.f fVar = I.f10809a;
                    AbstractC0780y.m(coroutineScopeH, o.f11960a, null, new Ed.V(transferToBankHomeFragment, null), 2);
                    return;
                }
                return;
            }
            if ((i7 == 0 || i7 == 1) && (transferToBankHomeViewModel = (TransferToBankHomeViewModel) transferToBankHomeFragment.f27333i) != null) {
                CoroutineScope coroutineScopeH2 = V.h(transferToBankHomeViewModel);
                p042cg.f fVar2 = I.f10809a;
                AbstractC0780y.m(coroutineScopeH2, o.f11960a, null, new W(transferToBankHomeFragment, null), 2);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (bundle == null) {
            Handler uIHandler = getUIHandler();
            Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
            getWindow().getDecorView().post(new h(uIHandler, 20, this, false));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
    }
}
