package V0;

import androidx.work.Worker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Worker f9913b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(Worker worker, int i7) {
        super(0);
        this.f9912a = i7;
        this.f9913b = worker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9912a) {
            case 0:
                this.f9913b.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            default:
                return this.f9913b.c();
        }
    }
}
