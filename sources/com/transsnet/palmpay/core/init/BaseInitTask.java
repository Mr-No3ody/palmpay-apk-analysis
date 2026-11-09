package com.transsnet.palmpay.core.init;

import com.palmpay.init.api.IInitTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/init/BaseInitTask;", "Lcom/palmpay/init/api/IInitTask;", "<init>", "()V", "beginSection", "", "name", "", "endSection", "Companion", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseInitTask implements IInitTask {

    @NotNull
    public static final String TAG = "InitTask";

    public static /* synthetic */ void beginSection$default(BaseInitTask baseInitTask, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: beginSection");
        }
        if ((i7 & 1) != 0) {
            str = baseInitTask.getTaskName();
        }
        baseInitTask.beginSection(str);
    }

    public static /* synthetic */ void endSection$default(BaseInitTask baseInitTask, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: endSection");
        }
        if ((i7 & 1) != 0) {
            str = baseInitTask.getTaskName();
        }
        baseInitTask.endSection(str);
    }

    public final void beginSection(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public final void endSection(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
