package androidx.activity;

import android.content.res.Resources;
import androidx.annotation.ColorInt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class L {
    public /* synthetic */ L(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ M auto$default(L l5, int i7, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = K.f12006b;
        }
        return l5.auto(i7, i10, function1);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public final M auto(@ColorInt int i7, @ColorInt int i10) {
        return auto$default(this, i7, i10, null, 4, null);
    }

    @JvmStatic
    @NotNull
    public final M dark(@ColorInt int i7) {
        return new M(i7, i7, 2, K.f12007c);
    }

    @JvmStatic
    @NotNull
    public final M light(@ColorInt int i7, @ColorInt int i10) {
        return new M(i7, i10, 1, K.f12008d);
    }

    private L() {
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public final M auto(@ColorInt int i7, @ColorInt int i10, @NotNull Function1<? super Resources, Boolean> detectDarkMode) {
        Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
        return new M(i7, i10, 0, detectDarkMode);
    }
}
