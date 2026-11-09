package p135j0;

import Wf.C0769m;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class K extends o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K f37945a = new K(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 msg = (b0) obj;
        Throwable cancellationException = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(msg, "msg");
        C0769m c0769m = msg.f38016b;
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        c0769m.completeExceptionally(cancellationException);
        return Unit.f38893a;
    }
}
