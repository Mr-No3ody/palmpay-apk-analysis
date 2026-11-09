package E0;

import C0.C0119k;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.AbstractActivityC0822m;
import androidx.activity.C0816g;
import androidx.activity.I;
import androidx.core.view.C1063o;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Z;
import androidx.lifecycle.C1206p;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2169c;

    public /* synthetic */ k(int i7, Object obj, Object obj2) {
        this.f2167a = i7;
        this.f2168b = obj;
        this.f2169c = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner owner, EnumC1203m event) {
        Object obj = this.f2169c;
        Object obj2 = this.f2168b;
        switch (this.f2167a) {
            case 0:
                f this$0 = (f) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C0119k entry = (C0119k) obj;
                Intrinsics.checkNotNullParameter(entry, "$entry");
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == EnumC1203m.ON_RESUME) {
                    int i7 = f.f2151j;
                    if (((List) this$0.b().f1070e.f39102a.getValue()).contains(entry)) {
                        if (Z.L(2)) {
                            Objects.toString(entry);
                            Objects.toString(owner);
                        }
                        this$0.b().b(entry);
                    }
                }
                if (event == EnumC1203m.ON_DESTROY) {
                    if (Z.L(2)) {
                        Objects.toString(entry);
                        Objects.toString(owner);
                    }
                    int i10 = f.f2151j;
                    this$0.b().b(entry);
                    return;
                }
                return;
            case 1:
                I dispatcher = (I) obj2;
                Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
                AbstractActivityC0822m this$1 = (AbstractActivityC0822m) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(owner, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == EnumC1203m.ON_CREATE) {
                    OnBackInvokedDispatcher invoker = C0816g.f12029a.a(this$1);
                    dispatcher.getClass();
                    Intrinsics.checkNotNullParameter(invoker, "invoker");
                    dispatcher.f12002e = invoker;
                    dispatcher.e(dispatcher.f12004g);
                    return;
                }
                return;
            case 2:
                C1063o c1063o = (C1063o) obj2;
                c1063o.getClass();
                if (event == EnumC1203m.ON_DESTROY) {
                    c1063o.c((MenuProvider) obj);
                    return;
                }
                return;
            default:
                C1206p this$2 = (C1206p) obj2;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Job parentJob = (Job) obj;
                Intrinsics.checkNotNullParameter(parentJob, "$parentJob");
                Intrinsics.checkNotNullParameter(owner, "source");
                Intrinsics.checkNotNullParameter(event, "<anonymous parameter 1>");
                if (((C1212w) owner.getLifecycle()).f17478d == EnumC1204n.f17460a) {
                    parentJob.cancel((CancellationException) null);
                    this$2.a();
                    return;
                }
                EnumC1204n enumC1204n = ((C1212w) owner.getLifecycle()).f17478d;
                this$2.getClass();
                int iCompareTo = enumC1204n.compareTo(EnumC1204n.f17462c);
                V7.g gVar = this$2.f17468b;
                if (iCompareTo < 0) {
                    gVar.f10096a = true;
                    return;
                } else {
                    if (gVar.f10096a) {
                        if (gVar.f10097b) {
                            throw new IllegalStateException("Cannot resume a finished dispatcher");
                        }
                        gVar.f10096a = false;
                        gVar.b();
                        return;
                    }
                    return;
                }
        }
    }
}
