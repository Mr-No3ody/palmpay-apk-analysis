package C6;

import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ File f1212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f1213g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f1214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f1215j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i7, ArrayList arrayList, File file, String str, v vVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.f1210d = i7;
        this.f1211e = arrayList;
        this.f1212f = file;
        this.f1213g = str;
        this.f1214i = vVar;
        this.f1215j = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        String str = this.f1215j;
        t tVar = new t(this.f1210d, this.f1211e, this.f1212f, this.f1213g, this.f1214i, str, continuation);
        tVar.f1209c = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0193  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01b7, code lost:
    
        if (r3 == r2) goto L53;
     */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C6.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
