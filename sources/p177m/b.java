package p177m;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public abstract Intent createIntent(Context context, Object obj);

    @Nullable
    public a getSynchronousResult(@NotNull Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object parseResult(int i7, Intent intent);
}
