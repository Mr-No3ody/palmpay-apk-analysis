package okhttp3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.EnumC2125d;

/* JADX INFO: loaded from: classes4.dex */
public final class K {
    public /* synthetic */ K(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
    @JvmName(name = "-deprecated_get")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
    public final L m134deprecated_get(@NotNull String mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return get(mediaType);
    }

    @Deprecated(level = EnumC2125d.f43963b, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
    @JvmName(name = "-deprecated_parse")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
    public final L m135deprecated_parse(@NotNull String mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return parse(mediaType);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    public final L get(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Matcher matcher = L.f40590f.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(C0.G.l('\"', "No subtype found for: \"", str).toString());
        }
        String strGroup = matcher.group(1);
        Intrinsics.checkNotNullExpressionValue(strGroup, "typeSubtype.group(1)");
        Locale US = Locale.US;
        String strQ = androidx.camera.video.u.q(US, "US", strGroup, US, "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        Intrinsics.checkNotNullExpressionValue(strGroup2, "typeSubtype.group(2)");
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strGroup2.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = L.f40591g.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                sb2.append("\" for: \"");
                throw new IllegalArgumentException(androidx.camera.video.u.p(sb2, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (kotlin.text.y.m(strGroup4, "'", false) && kotlin.text.y.g(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new L(str, strQ, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }

    @JvmStatic
    @JvmName(name = "parse")
    @Nullable
    public final L parse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return get(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private K() {
    }
}
