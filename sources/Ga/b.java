package Ga;

import C0.G;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void upload$default(b bVar, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            str3 = "";
        }
        bVar.upload(str, str2, str3);
    }

    public final void periodUploadV3() {
        if (PermissionUtils.isGranted("android.permission.READ_CONTACTS") && SPUtils.getInstance().getLong("palmpay_last_upload_contact_time", 0L) + 259200000 <= System.currentTimeMillis()) {
            upload$default(this, "", "3", null, 4, null);
            SPUtils.getInstance().put("palmpay_last_upload_contact_time", System.currentTimeMillis());
        }
    }

    public final void periodUploadV5() {
        if (PermissionUtils.isGranted("android.permission.READ_CONTACTS") && SPUtils.getInstance().getLong("palmpay_last_upload_contact_time", 0L) + 259200000 <= System.currentTimeMillis()) {
            upload$default(this, "", "5", null, 4, null);
            SPUtils.getInstance().put("palmpay_last_upload_contact_time", System.currentTimeMillis());
        }
    }

    public final void upload(@NotNull String batchNo, @NotNull String scenes, @NotNull String uploadNode) {
        Intrinsics.checkNotNullParameter(batchNo, "batchNo");
        Intrinsics.checkNotNullParameter(scenes, "scenes");
        Intrinsics.checkNotNullParameter(uploadNode, "uploadNode");
        if (PermissionUtils.isGranted("android.permission.READ_CONTACTS")) {
            new c().execute(batchNo, scenes, uploadNode);
        } else {
            G.u(MessageEvent.EVENT_UPLOAD_CONTACTS_FAILED, org.greenrobot.eventbus.c.b());
        }
    }

    private b() {
    }

    public final void upload(@NotNull String scenes) {
        Intrinsics.checkNotNullParameter(scenes, "scenes");
        upload$default(this, "", scenes, null, 4, null);
    }
}
