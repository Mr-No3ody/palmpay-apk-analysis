package com.palmpay.init.api;

import android.app.Application;
import com.alibaba.android.alpha.AlphaManager;
import com.alibaba.android.alpha.OnProjectExecuteListener;
import com.alibaba.android.alpha.Project;
import com.alibaba.android.alpha.Task;
import com.facebook.react.uimanager.ViewProps;
import com.palmpay.init.annotation.TaskInfo;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/palmpay/init/api/AlphaTaskManager;", "", "Landroid/app/Application;", "app", "", "Lcom/palmpay/init/annotation/TaskInfo;", "taskList", "<init>", "(Landroid/app/Application;Ljava/util/List;)V", "", "checkDuplicateName", "(Ljava/util/List;)V", "", "group", "Lcom/alibaba/android/alpha/Task$OnTaskFinishListener;", "onTaskComplete", "Lcom/alibaba/android/alpha/OnProjectExecuteListener;", "onAllTaskComplete", ViewProps.START, "(Ljava/lang/String;Lcom/alibaba/android/alpha/Task$OnTaskFinishListener;Lcom/alibaba/android/alpha/OnProjectExecuteListener;)V", "Landroid/app/Application;", "Ljava/util/List;", "Companion", "com/palmpay/init/api/a", "init-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlphaTaskManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaTaskManager.kt\ncom/palmpay/init/api/AlphaTaskManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1855#2,2:126\n1855#2:128\n1855#2,2:129\n1856#2:131\n1855#2,2:132\n*S KotlinDebug\n*F\n+ 1 AlphaTaskManager.kt\ncom/palmpay/init/api/AlphaTaskManager\n*L\n26#1:126,2\n31#1:128\n35#1:129,2\n31#1:131\n58#1:132,2\n*E\n"})
public final class AlphaTaskManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "AlphaTaskManager";

    @NotNull
    private final Application app;

    @NotNull
    private final List<TaskInfo> taskList;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\nJ@\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/palmpay/init/api/AlphaTaskManager$Companion;", "", "()V", "TAG", "", "createInitTask", "Lcom/palmpay/init/api/IInitTask;", "classLoader", "Ljava/lang/ClassLoader;", "className", "createInitTask$init_api_release", ViewProps.START, "", "app", "Landroid/app/Application;", "taskList", "", "Lcom/palmpay/init/annotation/TaskInfo;", "onTaskComplete", "Lcom/alibaba/android/alpha/Task$OnTaskFinishListener;", "group", "onAllTaskComplete", "Lcom/alibaba/android/alpha/OnProjectExecuteListener;", "init-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void start$default(Companion companion, Application application, List list, Task.OnTaskFinishListener onTaskFinishListener, String str, OnProjectExecuteListener onProjectExecuteListener, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                onTaskFinishListener = null;
            }
            if ((i7 & 8) != 0) {
                str = GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT;
            }
            if ((i7 & 16) != 0) {
                onProjectExecuteListener = null;
            }
            companion.start(application, list, onTaskFinishListener, str, onProjectExecuteListener);
        }

        @NotNull
        public final IInitTask createInitTask$init_api_release(@NotNull ClassLoader classLoader, @NotNull String className) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(classLoader, "classLoader");
            Intrinsics.checkNotNullParameter(className, "className");
            Object objNewInstance = Class.forName(className, true, classLoader).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.f(objNewInstance, "null cannot be cast to non-null type com.palmpay.init.api.IInitTask");
            return (IInitTask) objNewInstance;
        }

        @JvmStatic
        @JvmOverloads
        public final void start(@NotNull Application app, @NotNull List<TaskInfo> taskList) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(taskList, "taskList");
            start$default(this, app, taskList, null, null, null, 28, null);
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        public final void start(@NotNull Application app, @NotNull List<TaskInfo> taskList, @Nullable Task.OnTaskFinishListener onTaskFinishListener) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(taskList, "taskList");
            start$default(this, app, taskList, onTaskFinishListener, null, null, 24, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void start(@NotNull Application app, @NotNull List<TaskInfo> taskList, @Nullable Task.OnTaskFinishListener onTaskFinishListener, @NotNull String group) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(taskList, "taskList");
            Intrinsics.checkNotNullParameter(group, "group");
            start$default(this, app, taskList, onTaskFinishListener, group, null, 16, null);
        }

        @JvmStatic
        @JvmOverloads
        public final void start(@NotNull Application app, @NotNull List<TaskInfo> taskList, @Nullable Task.OnTaskFinishListener onTaskComplete, @NotNull String group, @Nullable OnProjectExecuteListener onAllTaskComplete) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(taskList, "taskList");
            Intrinsics.checkNotNullParameter(group, "group");
            new AlphaTaskManager(app, taskList, null).start(group, onTaskComplete, onAllTaskComplete);
        }
    }

    public /* synthetic */ AlphaTaskManager(Application application, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, list);
    }

    private final void checkDuplicateName(List<TaskInfo> taskList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (TaskInfo taskInfo : taskList) {
            if (linkedHashSet.contains(taskInfo.getName())) {
                throw new IllegalStateException(("Found multiple tasks with the same name: [" + taskInfo.getName() + ']').toString());
            }
            linkedHashSet.add(taskInfo.getName());
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final void start(@NotNull Application application, @NotNull List<TaskInfo> list) {
        INSTANCE.start(application, list);
    }

    public static /* synthetic */ void start$default(AlphaTaskManager alphaTaskManager, String str, Task.OnTaskFinishListener onTaskFinishListener, OnProjectExecuteListener onProjectExecuteListener, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = GetCustomerServiceUrlReq.ENTER_TYPE_DEFAULT;
        }
        if ((i7 & 2) != 0) {
            onTaskFinishListener = null;
        }
        if ((i7 & 4) != 0) {
            onProjectExecuteListener = null;
        }
        alphaTaskManager.start(str, onTaskFinishListener, onProjectExecuteListener);
    }

    private AlphaTaskManager(Application application, List<TaskInfo> list) {
        this.app = application;
        this.taskList = list;
    }

    @JvmStatic
    @JvmOverloads
    public static final void start(@NotNull Application application, @NotNull List<TaskInfo> list, @Nullable Task.OnTaskFinishListener onTaskFinishListener) {
        INSTANCE.start(application, list, onTaskFinishListener);
    }

    @JvmStatic
    @JvmOverloads
    public static final void start(@NotNull Application application, @NotNull List<TaskInfo> list, @Nullable Task.OnTaskFinishListener onTaskFinishListener, @NotNull String str) {
        INSTANCE.start(application, list, onTaskFinishListener, str);
    }

    @JvmStatic
    @JvmOverloads
    public static final void start(@NotNull Application application, @NotNull List<TaskInfo> list, @Nullable Task.OnTaskFinishListener onTaskFinishListener, @NotNull String str, @Nullable OnProjectExecuteListener onProjectExecuteListener) {
        INSTANCE.start(application, list, onTaskFinishListener, str, onProjectExecuteListener);
    }

    public final void start(@NotNull String group, @Nullable Task.OnTaskFinishListener onTaskComplete, @Nullable OnProjectExecuteListener onAllTaskComplete) {
        Intrinsics.checkNotNullParameter(group, "group");
        checkDuplicateName(this.taskList);
        Project.Builder builder = new Project.Builder();
        HashMap map = new HashMap();
        for (TaskInfo taskInfo : this.taskList) {
            if (Intrinsics.c(taskInfo.getGroup(), group)) {
                map.put(taskInfo.getName(), new a(this.app, taskInfo));
            }
        }
        for (TaskInfo taskInfo2 : this.taskList) {
            if (Intrinsics.c(taskInfo2.getGroup(), group)) {
                builder.add((Task) map.get(taskInfo2.getName()));
                Set<String> depends = taskInfo2.getDepends();
                if (depends != null) {
                    Iterator<T> it = depends.iterator();
                    while (it.hasNext()) {
                        Task task = (Task) map.get((String) it.next());
                        if (task != null) {
                            builder.after(task);
                        }
                    }
                }
            }
        }
        if (onAllTaskComplete != null) {
            builder.setOnProjectExecuteListener(onAllTaskComplete);
        }
        Project projectCreate = builder.create();
        Intrinsics.checkNotNullExpressionValue(projectCreate, "create(...)");
        if (onTaskComplete != null) {
            projectCreate.addOnTaskFinishListener(onTaskComplete);
        }
        AlphaManager.getInstance(this.app).addProject(projectCreate, 1);
        AlphaManager.getInstance(this.app).start();
    }
}
