package p270rd;

import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.common.export.dialog.EnableLoginPasswordDialog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class S implements EnableLoginPasswordDialog.OnEnableTouchIdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S f41704a = new S();

    @Override // com.transsnet.palmpay.common.export.dialog.EnableLoginPasswordDialog.OnEnableTouchIdListener
    public final void onEnableClick(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ARouter.getInstance().build("/main/sub_settings").withString("pageId", "4").navigation();
    }
}
