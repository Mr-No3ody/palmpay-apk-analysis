package p218o7;

import V3.d;
import android.os.Build;
import com.permissionx.guolindev.request.InvisibleFragment;
import java.util.List;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends d {
    static {
        new k(null);
    }

    @Override // com.permissionx.guolindev.request.ChainTask
    public final void request() {
        h hVar = (h) this.f9988e;
        if (hVar.f40079d.contains("android.permission.BODY_SENSORS_BACKGROUND")) {
            if (Build.VERSION.SDK_INT < 33) {
                hVar.f40079d.remove("android.permission.BODY_SENSORS_BACKGROUND");
                hVar.f40080e.add("android.permission.BODY_SENSORS_BACKGROUND");
                finish();
                return;
            } else if (androidx.core.content.d.a(hVar.a(), "android.permission.BODY_SENSORS_BACKGROUND") == 0) {
                finish();
                return;
            } else if (androidx.core.content.d.a(hVar.a(), "android.permission.BODY_SENSORS") == 0) {
                requestAgain(z.f38935a);
                return;
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
        invisibleFragmentC.f24655p.a("android.permission.BODY_SENSORS_BACKGROUND");
    }
}
