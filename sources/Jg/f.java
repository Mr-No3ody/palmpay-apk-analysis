package Jg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final g buildIfSupported() {
        if (isSupported()) {
            return new g();
        }
        return null;
    }

    public final boolean isSupported() {
        return g.f4849f;
    }

    private f() {
    }
}
