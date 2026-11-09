package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Pair<A, B> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f38892b;

    public Pair(Object obj, Object obj2) {
        this.f38891a = obj;
        this.f38892b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.c(this.f38891a, pair.f38891a) && Intrinsics.c(this.f38892b, pair.f38892b);
    }

    public final int hashCode() {
        Object obj = this.f38891a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f38892b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f38891a + ", " + this.f38892b + ')';
    }
}
