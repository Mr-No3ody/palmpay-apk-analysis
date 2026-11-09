package Xe;

import Gb.Q;
import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends D4.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i7) {
        super(new c(new Q(4)), 8);
        switch (i7) {
            case 2:
                super(new LinkedHashMap(), 8);
                break;
            default:
                break;
        }
    }

    public static String w(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.toLowerCase(Locale.ENGLISH).split("-");
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : strArrSplit) {
            String strSubstring = str2.substring(0, 1);
            String strSubstring2 = str2.substring(1, str2.length());
            sb2.append(strSubstring.toUpperCase(Locale.ENGLISH));
            sb2.append(strSubstring2);
            sb2.append("-");
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.lastIndexOf("-"));
        }
        return sb2.toString();
    }

    public long x(String str) {
        String str2 = (String) a(str);
        if (TextUtils.isEmpty(str2)) {
            return 0L;
        }
        try {
            String str3 = p226og.b.f40542a;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM y HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(p226og.b.f40543b);
            return simpleDateFormat.parse(str2).getTime();
        } catch (ParseException unused) {
            return 0L;
        }
    }
}
