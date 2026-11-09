package p193n0;

import androidx.camera.camera2.internal.F;
import java.util.Map;
import kotlin.collections.C1847n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39806a = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Object value = entry.getValue();
        return F.d(new StringBuilder("  "), ((e) entry.getKey()).f39813a, " = ", value instanceof byte[] ? C1847n.v((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
    }
}
