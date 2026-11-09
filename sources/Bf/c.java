package Bf;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f907a = new c();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable a3 = (Comparable) obj;
        Comparable b7 = (Comparable) obj2;
        Intrinsics.checkNotNullParameter(a3, "a");
        Intrinsics.checkNotNullParameter(b7, "b");
        return b7.compareTo(a3);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return b.f906a;
    }
}
