package com.palmpay.lib.bridgewrapper.util;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.palmpay.lib.bridgewrapper.ext.ImageExtKt;
import com.palmpay.lib.bridgewrapper.ext.OutputFileTaker;
import com.palmpay.lib.bridgewrapper.util.ImageUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/util/ImageUtil;", "", "()V", "TAG", "", "save2Album", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "fileName", "relativePath", "quality", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/palmpay/lib/bridgewrapper/util/ImageUtil$AlbumListener;", "AlbumListener", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ImageUtil {

    @NotNull
    public static final ImageUtil INSTANCE = new ImageUtil();

    @NotNull
    private static final String TAG = "ImageUtil";

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/util/ImageUtil$AlbumListener;", "", "onCompleted", "", "path", "", "uri", "Landroid/net/Uri;", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface AlbumListener {
        void onCompleted(@Nullable String path, @Nullable Uri uri);
    }

    private ImageUtil() {
    }

    public static /* synthetic */ void save2Album$default(ImageUtil imageUtil, Context context, Bitmap bitmap, String str, String str2, int i7, AlbumListener albumListener, int i10, Object obj) throws IOException {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            i7 = 80;
        }
        if ((i10 & 32) != 0) {
            albumListener = null;
        }
        imageUtil.save2Album(context, bitmap, str, str2, i7, albumListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: save2Album$lambda-2, reason: not valid java name */
    public static final void m119save2Album$lambda2(AlbumListener albumListener, String str, Uri uri) {
        if (albumListener != null) {
            albumListener.onCompleted(str, uri);
        }
    }

    public final void save2Album(@NotNull Context context, @NotNull Bitmap bitmap, @NotNull String fileName, @Nullable String relativePath, int quality, @Nullable final AlbumListener listener) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        ContentResolver resolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT < 29) {
            File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(ImageExtKt.getBitmapFormat(fileName), quality, fileOutputStream);
                fileOutputStream.close();
                MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{"image/jpeg"}, new MediaScannerConnection.OnScanCompletedListener() { // from class: k6.a
                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public final void onScanCompleted(String str, Uri uri) {
                        ImageUtil.m119save2Album$lambda2(listener, str, uri);
                    }
                });
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.o(fileOutputStream, th);
                    throw th2;
                }
            }
        }
        OutputFileTaker outputFileTaker = new OutputFileTaker(null, 1, null);
        Intrinsics.checkNotNullExpressionValue(resolver, "resolver");
        Uri uriInsertMediaImage = ImageExtKt.insertMediaImage(resolver, fileName, relativePath, outputFileTaker);
        if (uriInsertMediaImage == null) {
            if (listener != null) {
                listener.onCompleted(null, null);
                return;
            }
            return;
        }
        OutputStream outputStream = ImageExtKt.outputStream(uriInsertMediaImage, resolver);
        if (outputStream != null) {
            try {
                bitmap.compress(ImageExtKt.getBitmapFormat(fileName), quality, outputStream);
                ImageExtKt.finishPending(uriInsertMediaImage, context, resolver, outputFileTaker.getFile());
                Unit unit = Unit.f38893a;
                outputStream.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    b.o(outputStream, th3);
                    throw th4;
                }
            }
        }
        if (listener != null) {
            File file2 = outputFileTaker.getFile();
            listener.onCompleted(file2 != null ? file2.getAbsolutePath() : null, uriInsertMediaImage);
        }
    }
}
