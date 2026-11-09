package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public /* synthetic */ f0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static /* synthetic */ void getInstance$annotations() {
    }

    @RestrictTo({p192n.c.f39801b})
    @NotNull
    public final g0 getInstance() {
        if (g0.f17455c == null) {
            g0.f17455c = new g0();
        }
        g0 g0Var = g0.f17455c;
        Intrinsics.e(g0Var);
        return g0Var;
    }

    private f0() {
    }
}
