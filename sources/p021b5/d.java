package p021b5;

import Z4.f;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.View;
import com.growingio.android.sdk.track.listener.IActivityLifecycle;
import e5.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p059e1.a;
import p094g5.g;
import p094g5.i;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements IActivityLifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f18781a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f18782b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f18783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f18784d;

    static {
        new HashMap();
        f18783c = new WeakHashMap();
        f18784d = new WeakHashMap();
    }

    public static b a(View view) {
        b bVarK = a.K(view);
        if (bVarK != null && (!bVarK.f18774c || (bVarK instanceof a))) {
            return bVarK;
        }
        if (view.getParent() instanceof View) {
            return a((View) view.getParent());
        }
        Context context = view.getContext();
        Activity activityX = null;
        if (context instanceof ContextWrapper) {
            do {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper instanceof Activity) {
                    activityX = (Activity) contextWrapper;
                    break;
                }
                context = contextWrapper.getBaseContext();
            } while (context instanceof ContextWrapper);
        }
        if (activityX == null) {
            activityX = p279s5.a.f42018a.x();
        }
        if (activityX == null) {
            throw new NullPointerException("Page is NULL");
        }
        WeakHashMap weakHashMap = f18781a;
        if (weakHashMap.containsKey(activityX)) {
            return (b) weakHashMap.get(activityX);
        }
        a aVar = new a(activityX);
        aVar.f18776e = activityX.getTitle().toString();
        return aVar;
    }

    public static void b(b bVar, Map map) {
        bVar.f18778g = map;
        if (!bVar.f18774c) {
            h.a("PageProvider", "setPageAttributes: page = " + bVar.a() + ", attributes = " + map.toString(), new Object[0]);
            e5.d dVar = c.f36164a;
            g gVar = new g();
            gVar.f36854A = bVar.a();
            gVar.f36855B = bVar.f18773b;
            gVar.f37297z = bVar.f18778g;
            dVar.y(gVar);
        }
        ArrayList<b> arrayList = bVar.f18779h;
        if (arrayList.isEmpty()) {
            return;
        }
        for (b bVar2 : arrayList) {
            if (bVar2.f18773b >= bVar.f18773b) {
                b(bVar2, map);
            }
        }
    }

    @Override // com.growingio.android.sdk.track.listener.IActivityLifecycle
    public final void onActivityLifecycle(p182m5.a aVar) {
        Activity activityA = aVar.a();
        if (activityA == null) {
            return;
        }
        WeakHashMap weakHashMap = f18784d;
        WeakHashMap weakHashMap2 = f18781a;
        int i7 = aVar.f39477a;
        if (i7 != 3) {
            if (i7 == 8) {
                h.a("PageProvider", "removePage: activity is " + activityA, new Object[0]);
                weakHashMap2.remove(activityA);
                weakHashMap.remove(activityA);
                return;
            }
            return;
        }
        a aVar2 = (a) weakHashMap2.get(activityA);
        if (aVar2 == null) {
            aVar2 = new a(activityA);
            if (!TextUtils.isEmpty(activityA.getTitle())) {
                aVar2.f18776e = activityA.getTitle().toString();
            }
            Activity activity = aVar2.f18772a;
            String str = activity != null ? (String) f18782b.get(activity) : null;
            if (!TextUtils.isEmpty(str)) {
                aVar2.f18775d = str;
            }
            activityA.getWindow().getDecorView().setTag(Z4.g.growing_tracker_view_page, aVar2);
            weakHashMap2.put(activityA, aVar2);
        } else {
            aVar2.f18773b = System.currentTimeMillis();
        }
        Activity activity2 = aVar2.f18772a;
        if (activity2 != null) {
            f fVar = (f) f18783c.get(activity2);
            aVar2.f18774c = fVar != null && (fVar == f.f11517a || fVar == f.f11519c);
        }
        if (aVar2.f18774c) {
            h.c("PageProvider", "sendPage: path = " + aVar2.a() + " is ignored", new Object[0]);
            return;
        }
        h.a("PageProvider", "sendPage: path = " + aVar2.a(), new Object[0]);
        String str2 = activityA.getResources().getConfiguration().orientation == 1 ? "PORTRAIT" : "LANDSCAPE";
        e5.d dVar = c.f36164a;
        i iVar = new i();
        iVar.f36861z = aVar2.a();
        iVar.f36859B = aVar2.f18776e;
        iVar.f37306h = aVar2.f18773b;
        iVar.f36858A = str2;
        dVar.y(iVar);
        Map map = activity2 != null ? (Map) weakHashMap.remove(activity2) : null;
        if (map != null) {
            b(aVar2, map);
            return;
        }
        Map map2 = aVar2.f18778g;
        if (map2 != null) {
            b(aVar2, map2);
        }
    }
}
