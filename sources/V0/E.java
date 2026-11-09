package V0;

import com.transsnet.palmpay.core.task.PeriodWakeUpWorker;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class E extends V {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9870d = 1;

    public /* synthetic */ E(Class cls, boolean z3) {
        super(cls);
    }

    @Override // V0.V
    public final X b() {
        switch (this.f9870d) {
            case 0:
                Intrinsics.checkNotNullParameter(this, "builder");
                return new G((UUID) this.f9905a, (androidx.work.impl.model.k) this.f9906b, (Set) this.f9907c);
            default:
                if (((androidx.work.impl.model.k) this.f9906b).f18628q) {
                    throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
                }
                Intrinsics.checkNotNullParameter(this, "builder");
                return new M((UUID) this.f9905a, (androidx.work.impl.model.k) this.f9906b, (Set) this.f9907c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Class workerClass) {
        super(workerClass);
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E() {
        super(PeriodWakeUpWorker.class);
        TimeUnit flexIntervalTimeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(PeriodWakeUpWorker.class, "workerClass");
        Intrinsics.checkNotNullParameter(flexIntervalTimeUnit, "repeatIntervalTimeUnit");
        Intrinsics.checkNotNullParameter(flexIntervalTimeUnit, "flexIntervalTimeUnit");
        androidx.work.impl.model.k kVar = (androidx.work.impl.model.k) this.f9906b;
        long millis = flexIntervalTimeUnit.toMillis(30L);
        long millis2 = flexIntervalTimeUnit.toMillis(10L);
        kVar.getClass();
        if (millis < 900000) {
            C.c().getClass();
        }
        kVar.f18619h = millis < 900000 ? 900000L : millis;
        if (millis2 < 300000) {
            C.c().getClass();
        }
        if (millis2 > kVar.f18619h) {
            C.c().getClass();
        }
        kVar.f18620i = kotlin.ranges.b.d(millis2, 300000L, kVar.f18619h);
    }
}
