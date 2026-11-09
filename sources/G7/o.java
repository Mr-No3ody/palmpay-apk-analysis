package G7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final p getRTLSupportAlign$lib_ballon_debug(@NotNull p pVar, boolean z3) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        if (z3) {
            int iOrdinal = pVar.ordinal();
            if (iOrdinal == 0) {
                return p.f3133b;
            }
            if (iOrdinal == 1) {
                return p.f3132a;
            }
        }
        return pVar;
    }

    private o() {
    }
}
