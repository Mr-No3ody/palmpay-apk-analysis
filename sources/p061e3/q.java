package p061e3;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final p newBuilder(@NotNull l configBuilder) {
        Intrinsics.checkNotNullParameter(configBuilder, "configBuilder");
        return new p(configBuilder);
    }

    private q() {
    }
}
