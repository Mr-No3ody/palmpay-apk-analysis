package kotlin.collections;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class r extends C1850q {
    public static int l(Iterable iterable, int i7) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }
}
