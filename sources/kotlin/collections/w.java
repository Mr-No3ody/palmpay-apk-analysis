package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes4.dex */
public class w extends v {
    public static final int t(int i7, List list) {
        if (i7 >= 0 && i7 <= C1850q.g(list)) {
            return C1850q.g(list) - i7;
        }
        StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "Element index ", " must be in range [");
        sbE.append(new IntRange(0, C1850q.g(list), 1));
        sbE.append("].");
        throw new IndexOutOfBoundsException(sbE.toString());
    }

    public static final int u(int i7, List list) {
        if (i7 >= 0 && i7 <= list.size()) {
            return list.size() - i7;
        }
        StringBuilder sbE = androidx.camera.camera2.internal.F.e(i7, "Position index ", " must be in range [");
        sbE.append(new IntRange(0, list.size(), 1));
        sbE.append("].");
        throw new IndexOutOfBoundsException(sbE.toString());
    }

    public static K v(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new K(list);
    }
}
