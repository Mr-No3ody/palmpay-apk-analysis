package p051d9;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p324va.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35597a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new b0(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((b0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f35597a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        MemberApiService memberApiService = (MemberApiService) c.f43141a.f14622c;
        this.f35597a = 1;
        Object objQueryCurMemberInfoMvvm = memberApiService.queryCurMemberInfoMvvm(true, this);
        return objQueryCurMemberInfoMvvm == aVar ? aVar : objQueryCurMemberInfoMvvm;
    }
}
