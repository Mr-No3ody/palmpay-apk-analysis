package N8;

import com.transsnet.palmpay.account.ui.activity.PreviewPdfActivity;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class E implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreviewPdfActivity f6141b;

    public /* synthetic */ E(PreviewPdfActivity previewPdfActivity, int i7) {
        this.f6140a = i7;
        this.f6141b = previewPdfActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PreviewPdfActivity previewPdfActivity = this.f6141b;
        switch (this.f6140a) {
            case 0:
                PreviewPdfActivity.a aVar = PreviewPdfActivity.f25953C;
                previewPdfActivity.o();
                break;
            case 1:
                PreviewPdfActivity.a aVar2 = PreviewPdfActivity.f25953C;
                previewPdfActivity.q();
                break;
            case 2:
                PreviewPdfActivity.a aVar3 = PreviewPdfActivity.f25953C;
                if (Pa.i0.W(previewPdfActivity)) {
                    previewPdfActivity.f25959g = false;
                    previewPdfActivity.u(false);
                    ToastUtils.showLong(previewPdfActivity.getString(F8.h.ac_operation_fail), new Object[0]);
                    break;
                }
                break;
            default:
                PreviewPdfActivity.a aVar4 = PreviewPdfActivity.f25953C;
                if (Pa.i0.W(previewPdfActivity)) {
                    previewPdfActivity.showLoadingDialog(false);
                    ToastUtils.showLong(previewPdfActivity.getString(F8.h.ac_pdf_file_invalid), new Object[0]);
                    previewPdfActivity.finish();
                    break;
                }
                break;
        }
    }
}
