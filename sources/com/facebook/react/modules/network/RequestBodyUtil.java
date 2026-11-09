package com.facebook.react.modules.network;

import Pg.AbstractC0555b;
import Pg.C0558e;
import Pg.m;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.y;
import okhttp3.L;
import okhttp3.b0;
import okhttp3.c0;
import okio.BufferedSink;
import okio.Source;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\u00162\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u00162\u0006\u0010'\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010+¨\u0006."}, d2 = {"Lcom/facebook/react/modules/network/RequestBodyUtil;", "", "<init>", "()V", "", "encodingType", "", "isGzipEncoding", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "fileContentUriStr", "Ljava/io/InputStream;", "getFileInputStream", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;", "Landroid/net/Uri;", "uri", "getDownloadFileInputStream", "(Landroid/content/Context;Landroid/net/Uri;)Ljava/io/InputStream;", "Lokhttp3/L;", "mediaType", "body", "Lokhttp3/c0;", "createGzip", "(Lokhttp3/L;Ljava/lang/String;)Lokhttp3/c0;", "Lokio/Source;", "source", "", "closeQuietly", "(Lokio/Source;)V", "inputStream", "create", "(Lokhttp3/L;Ljava/io/InputStream;)Lokhttp3/c0;", "requestBody", "Lcom/facebook/react/modules/network/ProgressListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/modules/network/ProgressRequestBody;", "createProgressRequest", "(Lokhttp3/c0;Lcom/facebook/react/modules/network/ProgressListener;)Lcom/facebook/react/modules/network/ProgressRequestBody;", FirebaseAnalytics.Param.METHOD, "getEmptyBody", "(Ljava/lang/String;)Lokhttp3/c0;", "CONTENT_ENCODING_GZIP", "Ljava/lang/String;", "NAME", "TEMP_FILE_SUFFIX", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRequestBodyUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestBodyUtil.kt\ncom/facebook/react/modules/network/RequestBodyUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,180:1\n739#2,9:181\n37#3:190\n36#3,3:191\n*S KotlinDebug\n*F\n+ 1 RequestBodyUtil.kt\ncom/facebook/react/modules/network/RequestBodyUtil\n*L\n68#1:181,9\n69#1:190\n69#1:191,3\n*E\n"})
public final class RequestBodyUtil {

    @NotNull
    private static final String CONTENT_ENCODING_GZIP = "gzip";

    @NotNull
    public static final RequestBodyUtil INSTANCE = new RequestBodyUtil();

    @NotNull
    private static final String NAME = "RequestBodyUtil";

    @NotNull
    private static final String TEMP_FILE_SUFFIX = "temp";

    private RequestBodyUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeQuietly(Source source) {
        try {
            source.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    @NotNull
    public static final c0 create(@Nullable final L mediaType, @NotNull final InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return new c0() { // from class: com.facebook.react.modules.network.RequestBodyUtil.create.1
            @Override // okhttp3.c0
            public long contentLength() {
                try {
                    return inputStream.available();
                } catch (IOException unused) {
                    return 0L;
                }
            }

            @Override // okhttp3.c0
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public L get$mediaType() {
                return mediaType;
            }

            @Override // okhttp3.c0
            public void writeTo(BufferedSink sink) throws IOException {
                Intrinsics.checkNotNullParameter(sink, "sink");
                C0558e c0558eL = null;
                try {
                    InputStream inputStream2 = inputStream;
                    Intrinsics.checkNotNullParameter(inputStream2, "inputStream");
                    c0558eL = AbstractC0555b.l(inputStream2);
                    sink.writeAll(c0558eL);
                    RequestBodyUtil.INSTANCE.closeQuietly(c0558eL);
                } catch (Throwable th) {
                    if (c0558eL != null) {
                        RequestBodyUtil.INSTANCE.closeQuietly(c0558eL);
                    }
                    throw th;
                }
            }
        };
    }

    @JvmStatic
    @Nullable
    public static final c0 createGzip(@Nullable L mediaType, @NotNull String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bytes = body.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
            b0 b0Var = c0.Companion;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            return b0.create$default(b0Var, mediaType, byteArray, 0, 0, 12, (Object) null);
        } catch (IOException unused) {
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final ProgressRequestBody createProgressRequest(@NotNull c0 requestBody, @NotNull ProgressListener listener) {
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(listener, "listener");
        return new ProgressRequestBody(requestBody, listener);
    }

    private final InputStream getDownloadFileInputStream(Context context, Uri uri) throws IOException {
        File fileCreateTempFile = File.createTempFile(NAME, "temp", context.getApplicationContext().getCacheDir());
        fileCreateTempFile.deleteOnExit();
        URL url = new URL(uri.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        try {
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
            try {
                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStreamOpenStream);
                try {
                    fileOutputStream.getChannel().transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(fileCreateTempFile);
                    b.o(readableByteChannelNewChannel, null);
                    b.o(inputStreamOpenStream, null);
                    fileOutputStream.close();
                    return fileInputStream;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.o(readableByteChannelNewChannel, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    b.o(inputStreamOpenStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                b.o(fileOutputStream, th5);
                throw th6;
            }
        }
    }

    @JvmStatic
    @Nullable
    public static final c0 getEmptyBody(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        int iHashCode = method.hashCode();
        if (iHashCode == 79599 ? method.equals("PUT") : iHashCode == 2461856 ? method.equals("POST") : iHashCode == 75900968 && method.equals("PATCH")) {
            return c0.Companion.create((L) null, m.f7360e);
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final InputStream getFileInputStream(@NotNull Context context, @NotNull String fileContentUriStr) {
        Collection collectionU;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileContentUriStr, "fileContentUriStr");
        try {
            Uri uri = Uri.parse(fileContentUriStr);
            String scheme = uri.getScheme();
            if (scheme != null && y.m(scheme, "http", false)) {
                return INSTANCE.getDownloadFileInputStream(context, uri);
            }
            if (!y.m(fileContentUriStr, "data:", false)) {
                return context.getContentResolver().openInputStream(uri);
            }
            List listC = new Regex(",").c(fileContentUriStr);
            if (listC.isEmpty()) {
                collectionU = z.f38935a;
            } else {
                ListIterator listIterator = listC.listIterator(listC.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionU = CollectionsKt.U(listC, listIterator.nextIndex() + 1);
                    }
                }
                collectionU = z.f38935a;
            }
            return new ByteArrayInputStream(Base64.decode(((String[]) collectionU.toArray(new String[0]))[1], 0));
        } catch (Exception e10) {
            p229p2.a.i("ReactNative", "Could not retrieve file for contentUri " + fileContentUriStr, e10);
            return null;
        }
    }

    @JvmStatic
    public static final boolean isGzipEncoding(@Nullable String encodingType) {
        return CONTENT_ENCODING_GZIP.equalsIgnoreCase(encodingType);
    }
}
