package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39801b})
public interface Scheduler {
    void cancel(@NonNull String workSpecId);

    boolean hasLimitedSchedulingSlots();

    void schedule(@NonNull androidx.work.impl.model.k... workSpecs);
}
