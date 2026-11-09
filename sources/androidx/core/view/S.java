package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class S extends Ff.g implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f16179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ View f16180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(View view, Continuation continuation) {
        super(2, continuation);
        this.f16180d = view;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        S s3 = new S(this.f16180d, continuation);
        s3.f16179c = obj;
        return s3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((S) create((Sf.j) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f16178b;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            Sf.j jVar = (Sf.j) this.f16179c;
            View view = this.f16180d;
            this.f16179c = jVar;
            this.f16178b = 1;
            jVar.a(view, this);
            return aVar;
        }
        if (i7 == 1) {
            Sf.j jVar2 = (Sf.j) this.f16179c;
            androidx.camera.core.impl.utils.executor.g.M(obj);
            View view2 = this.f16180d;
            if (view2 instanceof ViewGroup) {
                this.f16179c = null;
                this.f16178b = 2;
                jVar2.getClass();
                Object objB = jVar2.b(new Sf.r(new Q((ViewGroup) view2)), this);
                if (objB != aVar) {
                    objB = Unit.f38893a;
                }
                if (objB == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
