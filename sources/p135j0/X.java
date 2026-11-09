package p135j0;

import C0.C0127t;
import Ef.a;
import android.os.Build;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.video.u;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.StorageConnection;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import p072eg.e;
import p355xf.C2126e;

/* JADX INFO: loaded from: classes.dex */
public final class X implements StorageConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f38001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializer f38002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterProcessCoordinator f38003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0127t f38004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f38005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f38006f;

    public X(File file, Serializer serializer, InterProcessCoordinator coordinator, C0127t onClose) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f38001a = file;
        this.f38002b = serializer;
        this.f38003c = coordinator;
        this.f38004d = onClose;
        this.f38005e = new AtomicBoolean(false);
        this.f38006f = new e();
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        this.f38005e.set(true);
        this.f38004d.invoke();
    }

    @Override // androidx.datastore.core.StorageConnection
    public final InterProcessCoordinator getCoordinator() {
        return this.f38003c;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007b, blocks: (B:33:0x007a, B:42:0x008b, B:41:0x0088, B:38:0x0083), top: B:52:0x0020, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [j0.X] */
    /* JADX WARN: Type inference failed for: r0v13, types: [j0.X] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [j0.V, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [j0.X] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // androidx.datastore.core.StorageConnection
    public final Object readScope(Function3 function3, Continuation continuation) throws Throwable {
        ?? v3;
        Throwable th;
        Q q10;
        ?? r10;
        ?? r3;
        if (continuation instanceof V) {
            V v4 = (V) continuation;
            int i7 = v4.f37993f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                v4.f37993f = i7 - Integer.MIN_VALUE;
                v3 = v4;
            } else {
                v3 = new V(this, continuation);
            }
        } else {
            v3 = new V(this, continuation);
        }
        Object obj = v3.f37991d;
        a aVar = a.f2423a;
        int i10 = v3.f37993f;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function3 = v3.f37990c;
                q10 = v3.f37989b;
                v3 = v3.f37988a;
                try {
                    g.M(obj);
                    r3 = v3;
                    r10 = function3;
                    try {
                        q10.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        r3.f38006f.unlock(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        q10.close();
                    } catch (Throwable th4) {
                        C2126e.a(th, th4);
                    }
                    throw th;
                }
            }
            g.M(obj);
            if (this.f38005e.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zTryLock = this.f38006f.tryLock(null);
            try {
                Q q11 = new Q(this.f38001a, this.f38002b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zTryLock);
                    v3.f37988a = this;
                    v3.f37989b = q11;
                    v3.f37990c = zTryLock;
                    v3.f37993f = 1;
                    Object objInvoke = function3.invoke(q11, boolValueOf, v3);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    obj = objInvoke;
                    r10 = zTryLock;
                    r3 = this;
                    q10 = q11;
                    q10.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r10 != 0) {
                        r3.f38006f.unlock(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    function3 = zTryLock;
                    v3 = this;
                    q10 = q11;
                    q10.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                function3 = zTryLock;
                v3 = this;
                if (function3 != 0) {
                    v3.f38006f.unlock(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (function3 != 0) {
                v3.f38006f.unlock(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e2 A[Catch: all -> 0x0128, IOException -> 0x012a, TRY_ENTER, TryCatch #0 {IOException -> 0x012a, blocks: (B:44:0x00e2, B:46:0x00e8, B:48:0x00fb, B:52:0x0107, B:53:0x0127, B:49:0x0100, B:61:0x0135, B:68:0x0142, B:67:0x013f), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8 A[Catch: all -> 0x0128, IOException -> 0x012a, TryCatch #0 {IOException -> 0x012a, blocks: (B:44:0x00e2, B:46:0x00e8, B:48:0x00fb, B:52:0x0107, B:53:0x0127, B:49:0x0100, B:61:0x0135, B:68:0x0142, B:67:0x013f), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb A[Catch: all -> 0x0128, IOException -> 0x012a, TryCatch #0 {IOException -> 0x012a, blocks: (B:44:0x00e2, B:46:0x00e8, B:48:0x00fb, B:52:0x0107, B:53:0x0127, B:49:0x0100, B:61:0x0135, B:68:0x0142, B:67:0x013f), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0100 A[Catch: all -> 0x0128, IOException -> 0x012a, TryCatch #0 {IOException -> 0x012a, blocks: (B:44:0x00e2, B:46:0x00e8, B:48:0x00fb, B:52:0x0107, B:53:0x0127, B:49:0x0100, B:61:0x0135, B:68:0x0142, B:67:0x013f), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x0107 A[Catch: all -> 0x0128, IOException -> 0x012a, TryCatch #0 {IOException -> 0x012a, blocks: (B:44:0x00e2, B:46:0x00e8, B:48:0x00fb, B:52:0x0107, B:53:0x0127, B:49:0x0100, B:61:0x0135, B:68:0x0142, B:67:0x013f), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0135 A[Catch: all -> 0x0128, IOException -> 0x012a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x012a, blocks: (B:44:0x00e2, B:46:0x00e8, B:48:0x00fb, B:52:0x0107, B:53:0x0127, B:49:0x0100, B:61:0x0135, B:68:0x0142, B:67:0x013f), top: B:78:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x0107, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.core.StorageConnection
    public final Object writeScope(Function2 function2, Continuation continuation) throws IOException {
        W w3;
        File file;
        X x3;
        Mutex mutex;
        Z z3;
        Throwable th;
        Z z8;
        File file2;
        X x7;
        File toFile;
        boolean zRenameTo;
        if (continuation instanceof W) {
            w3 = (W) continuation;
            int i7 = w3.f38000g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                w3.f38000g = i7 - Integer.MIN_VALUE;
            } else {
                w3 = new W(this, continuation);
            }
        } else {
            w3 = new W(this, continuation);
        }
        Object obj = w3.f37998e;
        a aVar = a.f2423a;
        int i10 = w3.f38000g;
        try {
            try {
                try {
                    try {
                        if (i10 == 0) {
                            g.M(obj);
                            if (this.f38005e.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            File file3 = this.f38001a;
                            File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    throw new IOException(u.k(file3, "Unable to create parent directories of "));
                                }
                            }
                            w3.f37994a = this;
                            w3.f37995b = function2;
                            e eVar = this.f38006f;
                            w3.f37996c = eVar;
                            w3.f38000g = 1;
                            if (eVar.lock(null, w3) != aVar) {
                                x3 = this;
                                mutex = eVar;
                            }
                            return aVar;
                        }
                        if (i10 != 1) {
                            if (i10 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z8 = w3.f37997d;
                            File file4 = (File) w3.f37996c;
                            mutex = (Mutex) w3.f37995b;
                            x7 = w3.f37994a;
                            try {
                                g.M(obj);
                                file2 = file4;
                                Unit unit = Unit.f38893a;
                                try {
                                    z8.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    toFile = x7.f38001a;
                                    Intrinsics.checkNotNullParameter(file2, "<this>");
                                    Intrinsics.checkNotNullParameter(toFile, "toFile");
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = Z.a.j(file2, toFile);
                                    } else {
                                        zRenameTo = file2.renameTo(toFile);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + file2 + " to " + x7.f38001a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                Unit unit2 = Unit.f38893a;
                                mutex.unlock(null);
                                return Unit.f38893a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    z8.close();
                                } catch (Throwable th4) {
                                    C2126e.a(th, th4);
                                }
                                throw th;
                            }
                        }
                        Mutex mutex2 = (Mutex) w3.f37996c;
                        Function2 function3 = (Function2) w3.f37995b;
                        x3 = w3.f37994a;
                        g.M(obj);
                        mutex = mutex2;
                        function2 = function3;
                        w3.f37994a = x3;
                        w3.f37995b = mutex;
                        w3.f37996c = file;
                        w3.f37997d = z3;
                        w3.f38000g = 2;
                        if (function2.invoke(z3, w3) != aVar) {
                            file2 = file;
                            x7 = x3;
                            z8 = z3;
                            Unit unit3 = Unit.f38893a;
                            z8.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (file2.exists()) {
                                toFile = x7.f38001a;
                                Intrinsics.checkNotNullParameter(file2, "<this>");
                                Intrinsics.checkNotNullParameter(toFile, "toFile");
                                if (Build.VERSION.SDK_INT >= 26) {
                                    zRenameTo = Z.a.j(file2, toFile);
                                } else {
                                    zRenameTo = file2.renameTo(toFile);
                                }
                                if (zRenameTo) {
                                    throw new IOException("Unable to rename " + file2 + " to " + x7.f38001a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                            }
                            Unit unit4 = Unit.f38893a;
                            mutex.unlock(null);
                            return Unit.f38893a;
                        }
                        return aVar;
                    } catch (Throwable th5) {
                        th = th5;
                        z8 = z3;
                        z8.close();
                        throw th;
                    }
                    Serializer serializer = x3.f38002b;
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(serializer, "serializer");
                    z3 = new Z(file, serializer);
                } catch (IOException e10) {
                    e = e10;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(x3.f38001a.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                mutex.unlock(null);
                throw th6;
            }
        } catch (IOException e11) {
            e = e11;
            file = aVar;
        }
    }
}
