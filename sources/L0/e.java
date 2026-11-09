package L0;

import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final f create(@NotNull SavedStateRegistryOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return new f(owner);
    }

    private e() {
    }
}
