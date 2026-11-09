package p226og;

import Xe.d;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f40542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeZone f40543b = TimeZone.getTimeZone("GMT");

    public static long a(d dVar) {
        long j6;
        long j10;
        long j11;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jX = dVar.x(HttpHeaders.DATE);
        long jX2 = dVar.x(HttpHeaders.EXPIRES);
        List listI = dVar.i(HttpHeaders.CACHE_CONTROL);
        if (listI == null) {
            listI = dVar.i(HttpHeaders.PRAGMA);
        }
        if (listI == null) {
            listI = new ArrayList();
        }
        String strJoin = TextUtils.join(",", listI);
        if (!TextUtils.isEmpty(strJoin)) {
            StringTokenizer stringTokenizer = new StringTokenizer(strJoin, ",");
            j6 = 0;
            j10 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String lowerCase = stringTokenizer.nextToken().trim().toLowerCase(Locale.getDefault());
                if (!lowerCase.equals("no-cache") && !lowerCase.equals("no-store")) {
                    if (lowerCase.startsWith("max-age=")) {
                        j6 = Long.parseLong(lowerCase.substring(8));
                    } else if (!lowerCase.startsWith("must-revalidate")) {
                        if (lowerCase.startsWith("stale-while-revalidate=")) {
                            j10 = Long.parseLong(lowerCase.substring(23));
                        }
                    }
                }
                return 0L;
            }
        }
        j6 = 0;
        j10 = 0;
        if (TextUtils.isEmpty(strJoin)) {
            j11 = jCurrentTimeMillis;
        } else {
            j11 = (j6 * 1000) + jCurrentTimeMillis;
            if (j10 > 0) {
                j11 += j10 * 1000;
            }
        }
        return (j11 > jCurrentTimeMillis || jX2 <= jX) ? j11 : (jX2 - jX) + jCurrentTimeMillis;
    }
}
