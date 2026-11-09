package Pa;

import android.app.Activity;
import android.content.Intent;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.core.bean.CalendarEvent;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Pa.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0506c {
    public static void a(Activity activity, CalendarEvent.CalendarBean event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            if (event.beginTimeMillis == 0) {
                event.beginTimeMillis = Calendar.getInstance().getTimeInMillis();
            }
            if (event.endTimeMillis == 0) {
                event.endTimeMillis = event.beginTimeMillis + ((long) Constants.THIRTY_MINUTES);
            }
            Intent intent = new Intent("android.intent.action.INSERT", CalendarContract.Events.CONTENT_URI);
            intent.putExtra("title", event.title);
            intent.putExtra("description", event.description);
            intent.putExtra("eventLocation", "PalmPay");
            intent.putExtra("beginTime", event.beginTimeMillis);
            intent.putExtra("endTime", event.endTimeMillis);
            intent.putExtra("allDay", true);
            intent.putExtra("hasAlarm", true);
            intent.putExtra("minutes", 10);
            if (!TextUtils.isEmpty(null)) {
                intent.putExtra("rrule", (String) null);
            }
            intent.addFlags(268435456);
            activity.startActivity(intent);
        } catch (Exception e10) {
            F6.d.c("CalendarUtils", "insert: ", e10);
        }
    }
}
