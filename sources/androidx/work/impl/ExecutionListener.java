package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39801b})
public interface ExecutionListener {
    void onExecuted(@NonNull androidx.work.impl.model.e id2, boolean needsReschedule);
}
