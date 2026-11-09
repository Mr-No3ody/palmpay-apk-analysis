package N8;

import Wf.AbstractC0780y;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: N8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0466j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationActivity f6226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0466j(Continuation continuation, List list, IdentityVerificationActivity identityVerificationActivity) {
        super(2, continuation);
        this.f6225b = list;
        this.f6226c = identityVerificationActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0466j(continuation, this.f6225b, this.f6226c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0466j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f6224a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            p042cg.f fVar = Wf.I.f10809a;
            p042cg.e eVar = p042cg.e.f19009c;
            C0465i c0465i = new C0465i(null, this.f6225b, this.f6226c);
            this.f6224a = 1;
            if (AbstractC0780y.s(eVar, c0465i, this) == aVar) {
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
