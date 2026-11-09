package com.transsnet.palmpay.account.export;

import F6.d;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.account.init.BaseAppsFlyerInitTask;
import com.transsnet.palmpay.account.ui.dialog.AutoLogoutOptionDialog;
import com.transsnet.palmpay.core.provider.IAccountModule;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/provier")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/account/export/AccountModuleImpl;", "Lcom/transsnet/palmpay/core/provider/IAccountModule;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AccountModuleImpl implements IAccountModule {
    @Override // com.transsnet.palmpay.core.provider.IAccountModule
    public final Dialog buildAutoLogoutOptionsDialog(Activity activity) {
        return new AutoLogoutOptionDialog(activity);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public final void init(Context context) {
    }

    @Override // com.transsnet.palmpay.core.provider.IAccountModule
    public final void initAppsFlyer(Intent intent) {
        BaseAppsFlyerInitTask.Companion.initAppsFlyerLib$module_account_impl_release$default(BaseAppsFlyerInitTask.INSTANCE, null, intent, false, 4, null);
    }

    @Override // com.transsnet.palmpay.core.provider.IAccountModule
    public final void initModule() {
        d.h("AccountModuleImpl", 3, "initModule: ");
    }
}
