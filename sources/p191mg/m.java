package p191mg;

import C4.a;
import Ff.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import p176lg.j;
import p185ma.t;
import p355xf.AbstractC2123b;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends g implements Function3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ AbstractC2123b f39734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f39735d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a aVar, Continuation continuation) {
        super(3, continuation);
        this.f39735d = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m mVar = new m(this.f39735d, (Continuation) obj3);
        mVar.f39734c = (AbstractC2123b) obj;
        return mVar.invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f39733b;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            AbstractC2123b abstractC2123b = this.f39734c;
            a aVar2 = this.f39735d;
            t tVar = (t) aVar2.f1156c;
            byte bQ = tVar.q();
            if (bQ == 1) {
                return aVar2.h(true);
            }
            if (bQ == 0) {
                return aVar2.h(false);
            }
            if (bQ != 6) {
                if (bQ == 8) {
                    return aVar2.g();
                }
                t.n(tVar, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f39733b = 1;
            obj = a.a(aVar2, abstractC2123b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return (j) obj;
    }
}
