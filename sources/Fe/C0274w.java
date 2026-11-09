package Fe;

import com.transsnet.palmpay.main.export.bean.rsp.GetHomeCommonRsp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Fe.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0274w extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetHomeCommonRsp f2819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f2820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I f2821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0274w(GetHomeCommonRsp getHomeCommonRsp, kotlin.jvm.internal.B b7, I i7, Continuation continuation) {
        super(2, continuation);
        this.f2819b = getHomeCommonRsp;
        this.f2820c = b7;
        this.f2821d = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0274w(this.f2819b, this.f2820c, this.f2821d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0274w) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2818a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            GetHomeCommonRsp getHomeCommonRsp = this.f2819b;
            p059e1.a.U(getHomeCommonRsp.getData().cornerCount, "main_sp_home_menu_corner_count");
            if (getHomeCommonRsp.getData().enableAppDowngrade && this.f2820c.f38947a) {
                this.f2818a = 1;
                if (Wf.D.b(2000L, this) == aVar) {
                    return aVar;
                }
            } else {
                androidx.camera.core.impl.utils.executor.g.e(getHomeCommonRsp);
            }
            return Unit.f38893a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        boolean z3 = I.f2735f;
        this.f2821d.c(false, false);
        return Unit.f38893a;
    }
}
