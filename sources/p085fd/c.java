package p085fd;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36450b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Continuation continuation) {
        super(1, continuation);
        this.f36450b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new c(this.f36450b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((c) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36449a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f36449a = 1;
        Object r2CDetailMvvm = iAirtimeService.getR2CDetailMvvm(this.f36450b, this);
        return r2CDetailMvvm == aVar ? aVar : r2CDetailMvvm;
    }
}
