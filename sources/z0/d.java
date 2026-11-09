package z0;

import androidx.lifecycle.viewmodel.CreationExtras$Key;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    public /* synthetic */ d(int i7) {
        this(a.f44407b);
    }

    @Override // z0.b
    public final Object a(CreationExtras$Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f44408a.get(key);
    }

    public final void b(CreationExtras$Key key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f44408a.put(key, obj);
    }

    public d(b initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        this.f44408a.putAll(initialExtras.f44408a);
    }
}
