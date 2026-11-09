package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {
    @Deprecated
    public void onFragmentActivityCreated(@NonNull Z z3, @NonNull Fragment fragment, @Nullable Bundle bundle) {
    }

    public void onFragmentAttached(@NonNull Z z3, @NonNull Fragment fragment, @NonNull Context context) {
    }

    public void onFragmentCreated(@NonNull Z z3, @NonNull Fragment fragment, @Nullable Bundle bundle) {
    }

    public void onFragmentDestroyed(@NonNull Z z3, @NonNull Fragment fragment) {
    }

    public void onFragmentDetached(@NonNull Z z3, @NonNull Fragment fragment) {
    }

    public void onFragmentPaused(@NonNull Z z3, @NonNull Fragment fragment) {
    }

    public void onFragmentPreAttached(@NonNull Z z3, @NonNull Fragment fragment, @NonNull Context context) {
    }

    public void onFragmentPreCreated(@NonNull Z z3, @NonNull Fragment fragment, @Nullable Bundle bundle) {
    }

    public void onFragmentResumed(@NonNull Z z3, @NonNull Fragment fragment) {
    }

    public void onFragmentSaveInstanceState(@NonNull Z z3, @NonNull Fragment fragment, @NonNull Bundle bundle) {
    }

    public void onFragmentStarted(@NonNull Z z3, @NonNull Fragment fragment) {
    }

    public void onFragmentStopped(@NonNull Z z3, @NonNull Fragment fragment) {
    }

    public void onFragmentViewCreated(@NonNull Z z3, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
    }

    public void onFragmentViewDestroyed(@NonNull Z z3, @NonNull Fragment fragment) {
    }
}
