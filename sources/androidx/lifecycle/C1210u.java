package androidx.lifecycle;

import androidx.annotation.VisibleForTesting;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1210u {
    public /* synthetic */ C1210u(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @VisibleForTesting
    @NotNull
    public final C1212w createUnsafe(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return new C1212w(owner, false);
    }

    @JvmStatic
    @NotNull
    public final EnumC1204n min$lifecycle_runtime_release(@NotNull EnumC1204n state1, @Nullable EnumC1204n enumC1204n) {
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (enumC1204n == null || enumC1204n.compareTo(state1) >= 0) ? state1 : enumC1204n;
    }

    private C1210u() {
    }
}
