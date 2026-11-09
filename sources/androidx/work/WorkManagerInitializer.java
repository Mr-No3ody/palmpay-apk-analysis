package androidx.work;

import V0.C;
import V0.C0684c;
import V0.T;
import V0.U;
import android.content.Context;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import p279s5.d;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements Initializer<U> {
    static {
        C.d("WrkMgrInitializer");
    }

    @Override // androidx.startup.Initializer
    public final U create(Context context) {
        C.c().getClass();
        C0684c c0684c = new C0684c(new d(13, false));
        T t = U.f9904a;
        t.initialize(context, c0684c);
        return t.getInstance(context);
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
