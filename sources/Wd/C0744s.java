package Wd;

import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.EnumC1204n;
import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Wd.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0744s extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillerTransactionResultActivity f10782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f10783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0744s(BillerTransactionResultActivity billerTransactionResultActivity, Continuation continuation, boolean z3) {
        super(2, continuation);
        this.f10782b = billerTransactionResultActivity;
        this.f10783c = z3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0744s(this.f10782b, continuation, this.f10783c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0744s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f10781a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            BillerTransactionResultActivity billerTransactionResultActivity = this.f10782b;
            AbstractC1205o lifecycle = billerTransactionResultActivity.getLifecycle();
            EnumC1204n enumC1204n = EnumC1204n.f17464e;
            r rVar = new r(billerTransactionResultActivity, null, this.f10783c);
            this.f10781a = 1;
            if (androidx.lifecycle.V.i(lifecycle, enumC1204n, rVar, this) == aVar) {
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
