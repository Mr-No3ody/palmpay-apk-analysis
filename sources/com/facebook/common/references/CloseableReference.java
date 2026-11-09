package com.facebook.common.references;

import P0.c;
import android.graphics.Bitmap;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import javax.annotation.Nullable;
import org.sufficientlysecure.htmltextview.l;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class CloseableReference implements Cloneable, Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f21216e = new l(10);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f21217f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21218a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p277s2.a f21219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LeakHandler f21220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f21221d;

    public @interface CloseableRefType {
    }

    public interface LeakHandler {
        void reportLeak(p277s2.a aVar, @Nullable Throwable th);

        boolean requiresStacktrace();
    }

    public CloseableReference(p277s2.a aVar, LeakHandler leakHandler, Throwable th) {
        int i7;
        boolean z3;
        aVar.getClass();
        this.f21219b = aVar;
        synchronized (aVar) {
            synchronized (aVar) {
                i7 = aVar.f42011b;
                z3 = i7 > 0;
            }
            this.f21220c = leakHandler;
            this.f21221d = th;
        }
        if (!z3) {
            throw new c("Null shared reference", 18, false);
        }
        aVar.f42011b = i7 + 1;
        this.f21220c = leakHandler;
        this.f21221d = th;
    }

    public static CloseableReference c(CloseableReference closeableReference) {
        if (closeableReference != null) {
            return closeableReference.b();
        }
        return null;
    }

    public static void d(CloseableReference closeableReference) {
        if (closeableReference != null) {
            closeableReference.close();
        }
    }

    public static void e(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d((CloseableReference) it.next());
            }
        }
    }

    public static boolean h(CloseableReference closeableReference) {
        return closeableReference != null && closeableReference.g();
    }

    public static b i(Closeable closeable) {
        return j(closeable, f21216e, f21217f);
    }

    public static b j(Object obj, ResourceReleaser resourceReleaser, LeakHandler leakHandler) {
        if (obj == null) {
            return null;
        }
        Throwable th = leakHandler.requiresStacktrace() ? new Throwable() : null;
        if (!(obj instanceof Bitmap)) {
            boolean z3 = obj instanceof HasBitmap;
        }
        return new b(obj, resourceReleaser, leakHandler, th, true);
    }

    /* JADX INFO: renamed from: a */
    public abstract CloseableReference clone();

    public synchronized CloseableReference b() {
        if (!g()) {
            return null;
        }
        return clone();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x002b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0034  */
    /* JADX WARN: Code duplicated, block: B:33:0x0038  */
    /* JADX WARN: Code duplicated, block: B:38:0x0046 A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:36:0x003e, B:38:0x0046, B:45:0x006e, B:41:0x0058, B:43:0x005e, B:44:0x0062), top: B:68:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0058 A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:36:0x003e, B:38:0x0046, B:45:0x006e, B:41:0x0058, B:43:0x005e, B:44:0x0062), top: B:68:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x005e A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:36:0x003e, B:38:0x0046, B:45:0x006e, B:41:0x0058, B:43:0x005e, B:44:0x0062), top: B:68:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0062 A[Catch: all -> 0x0056, TryCatch #1 {all -> 0x0056, blocks: (B:36:0x003e, B:38:0x0046, B:45:0x006e, B:41:0x0058, B:43:0x005e, B:44:0x0062), top: B:68:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0075 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i7;
        boolean z3;
        int i10;
        Object obj;
        ResourceReleaser resourceReleaser;
        IdentityHashMap identityHashMap;
        Integer num;
        synchronized (this) {
            try {
                if (this.f21218a) {
                    return;
                }
                this.f21218a = true;
                p277s2.a aVar = this.f21219b;
                synchronized (aVar) {
                    synchronized (aVar) {
                        i7 = aVar.f42011b;
                        z3 = i7 > 0;
                    }
                    if (i10 == 0) {
                        synchronized (aVar) {
                            obj = aVar.f42010a;
                            aVar.f42010a = null;
                        }
                        if (obj != null) {
                            resourceReleaser = aVar.f42012c;
                            if (resourceReleaser != null) {
                                resourceReleaser.release(obj);
                            }
                            identityHashMap = p277s2.a.f42009d;
                            synchronized (identityHashMap) {
                                try {
                                    num = (Integer) identityHashMap.get(obj);
                                    if (num == null) {
                                        p229p2.a.z("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                                    } else if (num.intValue() == 1) {
                                        identityHashMap.remove(obj);
                                    } else {
                                        identityHashMap.put(obj, Integer.valueOf(num.intValue() - 1));
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                }
                if (!z3) {
                    throw new c("Null shared reference", 18, false);
                }
                if (!(i7 > 0)) {
                    throw new IllegalArgumentException();
                }
                i10 = aVar.f42011b - 1;
                aVar.f42011b = i10;
                if (i10 == 0) {
                    synchronized (aVar) {
                        obj = aVar.f42010a;
                        aVar.f42010a = null;
                        if (obj != null) {
                            resourceReleaser = aVar.f42012c;
                            if (resourceReleaser != null) {
                                resourceReleaser.release(obj);
                            }
                            identityHashMap = p277s2.a.f42009d;
                            synchronized (identityHashMap) {
                                num = (Integer) identityHashMap.get(obj);
                                if (num == null) {
                                    p229p2.a.z("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                                } else if (num.intValue() == 1) {
                                    identityHashMap.remove(obj);
                                } else {
                                    identityHashMap.put(obj, Integer.valueOf(num.intValue() - 1));
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized Object f() {
        Object objA;
        e.f(!this.f21218a);
        objA = this.f21219b.a();
        objA.getClass();
        return objA;
    }

    public synchronized boolean g() {
        return !this.f21218a;
    }

    public CloseableReference(Object obj, ResourceReleaser resourceReleaser, LeakHandler leakHandler, Throwable th, boolean z3) {
        this.f21219b = new p277s2.a(obj, resourceReleaser, z3);
        this.f21220c = leakHandler;
        this.f21221d = th;
    }
}
