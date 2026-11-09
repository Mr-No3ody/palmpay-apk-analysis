package com.transsnet.palmpay.task;

import Od.i;
import android.app.Application;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.LATE_INIT_TONG_DUN_TASK}, group = BaseInitTaskKt.GROUP_LATE_INIT, name = BaseInitTaskKt.LATE_INIT_VAGUE_TASK)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/task/VagueConfigTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "getTaskName", "", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VagueConfigTask extends BaseInitTask {
    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new i(this, getTaskName());
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.LATE_INIT_VAGUE_TASK;
    }
}
