package C0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0114f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f1038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1041d;

    public C0114f(d0 type, boolean z3, Object obj, boolean z8) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!type.f1032a && z3) {
            throw new IllegalArgumentException(type.b().concat(" does not allow nullable values").toString());
        }
        if (!z3 && z8 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.b() + " has null value but is not nullable.").toString());
        }
        this.f1038a = type;
        this.f1039b = z3;
        this.f1041d = obj;
        this.f1040c = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0114f.class.equals(obj.getClass())) {
            C0114f c0114f = (C0114f) obj;
            if (this.f1039b != c0114f.f1039b || this.f1040c != c0114f.f1040c || !Intrinsics.c(this.f1038a, c0114f.f1038a)) {
                return false;
            }
            Object obj2 = c0114f.f1041d;
            Object obj3 = this.f1041d;
            if (obj3 != null) {
                return Intrinsics.c(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f1038a.hashCode() * 31) + (this.f1039b ? 1 : 0)) * 31) + (this.f1040c ? 1 : 0)) * 31;
        Object obj = this.f1041d;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C0114f.class.getSimpleName());
        sb2.append(" Type: " + this.f1038a);
        sb2.append(" Nullable: " + this.f1039b);
        if (this.f1040c) {
            sb2.append(" DefaultValue: " + this.f1041d);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
