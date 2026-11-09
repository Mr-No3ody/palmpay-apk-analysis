package p135j0;

import Ef.a;
import Wf.AbstractC0780y;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.video.u;
import androidx.datastore.core.InterProcessCoordinator;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import org.chromium.support_lib_boundary.util.b;
import p072eg.e;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements InterProcessCoordinator {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d0 f38063j = new d0(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f38064k = "Resource deadlock would occur";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f38065l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f38066m = 60000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f38067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f38068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Flow f38069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f38072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f38073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f38074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f38075i;

    public j0(CoroutineContext context, File file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f38067a = context;
        this.f38068b = file;
        this.f38069c = m0.f38101b.observe(file);
        this.f38070d = ".lock";
        this.f38071e = ".version";
        this.f38072f = "fcntl failed: EAGAIN";
        this.f38073g = new e();
        this.f38074h = C2131j.b(new g0(this, 2));
        this.f38075i = C2131j.b(new g0(this, 1));
    }

    public static final void a(j0 j0Var, File file) {
        j0Var.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException(u.k(file, "Unable to create parent directories of "));
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Flow getUpdateNotifications() {
        return this.f38069c;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object getVersion(Continuation continuation) {
        t tVar = this.f38075i;
        if (tVar.isInitialized()) {
            return new Integer(p0.f38116b.nativeGetCounterValue(((p0) tVar.getValue()).f38117a));
        }
        return AbstractC0780y.s(this.f38067a, new e0(this, null), continuation);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object incrementAndGetVersion(Continuation continuation) {
        t tVar = this.f38075i;
        if (tVar.isInitialized()) {
            return new Integer(p0.f38116b.nativeIncrementAndGetCounterValue(((p0) tVar.getValue()).f38117a));
        }
        return AbstractC0780y.s(this.f38067a, new f0(this, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd A[Catch: all -> 0x00c1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:42:0x00bd, B:56:0x00db, B:57:0x00de), top: B:67:0x0022, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00db A[Catch: all -> 0x00c1, TRY_ENTER, TryCatch #1 {all -> 0x00c1, blocks: (B:42:0x00bd, B:56:0x00db, B:57:0x00de), top: B:67:0x0022, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Ef.a, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object lock(Function1 function1, Continuation continuation) throws Throwable {
        h0 h0Var;
        j0 j0Var;
        FileOutputStream fileOutputStream;
        Throwable th;
        Function1 function2;
        Closeable closeable;
        ?? r3;
        ?? r10;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        Closeable closeable2;
        ?? r11;
        ?? r12;
        if (continuation instanceof h0) {
            h0Var = (h0) continuation;
            int i7 = h0Var.f38051f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                h0Var.f38051f = i7 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, continuation);
            }
        } else {
            h0Var = new h0(this, continuation);
        }
        ?? r13 = h0Var.f38049d;
        ?? r14 = a.f2423a;
        int i10 = h0Var.f38051f;
        try {
            try {
                try {
                    if (i10 == 0) {
                        g.M(r13);
                        h0Var.f38046a = this;
                        h0Var.f38047b = function1;
                        e eVar = this.f38073g;
                        h0Var.f38048c = eVar;
                        h0Var.f38051f = 1;
                        if (eVar.lock(null, h0Var) != r14) {
                            j0Var = this;
                            r13 = eVar;
                        }
                        return r14;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) h0Var.f38048c;
                            closeable2 = (Closeable) h0Var.f38047b;
                            Mutex mutex = (Mutex) h0Var.f38046a;
                            try {
                                g.M(r13);
                                r12 = mutex;
                                r11 = r13;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    b.o(closeable2, null);
                                    r12.unlock(null);
                                    return r11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r13 = r12;
                                    r13.unlock(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        closeable = (Closeable) h0Var.f38048c;
                        r3 = (Mutex) h0Var.f38047b;
                        function2 = (Function1) h0Var.f38046a;
                        try {
                            g.M(r13);
                            r3 = r3;
                            r10 = r13;
                            fileLock2 = (FileLock) r10;
                            try {
                                h0Var.f38046a = r3;
                                h0Var.f38047b = closeable;
                                h0Var.f38048c = fileLock2;
                                h0Var.f38051f = 3;
                                objInvoke = function2.invoke(h0Var);
                                if (objInvoke != r14) {
                                    closeable2 = closeable;
                                    fileLock = fileLock2;
                                    r11 = objInvoke;
                                    r12 = r3;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    b.o(closeable2, null);
                                    r12.unlock(null);
                                    return r11;
                                }
                                return r14;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    Mutex mutex2 = (Mutex) h0Var.f38048c;
                    Function1 function3 = (Function1) h0Var.f38047b;
                    j0Var = (j0) h0Var.f38046a;
                    g.M(r13);
                    r13 = mutex2;
                    function1 = function3;
                    d0 d0Var = f38063j;
                    h0Var.f38046a = function1;
                    h0Var.f38047b = r13;
                    h0Var.f38048c = fileOutputStream;
                    h0Var.f38051f = 2;
                    Object exclusiveFileLockWithRetryIfDeadlock = d0Var.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream, h0Var);
                    if (exclusiveFileLockWithRetryIfDeadlock != r14) {
                        function2 = function1;
                        closeable = fileOutputStream;
                        r3 = r13;
                        r10 = exclusiveFileLockWithRetryIfDeadlock;
                        fileLock2 = (FileLock) r10;
                        h0Var.f38046a = r3;
                        h0Var.f38047b = closeable;
                        h0Var.f38048c = fileLock2;
                        h0Var.f38051f = 3;
                        objInvoke = function2.invoke(h0Var);
                        if (objInvoke != r14) {
                            closeable2 = closeable;
                            fileLock = fileLock2;
                            r11 = objInvoke;
                            r12 = r3;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            b.o(closeable2, null);
                            r12.unlock(null);
                            return r11;
                        }
                    }
                    return r14;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                fileOutputStream = new FileOutputStream((File) j0Var.f38074h.getValue());
            } catch (Throwable th7) {
                th = th7;
                r13.unlock(null);
                throw th;
            }
        } catch (Throwable th8) {
            r13 = h0Var;
            try {
                throw th8;
            } catch (Throwable th9) {
                b.o(r14, th8);
                throw th9;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de A[Catch: all -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f9 A[Catch: all -> 0x00e2, TRY_ENTER, TryCatch #1 {all -> 0x00e2, blocks: (B:60:0x00de, B:72:0x00f9, B:73:0x00fc), top: B:85:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [j0.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    public final Object tryLock(Function2 function2, Continuation continuation) throws Throwable {
        ?? i0Var;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        e eVar;
        boolean z3;
        FileInputStream fileInputStream;
        e eVar2;
        boolean z8;
        ?? r3 = function2;
        if (continuation instanceof i0) {
            i0 i0Var2 = (i0) continuation;
            int i7 = i0Var2.f38058g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                i0Var2.f38058g = i7 - Integer.MIN_VALUE;
                i0Var = i0Var2;
            } else {
                i0Var = new i0(this, continuation);
            }
        } else {
            i0Var = new i0(this, continuation);
        }
        Object objInvoke = i0Var.f38056e;
        a aVar = a.f2423a;
        ?? r10 = i0Var.f38058g;
        try {
            try {
                if (r10 != 0) {
                    if (r10 == 1) {
                        z8 = i0Var.f38055d;
                        eVar2 = i0Var.f38052a;
                        g.M(objInvoke);
                        if (z8) {
                            eVar2.unlock(null);
                        }
                        return objInvoke;
                    }
                    if (r10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z3 = i0Var.f38055d;
                    fileLock = i0Var.f38054c;
                    fileInputStream = i0Var.f38053b;
                    eVar = i0Var.f38052a;
                    try {
                        g.M(objInvoke);
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        b.o(fileInputStream, null);
                        if (z3) {
                            eVar.unlock(null);
                        }
                        return objInvoke;
                    } catch (Throwable th) {
                        th = th;
                        if (fileLock != null) {
                            fileLock.release();
                        }
                        throw th;
                    }
                }
                g.M(objInvoke);
                e eVar3 = this.f38073g;
                boolean zTryLock = eVar3.tryLock(null);
                try {
                    if (zTryLock) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.f38074h.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (IOException e10) {
                            String message2 = e10.getMessage();
                            if ((message2 == null || !y.m(message2, this.f38072f, false)) && ((message = e10.getMessage()) == null || !y.m(message, f38064k, false))) {
                                throw e10;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                            i0Var.f38052a = eVar3;
                            i0Var.f38053b = fileInputStream2;
                            i0Var.f38054c = fileLockTryLock;
                            i0Var.f38055d = zTryLock;
                            i0Var.f38058g = 2;
                            objInvoke = r3.invoke(boolValueOf, i0Var);
                            if (objInvoke != aVar) {
                                eVar = eVar3;
                                z3 = zTryLock;
                                fileInputStream = fileInputStream2;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                b.o(fileInputStream, null);
                                if (z3) {
                                    eVar.unlock(null);
                                }
                                return objInvoke;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        i0Var.f38052a = eVar3;
                        i0Var.f38055d = zTryLock;
                        i0Var.f38058g = 1;
                        objInvoke = r3.invoke(bool, i0Var);
                        if (objInvoke != aVar) {
                            eVar2 = eVar3;
                            z8 = zTryLock;
                            if (z8) {
                                eVar2.unlock(null);
                            }
                            return objInvoke;
                        }
                    }
                    return aVar;
                } catch (Throwable th4) {
                    th = th4;
                    i0Var = eVar3;
                    r3 = zTryLock;
                    if (r3 != 0) {
                        i0Var.unlock(null);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                ?? r11 = i0Var;
                try {
                    throw th5;
                } catch (Throwable th6) {
                    try {
                        b.o(r10, th5);
                        throw th6;
                    } catch (Throwable th7) {
                        th = th7;
                        r3 = r3;
                        i0Var = r11;
                        if (r3 != 0) {
                            i0Var.unlock(null);
                        }
                        throw th;
                    }
                }
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }
}
