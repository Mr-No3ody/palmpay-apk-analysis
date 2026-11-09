package com.transsnet.palmpay.core.init;

import F6.d;
import Wf.AbstractC0780y;
import Wf.t0;
import android.app.Application;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p128ia.e;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.LATE_INIT_WEB_VIEW_TASK, BaseInitTaskKt.LATE_INIT_START_PUSH_SERVICE_TASK}, group = BaseInitTaskKt.GROUP_LATE_INIT, name = BaseInitTaskKt.LATE_INIT_APP_LIST_COLLECT_INIT_TASK)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/init/AppListCollectInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppListCollectInitTask extends BaseInitTask {
    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.AppListCollectInitTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(AppListCollectInitTask.this, null, 1, null);
                e eVar = e.f37455a;
                t0 t0Var = e.f37457c;
                if (t0Var == null || !t0Var.isActive()) {
                    e.f37457c = AbstractC0780y.m(e.f37456b, null, null, new p128ia.a(2, null), 3);
                } else {
                    d.h("InstalledAppsCollect", 3, "已有采集任务正在执行，跳过本次调用");
                }
                BaseInitTask.endSection$default(AppListCollectInitTask.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.LATE_INIT_APP_LIST_COLLECT_INIT_TASK;
    }
}
