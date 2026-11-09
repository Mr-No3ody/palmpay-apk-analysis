package K3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4935a;

    public m(Object obj) {
        this.f4935a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.c(this.f4935a, ((m) obj).f4935a);
    }

    public final int hashCode() {
        Object obj = this.f4935a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.f4935a + ")";
    }
}
