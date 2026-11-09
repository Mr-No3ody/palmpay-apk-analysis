package com.palmpay.lib.bridgewrapper.photo.upload;

import android.content.Context;
import android.net.Uri;
import androidx.appcompat.widget.m1;
import com.alibaba.android.arouter.utils.Consts;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.engine.CompressFileEngine;
import com.luck.picture.lib.interfaces.OnKeyValueResultCallbackListener;
import com.luck.picture.lib.utils.DateUtils;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import ph.e;
import top.zibin.luban.OnNewCompressListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/upload/ImageCompressEngine;", "Lcom/luck/picture/lib/engine/CompressFileEngine;", "()V", "onStartCompress", "", "context", "Landroid/content/Context;", "source", "Ljava/util/ArrayList;", "Landroid/net/Uri;", "Lkotlin/collections/ArrayList;", "call", "Lcom/luck/picture/lib/interfaces/OnKeyValueResultCallbackListener;", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ImageCompressEngine implements CompressFileEngine {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onStartCompress$lambda-0, reason: not valid java name */
    public static final boolean m110onStartCompress$lambda0(String str) {
        return PictureMimeType.isUrlHasImage(str) && !PictureMimeType.isHasHttp(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onStartCompress$lambda-1, reason: not valid java name */
    public static final String m111onStartCompress$lambda1(String filePath) {
        String strSubstring;
        Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
        int iG = StringsKt.G(filePath, 6, Consts.DOT);
        if (iG != -1) {
            strSubstring = filePath.substring(iG);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        } else {
            strSubstring = PictureMimeType.JPG;
        }
        return DateUtils.getCreateFileName("CMP_") + strSubstring;
    }

    @Override // com.luck.picture.lib.engine.CompressFileEngine
    public void onStartCompress(@Nullable Context context, @Nullable ArrayList<Uri> source, @Nullable final OnKeyValueResultCallbackListener call) {
        m1 m1VarC = e.c(context);
        m1VarC.d(source);
        m1VarC.f12976f = new a(0);
        m1VarC.f12973c = new a(1);
        m1VarC.f12975e = new OnNewCompressListener() { // from class: com.palmpay.lib.bridgewrapper.photo.upload.ImageCompressEngine.onStartCompress.3
            @Override // top.zibin.luban.OnNewCompressListener
            public void onError(@Nullable String source2, @Nullable Throwable e10) {
                OnKeyValueResultCallbackListener onKeyValueResultCallbackListener = call;
                if (onKeyValueResultCallbackListener != null) {
                    onKeyValueResultCallbackListener.onCallback(source2, null);
                }
            }

            @Override // top.zibin.luban.OnNewCompressListener
            public void onStart() {
            }

            @Override // top.zibin.luban.OnNewCompressListener
            public void onSuccess(@Nullable String source2, @Nullable File compressFile) {
                OnKeyValueResultCallbackListener onKeyValueResultCallbackListener = call;
                if (onKeyValueResultCallbackListener != null) {
                    onKeyValueResultCallbackListener.onCallback(source2, compressFile != null ? compressFile.getAbsolutePath() : null);
                }
            }
        };
        m1VarC.b();
    }
}
