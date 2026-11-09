package Ma;

import com.transsnet.palmpay.core.ui.mvvm.CoreWithdrawalViewModel;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends Ff.h implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5900a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5902c;

    public /* synthetic */ l(int i7, Continuation continuation) {
        super(i7, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f5900a) {
            case 0:
                l lVar = new l((CoreWithdrawalViewModel) this.f5902c, (Continuation) obj3);
                lVar.f5901b = (Throwable) obj2;
                return lVar.invokeSuspend(Unit.f38893a);
            case 1:
                l lVar2 = new l((Continuation) obj3, (ModelAvailableCouponItem) this.f5902c);
                lVar2.f5901b = (Throwable) obj2;
                return lVar2.invokeSuspend(Unit.f38893a);
            default:
                l lVar3 = new l(3, (Continuation) obj3);
                lVar3.f5901b = (p164l0.e) obj;
                lVar3.f5902c = (p193n0.g) obj2;
                return lVar3.invokeSuspend(Unit.f38893a);
        }
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f5900a) {
            case 0:
                Ef.a aVar = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                org.chromium.support_lib_boundary.util.b.E(((CoreWithdrawalViewModel) this.f5902c).f28068e, (Throwable) this.f5901b);
                return Unit.f38893a;
            case 1:
                Ef.a aVar2 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                org.chromium.support_lib_boundary.util.b.W((Throwable) this.f5901b);
                ((ModelAvailableCouponItem) this.f5902c).getMCouponAvailable().c(false);
                return Unit.f38893a;
            default:
                Ef.a aVar3 = Ef.a.f2423a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
                p164l0.e eVar = (p164l0.e) this.f5901b;
                p193n0.g gVar = (p193n0.g) this.f5902c;
                Set setKeySet = gVar.a().keySet();
                ArrayList arrayList = new ArrayList(kotlin.collections.r.l(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p193n0.e) it.next()).f39813a);
                }
                Map<String, ?> all = eVar.f39261a.getAll();
                Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(F.a(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Set) {
                                value = CollectionsKt.b0((Iterable) value);
                            }
                            linkedHashMap2.put(key, value);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            if (!arrayList.contains((String) entry2.getKey())) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        p193n0.b bVar = new p193n0.b(G.l(gVar.a()), false);
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            String name = (String) entry3.getKey();
                            Object value2 = entry3.getValue();
                            if (value2 instanceof Boolean) {
                                Intrinsics.checkNotNullParameter(name, "name");
                                p193n0.e key2 = new p193n0.e(name);
                                Intrinsics.checkNotNullParameter(key2, "key");
                                bVar.e(key2, value2);
                            } else if (value2 instanceof Float) {
                                Intrinsics.checkNotNullParameter(name, "name");
                                p193n0.e key3 = new p193n0.e(name);
                                Intrinsics.checkNotNullParameter(key3, "key");
                                bVar.e(key3, value2);
                            } else if (value2 instanceof Integer) {
                                Intrinsics.checkNotNullParameter(name, "name");
                                p193n0.e key4 = new p193n0.e(name);
                                Intrinsics.checkNotNullParameter(key4, "key");
                                bVar.e(key4, value2);
                            } else if (value2 instanceof Long) {
                                Intrinsics.checkNotNullParameter(name, "name");
                                p193n0.e key5 = new p193n0.e(name);
                                Intrinsics.checkNotNullParameter(key5, "key");
                                bVar.e(key5, value2);
                            } else if (value2 instanceof String) {
                                Intrinsics.checkNotNullParameter(name, "name");
                                p193n0.e key6 = new p193n0.e(name);
                                Intrinsics.checkNotNullParameter(key6, "key");
                                bVar.e(key6, value2);
                            } else if (value2 instanceof Set) {
                                p193n0.e key7 = p377z5.l.K(name);
                                Intrinsics.f(value2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                                Intrinsics.checkNotNullParameter(key7, "key");
                                bVar.e(key7, (Set) value2);
                            }
                        }
                        return new p193n0.b(G.l(bVar.a()), true);
                    }
                    Map.Entry<String, ?> next = it2.next();
                    String key8 = next.getKey();
                    LinkedHashSet linkedHashSet = eVar.f39262b;
                    if (linkedHashSet != null ? linkedHashSet.contains(key8) : true) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CoreWithdrawalViewModel coreWithdrawalViewModel, Continuation continuation) {
        super(3, continuation);
        this.f5902c = coreWithdrawalViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Continuation continuation, ModelAvailableCouponItem modelAvailableCouponItem) {
        super(3, continuation);
        this.f5902c = modelAvailableCouponItem;
    }
}
