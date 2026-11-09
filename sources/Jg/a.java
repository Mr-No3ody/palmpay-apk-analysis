package Jg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final t buildIfSupported() {
        if (isSupported()) {
            return new b();
        }
        return null;
    }

    public final boolean isSupported() {
        return b.f4840f;
    }

    private a() {
    }
}
