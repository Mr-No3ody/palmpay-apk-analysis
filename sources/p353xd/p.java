package p353xd;

import Ed.C0238s;
import Ef.a;
import Ff.h;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectBankForToBankActivity f43893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SelectBankForToBankActivity selectBankForToBankActivity, String str, Continuation continuation) {
        super(2, continuation);
        this.f43893b = selectBankForToBankActivity;
        this.f43894c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f43893b, this.f43894c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f43892a;
        if (i7 == 0) {
            g.M(obj);
            ArrayList arrayList = new ArrayList();
            String str = this.f43894c;
            SelectBankForToBankActivity selectBankForToBankActivity = this.f43893b;
            T t = new T(new n(selectBankForToBankActivity, str, arrayList, null));
            f fVar = I.f10809a;
            C1888u c1888u = new C1888u(X.n(t, e.f19009c), new C0238s(3, null, 9));
            o oVar = new o(selectBankForToBankActivity, null);
            this.f43892a = 1;
            if (X.g(c1888u, oVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }
}
