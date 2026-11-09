package N8;

import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import com.transsnet.palmpay.account.ui.activity.PreviewPdfActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class H implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6150a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f6151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PreviewPdfActivity f6152c;

    public /* synthetic */ H(PreviewPdfActivity previewPdfActivity, File file) {
        this.f6152c = previewPdfActivity;
        this.f6151b = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file = this.f6151b;
        switch (this.f6150a) {
            case 0:
                PreviewPdfActivity.a aVar = PreviewPdfActivity.f25953C;
                PreviewPdfActivity previewPdfActivity = this.f6152c;
                if (Pa.i0.W(previewPdfActivity)) {
                    int dp = previewPdfActivity.getResources().getDisplayMetrics().widthPixels - CommonViewExtKt.getDp(16);
                    if (dp > 1080) {
                        dp = 1080;
                    }
                    if (dp < 1) {
                        dp = 1;
                    }
                    previewPdfActivity.f25965w = dp;
                    previewPdfActivity.f25954A = previewPdfActivity.getColor(L6.b.ppColorBackgroundLight);
                    previewPdfActivity.f25960i = false;
                    I8.a aVar2 = (I8.a) previewPdfActivity.f27334c;
                    if (aVar2 != null) {
                        aVar2.f4034b.setEnabled(false);
                    }
                    I8.a aVar3 = (I8.a) previewPdfActivity.f27334c;
                    if (aVar3 != null) {
                        aVar3.f4035c.removeAllViews();
                    }
                    ArrayList arrayList = previewPdfActivity.f25963p;
                    PreviewPdfActivity.r(arrayList);
                    arrayList.clear();
                    previewPdfActivity.f25964v = 0;
                    previewPdfActivity.t = 0;
                    previewPdfActivity.lambda$checkAndShowLoadingDialog$1(true, false, previewPdfActivity.getString(F8.h.ac_loading));
                    previewPdfActivity.f25961j = previewPdfActivity.f25962o.submit(new H(file, previewPdfActivity));
                    break;
                }
                break;
            default:
                PreviewPdfActivity previewPdfActivity2 = this.f6152c;
                PreviewPdfActivity.a aVar4 = PreviewPdfActivity.f25953C;
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                    try {
                        PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
                        previewPdfActivity2.f25958f = pdfRenderer;
                        int pageCount = pdfRenderer.getPageCount();
                        int i7 = 4 > pageCount ? pageCount : 4;
                        previewPdfActivity2.runOnUiThread(new G(previewPdfActivity2, previewPdfActivity2.s(pdfRenderer, 0, i7), pageCount, i7, 1));
                    } catch (Exception e10) {
                        e = e10;
                        parcelFileDescriptor = parcelFileDescriptorOpen;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                                break;
                            } catch (Exception unused) {
                            }
                        }
                        F6.d.c(previewPdfActivity2.TAG, C0.G.o("openPdfAndRenderInitial failed path=", file.getAbsolutePath()), e);
                        previewPdfActivity2.runOnUiThread(new E(previewPdfActivity2, 3));
                    }
                } catch (Exception e11) {
                    e = e11;
                }
                break;
        }
    }

    public /* synthetic */ H(File file, PreviewPdfActivity previewPdfActivity) {
        this.f6151b = file;
        this.f6152c = previewPdfActivity;
    }
}
