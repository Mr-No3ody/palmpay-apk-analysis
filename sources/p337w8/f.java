package p337w8;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f43312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f43313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f43314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f43313b = lVar;
        this.f43314c = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = new f(this.f43313b, this.f43314c, continuation);
        fVar.f43312a = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        List list = (List) this.f43312a;
        l.a(this.f43313b, this.f43314c);
        return list;
    }
}
