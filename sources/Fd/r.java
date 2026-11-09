package Fd;

import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactFavoriteFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayContactFavoriteFragment f2703b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment, Continuation continuation) {
        super(2, continuation);
        this.f2703b = transferToPalmPayContactFavoriteFragment;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        r rVar = new r(this.f2703b, continuation);
        rVar.f2702a = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        List list = (List) this.f2702a;
        TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment = this.f2703b;
        p173ld.z zVarT = transferToPalmPayContactFavoriteFragment.t();
        transferToPalmPayContactFavoriteFragment.getClass();
        List list2 = list;
        zVarT.setList(list2);
        list2.isEmpty();
        transferToPalmPayContactFavoriteFragment.getClass();
        return Unit.f38893a;
    }
}
