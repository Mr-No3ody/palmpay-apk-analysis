package com.palmpay.lib.bridgewrapper.photo.upload.util;

import Ef.f;
import Wf.C0765i;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.appcompat.widget.m1;
import com.alibaba.android.arouter.utils.Consts;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.utils.DateUtils;
import com.palmpay.lib.bridgewrapper.photo.upload.a;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.o;
import p355xf.q;
import ph.e;
import top.zibin.luban.OnNewCompressListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J#\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0013H\u0002J\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/upload/util/CompressUtils;", "", "()V", "BYTE_SIZE", "", "close", "", "c", "Ljava/io/Closeable;", "compressPhoto", "Ljava/io/File;", "context", "Landroid/app/Activity;", "uri", "Landroid/net/Uri;", "(Landroid/app/Activity;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ltop/zibin/luban/OnNewCompressListener;", "copyFile", "Landroid/content/Context;", "sourceUri", "targetPath", "", "generateTmp", "getFile", "path", "isContent", "", "writeFileFromInputStream", "is", "Ljava/io/InputStream;", OfflineConstant.PARAM_OS, "Ljava/io/OutputStream;", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CompressUtils {

    @NotNull
    public static final CompressUtils INSTANCE = new CompressUtils();
    private static final int BYTE_SIZE = 1024;

    private CompressUtils() {
    }

    private final void close(Closeable c6) {
        if (c6 != null) {
            try {
                c6.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: compressPhoto$lambda-1, reason: not valid java name */
    public static final boolean m117compressPhoto$lambda1(String str) {
        return PictureMimeType.isUrlHasImage(str) && !PictureMimeType.isHasHttp(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: compressPhoto$lambda-2, reason: not valid java name */
    public static final String m118compressPhoto$lambda2(String filePath) {
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

    private final void copyFile(Context context, Uri sourceUri, String targetPath) throws Throwable {
        try {
            writeFileFromInputStream(new ParcelFileDescriptor.AutoCloseInputStream(context.getContentResolver().openFileDescriptor(sourceUri, "r")), new FileOutputStream(targetPath));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final String generateTmp(Context context) {
        File file = new File(context.getCacheDir(), "tmp_" + System.currentTimeMillis() + PictureMimeType.JPG);
        if (file.exists()) {
            file.delete();
        }
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
        return absolutePath;
    }

    private final boolean isContent(String path) {
        return !TextUtils.isEmpty(path) && y.m(path, "content://", false);
    }

    private final void writeFileFromInputStream(InputStream is, OutputStream os) throws Throwable {
        Closeable bufferedOutputStream;
        Closeable closeable = null;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(is);
            try {
                bufferedOutputStream = new BufferedOutputStream(os);
                try {
                    byte[] bArr = new byte[BYTE_SIZE];
                    while (true) {
                        int i7 = bufferedInputStream.read(bArr);
                        if (i7 == -1) {
                            os.flush();
                            close(bufferedInputStream);
                            close(bufferedOutputStream);
                            return;
                        }
                        os.write(bArr, 0, i7);
                    }
                } catch (Exception e10) {
                    e = e10;
                    closeable = bufferedInputStream;
                    try {
                        e.printStackTrace();
                        close(closeable);
                        close(bufferedOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        close(closeable);
                        close(bufferedOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = bufferedInputStream;
                    close(closeable);
                    close(bufferedOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }

    public final void compressPhoto(@NotNull Activity context, @NotNull Uri uri, @NotNull OnNewCompressListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(listener, "listener");
        m1 m1VarC = e.c(context);
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        m1VarC.c(0, getFile(context, string));
        m1VarC.f12976f = new a(4);
        m1VarC.f12973c = new a(5);
        m1VarC.f12975e = listener;
        m1VarC.b();
    }

    @NotNull
    public final File getFile(@NotNull Context context, @NotNull String path) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        if (!isContent(path)) {
            return new File(path);
        }
        String strGenerateTmp = generateTmp(context);
        Uri uri = Uri.parse(path);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(path)");
        copyFile(context, uri, strGenerateTmp);
        return new File(strGenerateTmp);
    }

    @Nullable
    public final Object compressPhoto(@NotNull Activity activity, @NotNull Uri uri, @NotNull Continuation<? super File> frame) {
        final C0765i c0765i = new C0765i(1, f.b(frame));
        c0765i.initCancellability();
        INSTANCE.compressPhoto(activity, uri, new OnNewCompressListener() { // from class: com.palmpay.lib.bridgewrapper.photo.upload.util.CompressUtils$compressPhoto$2$1
            @Override // top.zibin.luban.OnNewCompressListener
            public void onError(@Nullable String source, @Nullable Throwable e10) {
                CancellableContinuation<File> cancellableContinuation = c0765i;
                o oVar = q.f43977a;
                cancellableContinuation.resumeWith(null);
            }

            @Override // top.zibin.luban.OnNewCompressListener
            public void onStart() {
            }

            @Override // top.zibin.luban.OnNewCompressListener
            public void onSuccess(@Nullable String source, @Nullable File compressFile) {
                CancellableContinuation<File> cancellableContinuation = c0765i;
                o oVar = q.f43977a;
                cancellableContinuation.resumeWith(compressFile);
            }
        });
        Object objM = c0765i.m();
        if (objM == Ef.a.f2423a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objM;
    }
}
