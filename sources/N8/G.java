package N8;

import com.transsnet.palmpay.account.ui.activity.PreviewPdfActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class G implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreviewPdfActivity f6146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6149e;

    public /* synthetic */ G(PreviewPdfActivity previewPdfActivity, ArrayList arrayList, int i7, int i10, int i11) {
        this.f6145a = i11;
        this.f6146b = previewPdfActivity;
        this.f6147c = arrayList;
        this.f6148d = i7;
        this.f6149e = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 1;
        int i10 = this.f6149e;
        int i11 = this.f6148d;
        ArrayList arrayList = this.f6147c;
        PreviewPdfActivity previewPdfActivity = this.f6146b;
        switch (this.f6145a) {
            case 0:
                PreviewPdfActivity.a aVar = PreviewPdfActivity.f25953C;
                if (!Pa.i0.W(previewPdfActivity)) {
                    previewPdfActivity.getClass();
                    PreviewPdfActivity.r(arrayList);
                    previewPdfActivity.f25964v = i11;
                    previewPdfActivity.f25955B.set(false);
                } else if (arrayList.isEmpty() && i11 < i10) {
                    previewPdfActivity.f25964v = i11;
                    previewPdfActivity.f25955B.set(false);
                } else {
                    previewPdfActivity.n(arrayList);
                    previewPdfActivity.f25955B.set(false);
                    I8.a aVar2 = (I8.a) previewPdfActivity.f27334c;
                    if (aVar2 != null) {
                        aVar2.f4036d.post(new E(previewPdfActivity, i7));
                    }
                }
                break;
            default:
                PreviewPdfActivity.a aVar3 = PreviewPdfActivity.f25953C;
                if (!Pa.i0.W(previewPdfActivity)) {
                    PreviewPdfActivity.r(arrayList);
                } else {
                    previewPdfActivity.t = i11;
                    previewPdfActivity.n(arrayList);
                    previewPdfActivity.f25964v = i10;
                    previewPdfActivity.f25960i = true;
                    I8.a aVar4 = (I8.a) previewPdfActivity.f27334c;
                    if (aVar4 != null) {
                        aVar4.f4034b.setEnabled(true);
                    }
                    previewPdfActivity.showLoadingDialog(false);
                    I8.a aVar5 = (I8.a) previewPdfActivity.f27334c;
                    if (aVar5 != null) {
                        aVar5.f4036d.setOnScrollChangeListener(new C0457a(previewPdfActivity, 2));
                    }
                    previewPdfActivity.q();
                }
                break;
        }
    }
}
