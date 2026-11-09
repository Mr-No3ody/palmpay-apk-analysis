package p294tb;

import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLUploadImgDialog;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLTakePhotoActivity f42502b;

    public /* synthetic */ q0(CLTakePhotoActivity cLTakePhotoActivity, int i7) {
        this.f42501a = i7;
        this.f42502b = cLTakePhotoActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42501a) {
            case 0:
                CLTakePhotoActivity cLTakePhotoActivity = this.f42502b;
                CLUploadImgDialog cLUploadImgDialog = cLTakePhotoActivity.f29137C0;
                if (cLUploadImgDialog != null) {
                    cLUploadImgDialog.dismiss();
                }
                CLTakePhotoActivity.y(cLTakePhotoActivity);
                ToastUtils.showShort("upload images failed, please try again", new Object[0]);
                break;
            default:
                CLTakePhotoActivity cLTakePhotoActivity2 = this.f42502b;
                CLUploadImgDialog cLUploadImgDialog2 = cLTakePhotoActivity2.f29137C0;
                if (cLUploadImgDialog2 != null) {
                    cLUploadImgDialog2.dismiss();
                }
                CLTakePhotoActivity.y(cLTakePhotoActivity2);
                ToastUtils.showShort("upload images failed, please try again", new Object[0]);
                break;
        }
    }
}
