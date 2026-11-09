package okhttp3;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class L {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final K f40589e = new K(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f40590f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f40591g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f40595d;

    public L(String str, String str2, String str3, String[] strArr) {
        this.f40592a = str;
        this.f40593b = str2;
        this.f40594c = str3;
        this.f40595d = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        Intrinsics.checkNotNullParameter("charset", "name");
        String[] strArr = this.f40595d;
        int i7 = 0;
        int iA = Hf.c.a(0, strArr.length - 1, 2);
        if (iA < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!kotlin.text.y.h(strArr[i7], "charset", true)) {
                if (i7 == iA) {
                    str = null;
                    break;
                }
                i7 += 2;
            } else {
                str = strArr[i7 + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof L) && Intrinsics.c(((L) obj).f40592a, this.f40592a);
    }

    public final int hashCode() {
        return this.f40592a.hashCode();
    }

    public final String toString() {
        return this.f40592a;
    }
}
