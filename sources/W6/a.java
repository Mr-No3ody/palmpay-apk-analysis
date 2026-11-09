package W6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f10562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleDateFormat f10563b;

    static {
        Locale locale = Locale.ENGLISH;
        f10562a = new SimpleDateFormat("MMM d, yyyy, h:mm a", locale);
        new SimpleDateFormat("MMM d, yyyy", locale);
        new SimpleDateFormat("MMM, yyyy", locale);
        f10563b = new SimpleDateFormat("d MMM, yyyy", locale);
    }

    public static final void a(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.set(11, 23);
        calendar.set(13, 59);
        calendar.set(12, 59);
        calendar.set(14, 999);
        calendar.getTimeInMillis();
    }

    public static final void b(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        calendar.getTimeInMillis();
    }
}
