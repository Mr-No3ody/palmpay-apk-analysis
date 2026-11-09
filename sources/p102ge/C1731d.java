package p102ge;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.rsp.GetMenuBySceneRsp;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: ge.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1731d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GetMenuBySceneRsp f37209a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1731d(GetMenuBySceneRsp getMenuBySceneRsp, Continuation continuation) {
        super(2, continuation);
        this.f37209a = getMenuBySceneRsp;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1731d(this.f37209a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1731d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        ToastUtils.showLong(this.f37209a.getRespMsg(), new Object[0]);
        return Unit.f38893a;
    }
}
