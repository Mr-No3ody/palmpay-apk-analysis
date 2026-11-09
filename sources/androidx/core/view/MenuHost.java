package androidx.core.view;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public interface MenuHost {
    void addMenuProvider(@NonNull MenuProvider menuProvider);

    void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull EnumC1204n enumC1204n);

    void invalidateMenu();

    void removeMenuProvider(@NonNull MenuProvider menuProvider);
}
