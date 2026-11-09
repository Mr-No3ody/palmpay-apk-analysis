package p185ma;

import C0.G;
import N8.q0;
import Pa.C0505b;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.maps.android.BuildConfig;
import com.transsnet.palmpay.core.bean.req.CommonShareReq;
import com.transsnet.palmpay.core.network.PayApiService;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p071ef.b;
import p103gf.a;
import p191mg.d;
import p191mg.k;
import p298tf.f;
import p317v0.e;
import p324va.c;
import p355xf.l;

/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f39627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f39628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f39629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f39630f;

    public t(Context context) {
        this.f39625a = 0;
        this.f39626b = -1;
        this.f39630f = context;
        this.f39629e = new a();
    }

    public static /* synthetic */ void n(t tVar, String str, int i7, int i10) {
        if ((i10 & 2) != 0) {
            i7 = tVar.f39626b;
        }
        tVar.m(i7, str, (i10 & 4) != 0 ? "" : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    public int a(int i7, CharSequence charSequence) {
        int i10 = i7 + 4;
        if (i10 < charSequence.length()) {
            ((StringBuilder) this.f39630f).append((char) (p(i7 + 3, charSequence) + (p(i7, charSequence) << 12) + (p(i7 + 1, charSequence) << 8) + (p(i7 + 2, charSequence) << 4)));
            return i10;
        }
        this.f39626b = i7;
        if (i10 < charSequence.length()) {
            return a(this.f39626b, charSequence);
        }
        n(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    public boolean b() {
        int i7 = this.f39626b;
        if (i7 == -1) {
            return false;
        }
        while (true) {
            String str = (String) this.f39628d;
            if (i7 >= str.length()) {
                this.f39626b = i7;
                return false;
            }
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f39626b = i7;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i7++;
        }
    }

    public void c(CommonShareReq commonShareReq) {
        int i7 = this.f39626b;
        if (i7 < 0 || i7 >= 31) {
            ((PayApiService) c.f43141a.f14621b).commonShareNew(commonShareReq).i(b.a()).k(f.f42629b).subscribe(new s(this, commonShareReq, 1));
        } else {
            ((PayApiService) c.f43141a.f14621b).commonShare(commonShareReq).i(b.a()).k(f.f42629b).subscribe(new s(this, commonShareReq, 0));
        }
    }

    public void d(int i7, String str) {
        String str2 = (String) this.f39628d;
        if (str2.length() - i7 < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != (str2.charAt(i7 + i10) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, 6);
                throw null;
            }
        }
        this.f39626b = str.length() + i7;
    }

    public String e() {
        h('\"');
        int i7 = this.f39626b;
        String source = (String) this.f39628d;
        int iD = StringsKt.D(source, '\"', i7, 4);
        if (iD == -1) {
            k();
            o((byte) 1, false);
            throw null;
        }
        int i10 = i7;
        while (i10 < iD) {
            if (source.charAt(i10) == '\\') {
                int iR = this.f39626b;
                Intrinsics.checkNotNullParameter(source, "source");
                char cCharAt = source.charAt(i10);
                boolean z3 = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        ((StringBuilder) this.f39630f).append((CharSequence) source, iR, i10);
                        int iR2 = r(i10 + 1);
                        if (iR2 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, 6);
                            throw null;
                        }
                        int iA = iR2 + 1;
                        char cCharAt2 = source.charAt(iR2);
                        if (cCharAt2 == 'u') {
                            iA = a(iA, source);
                        } else {
                            char c6 = cCharAt2 < 'u' ? d.f39723a[cCharAt2] : (char) 0;
                            if (c6 == 0) {
                                n(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f39630f).append(c6);
                        }
                        iR = r(iA);
                        if (iR == -1) {
                            n(this, "Unexpected EOF", iR, 4);
                            throw null;
                        }
                    } else {
                        i10++;
                        if (i10 >= source.length()) {
                            ((StringBuilder) this.f39630f).append((CharSequence) source, iR, i10);
                            iR = r(i10);
                            if (iR == -1) {
                                n(this, "Unexpected EOF", iR, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = source.charAt(i10);
                    }
                    i10 = iR;
                    z3 = true;
                    cCharAt = source.charAt(i10);
                }
                String string = !z3 ? source.subSequence(iR, i10).toString() : l(iR, i10);
                this.f39626b = i10 + 1;
                return string;
            }
            i10++;
        }
        this.f39626b = iD + 1;
        String strSubstring = source.substring(i7, iD);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public byte f() {
        String str;
        int i7 = this.f39626b;
        while (true) {
            str = (String) this.f39628d;
            if (i7 == -1 || i7 >= str.length()) {
                break;
            }
            int i10 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f39626b = i10;
                return k.d(cCharAt);
            }
            i7 = i10;
        }
        this.f39626b = str.length();
        return (byte) 10;
    }

    public byte g(byte b7) {
        byte bF = f();
        if (bF == b7) {
            return bF;
        }
        o(b7, true);
        throw null;
    }

    public void h(char c6) {
        int i7 = this.f39626b;
        if (i7 == -1) {
            v(c6);
            throw null;
        }
        while (true) {
            String str = (String) this.f39628d;
            if (i7 >= str.length()) {
                this.f39626b = -1;
                v(c6);
                throw null;
            }
            int i10 = i7 + 1;
            char cCharAt = str.charAt(i7);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f39626b = i10;
                if (cCharAt == c6) {
                    return;
                }
                v(c6);
                throw null;
            }
            i7 = i10;
        }
    }

    public long i() {
        boolean z3;
        boolean z8;
        double dPow;
        int iR = r(t());
        String str = (String) this.f39628d;
        if (iR >= str.length() || iR == -1) {
            n(this, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iR) == '\"') {
            iR++;
            if (iR == str.length()) {
                n(this, "EOF", 0, 6);
                throw null;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        int i7 = iR;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        long j6 = 0;
        long j10 = 0;
        while (true) {
            if (i7 == str.length()) {
                z3 = z3;
                z8 = z11;
                break;
            }
            char cCharAt = str.charAt(i7);
            if ((cCharAt != 'e' && cCharAt != 'E') || z11) {
                z3 = z3;
                if (cCharAt == '-' && z11) {
                    if (i7 == iR) {
                        n(this, "Unexpected symbol '-' in numeric literal", 0, 6);
                        throw null;
                    }
                    i7++;
                    z3 = z3;
                    z10 = false;
                } else if (cCharAt != '+' || !z11) {
                    z8 = z11;
                    if (cCharAt != '-') {
                        if (k.d(cCharAt) != 0) {
                            break;
                        }
                        i7++;
                        int i10 = cCharAt - '0';
                        if (i10 < 0 || i10 >= 10) {
                            n(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, 6);
                            throw null;
                        }
                        if (z8) {
                            j6 = (j6 * ((long) 10)) + ((long) i10);
                        } else {
                            j10 = (j10 * ((long) 10)) - ((long) i10);
                            if (j10 > 0) {
                                n(this, "Numeric value overflow", 0, 6);
                                throw null;
                            }
                            i7 = i7;
                        }
                        z11 = z8;
                    } else {
                        if (i7 != iR) {
                            n(this, "Unexpected symbol '-' in numeric literal", 0, 6);
                            throw null;
                        }
                        i7++;
                        z3 = z3;
                        z11 = z8;
                        z12 = true;
                    }
                } else {
                    if (i7 == iR) {
                        n(this, "Unexpected symbol '+' in numeric literal", 0, 6);
                        throw null;
                    }
                    i7++;
                    z3 = z3;
                    z10 = true;
                }
            } else {
                if (i7 == iR) {
                    n(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, 6);
                    throw null;
                }
                i7++;
                z10 = true;
                z11 = true;
            }
        }
        boolean z13 = i7 != iR;
        if (iR == i7 || (z12 && iR == i7 - 1)) {
            n(this, "Expected numeric literal", 0, 6);
            throw null;
        }
        if (z3) {
            if (!z13) {
                n(this, "EOF", 0, 6);
                throw null;
            }
            if (str.charAt(i7) != '\"') {
                n(this, "Expected closing quotation mark", 0, 6);
                throw null;
            }
            i7++;
        }
        this.f39626b = i7;
        if (z8) {
            double d2 = j10;
            if (!z10) {
                dPow = Math.pow(10.0d, -j6);
            } else {
                if (!z10) {
                    throw new l();
                }
                dPow = Math.pow(10.0d, j6);
            }
            double d10 = d2 * dPow;
            if (d10 > 9.223372036854776E18d || d10 < -9.223372036854776E18d) {
                n(this, "Numeric value overflow", 0, 6);
                throw null;
            }
            if (Math.floor(d10) != d10) {
                n(this, "Can't convert " + d10 + " to Long", 0, 6);
                throw null;
            }
            j10 = (long) d10;
        }
        if (z12) {
            return j10;
        }
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        n(this, "Numeric value overflow", 0, 6);
        throw null;
    }

    public String j() {
        String str = (String) this.f39627c;
        if (str == null) {
            return e();
        }
        Intrinsics.e(str);
        this.f39627c = null;
        return str;
    }

    public String k() {
        String str = (String) this.f39627c;
        if (str != null) {
            Intrinsics.e(str);
            this.f39627c = null;
            return str;
        }
        int iT = t();
        String str2 = (String) this.f39628d;
        if (iT >= str2.length() || iT == -1) {
            n(this, "EOF", iT, 4);
            throw null;
        }
        byte bD = k.d(str2.charAt(iT));
        if (bD == 1) {
            return j();
        }
        if (bD != 0) {
            n(this, "Expected beginning of the string, but got " + str2.charAt(iT), 0, 6);
            throw null;
        }
        boolean z3 = false;
        while (k.d(str2.charAt(iT)) == 0) {
            iT++;
            if (iT >= str2.length()) {
                ((StringBuilder) this.f39630f).append((CharSequence) str2, this.f39626b, iT);
                int iR = r(iT);
                if (iR == -1) {
                    this.f39626b = iT;
                    return l(0, 0);
                }
                iT = iR;
                z3 = true;
            }
        }
        String string = !z3 ? str2.subSequence(this.f39626b, iT).toString() : l(this.f39626b, iT);
        this.f39626b = iT;
        return string;
    }

    public String l(int i7, int i10) {
        ((StringBuilder) this.f39630f).append((CharSequence) this.f39628d, i7, i10);
        StringBuilder sb2 = (StringBuilder) this.f39630f;
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    public void m(int i7, String message, String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE.concat(hint);
        StringBuilder sbT = G.t(message, " at path: ");
        sbT.append(((C0505b) this.f39629e).i());
        sbT.append(strConcat);
        throw k.b((String) this.f39628d, i7, sbT.toString());
    }

    public void o(byte b7, boolean z3) {
        String strL = k.l(b7);
        int i7 = z3 ? this.f39626b - 1 : this.f39626b;
        int i10 = this.f39626b;
        String str = (String) this.f39628d;
        n(this, G.q("Expected ", strL, ", but had '", (i10 == str.length() || i7 < 0) ? "EOF" : String.valueOf(str.charAt(i7)), "' instead"), i7, 4);
        throw null;
    }

    public int p(int i7, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i7);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        n(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    public byte q() {
        int i7 = this.f39626b;
        while (true) {
            int iR = r(i7);
            if (iR == -1) {
                this.f39626b = iR;
                return (byte) 10;
            }
            char cCharAt = ((String) this.f39628d).charAt(iR);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f39626b = iR;
                return k.d(cCharAt);
            }
            i7 = iR + 1;
        }
    }

    public int r(int i7) {
        if (i7 < ((String) this.f39628d).length()) {
            return i7;
        }
        return -1;
    }

    public void s(int i7) {
        this.f39626b = i7;
        if (i7 == 16) {
            if (TextUtils.isEmpty((String) this.f39628d)) {
                return;
            }
            c(new CommonShareReq(i7, (String) this.f39628d));
        } else if (i7 == 26 && !TextUtils.isEmpty(null)) {
            c(new CommonShareReq(i7, null));
        }
    }

    public int t() {
        char cCharAt;
        int i7 = this.f39626b;
        if (i7 == -1) {
            return i7;
        }
        while (true) {
            String str = (String) this.f39628d;
            if (i7 >= str.length() || !((cCharAt = str.charAt(i7)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i7++;
        }
        this.f39626b = i7;
        return i7;
    }

    public String toString() {
        switch (this.f39625a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append(this.f39628d);
                sb2.append("', currentPosition=");
                return q0.m(sb2, this.f39626b, ')');
            default:
                return super.toString();
        }
    }

    public boolean u() {
        int iT = t();
        String str = (String) this.f39628d;
        if (iT >= str.length() || iT == -1 || str.charAt(iT) != ',') {
            return false;
        }
        this.f39626b++;
        return true;
    }

    public void v(char c6) {
        int i7 = this.f39626b;
        if (i7 > 0 && c6 == '\"') {
            try {
                this.f39626b = i7 - 1;
                String strK = k();
                this.f39626b = i7;
                if (Intrinsics.c(strK, BuildConfig.TRAVIS)) {
                    m(this.f39626b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f39626b = i7;
                throw th;
            }
        }
        o(k.d(c6), true);
        throw null;
    }

    public void w(int i7) {
        int[] iArr = (int[]) this.f39628d;
        if (iArr[i7] != 0) {
            return;
        }
        iArr[i7] = 1;
        for (e eVar : ((e[][]) this.f39627c)[i7]) {
            w(eVar.f43022a.f43031b);
            int i10 = this.f39626b;
            this.f39626b = i10 - 1;
            ((e[]) this.f39629e)[i10] = eVar;
        }
        iArr[i7] = 2;
    }

    public t(String source) {
        this.f39625a = 1;
        Intrinsics.checkNotNullParameter(source, "source");
        C0505b c0505b = new C0505b((byte) 0, 8);
        c0505b.f7073c = new Object[8];
        int[] iArr = new int[8];
        for (int i7 = 0; i7 < 8; i7++) {
            iArr[i7] = -1;
        }
        c0505b.f7074d = iArr;
        c0505b.f7072b = -1;
        this.f39629e = c0505b;
        this.f39630f = new StringBuilder();
        this.f39628d = source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, v0.e[][]] */
    /* JADX WARN: Type inference failed for: r9v8, types: [int[], java.io.Serializable] */
    public t(androidx.gridlayout.widget.a aVar, e[] eVarArr) {
        this.f39625a = 2;
        this.f39630f = aVar;
        int length = eVarArr.length;
        this.f39629e = new e[length];
        this.f39626b = length - 1;
        int iF = aVar.f() + 1;
        ?? r3 = new e[iF][];
        int[] iArr = new int[iF];
        for (e eVar : eVarArr) {
            int i7 = eVar.f43022a.f43030a;
            iArr[i7] = iArr[i7] + 1;
        }
        for (int i10 = 0; i10 < iF; i10++) {
            r3[i10] = new e[iArr[i10]];
        }
        Arrays.fill(iArr, 0);
        for (e eVar2 : eVarArr) {
            int i11 = eVar2.f43022a.f43030a;
            e[] eVarArr2 = r3[i11];
            int i12 = iArr[i11];
            iArr[i11] = i12 + 1;
            eVarArr2[i12] = eVar2;
        }
        this.f39627c = r3;
        this.f39628d = new int[((androidx.gridlayout.widget.a) this.f39630f).f() + 1];
    }
}
