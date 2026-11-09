package Fd;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Fd.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0252g extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TransferToPalmPayContactAllFragment f2674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2675b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0252g(TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment, int i7, Continuation continuation) {
        super(2, continuation);
        this.f2674a = transferToPalmPayContactAllFragment;
        this.f2675b = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0252g(this.f2674a, this.f2675b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0252g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f2674a.f33796A.getValue();
        if (linearLayoutManager == null) {
            return null;
        }
        linearLayoutManager.scrollToPositionWithOffset(this.f2675b, 0);
        return Unit.f38893a;
    }
}
