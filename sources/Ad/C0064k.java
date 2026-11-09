package Ad;

import com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ad.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0064k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AddFromContactsDialog f231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0064k(List list, String str, AddFromContactsDialog addFromContactsDialog, Continuation continuation) {
        super(2, continuation);
        this.f229b = list;
        this.f230c = str;
        this.f231d = addFromContactsDialog;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0064k(this.f229b, this.f230c, this.f231d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0064k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (Wf.AbstractC0780y.s(r1, r4, r7) == r0) goto L15;
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
            int r1 = r7.f228a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L4a
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            goto L34
        L1d:
            androidx.camera.core.impl.utils.executor.g.M(r8)
            cg.f r8 = Wf.I.f10809a
            Ad.j r1 = new Ad.j
            java.util.List r5 = r7.f229b
            java.lang.String r6 = r7.f230c
            r1.<init>(r5, r6, r2)
            r7.f228a = r4
            java.lang.Object r8 = Wf.AbstractC0780y.s(r8, r1, r7)
            if (r8 != r0) goto L34
            goto L49
        L34:
            java.util.List r8 = (java.util.List) r8
            cg.f r1 = Wf.I.f10809a
            Wf.p0 r1 = p015ag.o.f11960a
            Ad.i r4 = new Ad.i
            com.transsnet.palmpay.send_money.ui.dialog.AddFromContactsDialog r5 = r7.f231d
            r4.<init>(r5, r8, r2)
            r7.f228a = r3
            java.lang.Object r8 = Wf.AbstractC0780y.s(r1, r4, r7)
            if (r8 != r0) goto L4a
        L49:
            return r0
        L4a:
            kotlin.Unit r8 = kotlin.Unit.f38893a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Ad.C0064k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
