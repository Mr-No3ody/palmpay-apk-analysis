package p248q6;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.liveness.model.CheckResponse;
import com.palmpay.lib.liveness.model.LiveIDException;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.palmpay.lib.liveness.result.LiveSelfieResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p232p6.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LiveIDResult f41460a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LiveIDResult liveIDResult, Continuation continuation) {
        super(2, continuation);
        this.f41460a = liveIDResult;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f41460a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        g.M(obj);
        LiveIDResult liveIDResult = this.f41460a;
        if (liveIDResult instanceof LiveIDResult.Success) {
            CheckResponse checkResponse = ((LiveSelfieResult) ((LiveIDResult.Success) liveIDResult).f23817a).f23818a;
            p pVar = p.f41234a;
        } else if (liveIDResult instanceof LiveIDResult.Error) {
            if (((LiveIDResult.Error) liveIDResult).f23816a instanceof LiveIDException) {
                p pVar2 = p.f41234a;
            } else {
                p pVar3 = p.f41234a;
            }
        }
        return Unit.f38893a;
    }
}
