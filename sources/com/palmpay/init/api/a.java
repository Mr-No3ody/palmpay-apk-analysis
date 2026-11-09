package com.palmpay.init.api;

import android.app.Application;
import android.util.Log;
import com.alibaba.android.alpha.Task;
import com.palmpay.init.annotation.TaskInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Task {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f23787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23788b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Application app, TaskInfo info) {
        super(info.getName(), !info.getBackground());
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f23787a = app;
        this.f23788b = info.getTaskClassName();
    }

    @Override // com.alibaba.android.alpha.Task
    public final void run() {
        String str = this.f23788b;
        Application application = this.f23787a;
        try {
            AlphaTaskManager.Companion companion = AlphaTaskManager.INSTANCE;
            ClassLoader classLoader = application.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
            companion.createInitTask$init_api_release(classLoader, str).getTask(application).run();
        } catch (Exception e10) {
            Log.e("AlphaTaskManager", "run task fail: " + str, e10);
        }
    }
}
