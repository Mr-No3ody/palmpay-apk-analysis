package com.didi.drouter.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.didi.drouter.store.IRouterProxy;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g implements IRouterInterceptor.IInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f21151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f21152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f21153c;

    public g(h hVar, Map.Entry entry, boolean[] zArr, e eVar) {
        this.f21153c = hVar;
        this.f21151a = entry;
        this.f21152b = eVar;
    }

    @Override // com.didi.drouter.router.IRouterInterceptor.IInterceptor
    public final void onContinue() {
        Map.Entry entry = this.f21151a;
        ((d) entry.getKey()).getClass();
        d dVar = (d) entry.getKey();
        p075f2.b bVar = (p075f2.b) entry.getValue();
        Object[] objArr = {dVar.f21142g, bVar.c()};
        if (p092g2.c.c()) {
            p092g2.c.a("request \"%s\", class \"%s\" start execute", objArr);
        }
        e eVar = this.f21152b;
        int i7 = bVar.f36365a;
        if (i7 == 1) {
            Context context = dVar.f21139d;
            Intent intent = bVar.f36370f;
            if (intent == null) {
                intent = new Intent();
                Class<?> cls = bVar.f36366b;
                if (cls != null) {
                    intent.setClass(context, cls);
                } else {
                    intent.setClassName(context, (String) null);
                }
            }
            if (((Bundle) dVar.f5949a).containsKey("router_start_activity_flags")) {
                intent.setFlags(((Bundle) dVar.f5949a).getInt("router_start_activity_flags"));
            }
            boolean z3 = context instanceof Activity;
            if (!z3) {
                intent.addFlags(268435456);
            }
            intent.putExtra("router_start_activity_request_number", dVar.f21142g);
            intent.putExtras((Bundle) dVar.f5949a);
            boolean zContainsKey = ((Bundle) dVar.f5949a).containsKey("router_start_activity_request_code");
            int i10 = zContainsKey ? ((Bundle) dVar.f5949a).getInt("router_start_activity_request_code") : 1024;
            if (z3 && zContainsKey) {
                ((Activity) context).startActivityForResult(intent, i10, intent.getBundleExtra("router_start_activity_options"));
            } else {
                context.startActivity(intent, intent.getBundleExtra("router_start_activity_options"));
            }
            int[] intArray = ((Bundle) dVar.f5949a).getIntArray("router_start_activity_animation");
            if (z3 && intArray != null && intArray.length == 2) {
                ((Activity) context).overridePendingTransition(intArray[0], intArray[1]);
            }
            f.c(dVar, "complete");
        } else if (i7 == 2) {
            if (((Bundle) dVar.f5949a).getBoolean("router_start_fragment_new_instance", true)) {
                IRouterProxy iRouterProxy = bVar.f36367c;
                Object objNewInstance = iRouterProxy != null ? iRouterProxy.newInstance(null) : null;
                if (objNewInstance instanceof Fragment) {
                    ((Fragment) objNewInstance).setArguments((Bundle) dVar.f5949a);
                }
            }
            f.c(dVar, "complete");
        } else if (i7 == 3) {
            if (((Bundle) dVar.f5949a).getBoolean("router_start_view_new_instance", true)) {
                IRouterProxy iRouterProxy2 = bVar.f36367c;
                Object objNewInstance2 = iRouterProxy2 != null ? iRouterProxy2.newInstance(dVar.f21139d) : null;
                if (objNewInstance2 instanceof View) {
                    View view = (View) objNewInstance2;
                    eVar.f21144d = view;
                    view.setTag((Bundle) dVar.f5949a);
                }
            }
            f.c(dVar, "complete");
        } else if (i7 == 4) {
            IRouterProxy iRouterProxy3 = bVar.f36367c;
            IRouterHandler iRouterHandler = iRouterProxy3 != null ? (IRouterHandler) iRouterProxy3.newInstance(null) : null;
            if (iRouterHandler != null) {
                Handler handler = p092g2.b.f36837a;
                iRouterHandler.handle(dVar, eVar);
                f.c(dVar, "complete");
            } else {
                f.c(dVar, "error");
            }
        }
        ((d) entry.getKey()).getClass();
    }

    @Override // com.didi.drouter.router.IRouterInterceptor.IInterceptor
    public final void onInterrupt() {
        onInterrupt(500);
    }

    @Override // com.didi.drouter.router.IRouterInterceptor.IInterceptor
    public final void onInterrupt(int i7) {
        this.f21152b.getClass();
        f.c((d) this.f21151a.getKey(), "stop_by_interceptor");
    }
}
