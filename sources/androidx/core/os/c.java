package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f16089a = new c();

    private c() {
    }

    @JvmStatic
    public static final void a(@NotNull Bundle bundle, @NotNull String str, @Nullable Size size) {
        bundle.putSize(str, size);
    }

    @JvmStatic
    public static final void b(@NotNull Bundle bundle, @NotNull String str, @Nullable SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
