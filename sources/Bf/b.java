package Bf;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f906a = new b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable a3 = (Comparable) obj;
        Comparable b7 = (Comparable) obj2;
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        return a3.compareTo(b7);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return c.f907a;
    }
}
