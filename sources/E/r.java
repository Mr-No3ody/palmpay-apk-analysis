package E;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.camera.core.impl.C0969b;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2101a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.c f2102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f2103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f2106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.k f2107g;

    public /* synthetic */ r(androidx.camera.core.c cVar, Context context, Executor executor, int i7, androidx.concurrent.futures.k kVar, long j6) {
        this.f2102b = cVar;
        this.f2106f = context;
        this.f2103c = executor;
        this.f2105e = i7;
        this.f2107g = kVar;
        this.f2104d = j6;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x010a A[Catch: all -> 0x009d, TryCatch #5 {all -> 0x009d, blocks: (B:7:0x0041, B:9:0x0049, B:11:0x0070, B:13:0x008a, B:15:0x0094, B:24:0x00a6, B:26:0x00b5, B:28:0x00bb, B:29:0x00c1, B:30:0x00c3, B:33:0x00c7, B:37:0x00d1, B:38:0x00d2, B:39:0x00de, B:40:0x00df, B:41:0x00eb, B:42:0x00ec, B:43:0x00f8, B:44:0x00f9, B:46:0x010a, B:47:0x0111, B:51:0x011a, B:53:0x0134, B:54:0x0138, B:55:0x0142, B:56:0x0144, B:60:0x0149, B:62:0x014d, B:63:0x014f, B:66:0x0153, B:70:0x015a, B:71:0x015b, B:73:0x015f, B:74:0x0184, B:76:0x0188, B:77:0x018d, B:82:0x019a, B:64:0x0150, B:65:0x0152, B:58:0x0146, B:59:0x0148), top: B:89:0x0041, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x0142 A[Catch: all -> 0x009d, TryCatch #5 {all -> 0x009d, blocks: (B:7:0x0041, B:9:0x0049, B:11:0x0070, B:13:0x008a, B:15:0x0094, B:24:0x00a6, B:26:0x00b5, B:28:0x00bb, B:29:0x00c1, B:30:0x00c3, B:33:0x00c7, B:37:0x00d1, B:38:0x00d2, B:39:0x00de, B:40:0x00df, B:41:0x00eb, B:42:0x00ec, B:43:0x00f8, B:44:0x00f9, B:46:0x010a, B:47:0x0111, B:51:0x011a, B:53:0x0134, B:54:0x0138, B:55:0x0142, B:56:0x0144, B:60:0x0149, B:62:0x014d, B:63:0x014f, B:66:0x0153, B:70:0x015a, B:71:0x015b, B:73:0x015f, B:74:0x0184, B:76:0x0188, B:77:0x018d, B:82:0x019a, B:64:0x0150, B:65:0x0152, B:58:0x0146, B:59:0x0148), top: B:89:0x0041, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0145  */
    /* JADX WARN: Code duplicated, block: B:62:0x014d A[Catch: all -> 0x009d, TryCatch #5 {all -> 0x009d, blocks: (B:7:0x0041, B:9:0x0049, B:11:0x0070, B:13:0x008a, B:15:0x0094, B:24:0x00a6, B:26:0x00b5, B:28:0x00bb, B:29:0x00c1, B:30:0x00c3, B:33:0x00c7, B:37:0x00d1, B:38:0x00d2, B:39:0x00de, B:40:0x00df, B:41:0x00eb, B:42:0x00ec, B:43:0x00f8, B:44:0x00f9, B:46:0x010a, B:47:0x0111, B:51:0x011a, B:53:0x0134, B:54:0x0138, B:55:0x0142, B:56:0x0144, B:60:0x0149, B:62:0x014d, B:63:0x014f, B:66:0x0153, B:70:0x015a, B:71:0x015b, B:73:0x015f, B:74:0x0184, B:76:0x0188, B:77:0x018d, B:82:0x019a, B:64:0x0150, B:65:0x0152, B:58:0x0146, B:59:0x0148), top: B:89:0x0041, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x015b A[Catch: all -> 0x009d, TryCatch #5 {all -> 0x009d, blocks: (B:7:0x0041, B:9:0x0049, B:11:0x0070, B:13:0x008a, B:15:0x0094, B:24:0x00a6, B:26:0x00b5, B:28:0x00bb, B:29:0x00c1, B:30:0x00c3, B:33:0x00c7, B:37:0x00d1, B:38:0x00d2, B:39:0x00de, B:40:0x00df, B:41:0x00eb, B:42:0x00ec, B:43:0x00f8, B:44:0x00f9, B:46:0x010a, B:47:0x0111, B:51:0x011a, B:53:0x0134, B:54:0x0138, B:55:0x0142, B:56:0x0144, B:60:0x0149, B:62:0x014d, B:63:0x014f, B:66:0x0153, B:70:0x015a, B:71:0x015b, B:73:0x015f, B:74:0x0184, B:76:0x0188, B:77:0x018d, B:82:0x019a, B:64:0x0150, B:65:0x0152, B:58:0x0146, B:59:0x0148), top: B:89:0x0041, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x015f A[Catch: all -> 0x009d, TryCatch #5 {all -> 0x009d, blocks: (B:7:0x0041, B:9:0x0049, B:11:0x0070, B:13:0x008a, B:15:0x0094, B:24:0x00a6, B:26:0x00b5, B:28:0x00bb, B:29:0x00c1, B:30:0x00c3, B:33:0x00c7, B:37:0x00d1, B:38:0x00d2, B:39:0x00de, B:40:0x00df, B:41:0x00eb, B:42:0x00ec, B:43:0x00f8, B:44:0x00f9, B:46:0x010a, B:47:0x0111, B:51:0x011a, B:53:0x0134, B:54:0x0138, B:55:0x0142, B:56:0x0144, B:60:0x0149, B:62:0x014d, B:63:0x014f, B:66:0x0153, B:70:0x015a, B:71:0x015b, B:73:0x015f, B:74:0x0184, B:76:0x0188, B:77:0x018d, B:82:0x019a, B:64:0x0150, B:65:0x0152, B:58:0x0146, B:59:0x0148), top: B:89:0x0041, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0184 A[Catch: all -> 0x009d, TryCatch #5 {all -> 0x009d, blocks: (B:7:0x0041, B:9:0x0049, B:11:0x0070, B:13:0x008a, B:15:0x0094, B:24:0x00a6, B:26:0x00b5, B:28:0x00bb, B:29:0x00c1, B:30:0x00c3, B:33:0x00c7, B:37:0x00d1, B:38:0x00d2, B:39:0x00de, B:40:0x00df, B:41:0x00eb, B:42:0x00ec, B:43:0x00f8, B:44:0x00f9, B:46:0x010a, B:47:0x0111, B:51:0x011a, B:53:0x0134, B:54:0x0138, B:55:0x0142, B:56:0x0144, B:60:0x0149, B:62:0x014d, B:63:0x014f, B:66:0x0153, B:70:0x015a, B:71:0x015b, B:73:0x015f, B:74:0x0184, B:76:0x0188, B:77:0x018d, B:82:0x019a, B:64:0x0150, B:65:0x0152, B:58:0x0146, B:59:0x0148), top: B:89:0x0041, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0188 A[Catch: all -> 0x009d, TryCatch #5 {all -> 0x009d, blocks: (B:7:0x0041, B:9:0x0049, B:11:0x0070, B:13:0x008a, B:15:0x0094, B:24:0x00a6, B:26:0x00b5, B:28:0x00bb, B:29:0x00c1, B:30:0x00c3, B:33:0x00c7, B:37:0x00d1, B:38:0x00d2, B:39:0x00de, B:40:0x00df, B:41:0x00eb, B:42:0x00ec, B:43:0x00f8, B:44:0x00f9, B:46:0x010a, B:47:0x0111, B:51:0x011a, B:53:0x0134, B:54:0x0138, B:55:0x0142, B:56:0x0144, B:60:0x0149, B:62:0x014d, B:63:0x014f, B:66:0x0153, B:70:0x015a, B:71:0x015b, B:73:0x015f, B:74:0x0184, B:76:0x0188, B:77:0x018d, B:82:0x019a, B:64:0x0150, B:65:0x0152, B:58:0x0146, B:59:0x0148), top: B:89:0x0041, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x018d A[Catch: all -> 0x009d, TRY_LEAVE, TryCatch #5 {all -> 0x009d, blocks: (B:7:0x0041, B:9:0x0049, B:11:0x0070, B:13:0x008a, B:15:0x0094, B:24:0x00a6, B:26:0x00b5, B:28:0x00bb, B:29:0x00c1, B:30:0x00c3, B:33:0x00c7, B:37:0x00d1, B:38:0x00d2, B:39:0x00de, B:40:0x00df, B:41:0x00eb, B:42:0x00ec, B:43:0x00f8, B:44:0x00f9, B:46:0x010a, B:47:0x0111, B:51:0x011a, B:53:0x0134, B:54:0x0138, B:55:0x0142, B:56:0x0144, B:60:0x0149, B:62:0x014d, B:63:0x014f, B:66:0x0153, B:70:0x015a, B:71:0x015b, B:73:0x015f, B:74:0x0184, B:76:0x0188, B:77:0x018d, B:82:0x019a, B:64:0x0150, B:65:0x0152, B:58:0x0146, B:59:0x0148), top: B:89:0x0041, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x015f, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        androidx.camera.core.impl.H h7;
        c0 c0VarOnRetryDecisionRequested;
        switch (this.f2101a) {
            case 0:
                androidx.camera.core.c cVar = this.f2102b;
                Context context = this.f2106f;
                Executor executor = this.f2103c;
                int i7 = this.f2105e;
                androidx.concurrent.futures.k kVar = this.f2107g;
                long j6 = this.f2104d;
                cVar.getClass();
                Trace.beginSection(AbstractC0198c.m0("CX:initAndRetryRecursively"));
                Context contextR = com.palmpay.lib.apm.launchcounter.util.d.r(context);
                try {
                    try {
                        CameraFactory.Provider providerB = cVar.f13718c.b();
                        if (providerB == null) {
                            throw new T(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                        }
                        C0969b c0969b = new C0969b(cVar.f13719d, cVar.f13720e);
                        C0211p c0211pA = cVar.f13718c.a();
                        cVar.f13722g = providerB.newInstance(contextR, c0969b, c0211pA, cVar.f13718c.c());
                        CameraDeviceSurfaceManager.Provider providerD = cVar.f13718c.d();
                        if (providerD == null) {
                            throw new T(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                        }
                        cVar.f13723h = providerD.newInstance(contextR, cVar.f13722g.getCameraManager(), cVar.f13722g.getAvailableCameraIds());
                        UseCaseConfigFactory.Provider providerE = cVar.f13718c.e();
                        if (providerE == null) {
                            throw new T(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                        }
                        cVar.f13724i = providerE.newInstance(contextR);
                        if (executor instanceof ExecutorC0209n) {
                            ((ExecutorC0209n) executor).a(cVar.f13722g);
                        }
                        cVar.f13716a.c(cVar.f13722g);
                        androidx.camera.core.impl.Q.a(contextR, cVar.f13716a, c0211pA);
                        if (i7 > 1 && AbstractC0198c.J()) {
                            AbstractC0198c.Z(-1, "CX:CameraProvider-RetryStatus");
                        }
                        synchronized (cVar.f13717b) {
                            cVar.f13727l = 4;
                            break;
                        }
                        kVar.b(null);
                        Trace.endSection();
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (T e10) {
                    e = e10;
                    h7 = new androidx.camera.core.impl.H(j6, i7, e);
                    c0VarOnRetryDecisionRequested = cVar.f13725j.onRetryDecisionRequested(h7);
                    if (AbstractC0198c.J()) {
                        AbstractC0198c.Z(h7.f13875a, "CX:CameraProvider-RetryStatus");
                    }
                    if (c0VarOnRetryDecisionRequested.f2002b || i7 >= Integer.MAX_VALUE) {
                        synchronized (cVar.f13717b) {
                            cVar.f13727l = 3;
                            break;
                        }
                        if (c0VarOnRetryDecisionRequested.f2003c) {
                            synchronized (cVar.f13717b) {
                                cVar.f13727l = 4;
                                break;
                            }
                            kVar.b(null);
                        } else if (e instanceof androidx.camera.core.impl.P) {
                            String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((androidx.camera.core.impl.P) e).f13942a;
                            p140j8.f.h("CameraX", str, e);
                            kVar.d(new T(new C0212q(str)));
                        } else if (e instanceof T) {
                            kVar.d(e);
                        } else {
                            kVar.d(new T(e));
                        }
                    } else {
                        SystemClock.elapsedRealtime();
                        p140j8.f.G("CameraX");
                        Handler handler = cVar.f13720e;
                        r rVar = new r(cVar, executor, j6, i7, contextR, kVar);
                        long j10 = c0VarOnRetryDecisionRequested.f2001a;
                        if (Build.VERSION.SDK_INT >= 28) {
                            X.a.p(handler, rVar, j10);
                        } else {
                            Message messageObtain = Message.obtain(handler, rVar);
                            messageObtain.obj = "retry_token";
                            handler.sendMessageDelayed(messageObtain, j10);
                        }
                    }
                } catch (androidx.camera.core.impl.P e11) {
                    e = e11;
                    h7 = new androidx.camera.core.impl.H(j6, i7, e);
                    c0VarOnRetryDecisionRequested = cVar.f13725j.onRetryDecisionRequested(h7);
                    if (AbstractC0198c.J()) {
                        AbstractC0198c.Z(h7.f13875a, "CX:CameraProvider-RetryStatus");
                    }
                    if (c0VarOnRetryDecisionRequested.f2002b) {
                        synchronized (cVar.f13717b) {
                            cVar.f13727l = 3;
                            if (c0VarOnRetryDecisionRequested.f2003c) {
                                synchronized (cVar.f13717b) {
                                    cVar.f13727l = 4;
                                    kVar.b(null);
                                }
                            } else if (e instanceof androidx.camera.core.impl.P) {
                                String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((androidx.camera.core.impl.P) e).f13942a;
                                p140j8.f.h("CameraX", str2, e);
                                kVar.d(new T(new C0212q(str2)));
                            } else if (e instanceof T) {
                                kVar.d(e);
                            } else {
                                kVar.d(new T(e));
                            }
                        }
                    } else {
                        synchronized (cVar.f13717b) {
                            cVar.f13727l = 3;
                            if (c0VarOnRetryDecisionRequested.f2003c) {
                                synchronized (cVar.f13717b) {
                                    cVar.f13727l = 4;
                                    kVar.b(null);
                                }
                            } else if (e instanceof androidx.camera.core.impl.P) {
                                String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((androidx.camera.core.impl.P) e).f13942a;
                                p140j8.f.h("CameraX", str3, e);
                                kVar.d(new T(new C0212q(str3)));
                            } else if (e instanceof T) {
                                kVar.d(e);
                            } else {
                                kVar.d(new T(e));
                            }
                        }
                    }
                } catch (RuntimeException e12) {
                    e = e12;
                    h7 = new androidx.camera.core.impl.H(j6, i7, e);
                    c0VarOnRetryDecisionRequested = cVar.f13725j.onRetryDecisionRequested(h7);
                    if (AbstractC0198c.J()) {
                        AbstractC0198c.Z(h7.f13875a, "CX:CameraProvider-RetryStatus");
                    }
                    if (c0VarOnRetryDecisionRequested.f2002b) {
                        synchronized (cVar.f13717b) {
                            cVar.f13727l = 3;
                            if (c0VarOnRetryDecisionRequested.f2003c) {
                                synchronized (cVar.f13717b) {
                                    cVar.f13727l = 4;
                                    kVar.b(null);
                                }
                            } else if (e instanceof androidx.camera.core.impl.P) {
                                String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((androidx.camera.core.impl.P) e).f13942a;
                                p140j8.f.h("CameraX", str4, e);
                                kVar.d(new T(new C0212q(str4)));
                            } else if (e instanceof T) {
                                kVar.d(e);
                            } else {
                                kVar.d(new T(e));
                            }
                        }
                    } else {
                        synchronized (cVar.f13717b) {
                            cVar.f13727l = 3;
                            if (c0VarOnRetryDecisionRequested.f2003c) {
                                synchronized (cVar.f13717b) {
                                    cVar.f13727l = 4;
                                    kVar.b(null);
                                }
                            } else if (e instanceof androidx.camera.core.impl.P) {
                                String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((androidx.camera.core.impl.P) e).f13942a;
                                p140j8.f.h("CameraX", str5, e);
                                kVar.d(new T(new C0212q(str5)));
                            } else if (e instanceof T) {
                                kVar.d(e);
                            } else {
                                kVar.d(new T(e));
                            }
                        }
                    }
                }
                break;
            default:
                int i10 = this.f2105e + 1;
                androidx.camera.core.c cVar2 = this.f2102b;
                cVar2.getClass();
                Context context2 = this.f2106f;
                Executor executor2 = this.f2103c;
                executor2.execute(new r(cVar2, context2, executor2, i10, this.f2107g, this.f2104d));
                return;
        }
    }

    public /* synthetic */ r(androidx.camera.core.c cVar, Executor executor, long j6, int i7, Context context, androidx.concurrent.futures.k kVar) {
        this.f2102b = cVar;
        this.f2103c = executor;
        this.f2104d = j6;
        this.f2105e = i7;
        this.f2106f = context;
        this.f2107g = kVar;
    }
}
