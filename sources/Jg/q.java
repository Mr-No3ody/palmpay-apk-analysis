package Jg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class q {
    public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final r buildIfSupported() {
        if (isSupported()) {
            return new r();
        }
        return null;
    }

    public final boolean isSupported() {
        return r.f4867f;
    }

    private q() {
    }
}
