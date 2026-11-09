package Ed;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ed.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0239t extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BankAccountPalmPayContactFragment f2400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2401b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0239t(BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment, int i7, Continuation continuation) {
        super(2, continuation);
        this.f2400a = bankAccountPalmPayContactFragment;
        this.f2401b = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0239t(this.f2400a, this.f2401b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0239t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f2400a.f33749B.getValue();
        if (linearLayoutManager == null) {
            return null;
        }
        linearLayoutManager.scrollToPositionWithOffset(this.f2401b, 0);
        return Unit.f38893a;
    }
}
