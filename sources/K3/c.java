package K3;

import android.os.Build;
import android.view.Window;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public final void checkHardwareAccelerated(@Nullable Window window) {
        String str = Build.MODEL;
        String str2 = Build.BRAND;
        if (Intrinsics.c(str2, "Infinix") && Intrinsics.c(str, "Infinix X612")) {
            return;
        }
        if (Intrinsics.c(str2, "Qubo") && (y.h(str, "x626", true) || y.h(str, "big1", true))) {
            return;
        }
        if ((y.h(str2, "blackview", true) && y.h(str, "a60", true)) || window == null) {
            return;
        }
        window.addFlags(PointerEventHelper.X_FLAG_SUPPORTS_HOVER);
    }

    private c() {
    }
}
