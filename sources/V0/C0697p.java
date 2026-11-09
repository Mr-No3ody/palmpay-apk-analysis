package V0;

import E.AbstractC0198c;
import android.content.Context;
import android.os.Trace;
import androidx.work.Clock;
import androidx.work.Tracer;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: V0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0697p implements Tracer, Clock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0697p f9960a = new C0697p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0697p f9961b = new C0697p();

    public B a(Context appContext, String workerClassName, WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        try {
            Class<? extends U> clsAsSubclass = Class.forName(workerClassName).asSubclass(B.class);
            Intrinsics.checkNotNullExpressionValue(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n                val co…Parameters)\n            }");
                B b7 = (B) objNewInstance;
                if (!b7.f9859d) {
                    return b7;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                C.c().b(Z.f9914a, "Could not instantiate " + workerClassName, th);
                throw th;
            }
        } catch (Throwable th2) {
            C.c().b(Z.f9914a, "Invalid class: " + workerClassName, th2);
            throw th2;
        }
    }

    @Override // androidx.work.Tracer
    public void beginAsyncSection(String methodName, int i7) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        AbstractC0198c.c(methodName, i7);
    }

    @Override // androidx.work.Tracer
    public void beginSection(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        AbstractC0198c.e(label);
    }

    @Override // androidx.work.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // androidx.work.Tracer
    public void endAsyncSection(String methodName, int i7) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        AbstractC0198c.r(methodName, i7);
    }

    @Override // androidx.work.Tracer
    public void endSection() {
        Trace.endSection();
    }

    @Override // androidx.work.Tracer
    public boolean isEnabled() {
        return AbstractC0198c.J();
    }
}
