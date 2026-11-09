package okhttp3;

import com.alibaba.android.arouter.utils.Consts;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: okhttp3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1950s {
    public /* synthetic */ C1950s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int dateCharacterOffset(String str, int i7, int i10, boolean z3) {
        while (i7 < i10) {
            char cCharAt = str.charAt(i7);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z3)) {
                return i7;
            }
            i7++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean domainMatch(String str, String str2) {
        if (!Intrinsics.c(str, str2)) {
            if (kotlin.text.y.g(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.') {
                byte[] bArr = Dg.c.f1879a;
                Intrinsics.checkNotNullParameter(str, "<this>");
                if (!Dg.c.f1884f.b(str)) {
                }
            }
            return false;
        }
        return true;
    }

    private final String parseDomain(String str) {
        if (kotlin.text.y.g(str, Consts.DOT, false)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String strB0 = p059e1.a.b0(StringsKt.I(str, Consts.DOT));
        if (strB0 != null) {
            return strB0;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a9  */
    private final long parseExpires(String str, int i7, int i10) {
        int iDateCharacterOffset = dateCharacterOffset(str, i7, i10, false);
        Matcher matcher = C1951t.f40981n.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int iE = -1;
        int i14 = -1;
        int i15 = -1;
        while (iDateCharacterOffset < i10) {
            int iDateCharacterOffset2 = dateCharacterOffset(str, iDateCharacterOffset + 1, i10, true);
            matcher.region(iDateCharacterOffset, iDateCharacterOffset2);
            if (i12 == -1 && matcher.usePattern(C1951t.f40981n).matches()) {
                String strGroup = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(strGroup, "matcher.group(1)");
                i12 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                Intrinsics.checkNotNullExpressionValue(strGroup2, "matcher.group(2)");
                i14 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                Intrinsics.checkNotNullExpressionValue(strGroup3, "matcher.group(3)");
                i15 = Integer.parseInt(strGroup3);
            } else if (i13 == -1 && matcher.usePattern(C1951t.f40980m).matches()) {
                String strGroup4 = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(strGroup4, "matcher.group(1)");
                i13 = Integer.parseInt(strGroup4);
            } else if (iE == -1) {
                Pattern pattern = C1951t.f40979l;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    String strQ = androidx.camera.video.u.q(locale, "US", strGroup5, locale, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    Intrinsics.checkNotNullExpressionValue(strPattern, "MONTH_PATTERN.pattern()");
                    iE = StringsKt.E(strPattern, strQ, 0, false, 6) / 4;
                } else if (i11 != -1 && matcher.usePattern(C1951t.f40978k).matches()) {
                    String strGroup6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(strGroup6, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup6);
                }
            } else if (i11 != -1) {
            }
            iDateCharacterOffset = dateCharacterOffset(str, iDateCharacterOffset2 + 1, i10, false);
        }
        if (70 <= i11 && i11 < 100) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 < 70) {
            i11 += Constants.MAX_URL_LENGTH;
        }
        if (i11 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iE == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i13 || i13 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0 || i12 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i15 < 0 || i15 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Dg.c.f1883e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i11);
        gregorianCalendar.set(2, iE - 1);
        gregorianCalendar.set(5, i13);
        gregorianCalendar.set(11, i12);
        gregorianCalendar.set(12, i14);
        gregorianCalendar.set(13, i15);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    private final long parseMaxAge(String str) {
        try {
            long j6 = Long.parseLong(str);
            if (j6 <= 0) {
                return Long.MIN_VALUE;
            }
            return j6;
        } catch (NumberFormatException e10) {
            if (new Regex("-?\\d+").b(str)) {
                return kotlin.text.y.m(str, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean pathMatch(J j6, String str) {
        String strB = j6.b();
        if (Intrinsics.c(strB, str)) {
            return true;
        }
        return kotlin.text.y.m(strB, str, false) && (kotlin.text.y.g(str, "/", false) || strB.charAt(str.length()) == '/');
    }

    @JvmStatic
    @Nullable
    public final C1951t parse(@NotNull J url, @NotNull String setCookie) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(setCookie, "setCookie");
        return parse$okhttp(System.currentTimeMillis(), url, setCookie);
    }

    @Nullable
    public final C1951t parse$okhttp(long j6, @NotNull J url, @NotNull String setCookie) {
        long j10;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(setCookie, "setCookie");
        char c6 = ';';
        int iG = Dg.c.g(setCookie, ';', 0, 0, 6);
        char c10 = '=';
        int iG2 = Dg.c.g(setCookie, '=', 0, iG, 2);
        if (iG2 != iG) {
            String strA = Dg.c.A(0, iG2, setCookie);
            if (strA.length() != 0 && Dg.c.m(strA) == -1) {
                String strA2 = Dg.c.A(iG2 + 1, iG, setCookie);
                if (Dg.c.m(strA2) == -1) {
                    int i7 = iG + 1;
                    int length = setCookie.length();
                    boolean z3 = false;
                    boolean z8 = false;
                    boolean z10 = false;
                    boolean z11 = true;
                    String domain = null;
                    String str = null;
                    long maxAge = -1;
                    long expires = 253402300799999L;
                    while (i7 < length) {
                        int iF = Dg.c.f(setCookie, c6, i7, length);
                        int iF2 = Dg.c.f(setCookie, c10, i7, iF);
                        String strA3 = Dg.c.A(i7, iF2, setCookie);
                        String strA4 = iF2 < iF ? Dg.c.A(iF2 + 1, iF, setCookie) : "";
                        if (kotlin.text.y.h(strA3, "expires", true)) {
                            try {
                                expires = parseExpires(strA4, 0, strA4.length());
                                z8 = true;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (kotlin.text.y.h(strA3, "max-age", true)) {
                            maxAge = parseMaxAge(strA4);
                            z8 = true;
                        } else if (kotlin.text.y.h(strA3, "domain", true)) {
                            domain = parseDomain(strA4);
                            z11 = false;
                        } else if (kotlin.text.y.h(strA3, "path", true)) {
                            str = strA4;
                        } else if (kotlin.text.y.h(strA3, "secure", true)) {
                            z10 = true;
                        } else if (kotlin.text.y.h(strA3, "httponly", true)) {
                            z3 = true;
                        }
                        i7 = iF + 1;
                        c6 = ';';
                        c10 = '=';
                    }
                    if (maxAge == Long.MIN_VALUE) {
                        j10 = Long.MIN_VALUE;
                    } else if (maxAge != -1) {
                        long j11 = j6 + (maxAge <= 9223372036854775L ? maxAge * ((long) 1000) : Long.MAX_VALUE);
                        j10 = (j11 < j6 || j11 > 253402300799999L) ? 253402300799999L : j11;
                    } else {
                        j10 = expires;
                    }
                    String str2 = url.f40582d;
                    if (domain == null) {
                        domain = str2;
                    } else if (!domainMatch(str2, domain)) {
                        return null;
                    }
                    if (str2.length() != domain.length() && PublicSuffixDatabase.f40915e.get().a(domain) == null) {
                        return null;
                    }
                    if (str == null || !kotlin.text.y.m(str, "/", false)) {
                        String strB = url.b();
                        int iH = StringsKt.H(strB, '/', 0, 6);
                        if (iH != 0) {
                            String strSubstring = strB.substring(0, iH);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            str = strSubstring;
                        } else {
                            str = "/";
                        }
                    }
                    return new C1951t(strA, strA2, j10, domain, str, z10, z3, z8, z11);
                }
            }
        }
        return null;
    }

    @JvmStatic
    @NotNull
    public final List<C1951t> parseAll(@NotNull J url, @NotNull F headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        List listG = headers.g(HttpHeaders.SET_COOKIE);
        int size = listG.size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            C1951t c1951t = parse(url, (String) listG.get(i7));
            if (c1951t != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c1951t);
            }
        }
        if (arrayList == null) {
            return kotlin.collections.z.f38935a;
        }
        List<C1951t> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        return listUnmodifiableList;
    }

    private C1950s() {
    }
}
