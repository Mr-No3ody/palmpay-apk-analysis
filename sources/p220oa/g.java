package p220oa;

import Ef.a;
import Ff.h;
import Pa.I;
import Wf.AbstractC0774s;
import Wf.AbstractC0780y;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f40261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBaseView f40262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f40263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f40264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f40265f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f40266g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(boolean z3, IBaseView iBaseView, Function1 function1, boolean z8, Function1 function2, Function1 function3, Continuation continuation) {
        super(2, continuation);
        this.f40261b = z3;
        this.f40262c = iBaseView;
        this.f40263d = function1;
        this.f40264e = z8;
        this.f40265f = function2;
        this.f40266g = (h) function3;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        ?? r10 = this.f40266g;
        return new g(this.f40261b, this.f40262c, this.f40263d, this.f40264e, this.f40265f, r10, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [Ff.h, kotlin.jvm.functions.Function1] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f40260a;
        boolean z3 = this.f40264e;
        IBaseView iBaseView = this.f40262c;
        boolean z8 = this.f40261b;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                if (z8) {
                    iBaseView.showLoadingDialog(true);
                }
                AbstractC0774s abstractC0774s = I.f7021a;
                f fVar = new f(this.f40266g, null);
                this.f40260a = 1;
                obj = AbstractC0780y.s(abstractC0774s, fVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            if (z8) {
                iBaseView.showLoadingDialog(false);
            }
            boolean z10 = obj instanceof CommonResult;
            Function1 function1 = this.f40263d;
            if (z10 && !((CommonResult) obj).isSuccess() && z3) {
                ToastUtils.showLong(((CommonResult) obj).getRespMsg(), new Object[0]);
            } else {
                function1.invoke(obj);
            }
        } catch (Throwable th) {
            String strW = b.W(th);
            if (z8) {
                iBaseView.showLoadingDialog(false);
            }
            if (z3) {
                ToastUtils.showLong(strW, new Object[0]);
            }
            this.f40265f.invoke(strW);
        }
        return Unit.f38893a;
    }
}
