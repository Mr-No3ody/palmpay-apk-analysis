package C0;

import N8.q0;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f926q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f927r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p355xf.t f940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f943p;

    static {
        new A(null);
        f926q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
        f927r = Pattern.compile("\\{(.+?)\\}");
    }

    public F(String str, String str2, String mimeType) {
        List listU;
        this.f928a = str;
        this.f929b = str2;
        this.f930c = mimeType;
        ArrayList arrayList = new ArrayList();
        this.f931d = arrayList;
        this.f933f = C2131j.b(new D(this, 6));
        this.f934g = C2131j.b(new D(this, 4));
        EnumC2132k enumC2132k = EnumC2132k.f43971c;
        this.f935h = C2131j.a(enumC2132k, new D(this, 7));
        this.f937j = C2131j.a(enumC2132k, new D(this, 1));
        this.f938k = C2131j.a(enumC2132k, new D(this, 0));
        this.f939l = C2131j.a(enumC2132k, new D(this, 3));
        this.f940m = C2131j.b(new D(this, 2));
        this.f942o = C2131j.b(new D(this, 5));
        if (str != null) {
            StringBuilder sb2 = new StringBuilder("^");
            if (!f926q.matcher(str).find()) {
                sb2.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            String strSubstring = str.substring(0, matcher.start());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            a(strSubstring, arrayList, sb2);
            this.f943p = (StringsKt.A(sb2, ".*", false) || StringsKt.A(sb2, "([^/]+?)", false)) ? false : true;
            sb2.append("($|(\\?(.)*)|(\\#(.)*))");
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "uriRegex.toString()");
            this.f932e = kotlin.text.y.k(string, ".*", "\\E.*\\Q");
        }
        if (mimeType == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(mimeType).matches()) {
            throw new IllegalArgumentException(q0.k("The given mimeType ", mimeType, " does not match to required \"type/subtype\" format").toString());
        }
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        List listC = new Regex("/").c(mimeType);
        if (listC.isEmpty()) {
            listU = kotlin.collections.z.f38935a;
        } else {
            ListIterator listIterator = listC.listIterator(listC.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listU = CollectionsKt.U(listC, listIterator.nextIndex() + 1);
                }
            }
            listU = kotlin.collections.z.f38935a;
        }
        this.f941n = kotlin.text.y.k(G.q("^(", (String) listU.get(0), "|[*]+)/(", (String) listU.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb2) {
        Matcher matcher = f927r.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            Intrinsics.f(strGroup, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(Pattern.quote(strSubstring));
            }
            sb2.append("([^/]+?)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb2.append(Pattern.quote(strSubstring2));
        }
    }

    public static void d(Bundle bundle, String key, String value, C0114f c0114f) {
        if (c0114f == null) {
            bundle.putString(key, value);
            return;
        }
        d0 d0Var = c0114f.f1038a;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        d0Var.e(bundle, key, d0Var.c(value));
    }

    public final boolean b(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f931d;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(arrayList, 10));
        int i7 = 0;
        for (Object obj : arrayList) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i10));
            C0114f c0114f = (C0114f) linkedHashMap.get(str);
            try {
                Intrinsics.checkNotNullExpressionValue(value, "value");
                d(bundle, str, value, c0114f);
                arrayList2.add(Unit.f38893a);
                i7 = i10;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean c(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        String query;
        F f10 = this;
        for (Map.Entry entry : ((Map) f10.f935h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            C c6 = (C) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (f10.f936i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = C1849p.c(query);
            }
            if (queryParameters != null) {
                for (String str2 : queryParameters) {
                    String str3 = c6.f920a;
                    Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                    int i7 = 0;
                    if (matcher == null || !matcher.matches()) {
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    try {
                        ArrayList arrayList = c6.f921b;
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(arrayList, 10));
                        for (Object obj : arrayList) {
                            int i10 = i7 + 1;
                            if (i7 < 0) {
                                C1850q.k();
                                throw null;
                            }
                            String key = (String) obj;
                            String strGroup = matcher.group(i10);
                            if (strGroup == null) {
                                strGroup = "";
                            } else {
                                Intrinsics.checkNotNullExpressionValue(strGroup, "argMatcher.group(index + 1) ?: \"\"");
                            }
                            try {
                                C0114f c0114f = (C0114f) linkedHashMap.get(key);
                                if (!bundle.containsKey(key)) {
                                    if (!strGroup.equals('{' + key + '}')) {
                                        d(bundle2, key, strGroup, c0114f);
                                    }
                                } else if (c0114f != null) {
                                    d0 d0Var = c0114f.f1038a;
                                    Object objA = d0Var.a(bundle, key);
                                    Intrinsics.checkNotNullParameter(bundle, "bundle");
                                    Intrinsics.checkNotNullParameter(key, "key");
                                    if (!bundle.containsKey(key)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    d0Var.e(bundle, key, d0Var.d(strGroup, objA));
                                } else {
                                    continue;
                                }
                                arrayList2.add(Unit.f38893a);
                                i7 = i10;
                            } catch (IllegalArgumentException unused) {
                                continue;
                            }
                        }
                        bundle.putAll(bundle2);
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
            f10 = this;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof F)) {
            F f10 = (F) obj;
            if (Intrinsics.c(this.f928a, f10.f928a) && Intrinsics.c(this.f929b, f10.f929b) && Intrinsics.c(this.f930c, f10.f930c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f928a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f929b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f930c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
