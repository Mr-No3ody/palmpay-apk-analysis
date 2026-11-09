package Y7;

import androidx.core.graphics.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final b fromInsets(@NotNull e insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return new b(insets.f16058a, insets.f16059b, insets.f16060c, insets.f16061d);
    }

    @NotNull
    public final b getZERO() {
        return b.f11306f;
    }

    @NotNull
    public final b max(@NotNull b i7, @NotNull b i10) {
        Intrinsics.checkNotNullParameter(i7, "i1");
        Intrinsics.checkNotNullParameter(i10, "i2");
        return new b(Math.max(i7.f11307a, i10.f11307a), Math.max(i7.f11308b, i10.f11308b), Math.max(i7.f11309c, i10.f11309c), Math.max(i7.f11310d, i10.f11310d));
    }

    private a() {
    }
}
