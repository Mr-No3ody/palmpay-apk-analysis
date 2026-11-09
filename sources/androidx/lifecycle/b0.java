package androidx.lifecycle;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C1858h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Lazy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1858h f17434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.o f17435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f17436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlin.jvm.internal.o f17437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a0 f17438e;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(C1858h viewModelClass, Function0 storeProducer, Function0 factoryProducer, Function0 extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f17434a = viewModelClass;
        this.f17435b = (kotlin.jvm.internal.o) storeProducer;
        this.f17436c = factoryProducer;
        this.f17437d = (kotlin.jvm.internal.o) extrasProducer;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.o] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.o] */
    @Override // kotlin.Lazy
    public final Object getValue() {
        a0 a0Var = this.f17438e;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0VarH = new androidx.camera.video.internal.c((i0) this.f17435b.invoke(), (ViewModelProvider$Factory) this.f17436c.invoke(), (z0.b) this.f17437d.invoke()).h(p002a.a.m(this.f17434a));
        this.f17438e = a0VarH;
        return a0VarH;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f17438e != null;
    }
}
