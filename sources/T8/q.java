package T8;

import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveBirthCertificateFragment;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements FileUploadManager.UploadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GuardianApproveBirthCertificateFragment f9063a;

    public q(GuardianApproveBirthCertificateFragment guardianApproveBirthCertificateFragment) {
        this.f9063a = guardianApproveBirthCertificateFragment;
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onComplete(String str, File file) {
        if (file != null) {
            this.f9063a.B(file, str);
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
