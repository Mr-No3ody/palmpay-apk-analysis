package L0;

import android.os.Bundle;
import androidx.lifecycle.C1200j;
import androidx.savedstate.SavedStateRegistry$SavedStateProvider;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f5518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f5520e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A.f f5516a = new A.f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5521f = true;

    static {
        new c(null);
    }

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f5519d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f5518c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(key);
        Bundle bundle3 = this.f5518c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f5518c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f5518c = null;
        return bundle2;
    }

    public final SavedStateRegistry$SavedStateProvider b() {
        String str;
        SavedStateRegistry$SavedStateProvider savedStateRegistry$SavedStateProvider;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        Iterator it = this.f5516a.iterator();
        do {
            A.b bVar = (A.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry components = (Map.Entry) bVar.next();
            Intrinsics.checkNotNullExpressionValue(components, "components");
            str = (String) components.getKey();
            savedStateRegistry$SavedStateProvider = (SavedStateRegistry$SavedStateProvider) components.getValue();
        } while (!Intrinsics.c(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return savedStateRegistry$SavedStateProvider;
    }

    public final void c(String key, SavedStateRegistry$SavedStateProvider provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (((SavedStateRegistry$SavedStateProvider) this.f5516a.b(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        Intrinsics.checkNotNullParameter(C1200j.class, "clazz");
        if (!this.f5521f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        b bVar = this.f5520e;
        if (bVar == null) {
            bVar = new b(this);
        }
        this.f5520e = bVar;
        try {
            C1200j.class.getDeclaredConstructor(new Class[0]);
            b bVar2 = this.f5520e;
            if (bVar2 != null) {
                String className = C1200j.class.getName();
                Intrinsics.checkNotNullExpressionValue(className, "clazz.name");
                Intrinsics.checkNotNullParameter(className, "className");
                bVar2.f5515a.add(className);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + C1200j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
