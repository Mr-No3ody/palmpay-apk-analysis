package Vb;

import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ long f10324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionResultHeaderModel f10325b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(TransactionResultHeaderModel transactionResultHeaderModel, Continuation continuation) {
        super(2, continuation);
        this.f10325b = transactionResultHeaderModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        w wVar = new w(this.f10325b, continuation);
        wVar.f10324a = ((Number) obj).longValue();
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        long j6 = this.f10324a;
        Function1 function1 = this.f10325b.f31657g;
        if (function1 != null) {
            function1.invoke(new Long(j6));
        }
        return Unit.f38893a;
    }
}
