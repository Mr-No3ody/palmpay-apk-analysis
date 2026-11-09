package C0;

import androidx.navigation.NavViewModelStoreProvider;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: C0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0131x extends androidx.lifecycle.a0 implements NavViewModelStoreProvider {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1126e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final A0.b f1127f = new A0.b(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1128d = new LinkedHashMap();

    /* JADX INFO: renamed from: C0.x$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final C0131x getInstance(@NotNull androidx.lifecycle.i0 viewModelStore) {
            Intrinsics.checkNotNullParameter(viewModelStore, "viewModelStore");
            return (C0131x) new androidx.camera.video.internal.c(viewModelStore, C0131x.f1127f, 0).h(C0131x.class);
        }

        private a() {
        }
    }

    @Override // androidx.lifecycle.a0
    public final void b() {
        LinkedHashMap linkedHashMap = this.f1128d;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((androidx.lifecycle.i0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    public final androidx.lifecycle.i0 getViewModelStore(String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.f1128d;
        androidx.lifecycle.i0 i0Var = (androidx.lifecycle.i0) linkedHashMap.get(backStackEntryId);
        if (i0Var != null) {
            return i0Var;
        }
        androidx.lifecycle.i0 i0Var2 = new androidx.lifecycle.i0();
        linkedHashMap.put(backStackEntryId, i0Var2);
        return i0Var2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f1128d.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
