package androidx.work.impl;

import V0.C0684c;
import V0.C0697p;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.work.impl.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1274g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18562a = 0;

    static {
        V0.C.d("Schedulers");
    }

    public static void a(WorkSpecDao workSpecDao, C0697p c0697p, List list) {
        if (list.size() > 0) {
            c0697p.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                workSpecDao.markWorkSpecScheduled(((androidx.work.impl.model.k) it.next()).f18612a, jCurrentTimeMillis);
            }
        }
    }

    public static void b(C0684c c0684c, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao workSpecDaoH = workDatabase.h();
        workDatabase.beginTransaction();
        try {
            List<androidx.work.impl.model.k> eligibleWorkForSchedulingWithContentUris = workSpecDaoH.getEligibleWorkForSchedulingWithContentUris();
            a(workSpecDaoH, c0684c.f9923d, eligibleWorkForSchedulingWithContentUris);
            List<androidx.work.impl.model.k> eligibleWorkForScheduling = workSpecDaoH.getEligibleWorkForScheduling(c0684c.f9932m);
            a(workSpecDaoH, c0684c.f9923d, eligibleWorkForScheduling);
            eligibleWorkForScheduling.addAll(eligibleWorkForSchedulingWithContentUris);
            List<androidx.work.impl.model.k> allEligibleWorkSpecsForScheduling = workSpecDaoH.getAllEligibleWorkSpecsForScheduling(200);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (eligibleWorkForScheduling.size() > 0) {
                androidx.work.impl.model.k[] kVarArr = (androidx.work.impl.model.k[]) eligibleWorkForScheduling.toArray(new androidx.work.impl.model.k[eligibleWorkForScheduling.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Scheduler scheduler = (Scheduler) it.next();
                    if (scheduler.hasLimitedSchedulingSlots()) {
                        scheduler.schedule(kVarArr);
                    }
                }
            }
            if (allEligibleWorkSpecsForScheduling.size() > 0) {
                androidx.work.impl.model.k[] kVarArr2 = (androidx.work.impl.model.k[]) allEligibleWorkSpecsForScheduling.toArray(new androidx.work.impl.model.k[allEligibleWorkSpecsForScheduling.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Scheduler scheduler2 = (Scheduler) it2.next();
                    if (!scheduler2.hasLimitedSchedulingSlots()) {
                        scheduler2.schedule(kVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
