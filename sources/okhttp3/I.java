package okhttp3;

import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
public final class I {
    public /* synthetic */ I(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String canonicalize$okhttp$default(I i7, String str, int i10, int i11, String str2, boolean z3, boolean z8, boolean z10, boolean z11, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z3 = false;
        }
        if ((i12 & 16) != 0) {
            z8 = false;
        }
        if ((i12 & 32) != 0) {
            z10 = false;
        }
        if ((i12 & 64) != 0) {
            z11 = false;
        }
        if ((i12 & 128) != 0) {
            charset = null;
        }
        return i7.canonicalize$okhttp(str, i10, i11, str2, z3, z8, z10, z11, charset);
    }

    private final boolean isPercentEncoded(String str, int i7, int i10) {
        int i11 = i7 + 2;
        return i11 < i10 && str.charAt(i7) == '%' && Dg.c.r(str.charAt(i7 + 1)) != -1 && Dg.c.r(str.charAt(i11)) != -1;
    }

    public static /* synthetic */ String percentDecode$okhttp$default(I i7, String str, int i10, int i11, boolean z3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z3 = false;
        }
        return i7.percentDecode$okhttp(str, i10, i11, z3);
    }

    private final void writeCanonicalized(Pg.k kVar, String str, int i7, int i10, String str2, boolean z3, boolean z8, boolean z10, boolean z11, Charset charset) {
        Pg.k kVar2 = null;
        while (i7 < i10) {
            int iCodePointAt = str.codePointAt(i7);
            if (!z3 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z10) {
                    kVar.v(z3 ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z11) || StringsKt.B(str2, (char) iCodePointAt) || (iCodePointAt == 37 && (!z3 || (z8 && !isPercentEncoded(str, i7, i10)))))) {
                    if (kVar2 == null) {
                        kVar2 = new Pg.k();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        kVar2.w(iCodePointAt);
                    } else {
                        kVar2.s(str, i7, Character.charCount(iCodePointAt) + i7, charset);
                    }
                    while (!kVar2.exhausted()) {
                        byte b7 = kVar2.readByte();
                        int i11 = b7 & UnsignedBytes.MAX_VALUE;
                        kVar.m(37);
                        char[] cArr = J.f40578l;
                        kVar.m(cArr[(i11 >> 4) & 15]);
                        kVar.m(cArr[b7 & Ascii.SI]);
                    }
                } else {
                    kVar.w(iCodePointAt);
                }
            }
            i7 += Character.charCount(iCodePointAt);
        }
    }

    private final void writePercentDecoded(Pg.k kVar, String str, int i7, int i10, boolean z3) {
        int i11;
        while (i7 < i10) {
            int iCodePointAt = str.codePointAt(i7);
            if (iCodePointAt == 37 && (i11 = i7 + 2) < i10) {
                int iR = Dg.c.r(str.charAt(i7 + 1));
                int iR2 = Dg.c.r(str.charAt(i11));
                if (iR == -1 || iR2 == -1) {
                    kVar.w(iCodePointAt);
                    i7 += Character.charCount(iCodePointAt);
                } else {
                    kVar.m((iR << 4) + iR2);
                    i7 = Character.charCount(iCodePointAt) + i11;
                }
            } else if (iCodePointAt == 43 && z3) {
                kVar.m(32);
                i7++;
            } else {
                kVar.w(iCodePointAt);
                i7 += Character.charCount(iCodePointAt);
            }
        }
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
    @JvmName(name = "-deprecated_get")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
    public final J m130deprecated_get(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return get(url);
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
    @JvmName(name = "-deprecated_parse")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
    public final J m133deprecated_parse(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return parse(url);
    }

    @NotNull
    public final String canonicalize$okhttp(@NotNull String str, int i7, int i10, @NotNull String encodeSet, boolean z3, boolean z8, boolean z10, boolean z11, @Nullable Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int iCharCount = i7;
        while (iCharCount < i10) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z11) || StringsKt.B(encodeSet, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z3 || (z8 && !isPercentEncoded(str, iCharCount, i10)))) || (iCodePointAt == 43 && z10)))) {
                Pg.k kVar = new Pg.k();
                kVar.u(i7, iCharCount, str);
                writeCanonicalized(kVar, str, iCharCount, i10, encodeSet, z3, z8, z10, z11, charset);
                return kVar.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i7, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmStatic
    public final int defaultPort(@NotNull String scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (Intrinsics.c(scheme, "http")) {
            return 80;
        }
        return Intrinsics.c(scheme, Constants.SCHEME) ? 443 : -1;
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    public final J get(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        H h7 = new H();
        h7.e(null, str);
        return h7.b();
    }

    @JvmStatic
    @JvmName(name = "parse")
    @Nullable
    public final J parse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @NotNull
    public final String percentDecode$okhttp(@NotNull String str, int i7, int i10, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        for (int i11 = i7; i11 < i10; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '%' || (cCharAt == '+' && z3)) {
                Pg.k kVar = new Pg.k();
                kVar.u(i7, i11, str);
                writePercentDecoded(kVar, str, i11, i10, z3);
                return kVar.readUtf8();
            }
        }
        String strSubstring = str.substring(i7, i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final void toPathString$okhttp(@NotNull List<String> list, @NotNull StringBuilder out) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            out.append('/');
            out.append(list.get(i7));
        }
    }

    @NotNull
    public final List<String> toQueryNamesAndValues$okhttp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (i7 <= str.length()) {
            int iD = StringsKt.D(str, '&', i7, 4);
            if (iD == -1) {
                iD = str.length();
            }
            int iD2 = StringsKt.D(str, '=', i7, 4);
            if (iD2 == -1 || iD2 > iD) {
                String strSubstring = str.substring(i7, iD);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i7, iD2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iD2 + 1, iD);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i7 = iD + 1;
        }
        return arrayList;
    }

    public final void toQueryString$okhttp(@NotNull List<String> list, @NotNull StringBuilder out) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        kotlin.ranges.a aVarE = kotlin.ranges.b.e(kotlin.ranges.b.f(0, list.size()), 2);
        int i7 = aVarE.f38977a;
        int i10 = aVarE.f38978b;
        int i11 = aVarE.f38979c;
        if ((i11 <= 0 || i7 > i10) && (i11 >= 0 || i10 > i7)) {
            return;
        }
        while (true) {
            String str = list.get(i7);
            String str2 = list.get(i7 + 1);
            if (i7 > 0) {
                out.append('&');
            }
            out.append(str);
            if (str2 != null) {
                out.append('=');
                out.append(str2);
            }
            if (i7 == i10) {
                return;
            } else {
                i7 += i11;
            }
        }
    }

    private I() {
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
    @JvmName(name = "-deprecated_get")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
    public final J m132deprecated_get(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return get(url);
    }

    @JvmStatic
    @JvmName(name = "get")
    @Nullable
    public final J get(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return parse(string);
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
    @JvmName(name = "-deprecated_get")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
    public final J m131deprecated_get(@NotNull URI uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return get(uri);
    }

    @JvmStatic
    @JvmName(name = "get")
    @Nullable
    public final J get(@NotNull URI uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString()");
        return parse(string);
    }
}
