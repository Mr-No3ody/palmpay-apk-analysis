package kotlin.collections;

import C0.C0119k;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class P extends O {
    public static LinkedHashSet c(Set set, C0119k c0119k) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(F.a(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(c0119k);
        return linkedHashSet;
    }
}
