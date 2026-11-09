package com.facebook.cache.disk;

import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.WriterCallback;
import com.facebook.common.disk.DiskTrimmable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.sufficientlysecure.htmltextview.m;

/* JADX INFO: loaded from: classes.dex */
public final class f implements FileCache, DiskTrimmable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f21191n = TimeUnit.HOURS.toMillis(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f21192o = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f21195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f21196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f21197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p289t2.a f21199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DiskStorage f21200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f21201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p121i2.d f21202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p136j2.d f21203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v2.a f21204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f21205m = new Object();

    public f(DiskStorage diskStorage, m mVar, p136j2.e eVar, p121i2.e eVar2, p121i2.d dVar, p166l2.a aVar, ExecutorService executorService) {
        p289t2.a aVar2;
        this.f21193a = eVar.f38196b;
        long j6 = eVar.f38197c;
        this.f21194b = j6;
        this.f21195c = j6;
        p289t2.a aVar3 = p289t2.a.f42314h;
        synchronized (p289t2.a.class) {
            try {
                if (p289t2.a.f42314h == null) {
                    p289t2.a.f42314h = new p289t2.a();
                }
                aVar2 = p289t2.a.f42314h;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f21199g = aVar2;
        this.f21200h = diskStorage;
        this.f21201i = mVar;
        this.f21197e = -1L;
        this.f21198f = eVar.f38195a;
        this.f21202j = dVar;
        p136j2.d dVar2 = new p136j2.d();
        dVar2.f38192a = false;
        dVar2.f38193b = -1L;
        dVar2.f38194c = -1L;
        this.f21203k = dVar2;
        this.f21204l = v2.a.f43065a;
        this.f21196d = new HashSet();
        new CountDownLatch(0);
    }

    public final void a(long j6, p121i2.b bVar) throws IOException {
        DiskStorage diskStorage = this.f21200h;
        try {
            ArrayList arrayListB = b(diskStorage.getEntries());
            p136j2.d dVar = this.f21203k;
            long jA = dVar.a();
            long j10 = jA - j6;
            Iterator it = arrayListB.iterator();
            int i7 = 0;
            long j11 = 0;
            while (it.hasNext()) {
                DiskStorage.Entry entry = (DiskStorage.Entry) it.next();
                if (j11 > j10) {
                    break;
                }
                long jRemove = diskStorage.remove(entry);
                DiskStorage diskStorage2 = diskStorage;
                Iterator it2 = it;
                this.f21196d.remove(entry.getId());
                if (jRemove > 0) {
                    i7++;
                    j11 += jRemove;
                    p136j2.f fVarA = p136j2.f.a();
                    fVarA.f38202b = entry.getId();
                    fVarA.f38207g = bVar;
                    fVarA.f38203c = jRemove;
                    fVarA.f38205e = jA - j11;
                    fVarA.f38204d = j6;
                    fVarA.b();
                }
                diskStorage = diskStorage2;
                it = it2;
            }
            DiskStorage diskStorage3 = diskStorage;
            dVar.b(-j11, -i7);
            diskStorage3.purgeUnexpectedResources();
        } catch (IOException e10) {
            e10.getMessage();
            this.f21202j.getClass();
            throw e10;
        }
    }

    public final ArrayList b(Collection collection) {
        this.f21204l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + f21191n;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DiskStorage.Entry entry = (DiskStorage.Entry) it.next();
            if (entry.getTimestamp() > jCurrentTimeMillis) {
                arrayList.add(entry);
            } else {
                arrayList2.add(entry);
            }
        }
        this.f21201i.getClass();
        Collections.sort(arrayList2, new e());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043 A[Catch: IOException -> 0x0067, TryCatch #0 {IOException -> 0x0067, blocks: (B:13:0x002f, B:14:0x003d, B:16:0x0043, B:18:0x0058, B:22:0x006b, B:23:0x0070, B:24:0x0072, B:26:0x0075, B:27:0x0076, B:29:0x007b, B:33:0x0088, B:34:0x008a, B:36:0x0092, B:41:0x0098, B:44:0x009b, B:35:0x008b, B:25:0x0073), top: B:50:0x002f, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b A[Catch: IOException -> 0x0067, TryCatch #0 {IOException -> 0x0067, blocks: (B:13:0x002f, B:14:0x003d, B:16:0x0043, B:18:0x0058, B:22:0x006b, B:23:0x0070, B:24:0x0072, B:26:0x0075, B:27:0x0076, B:29:0x007b, B:33:0x0088, B:34:0x008a, B:36:0x0092, B:41:0x0098, B:44:0x009b, B:35:0x008b, B:25:0x0073), top: B:50:0x002f, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[Catch: IOException -> 0x0067, TryCatch #0 {IOException -> 0x0067, blocks: (B:13:0x002f, B:14:0x003d, B:16:0x0043, B:18:0x0058, B:22:0x006b, B:23:0x0070, B:24:0x0072, B:26:0x0075, B:27:0x0076, B:29:0x007b, B:33:0x0088, B:34:0x008a, B:36:0x0092, B:41:0x0098, B:44:0x009b, B:35:0x008b, B:25:0x0073), top: B:50:0x002f, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x003d A[SYNTHETIC] */
    public final boolean c() {
        boolean z3;
        long jCurrentTimeMillis;
        long j6;
        long size;
        boolean z8;
        int i7;
        p136j2.d dVar;
        long j10;
        long j11;
        p136j2.d dVar2;
        boolean z10;
        this.f21204l.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        p136j2.d dVar3 = this.f21203k;
        synchronized (dVar3) {
            z3 = dVar3.f38192a;
        }
        long jMax = -1;
        if (!z3) {
            this.f21204l.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
            j6 = f21191n + jCurrentTimeMillis;
            size = 0;
            z8 = false;
            i7 = 0;
            for (DiskStorage.Entry entry : this.f21200h.getEntries()) {
                i7++;
                size += entry.getSize();
                if (entry.getTimestamp() > j6) {
                    entry.getSize();
                    jMax = Math.max(entry.getTimestamp() - jCurrentTimeMillis, jMax);
                    z8 = true;
                }
            }
            if (z8) {
                this.f21202j.getClass();
            }
            dVar = this.f21203k;
            synchronized (dVar) {
                j10 = dVar.f38194c;
                j11 = i7;
                if (j10 == j11) {
                    dVar2 = this.f21203k;
                    synchronized (dVar2) {
                        dVar2.f38194c = j11;
                        dVar2.f38193b = size;
                        z10 = true;
                        dVar2.f38192a = true;
                    }
                } else {
                    dVar2 = this.f21203k;
                    synchronized (dVar2) {
                        dVar2.f38194c = j11;
                        dVar2.f38193b = size;
                        z10 = true;
                        dVar2.f38192a = true;
                    }
                }
                this.f21197e = jCurrentTimeMillis;
                return z10;
            }
        }
        long j12 = this.f21197e;
        if (j12 == -1 || jCurrentTimeMillis2 - j12 > f21192o) {
            this.f21204l.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
            j6 = f21191n + jCurrentTimeMillis;
            try {
                size = 0;
                z8 = false;
                i7 = 0;
                while (r0.hasNext()) {
                    i7++;
                    size += entry.getSize();
                    if (entry.getTimestamp() > j6) {
                        entry.getSize();
                        jMax = Math.max(entry.getTimestamp() - jCurrentTimeMillis, jMax);
                        z8 = true;
                    }
                }
                if (z8) {
                    this.f21202j.getClass();
                }
                dVar = this.f21203k;
                synchronized (dVar) {
                    j10 = dVar.f38194c;
                }
                j11 = i7;
                if (j10 == j11 || this.f21203k.a() != size) {
                    dVar2 = this.f21203k;
                    synchronized (dVar2) {
                        dVar2.f38194c = j11;
                        dVar2.f38193b = size;
                        z10 = true;
                        dVar2.f38192a = true;
                    }
                } else {
                    z10 = true;
                }
                this.f21197e = jCurrentTimeMillis;
                return z10;
            } catch (IOException e10) {
                p121i2.d dVar4 = this.f21202j;
                e10.getMessage();
                dVar4.getClass();
            }
        }
        return false;
    }

    @Override // com.facebook.cache.disk.FileCache
    public final void clearAll() {
        synchronized (this.f21205m) {
            try {
                this.f21200h.clearAll();
                this.f21196d.clear();
            } catch (IOException | NullPointerException e10) {
                p121i2.d dVar = this.f21202j;
                e10.getMessage();
                dVar.getClass();
            }
            this.f21203k.c();
        }
    }

    @Override // com.facebook.cache.disk.FileCache
    public final long clearOldEntries(long j6) {
        long j10;
        long jMax;
        synchronized (this.f21205m) {
            try {
                try {
                    this.f21204l.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Collection<DiskStorage.Entry> entries = this.f21200h.getEntries();
                    long jA = this.f21203k.a();
                    int i7 = 0;
                    long j11 = 0;
                    jMax = 0;
                    for (DiskStorage.Entry entry : entries) {
                        try {
                            long j12 = jCurrentTimeMillis;
                            long jMax2 = Math.max(1L, Math.abs(jCurrentTimeMillis - entry.getTimestamp()));
                            if (jMax2 >= j6) {
                                long jRemove = this.f21200h.remove(entry);
                                this.f21196d.remove(entry.getId());
                                if (jRemove > 0) {
                                    i7++;
                                    j11 += jRemove;
                                    p136j2.f fVarA = p136j2.f.a();
                                    fVarA.f38202b = entry.getId();
                                    fVarA.f38207g = p121i2.b.f37409b;
                                    fVarA.f38203c = jRemove;
                                    fVarA.f38205e = jA - j11;
                                    fVarA.b();
                                }
                            } else {
                                jMax = Math.max(jMax, jMax2);
                            }
                            jCurrentTimeMillis = j12;
                        } catch (IOException e10) {
                            e = e10;
                            j10 = jMax;
                            p121i2.d dVar = this.f21202j;
                            e.getMessage();
                            dVar.getClass();
                            jMax = j10;
                        }
                    }
                    this.f21200h.purgeUnexpectedResources();
                    if (i7 > 0) {
                        c();
                        this.f21203k.b(-j11, -i7);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                j10 = 0;
            }
        }
        return jMax;
    }

    public final DiskStorage.Inserter d(String str, CacheKey cacheKey) {
        synchronized (this.f21205m) {
            try {
                boolean zC = c();
                f();
                long jA = this.f21203k.a();
                if (jA > this.f21195c && !zC) {
                    this.f21203k.c();
                    c();
                }
                long j6 = this.f21195c;
                if (jA > j6) {
                    a((j6 * 9) / 10, p121i2.b.f37408a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f21200h.insert(str, cacheKey);
    }

    public final void e(double d2) {
        synchronized (this.f21205m) {
            try {
                this.f21203k.c();
                c();
                long jA = this.f21203k.a();
                a(jA - ((long) (d2 * jA)), p121i2.b.f37410c);
            } catch (IOException e10) {
                p121i2.d dVar = this.f21202j;
                e10.getMessage();
                dVar.getClass();
            }
        }
    }

    public final void f() {
        long availableBlocksLong;
        char c6 = this.f21200h.isExternal() ? (char) 2 : (char) 1;
        p289t2.a aVar = this.f21199g;
        long jA = this.f21194b - this.f21203k.a();
        aVar.a();
        aVar.a();
        ReentrantLock reentrantLock = aVar.f42321f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - aVar.f42320e > p289t2.a.f42315i) {
                    aVar.f42316a = p289t2.a.b(aVar.f42316a, aVar.f42317b);
                    aVar.f42318c = p289t2.a.b(aVar.f42318c, aVar.f42319d);
                    aVar.f42320e = SystemClock.uptimeMillis();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        StatFs statFs = c6 == 1 ? aVar.f42316a : aVar.f42318c;
        if (statFs != null) {
            availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } else {
            availableBlocksLong = 0;
        }
        if (availableBlocksLong <= 0 || availableBlocksLong < jA) {
            this.f21195c = this.f21193a;
        } else {
            this.f21195c = this.f21194b;
        }
    }

    @Override // com.facebook.cache.disk.FileCache
    public final long getCount() {
        long j6;
        p136j2.d dVar = this.f21203k;
        synchronized (dVar) {
            j6 = dVar.f38194c;
        }
        return j6;
    }

    @Override // com.facebook.cache.disk.FileCache
    public final p136j2.c getDumpInfo() {
        return this.f21200h.getDumpInfo();
    }

    @Override // com.facebook.cache.disk.FileCache
    public final BinaryResource getResource(CacheKey cacheKey) {
        BinaryResource resource;
        p136j2.f fVarA = p136j2.f.a();
        fVarA.f38201a = cacheKey;
        try {
            try {
                synchronized (this.f21205m) {
                    try {
                        ArrayList arrayListU = J3.a.u(cacheKey);
                        String str = null;
                        resource = null;
                        for (int i7 = 0; i7 < arrayListU.size(); i7++) {
                            str = (String) arrayListU.get(i7);
                            fVarA.f38202b = str;
                            resource = this.f21200h.getResource(str, cacheKey);
                            if (resource != null) {
                                break;
                            }
                        }
                        if (resource == null) {
                            this.f21196d.remove(str);
                        } else {
                            str.getClass();
                            this.f21196d.add(str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                fVarA.b();
                return resource;
            } catch (IOException e10) {
                this.f21202j.getClass();
                fVarA.f38206f = e10;
                fVarA.b();
                return null;
            }
        } catch (Throwable th2) {
            fVarA.b();
            throw th2;
        }
    }

    @Override // com.facebook.cache.disk.FileCache
    public final long getSize() {
        return this.f21203k.a();
    }

    @Override // com.facebook.cache.disk.FileCache
    public final boolean hasKey(CacheKey cacheKey) {
        synchronized (this.f21205m) {
            if (hasKeySync(cacheKey)) {
                return true;
            }
            try {
                ArrayList arrayListU = J3.a.u(cacheKey);
                for (int i7 = 0; i7 < arrayListU.size(); i7++) {
                    String str = (String) arrayListU.get(i7);
                    if (this.f21200h.contains(str, cacheKey)) {
                        this.f21196d.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // com.facebook.cache.disk.FileCache
    public final boolean hasKeySync(CacheKey cacheKey) {
        synchronized (this.f21205m) {
            try {
                ArrayList arrayListU = J3.a.u(cacheKey);
                for (int i7 = 0; i7 < arrayListU.size(); i7++) {
                    if (this.f21196d.contains((String) arrayListU.get(i7))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.cache.disk.FileCache
    public final BinaryResource insert(CacheKey cacheKey, WriterCallback writerCallback) {
        String strM;
        BinaryResource binaryResourceCommit;
        p136j2.f fVarA = p136j2.f.a();
        fVarA.f38201a = cacheKey;
        synchronized (this.f21205m) {
            strM = J3.a.m(cacheKey);
        }
        fVarA.f38202b = strM;
        try {
            try {
                DiskStorage.Inserter inserterD = d(strM, cacheKey);
                try {
                    inserterD.writeData(writerCallback, cacheKey);
                    synchronized (this.f21205m) {
                        binaryResourceCommit = inserterD.commit(cacheKey);
                        this.f21196d.add(strM);
                        this.f21203k.b(binaryResourceCommit.size(), 1L);
                    }
                    fVarA.f38203c = binaryResourceCommit.size();
                    fVarA.f38205e = this.f21203k.a();
                    if (!inserterD.cleanUp()) {
                        p229p2.a.e(f.class, "Failed to delete temp file");
                    }
                    fVarA.b();
                    return binaryResourceCommit;
                } catch (Throwable th) {
                    if (!inserterD.cleanUp()) {
                        p229p2.a.e(f.class, "Failed to delete temp file");
                    }
                    throw th;
                }
            } catch (IOException e10) {
                fVarA.f38206f = e10;
                p229p2.a.f(f.class, "Failed inserting a file into the cache", e10);
                throw e10;
            }
        } catch (Throwable th2) {
            fVarA.b();
            throw th2;
        }
    }

    @Override // com.facebook.cache.disk.FileCache
    public final boolean isEnabled() {
        return this.f21200h.isEnabled();
    }

    @Override // com.facebook.cache.disk.FileCache
    public final boolean probe(CacheKey cacheKey) throws Throwable {
        String str;
        IOException e10;
        String str2 = null;
        try {
            try {
                synchronized (this.f21205m) {
                    try {
                        ArrayList arrayListU = J3.a.u(cacheKey);
                        int i7 = 0;
                        while (i7 < arrayListU.size()) {
                            String str3 = (String) arrayListU.get(i7);
                            if (this.f21200h.touch(str3, cacheKey)) {
                                this.f21196d.add(str3);
                                return true;
                            }
                            i7++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th) {
                        str = str2;
                        th = th;
                        try {
                            throw th;
                        } catch (IOException e11) {
                            e10 = e11;
                            p136j2.f fVarA = p136j2.f.a();
                            fVarA.f38201a = cacheKey;
                            fVarA.f38202b = str;
                            fVarA.f38206f = e10;
                            fVarA.b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            str = null;
            e10 = e12;
        }
    }

    @Override // com.facebook.cache.disk.FileCache
    public final void remove(CacheKey cacheKey) {
        synchronized (this.f21205m) {
            try {
                ArrayList arrayListU = J3.a.u(cacheKey);
                for (int i7 = 0; i7 < arrayListU.size(); i7++) {
                    String str = (String) arrayListU.get(i7);
                    this.f21200h.remove(str);
                    this.f21196d.remove(str);
                }
            } catch (IOException e10) {
                p121i2.d dVar = this.f21202j;
                e10.getMessage();
                dVar.getClass();
            }
        }
    }

    @Override // com.facebook.common.disk.DiskTrimmable
    public final void trimToMinimum() {
        synchronized (this.f21205m) {
            try {
                c();
                long jA = this.f21203k.a();
                long j6 = this.f21198f;
                if (j6 > 0 && jA > 0 && jA >= j6) {
                    double d2 = 1.0d - (j6 / jA);
                    if (d2 > 0.02d) {
                        e(d2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.common.disk.DiskTrimmable
    public final void trimToNothing() {
        clearAll();
    }
}
