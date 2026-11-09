package z0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f44410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f44411b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(Class clazz, Function1 initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f44410a = clazz;
        this.f44411b = (o) initializer;
    }
}
