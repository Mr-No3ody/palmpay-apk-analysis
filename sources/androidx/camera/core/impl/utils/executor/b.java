package androidx.camera.core.impl.utils.executor;

import U2.B;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.AdjustFactory;
import com.google.common.net.HttpHeaders;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14160b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f14159a = i7;
        this.f14160b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Ye.a aVar;
        Eg.g gVarA;
        switch (this.f14159a) {
            case 0:
                ((Runnable) this.f14160b).run();
                return null;
            case 1:
                try {
                    return ((Callable) this.f14160b).call();
                } catch (Throwable th) {
                    AdjustFactory.getLogger().error("Callable error [%s] of type [%s]", th.getMessage(), th.getClass().getCanonicalName());
                    return null;
                }
            case 2:
                androidx.work.impl.model.b bVar = p314uf.d.INSTANCE.f43002a;
                bVar.getClass();
                SystemClock.elapsedRealtime();
                p314uf.b bVar2 = (p314uf.b) this.f14160b;
                Object objF = null;
                String strE = TextUtils.isEmpty(null) ? bVar2.e() : null;
                top.zibin.luban.io.a aVar2 = (top.zibin.luban.io.a) bVar.f18580b;
                ReentrantLock reentrantLock = (ReentrantLock) aVar2.f42646c;
                reentrantLock.lock();
                try {
                    ArrayList arrayListC = ((Ye.b) aVar2.f42647d).c(((StringBuilder) new Oe.a("key", aVar2.a(strE)).f6830b).toString(), null);
                    int i7 = 0;
                    if (arrayListC.size() > 0) {
                        aVar = (Ye.a) arrayListC.get(0);
                        break;
                    } else {
                        aVar = null;
                    }
                    reentrantLock.unlock();
                    int i10 = bVar2.f42995B;
                    if (i10 == 0) {
                        throw null;
                    }
                    int i11 = i10 - 1;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            androidx.work.impl.model.b.b(bVar2, aVar);
                            gVarA = bVar.a(bVar2);
                            if (((Exception) gVarA.f2444e) != null && aVar != null) {
                                gVarA.f2442c = aVar.f11375c;
                                gVarA.f2443d = aVar.f11376d;
                                gVarA.f2441b = true;
                                gVarA.f2444e = null;
                            }
                        } else if (i11 != 2) {
                            if (i11 == 3) {
                                gVarA = new Eg.g(4);
                                if (aVar == null) {
                                    gVarA.f2444e = new B("The cache mode is ONLY_READ_CACHE, but did not find the cache.", 6);
                                } else {
                                    gVarA.f2442c = aVar.f11375c;
                                    gVarA.f2443d = aVar.f11376d;
                                    gVarA.f2441b = true;
                                }
                            } else if (i11 != 4) {
                                gVarA = null;
                            } else {
                                gVarA = bVar.a(bVar2);
                            }
                        } else if (aVar != null) {
                            gVarA = new Eg.g(4);
                            gVarA.f2442c = aVar.f11375c;
                            gVarA.f2443d = aVar.f11376d;
                            gVarA.f2441b = true;
                        } else {
                            gVarA = bVar.a(bVar2);
                        }
                    } else if (aVar == null || aVar.f11377e <= System.currentTimeMillis()) {
                        androidx.work.impl.model.b.b(bVar2, aVar);
                        gVarA = bVar.a(bVar2);
                    } else {
                        gVarA = new Eg.g(4);
                        gVarA.f2442c = aVar.f11375c;
                        gVarA.f2443d = aVar.f11376d;
                        gVarA.f2441b = true;
                    }
                    if (((Exception) gVarA.f2444e) == null) {
                        try {
                            i7 = Integer.parseInt((String) ((Xe.d) gVarA.f2442c).a("ResponseCode"));
                            break;
                        } catch (Exception unused) {
                        }
                        if (i7 == 304) {
                            if (aVar != null) {
                                gVarA.f2441b = true;
                                Xe.d dVar = aVar.f11375c;
                                gVarA.f2442c = dVar;
                                dVar.j("ResponseCode");
                                dVar.e("304", "ResponseCode");
                                gVarA.f2443d = aVar.f11376d;
                            }
                        } else if (aVar == null) {
                            if (i10 == 0) {
                                throw null;
                            }
                            if (i11 == 0) {
                                long jA = p226og.b.a((Xe.d) gVarA.f2442c);
                                long jX = ((Xe.d) gVarA.f2442c).x(HttpHeaders.LAST_MODIFIED);
                                if (jA > 0 || jX > 0) {
                                    Ye.a aVar3 = new Ye.a();
                                    aVar3.f11375c = (Xe.d) gVarA.f2442c;
                                    aVar3.f11376d = (byte[]) gVarA.f2443d;
                                    aVar3.f11377e = jA;
                                    ((ReentrantLock) aVar2.f42646c).lock();
                                    try {
                                        aVar3.f11374b = aVar2.a(strE);
                                        ((Ye.b) aVar2.f42647d).w(aVar3);
                                        ((ReentrantLock) aVar2.f42646c).unlock();
                                    } catch (Throwable th2) {
                                        ((ReentrantLock) aVar2.f42646c).unlock();
                                        throw th2;
                                    }
                                }
                            } else if (i11 == 1 || i11 == 2) {
                                long jA2 = p226og.b.a((Xe.d) gVarA.f2442c);
                                Ye.a aVar4 = new Ye.a();
                                aVar4.f11375c = (Xe.d) gVarA.f2442c;
                                aVar4.f11376d = (byte[]) gVarA.f2443d;
                                aVar4.f11377e = jA2;
                                ((ReentrantLock) aVar2.f42646c).lock();
                                try {
                                    aVar4.f11374b = aVar2.a(strE);
                                    ((Ye.b) aVar2.f42647d).w(aVar4);
                                    ((ReentrantLock) aVar2.f42646c).unlock();
                                } catch (Throwable th3) {
                                    ((ReentrantLock) aVar2.f42646c).unlock();
                                    throw th3;
                                }
                            }
                        } else if (!gVarA.f2441b) {
                            aVar.f11377e = p226og.b.a((Xe.d) gVarA.f2442c);
                            Xe.d dVar2 = aVar.f11375c;
                            Xe.d dVar3 = (Xe.d) gVarA.f2442c;
                            dVar2.getClass();
                            for (Map.Entry entry : ((AbstractMap) dVar3.f1592b).entrySet()) {
                                ((AbstractMap) dVar2.f1592b).put((String) entry.getKey(), (List) entry.getValue());
                            }
                            aVar.f11376d = (byte[]) gVarA.f2443d;
                            ((ReentrantLock) aVar2.f42646c).lock();
                            try {
                                aVar.f11374b = aVar2.a(strE);
                                ((Ye.b) aVar2.f42647d).w(aVar);
                                ((ReentrantLock) aVar2.f42646c).unlock();
                            } catch (Throwable th4) {
                                ((ReentrantLock) aVar2.f42646c).unlock();
                                throw th4;
                            }
                        }
                    }
                    if (((Exception) gVarA.f2444e) == null) {
                        try {
                            objF = bVar2.f((Xe.d) gVarA.f2442c, (byte[]) gVarA.f2443d);
                        } catch (Exception e10) {
                            gVarA.f2444e = e10;
                        }
                        break;
                    }
                    Xe.d dVar4 = (Xe.d) gVarA.f2442c;
                    SystemClock.elapsedRealtime();
                    return new p314uf.c(dVar4, objF, (Exception) gVarA.f2444e);
                } catch (Throwable th5) {
                    reentrantLock.unlock();
                    throw th5;
                }
            default:
                synchronized (((p318v1.c) this.f14160b)) {
                    try {
                        p318v1.c cVar = (p318v1.c) this.f14160b;
                        if (cVar.f43053j == null) {
                            return null;
                        }
                        cVar.o();
                        if (((p318v1.c) this.f14160b).g()) {
                            ((p318v1.c) this.f14160b).l();
                            ((p318v1.c) this.f14160b).f43055p = 0;
                        }
                        return null;
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
        }
    }
}
