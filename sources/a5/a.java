package a5;

import Z4.f;
import Z4.g;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.growingio.android.sdk.d;
import com.growingio.android.sdk.track.listener.IActivityLifecycle;
import com.growingio.android.sdk.track.view.OnViewStateChangedListener;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p021b5.c;
import p047d5.b;
import p094g5.k;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements IActivityLifecycle, OnViewStateChangedListener {
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    public static void a(View view) {
        Activity activity;
        MenuItem menuItemA;
        if (!(d.f23195b == null ? false : d.f23196c)) {
            h.c("ViewChangeProvider", "Autotracker do not initialized successfully", new Object[0]);
        }
        b bVarK = null;
        if (view != null) {
            Context context = view.getContext();
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            while (true) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper instanceof Activity) {
                    activity = (Activity) contextWrapper;
                    break;
                }
                context = contextWrapper.getBaseContext();
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
            }
            if (activity != null) {
                Object tag = view.getTag(g.growing_tracker_ignore_policy);
                f fVar = tag instanceof f ? (f) tag : null;
                boolean z3 = true;
                if (!(fVar != null ? fVar == f.f11517a || fVar == f.f11519c : n.r(view))) {
                    if (view instanceof EditText) {
                        Object tag2 = view.getTag(g.growing_tracker_monitoring_focus_content);
                        String str = tag2 instanceof String ? (String) tag2 : null;
                        if (str == null) {
                            str = "";
                        }
                        String string = ((EditText) view).getText().toString();
                        if ((TextUtils.isEmpty(string) && TextUtils.isEmpty(str)) || str.equals(string)) {
                            z3 = false;
                        } else {
                            view.setTag(g.growing_tracker_monitoring_focus_content, string);
                        }
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (!p034c5.a.b(view) || (menuItemA = new p034c5.a(view).a()) == null) {
                            ArrayList arrayList = new ArrayList(8);
                            b bVarN = n.n(view, arrayList);
                            for (int size = arrayList.size() - 2; size >= 0; size--) {
                                View view2 = (View) arrayList.get(size);
                                View view3 = bVarN.f35531a;
                                if (view3 instanceof ViewGroup) {
                                    bVarN = bVarN.a(((ViewGroup) view3).indexOfChild(view2), view2);
                                }
                            }
                            bVarK = bVarN;
                        } else {
                            Activity activityX = p279s5.a.f42018a.x();
                            WeakHashMap weakHashMap = p021b5.d.f18781a;
                            c.f18780a.getClass();
                            bVarK = n.k((p021b5.b) p021b5.d.f18781a.get(activityX), menuItemA);
                        }
                    }
                }
            }
        }
        if (bVarK == null) {
            h.c("ViewChangeProvider", "ViewNode is NULL", new Object[0]);
            return;
        }
        WeakHashMap weakHashMap2 = p021b5.d.f18781a;
        p021b5.d dVar = c.f18780a;
        View view4 = bVarK.f35531a;
        dVar.getClass();
        p021b5.b bVarA = p021b5.d.a(view4);
        if (bVarA == null) {
            h.c("ViewChangeProvider", "sendChangeEvent page Activity is NULL", new Object[0]);
            return;
        }
        e5.d dVar2 = e5.c.f36164a;
        k kVar = new k();
        kVar.f36869D = -1;
        kVar.f37305g = "VIEW_CHANGE";
        kVar.f36870z = bVarA.a();
        kVar.f36866A = bVarA.f18773b;
        kVar.f36868C = bVarK.f35532b;
        kVar.f36869D = bVarK.f35538h;
        kVar.f36867B = bVarK.f35535e;
        dVar2.y(kVar);
    }

    @Override // com.growingio.android.sdk.track.listener.IActivityLifecycle
    public final void onActivityLifecycle(p182m5.a aVar) {
        Activity activityA;
        if (aVar.f39477a != 5 || (activityA = aVar.a()) == null) {
            return;
        }
        View viewFindFocus = activityA.getWindow().getDecorView().findFocus();
        if (viewFindFocus instanceof EditText) {
            h.a("ViewChangeProvider", "onActivityPaused, and focus view is EditText", new Object[0]);
            a(viewFindFocus);
        }
    }

    @Override // com.growingio.android.sdk.track.view.OnViewStateChangedListener
    public final void onViewStateChanged(p305u5.b bVar) {
        if (bVar.f42703a == 1) {
            View view = bVar.f42704b;
            if (view instanceof EditText) {
                h.a("ViewChangeProvider", "onViewStateChanged, and oldFocus view is EditText", new Object[0]);
                a(view);
            }
        }
    }
}
