package androidx.work;

import V0.C0695n;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface ProgressUpdater {
    @NonNull
    ListenableFuture<Void> updateProgress(@NonNull Context context, @NonNull UUID id2, @NonNull C0695n data);
}
