package G7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class r {
    public /* synthetic */ r(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final s getRTLSupportAlign$lib_ballon_debug(@NotNull s sVar, boolean z3) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        if (z3) {
            int iOrdinal = sVar.ordinal();
            if (iOrdinal == 0) {
                return s.f3139b;
            }
            if (iOrdinal == 1) {
                return s.f3138a;
            }
        }
        return sVar;
    }

    private r() {
    }
}
