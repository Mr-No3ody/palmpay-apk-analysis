package defpackage;

import C0.G;
import android.text.TextUtils;
import com.palmpay.lib.bridge.BaseBridge;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class d implements FileUploadManager.UploadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonFileUploadBridge f35484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f35485b;

    public d(CommonFileUploadBridge commonFileUploadBridge, String str) {
        this.f35484a = commonFileUploadBridge;
        this.f35485b = str;
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onComplete(String str, File file) {
        F6.d.h(CommonFileUploadBridge.TAG, 3, G.o("uploadFile onComplete >>> ", str));
        boolean zIsEmpty = TextUtils.isEmpty(str);
        CommonFileUploadBridge commonFileUploadBridge = this.f35484a;
        if (zIsEmpty) {
            commonFileUploadBridge.handleReject("uploadFile error, url is null");
        } else {
            BaseBridge.handleSuccess$default(commonFileUploadBridge, new CommonFileUploadBridge.FileUploadEntity(this.f35485b, str), null, 2, null);
        }
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onError(Exception exc) {
        F6.d.c(CommonFileUploadBridge.TAG, G.p("onError >>> uploadFile ", exc != null ? exc.getClass().getName() : null, ", ", exc != null ? exc.getMessage() : null));
        this.f35484a.handleReject(G.p("uploadFile error, ", exc != null ? exc.getClass().getName() : null, " ", exc != null ? exc.getMessage() : null));
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onProgressChanged(long j6, long j10) {
        F6.d.h(CommonFileUploadBridge.TAG, 3, "onProgressChanged >>>");
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onStartSync(String str, File file) {
    }
}
