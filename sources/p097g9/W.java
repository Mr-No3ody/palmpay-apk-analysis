package p097g9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.account.business.IApiAccountService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class W extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f36936b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(String str, Continuation continuation) {
        super(1, continuation);
        this.f36936b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new W(this.f36936b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((W) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36935a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiAccountService iApiAccountServiceT = G8.a.t();
        this.f36935a = 1;
        Object objCheckPinMvvm = iApiAccountServiceT.checkPinMvvm(this.f36936b, this);
        return objCheckPinMvvm == aVar ? aVar : objCheckPinMvvm;
    }
}
