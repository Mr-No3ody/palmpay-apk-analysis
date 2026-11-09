package p218o7;

import V3.d;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.luck.picture.lib.permissions.PermissionUtil;
import com.permissionx.guolindev.request.InvisibleFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends d {
    static {
        new o(null);
    }

    @Override // com.permissionx.guolindev.request.ChainTask
    public final void request() {
        if (!((h) this.f9988e).f40079d.contains("android.permission.MANAGE_EXTERNAL_STORAGE") || Build.VERSION.SDK_INT < 30) {
            finish();
        } else if (Environment.isExternalStorageManager()) {
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
        if (Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageManager()) {
            if (invisibleFragmentC.f()) {
                invisibleFragmentC.h(new e(invisibleFragmentC, 1));
                return;
            }
            return;
        }
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(Uri.parse("package:" + invisibleFragmentC.requireActivity().getPackageName()));
        if (intent.resolveActivity(invisibleFragmentC.requireActivity().getPackageManager()) == null) {
            intent = new Intent(PermissionUtil.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION);
        }
        invisibleFragmentC.f24652i.a(intent);
    }
}
