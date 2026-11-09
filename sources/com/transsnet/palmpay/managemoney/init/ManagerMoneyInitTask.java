package com.transsnet.palmpay.managemoney.init;

import Mc.b;
import Mc.c;
import Wf.AbstractC0780y;
import android.app.Application;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import com.transsnet.palmpay.core.init.PpPerfTrace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_REACT_NATIVE_INIT, BaseInitTaskKt.TASK_FIREBASE_INIT}, name = BaseInitTaskKt.TASK_10)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/managemoney/init/ManagerMoneyInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "", "getInterestRateConfig", "Landroid/app/Application;", "application", "Lcom/alibaba/android/alpha/Task;", "getTask", "(Landroid/app/Application;)Lcom/alibaba/android/alpha/Task;", "", "getTaskName", "()Ljava/lang/String;", "Companion", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nManagerMoneyInitTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManagerMoneyInitTask.kt\ncom/transsnet/palmpay/managemoney/init/ManagerMoneyInitTask\n+ 2 PpPerfTrace.kt\ncom/transsnet/palmpay/core/init/PpPerfTrace\n*L\n1#1,86:1\n50#2,5:87\n50#2,5:92\n*S KotlinDebug\n*F\n+ 1 ManagerMoneyInitTask.kt\ncom/transsnet/palmpay/managemoney/init/ManagerMoneyInitTask\n*L\n51#1:87,5\n67#1:92,5\n*E\n"})
public final class ManagerMoneyInitTask extends BaseInitTask {

    @NotNull
    private static final String SP_KEY_LAST_QUERY_TIME = "sp_managemoney_last_query_interest_time";

    /* JADX INFO: Access modifiers changed from: private */
    public final void getInterestRateConfig() {
        if (BaseApplication.hasLogin()) {
            long jE = a.E(0L, SP_KEY_LAST_QUERY_TIME);
            if (jE <= 0 || System.currentTimeMillis() - jE >= 7200000) {
                PpPerfTrace.begin("Startup/WealthInterestConfig");
                try {
                    AbstractC0780y.p(new Mc.a(2, null));
                    PpPerfTrace.end();
                    PpPerfTrace.begin("Startup/WealthMainbodyInfo");
                    try {
                        AbstractC0780y.p(new b(2, null));
                    } finally {
                        PpPerfTrace.end();
                    }
                } catch (Throwable th) {
                    PpPerfTrace.end();
                    throw th;
                }
            }
        }
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new c(this);
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_10;
    }
}
