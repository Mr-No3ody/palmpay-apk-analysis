package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import L6.b;
import Pa.C0525w;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "交易历史/Transaction History", path = "/main/trans_history")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/TransactionHistoryActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransactionHistoryActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34575a;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_activity_transaction_history;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this), !isDarkMode());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        Fragment fragmentD = getSupportFragmentManager().D(((FragmentContainerView) findViewById(e.transactionHistoryFragment)).getId());
        if (fragmentD != null) {
            ((TransactionHistoryFragment) fragmentD).f35251C = (ArrayList) C0525w.f().e(this.f34575a, ArrayList.class);
        }
    }
}
