package Jg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o {
    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final p buildIfSupported() {
        if (isAvailable()) {
            return new p();
        }
        return null;
    }

    public final boolean isAvailable() {
        return p.f4865e;
    }

    private o() {
    }
}
