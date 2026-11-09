package com.transsnet.palmpay.core.init;

import android.app.Application;
import com.alibaba.android.alpha.Task;
import com.mikepenz.iconics.animation.BlinkAlphaProcessor;
import com.mikepenz.iconics.animation.BlinkScaleProcessor;
import com.mikepenz.iconics.animation.SpinProcessor;
import com.palmpay.init.annotation.InitTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, name = BaseInitTaskKt.TASK_ANDROIDX_STARTUP)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/init/AndroidxStartupTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidxStartupTask extends BaseInitTask {
    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.AndroidxStartupTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(AndroidxStartupTask.this, null, 1, null);
                P0.a aVarC = P0.a.c(application);
                aVarC.d(SpinProcessor.class);
                Unit unit = Unit.f38893a;
                aVarC.d(BlinkAlphaProcessor.class);
                aVarC.d(BlinkScaleProcessor.class);
                BaseInitTask.endSection$default(AndroidxStartupTask.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_ANDROIDX_STARTUP;
    }
}
