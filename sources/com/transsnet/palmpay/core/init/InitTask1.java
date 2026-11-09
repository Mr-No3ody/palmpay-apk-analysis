package com.transsnet.palmpay.core.init;

import F6.d;
import Pa.AbstractC0514k;
import Pa.C0515l;
import android.app.Application;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.PhoneUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, name = BaseInitTaskKt.TASK_INIT_1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/init/InitTask1;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "initCountryConfiguration", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InitTask1 extends BaseInitTask {
    /* JADX INFO: Access modifiers changed from: private */
    public final void initCountryConfiguration() {
        try {
            C0515l c0515l = AbstractC0514k.f7097a;
            c0515l.getClass();
            p367ya.a.d().f44149a.i("key_default_language", "NG");
            BaseApplication.updateCountryConfig(c0515l.b("NG").code);
        } catch (Exception e10) {
            d.c(BaseInitTask.TAG, "initCountryConfiguration: ", e10);
        }
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.InitTask1.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(InitTask1.this, null, 1, null);
                InitTask1.this.initCountryConfiguration();
                PhoneUtils.getUniqueId();
                BaseInitTask.endSection$default(InitTask1.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_INIT_1;
    }
}
