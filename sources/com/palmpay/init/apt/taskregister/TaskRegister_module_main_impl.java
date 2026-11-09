package com.palmpay.init.apt.taskregister;

import com.palmpay.init.annotation.ModuleTaskRegister;
import com.palmpay.init.annotation.TaskInfo;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/palmpay/init/apt/taskregister/TaskRegister_module_main_impl;", "Lcom/palmpay/init/annotation/ModuleTaskRegister;", "<init>", "()V", GetCustomerServiceUrlReq.ENTER_TYPE_SIGNUP, "", "taskList", "", "Lcom/palmpay/init/annotation/TaskInfo;", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TaskRegister_module_main_impl implements ModuleTaskRegister {
    @Override // com.palmpay.init.annotation.ModuleTaskRegister
    public void register(@NotNull List<TaskInfo> taskList) {
        Intrinsics.checkNotNullParameter(taskList, "taskList");
        taskList.add(new TaskInfo(BaseInitTaskKt.LATE_INIT_DOWNLOAD_SPLASH_TASK, BaseInitTaskKt.GROUP_LATE_INIT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.LATE_INIT_APP_LIST_COLLECT_INIT_TASK, BaseInitTaskKt.LATE_INIT_WEB_VIEW_TASK}, "com.transsnet.palmpay.task.DownloadSplashTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_HOME_MENU_INIT, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.TASK_INIT_ADSDK, BaseInitTaskKt.TASK_HTTP_CLIENT_WARM}, "com.transsnet.palmpay.task.HomeMenuConfigTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_INIT_LOCAL_NOTIFICATION, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.TASK_GET_FCM_TOKEN}, "com.transsnet.palmpay.task.LocalNotificationTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.LATE_INIT_START_PUSH_SERVICE_TASK, BaseInitTaskKt.GROUP_LATE_INIT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.LATE_INIT_WEB_VIEW_TASK}, "com.transsnet.palmpay.task.StartPushServiceTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.LATE_INIT_VAGUE_TASK, BaseInitTaskKt.GROUP_LATE_INIT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.LATE_INIT_TONG_DUN_TASK}, "com.transsnet.palmpay.task.VagueConfigTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_WELCOME_NEW_USER_INIT, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.TASK_INIT_ADSDK, BaseInitTaskKt.TASK_FIREBASE_INIT}, "com.transsnet.palmpay.task.WelcomeNewUserConfigTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_AUTO_SIZE_CONFIG, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[0], "me.jessyan.autosize.AutoSizeTask"));
    }
}
