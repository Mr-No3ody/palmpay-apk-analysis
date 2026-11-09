package retrofit2;

import N8.q0;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends U {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f41810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f41811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f41812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Converter f41813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f41814h;

    public B(Method method, int i7, String str, Converter converter, boolean z3) {
        this.f41810d = method;
        this.f41811e = i7;
        Objects.requireNonNull(str, "name == null");
        this.f41812f = str;
        this.f41813g = converter;
        this.f41814h = z3;
    }

    @Override // retrofit2.U
    public final void a(H h7, Object obj) {
        String utf8;
        String str = this.f41812f;
        if (obj == null) {
            throw U.o(this.f41810d, this.f41811e, q0.k("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        String str2 = (String) this.f41813g.convert(obj);
        if (h7.f41827c == null) {
            throw new AssertionError();
        }
        int length = str2.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                utf8 = str2;
                break;
            }
            int iCodePointAt = str2.codePointAt(iCharCount);
            boolean z3 = this.f41814h;
            int i7 = 47;
            int i10 = -1;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z3 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                Pg.k kVar = new Pg.k();
                kVar.u(0, iCharCount, str2);
                Pg.k kVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str2.codePointAt(iCharCount);
                    if (!z3 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < 32 || iCodePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i10 || (!z3 && (iCodePointAt2 == i7 || iCodePointAt2 == 37))) {
                            if (kVar2 == null) {
                                kVar2 = new Pg.k();
                            }
                            kVar2.w(iCodePointAt2);
                            while (!kVar2.exhausted()) {
                                byte b7 = kVar2.readByte();
                                int i11 = b7 & UnsignedBytes.MAX_VALUE;
                                kVar.m(37);
                                char[] cArr = H.f41823l;
                                kVar.m(cArr[(i11 >> 4) & 15]);
                                kVar.m(cArr[b7 & Ascii.SI]);
                            }
                        } else {
                            kVar.w(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i7 = 47;
                    i10 = -1;
                }
                utf8 = kVar.readUtf8();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = h7.f41827c.replace("{" + str + "}", utf8);
        if (H.f41824m.matcher(strReplace).matches()) {
            throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(str2));
        }
        h7.f41827c = strReplace;
    }
}
