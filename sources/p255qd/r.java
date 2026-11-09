package p255qd;

import Ff.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f41515c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, s sVar, Continuation continuation) {
        super(2, continuation);
        this.f41514b = str;
        this.f41515c = sVar;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f41514b, this.f41515c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 == r0) goto L22;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r7.f41513a
            qd.s r2 = r7.f41515c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L60
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            androidx.camera.core.impl.utils.executor.g.M(r8)     // Catch: java.lang.Exception -> L4e
            goto L4b
        L1f:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            kotlin.jvm.internal.F r8 = new kotlin.jvm.internal.F     // Catch: java.lang.Exception -> L4e
            r8.<init>()     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = r7.f41514b     // Catch: java.lang.Exception -> L4e
            java.lang.String r1 = p040cd.a.a(r1)     // Catch: java.lang.Exception -> L4e
            r8.f38951a = r1     // Catch: java.lang.Exception -> L4e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L4e
            if (r1 == 0) goto L39
            java.lang.String r1 = ""
            r8.f38951a = r1     // Catch: java.lang.Exception -> L4e
        L39:
            cg.f r1 = Wf.I.f10809a     // Catch: java.lang.Exception -> L4e
            Wf.p0 r1 = p015ag.o.f11960a     // Catch: java.lang.Exception -> L4e
            qd.p r6 = new qd.p     // Catch: java.lang.Exception -> L4e
            r6.<init>(r2, r8, r3)     // Catch: java.lang.Exception -> L4e
            r7.f41513a = r5     // Catch: java.lang.Exception -> L4e
            java.lang.Object r8 = Wf.AbstractC0780y.s(r1, r6, r7)     // Catch: java.lang.Exception -> L4e
            if (r8 != r0) goto L4b
            goto L5f
        L4b:
            kotlin.Unit r8 = (kotlin.Unit) r8     // Catch: java.lang.Exception -> L4e
            goto L62
        L4e:
            cg.f r8 = Wf.I.f10809a
            Wf.p0 r8 = p015ag.o.f11960a
            qd.q r1 = new qd.q
            r1.<init>(r2, r3)
            r7.f41513a = r4
            java.lang.Object r8 = Wf.AbstractC0780y.s(r8, r1, r7)
            if (r8 != r0) goto L60
        L5f:
            return r0
        L60:
            kotlin.Unit r8 = (kotlin.Unit) r8
        L62:
            kotlin.Unit r8 = kotlin.Unit.f38893a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p255qd.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
