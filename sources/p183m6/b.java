package p183m6;

import Ef.a;
import Ff.h;
import Wf.D;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f39480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f39481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, f fVar, Continuation continuation) {
        super(2, continuation);
        this.f39480b = eVar;
        this.f39481c = fVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f39480b, this.f39481c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f39479a;
        e eVar = this.f39480b;
        if (i7 == 0) {
            g.M(obj);
            long j6 = eVar.f39495c;
            this.f39479a = 1;
            if (D.b(j6, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        eVar.a(false, this.f39481c);
        return Unit.f38893a;
    }
}
