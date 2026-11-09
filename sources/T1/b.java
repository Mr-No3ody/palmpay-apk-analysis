package T1;

import android.content.Context;
import android.view.View;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f8936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f8937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8939d;

    public b() {
        EnumC2132k enumC2132k = EnumC2132k.f43971c;
        this.f8938c = C2131j.a(enumC2132k, a.f8933b);
        this.f8939d = C2131j.a(enumC2132k, a.f8934c);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(int... ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        for (int i7 : ids) {
            ((ArrayList) this.f8938c.getValue()).add(Integer.valueOf(i7));
        }
    }

    public abstract void b(BaseViewHolder baseViewHolder, Object obj);

    public final Context c() {
        Context context = this.f8936a;
        if (context != null) {
            return context;
        }
        Intrinsics.n("context");
        throw null;
    }

    public abstract int d();

    public abstract int e();

    public void f(BaseViewHolder helper, View view, Object obj, int i7) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void g(BaseViewHolder helper, View view, Object obj, int i7) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void h(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    public void i(BaseViewHolder viewHolder, int i7) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }
}
