package Fd;

import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayContactAllFragment f2687b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment, Continuation continuation) {
        super(2, continuation);
        this.f2687b = transferToPalmPayContactAllFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        k kVar = new k(this.f2687b, continuation);
        kVar.f2686a = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        this.f2687b.t().setList(androidx.camera.core.impl.utils.n.q((List) this.f2686a, new Ab.B(15)));
        return Unit.f38893a;
    }
}
