package T8;

import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianExtra2Fragment;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements FileUploadManager.UploadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AddGuardianExtra2Fragment f9040a;

    public c(AddGuardianExtra2Fragment addGuardianExtra2Fragment) {
        this.f9040a = addGuardianExtra2Fragment;
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onComplete(String str, File file) {
        if (file != null) {
            this.f9040a.B(file, str);
        }
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onError(Exception exc) {
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onProgressChanged(long j6, long j10) {
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onStartSync(String str, File file) {
    }
}
