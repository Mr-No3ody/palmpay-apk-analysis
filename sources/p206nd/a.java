package p206nd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final b getEnumByType(@Nullable Integer num) {
        for (b bVar : b.values()) {
            int i7 = bVar.f39933a;
            if (num != null && i7 == num.intValue()) {
                return bVar;
            }
        }
        return b.f39931d;
    }

    private a() {
    }
}
