package C9;

import Wf.AbstractC0780y;
import com.transsnet.palmpay.cash_in.ui.activity.BindBankCardResultActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: C9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0137d extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f1297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BindBankCardResultActivity f1298b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0137d(BindBankCardResultActivity bindBankCardResultActivity, Continuation continuation) {
        super(2, continuation);
        this.f1298b = bindBankCardResultActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0137d c0137d = new C0137d(this.f1298b, continuation);
        c0137d.f1297a = obj;
        return c0137d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0137d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AbstractC0780y.m((CoroutineScope) this.f1297a, null, null, new C0136c(this.f1298b, null), 3);
        return Unit.f38893a;
    }
}
