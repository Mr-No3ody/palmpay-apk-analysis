package androidx.room;

import Pa.C0525w;
import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class J extends M0.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final H f17709f = new H(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1234m f17710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f17711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C1234m configuration, I delegate, String identityHash, String legacyHash) {
        super(delegate.f17706a);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f17710b = configuration;
        this.f17711c = delegate;
        this.f17712d = identityHash;
        this.f17713e = legacyHash;
    }

    @Override // M0.d
    public final void b(N0.d db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        super.b(db2);
    }

    @Override // M0.d
    public final void c(N0.d db2) throws IOException {
        Intrinsics.checkNotNullParameter(db2, "db");
        boolean zHasEmptySchema$room_runtime_release = f17709f.hasEmptySchema$room_runtime_release(db2);
        I i7 = this.f17711c;
        i7.a(db2);
        if (!zHasEmptySchema$room_runtime_release) {
            C9.N nF = i7.f(db2);
            if (!nF.f1268b) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) nF.f1269c));
            }
        }
        g(db2);
        i7.c(db2);
    }

    @Override // M0.d
    public final void d(N0.d db2, int i7, int i10) {
        Intrinsics.checkNotNullParameter(db2, "db");
        f(db2, i7, i10);
    }

    @Override // M0.d
    public final void e(N0.d db2) throws IOException {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(db2, "db");
        boolean zHasRoomMasterTable$room_runtime_release = f17709f.hasRoomMasterTable$room_runtime_release(db2);
        I i7 = this.f17711c;
        if (zHasRoomMasterTable$room_runtime_release) {
            Cursor cursorQuery = db2.query(new M0.b("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                cursorQuery.close();
                String str = this.f17712d;
                if (!str.equals(string) && !this.f17713e.equals(string)) {
                    throw new IllegalStateException(C0.G.p("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", str, ", found: ", string));
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(cursorQuery, th);
                    throw th2;
                }
            }
        } else {
            C9.N nF = i7.f(db2);
            if (!nF.f1268b) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) nF.f1269c));
            }
            g(db2);
        }
        i7.d(db2);
        this.f17710b = null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:70:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[LOOP:1: B:12:0x0023->B:76:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x005b A[SYNTHETIC] */
    @Override // M0.d
    public final void f(N0.d db2, int i7, int i10) {
        LinkedHashSet linkedHashSet;
        Iterable iterable;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z3;
        Integer targetVersion;
        int i11;
        int iIntValue;
        int iIntValue2;
        Intrinsics.checkNotNullParameter(db2, "db");
        C1234m c1234m = this.f17710b;
        I i12 = this.f17711c;
        if (c1234m != null) {
            C0525w c0525w = c1234m.f17774d;
            c0525w.getClass();
            if (i7 == i10) {
                iterable = kotlin.collections.z.f38935a;
            } else {
                boolean z8 = i10 > i7;
                ArrayList arrayList = new ArrayList();
                int iIntValue3 = i7;
                while (true) {
                    if (z8) {
                        if (iIntValue3 < i10) {
                            treeMap = (TreeMap) ((LinkedHashMap) c0525w.f7166b).get(Integer.valueOf(iIntValue3));
                            if (treeMap != null) {
                                if (z8) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z3 = false;
                                        break;
                                    }
                                    targetVersion = (Integer) it.next();
                                    if (!z8) {
                                        Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                        iIntValue2 = targetVersion.intValue();
                                        if (i10 <= iIntValue2 && iIntValue2 < iIntValue3) {
                                            Object obj = treeMap.get(targetVersion);
                                            Intrinsics.e(obj);
                                            arrayList.add(obj);
                                            iIntValue3 = targetVersion.intValue();
                                            z3 = true;
                                            break;
                                            break;
                                        }
                                    } else {
                                        i11 = iIntValue3 + 1;
                                        Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                        iIntValue = targetVersion.intValue();
                                        if (i11 <= iIntValue && iIntValue <= i10) {
                                            Object obj2 = treeMap.get(targetVersion);
                                            Intrinsics.e(obj2);
                                            arrayList.add(obj2);
                                            iIntValue3 = targetVersion.intValue();
                                            z3 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!z3) {
                                }
                            }
                            iterable = null;
                        } else {
                            iterable = arrayList;
                        }
                    } else if (iIntValue3 > i10) {
                        treeMap = (TreeMap) ((LinkedHashMap) c0525w.f7166b).get(Integer.valueOf(iIntValue3));
                        if (treeMap != null) {
                            if (z8) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z3 = false;
                                    break;
                                    break;
                                }
                                targetVersion = (Integer) it.next();
                                if (!z8) {
                                    i11 = iIntValue3 + 1;
                                    Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                    iIntValue = targetVersion.intValue();
                                    if (i11 <= iIntValue) {
                                        continue;
                                    }
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                    iIntValue2 = targetVersion.intValue();
                                    if (i10 <= iIntValue2) {
                                        continue;
                                    }
                                }
                            }
                            if (!z3) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                }
            }
            if (iterable != null) {
                i12.e(db2);
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((J0.a) it2.next()).migrate(db2);
                }
                C9.N nF = i12.f(db2);
                if (nF.f1268b) {
                    g(db2);
                    return;
                } else {
                    throw new IllegalStateException("Migration didn't properly handle: " + ((String) nF.f1269c));
                }
            }
        }
        C1234m c1234m2 = this.f17710b;
        if (c1234m2 != null) {
            if (!((i7 <= i10 || !c1234m2.f17781k) && c1234m2.f17780j && ((linkedHashSet = c1234m2.f17782l) == null || !linkedHashSet.contains(Integer.valueOf(i7))))) {
                i12.b(db2);
                i12.a(db2);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i7 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public final void g(N0.d dVar) {
        dVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String hash = this.f17712d;
        Intrinsics.checkNotNullParameter(hash, "hash");
        dVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')");
    }
}
