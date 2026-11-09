package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public /* synthetic */ d0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final ViewModelProvider$Factory defaultFactory$lifecycle_viewmodel_release(@NotNull ViewModelStoreOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory() : g0.f17454b.getInstance();
    }

    @JvmStatic
    @NotNull
    public final e0 getInstance(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (e0.f17447g == null) {
            Intrinsics.checkNotNullParameter(application, "application");
            e0.f17447g = new e0(application);
        }
        e0 e0Var = e0.f17447g;
        Intrinsics.e(e0Var);
        return e0Var;
    }

    private d0() {
    }
}
