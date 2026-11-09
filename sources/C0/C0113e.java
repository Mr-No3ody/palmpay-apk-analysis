package C0;

import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0113e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public U f1034b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f1035c = null;

    public C0113e(int i7) {
        this.f1033a = i7;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0113e)) {
            C0113e c0113e = (C0113e) obj;
            if (this.f1033a == c0113e.f1033a && Intrinsics.c(this.f1034b, c0113e.f1034b)) {
                if (!Intrinsics.c(this.f1035c, c0113e.f1035c)) {
                    Bundle bundle = this.f1035c;
                    if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                        if (!setKeySet.isEmpty()) {
                            for (String str : setKeySet) {
                                Bundle bundle2 = this.f1035c;
                                Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                                Bundle bundle3 = c0113e.f1035c;
                                if (!Intrinsics.c(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = Integer.hashCode(this.f1033a) * 31;
        U u6 = this.f1034b;
        int iHashCode2 = iHashCode + (u6 != null ? u6.hashCode() : 0);
        Bundle bundle = this.f1035c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i7 = iHashCode2 * 31;
                Bundle bundle2 = this.f1035c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode2 = i7 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C0113e.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f1033a));
        sb2.append(")");
        if (this.f1034b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f1034b);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
