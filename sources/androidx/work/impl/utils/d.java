package androidx.work.impl.utils;

import V0.C;
import V0.C0684c;
import V0.Q;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import androidx.core.view.t0;
import androidx.work.impl.AbstractC1274g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f18689e = C.d("ForceStopRunnable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f18690f = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.work.impl.s f18692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.c f18693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18694d = 0;

    public d(Context context, androidx.work.impl.s sVar) {
        this.f18691a = context.getApplicationContext();
        this.f18692b = sVar;
        this.f18693c = sVar.f18681h;
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i7 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i7);
        long jCurrentTimeMillis = System.currentTimeMillis() + f18690f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01bf  */
    public final void a() {
        boolean z3;
        p1.c cVar = this.f18693c;
        androidx.work.impl.s sVar = this.f18692b;
        WorkDatabase workDatabase = sVar.f18677d;
        String str = androidx.work.impl.background.systemjob.d.f18460f;
        Context context = this.f18691a;
        JobScheduler jobSchedulerB = androidx.work.impl.background.systemjob.a.b(context);
        ArrayList<JobInfo> arrayListB = androidx.work.impl.background.systemjob.d.b(context, jobSchedulerB);
        List<String> workSpecIds = workDatabase.e().getWorkSpecIds();
        HashSet hashSet = new HashSet(arrayListB != null ? arrayListB.size() : 0);
        if (arrayListB != null && !arrayListB.isEmpty()) {
            for (JobInfo jobInfo : arrayListB) {
                androidx.work.impl.model.e eVarC = androidx.work.impl.background.systemjob.d.c(jobInfo);
                if (eVarC != null) {
                    hashSet.add(eVarC.f18587a);
                } else {
                    androidx.work.impl.background.systemjob.d.a(jobSchedulerB, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = workSpecIds.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    C.c().getClass();
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        if (z3) {
            workDatabase.beginTransaction();
            try {
                WorkSpecDao workSpecDaoH = workDatabase.h();
                Iterator<String> it2 = workSpecIds.iterator();
                while (it2.hasNext()) {
                    workSpecDaoH.markWorkSpecScheduled(it2.next(), -1L);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
        WorkDatabase workDatabase2 = sVar.f18677d;
        WorkSpecDao workSpecDaoH2 = workDatabase2.h();
        WorkProgressDao workProgressDaoG = workDatabase2.g();
        workDatabase2.beginTransaction();
        try {
            List<androidx.work.impl.model.k> runningWork = workSpecDaoH2.getRunningWork();
            boolean z8 = (runningWork == null || runningWork.isEmpty()) ? false : true;
            if (z8) {
                for (androidx.work.impl.model.k kVar : runningWork) {
                    Q q10 = Q.f9885a;
                    String str2 = kVar.f18612a;
                    workSpecDaoH2.setState(q10, str2);
                    workSpecDaoH2.setStopReason(str2, -512);
                    workSpecDaoH2.markWorkSpecScheduled(str2, -1L);
                }
            }
            workProgressDaoG.deleteAll();
            workDatabase2.setTransactionSuccessful();
            workDatabase2.endTransaction();
            boolean z10 = z8 || z3;
            Long longValue = ((WorkDatabase) sVar.f18681h.f41176b).d().getLongValue("reschedule_needed");
            if (longValue != null && longValue.longValue() == 1) {
                C.c().getClass();
                sVar.j();
                p1.c cVar2 = sVar.f18681h;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter("reschedule_needed", "key");
                ((WorkDatabase) cVar2.f41176b).d().insertPreference(new androidx.work.impl.model.c("reschedule_needed", 0L));
                return;
            }
            try {
                int i7 = Build.VERSION.SDK_INT;
                int i10 = i7 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
                if (i7 < 30) {
                    if (broadcast == null) {
                        b(context);
                        C.c().getClass();
                        sVar.j();
                        sVar.f18676c.f9923d.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        cVar.getClass();
                        ((WorkDatabase) cVar.f41176b).d().insertPreference(new androidx.work.impl.model.c("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                        return;
                    }
                    if (z10) {
                        C.c().getClass();
                        AbstractC1274g.b(sVar.f18676c, sVar.f18677d, sVar.f18679f);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long longValue2 = ((WorkDatabase) cVar.f41176b).d().getLongValue("last_force_stop_ms");
                    long jLongValue = longValue2 != null ? longValue2.longValue() : 0L;
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo applicationExitInfoE = t0.e(historicalProcessExitReasons.get(i11));
                        if (applicationExitInfoE.getReason() == 10 && applicationExitInfoE.getTimestamp() >= jLongValue) {
                            C.c().getClass();
                            sVar.j();
                            sVar.f18676c.f9923d.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            cVar.getClass();
                            ((WorkDatabase) cVar.f41176b).d().insertPreference(new androidx.work.impl.model.c("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2)));
                            return;
                        }
                    }
                }
                if (z10) {
                    C.c().getClass();
                    AbstractC1274g.b(sVar.f18676c, sVar.f18677d, sVar.f18679f);
                }
            } catch (IllegalArgumentException | SecurityException unused) {
                C.c().getClass();
            }
        } catch (Throwable th2) {
            workDatabase2.endTransaction();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        String str = f18689e;
        androidx.work.impl.s sVar = this.f18692b;
        try {
            C0684c c0684c = sVar.f18676c;
            c0684c.getClass();
            boolean zIsEmpty = TextUtils.isEmpty(null);
            Context context = this.f18691a;
            if (zIsEmpty) {
                C.c().getClass();
                zA = true;
            } else {
                zA = j.a(context, c0684c);
                C.c().getClass();
            }
            if (!zA) {
                sVar.i();
                return;
            }
            while (true) {
                try {
                    io.fastkv.n.z(context);
                    C.c().getClass();
                    try {
                        a();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e10) {
                        int i7 = this.f18694d + 1;
                        this.f18694d = i7;
                        if (i7 >= 3) {
                            String str2 = androidx.camera.core.impl.utils.executor.g.C(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            C.c().b(str, str2, e10);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e10);
                            Consumer consumer = sVar.f18676c.f9927h;
                            if (consumer == null) {
                                throw illegalStateException;
                            }
                            C.c().getClass();
                            consumer.accept(illegalStateException);
                            break;
                        }
                        C.c().getClass();
                        try {
                            Thread.sleep(((long) this.f18694d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e11) {
                    C.c().a(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                    Consumer consumer2 = sVar.f18676c.f9927h;
                    if (consumer2 == null) {
                        throw illegalStateException2;
                    }
                    consumer2.accept(illegalStateException2);
                }
            }
            sVar.i();
        } catch (Throwable th) {
            sVar.i();
            throw th;
        }
    }
}
