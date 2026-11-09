package p218o7;

import V3.d;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.permissionx.guolindev.request.InvisibleFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends d {
    static {
        new m(null);
    }

    @Override // com.permissionx.guolindev.request.ChainTask
    public final void request() {
        h hVar = (h) this.f9988e;
        if (!hVar.f40079d.contains("android.permission.REQUEST_INSTALL_PACKAGES") || Build.VERSION.SDK_INT < 26 || hVar.d() < 26) {
            finish();
        } else if (hVar.a().getPackageManager().canRequestPackageInstalls()) {
            finish();
        } else {
            finish();
        }
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
        if (Build.VERSION.SDK_INT < 26) {
            if (invisibleFragmentC.f()) {
                invisibleFragmentC.h(new e(invisibleFragmentC, 0));
            }
        } else {
            Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
            intent.setData(Uri.parse("package:" + invisibleFragmentC.requireActivity().getPackageName()));
            invisibleFragmentC.f24653j.a(intent);
        }
    }
}
