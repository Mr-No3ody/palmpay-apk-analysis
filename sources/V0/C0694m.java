package V0;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0694m extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0694m f9955a = new C0694m(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "<name for destructuring parameter 0>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sbT = C0.G.t(str, " : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            Intrinsics.checkNotNullExpressionValue(value, "toString(this)");
        }
        sbT.append(value);
        return sbT.toString();
    }
}
