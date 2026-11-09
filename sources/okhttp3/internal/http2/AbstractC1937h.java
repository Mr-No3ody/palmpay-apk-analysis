package okhttp3.internal.http2;

import com.adjust.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: okhttp3.internal.http2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1937h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1934e[] f40836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f40837b;

    static {
        C1934e c1934e = new C1934e(C1934e.f40817i, "");
        Pg.m mVar = C1934e.f40814f;
        C1934e c1934e2 = new C1934e(mVar, "GET");
        C1934e c1934e3 = new C1934e(mVar, "POST");
        Pg.m mVar2 = C1934e.f40815g;
        C1934e c1934e4 = new C1934e(mVar2, "/");
        C1934e c1934e5 = new C1934e(mVar2, "/index.html");
        Pg.m mVar3 = C1934e.f40816h;
        C1934e c1934e6 = new C1934e(mVar3, "http");
        C1934e c1934e7 = new C1934e(mVar3, Constants.SCHEME);
        Pg.m mVar4 = C1934e.f40813e;
        C1934e[] c1934eArr = {c1934e, c1934e2, c1934e3, c1934e4, c1934e5, c1934e6, c1934e7, new C1934e(mVar4, "200"), new C1934e(mVar4, "204"), new C1934e(mVar4, "206"), new C1934e(mVar4, "304"), new C1934e(mVar4, "400"), new C1934e(mVar4, "404"), new C1934e(mVar4, "500"), new C1934e("accept-charset", ""), new C1934e("accept-encoding", "gzip, deflate"), new C1934e("accept-language", ""), new C1934e("accept-ranges", ""), new C1934e("accept", ""), new C1934e("access-control-allow-origin", ""), new C1934e("age", ""), new C1934e("allow", ""), new C1934e("authorization", ""), new C1934e("cache-control", ""), new C1934e("content-disposition", ""), new C1934e("content-encoding", ""), new C1934e("content-language", ""), new C1934e("content-length", ""), new C1934e("content-location", ""), new C1934e("content-range", ""), new C1934e("content-type", ""), new C1934e("cookie", ""), new C1934e("date", ""), new C1934e("etag", ""), new C1934e("expect", ""), new C1934e("expires", ""), new C1934e(com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, ""), new C1934e("host", ""), new C1934e("if-match", ""), new C1934e("if-modified-since", ""), new C1934e("if-none-match", ""), new C1934e("if-range", ""), new C1934e("if-unmodified-since", ""), new C1934e("last-modified", ""), new C1934e("link", ""), new C1934e(FirebaseAnalytics.Param.LOCATION, ""), new C1934e("max-forwards", ""), new C1934e("proxy-authenticate", ""), new C1934e("proxy-authorization", ""), new C1934e("range", ""), new C1934e("referer", ""), new C1934e("refresh", ""), new C1934e("retry-after", ""), new C1934e("server", ""), new C1934e("set-cookie", ""), new C1934e("strict-transport-security", ""), new C1934e("transfer-encoding", ""), new C1934e("user-agent", ""), new C1934e("vary", ""), new C1934e("via", ""), new C1934e("www-authenticate", "")};
        f40836a = c1934eArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i7 = 0; i7 < 61; i7++) {
            if (!linkedHashMap.containsKey(c1934eArr[i7].f40818a)) {
                linkedHashMap.put(c1934eArr[i7].f40818a, Integer.valueOf(i7));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        f40837b = mapUnmodifiableMap;
    }

    public static void a(Pg.m name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int iD = name.d();
        for (int i7 = 0; i7 < iD; i7++) {
            byte bG = name.g(i7);
            if (65 <= bG && bG < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.l()));
            }
        }
    }
}
