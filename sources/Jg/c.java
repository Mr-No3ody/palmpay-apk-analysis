package Jg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class c {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final t buildIfSupported() {
        if (isSupported()) {
            return new e();
        }
        return null;
    }

    public final boolean isSupported() {
        return e.f4845g;
    }

    private c() {
    }
}
