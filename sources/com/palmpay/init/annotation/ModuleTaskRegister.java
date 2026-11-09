package com.palmpay.init.annotation;

import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/palmpay/init/annotation/ModuleTaskRegister;", "", GetCustomerServiceUrlReq.ENTER_TYPE_SIGNUP, "", "taskList", "", "Lcom/palmpay/init/annotation/TaskInfo;", "init-annotation"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ModuleTaskRegister {
    void register(@NotNull List<TaskInfo> taskList);
}
