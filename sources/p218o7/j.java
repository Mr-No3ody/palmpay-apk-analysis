package p218o7;

import V3.d;
import android.os.Build;
import com.permissionx.guolindev.request.InvisibleFragment;
import java.util.List;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends d {
    static {
        new i(null);
    }

    @Override // com.permissionx.guolindev.request.ChainTask
    public final void request() {
        h hVar = (h) this.f9988e;
        if (hVar.f40079d.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (Build.VERSION.SDK_INT < 29) {
                hVar.f40079d.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                hVar.f40080e.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                finish();
                return;
            } else {
                if (androidx.core.content.d.a(hVar.a(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                    finish();
                    return;
                }
                boolean z3 = androidx.core.content.d.a(hVar.a(), "android.permission.ACCESS_FINE_LOCATION") == 0;
                boolean z8 = androidx.core.content.d.a(hVar.a(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
                if (z3 || z8) {
                    requestAgain(z.f38935a);
                    return;
                }
            }
        }
        finish();
    }

    @Override // com.permissionx.guolindev.request.ChainTask
    public final void requestAgain(List permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        h permissionBuilder = (h) this.f9988e;
        permissionBuilder.getClass();
        Intrinsics.checkNotNullParameter(this, "chainTask");
        InvisibleFragment invisibleFragmentC = permissionBuilder.c();
        Intrinsics.checkNotNullParameter(permissionBuilder, "permissionBuilder");
        Intrinsics.checkNotNullParameter(this, "chainTask");
        invisibleFragmentC.f24646b = permissionBuilder;
        invisibleFragmentC.f24647c = this;
        invisibleFragmentC.f24649e.a("android.permission.ACCESS_BACKGROUND_LOCATION");
    }
}
