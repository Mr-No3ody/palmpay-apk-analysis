package G7;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final b getRTLSupportOrientation$lib_ballon_debug(@NotNull b bVar, boolean z3) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (z3) {
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 2) {
                return b.f3052e;
            }
            if (iOrdinal == 3) {
                return b.f3051d;
            }
        }
        return bVar;
    }

    private a() {
    }
}
