package p135j0;

import Xf.c;
import Yf.EnumC0789a;
import androidx.annotation.CheckResult;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.flow.C1873e;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public /* synthetic */ l0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe$lambda$4(String str, Function1 observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        synchronized (m0.f38102c) {
            try {
                l0 l0Var = m0.f38101b;
                m0 m0Var = l0Var.getFileObservers$datastore_core_release().get(str);
                if (m0Var != null) {
                    m0Var.f38104a.remove(observer);
                    if (m0Var.f38104a.isEmpty()) {
                        l0Var.getFileObservers$datastore_core_release().remove(str);
                        m0Var.stopWatching();
                    }
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final Map<String, m0> getFileObservers$datastore_core_release() {
        return m0.f38103d;
    }

    @CheckResult
    @NotNull
    public final Flow<Unit> observe(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new C1873e(new k0(file, null), f.f38943a, -2, EnumC0789a.f11390a);
    }

    @VisibleForTesting
    public final void removeAllObservers$datastore_core_release() {
        synchronized (m0.f38102c) {
            try {
                Iterator<T> it = m0.f38101b.getFileObservers$datastore_core_release().values().iterator();
                while (it.hasNext()) {
                    ((m0) it.next()).stopWatching();
                }
                m0.f38101b.getFileObservers$datastore_core_release().clear();
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private l0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CheckResult
    public final DisposableHandle observe(File file, Function1<? super String, Unit> function1) {
        int i7 = 1;
        String key = file.getCanonicalFile().getPath();
        synchronized (m0.f38102c) {
            try {
                Map<String, m0> fileObservers$datastore_core_release = m0.f38101b.getFileObservers$datastore_core_release();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                m0 m0Var = fileObservers$datastore_core_release.get(key);
                if (m0Var == null) {
                    m0Var = new m0(key);
                    fileObservers$datastore_core_release.put(key, m0Var);
                }
                m0 m0Var2 = m0Var;
                m0Var2.f38104a.add(function1);
                if (m0Var2.f38104a.size() == 1) {
                    m0Var2.startWatching();
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new c(i7, key, function1);
    }

    @VisibleForTesting
    public static /* synthetic */ void getFileObservers$datastore_core_release$annotations() {
    }
}
