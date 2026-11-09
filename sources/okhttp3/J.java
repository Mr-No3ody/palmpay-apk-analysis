package okhttp3;

import com.adjust.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class J {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final I f40577k = new I(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f40578l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f40581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f40583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f40584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f40585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f40586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f40587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f40588j;

    public J(String scheme, String username, String password, String host, int i7, ArrayList pathSegments, ArrayList arrayList, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f40579a = scheme;
        this.f40580b = username;
        this.f40581c = password;
        this.f40582d = host;
        this.f40583e = i7;
        this.f40584f = pathSegments;
        this.f40585g = arrayList;
        this.f40586h = str;
        this.f40587i = url;
        this.f40588j = Intrinsics.c(scheme, Constants.SCHEME);
    }

    public final String a() {
        if (this.f40581c.length() == 0) {
            return "";
        }
        int length = this.f40579a.length() + 3;
        String str = this.f40587i;
        String strSubstring = str.substring(StringsKt.D(str, ':', length, 4) + 1, StringsKt.D(str, '@', 0, 6));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f40579a.length() + 3;
        String str = this.f40587i;
        int iD = StringsKt.D(str, '/', length, 4);
        String strSubstring = str.substring(iD, Dg.c.e(iD, str, str.length(), "?#"));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f40579a.length() + 3;
        String str = this.f40587i;
        int iD = StringsKt.D(str, '/', length, 4);
        int iE = Dg.c.e(iD, str, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iD < iE) {
            int i7 = iD + 1;
            int iF = Dg.c.f(str, '/', i7, iE);
            String strSubstring = str.substring(i7, iF);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iD = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f40585g == null) {
            return null;
        }
        String str = this.f40587i;
        int iD = StringsKt.D(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iD, Dg.c.f(str, '#', iD, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f40580b.length() == 0) {
            return "";
        }
        int length = this.f40579a.length() + 3;
        String str = this.f40587i;
        String strSubstring = str.substring(length, Dg.c.e(length, str, str.length(), ":@"));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof J) && Intrinsics.c(((J) obj).f40587i, this.f40587i);
    }

    public final H f() {
        String strSubstring;
        H h7 = new H();
        String str = this.f40579a;
        h7.f40569a = str;
        String strE = e();
        Intrinsics.checkNotNullParameter(strE, "<set-?>");
        h7.f40570b = strE;
        String strA = a();
        Intrinsics.checkNotNullParameter(strA, "<set-?>");
        h7.f40571c = strA;
        h7.f40572d = this.f40582d;
        int iDefaultPort = f40577k.defaultPort(str);
        int i7 = this.f40583e;
        if (i7 == iDefaultPort) {
            i7 = -1;
        }
        h7.f40573e = i7;
        ArrayList arrayList = h7.f40574f;
        arrayList.clear();
        arrayList.addAll(c());
        h7.c(d());
        if (this.f40586h == null) {
            strSubstring = null;
        } else {
            String str2 = this.f40587i;
            strSubstring = str2.substring(StringsKt.D(str2, '#', 0, 6) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        h7.f40576h = strSubstring;
        return h7;
    }

    public final H g(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            H h7 = new H();
            h7.e(this, link);
            return h7;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String h(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ArrayList arrayList = this.f40585g;
        if (arrayList == null) {
            return null;
        }
        kotlin.ranges.a aVarE = kotlin.ranges.b.e(kotlin.ranges.b.f(0, arrayList.size()), 2);
        int i7 = aVarE.f38977a;
        int i10 = aVarE.f38978b;
        int i11 = aVarE.f38979c;
        if ((i11 <= 0 || i7 > i10) && (i11 >= 0 || i10 > i7)) {
            return null;
        }
        while (!Intrinsics.c(name, arrayList.get(i7))) {
            if (i7 == i10) {
                return null;
            }
            i7 += i11;
        }
        return (String) arrayList.get(i7 + 1);
    }

    public final int hashCode() {
        return this.f40587i.hashCode();
    }

    public final String i() {
        H hG = g("/...");
        Intrinsics.e(hG);
        Intrinsics.checkNotNullParameter("", "username");
        I i7 = f40577k;
        hG.f40570b = I.canonicalize$okhttp$default(i7, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
        Intrinsics.checkNotNullParameter("", "password");
        hG.f40571c = I.canonicalize$okhttp$default(i7, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
        return hG.b().f40587i;
    }

    public final J j(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        H hG = g(link);
        if (hG != null) {
            return hG.b();
        }
        return null;
    }

    public final URI k() {
        H hF = f();
        String str = hF.f40572d;
        hF.f40572d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        ArrayList arrayList = hF.f40574f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.set(i7, I.canonicalize$okhttp$default(f40577k, (String) arrayList.get(i7), 0, 0, "[]", true, true, false, false, null, 227, null));
        }
        List list = hF.f40575g;
        if (list != null) {
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String str2 = (String) list.get(i10);
                list.set(i10, str2 != null ? I.canonicalize$okhttp$default(f40577k, str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
            }
        }
        String str3 = hF.f40576h;
        hF.f40576h = str3 != null ? I.canonicalize$okhttp$default(f40577k, str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null;
        String string = hF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL l() {
        try {
            return new URL(this.f40587i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String toString() {
        return this.f40587i;
    }
}
