package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: kotlin.collections.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1850q extends C1849p {
    public static ArrayList e(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C1842i(elements, true));
    }

    public static IntRange f(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static int g(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static List h(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? C1846m.c(elements) : z.f38935a;
    }

    public static ArrayList i(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C1842i(elements, true));
    }

    public static void j() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void k() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
