package androidx.work.impl.model;

import V0.C0689h;
import V0.C0693l;
import V0.C0695n;
import V0.D;
import V0.EnumC0682a;
import V0.K;
import V0.Q;
import android.database.Cursor;
import androidx.camera.video.u;
import androidx.lifecycle.B;
import androidx.room.AbstractC1233l;
import androidx.room.L;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
public final class n implements WorkSpecDao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f18640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Td.a f18641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Td.b f18642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Td.c f18643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Td.c f18644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Td.c f18645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Td.c f18646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Td.c f18647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Td.c f18648i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Td.c f18649j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Td.c f18650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Td.c f18651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Td.c f18652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Td.c f18653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Td.c f18654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Td.c f18655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Td.c f18656q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Td.c f18657r;

    public n(WorkDatabase_Impl database) {
        this.f18640a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f18641b = new Td.a(database, 6);
        Intrinsics.checkNotNullParameter(database, "database");
        this.f18642c = new Td.b(database, 2);
        this.f18643d = new Td.c(database, 14);
        this.f18644e = new Td.c(database, 15);
        this.f18645f = new Td.c(database, 16);
        this.f18646g = new Td.c(database, 17);
        this.f18647h = new Td.c(database, 18);
        this.f18648i = new Td.c(database, 19);
        this.f18649j = new Td.c(database, 20);
        this.f18650k = new Td.c(database, 6);
        this.f18651l = new Td.c(database, 7);
        this.f18652m = new Td.c(database, 8);
        this.f18653n = new Td.c(database, 9);
        this.f18654o = new Td.c(database, 10);
        this.f18655p = new Td.c(database, 11);
        this.f18656q = new Td.c(database, 12);
        this.f18657r = new Td.c(database, 13);
    }

    public final void a(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            com.palmpay.lib.apm.launchcounter.util.d.L(map, new l(this, 1));
            return;
        }
        StringBuilder sbS = u.s("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        p059e1.a.b(size, sbS);
        sbS.append(")");
        L lAcquire = L.f17714j.acquire(sbS.toString(), size);
        Iterator it = setKeySet.iterator();
        int i7 = 1;
        while (it.hasNext()) {
            lAcquire.bindString(i7, (String) it.next());
            i7++;
        }
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(this.f18640a, lAcquire, false);
        try {
            int iJ = androidx.camera.core.impl.utils.executor.g.j(cursorK, "work_spec_id");
            if (iJ == -1) {
                cursorK.close();
                return;
            }
            while (cursorK.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorK.getString(iJ));
                if (arrayList != null) {
                    arrayList.add(C0695n.f9956b.fromByteArray(cursorK.getBlob(0)));
                }
            }
            cursorK.close();
        } catch (Throwable th) {
            cursorK.close();
            throw th;
        }
    }

    public final void b(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            com.palmpay.lib.apm.launchcounter.util.d.L(map, new l(this, 0));
            return;
        }
        StringBuilder sbS = u.s("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        p059e1.a.b(size, sbS);
        sbS.append(")");
        L lAcquire = L.f17714j.acquire(sbS.toString(), size);
        Iterator it = setKeySet.iterator();
        int i7 = 1;
        while (it.hasNext()) {
            lAcquire.bindString(i7, (String) it.next());
            i7++;
        }
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(this.f18640a, lAcquire, false);
        try {
            int iJ = androidx.camera.core.impl.utils.executor.g.j(cursorK, "work_spec_id");
            if (iJ == -1) {
                cursorK.close();
                return;
            }
            while (cursorK.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorK.getString(iJ));
                if (arrayList != null) {
                    arrayList.add(cursorK.getString(0));
                }
            }
            cursorK.close();
        } catch (Throwable th) {
            cursorK.close();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int countNonFinishedContentUriTriggerWorkers() {
        L lAcquire = L.f17714j.acquire("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            return cursorK.moveToFirst() ? cursorK.getInt(0) : 0;
        } finally {
            cursorK.close();
            lAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void delete(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18643d;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindString(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getAllEligibleWorkSpecsForScheduling(int i7) throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        lAcquire.bindLong(1, i7);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            int iK = androidx.camera.core.impl.utils.executor.g.k(cursorK, "id");
            int iK2 = androidx.camera.core.impl.utils.executor.g.k(cursorK, RemoteConfigConstants.ResponseFieldKey.STATE);
            int iK3 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "worker_class_name");
            int iK4 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input_merger_class_name");
            int iK5 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input");
            int iK6 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "output");
            int iK7 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "initial_delay");
            int iK8 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "interval_duration");
            int iK9 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "flex_duration");
            int iK10 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_attempt_count");
            int iK11 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_policy");
            int iK12 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_delay_duration");
            int iK13 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "last_enqueue_time");
            l5 = lAcquire;
            try {
                int iK14 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "minimum_retention_duration");
                int iK15 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "schedule_requested_at");
                int iK16 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_in_foreground");
                int iK17 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "out_of_quota_policy");
                int iK18 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "period_count");
                int iK19 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "generation");
                int iK20 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override");
                int iK21 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override_generation");
                int iK22 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "stop_reason");
                int iK23 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trace_tag");
                int iK24 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_type");
                int iK25 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_request");
                int iK26 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_charging");
                int iK27 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_device_idle");
                int iK28 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_battery_not_low");
                int iK29 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_storage_not_low");
                int iK30 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_content_update_delay");
                int iK31 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_max_content_delay");
                int iK32 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "content_uri_triggers");
                int i10 = iK14;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(iK);
                    Q qL = org.chromium.support_lib_boundary.util.b.L(cursorK.getInt(iK2));
                    String string2 = cursorK.getString(iK3);
                    String string3 = cursorK.getString(iK4);
                    byte[] blob = cursorK.getBlob(iK5);
                    int i11 = iK;
                    C0693l c0693l = C0695n.f9956b;
                    C0695n c0695nFromByteArray = c0693l.fromByteArray(blob);
                    C0695n c0695nFromByteArray2 = c0693l.fromByteArray(cursorK.getBlob(iK6));
                    long j6 = cursorK.getLong(iK7);
                    long j10 = cursorK.getLong(iK8);
                    long j11 = cursorK.getLong(iK9);
                    int i12 = cursorK.getInt(iK10);
                    EnumC0682a enumC0682aI = org.chromium.support_lib_boundary.util.b.I(cursorK.getInt(iK11));
                    long j12 = cursorK.getLong(iK12);
                    long j13 = cursorK.getLong(iK13);
                    int i13 = i10;
                    long j14 = cursorK.getLong(i13);
                    int i14 = iK15;
                    long j15 = cursorK.getLong(i14);
                    i10 = i13;
                    int i15 = iK16;
                    boolean z3 = cursorK.getInt(i15) != 0;
                    iK16 = i15;
                    int i16 = iK17;
                    K K4 = org.chromium.support_lib_boundary.util.b.K(cursorK.getInt(i16));
                    iK17 = i16;
                    int i17 = iK18;
                    int i18 = cursorK.getInt(i17);
                    iK18 = i17;
                    int i19 = iK19;
                    int i20 = cursorK.getInt(i19);
                    iK19 = i19;
                    int i21 = iK20;
                    long j16 = cursorK.getLong(i21);
                    iK20 = i21;
                    int i22 = iK21;
                    int i23 = cursorK.getInt(i22);
                    iK21 = i22;
                    int i24 = iK22;
                    int i25 = cursorK.getInt(i24);
                    iK22 = i24;
                    int i26 = iK23;
                    iK23 = i26;
                    String string4 = cursorK.isNull(i26) ? null : cursorK.getString(i26);
                    int i27 = iK24;
                    D dJ = org.chromium.support_lib_boundary.util.b.J(cursorK.getInt(i27));
                    iK24 = i27;
                    int i28 = iK25;
                    androidx.work.impl.utils.g gVarO0 = org.chromium.support_lib_boundary.util.b.o0(cursorK.getBlob(i28));
                    iK25 = i28;
                    int i29 = iK26;
                    boolean z8 = cursorK.getInt(i29) != 0;
                    iK26 = i29;
                    int i30 = iK27;
                    boolean z10 = cursorK.getInt(i30) != 0;
                    iK27 = i30;
                    int i31 = iK28;
                    boolean z11 = cursorK.getInt(i31) != 0;
                    iK28 = i31;
                    int i32 = iK29;
                    boolean z12 = cursorK.getInt(i32) != 0;
                    iK29 = i32;
                    int i33 = iK30;
                    long j17 = cursorK.getLong(i33);
                    iK30 = i33;
                    int i34 = iK31;
                    long j18 = cursorK.getLong(i34);
                    iK31 = i34;
                    int i35 = iK32;
                    iK32 = i35;
                    arrayList.add(new k(string, qL, string2, string3, c0695nFromByteArray, c0695nFromByteArray2, j6, j10, j11, new C0689h(gVarO0, dJ, z8, z10, z11, z12, j17, j18, org.chromium.support_lib_boundary.util.b.l(cursorK.getBlob(i35))), i12, enumC0682aI, j12, j13, j14, j15, z3, K4, i18, i20, j16, i23, i25, string4));
                    iK15 = i14;
                    iK = i11;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getAllUnfinishedWork() {
        L lAcquire = L.f17714j.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(cursorK.getString(0));
            }
            cursorK.close();
            lAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorK.close();
            lAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getAllWorkSpecIds() {
        L lAcquire = L.f17714j.acquire("SELECT id FROM workspec", 0);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(cursorK.getString(0));
            }
            cursorK.close();
            lAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorK.close();
            lAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final B getAllWorkSpecIdsLiveData() {
        return this.f18640a.getInvalidationTracker().b(new String[]{"workspec"}, true, new m(this, L.f17714j.acquire("SELECT id FROM workspec", 0), 0));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getEligibleWorkForScheduling(int i7) throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        lAcquire.bindLong(1, i7);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            int iK = androidx.camera.core.impl.utils.executor.g.k(cursorK, "id");
            int iK2 = androidx.camera.core.impl.utils.executor.g.k(cursorK, RemoteConfigConstants.ResponseFieldKey.STATE);
            int iK3 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "worker_class_name");
            int iK4 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input_merger_class_name");
            int iK5 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input");
            int iK6 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "output");
            int iK7 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "initial_delay");
            int iK8 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "interval_duration");
            int iK9 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "flex_duration");
            int iK10 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_attempt_count");
            int iK11 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_policy");
            int iK12 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_delay_duration");
            int iK13 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "last_enqueue_time");
            l5 = lAcquire;
            try {
                int iK14 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "minimum_retention_duration");
                int iK15 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "schedule_requested_at");
                int iK16 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_in_foreground");
                int iK17 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "out_of_quota_policy");
                int iK18 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "period_count");
                int iK19 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "generation");
                int iK20 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override");
                int iK21 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override_generation");
                int iK22 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "stop_reason");
                int iK23 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trace_tag");
                int iK24 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_type");
                int iK25 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_request");
                int iK26 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_charging");
                int iK27 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_device_idle");
                int iK28 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_battery_not_low");
                int iK29 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_storage_not_low");
                int iK30 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_content_update_delay");
                int iK31 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_max_content_delay");
                int iK32 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "content_uri_triggers");
                int i10 = iK14;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(iK);
                    Q qL = org.chromium.support_lib_boundary.util.b.L(cursorK.getInt(iK2));
                    String string2 = cursorK.getString(iK3);
                    String string3 = cursorK.getString(iK4);
                    byte[] blob = cursorK.getBlob(iK5);
                    int i11 = iK;
                    C0693l c0693l = C0695n.f9956b;
                    C0695n c0695nFromByteArray = c0693l.fromByteArray(blob);
                    C0695n c0695nFromByteArray2 = c0693l.fromByteArray(cursorK.getBlob(iK6));
                    long j6 = cursorK.getLong(iK7);
                    long j10 = cursorK.getLong(iK8);
                    long j11 = cursorK.getLong(iK9);
                    int i12 = cursorK.getInt(iK10);
                    EnumC0682a enumC0682aI = org.chromium.support_lib_boundary.util.b.I(cursorK.getInt(iK11));
                    long j12 = cursorK.getLong(iK12);
                    long j13 = cursorK.getLong(iK13);
                    int i13 = i10;
                    long j14 = cursorK.getLong(i13);
                    int i14 = iK15;
                    long j15 = cursorK.getLong(i14);
                    i10 = i13;
                    int i15 = iK16;
                    boolean z3 = cursorK.getInt(i15) != 0;
                    iK16 = i15;
                    int i16 = iK17;
                    K K4 = org.chromium.support_lib_boundary.util.b.K(cursorK.getInt(i16));
                    iK17 = i16;
                    int i17 = iK18;
                    int i18 = cursorK.getInt(i17);
                    iK18 = i17;
                    int i19 = iK19;
                    int i20 = cursorK.getInt(i19);
                    iK19 = i19;
                    int i21 = iK20;
                    long j16 = cursorK.getLong(i21);
                    iK20 = i21;
                    int i22 = iK21;
                    int i23 = cursorK.getInt(i22);
                    iK21 = i22;
                    int i24 = iK22;
                    int i25 = cursorK.getInt(i24);
                    iK22 = i24;
                    int i26 = iK23;
                    iK23 = i26;
                    String string4 = cursorK.isNull(i26) ? null : cursorK.getString(i26);
                    int i27 = iK24;
                    D dJ = org.chromium.support_lib_boundary.util.b.J(cursorK.getInt(i27));
                    iK24 = i27;
                    int i28 = iK25;
                    androidx.work.impl.utils.g gVarO0 = org.chromium.support_lib_boundary.util.b.o0(cursorK.getBlob(i28));
                    iK25 = i28;
                    int i29 = iK26;
                    boolean z8 = cursorK.getInt(i29) != 0;
                    iK26 = i29;
                    int i30 = iK27;
                    boolean z10 = cursorK.getInt(i30) != 0;
                    iK27 = i30;
                    int i31 = iK28;
                    boolean z11 = cursorK.getInt(i31) != 0;
                    iK28 = i31;
                    int i32 = iK29;
                    boolean z12 = cursorK.getInt(i32) != 0;
                    iK29 = i32;
                    int i33 = iK30;
                    long j17 = cursorK.getLong(i33);
                    iK30 = i33;
                    int i34 = iK31;
                    long j18 = cursorK.getLong(i34);
                    iK31 = i34;
                    int i35 = iK32;
                    iK32 = i35;
                    arrayList.add(new k(string, qL, string2, string3, c0695nFromByteArray, c0695nFromByteArray2, j6, j10, j11, new C0689h(gVarO0, dJ, z8, z10, z11, z12, j17, j18, org.chromium.support_lib_boundary.util.b.l(cursorK.getBlob(i35))), i12, enumC0682aI, j12, j13, j14, j15, z3, K4, i18, i20, j16, i23, i25, string4));
                    iK15 = i14;
                    iK = i11;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getEligibleWorkForSchedulingWithContentUris() throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            int iK = androidx.camera.core.impl.utils.executor.g.k(cursorK, "id");
            int iK2 = androidx.camera.core.impl.utils.executor.g.k(cursorK, RemoteConfigConstants.ResponseFieldKey.STATE);
            int iK3 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "worker_class_name");
            int iK4 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input_merger_class_name");
            int iK5 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input");
            int iK6 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "output");
            int iK7 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "initial_delay");
            int iK8 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "interval_duration");
            int iK9 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "flex_duration");
            int iK10 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_attempt_count");
            int iK11 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_policy");
            int iK12 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_delay_duration");
            int iK13 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "last_enqueue_time");
            l5 = lAcquire;
            try {
                int iK14 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "minimum_retention_duration");
                int iK15 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "schedule_requested_at");
                int iK16 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_in_foreground");
                int iK17 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "out_of_quota_policy");
                int iK18 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "period_count");
                int iK19 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "generation");
                int iK20 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override");
                int iK21 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override_generation");
                int iK22 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "stop_reason");
                int iK23 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trace_tag");
                int iK24 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_type");
                int iK25 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_request");
                int iK26 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_charging");
                int iK27 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_device_idle");
                int iK28 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_battery_not_low");
                int iK29 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_storage_not_low");
                int iK30 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_content_update_delay");
                int iK31 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_max_content_delay");
                int iK32 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "content_uri_triggers");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(iK);
                    Q qL = org.chromium.support_lib_boundary.util.b.L(cursorK.getInt(iK2));
                    String string2 = cursorK.getString(iK3);
                    String string3 = cursorK.getString(iK4);
                    byte[] blob = cursorK.getBlob(iK5);
                    int i10 = iK;
                    C0693l c0693l = C0695n.f9956b;
                    C0695n c0695nFromByteArray = c0693l.fromByteArray(blob);
                    C0695n c0695nFromByteArray2 = c0693l.fromByteArray(cursorK.getBlob(iK6));
                    long j6 = cursorK.getLong(iK7);
                    long j10 = cursorK.getLong(iK8);
                    long j11 = cursorK.getLong(iK9);
                    int i11 = cursorK.getInt(iK10);
                    EnumC0682a enumC0682aI = org.chromium.support_lib_boundary.util.b.I(cursorK.getInt(iK11));
                    long j12 = cursorK.getLong(iK12);
                    long j13 = cursorK.getLong(iK13);
                    int i12 = i7;
                    long j14 = cursorK.getLong(i12);
                    int i13 = iK15;
                    long j15 = cursorK.getLong(i13);
                    i7 = i12;
                    int i14 = iK16;
                    boolean z3 = cursorK.getInt(i14) != 0;
                    int i15 = iK17;
                    K K4 = org.chromium.support_lib_boundary.util.b.K(cursorK.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorK.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorK.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    long j16 = cursorK.getLong(i20);
                    iK20 = i20;
                    int i21 = iK21;
                    int i22 = cursorK.getInt(i21);
                    iK21 = i21;
                    int i23 = iK22;
                    int i24 = cursorK.getInt(i23);
                    iK22 = i23;
                    int i25 = iK23;
                    String string4 = cursorK.isNull(i25) ? null : cursorK.getString(i25);
                    iK23 = i25;
                    int i26 = iK24;
                    D dJ = org.chromium.support_lib_boundary.util.b.J(cursorK.getInt(i26));
                    iK24 = i26;
                    int i27 = iK25;
                    androidx.work.impl.utils.g gVarO0 = org.chromium.support_lib_boundary.util.b.o0(cursorK.getBlob(i27));
                    iK25 = i27;
                    int i28 = iK26;
                    boolean z8 = cursorK.getInt(i28) != 0;
                    iK26 = i28;
                    int i29 = iK27;
                    boolean z10 = cursorK.getInt(i29) != 0;
                    iK27 = i29;
                    int i30 = iK28;
                    boolean z11 = cursorK.getInt(i30) != 0;
                    iK28 = i30;
                    int i31 = iK29;
                    boolean z12 = cursorK.getInt(i31) != 0;
                    iK29 = i31;
                    int i32 = iK30;
                    long j17 = cursorK.getLong(i32);
                    iK30 = i32;
                    int i33 = iK31;
                    long j18 = cursorK.getLong(i33);
                    iK31 = i33;
                    int i34 = iK32;
                    iK32 = i34;
                    arrayList.add(new k(string, qL, string2, string3, c0695nFromByteArray, c0695nFromByteArray2, j6, j10, j11, new C0689h(gVarO0, dJ, z8, z10, z11, z12, j17, j18, org.chromium.support_lib_boundary.util.b.l(cursorK.getBlob(i34))), i11, enumC0682aI, j12, j13, j14, j15, z3, K4, i17, i19, j16, i22, i24, string4));
                    iK16 = i14;
                    iK = i10;
                    iK15 = i13;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getInputsFromPrerequisites(String str) {
        L lAcquire = L.f17714j.acquire("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(C0695n.f9956b.fromByteArray(cursorK.getBlob(0)));
            }
            cursorK.close();
            lAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorK.close();
            lAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getRecentlyCompletedWork(long j6) throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        lAcquire.bindLong(1, j6);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            int iK = androidx.camera.core.impl.utils.executor.g.k(cursorK, "id");
            int iK2 = androidx.camera.core.impl.utils.executor.g.k(cursorK, RemoteConfigConstants.ResponseFieldKey.STATE);
            int iK3 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "worker_class_name");
            int iK4 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input_merger_class_name");
            int iK5 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input");
            int iK6 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "output");
            int iK7 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "initial_delay");
            int iK8 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "interval_duration");
            int iK9 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "flex_duration");
            int iK10 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_attempt_count");
            int iK11 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_policy");
            int iK12 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_delay_duration");
            int iK13 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "last_enqueue_time");
            l5 = lAcquire;
            try {
                int iK14 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "minimum_retention_duration");
                int iK15 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "schedule_requested_at");
                int iK16 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_in_foreground");
                int iK17 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "out_of_quota_policy");
                int iK18 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "period_count");
                int iK19 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "generation");
                int iK20 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override");
                int iK21 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override_generation");
                int iK22 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "stop_reason");
                int iK23 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trace_tag");
                int iK24 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_type");
                int iK25 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_request");
                int iK26 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_charging");
                int iK27 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_device_idle");
                int iK28 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_battery_not_low");
                int iK29 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_storage_not_low");
                int iK30 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_content_update_delay");
                int iK31 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_max_content_delay");
                int iK32 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "content_uri_triggers");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(iK);
                    Q qL = org.chromium.support_lib_boundary.util.b.L(cursorK.getInt(iK2));
                    String string2 = cursorK.getString(iK3);
                    String string3 = cursorK.getString(iK4);
                    byte[] blob = cursorK.getBlob(iK5);
                    int i10 = iK;
                    C0693l c0693l = C0695n.f9956b;
                    C0695n c0695nFromByteArray = c0693l.fromByteArray(blob);
                    C0695n c0695nFromByteArray2 = c0693l.fromByteArray(cursorK.getBlob(iK6));
                    long j10 = cursorK.getLong(iK7);
                    long j11 = cursorK.getLong(iK8);
                    long j12 = cursorK.getLong(iK9);
                    int i11 = cursorK.getInt(iK10);
                    EnumC0682a enumC0682aI = org.chromium.support_lib_boundary.util.b.I(cursorK.getInt(iK11));
                    long j13 = cursorK.getLong(iK12);
                    long j14 = cursorK.getLong(iK13);
                    int i12 = i7;
                    long j15 = cursorK.getLong(i12);
                    int i13 = iK15;
                    long j16 = cursorK.getLong(i13);
                    i7 = i12;
                    int i14 = iK16;
                    boolean z3 = cursorK.getInt(i14) != 0;
                    iK16 = i14;
                    int i15 = iK17;
                    K K4 = org.chromium.support_lib_boundary.util.b.K(cursorK.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorK.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorK.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    long j17 = cursorK.getLong(i20);
                    iK20 = i20;
                    int i21 = iK21;
                    int i22 = cursorK.getInt(i21);
                    iK21 = i21;
                    int i23 = iK22;
                    int i24 = cursorK.getInt(i23);
                    iK22 = i23;
                    int i25 = iK23;
                    String string4 = cursorK.isNull(i25) ? null : cursorK.getString(i25);
                    iK23 = i25;
                    int i26 = iK24;
                    D dJ = org.chromium.support_lib_boundary.util.b.J(cursorK.getInt(i26));
                    iK24 = i26;
                    int i27 = iK25;
                    androidx.work.impl.utils.g gVarO0 = org.chromium.support_lib_boundary.util.b.o0(cursorK.getBlob(i27));
                    iK25 = i27;
                    int i28 = iK26;
                    boolean z8 = cursorK.getInt(i28) != 0;
                    iK26 = i28;
                    int i29 = iK27;
                    boolean z10 = cursorK.getInt(i29) != 0;
                    iK27 = i29;
                    int i30 = iK28;
                    boolean z11 = cursorK.getInt(i30) != 0;
                    iK28 = i30;
                    int i31 = iK29;
                    boolean z12 = cursorK.getInt(i31) != 0;
                    iK29 = i31;
                    int i32 = iK30;
                    long j18 = cursorK.getLong(i32);
                    iK30 = i32;
                    int i33 = iK31;
                    long j19 = cursorK.getLong(i33);
                    iK31 = i33;
                    int i34 = iK32;
                    iK32 = i34;
                    arrayList.add(new k(string, qL, string2, string3, c0695nFromByteArray, c0695nFromByteArray2, j10, j11, j12, new C0689h(gVarO0, dJ, z8, z10, z11, z12, j18, j19, org.chromium.support_lib_boundary.util.b.l(cursorK.getBlob(i34))), i11, enumC0682aI, j13, j14, j15, j16, z3, K4, i17, i19, j17, i22, i24, string4));
                    iK15 = i13;
                    iK = i10;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getRunningWork() throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM workspec WHERE state=1", 0);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            int iK = androidx.camera.core.impl.utils.executor.g.k(cursorK, "id");
            int iK2 = androidx.camera.core.impl.utils.executor.g.k(cursorK, RemoteConfigConstants.ResponseFieldKey.STATE);
            int iK3 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "worker_class_name");
            int iK4 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input_merger_class_name");
            int iK5 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input");
            int iK6 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "output");
            int iK7 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "initial_delay");
            int iK8 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "interval_duration");
            int iK9 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "flex_duration");
            int iK10 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_attempt_count");
            int iK11 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_policy");
            int iK12 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_delay_duration");
            int iK13 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "last_enqueue_time");
            l5 = lAcquire;
            try {
                int iK14 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "minimum_retention_duration");
                int iK15 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "schedule_requested_at");
                int iK16 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_in_foreground");
                int iK17 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "out_of_quota_policy");
                int iK18 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "period_count");
                int iK19 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "generation");
                int iK20 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override");
                int iK21 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override_generation");
                int iK22 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "stop_reason");
                int iK23 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trace_tag");
                int iK24 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_type");
                int iK25 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_request");
                int iK26 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_charging");
                int iK27 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_device_idle");
                int iK28 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_battery_not_low");
                int iK29 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_storage_not_low");
                int iK30 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_content_update_delay");
                int iK31 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_max_content_delay");
                int iK32 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "content_uri_triggers");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(iK);
                    Q qL = org.chromium.support_lib_boundary.util.b.L(cursorK.getInt(iK2));
                    String string2 = cursorK.getString(iK3);
                    String string3 = cursorK.getString(iK4);
                    byte[] blob = cursorK.getBlob(iK5);
                    int i10 = iK;
                    C0693l c0693l = C0695n.f9956b;
                    C0695n c0695nFromByteArray = c0693l.fromByteArray(blob);
                    C0695n c0695nFromByteArray2 = c0693l.fromByteArray(cursorK.getBlob(iK6));
                    long j6 = cursorK.getLong(iK7);
                    long j10 = cursorK.getLong(iK8);
                    long j11 = cursorK.getLong(iK9);
                    int i11 = cursorK.getInt(iK10);
                    EnumC0682a enumC0682aI = org.chromium.support_lib_boundary.util.b.I(cursorK.getInt(iK11));
                    long j12 = cursorK.getLong(iK12);
                    long j13 = cursorK.getLong(iK13);
                    int i12 = i7;
                    long j14 = cursorK.getLong(i12);
                    int i13 = iK15;
                    long j15 = cursorK.getLong(i13);
                    i7 = i12;
                    int i14 = iK16;
                    boolean z3 = cursorK.getInt(i14) != 0;
                    int i15 = iK17;
                    K K4 = org.chromium.support_lib_boundary.util.b.K(cursorK.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorK.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorK.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    long j16 = cursorK.getLong(i20);
                    iK20 = i20;
                    int i21 = iK21;
                    int i22 = cursorK.getInt(i21);
                    iK21 = i21;
                    int i23 = iK22;
                    int i24 = cursorK.getInt(i23);
                    iK22 = i23;
                    int i25 = iK23;
                    String string4 = cursorK.isNull(i25) ? null : cursorK.getString(i25);
                    iK23 = i25;
                    int i26 = iK24;
                    D dJ = org.chromium.support_lib_boundary.util.b.J(cursorK.getInt(i26));
                    iK24 = i26;
                    int i27 = iK25;
                    androidx.work.impl.utils.g gVarO0 = org.chromium.support_lib_boundary.util.b.o0(cursorK.getBlob(i27));
                    iK25 = i27;
                    int i28 = iK26;
                    boolean z8 = cursorK.getInt(i28) != 0;
                    iK26 = i28;
                    int i29 = iK27;
                    boolean z10 = cursorK.getInt(i29) != 0;
                    iK27 = i29;
                    int i30 = iK28;
                    boolean z11 = cursorK.getInt(i30) != 0;
                    iK28 = i30;
                    int i31 = iK29;
                    boolean z12 = cursorK.getInt(i31) != 0;
                    iK29 = i31;
                    int i32 = iK30;
                    long j17 = cursorK.getLong(i32);
                    iK30 = i32;
                    int i33 = iK31;
                    long j18 = cursorK.getLong(i33);
                    iK31 = i33;
                    int i34 = iK32;
                    iK32 = i34;
                    arrayList.add(new k(string, qL, string2, string3, c0695nFromByteArray, c0695nFromByteArray2, j6, j10, j11, new C0689h(gVarO0, dJ, z8, z10, z11, z12, j17, j18, org.chromium.support_lib_boundary.util.b.l(cursorK.getBlob(i34))), i11, enumC0682aI, j12, j13, j14, j15, z3, K4, i17, i19, j16, i22, i24, string4));
                    iK16 = i14;
                    iK = i10;
                    iK15 = i13;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final B getScheduleRequestedAtLiveData(String str) {
        L lAcquire = L.f17714j.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        lAcquire.bindString(1, str);
        return this.f18640a.getInvalidationTracker().b(new String[]{"workspec"}, false, new m(this, lAcquire, 8));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getScheduledWork() throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            int iK = androidx.camera.core.impl.utils.executor.g.k(cursorK, "id");
            int iK2 = androidx.camera.core.impl.utils.executor.g.k(cursorK, RemoteConfigConstants.ResponseFieldKey.STATE);
            int iK3 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "worker_class_name");
            int iK4 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input_merger_class_name");
            int iK5 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input");
            int iK6 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "output");
            int iK7 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "initial_delay");
            int iK8 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "interval_duration");
            int iK9 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "flex_duration");
            int iK10 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_attempt_count");
            int iK11 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_policy");
            int iK12 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_delay_duration");
            int iK13 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "last_enqueue_time");
            l5 = lAcquire;
            try {
                int iK14 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "minimum_retention_duration");
                int iK15 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "schedule_requested_at");
                int iK16 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_in_foreground");
                int iK17 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "out_of_quota_policy");
                int iK18 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "period_count");
                int iK19 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "generation");
                int iK20 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override");
                int iK21 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override_generation");
                int iK22 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "stop_reason");
                int iK23 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trace_tag");
                int iK24 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_type");
                int iK25 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_request");
                int iK26 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_charging");
                int iK27 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_device_idle");
                int iK28 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_battery_not_low");
                int iK29 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_storage_not_low");
                int iK30 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_content_update_delay");
                int iK31 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_max_content_delay");
                int iK32 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "content_uri_triggers");
                int i7 = iK14;
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(iK);
                    Q qL = org.chromium.support_lib_boundary.util.b.L(cursorK.getInt(iK2));
                    String string2 = cursorK.getString(iK3);
                    String string3 = cursorK.getString(iK4);
                    byte[] blob = cursorK.getBlob(iK5);
                    int i10 = iK;
                    C0693l c0693l = C0695n.f9956b;
                    C0695n c0695nFromByteArray = c0693l.fromByteArray(blob);
                    C0695n c0695nFromByteArray2 = c0693l.fromByteArray(cursorK.getBlob(iK6));
                    long j6 = cursorK.getLong(iK7);
                    long j10 = cursorK.getLong(iK8);
                    long j11 = cursorK.getLong(iK9);
                    int i11 = cursorK.getInt(iK10);
                    EnumC0682a enumC0682aI = org.chromium.support_lib_boundary.util.b.I(cursorK.getInt(iK11));
                    long j12 = cursorK.getLong(iK12);
                    long j13 = cursorK.getLong(iK13);
                    int i12 = i7;
                    long j14 = cursorK.getLong(i12);
                    int i13 = iK15;
                    long j15 = cursorK.getLong(i13);
                    i7 = i12;
                    int i14 = iK16;
                    boolean z3 = cursorK.getInt(i14) != 0;
                    int i15 = iK17;
                    K K4 = org.chromium.support_lib_boundary.util.b.K(cursorK.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorK.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorK.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    long j16 = cursorK.getLong(i20);
                    iK20 = i20;
                    int i21 = iK21;
                    int i22 = cursorK.getInt(i21);
                    iK21 = i21;
                    int i23 = iK22;
                    int i24 = cursorK.getInt(i23);
                    iK22 = i23;
                    int i25 = iK23;
                    String string4 = cursorK.isNull(i25) ? null : cursorK.getString(i25);
                    iK23 = i25;
                    int i26 = iK24;
                    D dJ = org.chromium.support_lib_boundary.util.b.J(cursorK.getInt(i26));
                    iK24 = i26;
                    int i27 = iK25;
                    androidx.work.impl.utils.g gVarO0 = org.chromium.support_lib_boundary.util.b.o0(cursorK.getBlob(i27));
                    iK25 = i27;
                    int i28 = iK26;
                    boolean z8 = cursorK.getInt(i28) != 0;
                    iK26 = i28;
                    int i29 = iK27;
                    boolean z10 = cursorK.getInt(i29) != 0;
                    iK27 = i29;
                    int i30 = iK28;
                    boolean z11 = cursorK.getInt(i30) != 0;
                    iK28 = i30;
                    int i31 = iK29;
                    boolean z12 = cursorK.getInt(i31) != 0;
                    iK29 = i31;
                    int i32 = iK30;
                    long j17 = cursorK.getLong(i32);
                    iK30 = i32;
                    int i33 = iK31;
                    long j18 = cursorK.getLong(i33);
                    iK31 = i33;
                    int i34 = iK32;
                    iK32 = i34;
                    arrayList.add(new k(string, qL, string2, string3, c0695nFromByteArray, c0695nFromByteArray2, j6, j10, j11, new C0689h(gVarO0, dJ, z8, z10, z11, z12, j17, j18, org.chromium.support_lib_boundary.util.b.l(cursorK.getBlob(i34))), i11, enumC0682aI, j12, j13, j14, j15, z3, K4, i17, i19, j16, i22, i24, string4));
                    iK16 = i14;
                    iK = i10;
                    iK15 = i13;
                }
                cursorK.close();
                l5.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final Q getState(String str) {
        L lAcquire = L.f17714j.acquire("SELECT state FROM workspec WHERE id=?", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            Q qL = null;
            if (cursorK.moveToFirst()) {
                Integer numValueOf = cursorK.isNull(0) ? null : Integer.valueOf(cursorK.getInt(0));
                if (numValueOf != null) {
                    qL = org.chromium.support_lib_boundary.util.b.L(numValueOf.intValue());
                }
            }
            return qL;
        } finally {
            cursorK.close();
            lAcquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getUnfinishedWorkWithName(String str) {
        L lAcquire = L.f17714j.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(cursorK.getString(0));
            }
            cursorK.close();
            lAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorK.close();
            lAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getUnfinishedWorkWithTag(String str) {
        L lAcquire = L.f17714j.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                arrayList.add(cursorK.getString(0));
            }
            cursorK.close();
            lAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorK.close();
            lAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final k getWorkSpec(String str) throws Throwable {
        L l5;
        L lAcquire = L.f17714j.acquire("SELECT * FROM workspec WHERE id=?", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            int iK = androidx.camera.core.impl.utils.executor.g.k(cursorK, "id");
            int iK2 = androidx.camera.core.impl.utils.executor.g.k(cursorK, RemoteConfigConstants.ResponseFieldKey.STATE);
            int iK3 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "worker_class_name");
            int iK4 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input_merger_class_name");
            int iK5 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "input");
            int iK6 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "output");
            int iK7 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "initial_delay");
            int iK8 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "interval_duration");
            int iK9 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "flex_duration");
            int iK10 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_attempt_count");
            int iK11 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_policy");
            int iK12 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "backoff_delay_duration");
            int iK13 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "last_enqueue_time");
            l5 = lAcquire;
            try {
                int iK14 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "minimum_retention_duration");
                int iK15 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "schedule_requested_at");
                int iK16 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "run_in_foreground");
                int iK17 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "out_of_quota_policy");
                int iK18 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "period_count");
                int iK19 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "generation");
                int iK20 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override");
                int iK21 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "next_schedule_time_override_generation");
                int iK22 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "stop_reason");
                int iK23 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trace_tag");
                int iK24 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_type");
                int iK25 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "required_network_request");
                int iK26 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_charging");
                int iK27 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_device_idle");
                int iK28 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_battery_not_low");
                int iK29 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "requires_storage_not_low");
                int iK30 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_content_update_delay");
                int iK31 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "trigger_max_content_delay");
                int iK32 = androidx.camera.core.impl.utils.executor.g.k(cursorK, "content_uri_triggers");
                k kVar = null;
                if (cursorK.moveToFirst()) {
                    String string = cursorK.getString(iK);
                    Q qL = org.chromium.support_lib_boundary.util.b.L(cursorK.getInt(iK2));
                    String string2 = cursorK.getString(iK3);
                    String string3 = cursorK.getString(iK4);
                    byte[] blob = cursorK.getBlob(iK5);
                    C0693l c0693l = C0695n.f9956b;
                    kVar = new k(string, qL, string2, string3, c0693l.fromByteArray(blob), c0693l.fromByteArray(cursorK.getBlob(iK6)), cursorK.getLong(iK7), cursorK.getLong(iK8), cursorK.getLong(iK9), new C0689h(org.chromium.support_lib_boundary.util.b.o0(cursorK.getBlob(iK25)), org.chromium.support_lib_boundary.util.b.J(cursorK.getInt(iK24)), cursorK.getInt(iK26) != 0, cursorK.getInt(iK27) != 0, cursorK.getInt(iK28) != 0, cursorK.getInt(iK29) != 0, cursorK.getLong(iK30), cursorK.getLong(iK31), org.chromium.support_lib_boundary.util.b.l(cursorK.getBlob(iK32))), cursorK.getInt(iK10), org.chromium.support_lib_boundary.util.b.I(cursorK.getInt(iK11)), cursorK.getLong(iK12), cursorK.getLong(iK13), cursorK.getLong(iK14), cursorK.getLong(iK15), cursorK.getInt(iK16) != 0, org.chromium.support_lib_boundary.util.b.K(cursorK.getInt(iK17)), cursorK.getInt(iK18), cursorK.getInt(iK19), cursorK.getLong(iK20), cursorK.getInt(iK21), cursorK.getInt(iK22), cursorK.isNull(iK23) ? null : cursorK.getString(iK23));
                }
                cursorK.close();
                l5.release();
                return kVar;
            } catch (Throwable th) {
                th = th;
                cursorK.close();
                l5.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            l5 = lAcquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getWorkSpecIdAndStatesForName(String str) {
        L lAcquire = L.f17714j.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, false);
        try {
            ArrayList arrayList = new ArrayList(cursorK.getCount());
            while (cursorK.moveToNext()) {
                String id2 = cursorK.getString(0);
                Q state = org.chromium.support_lib_boundary.util.b.L(cursorK.getInt(1));
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(state, "state");
                i iVar = new i();
                iVar.f18591a = id2;
                iVar.f18592b = state;
                arrayList.add(iVar);
            }
            cursorK.close();
            lAcquire.release();
            return arrayList;
        } catch (Throwable th) {
            cursorK.close();
            lAcquire.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final Flow getWorkStatusPojoFlowDataForIds(List list) {
        StringBuilder sbS = u.s("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        p059e1.a.b(size, sbS);
        sbS.append(")");
        L lAcquire = L.f17714j.acquire(sbS.toString(), size);
        Iterator it = list.iterator();
        int i7 = 1;
        while (it.hasNext()) {
            lAcquire.bindString(i7, (String) it.next());
            i7++;
        }
        return AbstractC1233l.f17770a.createFlow(this.f18640a, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new m(this, lAcquire, 2));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final Flow getWorkStatusPojoFlowForName(String str) {
        L lAcquire = L.f17714j.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        lAcquire.bindString(1, str);
        m mVar = new m(this, lAcquire, 6);
        return AbstractC1233l.f17770a.createFlow(this.f18640a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, mVar);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final Flow getWorkStatusPojoFlowForTag(String str) {
        L lAcquire = L.f17714j.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        lAcquire.bindString(1, str);
        m mVar = new m(this, lAcquire, 3);
        return AbstractC1233l.f17770a.createFlow(this.f18640a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, mVar);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final j getWorkStatusPojoForId(String str) {
        j jVar;
        L lAcquire = L.f17714j.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, true);
            try {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorK.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList());
                    }
                }
                cursorK.moveToPosition(-1);
                b(map);
                a(map2);
                if (cursorK.moveToFirst()) {
                    String string3 = cursorK.getString(0);
                    Q qL = org.chromium.support_lib_boundary.util.b.L(cursorK.getInt(1));
                    C0695n c0695nFromByteArray = C0695n.f9956b.fromByteArray(cursorK.getBlob(2));
                    int i7 = cursorK.getInt(3);
                    int i10 = cursorK.getInt(4);
                    jVar = new j(string3, qL, c0695nFromByteArray, cursorK.getLong(14), cursorK.getLong(15), cursorK.getLong(16), new C0689h(org.chromium.support_lib_boundary.util.b.o0(cursorK.getBlob(6)), org.chromium.support_lib_boundary.util.b.J(cursorK.getInt(5)), cursorK.getInt(7) != 0, cursorK.getInt(8) != 0, cursorK.getInt(9) != 0, cursorK.getInt(10) != 0, cursorK.getLong(11), cursorK.getLong(12), org.chromium.support_lib_boundary.util.b.l(cursorK.getBlob(13))), i7, org.chromium.support_lib_boundary.util.b.I(cursorK.getInt(17)), cursorK.getLong(18), cursorK.getLong(19), cursorK.getInt(20), i10, cursorK.getLong(21), cursorK.getInt(22), (ArrayList) map.get(cursorK.getString(0)), (ArrayList) map2.get(cursorK.getString(0)));
                } else {
                    jVar = null;
                }
                workDatabase_Impl.setTransactionSuccessful();
                cursorK.close();
                lAcquire.release();
                workDatabase_Impl.endTransaction();
                return jVar;
            } catch (Throwable th) {
                cursorK.close();
                lAcquire.release();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getWorkStatusPojoForIds(List list) {
        StringBuilder sbS = u.s("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        p059e1.a.b(size, sbS);
        sbS.append(")");
        L lAcquire = L.f17714j.acquire(sbS.toString(), size);
        Iterator it = list.iterator();
        int i7 = 1;
        while (it.hasNext()) {
            lAcquire.bindString(i7, (String) it.next());
            i7++;
        }
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, true);
            try {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorK.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList());
                    }
                }
                cursorK.moveToPosition(-1);
                b(map);
                a(map2);
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    arrayList.add(new j(cursorK.getString(0), org.chromium.support_lib_boundary.util.b.L(cursorK.getInt(1)), C0695n.f9956b.fromByteArray(cursorK.getBlob(2)), cursorK.getLong(14), cursorK.getLong(15), cursorK.getLong(16), new C0689h(org.chromium.support_lib_boundary.util.b.o0(cursorK.getBlob(6)), org.chromium.support_lib_boundary.util.b.J(cursorK.getInt(5)), cursorK.getInt(7) != 0, cursorK.getInt(8) != 0, cursorK.getInt(9) != 0, cursorK.getInt(10) != 0, cursorK.getLong(11), cursorK.getLong(12), org.chromium.support_lib_boundary.util.b.l(cursorK.getBlob(13))), cursorK.getInt(3), org.chromium.support_lib_boundary.util.b.I(cursorK.getInt(17)), cursorK.getLong(18), cursorK.getLong(19), cursorK.getInt(20), cursorK.getInt(4), cursorK.getLong(21), cursorK.getInt(22), (ArrayList) map.get(cursorK.getString(0)), (ArrayList) map2.get(cursorK.getString(0))));
                }
                workDatabase_Impl.setTransactionSuccessful();
                cursorK.close();
                lAcquire.release();
                workDatabase_Impl.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorK.close();
                lAcquire.release();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getWorkStatusPojoForName(String str) {
        L lAcquire = L.f17714j.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, true);
            try {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorK.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList());
                    }
                }
                cursorK.moveToPosition(-1);
                b(map);
                a(map2);
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string3 = cursorK.getString(0);
                    Q qL = org.chromium.support_lib_boundary.util.b.L(cursorK.getInt(1));
                    C0695n c0695nFromByteArray = C0695n.f9956b.fromByteArray(cursorK.getBlob(2));
                    int i7 = cursorK.getInt(3);
                    int i10 = cursorK.getInt(4);
                    arrayList.add(new j(string3, qL, c0695nFromByteArray, cursorK.getLong(14), cursorK.getLong(15), cursorK.getLong(16), new C0689h(org.chromium.support_lib_boundary.util.b.o0(cursorK.getBlob(6)), org.chromium.support_lib_boundary.util.b.J(cursorK.getInt(5)), cursorK.getInt(7) != 0, cursorK.getInt(8) != 0, cursorK.getInt(9) != 0, cursorK.getInt(10) != 0, cursorK.getLong(11), cursorK.getLong(12), org.chromium.support_lib_boundary.util.b.l(cursorK.getBlob(13))), i7, org.chromium.support_lib_boundary.util.b.I(cursorK.getInt(17)), cursorK.getLong(18), cursorK.getLong(19), cursorK.getInt(20), i10, cursorK.getLong(21), cursorK.getInt(22), (ArrayList) map.get(cursorK.getString(0)), (ArrayList) map2.get(cursorK.getString(0))));
                }
                workDatabase_Impl.setTransactionSuccessful();
                cursorK.close();
                lAcquire.release();
                workDatabase_Impl.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorK.close();
                lAcquire.release();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final List getWorkStatusPojoForTag(String str) {
        L lAcquire = L.f17714j.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        lAcquire.bindString(1, str);
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, lAcquire, true);
            try {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                while (cursorK.moveToNext()) {
                    String string = cursorK.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorK.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList());
                    }
                }
                cursorK.moveToPosition(-1);
                b(map);
                a(map2);
                ArrayList arrayList = new ArrayList(cursorK.getCount());
                while (cursorK.moveToNext()) {
                    String string3 = cursorK.getString(0);
                    Q qL = org.chromium.support_lib_boundary.util.b.L(cursorK.getInt(1));
                    C0695n c0695nFromByteArray = C0695n.f9956b.fromByteArray(cursorK.getBlob(2));
                    int i7 = cursorK.getInt(3);
                    int i10 = cursorK.getInt(4);
                    arrayList.add(new j(string3, qL, c0695nFromByteArray, cursorK.getLong(14), cursorK.getLong(15), cursorK.getLong(16), new C0689h(org.chromium.support_lib_boundary.util.b.o0(cursorK.getBlob(6)), org.chromium.support_lib_boundary.util.b.J(cursorK.getInt(5)), cursorK.getInt(7) != 0, cursorK.getInt(8) != 0, cursorK.getInt(9) != 0, cursorK.getInt(10) != 0, cursorK.getLong(11), cursorK.getLong(12), org.chromium.support_lib_boundary.util.b.l(cursorK.getBlob(13))), i7, org.chromium.support_lib_boundary.util.b.I(cursorK.getInt(17)), cursorK.getLong(18), cursorK.getLong(19), cursorK.getInt(20), i10, cursorK.getLong(21), cursorK.getInt(22), (ArrayList) map.get(cursorK.getString(0)), (ArrayList) map2.get(cursorK.getString(0))));
                }
                workDatabase_Impl.setTransactionSuccessful();
                cursorK.close();
                lAcquire.release();
                workDatabase_Impl.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorK.close();
                lAcquire.release();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.endTransaction();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final B getWorkStatusPojoLiveDataForIds(List list) {
        StringBuilder sbS = u.s("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        p059e1.a.b(size, sbS);
        sbS.append(")");
        L lAcquire = L.f17714j.acquire(sbS.toString(), size);
        Iterator it = list.iterator();
        int i7 = 1;
        while (it.hasNext()) {
            lAcquire.bindString(i7, (String) it.next());
            i7++;
        }
        return this.f18640a.getInvalidationTracker().b(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new m(this, lAcquire, 1));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final B getWorkStatusPojoLiveDataForName(String str) {
        L lAcquire = L.f17714j.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        lAcquire.bindString(1, str);
        return this.f18640a.getInvalidationTracker().b(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new m(this, lAcquire, 5));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final B getWorkStatusPojoLiveDataForTag(String str) {
        L lAcquire = L.f17714j.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        lAcquire.bindString(1, str);
        return this.f18640a.getInvalidationTracker().b(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new m(this, lAcquire, 4));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final Flow hasUnfinishedWorkFlow() {
        m mVar = new m(this, L.f17714j.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0), 7);
        return AbstractC1233l.f17770a.createFlow(this.f18640a, false, new String[]{"workspec"}, mVar);
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void incrementGeneration(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18656q;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindString(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void incrementPeriodCount(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18646g;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindString(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int incrementWorkSpecRunAttemptCount(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18649j;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindString(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void insertWorkSpec(k kVar) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f18641b.e(kVar);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int markWorkSpecScheduled(String str, long j6) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18653n;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindLong(1, j6);
        supportSQLiteStatementA.bindString(2, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18655p;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        try {
            workDatabase_Impl.beginTransaction();
            try {
                supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int resetScheduledState() {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18654o;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        try {
            workDatabase_Impl.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void resetWorkSpecNextScheduleTimeOverride(String str, int i7) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18652m;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindString(1, str);
        supportSQLiteStatementA.bindLong(2, i7);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int resetWorkSpecRunAttemptCount(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18650k;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindString(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int setCancelledState(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18645f;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindString(1, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void setLastEnqueueTime(String str, long j6) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18648i;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindLong(1, j6);
        supportSQLiteStatementA.bindString(2, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void setNextScheduleTimeOverride(String str, long j6) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18651l;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindLong(1, j6);
        supportSQLiteStatementA.bindString(2, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void setOutput(String str, C0695n c0695n) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18647h;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindBlob(1, C0695n.f9956b.toByteArrayInternalV1(c0695n));
        supportSQLiteStatementA.bindString(2, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final int setState(Q q10, String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18644e;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindLong(1, org.chromium.support_lib_boundary.util.b.n0(q10));
        supportSQLiteStatementA.bindString(2, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                int iExecuteUpdateDelete = supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void setStopReason(String str, int i7) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        Td.c cVar = this.f18657r;
        SupportSQLiteStatement supportSQLiteStatementA = cVar.a();
        supportSQLiteStatementA.bindLong(1, i7);
        supportSQLiteStatementA.bindString(2, str);
        try {
            workDatabase_Impl.beginTransaction();
            try {
                supportSQLiteStatementA.executeUpdateDelete();
                workDatabase_Impl.setTransactionSuccessful();
                workDatabase_Impl.endTransaction();
                cVar.c(supportSQLiteStatementA);
            } catch (Throwable th) {
                workDatabase_Impl.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            cVar.c(supportSQLiteStatementA);
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public final void updateWorkSpec(k kVar) {
        WorkDatabase_Impl workDatabase_Impl = this.f18640a;
        workDatabase_Impl.assertNotSuspendingTransaction();
        workDatabase_Impl.beginTransaction();
        try {
            this.f18642c.e(kVar);
            workDatabase_Impl.setTransactionSuccessful();
        } finally {
            workDatabase_Impl.endTransaction();
        }
    }
}
