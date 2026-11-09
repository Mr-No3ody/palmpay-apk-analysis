package Fd;

import Wf.I;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactFavoriteFragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayContactFavoriteFragment f2705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment, String str, Continuation continuation) {
        super(2, continuation);
        this.f2705b = transferToPalmPayContactFavoriteFragment;
        this.f2706c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f2705b, this.f2706c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2704a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            ArrayList arrayList = new ArrayList();
            String str = this.f2706c;
            TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment = this.f2705b;
            T t = new T(new q(transferToPalmPayContactFavoriteFragment, str, arrayList, null));
            p042cg.f fVar = I.f10809a;
            Flow flowN = X.n(t, p042cg.e.f19009c);
            r rVar = new r(transferToPalmPayContactFavoriteFragment, null);
            this.f2704a = 1;
            if (X.g(flowN, rVar, this) == aVar) {
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
