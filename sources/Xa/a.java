package Xa;

import N8.q0;
import android.net.Uri;
import com.adjust.sdk.Constants;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f11061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f11062b;

    static {
        Pattern patternCompile = Pattern.compile("<script[^>]+src\\s*=\\s*[\"']([^\"']+)[\"']", 2);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        f11061a = patternCompile;
        Pattern patternCompile2 = Pattern.compile("<link[^>]+href\\s*=\\s*[\"']([^\"']+)[\"']", 2);
        Intrinsics.checkNotNullExpressionValue(patternCompile2, "compile(...)");
        f11062b = patternCompile2;
    }

    public static String a(String str, String missingDelimiterValue) {
        if (StringsKt.F(str)) {
            return null;
        }
        if (y.m(str, "http://", false) || y.m(str, "https://", false)) {
            return str;
        }
        if (y.m(str, "//", false)) {
            String scheme = Uri.parse(missingDelimiterValue).getScheme();
            if (scheme == null) {
                scheme = Constants.SCHEME;
            }
            return q0.y(scheme, ":", str);
        }
        if (y.m(str, "/", false)) {
            Uri uri = Uri.parse(missingDelimiterValue);
            return q0.l(uri.getScheme(), "://", uri.getHost(), str);
        }
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iH = StringsKt.H(missingDelimiterValue, '/', 0, 6);
        if (iH != -1) {
            missingDelimiterValue = missingDelimiterValue.substring(0, iH);
            Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "substring(...)");
        }
        return q0.y(missingDelimiterValue, "/", str);
    }
}
