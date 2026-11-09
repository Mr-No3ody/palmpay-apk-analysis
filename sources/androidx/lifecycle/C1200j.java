package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry$AutoRecreated;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1200j implements SavedStateRegistry$AutoRecreated {
    @Override // androidx.savedstate.SavedStateRegistry$AutoRecreated
    public final void onRecreated(SavedStateRegistryOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (!(owner instanceof ViewModelStoreOwner)) {
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
        i0 viewModelStore = ((ViewModelStoreOwner) owner).getViewModelStore();
        L0.d savedStateRegistry = owner.getSavedStateRegistry();
        viewModelStore.getClass();
        LinkedHashMap linkedHashMap = viewModelStore.f17458a;
        for (String key : new HashSet(linkedHashMap.keySet())) {
            Intrinsics.checkNotNullParameter(key, "key");
            a0 a0Var = (a0) linkedHashMap.get(key);
            Intrinsics.e(a0Var);
            V.a(a0Var, savedStateRegistry, owner.getLifecycle());
        }
        if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
            return;
        }
        savedStateRegistry.d();
    }
}
