package pub.devrel.easypermissions;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface EasyPermissions$PermissionCallbacks extends ActivityCompat$OnRequestPermissionsResultCallback {
    void onPermissionsDenied(int i7, @NonNull List<String> list);

    void onPermissionsGranted(int i7, @NonNull List<String> list);
}
