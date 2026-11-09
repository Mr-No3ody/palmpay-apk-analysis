package Jd;

import C0.G;
import Pa.r0;
import androidx.camera.video.u;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f4773a = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

    static {
        Calendar.getInstance().getTimeZone();
    }

    public static Date a(int i7) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setFirstDayOfWeek(1);
        gregorianCalendar.setTime(new Date());
        gregorianCalendar.set(7, (gregorianCalendar.getFirstDayOfWeek() + i7) - 1);
        Date time = gregorianCalendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }

    public static String b(Long l5) {
        if (l5 == null) {
            return "";
        }
        String str = f4773a.format(l5);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static int c(Long l5, Long l6) {
        long jLongValue = (l6 != null ? l6.longValue() : 0L) - (l5 != null ? l5.longValue() : 0L);
        if (jLongValue <= 0) {
            return 1;
        }
        long j6 = 60;
        return ((int) ((((jLongValue / ((long) 24)) / j6) / j6) / ((long) 1000))) + 1;
    }

    public static ArrayList d(int i7) {
        Date dateE;
        String str;
        if (i7 > Calendar.getInstance().get(5)) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(new Date());
            gregorianCalendar.set(5, i7);
            dateE = gregorianCalendar.getTime();
            Intrinsics.checkNotNullExpressionValue(dateE, "getTime(...)");
        } else {
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            gregorianCalendar2.setTime(new Date());
            gregorianCalendar2.set(5, i7);
            Date time = gregorianCalendar2.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
            dateE = e(time, 1);
        }
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        aVar.f4769a = -1;
        aVar.f4771c = null;
        aVar.f4772d = dateE;
        aVar.f4770b = null;
        arrayList.add(aVar);
        Date dateE2 = dateE;
        for (int i10 = 1; i10 < 25; i10++) {
            a aVar2 = new a();
            aVar2.f4769a = i10;
            aVar2.f4771c = dateE2;
            aVar2.f4772d = dateE;
            if (dateE2 != null) {
                str = f4773a.format(dateE2);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                str = "";
            }
            aVar2.f4770b = str;
            arrayList.add(aVar2);
            dateE2 = e(dateE2, 1);
        }
        return arrayList;
    }

    public static Date e(Date date, int i7) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i10 = calendar.get(5);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        gregorianCalendar.add(2, i7);
        if (gregorianCalendar.get(5) != i10) {
            return e(date, i7 + 1);
        }
        Date time = gregorianCalendar.getTime();
        Intrinsics.e(time);
        return time;
    }

    public static long f() {
        return TimeUtils.getStartTimeOfToday() + 86400000;
    }

    public static String g(int i7, long j6, boolean z3) {
        if (i7 == 1) {
            return b(Long.valueOf(j6));
        }
        if (i7 == 3) {
            return G.o("Every ", r0.M0(j6, TimeZone.getDefault()));
        }
        if (i7 != 4) {
            return z3 ? b(Long.valueOf(j6)) : "Daily Transfer";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j6));
        int i10 = calendar.get(5);
        if (i10 == 1) {
            return "1st of Every Month";
        }
        if (i10 != 2) {
            return i10 != 3 ? u.g(i10, "th of Every Month") : "3rd of Every Month";
        }
        return "2nd of Every Month";
    }

    public static ArrayList h(int i7) {
        Date time;
        String str;
        if (i7 > Calendar.getInstance().get(7)) {
            time = a(i7);
        } else {
            Date dateA = a(i7);
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setFirstDayOfWeek(1);
            gregorianCalendar.setTime(dateA);
            gregorianCalendar.add(5, 7);
            time = gregorianCalendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        }
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        aVar.f4769a = -1;
        aVar.f4771c = null;
        aVar.f4772d = time;
        aVar.f4770b = null;
        arrayList.add(aVar);
        Date time2 = time;
        for (int i10 = 1; i10 < 25; i10++) {
            a aVar2 = new a();
            aVar2.f4769a = i10;
            aVar2.f4771c = time2;
            aVar2.f4772d = time;
            if (time2 != null) {
                str = f4773a.format(time2);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                str = "";
            }
            aVar2.f4770b = str;
            arrayList.add(aVar2);
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            gregorianCalendar2.setFirstDayOfWeek(1);
            gregorianCalendar2.setTime(time2);
            gregorianCalendar2.add(5, 7);
            time2 = gregorianCalendar2.getTime();
            Intrinsics.checkNotNullExpressionValue(time2, "getTime(...)");
        }
        return arrayList;
    }
}
