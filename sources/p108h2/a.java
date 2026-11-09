package p108h2;

import java.io.File;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final b create(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new b(file);
    }

    @JvmStatic
    @Nullable
    public final b createOrNull(@Nullable File file) {
        if (file != null) {
            return new b(file);
        }
        return null;
    }

    private a() {
    }
}
