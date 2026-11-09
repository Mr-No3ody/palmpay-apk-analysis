package com.didi.drouter.router;

import Gb.Q;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h implements IRouterInterceptor.IInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f21154a;

    public h(i iVar) {
        this.f21154a = iVar;
    }

    @Override // com.didi.drouter.router.IRouterInterceptor.IInterceptor
    public final void onContinue() {
        Map map;
        i iVar = this.f21154a;
        iVar.f21155a.getClass();
        d dVar = iVar.f21155a;
        Bundle bundle = (Bundle) dVar.f5949a;
        Uri uri = dVar.f21138c;
        if (uri == null) {
            map = Collections.EMPTY_MAP;
        } else {
            M.f fVar = new M.f(0);
            for (String str : uri.getQueryParameterNames()) {
                fVar.put(str, uri.getQueryParameter(str));
            }
            map = fVar;
        }
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Parcelable parcelable = ((Bundle) iVar.f21155a.f5949a).getParcelable("router_start_activity_via_intent");
        if (parcelable instanceof Intent) {
            ((Bundle) iVar.f21155a.f5949a).remove("router_start_activity_via_intent");
            Intent intent = (Intent) parcelable;
            Object[] objArr = {iVar.f21155a.f21142g, intent};
            if (p092g2.c.c()) {
                p092g2.c.a("request %s, intent \"%s\"", objArr);
            }
            List<ResolveInfo> listQueryIntentActivities = iVar.f21155a.f21139d.getPackageManager().queryIntentActivities(intent, 65536);
            if (!listQueryIntentActivities.isEmpty()) {
                d dVar2 = iVar.f21155a;
                dVar2.f21141f = 1;
                Object[] objArr2 = {dVar2.f21142g, listQueryIntentActivities.get(0).activityInfo.name, Integer.valueOf(iVar.f21155a.f21141f)};
                if (p092g2.c.c()) {
                    p092g2.c.a("request \"%s\" find target class \"%s\", type \"%s\"", objArr2);
                }
                d dVar3 = iVar.f21155a;
                p075f2.b bVarB = p075f2.b.b(1);
                bVarB.f36370f = intent;
                linkedHashMap.put(dVar3, bVarB);
            }
        } else {
            ArrayList<p075f2.b> arrayList = new ArrayList();
            ArrayList<p075f2.b> arrayList2 = new ArrayList(p075f2.c.b(iVar.f21155a.f21138c));
            String string = ((Bundle) iVar.f21155a.f5949a).getString("router_start_activity_with_default_scheme_host");
            if (string != null && string.length() != 0 && iVar.f21155a.f21138c.toString().startsWith(string)) {
                M.b bVar = new M.b(p075f2.c.b(Uri.parse(iVar.f21155a.f21138c.getPath())));
                while (bVar.hasNext()) {
                    p075f2.b bVar2 = (p075f2.b) bVar.next();
                    if (bVar2.f36365a == 1) {
                        arrayList2.add(bVar2);
                    }
                }
            }
            Collections.sort(arrayList2, new Q(11));
            SparseArray sparseArray = new SparseArray();
            for (p075f2.b bVar3 : arrayList2) {
                int i7 = bVar3.f36365a;
                if (i7 == 1) {
                    if (sparseArray.get(0) != null) {
                        Object[] objArr3 = {bVar3.c()};
                        if (p092g2.c.c()) {
                            p092g2.c.a("warning: request match more than one activity and this \"%s\" will be ignored", objArr3);
                        }
                    } else {
                        sparseArray.put(0, bVar3);
                    }
                } else if (i7 == 2) {
                    if (sparseArray.get(1) != null) {
                        Object[] objArr4 = {bVar3.c()};
                        if (p092g2.c.c()) {
                            p092g2.c.a("warning: request match more than one fragment and this \"%s\" will be ignored", objArr4);
                        }
                    } else {
                        sparseArray.put(1, bVar3);
                    }
                } else if (i7 == 3) {
                    if (sparseArray.get(2) != null) {
                        Object[] objArr5 = {bVar3.c()};
                        if (p092g2.c.c()) {
                            p092g2.c.a("warning: request match more than one view and this \"%s\" will be ignored", objArr5);
                        }
                    } else {
                        sparseArray.put(2, bVar3);
                    }
                } else if (i7 == 4) {
                    arrayList.add(bVar3);
                }
            }
            if (sparseArray.get(0) != null) {
                arrayList.add(sparseArray.get(0));
            } else if (sparseArray.get(1) != null) {
                arrayList.add(sparseArray.get(1));
            } else if (sparseArray.get(2) != null) {
                arrayList.add(sparseArray.get(2));
            }
            int i10 = 0;
            for (p075f2.b bVar4 : arrayList) {
                d dVar4 = iVar.f21155a;
                Uri uri2 = dVar4.f21138c;
                Bundle bundle2 = (Bundle) dVar4.f5949a;
                bVar4.getClass();
                if (bVar4.e(uri2.getScheme(), 0, bundle2) && bVar4.e(uri2.getHost(), 1, bundle2) && bVar4.e(uri2.getPath(), 2, bundle2)) {
                    d dVar5 = iVar.f21155a;
                    boolean z3 = arrayList.size() > 1;
                    int i11 = i10 + 1;
                    int i12 = bVar4.f36365a;
                    dVar5.f21141f = z3 ? -1 : i12;
                    if (z3) {
                        d dVarL = d.l(dVar5.f21138c.toString());
                        dVarL.f5949a = (Bundle) dVar5.f5949a;
                        dVarL.f5950b = (Map) dVar5.f5950b;
                        dVarL.f21139d = dVar5.f21139d;
                        dVarL.f21140e = dVar5.f21140e;
                        dVarL.f21142g = dVar5.f21142g + "_" + i10;
                        dVarL.f21141f = i12;
                        dVar5 = dVarL;
                    }
                    Object[] objArr6 = {dVar5.f21142g, bVar4.c(), Integer.valueOf(i12), Integer.valueOf(bVar4.f36368d)};
                    if (p092g2.c.c()) {
                        p092g2.c.a("request \"%s\" find target class \"%s\", type \"%s\", priority \"%s\"", objArr6);
                    }
                    linkedHashMap.put(dVar5, bVar4);
                    i10 = i11;
                } else {
                    Object[] objArr7 = {bVar4.c(), iVar.f21155a.f21138c};
                    if (p092g2.c.c()) {
                        Log.e("DRouterCore", p092g2.c.a("inject placeholder key value to bundle error, class=%s, uri=%s", objArr7));
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            Object[] objArr8 = new Object[0];
            if (p092g2.c.c()) {
                p092g2.c.a("warning: there is no request target match", objArr8);
            }
            d dVar6 = iVar.f21155a;
            new e(dVar6, Collections.singleton(dVar6), null);
            f.c(iVar.f21155a, "not_found");
            return;
        }
        d dVar7 = iVar.f21155a;
        Set setKeySet = linkedHashMap.keySet();
        linkedHashMap.size();
        e eVar = new e(dVar7, setKeySet, null);
        if (linkedHashMap.size() > 1) {
            Object[] objArr9 = {Integer.valueOf(linkedHashMap.size())};
            if (p092g2.c.c()) {
                p092g2.c.a("warning: request match %s targets", objArr9);
            }
        }
        boolean[] zArr = {false};
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (zArr[0]) {
                f.c((d) entry2.getKey(), "stop_by_router_target");
            } else {
                d dVar8 = (d) entry2.getKey();
                p075f2.b bVar5 = (p075f2.b) entry2.getValue();
                g gVar = new g(this, entry2, zArr, eVar);
                Object[] objArr10 = {dVar8.f21142g};
                if (p092g2.c.c()) {
                    p092g2.c.a(">> Enter request \"%s\" (related) interceptors", objArr10);
                }
                M.f fVar2 = c.f21134a;
                M.g gVar2 = new M.g(0);
                bVar5.getClass();
                PriorityQueue priorityQueue = new PriorityQueue(5, new Q(10));
                M.b bVar6 = new M.b(gVar2);
                while (bVar6.hasNext()) {
                    priorityQueue.add(c.a((Class) bVar6.next()));
                }
                b.a(priorityQueue, dVar8, gVar);
            }
        }
    }

    @Override // com.didi.drouter.router.IRouterInterceptor.IInterceptor
    public final void onInterrupt() {
        onInterrupt(500);
    }

    @Override // com.didi.drouter.router.IRouterInterceptor.IInterceptor
    public final void onInterrupt(int i7) {
        i iVar = this.f21154a;
        d dVar = iVar.f21155a;
        new e(dVar, Collections.singleton(dVar), null);
        f.c(iVar.f21155a, "stop_by_interceptor");
    }
}
