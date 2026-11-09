package com.transsnet.palmpay.core.init;

import F6.d;
import android.app.Application;
import android.text.TextUtils;
import com.alibaba.android.alpha.Task;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.firebase.messaging.FirebaseMessaging;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.adsdk.AdManager;
import com.transsnet.palmpay.core.task.PeriodWakeUpWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_INIT_ADSDK, BaseInitTaskKt.TASK_FIREBASE_INIT}, name = BaseInitTaskKt.TASK_GAID_INIT)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/init/InitTask4;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "getGaId", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InitTask4 extends BaseInitTask {
    /* JADX INFO: Access modifiers changed from: private */
    public final void getGaId(Application application) {
        String strC = p367ya.a.d().c();
        if (!TextUtils.isEmpty(strC)) {
            AdManager.setGaId(strC);
            if (System.currentTimeMillis() < p059e1.a.E(0L, "gaid_sp_last_fetch_gaid_time") + 14400000) {
                d.h(BaseInitTask.TAG, 3, "getGaId: not get gaid too often");
                return;
            }
        }
        try {
            String id2 = AdvertisingIdClient.getAdvertisingIdInfo(application).getId();
            d.h(BaseInitTask.TAG, 3, "getGaId: gaid " + id2);
            if (!TextUtils.isEmpty(id2)) {
                p059e1.a.V(System.currentTimeMillis(), "gaid_sp_last_fetch_gaid_time");
            }
            p367ya.a.d().f44149a.i("advertising_id", id2);
            AdManager.setGaId(id2);
        } catch (Exception e10) {
            d.c(BaseInitTask.TAG, "getGaId: get GAID ", e10);
        }
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.InitTask4.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(InitTask4.this, null, 1, null);
                try {
                    FirebaseMessaging.getInstance().setAutoInitEnabled(true);
                } catch (Exception unused) {
                }
                InitTask4.this.getGaId(application);
                try {
                    PeriodWakeUpWorker.a aVar = PeriodWakeUpWorker.f27408g;
                    if (aVar.shouldSchedulePeriodWakeUp()) {
                        aVar.scheduleTask();
                    }
                } catch (Exception unused2) {
                }
                BaseInitTask.endSection$default(InitTask4.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_GAID_INIT;
    }
}
