package com.palmpay.init.api;

import android.app.Application;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.ITask;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/palmpay/init/api/IInitTask;", "Lcom/palmpay/init/annotation/ITask;", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "getTaskName", "", "init-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IInitTask extends ITask {
    @NotNull
    Task getTask(@NotNull Application application);

    @NotNull
    String getTaskName();
}
