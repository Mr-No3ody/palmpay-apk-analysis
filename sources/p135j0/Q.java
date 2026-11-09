package p135j0;

import Ef.a;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.ReadScope;
import androidx.datastore.core.Serializer;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes.dex */
public class Q implements ReadScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f37978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializer f37979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f37980c;

    public Q(File file, Serializer serializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f37978a = file;
        this.f37979b = serializer;
        this.f37980c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [j0.Q] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [j0.Q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [j0.Q] */
    public static Object a(Q q10, Continuation continuation) {
        P p3;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (continuation instanceof P) {
            p3 = (P) continuation;
            int i7 = p3.f37977e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                p3.f37977e = i7 - Integer.MIN_VALUE;
            } else {
                p3 = new P(q10, continuation);
            }
        } else {
            p3 = new P(q10, continuation);
        }
        Object obj = p3.f37975c;
        a aVar = a.f2423a;
        ?? r3 = p3.f37977e;
        try {
            if (r3 != 0) {
                if (r3 == 1) {
                    fileInputStream = p3.f37974b;
                    r3 = (Q) p3.f37973a;
                    try {
                        g.M(obj);
                        b.o(fileInputStream, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            b.o(fileInputStream, th2);
                            throw th4;
                        }
                    }
                }
                if (r3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) p3.f37973a;
                try {
                    g.M(obj);
                    b.o(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        b.o(closeable, th);
                        throw th6;
                    }
                }
            }
            g.M(obj);
            if (q10.f37980c.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(q10.f37978a);
                try {
                    Serializer serializer = q10.f37979b;
                    p3.f37973a = q10;
                    p3.f37974b = fileInputStream2;
                    p3.f37977e = 1;
                    Object from = serializer.readFrom(fileInputStream2, p3);
                    if (from != aVar) {
                        fileInputStream = fileInputStream2;
                        obj = from;
                        b.o(fileInputStream, null);
                        return obj;
                    }
                } catch (Throwable th7) {
                    r3 = q10;
                    fileInputStream = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                boolean zExists = q10.f37978a.exists();
                Serializer serializer2 = q10.f37979b;
                if (!zExists) {
                    return serializer2.getDefaultValue();
                }
                FileInputStream fileInputStream3 = new FileInputStream(q10.f37978a);
                try {
                    p3.f37973a = fileInputStream3;
                    p3.f37974b = null;
                    p3.f37977e = 2;
                    Object from2 = serializer2.readFrom(fileInputStream3, p3);
                    if (from2 != aVar) {
                        obj = from2;
                        closeable = fileInputStream3;
                        b.o(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream3;
                    throw th;
                }
            }
            return aVar;
        } catch (FileNotFoundException unused2) {
            q10 = r3;
        }
    }

    @Override // androidx.datastore.core.Closeable
    public final void close() {
        this.f37980c.set(true);
    }

    @Override // androidx.datastore.core.ReadScope
    public final Object readData(Continuation continuation) {
        return a(this, continuation);
    }
}
