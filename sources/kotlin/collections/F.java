package kotlin.collections;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class F extends E {
    public static int a(int i7) {
        if (i7 < 0) {
            return i7;
        }
        if (i7 < 3) {
            return i7 + 1;
        }
        if (i7 < 1073741824) {
            return (int) ((i7 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map b(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.f38891a, pair.f38892b);
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }
}
