package B6;

import com.palmpay.lib.liveness.result.LiveIDResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: B6.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0102y extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LiveIDResult.Success f536a;

    public C0102y(LiveIDResult.Success result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f536a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0102y) && this.f536a.equals(((C0102y) obj).f536a);
    }

    public final int hashCode() {
        return this.f536a.f23817a.hashCode();
    }

    public final String toString() {
        return "FinishWithResult(result=" + this.f536a + ")";
    }
}
