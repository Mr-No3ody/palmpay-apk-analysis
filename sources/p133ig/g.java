package p133ig;

import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String simpleName = G.a(getClass()).getSimpleName();
        Intrinsics.e(simpleName);
        return simpleName;
    }
}
