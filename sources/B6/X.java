package B6;

import Yf.EnumC0789a;
import androidx.camera.core.ImageProxy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1871c;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: loaded from: classes3.dex */
public final class X extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageProxy f434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(b0 b0Var, ImageProxy imageProxy, Continuation continuation) {
        super(2, continuation);
        this.f433b = b0Var;
        this.f434c = imageProxy;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new X(this.f433b, this.f434c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((X) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f432a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            b0 b0Var = this.f433b;
            C0081c c0081c = b0Var.f457g;
            c0081c.getClass();
            ImageProxy imageProxy = this.f434c;
            Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
            C1888u c1888u = new C1888u(new C1871c(new C0080b(imageProxy, c0081c, null), kotlin.coroutines.f.f38943a, -2, EnumC0789a.f11390a), new V(b0Var, (Continuation) null));
            W w3 = new W(0, b0Var, imageProxy);
            this.f432a = 1;
            if (c1888u.collect(w3, this) == aVar) {
                return aVar;
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
