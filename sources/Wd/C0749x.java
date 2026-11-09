package Wd;

import android.app.Dialog;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.palmpay.airtime.ui.TopupResultActivityV2;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wd.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0749x implements AdShowCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseActivity f10793b;

    public /* synthetic */ C0749x(BaseActivity baseActivity, int i7) {
        this.f10792a = i7;
        this.f10793b = baseActivity;
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public final void showAppAd(AdEntity adEntity) {
        switch (this.f10792a) {
            case 0:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 1:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 2:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            default:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                break;
        }
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public final void showCallback(Dialog dialog) {
        BaseActivity baseActivity = this.f10793b;
        int i7 = this.f10792a;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        switch (i7) {
            case 0:
                super.showCallback(dialog);
                int i10 = BillerTransactionResultActivity.f34181Y;
                ((BillerTransactionResultActivity) baseActivity).showDialog(dialog, 95);
                break;
            case 1:
                super.showCallback(dialog);
                int i11 = TopupResultActivityV2.f26521k0;
                ((TopupResultActivityV2) baseActivity).showDialog(dialog, 99);
                break;
            case 2:
                super.showCallback(dialog);
                ArrayList arrayList = TransferResultActivity.f33237Z;
                ((TransferResultActivity) baseActivity).showDialog(dialog, 95);
                break;
            default:
                ((OcRepayResultActivity) baseActivity).getClass();
                if (dialog != null) {
                    dialog.show();
                }
                break;
        }
    }
}
