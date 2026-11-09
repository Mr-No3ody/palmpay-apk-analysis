package Tf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class f {
    public static final double a(double d2, e sourceUnit, e targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long jConvert = targetUnit.f9091a.convert(1L, sourceUnit.f9091a);
        return jConvert > 0 ? d2 * jConvert : d2 / sourceUnit.f9091a.convert(1L, targetUnit.f9091a);
    }

    public static final long b(long j6, e sourceUnit, e targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.f9091a.convert(j6, sourceUnit.f9091a);
    }

    public static final long c(long j6, e sourceUnit, e targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.f9091a.convert(j6, sourceUnit.f9091a);
    }
}
