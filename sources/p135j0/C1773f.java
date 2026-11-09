package p135j0;

import Ff.h;
import androidx.datastore.core.DataMigration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: j0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1773f extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f38035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataMigration f38036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f38037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f38039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f38040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f38041g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1773f(List list, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f38040f = list;
        this.f38041g = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1773f c1773f = new C1773f(this.f38040f, this.f38041g, continuation);
        c1773f.f38039e = obj;
        return c1773f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1773f) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x0082  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // Ff.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            Ef.a r0 = Ef.a.f2423a
            int r1 = r9.f38038d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r9.f38035a
            java.lang.Object r4 = r9.f38039e
            java.util.List r4 = (java.util.List) r4
            androidx.camera.core.impl.utils.executor.g.M(r10)
            goto L3e
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            java.lang.Object r1 = r9.f38037c
            androidx.datastore.core.DataMigration r4 = r9.f38036b
            java.util.Iterator r5 = r9.f38035a
            java.lang.Object r6 = r9.f38039e
            java.util.List r6 = (java.util.List) r6
            androidx.camera.core.impl.utils.executor.g.M(r10)
            r8 = r6
            r6 = r4
            r4 = r8
            goto L60
        L2f:
            androidx.camera.core.impl.utils.executor.g.M(r10)
            java.lang.Object r10 = r9.f38039e
            java.util.List r1 = r9.f38040f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r4 = r9.f38041g
        L3e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L86
            java.lang.Object r5 = r1.next()
            androidx.datastore.core.DataMigration r5 = (androidx.datastore.core.DataMigration) r5
            r9.f38039e = r4
            r9.f38035a = r1
            r9.f38036b = r5
            r9.f38037c = r10
            r9.f38038d = r3
            java.lang.Object r6 = r5.shouldMigrate(r10, r9)
            if (r6 != r0) goto L5b
            goto L81
        L5b:
            r8 = r1
            r1 = r10
            r10 = r6
            r6 = r5
            r5 = r8
        L60:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L84
            j0.e r10 = new j0.e
            r7 = 0
            r10.<init>(r6, r7)
            r4.add(r10)
            r9.f38039e = r4
            r9.f38035a = r5
            r9.f38036b = r7
            r9.f38037c = r7
            r9.f38038d = r2
            java.lang.Object r10 = r6.migrate(r1, r9)
            if (r10 != r0) goto L82
        L81:
            return r0
        L82:
            r1 = r5
            goto L3e
        L84:
            r10 = r1
            goto L82
        L86:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j0.C1773f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
