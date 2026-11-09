package N8;

import android.graphics.pdf.PdfRenderer;
import com.transsnet.palmpay.account.ui.activity.PreviewPdfActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class J implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6158d;

    public /* synthetic */ J(Object obj, int i7, int i10, int i11) {
        this.f6155a = i11;
        this.f6158d = obj;
        this.f6156b = i7;
        this.f6157c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        switch (this.f6155a) {
            case 0:
                int i7 = this.f6157c;
                final PreviewPdfActivity previewPdfActivity = (PreviewPdfActivity) this.f6158d;
                PdfRenderer pdfRenderer = previewPdfActivity.f25958f;
                final int i10 = this.f6156b;
                if (pdfRenderer == null || Thread.currentThread().isInterrupted()) {
                    final int i11 = 0;
                    previewPdfActivity.runOnUiThread(new Runnable() { // from class: N8.F
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    PreviewPdfActivity previewPdfActivity2 = previewPdfActivity;
                                    previewPdfActivity2.f25964v = i10;
                                    previewPdfActivity2.f25955B.set(false);
                                    break;
                                default:
                                    PreviewPdfActivity previewPdfActivity3 = previewPdfActivity;
                                    previewPdfActivity3.f25964v = i10;
                                    previewPdfActivity3.f25955B.set(false);
                                    break;
                            }
                        }
                    });
                } else {
                    try {
                        previewPdfActivity.runOnUiThread(new G(previewPdfActivity, previewPdfActivity.s(pdfRenderer, i10, i7), i10, i7, 0));
                    } catch (Exception e10) {
                        F6.d.c(previewPdfActivity.TAG, androidx.camera.video.u.h(i10, "loadNextPages failed from=", i7, " to="), e10);
                        final int i12 = 1;
                        previewPdfActivity.runOnUiThread(new Runnable() { // from class: N8.F
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        PreviewPdfActivity previewPdfActivity2 = previewPdfActivity;
                                        previewPdfActivity2.f25964v = i10;
                                        previewPdfActivity2.f25955B.set(false);
                                        break;
                                    default:
                                        PreviewPdfActivity previewPdfActivity3 = previewPdfActivity;
                                        previewPdfActivity3.f25964v = i10;
                                        previewPdfActivity3.f25955B.set(false);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                }
                break;
            default:
                androidx.camera.core.processing.m mVar = (androidx.camera.core.processing.m) this.f6158d;
                int i13 = mVar.f14434i;
                int i14 = this.f6156b;
                boolean z8 = true;
                if (i13 != i14) {
                    mVar.f14434i = i14;
                    z3 = true;
                } else {
                    z3 = false;
                }
                int i15 = mVar.f14433h;
                int i16 = this.f6157c;
                if (i15 != i16) {
                    mVar.f14433h = i16;
                } else {
                    z8 = z3;
                }
                if (z8) {
                    mVar.f();
                }
                break;
        }
    }
}
