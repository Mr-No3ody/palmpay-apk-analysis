package androidx.lifecycle;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1201k {
    public /* synthetic */ C1201k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @Nullable
    public final EnumC1203m downFrom(@NotNull EnumC1204n state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 2) {
            return EnumC1203m.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return EnumC1203m.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC1203m.ON_PAUSE;
    }

    @JvmStatic
    @Nullable
    public final EnumC1203m downTo(@NotNull EnumC1204n state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            return EnumC1203m.ON_DESTROY;
        }
        if (iOrdinal == 2) {
            return EnumC1203m.ON_STOP;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC1203m.ON_PAUSE;
    }

    @JvmStatic
    @Nullable
    public final EnumC1203m upFrom(@NotNull EnumC1204n state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 1) {
            return EnumC1203m.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return EnumC1203m.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return EnumC1203m.ON_RESUME;
    }

    @JvmStatic
    @Nullable
    public final EnumC1203m upTo(@NotNull EnumC1204n state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int iOrdinal = state.ordinal();
        if (iOrdinal == 2) {
            return EnumC1203m.ON_CREATE;
        }
        if (iOrdinal == 3) {
            return EnumC1203m.ON_START;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return EnumC1203m.ON_RESUME;
    }

    private C1201k() {
    }
}
