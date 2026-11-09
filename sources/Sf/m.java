package Sf;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public class m extends l {
    public static a a(Iterator it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        Kf.q qVar = new Kf.q(it, 2);
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return new a(qVar);
    }

    public static Sequence b(Object obj, Function1 nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return obj == null ? f.f8887a : new e(new M3.f(obj, 17), nextFunction);
    }
}
