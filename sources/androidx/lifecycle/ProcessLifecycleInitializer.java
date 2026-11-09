package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import androidx.startup.Initializer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Landroidx/startup/Initializer;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleInitializer implements Initializer<LifecycleOwner> {
    @Override // androidx.startup.Initializer
    public final LifecycleOwner create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        P0.a aVarC = P0.a.c(context);
        Intrinsics.checkNotNullExpressionValue(aVarC, "getInstance(context)");
        if (!aVarC.f6855b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        AtomicBoolean atomicBoolean = AbstractC1209t.f17472a;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!AbstractC1209t.f17472a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C1208s());
        }
        J j6 = M.f17358j;
        j6.init$lifecycle_process_release(context);
        return j6.get();
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return kotlin.collections.z.f38935a;
    }
}
