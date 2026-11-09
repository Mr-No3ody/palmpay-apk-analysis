package com.facebook.soloader;

import C0.G;
import N8.q0;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.observer.Observer;
import com.facebook.soloader.recovery.RecoveryStrategy;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.concurrent.ThreadSafe;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
@ThreadSafe
public class SoLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C2085k0 f21854b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f21865m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantReadWriteLock f21855c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Context f21856d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile x[] f21857e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f21858f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static F3.a f21859g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f21860h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f21861i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f21862j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashMap f21863k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f21864l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f21866n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static OpenSourceMergedSoMapping f21867o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f21853a = true;

    public interface AppType {
    }

    public static void a(ArrayList arrayList) {
        String strY = SysUtil$MarshmallowSysdeps.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str != null && !str.equals("")) {
            strY = q0.y(str, ":", strY);
        }
        for (String str2 : new HashSet(Arrays.asList(strY.split(":")))) {
            o.e(3, "SoLoader");
            arrayList.add(new e(new File(str2), 2));
        }
    }

    public static void b(String str, String str2, int i7, StrictMode.ThreadPolicy threadPolicy) {
        boolean z3;
        ReentrantReadWriteLock reentrantReadWriteLock = f21855c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f21857e == null) {
                Log.e("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z3 = true;
            } else {
                z3 = false;
            }
            if (f21853a) {
                if (str2 != null) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str2, "]");
                }
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (x xVar : f21857e) {
                            if (n(xVar, str, i7, threadPolicy)) {
                                f21855c.readLock().unlock();
                                if (f21853a) {
                                    if (str2 != null) {
                                        Trace.endSection();
                                    }
                                    Trace.endSection();
                                }
                                if (z3) {
                                    StrictMode.setThreadPolicy(threadPolicy);
                                    return;
                                }
                                return;
                            }
                        }
                        throw v.a(str, f21856d, f21857e);
                    } catch (IOException e10) {
                        w wVar = new w(str, e10.toString());
                        wVar.initCause(e10);
                        throw wVar;
                    }
                } catch (Throwable th) {
                    f21855c.readLock().unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                if (f21853a) {
                    if (str2 != null) {
                        Trace.endSection();
                    }
                    Trace.endSection();
                }
                if (z3) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            f21855c.readLock().unlock();
            throw th3;
        }
    }

    public static synchronized RecoveryStrategy c() {
        F3.a aVar;
        aVar = f21859g;
        return aVar == null ? null : aVar.get();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public static void d(int i7, Context context) {
        Bundle bundle;
        boolean z3;
        int i10;
        if (h()) {
            return;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean z8 = false;
            if (f21867o != null) {
                z3 = true;
            } else {
                try {
                    bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                } catch (Exception unused) {
                    bundle = null;
                }
                if (bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            f21864l = z3;
            if (z3) {
                int i11 = f21866n;
                if (i11 == 0) {
                    if (context == null) {
                        o.e(3, "SoLoader");
                        i11 = 1;
                    } else {
                        int i12 = context.getApplicationInfo().flags;
                        if ((i12 & 1) == 0) {
                            i10 = 1;
                        } else {
                            i10 = (128 & i12) != 0 ? 3 : 2;
                        }
                        o.e(3, "SoLoader");
                        i11 = i10;
                    }
                }
                f21866n = i11;
                if ((i7 & 128) == 0) {
                    if (i11 == 2 || (context != null && (context.getApplicationInfo().flags & 268435456) == 0)) {
                        z8 = true;
                    }
                    if (z8) {
                        i7 |= 8;
                    }
                }
                f(i7, context);
                g(i7, context);
                o.e(2, "SoLoader");
                D3.a.l(new retrofit2.adapter.rxjava2.d(4));
            } else {
                e();
                o.e(2, "SoLoader");
                D3.a.l(new p045d3.g(1));
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    public static void e() {
        if (f21857e != null) {
            return;
        }
        f21855c.writeLock().lock();
        try {
            if (f21857e == null) {
                f21857e = new x[0];
            }
        } finally {
            f21855c.writeLock().unlock();
        }
    }

    public static synchronized void f(int i7, Context context) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    String str = context.getApplicationInfo().nativeLibraryDir;
                } else {
                    context = applicationContext;
                }
                f21856d = context;
                f21859g = new F3.a(context, (i7 & 2048) != 0 ? 1 : 0);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f21854b != null) {
            return;
        }
        f21854b = new C2085k0(new Z4.a(5), 18);
    }

    public static void g(int i7, Context context) {
        int i10;
        int i11;
        ReentrantReadWriteLock.WriteLock writeLock;
        if (f21857e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f21855c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f21857e != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                f21865m = i7;
                ArrayList arrayList = new ArrayList();
                boolean z3 = (i7 & 512) != 0;
                boolean z8 = (i7 & 1024) != 0;
                if (z3) {
                    z zVar = new z();
                    zVar.toString();
                    o.e(3, "SoLoader");
                    arrayList.add(0, zVar);
                } else if (z8) {
                    a(arrayList);
                    C1394d c1394d = new C1394d();
                    c1394d.f21875a = null;
                    c1394d.f21876b = null;
                    arrayList.add(0, c1394d);
                } else {
                    a(arrayList);
                    if (context != null) {
                        if ((i7 & 1) != 0) {
                            int i12 = f21866n;
                            if (i12 != 1) {
                                if (i12 != 2 && i12 != 3) {
                                    throw new RuntimeException("Unsupported app type, we should not reach here");
                                }
                                i11 = 1;
                            } else {
                                i11 = 0;
                            }
                            C1391a c1391a = new C1391a(f21856d, i11);
                            c1391a.toString();
                            o.e(3, "SoLoader");
                            arrayList.add(0, c1391a);
                            o.e(3, "SoLoader");
                            arrayList.add(0, new j(context, "lib-main", true));
                        } else {
                            if (f21866n == 2 || (context.getApplicationInfo().flags & 268435456) == 0) {
                                C1393c c1393c = new C1393c(context);
                                c1393c.toString();
                                o.e(3, "SoLoader");
                                if (!c1393c.f21874c.isEmpty()) {
                                    arrayList.add(0, c1393c);
                                }
                            }
                            int i13 = f21866n;
                            if (i13 != 1) {
                                if (i13 != 2 && i13 != 3) {
                                    throw new RuntimeException("Unsupported app type, we should not reach here");
                                }
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            C1391a c1391a2 = new C1391a(f21856d, i10);
                            c1391a2.toString();
                            o.e(3, "SoLoader");
                            arrayList.add(0, c1391a2);
                            boolean z10 = (i7 & 4096) != 0;
                            if ((f21865m & 8) == 0) {
                                arrayList.add(0, new C1392b(context, "lib-main", !z10));
                            }
                        }
                    }
                }
                x[] xVarArr = (x[]) arrayList.toArray(new x[arrayList.size()]);
                reentrantReadWriteLock.writeLock().lock();
                try {
                    int i14 = f21865m;
                    int i15 = (i14 & 2) == 0 ? 0 : 1;
                    if ((i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                        i15 |= 4;
                    }
                    if ((i14 & 128) == 0) {
                        i15 |= 8;
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                    int length = xVarArr.length;
                    while (true) {
                        int i16 = length - 1;
                        if (length <= 0) {
                            break;
                        }
                        Objects.toString(xVarArr[i16]);
                        o.e(4, "SoLoader");
                        boolean z11 = f21853a;
                        if (z11) {
                            Api18TraceUtils.a("SoLoader", "_", xVarArr[i16].getClass().getSimpleName());
                        }
                        xVarArr[i16].d(i15);
                        if (z11) {
                            Trace.endSection();
                        }
                        length = i16;
                    }
                    f21857e = xVarArr;
                    f21858f.getAndIncrement();
                    int length2 = f21857e.length;
                    o.e(4, "SoLoader");
                    writeLock = f21855c.writeLock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            f21855c.writeLock().unlock();
            throw th2;
        }
    }

    public static boolean h() {
        if (f21857e != null) {
            return true;
        }
        f21855c.readLock().lock();
        try {
            return f21857e != null;
        } finally {
            f21855c.readLock().unlock();
        }
    }

    public static void i(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        Observer[] observerArr = (Observer[]) E3.a.f2210a.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onLoadDependencyStart(str, i7);
            }
        }
        try {
            boolean zM = m(str, null, null, i7 | 1, threadPolicy);
            Observer[] observerArr2 = (Observer[]) E3.a.f2210a.get();
            if (observerArr2 != null) {
                for (Observer observer2 : observerArr2) {
                    observer2.onLoadDependencyEnd(null, zM);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Observer[] observerArr3 = (Observer[]) E3.a.f2210a.get();
                if (observerArr3 != null) {
                    for (Observer observer3 : observerArr3) {
                        observer3.onLoadDependencyEnd(th, false);
                    }
                }
                throw th2;
            }
        }
    }

    public static void init(Context context, int i7) throws IOException {
        d(i7, context);
    }

    public static void j(String str) {
        if (f21864l) {
            k(str, 0);
        } else {
            D3.a.r(str);
        }
    }

    public static boolean k(String str, int i7) {
        Boolean boolValueOf;
        if (f21857e == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = f21855c;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (f21857e == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (SoLoader.class) {
                            try {
                                boolean zContains = f21860h.contains(str);
                                boolean z3 = !zContains;
                                if (!zContains) {
                                    System.loadLibrary(str);
                                }
                                boolValueOf = Boolean.valueOf(z3);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                    } else if (!h()) {
                        throw new IllegalStateException("SoLoader.init() not yet called");
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                boolValueOf = null;
            } catch (Throwable th2) {
                f21855c.readLock().unlock();
                throw th2;
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        if (!f21864l) {
            return D3.a.r(str);
        }
        if (f21866n != 2) {
        }
        OpenSourceMergedSoMapping openSourceMergedSoMapping = f21867o;
        String strMapLibName = openSourceMergedSoMapping != null ? openSourceMergedSoMapping.mapLibName(str) : null;
        String str2 = strMapLibName != null ? strMapLibName : str;
        Observer[] observerArr = (Observer[]) E3.a.f2210a.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onLoadLibraryStart(str, strMapLibName, i7);
            }
        }
        try {
            boolean zL = l(i7, System.mapLibraryName(str2), str, strMapLibName);
            Observer[] observerArr2 = (Observer[]) E3.a.f2210a.get();
            if (observerArr2 != null) {
                for (Observer observer2 : observerArr2) {
                    observer2.onLoadLibraryEnd(null, zL);
                }
            }
            return zL;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                Observer[] observerArr3 = (Observer[]) E3.a.f2210a.get();
                if (observerArr3 != null) {
                    for (Observer observer3 : observerArr3) {
                        observer3.onLoadLibraryEnd(th3, false);
                    }
                }
                throw th4;
            }
        }
    }

    public static boolean l(int i7, String str, String str2, String str3) {
        RecoveryStrategy recoveryStrategyC = null;
        while (true) {
            try {
                return m(str, str2, str3, i7, null);
            } catch (UnsatisfiedLinkError e10) {
                e10.toString();
                ReentrantReadWriteLock reentrantReadWriteLock = f21855c;
                reentrantReadWriteLock.writeLock().lock();
                if (recoveryStrategyC == null) {
                    try {
                        try {
                            try {
                                recoveryStrategyC = c();
                                if (recoveryStrategyC == null) {
                                    throw e10;
                                }
                            } catch (s e11) {
                                Log.e("SoLoader", "Base APK not found during recovery", e11);
                                throw e11;
                            }
                        } catch (Exception e12) {
                            Log.e("SoLoader", "Got an exception during recovery, will throw the initial error instead", e12);
                            throw e10;
                        }
                    } catch (Throwable th) {
                        reentrantReadWriteLock.writeLock().unlock();
                        throw th;
                    }
                }
                if (!o(e10, recoveryStrategyC)) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw e10;
                }
                f21858f.getAndIncrement();
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
    }

    public static boolean m(String str, String str2, String str3, int i7, StrictMode.ThreadPolicy threadPolicy) {
        boolean z3;
        Object obj;
        Object obj2;
        if (TextUtils.isEmpty(str2) || !f21862j.contains(str2)) {
            Set set = f21860h;
            if (!set.contains(str) || str3 != null) {
                synchronized (SoLoader.class) {
                    try {
                        if (!set.contains(str)) {
                            z3 = false;
                        } else {
                            if (str3 == null) {
                                return false;
                            }
                            z3 = true;
                        }
                        HashMap map = f21861i;
                        if (map.containsKey(str)) {
                            obj = map.get(str);
                        } else {
                            Object obj3 = new Object();
                            map.put(str, obj3);
                            obj = obj3;
                        }
                        HashMap map2 = f21863k;
                        if (map2.containsKey(str2)) {
                            obj2 = map2.get(str2);
                        } else {
                            Object obj4 = new Object();
                            map2.put(str2, obj4);
                            obj2 = obj4;
                        }
                        ReentrantReadWriteLock reentrantReadWriteLock = f21855c;
                        reentrantReadWriteLock.readLock().lock();
                        try {
                            synchronized (obj) {
                                if (!z3) {
                                    if (set.contains(str)) {
                                        if (str3 == null) {
                                            reentrantReadWriteLock.readLock().unlock();
                                            return false;
                                        }
                                        z3 = true;
                                    }
                                    if (!z3) {
                                        try {
                                            o.e(3, "SoLoader");
                                            b(str, str2, i7, threadPolicy);
                                            o.e(3, "SoLoader");
                                            set.add(str);
                                        } catch (UnsatisfiedLinkError e10) {
                                            String message = e10.getMessage();
                                            if (message == null || !message.contains("unexpected e_machine:")) {
                                                throw e10;
                                            }
                                            t tVar = new t("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil$MarshmallowSysdeps.getSupportedAbis()) + " error: " + message.substring(message.lastIndexOf("unexpected e_machine:")));
                                            tVar.initCause(e10);
                                            throw tVar;
                                        }
                                    }
                                }
                                synchronized (obj2) {
                                    if ((i7 & 16) == 0 && str3 != null) {
                                        try {
                                            if (TextUtils.isEmpty(str2) || !f21862j.contains(str2)) {
                                                boolean z8 = f21853a;
                                                if (z8 && f21867o == null) {
                                                    Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                                }
                                                try {
                                                    try {
                                                        o.e(3, "SoLoader");
                                                        OpenSourceMergedSoMapping openSourceMergedSoMapping = f21867o;
                                                        if (openSourceMergedSoMapping == null) {
                                                            throw new IllegalArgumentException(G.o("Unknown library: ", str2));
                                                        }
                                                        openSourceMergedSoMapping.invokeJniOnload(str2);
                                                        f21862j.add(str2);
                                                        if (z8 && f21867o == null) {
                                                            Trace.endSection();
                                                        }
                                                    } catch (Throwable th) {
                                                        if (f21853a && f21867o == null) {
                                                            Trace.endSection();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (UnsatisfiedLinkError e11) {
                                                    throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e11);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                return !z3;
                            }
                        } catch (Throwable th3) {
                            f21855c.readLock().unlock();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
        return false;
    }

    public static boolean n(x xVar, String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        Observer[] observerArr = (Observer[]) E3.a.f2210a.get();
        int i10 = 0;
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onSoSourceLoadLibraryStart(xVar);
            }
        }
        try {
            boolean z3 = xVar.c(str, i7, threadPolicy) != 0;
            Observer[] observerArr2 = (Observer[]) E3.a.f2210a.get();
            if (observerArr2 != null) {
                int length = observerArr2.length;
                while (i10 < length) {
                    observerArr2[i10].onSoSourceLoadLibraryEnd(null);
                    i10++;
                }
            }
            return z3;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Observer[] observerArr3 = (Observer[]) E3.a.f2210a.get();
                if (observerArr3 != null) {
                    int length2 = observerArr3.length;
                    while (i10 < length2) {
                        observerArr3[i10].onSoSourceLoadLibraryEnd(th);
                        i10++;
                    }
                }
                throw th2;
            }
        }
    }

    public static boolean o(UnsatisfiedLinkError unsatisfiedLinkError, RecoveryStrategy recoveryStrategy) {
        Observer[] observerArr = (Observer[]) E3.a.f2210a.get();
        int i7 = 0;
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onRecoveryStart(recoveryStrategy);
            }
        }
        try {
            boolean zRecover = recoveryStrategy.recover(unsatisfiedLinkError, f21857e);
            Observer[] observerArr2 = (Observer[]) E3.a.f2210a.get();
            if (observerArr2 != null) {
                int length = observerArr2.length;
                while (i7 < length) {
                    observerArr2[i7].onRecoveryEnd(null);
                    i7++;
                }
            }
            return zRecover;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Observer[] observerArr3 = (Observer[]) E3.a.f2210a.get();
                if (observerArr3 != null) {
                    int length2 = observerArr3.length;
                    while (i7 < length2) {
                        observerArr3[i7].onRecoveryEnd(th);
                        i7++;
                    }
                }
                throw th2;
            }
        }
    }
}
