package C0;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.palmpay.lib.webview.cache.WebCacheLoader;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0120l implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1062b;

    public /* synthetic */ C0120l(Object obj, int i7) {
        this.f1061a = i7;
        this.f1062b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, EnumC1203m event) {
        Object obj = this.f1062b;
        switch (this.f1061a) {
            case 0:
                AbstractC0130w this$0 = (AbstractC0130w) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(source, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                this$0.f1117q = event.a();
                if (this$0.f1103c != null) {
                    for (C0119k c0119k : this$0.f1107g) {
                        c0119k.getClass();
                        Intrinsics.checkNotNullParameter(event, "event");
                        c0119k.f1053d = event.a();
                        c0119k.c();
                    }
                }
                break;
            case 1:
                int i7 = E0.f.f2151j;
                E0.f this$1 = (E0.f) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == EnumC1203m.ON_DESTROY) {
                    Fragment fragment = (Fragment) source;
                    Object obj2 = null;
                    for (Object obj3 : (Iterable) this$1.b().f1071f.f39102a.getValue()) {
                        if (Intrinsics.c(((C0119k) obj3).f1055f, fragment.getTag())) {
                            obj2 = obj3;
                        }
                    }
                    C0119k c0119k2 = (C0119k) obj2;
                    if (c0119k2 != null) {
                        if (androidx.fragment.app.Z.L(2)) {
                            c0119k2.toString();
                            Objects.toString(source);
                        }
                        this$1.b().b(c0119k2);
                    }
                }
                break;
            case 2:
                L0.d this$2 = (L0.d) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Intrinsics.checkNotNullParameter(source, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == EnumC1203m.ON_START) {
                    this$2.f5521f = true;
                } else if (event == EnumC1203m.ON_STOP) {
                    this$2.f5521f = false;
                }
                break;
            default:
                WebCacheLoader.lifecycleEventObserver_delegate$lambda$2$lambda$1((WebCacheLoader) obj, source, event);
                break;
        }
    }
}
