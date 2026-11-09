package Ua;

import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV5View;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f9446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OneTimeCodeV5View f9448c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Throwable th, Continuation continuation, boolean z3, OneTimeCodeV5View oneTimeCodeV5View) {
        super(2, continuation);
        this.f9446a = th;
        this.f9447b = z3;
        this.f9448c = oneTimeCodeV5View;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p0(this.f9446a, continuation, this.f9447b, this.f9448c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ToastUtils.showLong(org.chromium.support_lib_boundary.util.b.W(this.f9446a), new Object[0]);
        if (this.f9447b) {
            int i7 = OneTimeCodeV5View.f28495A;
            OneTimeCodeV5View oneTimeCodeV5View = this.f9448c;
            oneTimeCodeV5View.m(false);
            oneTimeCodeV5View.o();
            oneTimeCodeV5View.n();
        }
        return Unit.f38893a;
    }
}
