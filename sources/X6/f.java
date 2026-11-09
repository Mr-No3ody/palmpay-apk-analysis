package X6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static Date a(String date) throws ParseException {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter("yyyy-MM-dd HH:mm:ss", "format");
        Date date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
        Intrinsics.e(date2);
        return date2;
    }
}
