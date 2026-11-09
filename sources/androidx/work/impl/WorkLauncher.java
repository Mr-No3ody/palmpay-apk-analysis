package androidx.work.impl;

import V0.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0005\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\n\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/work/impl/WorkLauncher;", "", "Landroidx/work/impl/h;", "workSpecId", "", "startWork", "(Landroidx/work/impl/h;)V", "LV0/a0;", "runtimeExtras", "(Landroidx/work/impl/h;LV0/a0;)V", "stopWork", "", "reason", "(Landroidx/work/impl/h;I)V", "stopWorkWithReason", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface WorkLauncher {
    default void startWork(@NotNull C1275h workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        startWork(workSpecId, null);
    }

    void startWork(@NotNull C1275h workSpecId, @Nullable a0 runtimeExtras);

    default void stopWork(@NotNull C1275h workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        stopWork(workSpecId, -512);
    }

    void stopWork(@NotNull C1275h workSpecId, int reason);

    default void stopWorkWithReason(@NotNull C1275h workSpecId, int reason) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        stopWork(workSpecId, reason);
    }
}
