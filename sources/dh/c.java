package dh;

import D4.f;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.transsnet.palmpay.custom_view.dialog.y;
import java.util.Arrays;
import pub.devrel.easypermissions.EasyPermissions$PermissionCallbacks;
import pub.devrel.easypermissions.EasyPermissions$RationaleCallbacks;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f35979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f35980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EasyPermissions$PermissionCallbacks f35981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EasyPermissions$RationaleCallbacks f35982d;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        y yVar = this.f35980b;
        int i10 = yVar.f31326d;
        EasyPermissions$RationaleCallbacks easyPermissions$RationaleCallbacks = this.f35982d;
        if (i7 != -1) {
            if (easyPermissions$RationaleCallbacks != null) {
                easyPermissions$RationaleCallbacks.onRationaleDenied(i10);
            }
            EasyPermissions$PermissionCallbacks easyPermissions$PermissionCallbacks = this.f35981c;
            if (easyPermissions$PermissionCallbacks != null) {
                easyPermissions$PermissionCallbacks.onPermissionsDenied(yVar.f31326d, Arrays.asList((String[]) yVar.f31328f));
                return;
            }
            return;
        }
        String[] strArr = (String[]) yVar.f31328f;
        if (easyPermissions$RationaleCallbacks != null) {
            easyPermissions$RationaleCallbacks.onRationaleAccepted(i10);
        }
        Object obj = this.f35979a;
        if (obj instanceof Fragment) {
            ((Fragment) obj).requestPermissions(strArr, i10);
        } else {
            if (!(obj instanceof Activity)) {
                throw new RuntimeException("Host must be an Activity or Fragment!");
            }
            f.p((Activity) obj).k(i10, strArr);
        }
    }
}
