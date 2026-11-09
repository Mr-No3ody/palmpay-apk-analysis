package Ed;

import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: renamed from: Ed.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0244y extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BankAccountPalmPayContactFragment f2415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2416c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0244y(BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment, String str, Continuation continuation) {
        super(2, continuation);
        this.f2415b = bankAccountPalmPayContactFragment;
        this.f2416c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0244y(this.f2415b, this.f2416c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0244y) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2414a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            ArrayList arrayList = new ArrayList();
            String str = this.f2416c;
            BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment = this.f2415b;
            kotlinx.coroutines.flow.T t = new kotlinx.coroutines.flow.T(new C0242w(bankAccountPalmPayContactFragment, str, arrayList, null));
            p042cg.f fVar = Wf.I.f10809a;
            C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(t, p042cg.e.f19009c), new C0238s(3, null, 1));
            C0243x c0243x = new C0243x(bankAccountPalmPayContactFragment, null);
            this.f2414a = 1;
            if (kotlinx.coroutines.flow.X.g(c1888u, c0243x, this) == aVar) {
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
