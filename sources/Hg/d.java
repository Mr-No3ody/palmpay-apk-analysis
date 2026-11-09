package Hg;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f3930a = new c(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f3931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final DateFormat[] f3932c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f3931b = strArr;
        f3932c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f3930a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f3931b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    DateFormat[] dateFormatArr = f3932c;
                    DateFormat simpleDateFormat = dateFormatArr[i7];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f3931b[i7], Locale.US);
                        simpleDateFormat.setTimeZone(Dg.c.f1883e);
                        dateFormatArr[i7] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                Unit unit = Unit.f38893a;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
