package Eb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2284b;

    public l(String cardNo, List plans) {
        Intrinsics.checkNotNullParameter(cardNo, "cardNo");
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f2283a = cardNo;
        this.f2284b = plans;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.c(this.f2283a, lVar.f2283a) && this.f2284b.equals(lVar.f2284b);
    }

    public final int hashCode() {
        return this.f2284b.hashCode() + (this.f2283a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(cardNo=" + this.f2283a + ", plans=" + this.f2284b + ")";
    }
}
