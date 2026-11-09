package p164l0;

import android.content.Context;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    @JvmStatic
    @DoNotInline
    public static final boolean a(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        return context.deleteSharedPreferences(name);
    }
}
