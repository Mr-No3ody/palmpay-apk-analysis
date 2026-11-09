package C6;

import android.os.Handler;
import com.palmpay.lib.liveness.result.LiveIDResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.g0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f1199b;

    public /* synthetic */ p(v vVar, int i7) {
        this.f1198a = i7;
        this.f1199b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g0 g0Var;
        Object value;
        switch (this.f1198a) {
            case 0:
                Exception exception = (Exception) obj;
                Intrinsics.checkNotNullParameter(exception, "exception");
                p292t6.a.b("Error record faces video");
                Boolean bool = Boolean.TRUE;
                v vVar = this.f1199b;
                vVar.f1228Y = bool;
                o oVar = vVar.f1227X;
                if (oVar != null) {
                    oVar.f1188a = null;
                    Handler handler = oVar.f1195h;
                    if (handler != null) {
                        handler.post(new l(oVar, 2));
                    }
                }
                p232p6.p.f41245l.recordVideoError();
                break;
            default:
                Throwable e10 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(e10, "e");
                LiveIDResult.Error error = new LiveIDResult.Error(e10);
                v vVar2 = this.f1199b;
                vVar2.t = error;
                do {
                    g0Var = vVar2.f1235o;
                    value = g0Var.getValue();
                } while (!g0Var.compareAndSet(value, D6.i.a((D6.i) value, null, 0.0f, null, null, D6.g.f1637c, null, null, 79)));
                break;
        }
        return Unit.f38893a;
    }
}
