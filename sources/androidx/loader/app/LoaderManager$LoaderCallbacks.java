package androidx.loader.app;

import B0.a;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface LoaderManager$LoaderCallbacks<D> {
    @NonNull
    @MainThread
    a onCreateLoader(int i7, @Nullable Bundle bundle);

    @MainThread
    void onLoadFinished(@NonNull a aVar, D d2);

    @MainThread
    void onLoaderReset(@NonNull a aVar);
}
