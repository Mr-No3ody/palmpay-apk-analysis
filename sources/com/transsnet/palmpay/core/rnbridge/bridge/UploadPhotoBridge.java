package com.transsnet.palmpay.core.rnbridge.bridge;

import C0.G;
import F6.d;
import N8.q0;
import android.text.TextUtils;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.AttachData;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/photo/uploadfilesync"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/UploadPhotoBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/core/bean/AttachData;", "<init>", "()V", "onHandle", "", "params", "callback", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "uploadPhoto", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadPhotoBridge extends SyncBridge<AttachData> {
    private final void uploadPhoto(AttachData params) {
        File file;
        if (params.isNeedDealPath) {
            String strY = q0.y(BaseApplication.get().getCacheDir().getPath(), "/", new File(params.imagePath).getName());
            if (!new File(strY).exists()) {
                File externalCacheDir = BaseApplication.get().getExternalCacheDir();
                strY = q0.y(externalCacheDir != null ? externalCacheDir.getPath() : null, "/", new File(params.imagePath).getName());
            }
            file = new File(strY);
        } else {
            file = new File(params.imagePath);
        }
        if (!file.exists()) {
            BaseBridge.handleIllegalArgument$default(this, null, 1, null);
        }
        FileUploadManager.getInstance().uploadFileSync(file, params.isPrivate, new FileUploadManager.UploadListener() { // from class: com.transsnet.palmpay.core.rnbridge.bridge.UploadPhotoBridge.uploadPhoto.1
            @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
            public void onComplete(String url, File originFile) {
                d.h("take_photo", 3, url == null ? "no path" : url);
                if (TextUtils.isEmpty(url)) {
                    BaseBridge.handleIllegalArgument$default(UploadPhotoBridge.this, null, 1, null);
                    return;
                }
                UploadPhotoBridge uploadPhotoBridge = UploadPhotoBridge.this;
                if (url == null) {
                    url = "";
                }
                BaseBridge.handleSuccess$default(uploadPhotoBridge, new com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge.PhotoUploadEntry(url, originFile != null ? originFile.getAbsolutePath() : null), null, 2, null);
            }

            @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
            public void onError(Exception ex) {
                BaseBridge.handleIllegalArgument$default(UploadPhotoBridge.this, null, 1, null);
                if (ex != null) {
                    ex.printStackTrace();
                }
            }

            @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
            public void onProgressChanged(long bytesCurrent, long bytesTotal) {
            }

            @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
            public void onStartSync(String url, File originFile) {
            }
        });
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable AttachData params, @Nullable IBridgeCallback callback) {
        d.h("uploadfilesync", 3, G.o("key: ", params != null ? params.imagePath : null));
        if (params == null) {
            BaseBridge.handleIllegalArgument$default(this, null, 1, null);
        } else if (TextUtils.isEmpty(params.imagePath)) {
            BaseBridge.handleIllegalArgument$default(this, null, 1, null);
        } else {
            uploadPhoto(params);
        }
    }
}
