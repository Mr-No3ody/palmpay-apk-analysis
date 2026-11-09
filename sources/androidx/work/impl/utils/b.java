package androidx.work.impl.utils;

import androidx.work.impl.AbstractC1274g;
import androidx.work.impl.WorkDatabase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.s f18687b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(androidx.work.impl.s sVar, int i7) {
        super(0);
        this.f18686a = i7;
        this.f18687b = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18686a) {
            case 0:
                Intrinsics.checkNotNullParameter("PeriodWakeUpWorker", "name");
                androidx.work.impl.s workManagerImpl = this.f18687b;
                Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
                WorkDatabase workDatabase = workManagerImpl.f18677d;
                Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
                workDatabase.runInTransaction(new androidx.emoji2.text.j(workDatabase, 4, "PeriodWakeUpWorker", workManagerImpl));
                AbstractC1274g.b(workManagerImpl.f18676c, workManagerImpl.f18677d, workManagerImpl.f18679f);
                break;
            default:
                androidx.work.impl.s sVar = this.f18687b;
                WorkDatabase workDatabase2 = sVar.f18677d;
                Intrinsics.checkNotNullExpressionValue(workDatabase2, "workManagerImpl.workDatabase");
                workDatabase2.runInTransaction(new androidx.camera.video.internal.encoder.o(20, workDatabase2, sVar));
                AbstractC1274g.b(sVar.f18676c, sVar.f18677d, sVar.f18679f);
                break;
        }
        return Unit.f38893a;
    }
}
