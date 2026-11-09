package Vb;

import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionResultHeaderModel f10323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(TransactionResultHeaderModel transactionResultHeaderModel, Continuation continuation) {
        super(2, continuation);
        this.f10323b = transactionResultHeaderModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.f10323b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((v) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        ?? r10;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f10322a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            TransactionResultHeaderModel transactionResultHeaderModel = this.f10323b;
            if (!transactionResultHeaderModel.f31655e && (r10 = transactionResultHeaderModel.f31656f) != 0) {
                this.f10322a = 1;
                if (r10.invoke(this) == aVar) {
                    return aVar;
                }
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
