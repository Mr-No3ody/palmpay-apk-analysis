package androidx.camera.core;

import E.n0;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39801b})
public interface UseCase$StateChangeCallback {
    void onUseCaseActive(@NonNull n0 n0Var);

    void onUseCaseInactive(@NonNull n0 n0Var);

    void onUseCaseReset(@NonNull n0 n0Var);

    void onUseCaseUpdated(@NonNull n0 n0Var);
}
