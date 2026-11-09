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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/palmpay/init/apt/taskregister/TaskRegister_lib_core;", "Lcom/palmpay/init/annotation/ModuleTaskRegister;", "<init>", "()V", GetCustomerServiceUrlReq.ENTER_TYPE_SIGNUP, "", "taskList", "", "Lcom/palmpay/init/annotation/TaskInfo;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TaskRegister_lib_core implements ModuleTaskRegister {
    @Override // com.palmpay.init.annotation.ModuleTaskRegister
    public void register(@NotNull List<TaskInfo> taskList) {
        Intrinsics.checkNotNullParameter(taskList, "taskList");
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_ACTIVITY_TRACE, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.TASK_FIREBASE_INIT}, "com.transsnet.palmpay.core.init.ActivityTraceInitTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_INIT_ADSDK, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.TASK_INIT_1, BaseInitTaskKt.TASK_FIREBASE_INIT}, "com.transsnet.palmpay.core.init.AdSdkInitTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_ANDROIDX_STARTUP, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[0], "com.transsnet.palmpay.core.init.AndroidxStartupTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_CRONET, BaseInitTaskKt.GROUP_LATE_INIT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.LATE_INIT_IDLE_GATE}, "com.transsnet.palmpay.core.init.CronetInitTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_FIREBASE_INIT, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[0], "com.transsnet.palmpay.core.init.FirebaseInitTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_FLEXIBANK_SDK_INIT, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.TASK_GLIDE_INIT}, "com.transsnet.palmpay.core.init.FlexiBankSdkInitTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_GET_FCM_TOKEN, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.TASK_HTTP_CLIENT_WARM}, "com.transsnet.palmpay.core.init.GetFcmTokenInitTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_GLIDE_INIT, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.TASK_FIREBASE_INIT, BaseInitTaskKt.TASK_INIT_ADSDK, BaseInitTaskKt.TASK_HTTP_CLIENT_WARM}, "com.transsnet.palmpay.core.init.GlideInitTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_INIT_1, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[0], "com.transsnet.palmpay.core.init.InitTask1"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_GAID_INIT, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.TASK_INIT_ADSDK, BaseInitTaskKt.TASK_FIREBASE_INIT}, "com.transsnet.palmpay.core.init.InitTask4"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_6, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.TASK_FIREBASE_INIT}, "com.transsnet.palmpay.core.init.InitTask6"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_LIVE_NESS_INIT, BaseInitTaskKt.GROUP_LATE_INIT, true, 0, new String[]{"PROCESS_ALL"}, new String[0], "com.transsnet.palmpay.core.init.LivenessTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_HTTP_CLIENT_WARM, GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.TASK_FIREBASE_INIT, BaseInitTaskKt.TASK_INIT_1}, "com.transsnet.palmpay.core.init.PayHttpClientWarmInitTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.LATE_INIT_EMOJI_TASK, BaseInitTaskKt.GROUP_LATE_INIT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.TASK_CRONET}, "com.transsnet.palmpay.core.init.late.EmojiInitTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.TASK_GROWING_IO_INIT, BaseInitTaskKt.GROUP_LATE_INIT, false, 0, new String[]{"PROCESS_ALL"}, new String[0], "com.transsnet.palmpay.core.init.late.GrowingIoInitTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.LATE_INIT_IDLE_GATE, BaseInitTaskKt.GROUP_LATE_INIT, true, 0, new String[]{"PROCESS_ALL"}, new String[0], "com.transsnet.palmpay.core.init.late.LateIdleGateTask"));
        taskList.add(new TaskInfo(BaseInitTaskKt.LATE_INIT_PRELOAD_IMG_TASK, BaseInitTaskKt.GROUP_LATE_INIT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.LATE_INIT_APPSFLYER_TASK}, "com.transsnet.palmpay.core.init.late.LateInitTask1"));
        taskList.add(new TaskInfo(BaseInitTaskKt.LATE_INIT_TONG_DUN_TASK, BaseInitTaskKt.GROUP_LATE_INIT, true, 0, new String[]{"PROCESS_ALL"}, new String[0], "com.transsnet.palmpay.core.init.late.LateInitTask2"));
        taskList.add(new TaskInfo(BaseInitTaskKt.LATE_INIT_SAFE_PIN_CONFIG_TASK, BaseInitTaskKt.GROUP_LATE_INIT, true, 0, new String[]{"PROCESS_ALL"}, new String[]{BaseInitTaskKt.LATE_INIT_VAGUE_TASK}, "com.transsnet.palmpay.core.init.late.SafePinConfigInitTask"));
    }
}
