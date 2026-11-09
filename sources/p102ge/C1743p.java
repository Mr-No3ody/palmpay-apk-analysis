package p102ge;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: ge.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1743p extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37226a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1743p(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1743p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f37226a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        this.f37226a = 1;
        Object objUpdateAutoTransferConfig = iApiMainService.updateAutoTransferConfig(1, "coin_rain", this);
        return objUpdateAutoTransferConfig == aVar ? aVar : objUpdateAutoTransferConfig;
    }
}
