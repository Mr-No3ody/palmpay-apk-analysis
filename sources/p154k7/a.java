package p154k7;

import com.palmpay.lib.webview.util.PermissionUtil;
import com.permissionx.guolindev.callback.RequestCallback;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements RequestCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PermissionUtil.PermissionCallback f38698b;

    public /* synthetic */ a(PermissionUtil.PermissionCallback permissionCallback, int i7) {
        this.f38697a = i7;
        this.f38698b = permissionCallback;
    }

    @Override // com.permissionx.guolindev.callback.RequestCallback
    public final void onResult(boolean z3, List list, List list2) {
        switch (this.f38697a) {
            case 0:
                PermissionUtil.lambda$requestAudioPermission$0(this.f38698b, z3, list, list2);
                break;
            default:
                PermissionUtil.lambda$requestVideoPermission$1(this.f38698b, z3, list, list2);
                break;
        }
    }
}
