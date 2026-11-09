package p384zd;

import Ed.C0238s;
import Ef.a;
import Ff.h;
import Wf.I;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.SelectBankForTransferViaUssdDialog;
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
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectBankForTransferViaUssdDialog f44672b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SelectBankForTransferViaUssdDialog selectBankForTransferViaUssdDialog, Continuation continuation) {
        super(2, continuation);
        this.f44672b = selectBankForTransferViaUssdDialog;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f44672b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44671a;
        if (i7 == 0) {
            g.M(obj);
            T t = new T(new a(2, null));
            f fVar = I.f10809a;
            C1888u c1888u = new C1888u(X.n(t, e.f19009c), new C0238s(3, null, 10));
            B6.T t3 = new B6.T(this.f44672b, 6);
            this.f44671a = 1;
            if (c1888u.collect(t3, this) == aVar) {
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
