package okhttp3;

import N8.q0;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class H {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final G f40568i = new G(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40569a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f40572d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f40574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f40575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f40576h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40570b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f40571c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40573e = -1;

    public H() {
        ArrayList arrayList = new ArrayList();
        this.f40574f = arrayList;
        arrayList.add("");
    }

    public final void a(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f40575g == null) {
            this.f40575g = new ArrayList();
        }
        List list = this.f40575g;
        Intrinsics.e(list);
        I i7 = J.f40577k;
        list.add(I.canonicalize$okhttp$default(i7, name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
        List list2 = this.f40575g;
        Intrinsics.e(list2);
        list2.add(str != null ? I.canonicalize$okhttp$default(i7, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null) : null);
    }

    public final J b() {
        ArrayList arrayList;
        String str = this.f40569a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        I i7 = J.f40577k;
        String strPercentDecode$okhttp$default = I.percentDecode$okhttp$default(i7, this.f40570b, 0, 0, false, 7, null);
        String strPercentDecode$okhttp$default2 = I.percentDecode$okhttp$default(i7, this.f40571c, 0, 0, false, 7, null);
        String str2 = this.f40572d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iDefaultPort = this.f40573e;
        if (iDefaultPort == -1) {
            String str3 = this.f40569a;
            Intrinsics.e(str3);
            iDefaultPort = i7.defaultPort(str3);
        }
        ArrayList arrayList2 = this.f40574f;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.r.l(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(I.percentDecode$okhttp$default(J.f40577k, (String) it.next(), 0, 0, false, 7, null));
        }
        List list = this.f40575g;
        if (list != null) {
            List<String> list2 = list;
            ArrayList arrayList4 = new ArrayList(kotlin.collections.r.l(list2, 10));
            for (String str4 : list2) {
                arrayList4.add(str4 != null ? I.percentDecode$okhttp$default(J.f40577k, str4, 0, 0, true, 3, null) : null);
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        String str5 = this.f40576h;
        return new J(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iDefaultPort, arrayList3, arrayList, str5 != null ? I.percentDecode$okhttp$default(J.f40577k, str5, 0, 0, false, 7, null) : null, toString());
    }

    public final void c(String str) {
        I i7;
        String strCanonicalize$okhttp$default;
        this.f40575g = (str == null || (strCanonicalize$okhttp$default = I.canonicalize$okhttp$default((i7 = J.f40577k), str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null)) == null) ? null : i7.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
    }

    public final void d(String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        String strB0 = p059e1.a.b0(I.percentDecode$okhttp$default(J.f40577k, host, 0, 0, false, 7, null));
        if (strB0 == null) {
            throw new IllegalArgumentException(C0.G.o("unexpected host: ", host));
        }
        this.f40572d = strB0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x0209  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a8  */
    public final void e(J j6, String str) {
        String str2;
        int i7;
        int iE;
        byte bCharAt;
        G g7;
        ArrayList arrayList;
        String str3;
        int i10;
        int iPortColonOffset;
        int i11;
        int port;
        G g10;
        int i12;
        int i13;
        String str4;
        H h7 = this;
        String input = str;
        Intrinsics.checkNotNullParameter(input, "input");
        byte[] bArr = Dg.c.f1879a;
        int iN = Dg.c.n(0, input.length(), input);
        int iO = Dg.c.o(iN, input.length(), input);
        G g11 = f40568i;
        int iSchemeDelimiterOffset = g11.schemeDelimiterOffset(input, iN, iO);
        String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
        byte b7 = -1;
        if (iSchemeDelimiterOffset != -1) {
            if (kotlin.text.y.l(input, "https:", iN, true)) {
                h7.f40569a = Constants.SCHEME;
                iN += 6;
            } else {
                if (!kotlin.text.y.l(input, "http:", iN, true)) {
                    StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    String strSubstring = input.substring(0, iSchemeDelimiterOffset);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb2.append(strSubstring);
                    sb2.append('\'');
                    throw new IllegalArgumentException(sb2.toString());
                }
                h7.f40569a = "http";
                iN += 5;
            }
        } else {
            if (j6 == null) {
                if (input.length() > 6) {
                    str2 = kotlin.text.F.z(6, input) + "...";
                } else {
                    str2 = input;
                }
                throw new IllegalArgumentException(C0.G.o("Expected URL scheme 'http' or 'https' but no scheme was found for ", str2));
            }
            h7.f40569a = j6.f40579a;
        }
        int iSlashCount = g11.slashCount(input, iN, iO);
        ArrayList arrayList2 = h7.f40574f;
        byte b10 = 63;
        byte b11 = 92;
        byte b12 = 47;
        byte b13 = 35;
        if (iSlashCount >= 2 || j6 == null) {
            i7 = iN + iSlashCount;
            boolean z3 = false;
            boolean z8 = false;
            while (true) {
                iE = Dg.c.e(i7, input, iO, "@/\\?#");
                if (iE != iO) {
                    bCharAt = input.charAt(iE);
                } else {
                    bCharAt = b7;
                }
                if (bCharAt == b7 || bCharAt == b13 || bCharAt == b12 || bCharAt == b11 || bCharAt == b10) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z3) {
                        g10 = g11;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(h7.f40571c);
                        sb3.append("%40");
                        input = str;
                        i12 = iE;
                        sb3.append(I.canonicalize$okhttp$default(J.f40577k, input, i7, iE, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                        h7.f40571c = sb3.toString();
                        z3 = z3;
                    } else {
                        int iF = Dg.c.f(input, ':', i7, iE);
                        I i14 = J.f40577k;
                        boolean z10 = z3;
                        g10 = g11;
                        String strCanonicalize$okhttp$default = I.canonicalize$okhttp$default(i14, input, i7, iF, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                        if (z8) {
                            strCanonicalize$okhttp$default = androidx.camera.camera2.internal.F.d(new StringBuilder(), h7.f40570b, "%40", strCanonicalize$okhttp$default);
                        }
                        h7.f40570b = strCanonicalize$okhttp$default;
                        if (iF != iE) {
                            i13 = iE;
                            h7.f40571c = I.canonicalize$okhttp$default(i14, str, iF + 1, i13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            z3 = true;
                        } else {
                            i13 = iE;
                            z3 = z10;
                        }
                        input = str;
                        i12 = i13;
                        z8 = true;
                    }
                    i7 = i12 + 1;
                    g11 = g10;
                    iO = iO;
                    arrayList2 = arrayList2;
                    str5 = str5;
                    b7 = -1;
                    b10 = 63;
                    b11 = 92;
                    b12 = 47;
                    b13 = 35;
                }
            }
            g7 = g11;
            arrayList = arrayList2;
            str3 = str5;
            i10 = iO;
            iPortColonOffset = g7.portColonOffset(input, i7, iE);
            i11 = iPortColonOffset + 1;
            if (i11 < iE) {
                h7.f40572d = p059e1.a.b0(I.percentDecode$okhttp$default(J.f40577k, input, i7, iPortColonOffset, false, 4, null));
                port = g7.parsePort(input, i11, iE);
                h7.f40573e = port;
                if (port != -1) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = input.substring(i11, iE);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, str3);
                    sb4.append(strSubstring2);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
            } else {
                I i15 = J.f40577k;
                h7.f40572d = p059e1.a.b0(I.percentDecode$okhttp$default(i15, input, i7, iPortColonOffset, false, 4, null));
                String str6 = h7.f40569a;
                Intrinsics.e(str6);
                h7.f40573e = i15.defaultPort(str6);
            }
            if (h7.f40572d != null) {
                StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = input.substring(i7, iPortColonOffset);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, str3);
                sb5.append(strSubstring3);
                sb5.append('\"');
                throw new IllegalArgumentException(sb5.toString().toString());
            }
            iN = iE;
        } else {
            if (Intrinsics.c(j6.f40579a, h7.f40569a)) {
                h7.f40570b = j6.e();
                h7.f40571c = j6.a();
                h7.f40572d = j6.f40582d;
                h7.f40573e = j6.f40583e;
                arrayList2.clear();
                arrayList2.addAll(j6.c());
                if (iN == iO || input.charAt(iN) == '#') {
                    h7.c(j6.d());
                }
                arrayList = arrayList2;
                i10 = iO;
            } else {
                i7 = iN + iSlashCount;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    iE = Dg.c.e(i7, input, iO, "@/\\?#");
                    if (iE != iO) {
                        bCharAt = input.charAt(iE);
                    } else {
                        bCharAt = b7;
                    }
                    if (bCharAt == b7) {
                        break;
                    } else {
                        break;
                    }
                }
                g7 = g11;
                arrayList = arrayList2;
                str3 = str5;
                i10 = iO;
                iPortColonOffset = g7.portColonOffset(input, i7, iE);
                i11 = iPortColonOffset + 1;
                if (i11 < iE) {
                    h7.f40572d = p059e1.a.b0(I.percentDecode$okhttp$default(J.f40577k, input, i7, iPortColonOffset, false, 4, null));
                    port = g7.parsePort(input, i11, iE);
                    h7.f40573e = port;
                    if (port != -1) {
                        StringBuilder sb6 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring4 = input.substring(i11, iE);
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, str3);
                        sb6.append(strSubstring4);
                        sb6.append('\"');
                        throw new IllegalArgumentException(sb6.toString().toString());
                    }
                } else {
                    I i16 = J.f40577k;
                    h7.f40572d = p059e1.a.b0(I.percentDecode$okhttp$default(i16, input, i7, iPortColonOffset, false, 4, null));
                    String str7 = h7.f40569a;
                    Intrinsics.e(str7);
                    h7.f40573e = i16.defaultPort(str7);
                }
                if (h7.f40572d != null) {
                    StringBuilder sb7 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring5 = input.substring(i7, iPortColonOffset);
                    Intrinsics.checkNotNullExpressionValue(strSubstring5, str3);
                    sb7.append(strSubstring5);
                    sb7.append('\"');
                    throw new IllegalArgumentException(sb7.toString().toString());
                }
                iN = iE;
            }
        }
        int i17 = i10;
        int iE2 = Dg.c.e(iN, input, i17, "?#");
        if (iN != iE2) {
            char cCharAt = input.charAt(iN);
            if (cCharAt == '/' || cCharAt == '\\') {
                ArrayList arrayList3 = arrayList;
                arrayList3.clear();
                arrayList3.add("");
                iN++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iN < iE2) {
                int iE3 = Dg.c.e(iN, input, iE2, "/\\");
                int i18 = iN;
                boolean z13 = iE3 < iE2;
                h7.g(str, i18, iE3, z13, true);
                H h10 = h7;
                input = str;
                iN = z13 ? iE3 + 1 : iE3;
                h7 = h10;
            }
        }
        H h11 = h7;
        if (iE2 >= i17 || input.charAt(iE2) != '?') {
            str4 = input;
        } else {
            int iF2 = Dg.c.f(input, '#', iE2, i17);
            I i19 = J.f40577k;
            str4 = str;
            h11.f40575g = i19.toQueryNamesAndValues$okhttp(I.canonicalize$okhttp$default(i19, str4, iE2 + 1, iF2, " \"'<>#", true, false, true, false, null, JfifUtil.MARKER_RST0, null));
            iE2 = iF2;
        }
        if (iE2 >= i17 || str4.charAt(iE2) != '#') {
            return;
        }
        h11.f40576h = I.canonicalize$okhttp$default(J.f40577k, str4, iE2 + 1, i17, "", true, false, false, true, null, 176, null);
    }

    public final void f(int i7) {
        if (1 > i7 || i7 >= 65536) {
            throw new IllegalArgumentException(C0.G.m(i7, "unexpected port: ").toString());
        }
        this.f40573e = i7;
    }

    public final void g(String str, int i7, int i10, boolean z3, boolean z8) {
        String strCanonicalize$okhttp$default = I.canonicalize$okhttp$default(J.f40577k, str, i7, i10, " \"<>^`{}|/\\?#", z8, false, false, false, null, 240, null);
        if (Intrinsics.c(strCanonicalize$okhttp$default, Consts.DOT) || kotlin.text.y.h(strCanonicalize$okhttp$default, "%2e", true)) {
            return;
        }
        boolean zC = Intrinsics.c(strCanonicalize$okhttp$default, "..");
        ArrayList arrayList = this.f40574f;
        if (zC || kotlin.text.y.h(strCanonicalize$okhttp$default, "%2e.", true) || kotlin.text.y.h(strCanonicalize$okhttp$default, ".%2e", true) || kotlin.text.y.h(strCanonicalize$okhttp$default, "%2e%2e", true)) {
            if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                arrayList.add("");
                return;
            } else {
                arrayList.set(arrayList.size() - 1, "");
                return;
            }
        }
        if (((CharSequence) q0.i(1, arrayList)).length() == 0) {
            arrayList.set(arrayList.size() - 1, strCanonicalize$okhttp$default);
        } else {
            arrayList.add(strCanonicalize$okhttp$default);
        }
        if (z3) {
            arrayList.add("");
        }
    }

    public final void h(String scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (kotlin.text.y.h(scheme, "http", true)) {
            this.f40569a = "http";
        } else {
            if (!kotlin.text.y.h(scheme, Constants.SCHEME, true)) {
                throw new IllegalArgumentException(C0.G.o("unexpected scheme: ", scheme));
            }
            this.f40569a = Constants.SCHEME;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f40569a;
        if (str != null) {
            sb2.append(str);
            sb2.append("://");
        } else {
            sb2.append("//");
        }
        if (this.f40570b.length() > 0 || this.f40571c.length() > 0) {
            sb2.append(this.f40570b);
            if (this.f40571c.length() > 0) {
                sb2.append(':');
                sb2.append(this.f40571c);
            }
            sb2.append('@');
        }
        String str2 = this.f40572d;
        if (str2 != null) {
            if (StringsKt.B(str2, ':')) {
                sb2.append('[');
                sb2.append(this.f40572d);
                sb2.append(']');
            } else {
                sb2.append(this.f40572d);
            }
        }
        int iDefaultPort = this.f40573e;
        if (iDefaultPort != -1 || this.f40569a != null) {
            if (iDefaultPort == -1) {
                I i7 = J.f40577k;
                String str3 = this.f40569a;
                Intrinsics.e(str3);
                iDefaultPort = i7.defaultPort(str3);
            }
            String str4 = this.f40569a;
            if (str4 == null || iDefaultPort != J.f40577k.defaultPort(str4)) {
                sb2.append(':');
                sb2.append(iDefaultPort);
            }
        }
        I i10 = J.f40577k;
        i10.toPathString$okhttp(this.f40574f, sb2);
        if (this.f40575g != null) {
            sb2.append('?');
            List<String> list = this.f40575g;
            Intrinsics.e(list);
            i10.toQueryString$okhttp(list, sb2);
        }
        if (this.f40576h != null) {
            sb2.append('#');
            sb2.append(this.f40576h);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
