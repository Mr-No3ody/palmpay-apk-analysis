package com.palmpay.lib.webview.cache.util;

import N8.q0;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.adjust.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\r\u001a\u00020\u0005*\u00020\u000eJ\n\u0010\r\u001a\u00020\u0005*\u00020\u0005J\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0005J\f\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\u0012*\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eJ2\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015*\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0016\u0018\u00010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/palmpay/lib/webview/cache/util/UrlHelper;", "", "<init>", "()V", "METHOD_GET", "", "METHOD_POST", "METHOD_PUT", "METHOD_DELETE", "METHOD_HEAD", "METHOD_PATCH", "METHOD_OPTIONS", "METHOD_TRACE", "urlToKey", "Landroid/net/Uri;", "safeUrlPart", "getFileNameFromUrl", "matchHostPath", "", "other", "convertHeader", "", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUrlHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlHelper.kt\ncom/palmpay/lib/webview/cache/util/UrlHelper\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,102:1\n384#2,4:103\n215#3,2:107\n*S KotlinDebug\n*F\n+ 1 UrlHelper.kt\ncom/palmpay/lib/webview/cache/util/UrlHelper\n*L\n53#1:103,4\n86#1:107,2\n*E\n"})
public final class UrlHelper {

    @NotNull
    public static final UrlHelper INSTANCE = new UrlHelper();

    @NotNull
    public static final String METHOD_DELETE = "DELETE";

    @NotNull
    public static final String METHOD_GET = "GET";

    @NotNull
    public static final String METHOD_HEAD = "HEAD";

    @NotNull
    public static final String METHOD_OPTIONS = "OPTIONS";

    @NotNull
    public static final String METHOD_PATCH = "PATCH";

    @NotNull
    public static final String METHOD_POST = "POST";

    @NotNull
    public static final String METHOD_PUT = "PUT";

    @NotNull
    public static final String METHOD_TRACE = "TRACE";

    private UrlHelper() {
    }

    @Nullable
    public final Map<String, String> convertHeader(@Nullable Map<String, ? extends List<String>> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            for (String str : value) {
                if (str != null) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str);
                }
            }
            map2.put(entry.getKey(), sb2.toString());
        }
        return map2;
    }

    @Nullable
    public final String getFileNameFromUrl(@NotNull String str) {
        int iG;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (y.g(str, "/", false) || (iG = StringsKt.G(str, 6, "/")) == -1) {
            return null;
        }
        String strSubstring = str.substring(iG + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final boolean matchHostPath(@Nullable Uri uri, @Nullable Uri uri2) {
        if (y.h(safeUrlPart(uri != null ? uri.getHost() : null), safeUrlPart(uri2 != null ? uri2.getHost() : null), true)) {
            if (y.h(safeUrlPart(uri != null ? uri.getPath() : null), safeUrlPart(uri2 != null ? uri2.getPath() : null), false)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final String safeUrlPart(@Nullable String str) {
        String strSubstring;
        CharSequence charSequenceSubSequence;
        if (str != null) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            int length = str.length();
            int i7 = 0;
            while (true) {
                strSubstring = "";
                if (i7 >= length) {
                    charSequenceSubSequence = "";
                    break;
                }
                if (!CharsKt.b(str.charAt(i7))) {
                    charSequenceSubSequence = str.subSequence(i7, str.length());
                    break;
                }
                i7++;
            }
            String string = charSequenceSubSequence.toString();
            if (string != null) {
                for (int iC = StringsKt.C(string); -1 < iC; iC--) {
                    char cCharAt = string.charAt(iC);
                    if (cCharAt != ' ' && cCharAt != '/') {
                        strSubstring = string.substring(0, iC + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        break;
                    }
                }
                if (strSubstring != null) {
                    return strSubstring;
                }
            }
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0041  */
    @NotNull
    public final String urlToKey(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String scheme = uri.getScheme();
        String strSafeUrlPart = safeUrlPart(uri.getHost());
        if ((!Constants.SCHEME.equalsIgnoreCase(scheme) && !"http".equalsIgnoreCase(scheme)) || TextUtils.isEmpty(strSafeUrlPart)) {
            String string = uri.toString();
            Intrinsics.e(string);
            return string;
        }
        String strSafeUrlPart2 = safeUrlPart(uri.getPath());
        if (strSafeUrlPart2 == null) {
            strSafeUrlPart2 = "";
        } else {
            if (!y.m(strSafeUrlPart2, "/", false)) {
                strSafeUrlPart2 = "/".concat(strSafeUrlPart2);
            }
            if (strSafeUrlPart2 == null) {
                strSafeUrlPart2 = "";
            }
        }
        return q0.j(strSafeUrlPart, strSafeUrlPart2);
    }

    @NotNull
    public final String urlToKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Uri uri = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            return urlToKey(uri);
        } catch (Exception unused) {
            return str;
        }
    }
}
