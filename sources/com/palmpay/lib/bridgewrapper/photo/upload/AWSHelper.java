package com.palmpay.lib.bridgewrapper.photo.upload;

import android.webkit.MimeTypeMap;
import androidx.camera.camera2.internal.F;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001:\u00013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u001a2\u0016\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00180\u0017\"\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJM\u0010&\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b)\u0010\u001eR\u0014\u0010*\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010+R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010+R\u0014\u00100\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010+R\u0014\u00101\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010+R\u0014\u00102\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010+¨\u00064"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/upload/AWSHelper;", "", "<init>", "()V", "", "isPrivate", "isDebug", "", "getBucketName", "(ZZ)Ljava/lang/String;", "name", "isPrivateBucket", "(Ljava/lang/String;)Z", "fileName", "buildPath", "(Ljava/lang/String;ZZ)Ljava/lang/String;", "filepath", "buildUrl", "Ljava/io/File;", "file", "", "readFile2BytesByMap", "(Ljava/io/File;)[B", "", "Ljava/io/Closeable;", "closeables", "", "closeIO", "([Ljava/io/Closeable;)V", "getMimeType", "(Ljava/lang/String;)Ljava/lang/String;", "private", "ak", "sk", "Lcom/palmpay/lib/bridgewrapper/photo/upload/AWSHelper$UploadCallback;", "uploadFileCallback", "Lokhttp3/U;", "client", "uploadToS3", "(Ljava/io/File;ZZLjava/lang/String;Ljava/lang/String;Lcom/palmpay/lib/bridgewrapper/photo/upload/AWSHelper$UploadCallback;Lokhttp3/U;)V", "str", "stringFilter", "BUCKET_NAME1", "Ljava/lang/String;", "BUCKET_NAME2", "BUCKET_NAME3", "BUCKET_NAME4", "S3_SERVER_URL1", "S3_SERVER_URL2", "BUCKET_REGION_1", "BUCKET_REGION_2", "UploadCallback", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AWSHelper {

    @NotNull
    private static final String BUCKET_NAME1 = "transsnet-android-upload-image-prod";

    @NotNull
    private static final String BUCKET_NAME2 = "transsnet-android-upload-dev";

    @NotNull
    private static final String BUCKET_NAME3 = "transsnet-apps-images-test";

    @NotNull
    private static final String BUCKET_NAME4 = "transsnet-app-images-prod";

    @NotNull
    public static final String BUCKET_REGION_1 = "eu-west-1";

    @NotNull
    public static final String BUCKET_REGION_2 = "ap-southeast-1";

    @NotNull
    public static final AWSHelper INSTANCE = new AWSHelper();

    @NotNull
    private static final String S3_SERVER_URL1 = "https://s3-eu-west-1.amazonaws.com/";

    @NotNull
    private static final String S3_SERVER_URL2 = "https://s3-ap-southeast-1.amazonaws.com/";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&¨\u0006\t"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/upload/AWSHelper$UploadCallback;", "", "onCancel", "", "onFail", "errorMsg", "", "onSuccess", "fileUrl", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface UploadCallback {
        void onCancel();

        void onFail(@Nullable String errorMsg);

        void onSuccess(@Nullable String fileUrl);
    }

    private AWSHelper() {
    }

    private final String buildPath(String fileName, boolean isPrivate, boolean isDebug) {
        String strStringFilter = stringFilter(fileName);
        if (isDebug) {
            return F.d(new StringBuilder(), isPrivate ? "private/" : "", "dev/", strStringFilter);
        }
        return F.d(new StringBuilder(), isPrivate ? "private/" : "", "prod/", strStringFilter);
    }

    private final String buildUrl(String filepath, boolean isPrivate, boolean isDebug) {
        if (isDebug) {
            return S3_SERVER_URL2 + getBucketName(isPrivate, true) + '/' + filepath;
        }
        return S3_SERVER_URL1 + getBucketName(isPrivate, false) + '/' + filepath;
    }

    private final void closeIO(Closeable... closeables) {
        for (Closeable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private final String getBucketName(boolean isPrivate, boolean isDebug) {
        if (isDebug) {
            return isPrivate ? BUCKET_NAME3 : BUCKET_NAME2;
        }
        return isPrivate ? BUCKET_NAME4 : BUCKET_NAME1;
    }

    private final String getMimeType(String fileName) {
        String strQ;
        String mimeTypeFromExtension;
        if (fileName == null || (strQ = StringsKt.Q(fileName, fileName)) == null) {
            return "application/octet-stream";
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = strQ.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return (lowerCase == null || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase)) == null) ? "application/octet-stream" : mimeTypeFromExtension;
    }

    private final boolean isPrivateBucket(String name) {
        return BUCKET_NAME3.equals(name) || BUCKET_NAME4.equals(name);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x002f: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:48), block:B:8:0x002e */
    private final byte[] readFile2BytesByMap(File file) throws Throwable {
        Throwable th;
        Exception exc;
        FileChannel channel;
        Closeable closeable;
        Closeable closeable2 = null;
        try {
            try {
                channel = new RandomAccessFile(file, "r").getChannel();
                try {
                    int size = (int) channel.size();
                    byte[] bArr = new byte[size];
                    channel.map(FileChannel.MapMode.READ_ONLY, 0L, size).load().get(bArr, 0, size);
                    closeIO(channel);
                    return bArr;
                } catch (Exception e10) {
                    exc = e10;
                    exc.printStackTrace();
                    closeIO(channel);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
                closeIO(closeable2);
                throw th;
            }
        } catch (Exception e11) {
            exc = e11;
            channel = null;
        } catch (Throwable th3) {
            th = th3;
            closeIO(closeable2);
            throw th;
        }
    }

    @Nullable
    public final String stringFilter(@Nullable String str) {
        Pattern patternCompile = Pattern.compile("[`~! @#$%^&*()+=|{}':;',\\[\\]<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(regEx)");
        Matcher matcher = patternCompile.matcher(str);
        Intrinsics.checkNotNullExpressionValue(matcher, "p.matcher(str)");
        String strReplaceAll = matcher.replaceAll("");
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "m.replaceAll(\"\")");
        int length = strReplaceAll.length() - 1;
        int i7 = 0;
        boolean z3 = false;
        while (i7 <= length) {
            boolean z8 = Intrinsics.h(strReplaceAll.charAt(!z3 ? i7 : length), 32) <= 0;
            if (z3) {
                if (!z8) {
                    break;
                }
                length--;
            } else if (z8) {
                i7++;
            } else {
                z3 = true;
            }
        }
        return strReplaceAll.subSequence(i7, length + 1).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0187, code lost:
    
        if (kotlin.text.StringsKt.A(r0, "amazons3exception", false) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uploadToS3(@org.jetbrains.annotations.Nullable java.io.File r17, boolean r18, boolean r19, @org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.Nullable com.palmpay.lib.bridgewrapper.photo.upload.AWSHelper.UploadCallback r22, @org.jetbrains.annotations.Nullable okhttp3.U r23) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.palmpay.lib.bridgewrapper.photo.upload.AWSHelper.uploadToS3(java.io.File, boolean, boolean, java.lang.String, java.lang.String, com.palmpay.lib.bridgewrapper.photo.upload.AWSHelper$UploadCallback, okhttp3.U):void");
    }
}
