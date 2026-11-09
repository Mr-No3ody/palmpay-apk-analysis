package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class N {
    public static Af.l a(Af.l builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Af.e eVar = builder.f354a;
        eVar.b();
        return eVar.f337j > 0 ? builder : Af.l.f353c;
    }

    public static Set b(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
