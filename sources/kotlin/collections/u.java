package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class u extends t {
    public static void m(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
