package K0;

import C0.G;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f4872h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4879g;

    public b(String name, String type, String str, int i7, int i10, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f4873a = name;
        this.f4874b = type;
        this.f4875c = z3;
        this.f4876d = i7;
        this.f4877e = str;
        this.f4878f = i10;
        int i11 = 5;
        if (type != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = type.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (StringsKt.A(upperCase, "INT", false)) {
                i11 = 3;
            } else if (StringsKt.A(upperCase, "CHAR", false) || StringsKt.A(upperCase, "CLOB", false) || StringsKt.A(upperCase, "TEXT", false)) {
                i11 = 2;
            } else if (!StringsKt.A(upperCase, "BLOB", false)) {
                i11 = (StringsKt.A(upperCase, "REAL", false) || StringsKt.A(upperCase, "FLOA", false) || StringsKt.A(upperCase, "DOUB", false)) ? 4 : 1;
            }
        }
        this.f4879g = i11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f4876d != bVar.f4876d) {
                return false;
            }
            if (!Intrinsics.c(this.f4873a, bVar.f4873a) || this.f4875c != bVar.f4875c) {
                return false;
            }
            int i7 = bVar.f4878f;
            String str = bVar.f4877e;
            a aVar = f4872h;
            String str2 = this.f4877e;
            int i10 = this.f4878f;
            if (i10 == 1 && i7 == 2 && str2 != null && !aVar.defaultValueEquals(str2, str)) {
                return false;
            }
            if (i10 == 2 && i7 == 1 && str != null && !aVar.defaultValueEquals(str, str2)) {
                return false;
            }
            if (i10 != 0 && i10 == i7) {
                if (str2 != null) {
                    if (!aVar.defaultValueEquals(str2, str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
            }
            if (this.f4879g != bVar.f4879g) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f4873a.hashCode() * 31) + this.f4879g) * 31) + (this.f4875c ? 1231 : 1237)) * 31) + this.f4876d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Column{name='");
        sb2.append(this.f4873a);
        sb2.append("', type='");
        sb2.append(this.f4874b);
        sb2.append("', affinity='");
        sb2.append(this.f4879g);
        sb2.append("', notNull=");
        sb2.append(this.f4875c);
        sb2.append(", primaryKeyPosition=");
        sb2.append(this.f4876d);
        sb2.append(", defaultValue='");
        String str = this.f4877e;
        if (str == null) {
            str = "undefined";
        }
        return G.r(sb2, str, "'}");
    }
}
