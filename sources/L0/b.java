package L0;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry$SavedStateProvider;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements SavedStateRegistry$SavedStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f5515a;

    public b(d registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f5515a = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle saveState() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f5515a));
        return bundle;
    }
}
