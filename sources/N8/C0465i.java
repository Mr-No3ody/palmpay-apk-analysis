package N8;

import Pa.r0;
import com.transsnet.palmpay.account.bean.SignUpRetainDialogConfig;
import com.transsnet.palmpay.account.ui.activity.IdentityVerificationActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: N8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0465i extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f6220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationActivity f6221b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0465i(Continuation continuation, List list, IdentityVerificationActivity identityVerificationActivity) {
        super(2, continuation);
        this.f6220a = list;
        this.f6221b = identityVerificationActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0465i(continuation, this.f6220a, this.f6221b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0465i) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        Iterator it = this.f6220a.iterator();
        while (it.hasNext()) {
            r0.D1(this.f6221b, ((SignUpRetainDialogConfig) it.next()).imageUrl);
        }
        return Unit.f38893a;
    }
}
