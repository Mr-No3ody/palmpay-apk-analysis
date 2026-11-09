package G7;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class v {
    public /* synthetic */ v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final w getInstance(@NotNull Context context) {
        w wVar;
        Intrinsics.checkNotNullParameter(context, "context");
        w wVar2 = w.f3146b;
        if (wVar2 != null) {
            return wVar2;
        }
        synchronized (this) {
            wVar = w.f3146b;
            if (wVar == null) {
                wVar = new w();
                w.f3146b = wVar;
                Intrinsics.checkNotNullExpressionValue(context.getSharedPreferences("com.skydoves.balloon", 0), "context.getSharedPrefere…n\", Context.MODE_PRIVATE)");
            }
        }
        return wVar;
    }

    @JvmStatic
    @NotNull
    public final String getPersistName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Intrinsics.k(name, "SHOWED_UP");
    }

    private v() {
    }
}
