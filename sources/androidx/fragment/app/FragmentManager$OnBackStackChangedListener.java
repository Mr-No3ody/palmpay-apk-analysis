package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface FragmentManager$OnBackStackChangedListener {
    @MainThread
    default void onBackStackChangeCommitted(@NonNull Fragment fragment, boolean z3) {
    }

    @MainThread
    default void onBackStackChangeStarted(@NonNull Fragment fragment, boolean z3) {
    }

    @MainThread
    void onBackStackChanged();
}
