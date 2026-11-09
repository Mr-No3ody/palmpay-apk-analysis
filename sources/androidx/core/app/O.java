package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class O extends Service {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f15945f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap f15946g = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JobIntentService$CompatJobEngine f15947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f15948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AsyncTaskC1043l f15949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15950d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f15951e;

    public O() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15951e = null;
        } else {
            this.f15951e = new ArrayList();
        }
    }

    public static void a(Context context, Class cls, int i7, Intent intent) {
        ComponentName componentName = new ComponentName(context, (Class<?>) cls);
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f15945f) {
            r rVarC = c(context, componentName, true, i7);
            rVarC.b(i7);
            rVarC.a(intent);
        }
    }

    public static r c(Context context, ComponentName componentName, boolean z3, int i7) {
        r c1044m;
        HashMap map = f15946g;
        r rVar = (r) map.get(componentName);
        if (rVar != null) {
            return rVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            c1044m = new C1044m(context, componentName);
        } else {
            if (!z3) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            c1044m = new C1048q(context, componentName, i7);
        }
        map.put(componentName, c1044m);
        return c1044m;
    }

    public final void b(boolean z3) {
        if (this.f15949c == null) {
            this.f15949c = new AsyncTaskC1043l(this);
            r rVar = this.f15948b;
            if (rVar != null && z3) {
                rVar.d();
            }
            this.f15949c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void d() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15947a = new JobServiceEngineC1047p(this, 0);
            this.f15948b = null;
        } else {
            this.f15947a = null;
            this.f15948b = c(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    public abstract void e(Intent intent);

    public final void f() {
        ArrayList arrayList = this.f15951e;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f15949c = null;
                    ArrayList arrayList2 = this.f15951e;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        b(false);
                    } else if (!this.f15950d) {
                        this.f15948b.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobIntentService$CompatJobEngine jobIntentService$CompatJobEngine = this.f15947a;
        if (jobIntentService$CompatJobEngine != null) {
            return jobIntentService$CompatJobEngine.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        d();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15947a = new JobServiceEngineC1047p(this, 1);
        } else {
            this.f15947a = null;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f15951e;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f15950d = true;
                this.f15948b.c();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        if (this.f15951e == null) {
            return 2;
        }
        this.f15948b.e();
        synchronized (this.f15951e) {
            ArrayList arrayList = this.f15951e;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C1045n(this, intent, i10));
            b(true);
        }
        return 3;
    }
}
