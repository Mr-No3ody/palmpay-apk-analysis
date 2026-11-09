package com.palmpay.lib.bridgewrapper.photo.upload.util;

import Ef.a;
import Ef.f;
import Wf.C0765i;
import android.util.Log;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.bridgewrapper.photo.upload.AWSHelper;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import okhttp3.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/upload/util/UploadImageUrl;", "", "<init>", "()V", "Ljava/io/File;", "file", "", "private", "isDebug", "", "ak", "sk", "Lokhttp3/U;", "client", "upLoadImage", "(Ljava/io/File;ZZLjava/lang/String;Ljava/lang/String;Lokhttp3/U;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UploadImageUrl {

    @NotNull
    public static final UploadImageUrl INSTANCE = new UploadImageUrl();

    private UploadImageUrl() {
    }

    public static /* synthetic */ Object upLoadImage$default(UploadImageUrl uploadImageUrl, File file, boolean z3, boolean z8, String str, String str2, U u6, Continuation continuation, int i7, Object obj) {
        if ((i7 & 32) != 0) {
            u6 = null;
        }
        return uploadImageUrl.upLoadImage(file, z3, z8, str, str2, u6, continuation);
    }

    @Nullable
    public final Object upLoadImage(@Nullable File file, boolean z3, boolean z8, @NotNull String str, @NotNull String str2, @Nullable U u6, @NotNull Continuation<? super String> frame) {
        final C0765i c0765i = new C0765i(1, f.b(frame));
        c0765i.initCancellability();
        AWSHelper.INSTANCE.uploadToS3(file, z3, z8, str, str2, new AWSHelper.UploadCallback() { // from class: com.palmpay.lib.bridgewrapper.photo.upload.util.UploadImageUrl$upLoadImage$2$1
            @Override // com.palmpay.lib.bridgewrapper.photo.upload.AWSHelper.UploadCallback
            public void onCancel() {
                CancellableContinuation<String> cancellableContinuation = c0765i;
                o oVar = q.f43977a;
                cancellableContinuation.resumeWith(g.f(new Throwable(PPRNBridge.DIALOG_ACTION_CANCEL)));
            }

            @Override // com.palmpay.lib.bridgewrapper.photo.upload.AWSHelper.UploadCallback
            public void onFail(@Nullable String errorMsg) {
                CancellableContinuation<String> cancellableContinuation = c0765i;
                o oVar = q.f43977a;
                cancellableContinuation.resumeWith(null);
                Log.e(">>>>>", String.valueOf(errorMsg));
            }

            @Override // com.palmpay.lib.bridgewrapper.photo.upload.AWSHelper.UploadCallback
            public void onSuccess(@Nullable String fileUrl) {
                CancellableContinuation<String> cancellableContinuation = c0765i;
                o oVar = q.f43977a;
                cancellableContinuation.resumeWith(fileUrl);
            }
        }, u6);
        Object objM = c0765i.m();
        if (objM == a.f2423a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM;
    }
}
