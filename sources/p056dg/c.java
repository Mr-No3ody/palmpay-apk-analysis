package p056dg;

import Ef.a;
import Ff.h;
import Wf.AbstractC0774s;
import Wf.C0765i;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f35940b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f35940b = dVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f35940b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f35939a;
        d dVar = this.f35940b;
        C0765i c0765i = dVar.f35941g;
        try {
            if (i7 == 0) {
                g.M(obj);
                this.f35939a = 1;
                obj = g.f35955f.get(dVar) instanceof e ? dVar.a(this) : dVar.b(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            AbstractC0774s abstractC0774s = (AbstractC0774s) c0765i.f10867e.get(AbstractC0774s.f10896b);
            if (abstractC0774s != null) {
                c0765i.resumeUndispatched(abstractC0774s, obj);
            } else {
                o oVar = q.f43977a;
                c0765i.resumeWith(obj);
            }
            return Unit.f38893a;
        } catch (Throwable th) {
            AbstractC0774s abstractC0774s2 = (AbstractC0774s) c0765i.f10867e.get(AbstractC0774s.f10896b);
            if (abstractC0774s2 != null) {
                c0765i.resumeUndispatchedWithException(abstractC0774s2, th);
            } else {
                o oVar2 = q.f43977a;
                c0765i.resumeWith(g.f(th));
            }
            return Unit.f38893a;
        }
    }
}
