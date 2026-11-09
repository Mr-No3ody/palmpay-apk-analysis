package F0;

import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f2501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InputEvent f2502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, Uri uri, InputEvent inputEvent, Continuation continuation) {
        super(2, continuation);
        this.f2500b = hVar;
        this.f2501c = uri;
        this.f2502d = inputEvent;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f2500b, this.f2501c, this.f2502d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2499a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            G0.d dVar = this.f2500b.f2512b;
            this.f2499a = 1;
            if (dVar.d(this.f2501c, this.f2502d, this) == aVar) {
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
