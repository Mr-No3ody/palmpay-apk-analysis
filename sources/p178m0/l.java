package p178m0;

import Ef.a;
import Ff.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import p193n0.e;
import p193n0.g;

/* JADX INFO: loaded from: classes.dex */
public final class l extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f39429b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Set set, Continuation continuation) {
        super(2, continuation);
        this.f39429b = set;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.f39429b, continuation);
        lVar.f39428a = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((g) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        Set setKeySet = ((g) this.f39428a).a().keySet();
        ArrayList arrayList = new ArrayList(r.l(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((e) it.next()).f39813a);
        }
        LinkedHashSet linkedHashSet = m.f39430a;
        boolean z3 = true;
        Set set = this.f39429b;
        if (set != linkedHashSet) {
            if (set == null || !set.isEmpty()) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                    }
                }
                z3 = false;
            } else {
                z3 = false;
            }
        }
        return Boolean.valueOf(z3);
    }
}
