package com.transsnet.palmpay.core.init;

import F6.d;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.app.Application;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_HTTP_CLIENT_WARM}, name = BaseInitTaskKt.TASK_GET_FCM_TOKEN)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/init/GetFcmTokenInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "getFCMToken", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetFcmTokenInitTask extends BaseInitTask {
    /* JADX INFO: Access modifiers changed from: private */
    public final void getFCMToken() {
        Task<String> token;
        try {
            p367ya.a.d().getClass();
            if (TextUtils.isEmpty(p059e1.a.I("fcm_sp_fcm_token", ""))) {
                token = FirebaseMessaging.getInstance().getToken();
            } else {
                if (System.currentTimeMillis() < p059e1.a.E(0L, "fcm_sp_last_fetch_fcm_token_time") + 14400000) {
                    d.h(BaseInitTask.TAG, 3, "getFCMToken: not get fcm token too often");
                    token = null;
                } else {
                    token = FirebaseMessaging.getInstance().getToken();
                }
            }
            Task<String> appInstanceId = TextUtils.isEmpty(p059e1.a.H("firebase_sp_firebase_analytics_instance_id")) ? FirebaseAnalytics.getInstance(BaseApplication.getContext()).getAppInstanceId() : null;
            if (token == null && appInstanceId == null) {
                return;
            }
            Task<Void> taskWhenAll = appInstanceId == null ? Tasks.whenAll((Task<?>[]) new Task[]{token}) : Tasks.whenAll((Task<?>[]) new Task[]{appInstanceId, token});
            Intrinsics.e(taskWhenAll);
            Intrinsics.e(taskWhenAll.addOnCompleteListener(new com.transsnet.adsdk.b(2, appInstanceId, token)));
        } catch (Exception e10) {
            d.h(BaseInitTask.TAG, 5, "getFCMToken: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getFCMToken$lambda$0(Task task, Task task2, String str, Task task3) {
        Intrinsics.checkNotNullParameter(task3, "task");
        if (!task3.isSuccessful()) {
            d.h(BaseInitTask.TAG, 5, "Fetching FCM registration token failed", task3.getException());
            return;
        }
        V v3 = V.f10828a;
        f fVar = I.f10809a;
        AbstractC0780y.m(v3, e.f19009c, null, new GetFcmTokenInitTask$getFCMToken$1$1(task, task2, str, null), 2);
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public com.alibaba.android.alpha.Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new com.alibaba.android.alpha.Task(getTaskName()) { // from class: com.transsnet.palmpay.core.init.GetFcmTokenInitTask.getTask.1
            @Override // com.alibaba.android.alpha.Task
            public void run() {
                BaseInitTask.beginSection$default(GetFcmTokenInitTask.this, null, 1, null);
                GetFcmTokenInitTask.this.getFCMToken();
                BaseInitTask.endSection$default(GetFcmTokenInitTask.this, null, 1, null);
            }
        };
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_GET_FCM_TOKEN;
    }
}
