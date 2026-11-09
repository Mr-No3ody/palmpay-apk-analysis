package V0;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: V0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0702v extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ff.h f9977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.k f9978d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0702v(Function2 function2, androidx.concurrent.futures.k kVar, Continuation continuation) {
        super(2, continuation);
        this.f9977c = (Ff.h) function2;
        this.f9978d = kVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0702v c0702v = new C0702v(this.f9977c, this.f9978d, continuation);
        c0702v.f9976b = obj;
        return c0702v;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0702v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Ff.h, kotlin.jvm.functions.Function2] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f9975a;
        androidx.concurrent.futures.k kVar = this.f9978d;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f9976b;
                ?? r3 = this.f9977c;
                this.f9975a = 1;
                obj = r3.invoke(coroutineScope, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            kVar.b(obj);
        } catch (CancellationException unused) {
            kVar.c();
        } catch (Throwable th) {
            kVar.d(th);
        }
        return Unit.f38893a;
    }
}
