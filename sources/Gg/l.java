package Gg;

import C0.C0126s;
import V0.C;
import android.net.ConnectivityManager;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C1921a;
import okhttp3.C1945m;
import okhttp3.D;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, int i7, Object obj2, Object obj3) {
        super(0);
        this.f3455a = i7;
        this.f3456b = obj;
        this.f3457c = obj2;
        this.f3458d = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listA;
        switch (this.f3455a) {
            case 0:
                Mg.e eVar = ((C1945m) this.f3456b).f40950b;
                Intrinsics.e(eVar);
                return eVar.a(((C1921a) this.f3458d).f40702i.f40582d, ((D) this.f3457c).a());
            case 1:
                if (((B) this.f3456b).f38947a) {
                    C c6 = C.c();
                    int i7 = androidx.work.impl.constraints.m.f18506a;
                    c6.getClass();
                    ((ConnectivityManager) this.f3457c).unregisterNetworkCallback((androidx.work.impl.constraints.e) this.f3458d);
                }
                return Unit.f38893a;
            case 2:
                Object obj = androidx.work.impl.constraints.j.f18497b;
                C0126s c0126s = (C0126s) this.f3456b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f3457c;
                androidx.work.impl.constraints.j jVar = (androidx.work.impl.constraints.j) this.f3458d;
                synchronized (obj) {
                    LinkedHashMap linkedHashMap = androidx.work.impl.constraints.j.f18498c;
                    linkedHashMap.remove(c0126s);
                    if (linkedHashMap.isEmpty()) {
                        C c10 = C.c();
                        int i10 = androidx.work.impl.constraints.m.f18506a;
                        c10.getClass();
                        connectivityManager.unregisterNetworkCallback(jVar);
                        androidx.work.impl.constraints.j.f18496a.getClass();
                        androidx.work.impl.constraints.j.f18499d = null;
                        androidx.work.impl.constraints.j.f18500e = false;
                    }
                    break;
                }
                return Unit.f38893a;
            default:
                Mg.e eVar2 = ((C1945m) this.f3456b).f40950b;
                List list = (List) this.f3457c;
                if (eVar2 != null && (listA = eVar2.a((String) this.f3458d, list)) != null) {
                    list = listA;
                }
                List<Certificate> list2 = list;
                ArrayList arrayList = new ArrayList(kotlin.collections.r.l(list2, 10));
                for (Certificate certificate : list2) {
                    Intrinsics.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
        }
    }
}
