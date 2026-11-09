package androidx.lifecycle;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17345a = new HashMap();

    public final boolean a(int i7, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        HashMap map = this.f17345a;
        Integer num = (Integer) map.get(name);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z3 = (iIntValue & i7) != 0;
        map.put(name, Integer.valueOf(i7 | iIntValue));
        return !z3;
    }
}
