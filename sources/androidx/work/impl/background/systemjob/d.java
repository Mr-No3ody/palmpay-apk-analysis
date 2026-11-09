package androidx.work.impl.background.systemjob;

import N8.q0;
import V0.C;
import V0.C0684c;
import V0.C0688g;
import V0.C0689h;
import V0.D;
import V0.EnumC0682a;
import V0.K;
import V0.Q;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.camera.video.u;
import androidx.core.util.Consumer;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.e;
import androidx.work.impl.model.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.f;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Scheduler {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f18460f = C.d("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobScheduler f18462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f18463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkDatabase f18464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0684c f18465e;

    public d(Context context, WorkDatabase workDatabase, C0684c c0684c) {
        JobScheduler jobSchedulerB = a.b(context);
        c cVar = new c(context, c0684c.f9923d, c0684c.f9933n);
        this.f18461a = context;
        this.f18462b = jobSchedulerB;
        this.f18463c = cVar;
        this.f18464d = workDatabase;
        this.f18465e = c0684c;
    }

    public static void a(JobScheduler jobScheduler, int i7) {
        try {
            jobScheduler.cancel(i7);
        } catch (Throwable th) {
            C.c().b(f18460f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i7)), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listA = a.a(jobScheduler);
        if (listA == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listA.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listA) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static e c(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new e(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final void cancel(String str) {
        ArrayList arrayList;
        Context context = this.f18461a;
        JobScheduler jobScheduler = this.f18462b;
        ArrayList<JobInfo> arrayListB = b(context, jobScheduler);
        if (arrayListB == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListB) {
                e eVarC = c(jobInfo);
                if (eVarC != null && str.equals(eVarC.f18587a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f18464d.e().removeSystemIdInfo(str);
    }

    public final void d(k kVar, int i7) {
        int i10;
        String str;
        String str2 = f18460f;
        c cVar = this.f18463c;
        cVar.getClass();
        C0689h c0689h = kVar.f18621j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", kVar.f18612a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", kVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", kVar.d());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i7, cVar.f18457a).setRequiresCharging(c0689h.f9942c);
        boolean z3 = c0689h.f9943d;
        JobInfo.Builder builder = requiresCharging.setRequiresDeviceIdle(z3).setExtras(persistableBundle);
        NetworkRequest networkRequest = c0689h.f9941b.f18699a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28 || networkRequest == null) {
            D d2 = c0689h.f9940a;
            if (i11 < 30 || d2 != D.f9868f) {
                int iOrdinal = d2.ordinal();
                if (iOrdinal == 0) {
                    i10 = 0;
                } else if (iOrdinal != 1) {
                    i10 = 2;
                    if (iOrdinal != 2) {
                        i10 = 3;
                        if (iOrdinal != 3) {
                            i10 = 4;
                            if (iOrdinal != 4 || i11 < 26) {
                                C c6 = C.c();
                                d2.toString();
                                c6.getClass();
                                i10 = 1;
                            }
                        }
                    }
                } else {
                    i10 = 1;
                }
                builder.setRequiredNetworkType(i10);
            } else {
                builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.setRequiredNetwork(networkRequest);
        }
        if (!z3) {
            builder.setBackoffCriteria(kVar.f18624m, kVar.f18623l == EnumC0682a.f9916b ? 0 : 1);
        }
        long jA = kVar.a();
        cVar.f18458b.getClass();
        long jMax = Math.max(jA - System.currentTimeMillis(), 0L);
        if (i11 <= 28 || jMax > 0) {
            builder.setMinimumLatency(jMax);
        } else if (!kVar.f18628q && cVar.f18459c) {
            builder.setImportantWhileForeground(true);
        }
        Set<C0688g> set = c0689h.f9948i;
        if (!set.isEmpty()) {
            for (C0688g c0688g : set) {
                builder.addTriggerContentUri(new JobInfo.TriggerContentUri(c0688g.f9937a, c0688g.f9938b ? 1 : 0));
            }
            builder.setTriggerContentUpdateDelay(c0689h.f9946g);
            builder.setTriggerContentMaxDelay(c0689h.f9947h);
        }
        builder.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            builder.setRequiresBatteryNotLow(c0689h.f9944e);
            builder.setRequiresStorageNotLow(c0689h.f9945f);
        }
        boolean z8 = kVar.f18622k > 0;
        boolean z10 = jMax > 0;
        if (i12 >= 31 && kVar.f18628q && !z8 && !z10) {
            builder.setExpedited(true);
        }
        if (i12 >= 35 && (str = kVar.f18634x) != null) {
            builder.setTraceTag(str);
        }
        JobInfo jobInfoBuild = builder.build();
        C.c().getClass();
        try {
            if (this.f18462b.schedule(jobInfoBuild) == 0) {
                C.c().getClass();
                if (kVar.f18628q && kVar.f18629r == K.f9880a) {
                    kVar.f18628q = false;
                    C.c().getClass();
                    d(kVar, i7);
                }
            }
        } catch (IllegalStateException e10) {
            String str3 = a.f18456a;
            Context context = this.f18461a;
            Intrinsics.checkNotNullParameter(context, "context");
            WorkDatabase workDatabase = this.f18464d;
            Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
            C0684c configuration = this.f18465e;
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            int i13 = Build.VERSION.SDK_INT;
            int i14 = i13 >= 31 ? 150 : 100;
            int size = workDatabase.h().getScheduledWork().size();
            String strJ = "<faulty JobScheduler failed to getPendingJobs>";
            if (i13 >= 34) {
                JobScheduler jobSchedulerB = a.b(context);
                List listA = a.a(jobSchedulerB);
                if (listA != null) {
                    ArrayList arrayListB = b(context, jobSchedulerB);
                    int size2 = arrayListB != null ? listA.size() - arrayListB.size() : 0;
                    String strG = size2 == 0 ? null : u.g(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    Intrinsics.f(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                    ArrayList arrayListB2 = b(context, (JobScheduler) systemService);
                    int size3 = arrayListB2 != null ? arrayListB2.size() : 0;
                    String[] elements = {listA.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", strG, size3 != 0 ? u.g(size3, " from WorkManager in the default namespace") : null};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    strJ = CollectionsKt.J(C1847n.r(elements), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListB3 = b(context, a.b(context));
                if (arrayListB3 != null) {
                    strJ = arrayListB3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb2 = new StringBuilder("JobScheduler ");
            sb2.append(i14);
            sb2.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb2.append(strJ);
            sb2.append(".\nThere are ");
            sb2.append(size);
            sb2.append(" jobs tracked by WorkManager's database;\nthe Configuration limit is ");
            String strM = q0.m(sb2, configuration.f9932m, '.');
            C.c().a(str2, strM);
            IllegalStateException illegalStateException = new IllegalStateException(strM, e10);
            Consumer consumer = configuration.f9928i;
            if (consumer == null) {
                throw illegalStateException;
            }
            consumer.accept(illegalStateException);
        } catch (Throwable th) {
            C.c().b(str2, "Unable to schedule " + kVar, th);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public final void schedule(k... kVarArr) {
        int iIntValue;
        C0684c c0684c = this.f18465e;
        WorkDatabase workDatabase = this.f18464d;
        final f fVar = new f(workDatabase);
        for (k kVar : kVarArr) {
            workDatabase.beginTransaction();
            try {
                k workSpec = workDatabase.h().getWorkSpec(kVar.f18612a);
                if (workSpec != null && workSpec.f18613b == Q.f9885a) {
                    e generationalId = p140j8.f.j(kVar);
                    androidx.work.impl.model.d systemIdInfo = workDatabase.e().getSystemIdInfo(generationalId);
                    if (systemIdInfo != null) {
                        iIntValue = systemIdInfo.f18586c;
                    } else {
                        c0684c.getClass();
                        final int i7 = c0684c.f9930k;
                        Object objRunInTransaction = ((WorkDatabase) fVar.f41079b).runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.utils.e
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                org.greenrobot.eventbus.f fVar2 = fVar;
                                WorkDatabase workDatabase2 = (WorkDatabase) fVar2.f41079b;
                                Long longValue = workDatabase2.d().getLongValue("next_job_scheduler_id");
                                int i10 = 0;
                                int iLongValue = longValue != null ? (int) longValue.longValue() : 0;
                                workDatabase2.d().insertPreference(new androidx.work.impl.model.c("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i7) {
                                    ((WorkDatabase) fVar2.f41079b).d().insertPreference(new androidx.work.impl.model.c("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i10 = iLongValue;
                                }
                                return Integer.valueOf(i10);
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(objRunInTransaction, "workDatabase.runInTransa…d\n            }\n        )");
                        iIntValue = ((Number) objRunInTransaction).intValue();
                    }
                    if (systemIdInfo == null) {
                        Intrinsics.checkNotNullParameter(generationalId, "generationalId");
                        workDatabase.e().insertSystemIdInfo(new androidx.work.impl.model.d(generationalId.f18587a, generationalId.f18588b, iIntValue));
                    }
                    d(kVar, iIntValue);
                    workDatabase.setTransactionSuccessful();
                } else {
                    C.c().getClass();
                    workDatabase.setTransactionSuccessful();
                }
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }
}
