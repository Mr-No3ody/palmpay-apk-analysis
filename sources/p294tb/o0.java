package p294tb;

import Pa.n0;
import android.hardware.Camera;
import android.view.View;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.credit.bean.req.OcApplyData;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLUploadImgDialog;
import com.transsnet.palmpay.managemoney.ui.activity.C1578y;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLTakePhotoActivity f42494b;

    public /* synthetic */ o0(CLTakePhotoActivity cLTakePhotoActivity, int i7) {
        this.f42493a = i7;
        this.f42494b = cLTakePhotoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = 1;
        CLTakePhotoActivity cLTakePhotoActivity = this.f42494b;
        switch (this.f42493a) {
            case 0:
                int i10 = CLTakePhotoActivity.f29134F0;
                cLTakePhotoActivity.A();
                break;
            case 1:
                int i11 = CLTakePhotoActivity.f29134F0;
                cLTakePhotoActivity.onBackPressed();
                n0 n0VarG = n0.g();
                OcApplyData ocApplyData = cLTakePhotoActivity.f29248B;
                n0VarG.m("CLTakePhotoActivity_element_click", "router_back_img", ocApplyData != null ? ocApplyData.getProduct() : null);
                break;
            case 2:
                int i12 = CLTakePhotoActivity.f29134F0;
                cLTakePhotoActivity.v();
                n0 n0VarG2 = n0.g();
                OcApplyData ocApplyData2 = cLTakePhotoActivity.f29248B;
                n0VarG2.m("CLTakePhotoActivity_element_click", "router_close_img", ocApplyData2 != null ? ocApplyData2.getProduct() : null);
                break;
            case 3:
                int i13 = CLTakePhotoActivity.f29134F0;
                try {
                    if (!cLTakePhotoActivity.f29153z0) {
                        cLTakePhotoActivity.showLoadingDialog(true);
                        cLTakePhotoActivity.f29153z0 = true;
                        Camera camera = cLTakePhotoActivity.f29152y0;
                        if (camera != null) {
                            camera.takePicture(null, null, null, new C1578y(cLTakePhotoActivity, i7));
                        }
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    ToastUtils.showLong(e10.getMessage(), new Object[0]);
                }
                n0 n0VarG3 = n0.g();
                String strConcat = "CLTakePhotoActivity".concat("_element_click");
                OcApplyData ocApplyData3 = cLTakePhotoActivity.f29248B;
                n0VarG3.m(strConcat, "take_photo_img", ocApplyData3 != null ? ocApplyData3.getProduct() : null);
                break;
            case 4:
                int i14 = CLTakePhotoActivity.f29134F0;
                cLTakePhotoActivity.C();
                n0 n0VarG4 = n0.g();
                OcApplyData ocApplyData4 = cLTakePhotoActivity.f29248B;
                n0VarG4.m("CLTakePhotoActivity_element_click", "try_again_tv", ocApplyData4 != null ? ocApplyData4.getProduct() : null);
                break;
            case 5:
                if (cLTakePhotoActivity.f29137C0 == null) {
                    CLUploadImgDialog cLUploadImgDialog = new CLUploadImgDialog(cLTakePhotoActivity);
                    cLTakePhotoActivity.f29137C0 = cLUploadImgDialog;
                    cLUploadImgDialog.setCanceledOnTouchOutside(false);
                    CLUploadImgDialog cLUploadImgDialog2 = cLTakePhotoActivity.f29137C0;
                    if (cLUploadImgDialog2 != null) {
                        cLUploadImgDialog2.setCancelable(false);
                    }
                }
                CLUploadImgDialog cLUploadImgDialog3 = cLTakePhotoActivity.f29137C0;
                if (cLUploadImgDialog3 != null) {
                    cLUploadImgDialog3.show();
                }
                File file = cLTakePhotoActivity.f29136B0;
                if (file != null) {
                    FileUploadManager.getInstance().uploadFile(file, true, new r0(cLTakePhotoActivity));
                }
                n0 n0VarG5 = n0.g();
                OcApplyData ocApplyData5 = cLTakePhotoActivity.f29248B;
                n0VarG5.m("CLTakePhotoActivity_element_click", "done_tv", ocApplyData5 != null ? ocApplyData5.getProduct() : null);
                break;
            case 6:
                int i15 = CLTakePhotoActivity.f29134F0;
                cLTakePhotoActivity.C();
                break;
            case 7:
                int i16 = CLTakePhotoActivity.f29134F0;
                cLTakePhotoActivity.C();
                break;
            case 8:
                int i17 = CLTakePhotoActivity.f29134F0;
                cLTakePhotoActivity.z();
                break;
            default:
                int i18 = CLTakePhotoActivity.f29134F0;
                cLTakePhotoActivity.z();
                break;
        }
    }
}
