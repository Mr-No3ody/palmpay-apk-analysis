package androidx.work.impl.utils;

import V0.C;
import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f18697b = new f(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f18698c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkRequest f18699a;

    static {
        String strD = C.d("NetworkRequestCompat");
        Intrinsics.checkNotNullExpressionValue(strD, "tagWithPrefix(\"NetworkRequestCompat\")");
        f18698c = strD;
    }

    public g(NetworkRequest networkRequest) {
        this.f18699a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.c(this.f18699a, ((g) obj).f18699a);
    }

    public final int hashCode() {
        NetworkRequest networkRequest = this.f18699a;
        if (networkRequest == null) {
            return 0;
        }
        return networkRequest.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f18699a + ')';
    }
}
