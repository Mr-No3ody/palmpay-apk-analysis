package E0;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f2172a = new m(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair it = (Pair) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return (String) it.f38891a;
    }
}
