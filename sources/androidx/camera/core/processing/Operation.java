package androidx.camera.core.processing;

import E.Q;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes.dex */
public interface Operation<I, O> {
    @NonNull
    @WorkerThread
    O apply(@NonNull I i7) throws Q;
}
