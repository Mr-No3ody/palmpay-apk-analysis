package G0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @Nullable
    public final d obtain(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i7 = Build.VERSION.SDK_INT;
        androidx.privacysandbox.ads.adservices.internal.b bVar = androidx.privacysandbox.ads.adservices.internal.b.f17677a;
        if (i7 >= 33) {
            bVar.a();
        }
        if ((i7 >= 33 ? bVar.a() : 0) >= 5) {
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService((Class<Object>) e.k());
            Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService…ementManager::class.java)");
            return new f(e.c(systemService));
        }
        androidx.privacysandbox.ads.adservices.internal.a aVar = androidx.privacysandbox.ads.adservices.internal.a.f17676a;
        Object objInvoke = null;
        if (((i7 == 31 || i7 == 32) ? aVar.a() : 0) < 9) {
            return null;
        }
        b manager = new b(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("MeasurementManager", "tag");
        Intrinsics.checkNotNullParameter(manager, "manager");
        try {
            objInvoke = manager.invoke(context);
        } catch (NoClassDefFoundError unused) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 31 || i10 == 32) {
                aVar.a();
            }
        }
        return (d) objInvoke;
    }

    private c() {
    }
}
