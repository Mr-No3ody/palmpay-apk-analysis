package androidx.work.impl.model;

import V0.C0689h;
import V0.C0695n;
import V0.Q;
import android.database.Cursor;
import androidx.room.L;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f18638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18639c;

    public /* synthetic */ m(Object obj, L l5, int i7) {
        this.f18637a = i7;
        this.f18639c = obj;
        this.f18638b = l5;
    }

    private final Object a() {
        n nVar = (n) this.f18639c;
        WorkDatabase_Impl workDatabase_Impl = nVar.f18640a;
        workDatabase_Impl.beginTransaction();
        try {
            Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, this.f18638b, true);
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
                nVar.b(map);
                nVar.a(map2);
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
                workDatabase_Impl.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorK.close();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.endTransaction();
            throw th2;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean boolValueOf;
        switch (this.f18637a) {
            case 0:
                WorkDatabase_Impl workDatabase_Impl = ((n) this.f18639c).f18640a;
                workDatabase_Impl.beginTransaction();
                try {
                    Cursor cursorK = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl, this.f18638b, false);
                    try {
                        ArrayList arrayList = new ArrayList(cursorK.getCount());
                        while (cursorK.moveToNext()) {
                            arrayList.add(cursorK.getString(0));
                        }
                        workDatabase_Impl.setTransactionSuccessful();
                        cursorK.close();
                        workDatabase_Impl.endTransaction();
                        return arrayList;
                    } catch (Throwable th) {
                        cursorK.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    workDatabase_Impl.endTransaction();
                    throw th2;
                }
            case 1:
                n nVar = (n) this.f18639c;
                WorkDatabase_Impl workDatabase_Impl2 = nVar.f18640a;
                workDatabase_Impl2.beginTransaction();
                try {
                    Cursor cursorK2 = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl2, this.f18638b, true);
                    try {
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        while (cursorK2.moveToNext()) {
                            String string = cursorK2.getString(0);
                            if (!map.containsKey(string)) {
                                map.put(string, new ArrayList());
                            }
                            String string2 = cursorK2.getString(0);
                            if (!map2.containsKey(string2)) {
                                map2.put(string2, new ArrayList());
                            }
                        }
                        cursorK2.moveToPosition(-1);
                        nVar.b(map);
                        nVar.a(map2);
                        ArrayList arrayList2 = new ArrayList(cursorK2.getCount());
                        while (cursorK2.moveToNext()) {
                            String string3 = cursorK2.getString(0);
                            Q qL = org.chromium.support_lib_boundary.util.b.L(cursorK2.getInt(1));
                            C0695n c0695nFromByteArray = C0695n.f9956b.fromByteArray(cursorK2.getBlob(2));
                            int i7 = cursorK2.getInt(3);
                            int i10 = cursorK2.getInt(4);
                            arrayList2.add(new j(string3, qL, c0695nFromByteArray, cursorK2.getLong(14), cursorK2.getLong(15), cursorK2.getLong(16), new C0689h(org.chromium.support_lib_boundary.util.b.o0(cursorK2.getBlob(6)), org.chromium.support_lib_boundary.util.b.J(cursorK2.getInt(5)), cursorK2.getInt(7) != 0, cursorK2.getInt(8) != 0, cursorK2.getInt(9) != 0, cursorK2.getInt(10) != 0, cursorK2.getLong(11), cursorK2.getLong(12), org.chromium.support_lib_boundary.util.b.l(cursorK2.getBlob(13))), i7, org.chromium.support_lib_boundary.util.b.I(cursorK2.getInt(17)), cursorK2.getLong(18), cursorK2.getLong(19), cursorK2.getInt(20), i10, cursorK2.getLong(21), cursorK2.getInt(22), (ArrayList) map.get(cursorK2.getString(0)), (ArrayList) map2.get(cursorK2.getString(0))));
                        }
                        workDatabase_Impl2.setTransactionSuccessful();
                        cursorK2.close();
                        workDatabase_Impl2.endTransaction();
                        return arrayList2;
                    } catch (Throwable th3) {
                        cursorK2.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    workDatabase_Impl2.endTransaction();
                    throw th4;
                }
            case 2:
                n nVar2 = (n) this.f18639c;
                WorkDatabase_Impl workDatabase_Impl3 = nVar2.f18640a;
                workDatabase_Impl3.beginTransaction();
                try {
                    Cursor cursorK3 = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl3, this.f18638b, true);
                    try {
                        HashMap map3 = new HashMap();
                        HashMap map4 = new HashMap();
                        while (cursorK3.moveToNext()) {
                            String string4 = cursorK3.getString(0);
                            if (!map3.containsKey(string4)) {
                                map3.put(string4, new ArrayList());
                            }
                            String string5 = cursorK3.getString(0);
                            if (!map4.containsKey(string5)) {
                                map4.put(string5, new ArrayList());
                            }
                        }
                        cursorK3.moveToPosition(-1);
                        nVar2.b(map3);
                        nVar2.a(map4);
                        ArrayList arrayList3 = new ArrayList(cursorK3.getCount());
                        while (cursorK3.moveToNext()) {
                            String string6 = cursorK3.getString(0);
                            Q qL2 = org.chromium.support_lib_boundary.util.b.L(cursorK3.getInt(1));
                            C0695n c0695nFromByteArray2 = C0695n.f9956b.fromByteArray(cursorK3.getBlob(2));
                            int i11 = cursorK3.getInt(3);
                            int i12 = cursorK3.getInt(4);
                            arrayList3.add(new j(string6, qL2, c0695nFromByteArray2, cursorK3.getLong(14), cursorK3.getLong(15), cursorK3.getLong(16), new C0689h(org.chromium.support_lib_boundary.util.b.o0(cursorK3.getBlob(6)), org.chromium.support_lib_boundary.util.b.J(cursorK3.getInt(5)), cursorK3.getInt(7) != 0, cursorK3.getInt(8) != 0, cursorK3.getInt(9) != 0, cursorK3.getInt(10) != 0, cursorK3.getLong(11), cursorK3.getLong(12), org.chromium.support_lib_boundary.util.b.l(cursorK3.getBlob(13))), i11, org.chromium.support_lib_boundary.util.b.I(cursorK3.getInt(17)), cursorK3.getLong(18), cursorK3.getLong(19), cursorK3.getInt(20), i12, cursorK3.getLong(21), cursorK3.getInt(22), (ArrayList) map3.get(cursorK3.getString(0)), (ArrayList) map4.get(cursorK3.getString(0))));
                        }
                        workDatabase_Impl3.setTransactionSuccessful();
                        cursorK3.close();
                        workDatabase_Impl3.endTransaction();
                        return arrayList3;
                    } catch (Throwable th5) {
                        cursorK3.close();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    workDatabase_Impl3.endTransaction();
                    throw th6;
                }
            case 3:
                n nVar3 = (n) this.f18639c;
                WorkDatabase_Impl workDatabase_Impl4 = nVar3.f18640a;
                workDatabase_Impl4.beginTransaction();
                try {
                    Cursor cursorK4 = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl4, this.f18638b, true);
                    try {
                        HashMap map5 = new HashMap();
                        HashMap map6 = new HashMap();
                        while (cursorK4.moveToNext()) {
                            String string7 = cursorK4.getString(0);
                            if (!map5.containsKey(string7)) {
                                map5.put(string7, new ArrayList());
                            }
                            String string8 = cursorK4.getString(0);
                            if (!map6.containsKey(string8)) {
                                map6.put(string8, new ArrayList());
                            }
                        }
                        cursorK4.moveToPosition(-1);
                        nVar3.b(map5);
                        nVar3.a(map6);
                        ArrayList arrayList4 = new ArrayList(cursorK4.getCount());
                        while (cursorK4.moveToNext()) {
                            String string9 = cursorK4.getString(0);
                            Q qL3 = org.chromium.support_lib_boundary.util.b.L(cursorK4.getInt(1));
                            C0695n c0695nFromByteArray3 = C0695n.f9956b.fromByteArray(cursorK4.getBlob(2));
                            int i13 = cursorK4.getInt(3);
                            int i14 = cursorK4.getInt(4);
                            arrayList4.add(new j(string9, qL3, c0695nFromByteArray3, cursorK4.getLong(14), cursorK4.getLong(15), cursorK4.getLong(16), new C0689h(org.chromium.support_lib_boundary.util.b.o0(cursorK4.getBlob(6)), org.chromium.support_lib_boundary.util.b.J(cursorK4.getInt(5)), cursorK4.getInt(7) != 0, cursorK4.getInt(8) != 0, cursorK4.getInt(9) != 0, cursorK4.getInt(10) != 0, cursorK4.getLong(11), cursorK4.getLong(12), org.chromium.support_lib_boundary.util.b.l(cursorK4.getBlob(13))), i13, org.chromium.support_lib_boundary.util.b.I(cursorK4.getInt(17)), cursorK4.getLong(18), cursorK4.getLong(19), cursorK4.getInt(20), i14, cursorK4.getLong(21), cursorK4.getInt(22), (ArrayList) map5.get(cursorK4.getString(0)), (ArrayList) map6.get(cursorK4.getString(0))));
                        }
                        workDatabase_Impl4.setTransactionSuccessful();
                        cursorK4.close();
                        workDatabase_Impl4.endTransaction();
                        return arrayList4;
                    } catch (Throwable th7) {
                        cursorK4.close();
                        throw th7;
                    }
                } catch (Throwable th8) {
                    workDatabase_Impl4.endTransaction();
                    throw th8;
                }
            case 4:
                n nVar4 = (n) this.f18639c;
                WorkDatabase_Impl workDatabase_Impl5 = nVar4.f18640a;
                workDatabase_Impl5.beginTransaction();
                try {
                    Cursor cursorK5 = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl5, this.f18638b, true);
                    try {
                        HashMap map7 = new HashMap();
                        HashMap map8 = new HashMap();
                        while (cursorK5.moveToNext()) {
                            String string10 = cursorK5.getString(0);
                            if (!map7.containsKey(string10)) {
                                map7.put(string10, new ArrayList());
                            }
                            String string11 = cursorK5.getString(0);
                            if (!map8.containsKey(string11)) {
                                map8.put(string11, new ArrayList());
                            }
                        }
                        cursorK5.moveToPosition(-1);
                        nVar4.b(map7);
                        nVar4.a(map8);
                        ArrayList arrayList5 = new ArrayList(cursorK5.getCount());
                        while (cursorK5.moveToNext()) {
                            String string12 = cursorK5.getString(0);
                            Q qL4 = org.chromium.support_lib_boundary.util.b.L(cursorK5.getInt(1));
                            C0695n c0695nFromByteArray4 = C0695n.f9956b.fromByteArray(cursorK5.getBlob(2));
                            int i15 = cursorK5.getInt(3);
                            int i16 = cursorK5.getInt(4);
                            arrayList5.add(new j(string12, qL4, c0695nFromByteArray4, cursorK5.getLong(14), cursorK5.getLong(15), cursorK5.getLong(16), new C0689h(org.chromium.support_lib_boundary.util.b.o0(cursorK5.getBlob(6)), org.chromium.support_lib_boundary.util.b.J(cursorK5.getInt(5)), cursorK5.getInt(7) != 0, cursorK5.getInt(8) != 0, cursorK5.getInt(9) != 0, cursorK5.getInt(10) != 0, cursorK5.getLong(11), cursorK5.getLong(12), org.chromium.support_lib_boundary.util.b.l(cursorK5.getBlob(13))), i15, org.chromium.support_lib_boundary.util.b.I(cursorK5.getInt(17)), cursorK5.getLong(18), cursorK5.getLong(19), cursorK5.getInt(20), i16, cursorK5.getLong(21), cursorK5.getInt(22), (ArrayList) map7.get(cursorK5.getString(0)), (ArrayList) map8.get(cursorK5.getString(0))));
                        }
                        workDatabase_Impl5.setTransactionSuccessful();
                        cursorK5.close();
                        workDatabase_Impl5.endTransaction();
                        return arrayList5;
                    } catch (Throwable th9) {
                        cursorK5.close();
                        throw th9;
                    }
                } catch (Throwable th10) {
                    workDatabase_Impl5.endTransaction();
                    throw th10;
                }
            case 5:
                n nVar5 = (n) this.f18639c;
                WorkDatabase_Impl workDatabase_Impl6 = nVar5.f18640a;
                workDatabase_Impl6.beginTransaction();
                try {
                    Cursor cursorK6 = com.facebook.imagepipeline.nativecode.b.K(workDatabase_Impl6, this.f18638b, true);
                    try {
                        HashMap map9 = new HashMap();
                        HashMap map10 = new HashMap();
                        while (cursorK6.moveToNext()) {
                            String string13 = cursorK6.getString(0);
                            if (!map9.containsKey(string13)) {
                                map9.put(string13, new ArrayList());
                            }
                            String string14 = cursorK6.getString(0);
                            if (!map10.containsKey(string14)) {
                                map10.put(string14, new ArrayList());
                            }
                        }
                        cursorK6.moveToPosition(-1);
                        nVar5.b(map9);
                        nVar5.a(map10);
                        ArrayList arrayList6 = new ArrayList(cursorK6.getCount());
                        while (cursorK6.moveToNext()) {
                            String string15 = cursorK6.getString(0);
                            Q qL5 = org.chromium.support_lib_boundary.util.b.L(cursorK6.getInt(1));
                            C0695n c0695nFromByteArray5 = C0695n.f9956b.fromByteArray(cursorK6.getBlob(2));
                            int i17 = cursorK6.getInt(3);
                            int i18 = cursorK6.getInt(4);
                            arrayList6.add(new j(string15, qL5, c0695nFromByteArray5, cursorK6.getLong(14), cursorK6.getLong(15), cursorK6.getLong(16), new C0689h(org.chromium.support_lib_boundary.util.b.o0(cursorK6.getBlob(6)), org.chromium.support_lib_boundary.util.b.J(cursorK6.getInt(5)), cursorK6.getInt(7) != 0, cursorK6.getInt(8) != 0, cursorK6.getInt(9) != 0, cursorK6.getInt(10) != 0, cursorK6.getLong(11), cursorK6.getLong(12), org.chromium.support_lib_boundary.util.b.l(cursorK6.getBlob(13))), i17, org.chromium.support_lib_boundary.util.b.I(cursorK6.getInt(17)), cursorK6.getLong(18), cursorK6.getLong(19), cursorK6.getInt(20), i18, cursorK6.getLong(21), cursorK6.getInt(22), (ArrayList) map9.get(cursorK6.getString(0)), (ArrayList) map10.get(cursorK6.getString(0))));
                        }
                        workDatabase_Impl6.setTransactionSuccessful();
                        cursorK6.close();
                        workDatabase_Impl6.endTransaction();
                        return arrayList6;
                    } catch (Throwable th11) {
                        cursorK6.close();
                        throw th11;
                    }
                } catch (Throwable th12) {
                    workDatabase_Impl6.endTransaction();
                    throw th12;
                }
            case 6:
                return a();
            case 7:
                Cursor cursorK7 = com.facebook.imagepipeline.nativecode.b.K(((n) this.f18639c).f18640a, this.f18638b, false);
                try {
                    if (cursorK7.moveToFirst()) {
                        boolValueOf = Boolean.valueOf(cursorK7.getInt(0) != 0);
                    } else {
                        boolValueOf = Boolean.FALSE;
                    }
                    return boolValueOf;
                } finally {
                    cursorK7.close();
                }
            case 8:
                Cursor cursorK8 = com.facebook.imagepipeline.nativecode.b.K(((n) this.f18639c).f18640a, this.f18638b, false);
                try {
                    Long lValueOf = null;
                    if (cursorK8.moveToFirst() && !cursorK8.isNull(0)) {
                        lValueOf = Long.valueOf(cursorK8.getLong(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                    cursorK8.close();
                }
            default:
                Cursor cursorK9 = com.facebook.imagepipeline.nativecode.b.K((WorkDatabase_Impl) ((p279s5.d) this.f18639c).f42025b, this.f18638b, false);
                try {
                    Long lValueOf2 = null;
                    if (cursorK9.moveToFirst() && !cursorK9.isNull(0)) {
                        lValueOf2 = Long.valueOf(cursorK9.getLong(0));
                        break;
                    }
                    return lValueOf2;
                } finally {
                    cursorK9.close();
                }
        }
    }

    public final void finalize() {
        switch (this.f18637a) {
            case 0:
                this.f18638b.release();
                break;
            case 1:
                this.f18638b.release();
                break;
            case 2:
                this.f18638b.release();
                break;
            case 3:
                this.f18638b.release();
                break;
            case 4:
                this.f18638b.release();
                break;
            case 5:
                this.f18638b.release();
                break;
            case 6:
                this.f18638b.release();
                break;
            case 7:
                this.f18638b.release();
                break;
            case 8:
                this.f18638b.release();
                break;
            default:
                this.f18638b.release();
                break;
        }
    }
}
