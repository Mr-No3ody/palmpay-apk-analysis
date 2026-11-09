package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f11985b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(I i7, int i10) {
        super(0);
        this.f11984a = i10;
        this.f11985b = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11984a) {
            case 0:
                this.f11985b.d();
                break;
            case 1:
                this.f11985b.c();
                break;
            default:
                this.f11985b.d();
                break;
        }
        return Unit.f38893a;
    }
}
