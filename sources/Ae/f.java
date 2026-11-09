package Ae;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final g fromMatchType(@Nullable Integer num) {
        if (num != null && num.intValue() == 1) {
            return g.f276c;
        }
        return ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 4)) ? g.f277d : g.f275b;
    }

    private f() {
    }
}
