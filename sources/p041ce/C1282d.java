package p041ce;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: ce.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1282d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f18928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f18929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f18930c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1282d(CommonResult commonResult, Continuation continuation, g gVar, h hVar) {
        super(2, continuation);
        this.f18928a = commonResult;
        this.f18929b = gVar;
        this.f18930c = hVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1282d(this.f18928a, continuation, this.f18929b, this.f18930c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1282d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        CommonListResultV2 commonListResultV2 = (CommonListResultV2) this.f18928a;
        if (commonListResultV2.isSuccess()) {
            this.f18929b.invoke(commonListResultV2.data);
        } else {
            String respMsg = commonListResultV2.getRespMsg();
            if (respMsg == null) {
                respMsg = "";
            }
            this.f18930c.invoke(respMsg);
        }
        return Unit.f38893a;
    }
}
