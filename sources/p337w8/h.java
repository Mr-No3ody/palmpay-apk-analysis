package p337w8;

import Ef.a;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.C0765i;
import Wf.EnumC0778w;
import Wf.I;
import Wf.V;
import androidx.camera.core.impl.utils.executor.g;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import okhttp3.Dns;
import p042cg.e;
import p042cg.f;
import p056dg.c;
import p056dg.d;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f43319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f43319c = lVar;
        this.f43320d = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f43319c, this.f43320d, continuation);
        hVar.f43318b = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        a aVar = a.f2423a;
        int i7 = this.f43317a;
        String str = this.f43320d;
        l lVar = this.f43319c;
        try {
            if (i7 == 0) {
                g.M(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f43318b;
                ArrayList arrayList2 = lVar.f43327b;
                if (arrayList2 != null) {
                    arrayList = new ArrayList(r.l(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AbstractC0780y.d(coroutineScope, null, new e((Dns) it.next(), lVar, str, null), 3));
                    }
                } else {
                    arrayList = null;
                }
                Objects.toString(arrayList);
                this.f43318b = arrayList;
                this.f43317a = 1;
                d dVar = new d(this);
                C0765i c0765i = dVar.f35941g;
                if (arrayList != null) {
                    try {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            dVar.invoke(((Deferred) it2.next()).getOnAwait(), new f(lVar, arrayList, null));
                        }
                    } catch (Throwable th) {
                        o oVar = q.f43977a;
                        c0765i.resumeWith(g.f(th));
                    }
                }
                dVar.onTimeout(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, new g(lVar, arrayList, null));
                if (c0765i.isCompleted()) {
                    obj = c0765i.m();
                } else {
                    AbstractC0780y.m(AbstractC0777v.a(dVar.f35956a), null, EnumC0778w.f10903d, new c(dVar, null), 1);
                    obj = c0765i.m();
                }
                if (obj == a.f2423a) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            List list = (List) obj;
            if (list != null) {
                List listB = CollectionsKt.B(list);
                Objects.toString(listB);
                int i10 = l.f43326m;
                lVar.d(str, listB, null, null);
                if (lVar.f43333h) {
                    V v3 = V.f10828a;
                    f fVar = I.f10809a;
                    AbstractC0780y.m(v3, e.f19009c, null, new j(listB, lVar, str, null), 2);
                }
            }
            int i11 = l.f43326m;
        } catch (Throwable th2) {
            try {
                th2.toString();
                int i12 = l.f43326m;
            } finally {
                int i13 = l.f43326m;
                ((AtomicBoolean) lVar.f43336k.getValue()).set(false);
            }
        }
        return Unit.f38893a;
    }
}
