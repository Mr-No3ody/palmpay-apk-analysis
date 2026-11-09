package p310ub;

import android.text.TextUtils;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcFeedbackActivity;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Q implements FileUploadManager.UploadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OcFeedbackActivity f42782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42783b;

    public Q(OcFeedbackActivity ocFeedbackActivity, int i7) {
        this.f42782a = ocFeedbackActivity;
        this.f42783b = i7;
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onComplete(String str, File file) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        OcFeedbackActivity ocFeedbackActivity = this.f42782a;
        if (zIsEmpty) {
            ocFeedbackActivity.showLoadingDialog(false);
            ToastUtils.showShort("upload images failed, please try again", new Object[0]);
            return;
        }
        ocFeedbackActivity.f29426A.append(str);
        int i7 = this.f42783b + 1;
        ArrayList arrayList = ocFeedbackActivity.f29437v;
        if (arrayList == null) {
            Intrinsics.n("mSelectedImgData");
            throw null;
        }
        if (i7 >= arrayList.size()) {
            ocFeedbackActivity.n();
        } else {
            ocFeedbackActivity.f29426A.append(",");
            ocFeedbackActivity.q(i7);
        }
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onError(Exception exc) {
        this.f42782a.showLoadingDialog(false);
        ToastUtils.showShort(exc != null ? exc.getMessage() : null, new Object[0]);
        if (exc != null) {
            exc.printStackTrace();
        }
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onProgressChanged(long j6, long j10) {
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onStartSync(String str, File file) {
    }
}
