package com.transsnet.palmpay.core.rnbridge;

import Ca.b;
import android.app.Application;
import android.content.ComponentCallbacks2;
import com.alibaba.android.alpha.Task;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.palmpay.init.annotation.InitTask;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.init.BaseInitTask;
import com.transsnet.palmpay.core.init.BaseInitTaskKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@InitTask(background = true, depends = {BaseInitTaskKt.LATE_INIT_EMOJI_TASK, BaseInitTaskKt.LATE_INIT_APPSFLYER_TASK}, group = BaseInitTaskKt.GROUP_LATE_INIT, name = BaseInitTaskKt.LATE_INIT_PRELOAD_RN_TASK)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/PreloadReactNativeInitTask;", "Lcom/transsnet/palmpay/core/init/BaseInitTask;", "<init>", "()V", "getTaskName", "", "getTask", "Lcom/alibaba/android/alpha/Task;", "application", "Landroid/app/Application;", "preload", "", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreloadReactNativeInitTask extends BaseInitTask {
    /* JADX INFO: Access modifiers changed from: private */
    public final void preload() {
        ReactNativeHost reactNativeHost;
        ReactInstanceManager reactInstanceManager;
        ComponentCallbacks2 componentCallbacks2 = BaseApplication.get();
        if (!(componentCallbacks2 instanceof ReactApplication) || (reactNativeHost = ((ReactApplication) componentCallbacks2).getReactNativeHost()) == null || (reactInstanceManager = reactNativeHost.getReactInstanceManager()) == null || reactInstanceManager.hasStartedCreatingInitialContext()) {
            return;
        }
        reactInstanceManager.createReactContextInBackground();
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public Task getTask(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        return new b(this, application, getTaskName());
    }

    @Override // com.palmpay.init.api.IInitTask
    @NotNull
    public String getTaskName() {
        return BaseInitTaskKt.LATE_INIT_PRELOAD_RN_TASK;
    }
}
