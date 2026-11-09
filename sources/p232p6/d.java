package p232p6;

import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements InstallStatusListener {
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    @Override // com.google.android.gms.common.moduleinstall.InstallStatusListener
    public final void onInstallStatusUpdated(ModuleInstallStatusUpdate it) {
        int i7;
        ModuleInstallStatusUpdate.ProgressInfo progressInfo;
        Intrinsics.checkNotNullParameter(it, "it");
        p pVar = p.f41234a;
        ModuleInstallStatusUpdate.ProgressInfo progressInfo2 = it.getProgressInfo();
        if ((progressInfo2 != null ? Long.valueOf(progressInfo2.getTotalBytesToDownload()) : null) == null || ((progressInfo = it.getProgressInfo()) != null && 0 == progressInfo.getTotalBytesToDownload())) {
            i7 = 2;
        } else {
            ModuleInstallStatusUpdate.ProgressInfo progressInfo3 = it.getProgressInfo();
            Long lValueOf = progressInfo3 != null ? Long.valueOf(progressInfo3.getBytesDownloaded()) : null;
            ModuleInstallStatusUpdate.ProgressInfo progressInfo4 = it.getProgressInfo();
            if (Intrinsics.c(lValueOf, progressInfo4 != null ? Long.valueOf(progressInfo4.getTotalBytesToDownload()) : null)) {
                i7 = 1;
            } else {
                i7 = 2;
            }
        }
        p.f41240g = i7;
    }
}
