package androidx.work.impl.utils;

import N8.q0;
import V0.C;
import V0.Q;
import V0.X;
import android.text.TextUtils;
import androidx.work.impl.AbstractC1274g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18688a = C.d("EnqueueRunnable");

    public static void a(androidx.work.impl.n nVar) {
        boolean z3;
        nVar.getClass();
        HashSet hashSet = new HashSet();
        hashSet.addAll(nVar.f18664s);
        HashSet hashSetF = androidx.work.impl.n.F(nVar);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(nVar.f18664s);
                z3 = false;
                break;
            } else if (hashSetF.contains((String) it.next())) {
                z3 = true;
                break;
            }
        }
        if (z3) {
            throw new IllegalStateException("WorkContinuation has cycles (" + nVar + ")");
        }
        androidx.work.impl.s sVar = nVar.f18660o;
        WorkDatabase workDatabase = sVar.f18677d;
        workDatabase.beginTransaction();
        try {
            h.b(workDatabase, sVar.f18676c, nVar);
            boolean zB = b(nVar);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (zB) {
                AbstractC1274g.b(sVar.f18676c, sVar.f18677d, sVar.f18679f);
            }
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0181  */
    public static boolean b(androidx.work.impl.n nVar) {
        boolean z3;
        boolean z8;
        boolean z10;
        boolean z11;
        WorkDatabase workDatabase;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String[] strArr;
        List list;
        nVar.getClass();
        String[] strArr2 = (String[]) androidx.work.impl.n.F(nVar).toArray(new String[0]);
        androidx.work.impl.s workManagerImpl = nVar.f18660o;
        workManagerImpl.f18676c.f9923d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z16 = strArr2 != null && strArr2.length > 0;
        Q q10 = Q.f9887c;
        Q q11 = Q.f9890f;
        Q q12 = Q.f9888d;
        WorkDatabase workDatabase2 = workManagerImpl.f18677d;
        if (z16) {
            int length = strArr2.length;
            int i7 = 0;
            z8 = false;
            z10 = false;
            z3 = true;
            while (true) {
                if (i7 < length) {
                    String str = strArr2[i7];
                    androidx.work.impl.model.k workSpec = workDatabase2.h().getWorkSpec(str);
                    if (workSpec == null) {
                        C.c().a(f18688a, q0.k("Prerequisite ", str, " doesn't exist; not enqueuing"));
                    } else {
                        Q q13 = workSpec.f18613b;
                        z3 &= q13 == q10;
                        if (q13 == q12) {
                            z10 = true;
                        } else if (q13 == q11) {
                            z8 = true;
                        }
                        i7++;
                    }
                }
                z15 = true;
                z14 = false;
                nVar.f18665u = z15;
                return z14;
            }
        }
        z3 = true;
        z8 = false;
        z10 = false;
        String name = nVar.f18661p;
        boolean zIsEmpty = TextUtils.isEmpty(name);
        Q q14 = Q.f9885a;
        if (zIsEmpty || z16) {
            z11 = zIsEmpty;
            workDatabase = workDatabase2;
            z12 = z16;
            z13 = false;
        } else {
            List<androidx.work.impl.model.i> workSpecIdAndStatesForName = workDatabase2.h().getWorkSpecIdAndStatesForName(name);
            if (workSpecIdAndStatesForName.isEmpty()) {
                z11 = zIsEmpty;
                workDatabase = workDatabase2;
                z12 = z16;
            } else {
                z11 = zIsEmpty;
                V0.r rVar = V0.r.f9966c;
                boolean z17 = z16;
                V0.r rVar2 = V0.r.f9967d;
                workDatabase = workDatabase2;
                V0.r rVar3 = nVar.f18662q;
                if (rVar3 == rVar || rVar3 == rVar2) {
                    DependencyDao dependencyDaoC = workDatabase.c();
                    ArrayList arrayList = new ArrayList();
                    for (androidx.work.impl.model.i iVar : workSpecIdAndStatesForName) {
                        boolean z18 = z3;
                        boolean z19 = z8;
                        if (dependencyDaoC.hasDependents(iVar.f18591a)) {
                            z8 = z19;
                        } else {
                            Q q15 = iVar.f18592b;
                            z18 &= q15 == q10;
                            if (q15 == q12) {
                                z8 = z19;
                                z10 = true;
                            } else {
                                z8 = q15 == q11 ? true : z19;
                            }
                            arrayList.add(iVar.f18591a);
                        }
                        z3 = z18;
                    }
                    boolean z20 = z3;
                    boolean z21 = z8;
                    if (rVar3 == rVar2 && (z21 || z10)) {
                        WorkSpecDao workSpecDaoH = workDatabase.h();
                        Iterator<androidx.work.impl.model.i> it = workSpecDaoH.getWorkSpecIdAndStatesForName(name).iterator();
                        while (it.hasNext()) {
                            workSpecDaoH.delete(it.next().f18591a);
                        }
                        z8 = false;
                        z10 = false;
                        list = Collections.EMPTY_LIST;
                    } else {
                        z8 = z21;
                        list = arrayList;
                    }
                    strArr2 = (String[]) list.toArray(strArr2);
                    z12 = strArr2.length > 0;
                    z3 = z20;
                } else {
                    if (rVar3 == V0.r.f9965b) {
                        Iterator<androidx.work.impl.model.i> it2 = workSpecIdAndStatesForName.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Q q16 = it2.next().f18592b;
                                if (q16 == q14 || q16 == Q.f9886b) {
                                    z15 = true;
                                    z14 = false;
                                    nVar.f18665u = z15;
                                    return z14;
                                }
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
                    WorkDatabase workDatabase3 = workManagerImpl.f18677d;
                    Intrinsics.checkNotNullExpressionValue(workDatabase3, "workManagerImpl.workDatabase");
                    workDatabase3.runInTransaction(new androidx.emoji2.text.j(workDatabase3, 4, name, workManagerImpl));
                    WorkSpecDao workSpecDaoH2 = workDatabase.h();
                    Iterator<androidx.work.impl.model.i> it3 = workSpecIdAndStatesForName.iterator();
                    while (it3.hasNext()) {
                        workSpecDaoH2.delete(it3.next().f18591a);
                    }
                    z12 = z17;
                    z13 = true;
                }
            }
            z13 = false;
        }
        for (X x3 : nVar.f18663r) {
            androidx.work.impl.model.k kVar = x3.f9910b;
            if (!z12 || z3) {
                kVar.f18625n = jCurrentTimeMillis;
            } else if (z10) {
                kVar.f18613b = q12;
            } else if (z8) {
                kVar.f18613b = q11;
            } else {
                kVar.f18613b = Q.f9889e;
            }
            z13 = kVar.f18613b == q14 ? true : z13;
            long j6 = jCurrentTimeMillis;
            workDatabase.h().insertWorkSpec(h.f(workManagerImpl.f18679f, kVar));
            UUID uuid = x3.f9909a;
            if (z12) {
                int length2 = strArr2.length;
                strArr = strArr2;
                int i10 = 0;
                while (i10 < length2) {
                    int i11 = i10;
                    String str2 = strArr[i11];
                    UUID uuid2 = uuid;
                    String string = uuid2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
                    workDatabase.c().insertDependency(new androidx.work.impl.model.a(string, str2));
                    i10 = i11 + 1;
                    workManagerImpl = workManagerImpl;
                    uuid = uuid2;
                }
            } else {
                strArr = strArr2;
            }
            androidx.work.impl.s sVar = workManagerImpl;
            UUID uuid3 = uuid;
            WorkTagDao workTagDaoI = workDatabase.i();
            String string2 = uuid3.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
            workTagDaoI.insertTags(string2, x3.f9911c);
            if (!z11) {
                WorkNameDao workNameDaoF = workDatabase.f();
                String string3 = uuid3.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "id.toString()");
                workNameDaoF.insert(new androidx.work.impl.model.f(name, string3));
            }
            jCurrentTimeMillis = j6;
            strArr2 = strArr;
            workManagerImpl = sVar;
        }
        z14 = z13;
        z15 = true;
        nVar.f18665u = z15;
        return z14;
    }
}
