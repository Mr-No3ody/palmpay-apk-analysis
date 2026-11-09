package p055de;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p070ee.c;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f35907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f35908b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f35907a = str;
        this.f35908b = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f35907a, this.f35908b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        String str = c.f36289a;
        return c.g(this.f35907a, this.f35908b);
    }
}
