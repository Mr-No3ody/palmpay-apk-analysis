package N8;

import android.content.DialogInterface;
import com.transsnet.palmpay.account.bean.rsp.CheckSecurityVerifyMethodRsp;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonBeanResult f6247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyAccountActivity f6248b;

    public o0(CommonBeanResult commonBeanResult, VerifyAccountActivity verifyAccountActivity) {
        this.f6247a = commonBeanResult;
        this.f6248b = verifyAccountActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (((CheckSecurityVerifyMethodRsp) this.f6247a.data).retryFlag) {
            return;
        }
        this.f6248b.finish();
    }
}
