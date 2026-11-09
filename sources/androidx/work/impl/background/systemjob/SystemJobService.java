package androidx.work.impl.background.systemjob;

import N8.q0;
import V0.C;
import V0.a0;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.C1271d;
import androidx.work.impl.C1275h;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.model.e;
import androidx.work.impl.s;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
@RestrictTo({p192n.c.f39801b})
public class SystemJobService extends JobService implements ExecutionListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f18451e = C.d("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f18452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18453b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StartStopTokens f18454c = StartStopTokens.create(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p279s5.d f18455d;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(q0.k("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static e b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new e(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            s sVarG = s.g(getApplicationContext());
            this.f18452a = sVarG;
            C1271d c1271d = sVarG.f18680g;
            this.f18455d = new p279s5.d(c1271d, sVarG.f18678e);
            c1271d.a(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            C.c().getClass();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        s sVar = this.f18452a;
        if (sVar != null) {
            sVar.f18680g.f(this);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void onExecuted(e eVar, boolean z3) {
        a("onExecuted");
        C c6 = C.c();
        String str = eVar.f18587a;
        c6.getClass();
        JobParameters jobParameters = (JobParameters) this.f18453b.remove(eVar);
        this.f18454c.remove(eVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z3);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f18452a == null) {
            C.c().getClass();
            jobFinished(jobParameters, true);
            return false;
        }
        e eVarB = b(jobParameters);
        if (eVarB == null) {
            C.c().a(f18451e, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.f18453b;
        if (map.containsKey(eVarB)) {
            C c6 = C.c();
            eVarB.toString();
            c6.getClass();
            return false;
        }
        C c10 = C.c();
        eVarB.toString();
        c10.getClass();
        map.put(eVarB, jobParameters);
        int i7 = Build.VERSION.SDK_INT;
        a0 a0Var = new a0();
        if (jobParameters.getTriggeredContentUris() != null) {
            a0Var.f9919b = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            a0Var.f9918a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (i7 >= 28) {
            X.a.e(jobParameters);
        }
        this.f18455d.startWork(this.f18454c.tokenFor(eVarB), a0Var);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.f18452a == null) {
            C.c().getClass();
            return true;
        }
        e eVarB = b(jobParameters);
        if (eVarB == null) {
            C.c().a(f18451e, "WorkSpec id not found!");
            return false;
        }
        C c6 = C.c();
        eVarB.toString();
        c6.getClass();
        this.f18453b.remove(eVarB);
        C1275h c1275hRemove = this.f18454c.remove(eVarB);
        if (c1275hRemove != null) {
            this.f18455d.stopWorkWithReason(c1275hRemove, Build.VERSION.SDK_INT >= 31 ? F.a.c(jobParameters) : -512);
        }
        C1271d c1271d = this.f18452a.f18680g;
        String str = eVarB.f18587a;
        synchronized (c1271d.f18540k) {
            zContains = c1271d.f18538i.contains(str);
        }
        return !zContains;
    }
}
