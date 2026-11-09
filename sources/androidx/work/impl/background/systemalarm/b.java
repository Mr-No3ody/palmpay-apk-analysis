package androidx.work.impl.background.systemalarm;

import V0.C;
import V0.C0689h;
import V0.C0697p;
import V0.D;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.C1275h;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ExecutionListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f18412f = C.d("CommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f18414b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18415c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0697p f18416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StartStopTokens f18417e;

    public b(Context context, C0697p c0697p, StartStopTokens startStopTokens) {
        this.f18413a = context;
        this.f18416d = c0697p;
        this.f18417e = startStopTokens;
    }

    public static androidx.work.impl.model.e b(Intent intent) {
        return new androidx.work.impl.model.e(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, androidx.work.impl.model.e eVar) {
        intent.putExtra("KEY_WORKSPEC_ID", eVar.f18587a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", eVar.f18588b);
    }

    public final void a(Intent intent, int i7, h hVar) {
        List<C1275h> listRemove;
        ArrayList arrayList;
        int i10 = 3;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            C c6 = C.c();
            Objects.toString(intent);
            c6.getClass();
            d dVar = new d(this.f18413a, this.f18416d, i7, hVar);
            List<k> scheduledWork = hVar.f18444e.f18677d.h().getScheduledWork();
            int i11 = c.f18418a;
            Iterator<k> it = scheduledWork.iterator();
            boolean z3 = false;
            boolean z8 = false;
            boolean z10 = false;
            boolean z11 = false;
            while (it.hasNext()) {
                C0689h c0689h = it.next().f18621j;
                z3 |= c0689h.f9944e;
                z8 |= c0689h.f9942c;
                z10 |= c0689h.f9945f;
                z11 |= c0689h.f9940a != D.f9863a;
                if (z3 && z8 && z10 && z11) {
                    break;
                }
            }
            int i12 = ConstraintProxyUpdateReceiver.f18407a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = dVar.f18419a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z8).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z11);
            context.sendBroadcast(intent2);
            ArrayList<k> arrayList2 = new ArrayList(scheduledWork.size());
            dVar.f18420b.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (k kVar : scheduledWork) {
                if (jCurrentTimeMillis >= kVar.a() && (!kVar.c() || dVar.f18422d.g(kVar))) {
                    arrayList2.add(kVar);
                }
            }
            for (k kVar2 : arrayList2) {
                String str = kVar2.f18612a;
                androidx.work.impl.model.e eVarJ = p140j8.f.j(kVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, eVarJ);
                C.c().getClass();
                hVar.f18441b.f18730d.execute(new F6.a(hVar, intent3, dVar.f18421c, i10));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            C c10 = C.c();
            Objects.toString(intent);
            c10.getClass();
            hVar.f18444e.j();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            C.c().a(f18412f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            androidx.work.impl.model.e eVarB = b(intent);
            C c11 = C.c();
            eVarB.toString();
            c11.getClass();
            WorkDatabase workDatabase = hVar.f18444e.f18677d;
            workDatabase.beginTransaction();
            try {
                k workSpec = workDatabase.h().getWorkSpec(eVarB.f18587a);
                if (workSpec == null) {
                    C c12 = C.c();
                    eVarB.toString();
                    c12.getClass();
                    return;
                }
                if (workSpec.f18613b.a()) {
                    C c13 = C.c();
                    eVarB.toString();
                    c13.getClass();
                    return;
                }
                long jA = workSpec.a();
                boolean zC = workSpec.c();
                Context context2 = this.f18413a;
                if (zC) {
                    C c14 = C.c();
                    eVarB.toString();
                    c14.getClass();
                    a.b(context2, workDatabase, eVarB, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    hVar.f18441b.f18730d.execute(new F6.a(hVar, intent4, i7, i10));
                } else {
                    C c15 = C.c();
                    eVarB.toString();
                    c15.getClass();
                    a.b(context2, workDatabase, eVarB, jA);
                }
                workDatabase.setTransactionSuccessful();
                return;
            } finally {
                workDatabase.endTransaction();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f18415c) {
                try {
                    androidx.work.impl.model.e eVarB2 = b(intent);
                    C c16 = C.c();
                    eVarB2.toString();
                    c16.getClass();
                    if (this.f18414b.containsKey(eVarB2)) {
                        C c17 = C.c();
                        eVarB2.toString();
                        c17.getClass();
                    } else {
                        f fVar = new f(this.f18413a, i7, hVar, this.f18417e.tokenFor(eVarB2));
                        this.f18414b.put(eVarB2, fVar);
                        fVar.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                C c18 = C.c();
                intent.toString();
                c18.getClass();
                return;
            } else {
                androidx.work.impl.model.e eVarB3 = b(intent);
                boolean z12 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                C c19 = C.c();
                intent.toString();
                c19.getClass();
                onExecuted(eVarB3, z12);
                return;
            }
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        StartStopTokens startStopTokens = this.f18417e;
        if (zContainsKey) {
            int i13 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            arrayList = new ArrayList(1);
            C1275h c1275hRemove = startStopTokens.remove(new androidx.work.impl.model.e(string, i13));
            if (c1275hRemove != null) {
                listRemove = arrayList;
                arrayList.add(c1275hRemove);
                listRemove = arrayList;
            }
        } else {
            listRemove = startStopTokens.remove(string);
        }
        listRemove = arrayList;
        for (C1275h c1275h : listRemove) {
            C.c().getClass();
            hVar.f18450p.stopWork(c1275h);
            WorkDatabase workDatabase2 = hVar.f18444e.f18677d;
            androidx.work.impl.model.e eVar = c1275h.f18563a;
            int i14 = a.f18411a;
            SystemIdInfoDao systemIdInfoDaoE = workDatabase2.e();
            androidx.work.impl.model.d systemIdInfo = systemIdInfoDaoE.getSystemIdInfo(eVar);
            if (systemIdInfo != null) {
                a.a(this.f18413a, eVar, systemIdInfo.f18586c);
                C c20 = C.c();
                eVar.toString();
                c20.getClass();
                systemIdInfoDaoE.removeSystemIdInfo(eVar);
            }
            hVar.onExecuted(c1275h.f18563a, false);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void onExecuted(androidx.work.impl.model.e eVar, boolean z3) {
        synchronized (this.f18415c) {
            try {
                f fVar = (f) this.f18414b.remove(eVar);
                this.f18417e.remove(eVar);
                if (fVar != null) {
                    fVar.e(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
