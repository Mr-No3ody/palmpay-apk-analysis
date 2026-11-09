package androidx.activity.result;

import Fe.h0;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f12061a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12062b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f12063c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12064d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f12065e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f12066f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f12067g = new Bundle();

    static {
        new d(null);
    }

    public final boolean a(int i7, int i10, Intent intent) {
        String str = (String) this.f12061a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        c cVar = (c) this.f12065e.get(str);
        if ((cVar != null ? cVar.f12052a : null) != null) {
            ArrayList arrayList = this.f12064d;
            if (arrayList.contains(str)) {
                cVar.f12052a.onActivityResult(cVar.f12053b.parseResult(i10, intent));
                arrayList.remove(str);
                return true;
            }
        }
        this.f12066f.remove(str);
        this.f12067g.putParcelable(str, new ActivityResult(i10, intent));
        return true;
    }

    public abstract void b(int i7, p177m.b bVar, Object obj);

    public final g c(final String key, LifecycleOwner lifecycleOwner, final p177m.b contract, final ActivityResultCallback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1205o lifecycle = lifecycleOwner.getLifecycle();
        C1212w c1212w = (C1212w) lifecycle;
        if (c1212w.f17478d.a(EnumC1204n.f17463d)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + c1212w.f17478d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(key);
        LinkedHashMap linkedHashMap = this.f12063c;
        e eVar = (e) linkedHashMap.get(key);
        if (eVar == null) {
            eVar = new e(lifecycle);
        }
        LifecycleEventObserver observer = new LifecycleEventObserver() { // from class: androidx.activity.result.b
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, EnumC1203m event) {
                h this$0 = this.f12048a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String key2 = key;
                Intrinsics.checkNotNullParameter(key2, "$key");
                ActivityResultCallback callback2 = callback;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                p177m.b contract2 = contract;
                Intrinsics.checkNotNullParameter(contract2, "$contract");
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (EnumC1203m.ON_START != event) {
                    if (EnumC1203m.ON_STOP == event) {
                        this$0.f12065e.remove(key2);
                        return;
                    } else {
                        if (EnumC1203m.ON_DESTROY == event) {
                            this$0.f(key2);
                            return;
                        }
                        return;
                    }
                }
                this$0.f12065e.put(key2, new c(contract2, callback2));
                LinkedHashMap linkedHashMap2 = this$0.f12066f;
                if (linkedHashMap2.containsKey(key2)) {
                    Object obj = linkedHashMap2.get(key2);
                    linkedHashMap2.remove(key2);
                    callback2.onActivityResult(obj);
                }
                Bundle bundle = this$0.f12067g;
                ActivityResult activityResult = (ActivityResult) Z4.e.o(bundle, key2);
                if (activityResult != null) {
                    bundle.remove(key2);
                    callback2.onActivityResult(contract2.parseResult(activityResult.f12042a, activityResult.f12043b));
                }
            }
        };
        Intrinsics.checkNotNullParameter(observer, "observer");
        eVar.f12054a.a(observer);
        eVar.f12055b.add(observer);
        linkedHashMap.put(key, eVar);
        return new g(this, key, contract, 0);
    }

    public final g d(String key, p177m.b contract, ActivityResultCallback callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        e(key);
        this.f12065e.put(key, new c(contract, callback));
        LinkedHashMap linkedHashMap = this.f12066f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            callback.onActivityResult(obj);
        }
        Bundle bundle = this.f12067g;
        ActivityResult activityResult = (ActivityResult) Z4.e.o(bundle, key);
        if (activityResult != null) {
            bundle.remove(key);
            callback.onActivityResult(contract.parseResult(activityResult.f12042a, activityResult.f12043b));
        }
        return new g(this, key, contract, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f12062b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        f nextFunction = f.f12056a;
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        Sf.e eVar = new Sf.e(nextFunction, new h0(24));
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        for (Number number : new Sf.a(eVar)) {
            int iIntValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f12061a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                int iIntValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f12064d.contains(key) && (num = (Integer) this.f12062b.remove(key)) != null) {
            this.f12061a.remove(num);
        }
        this.f12065e.remove(key);
        LinkedHashMap linkedHashMap = this.f12066f;
        if (linkedHashMap.containsKey(key)) {
            Objects.toString(linkedHashMap.get(key));
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f12067g;
        if (bundle.containsKey(key)) {
            Objects.toString((ActivityResult) Z4.e.o(bundle, key));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f12063c;
        e eVar = (e) linkedHashMap2.get(key);
        if (eVar != null) {
            ArrayList arrayList = eVar.f12055b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.f12054a.b((LifecycleEventObserver) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
