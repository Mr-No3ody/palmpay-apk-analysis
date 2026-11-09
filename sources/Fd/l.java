package Fd;

import Ed.C0238s;
import Wf.I;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayContactAllFragment f2689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment, String str, Continuation continuation) {
        super(2, continuation);
        this.f2689b = transferToPalmPayContactAllFragment;
        this.f2690c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f2689b, this.f2690c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2688a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            ArrayList arrayList = new ArrayList();
            String str = this.f2690c;
            TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = this.f2689b;
            T t = new T(new j(transferToPalmPayContactAllFragment, str, arrayList, null));
            p042cg.f fVar = I.f10809a;
            C1888u c1888u = new C1888u(X.n(t, p042cg.e.f19009c), new C0238s(3, null, 3));
            k kVar = new k(transferToPalmPayContactAllFragment, null);
            this.f2688a = 1;
            if (X.g(c1888u, kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
