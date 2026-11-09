package com.transsnet.palmpay.core.init;

import android.app.Application;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.InitTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p324va.d;
import p324va.e;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_FIREBASE_INIT, BaseInitTaskKt.TASK_INIT_1}, name = BaseInitTaskKt.TASK_HTTP_CLIENT_WARM)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/init/PayHttpClientWarmInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "warmHttpClient", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PayHttpClientWarmInitTask extends BaseInitTask {
    /* JADX INFO: Access modifiers changed from: private */
    public final void warmHttpClient() {
        try {
            Object obj = d.f43142a.f18580b;
            e.a();
            androidx.camera.video.internal.c cVar = p324va.c.f43141a;
        } catch (Exception e10) {
            F6.d.c(BaseInitTask.TAG, "warmHttpClient failed", e10);
        }
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.PayHttpClientWarmInitTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(PayHttpClientWarmInitTask.this, null, 1, null);
                PayHttpClientWarmInitTask.this.warmHttpClient();
                BaseInitTask.endSection$default(PayHttpClientWarmInitTask.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_HTTP_CLIENT_WARM;
    }
}
