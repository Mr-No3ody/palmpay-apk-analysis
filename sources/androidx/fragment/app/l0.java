package androidx.fragment.app;

import android.view.View;
import androidx.transition.C1260v;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f17180a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f17181b;

    static {
        s0 s0Var;
        try {
            s0Var = (s0) C1260v.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            s0Var = null;
        }
        f17181b = s0Var;
    }

    public static final void a(int i7, ArrayList views) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i7);
        }
    }
}
