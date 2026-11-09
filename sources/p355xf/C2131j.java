package p355xf;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2131j {
    public static Lazy a(EnumC2132k mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0) {
            return new t(initializer, null, 2, null);
        }
        if (iOrdinal == 1) {
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            s sVar = new s();
            sVar.f43980a = initializer;
            sVar.f43981b = F.f43951a;
            return sVar;
        }
        if (iOrdinal != 2) {
            throw new l();
        }
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        K k2 = new K();
        k2.f43955a = initializer;
        k2.f43956b = F.f43951a;
        return k2;
    }

    public static t b(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new t(initializer, null, 2, null);
    }
}
