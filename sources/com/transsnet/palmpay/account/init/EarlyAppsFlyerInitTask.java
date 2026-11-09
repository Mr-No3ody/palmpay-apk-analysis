package com.transsnet.palmpay.account.init;

import android.app.Application;
import com.alibaba.android.alpha.Task;
import com.appsflyer.AppsFlyerLib;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_FIREBASE_INIT, BaseInitTaskKt.TASK_INIT_ADSDK}, name = BaseInitTaskKt.TASK_INIT_APPSFLYER)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/account/init/EarlyAppsFlyerInitTask;", "Lcom/transsnet/palmpay/account/init/BaseAppsFlyerInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EarlyAppsFlyerInitTask extends BaseAppsFlyerInitTask {
    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.account.init.EarlyAppsFlyerInitTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(EarlyAppsFlyerInitTask.this, null, 1, null);
                if (a.C(BaseAppsFlyerInitTask.KEY_AF_FIRST_OPEN, true)) {
                    BaseAppsFlyerInitTask.Companion.initAppsFlyerLib$module_account_impl_release$default(BaseAppsFlyerInitTask.INSTANCE, EarlyAppsFlyerInitTask.this, null, false, 6, null);
                    if ("palmstore".equalsIgnoreCase(BaseApplication.getChannel())) {
                        AppsFlyerLib.getInstance().logEvent(application.getApplicationContext(), "af_transsion_installment", null);
                    }
                    a.X(BaseAppsFlyerInitTask.KEY_AF_FIRST_OPEN, false);
                }
                BaseInitTask.endSection$default(EarlyAppsFlyerInitTask.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_INIT_APPSFLYER;
    }
}
