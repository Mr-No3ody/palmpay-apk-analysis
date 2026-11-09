package Me;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatCountdown(Context context, long j6) {
        if (j6 < 0) {
            j6 = 0;
        }
        if (j6 <= 1800000) {
            String string = context.getString(Ac.h.main_task_center_countdown_minutes, 30);
            Intrinsics.e(string);
            return string;
        }
        if (j6 < 3600000) {
            String string2 = context.getString(Ac.h.main_task_center_countdown_hours, 1);
            Intrinsics.e(string2);
            return string2;
        }
        long hours = TimeUnit.MILLISECONDS.toHours(j6);
        long j10 = 24;
        long j11 = hours / j10;
        long j12 = hours % j10;
        if (j11 > 0) {
            String string3 = context.getString(Ac.h.main_task_center_countdown_days_hours, Long.valueOf(j11), Long.valueOf(j12));
            Intrinsics.e(string3);
            return string3;
        }
        String string4 = context.getString(Ac.h.main_task_center_countdown_hours, Long.valueOf(j12));
        Intrinsics.e(string4);
        return string4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long nextExpireRefreshDelay(long j6) {
        if (j6 < 1) {
            j6 = 1;
        }
        if (j6 <= 1800000) {
            return j6;
        }
        if (j6 < 3600000) {
            return j6 - 1800000;
        }
        long j10 = j6 % 3600000;
        return Math.min(j10 != 0 ? j10 : 3600000L, j6 - 1800000);
    }

    private b() {
    }
}
