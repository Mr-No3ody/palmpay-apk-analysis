package p130ic;

import Ff.h;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F f37570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f37571e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str, F f10, Continuation continuation, ArrayList arrayList) {
        super(2, continuation);
        this.f37569c = str;
        this.f37570d = f10;
        this.f37571e = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        ArrayList arrayList = this.f37571e;
        z zVar = new z(this.f37569c, this.f37570d, continuation, arrayList);
        zVar.f37568b = obj;
        return zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L31;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p130ic.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
