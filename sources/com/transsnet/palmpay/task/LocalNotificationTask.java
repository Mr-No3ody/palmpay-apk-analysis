package com.transsnet.palmpay.task;

import Od.e;
import Pa.C0525w;
import Pa.r0;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.alibaba.android.alpha.Task;
import com.google.gson.Gson;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.LocalNotificationConfigItem;
import com.transsnet.palmpay.core.bean.rsp.LocalNotificationConfigRsp;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.util.TimeUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.TASK_GET_FCM_TOKEN}, name = BaseInitTaskKt.TASK_INIT_LOCAL_NOTIFICATION)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/task/LocalNotificationTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "Landroid/content/Context;", "context", "", "registerNetworkChangeEvent", "(Landroid/content/Context;)V", "getLocalNotificationConfig", "", "url", "preDownloadImage", "(Ljava/lang/String;)V", "Landroid/app/Application;", "application", "Lcom/alibaba/android/alpha/Task;", "getTask", "(Landroid/app/Application;)Lcom/alibaba/android/alpha/Task;", "getTaskName", "()Ljava/lang/String;", "Companion", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocalNotificationTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalNotificationTask.kt\ncom/transsnet/palmpay/task/LocalNotificationTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1869#2,2:115\n*S KotlinDebug\n*F\n+ 1 LocalNotificationTask.kt\ncom/transsnet/palmpay/task/LocalNotificationTask\n*L\n78#1:115,2\n*E\n"})
public final class LocalNotificationTask extends BaseInitTask {

    @NotNull
    private static final String KEY_FETCH_TIME = "local_sp_last_fetch_notification_time";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getLocalNotificationConfig() {
        List<LocalNotificationConfigItem> list;
        if (TimeUtils.isToday(p059e1.a.E(0L, KEY_FETCH_TIME))) {
            return;
        }
        try {
            CommonBeanResult commonBeanResult = (CommonBeanResult) ((PayApiService) c.f43141a.f14621b).getLocalNotificationConfig().b();
            if (commonBeanResult.isSuccess()) {
                p059e1.a.V(System.currentTimeMillis(), KEY_FETCH_TIME);
                String json = ((Gson) C0525w.f().f7166b).toJson(commonBeanResult.data);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                p059e1.a.W("local_sp_local_notification_config_v2", json);
                LocalNotificationConfigRsp localNotificationConfigRsp = (LocalNotificationConfigRsp) commonBeanResult.data;
                if (localNotificationConfigRsp == null || (list = localNotificationConfigRsp.pushDTOList) == null) {
                    return;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    preDownloadImage(C0525w.j(((LocalNotificationConfigItem) it.next()).pushMessage.content.outsideInsideNotificationInfo, "outsideIcon"));
                }
            }
        } catch (Throwable unused) {
        }
    }

    private final void preDownloadImage(String url) {
        if (url != null) {
            r0.D1(BaseApplication.getContext(), url);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerNetworkChangeEvent(Context context) {
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), new a());
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new e(this, application, getTaskName());
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.TASK_INIT_LOCAL_NOTIFICATION;
    }
}
