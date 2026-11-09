package B6;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class L extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bitmap f396c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n10, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f395b = n10;
        this.f396c = bitmap;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new L(this.f395b, this.f396c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f394a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            this.f394a = 1;
            if (Wf.D.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        F f10 = new F(this.f396c);
        int i10 = N.f399k;
        N n10 = this.f395b;
        n10.a(f10);
        n10.f407h = false;
        return Unit.f38893a;
    }
}
