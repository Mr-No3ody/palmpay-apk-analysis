package V0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class F {
    public /* synthetic */ F(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final G from(@NotNull Class<? extends B> workerClass) {
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        return (G) new E(workerClass).a();
    }

    private F() {
    }

    @JvmStatic
    @NotNull
    public final List<G> from(@NotNull List<? extends Class<? extends B>> workerClasses) {
        Intrinsics.checkNotNullParameter(workerClasses, "workerClasses");
        List<? extends Class<? extends B>> list = workerClasses;
        ArrayList arrayList = new ArrayList(kotlin.collections.r.l(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((G) new E((Class) it.next()).a());
        }
        return arrayList;
    }
}
