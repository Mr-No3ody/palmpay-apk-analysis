package androidx.work.impl.background.systemalarm;

import V0.C;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfoDao;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18411a = 0;

    static {
        C.d("Alarms");
    }

    public static void a(Context context, androidx.work.impl.model.e eVar, int i7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = b.f18412f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        b.c(intent, eVar);
        PendingIntent service = PendingIntent.getService(context, i7, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        C c6 = C.c();
        eVar.toString();
        c6.getClass();
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, androidx.work.impl.model.e generationalId, long j6) {
        SystemIdInfoDao systemIdInfoDaoE = workDatabase.e();
        androidx.work.impl.model.d systemIdInfo = systemIdInfoDaoE.getSystemIdInfo(generationalId);
        if (systemIdInfo != null) {
            int i7 = systemIdInfo.f18586c;
            a(context, generationalId, i7);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = b.f18412f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            b.c(intent, generationalId);
            PendingIntent service = PendingIntent.getService(context, i7, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j6, service);
                return;
            }
            return;
        }
        Object objRunInTransaction = workDatabase.runInTransaction(new androidx.webkit.internal.e(new org.greenrobot.eventbus.f(workDatabase), 1));
        Intrinsics.checkNotNullExpressionValue(objRunInTransaction, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        int iIntValue = ((Number) objRunInTransaction).intValue();
        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
        systemIdInfoDaoE.insertSystemIdInfo(new androidx.work.impl.model.d(generationalId.f18587a, generationalId.f18588b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = b.f18412f;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        b.c(intent2, generationalId);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j6, service2);
        }
    }
}
