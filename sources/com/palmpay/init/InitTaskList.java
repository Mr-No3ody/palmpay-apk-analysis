package com.palmpay.init;

import com.palmpay.init.annotation.TaskInfo;
import com.palmpay.init.apt.taskregister.TaskRegister_lib_core;
import com.palmpay.init.apt.taskregister.TaskRegister_module_account_impl;
import com.palmpay.init.apt.taskregister.TaskRegister_module_common_impl;
import com.palmpay.init.apt.taskregister.TaskRegister_module_flexi_impl;
import com.palmpay.init.apt.taskregister.TaskRegister_module_main_impl;
import com.palmpay.init.apt.taskregister.TaskRegister_module_wealth;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/palmpay/init/InitTaskList;", "", "<init>", "()V", "getTaskList", "", "Lcom/palmpay/init/annotation/TaskInfo;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InitTaskList {

    @NotNull
    public static final InitTaskList INSTANCE = new InitTaskList();

    private InitTaskList() {
    }

    @NotNull
    public final List<TaskInfo> getTaskList() {
        ArrayList arrayList = new ArrayList();
        new TaskRegister_lib_core().register(arrayList);
        new TaskRegister_module_wealth().register(arrayList);
        new TaskRegister_module_common_impl().register(arrayList);
        new TaskRegister_module_main_impl().register(arrayList);
        new TaskRegister_module_account_impl().register(arrayList);
        new TaskRegister_module_flexi_impl().register(arrayList);
        return arrayList;
    }
}
