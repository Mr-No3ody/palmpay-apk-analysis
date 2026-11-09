package p355xf;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f43987c;

    public u(Object obj, Object obj2, Object obj3) {
        this.f43985a = obj;
        this.f43986b = obj2;
        this.f43987c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.c(this.f43985a, uVar.f43985a) && Intrinsics.c(this.f43986b, uVar.f43986b) && Intrinsics.c(this.f43987c, uVar.f43987c);
    }

    public final int hashCode() {
        Object obj = this.f43985a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f43986b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f43987c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f43985a + ", " + this.f43986b + ", " + this.f43987c + ')';
    }
}
