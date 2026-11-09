package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlin.collections.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1849p {
    public static Af.d a(Af.d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.f();
        builder.f326c = true;
        return builder.f325b > 0 ? builder : Af.d.f323e;
    }

    public static Af.d b() {
        return new Af.d(0, 1, null);
    }

    public static List c(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static void d(int i7, Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i7 < array.length) {
            array[i7] = null;
        }
    }
}
