package com.palmpay.lib.bridgewrapper.photo.upload;

import Ff.h;
import Wf.AbstractC0780y;
import Wf.I;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.activity.AbstractActivityC0822m;
import androidx.annotation.Keep;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.video.u;
import androidx.lifecycle.V;
import com.didi.drouter.annotation.Service;
import com.luck.picture.lib.config.PictureMimeType;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/upload/batch"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000256B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\u00020\u00112\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010'\u001a\u0004\u0018\u00010&H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0005H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoMultipleUploadBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoMultipleUploadBridge$PhotoMultipleUploadParam;", "<init>", "()V", "", "path", "", "isContent", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "generateTmp", "(Landroid/content/Context;)Ljava/lang/String;", "Landroid/net/Uri;", "sourceUri", "targetPath", "", "copyFile", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)V", "Ljava/io/InputStream;", "is", "Ljava/io/OutputStream;", OfflineConstant.PARAM_OS, "writeFileFromInputStream", "(Ljava/io/InputStream;Ljava/io/OutputStream;)V", "Ljava/io/Closeable;", "c", "close", "(Ljava/io/Closeable;)V", "Ljava/io/File;", "getFile", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "Landroidx/activity/m;", "activity", "params", "upload", "(Landroidx/activity/m;Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoMultipleUploadBridge$PhotoMultipleUploadParam;)V", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "onHandle", "(Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoMultipleUploadBridge$PhotoMultipleUploadParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "getAccessKey", "()Ljava/lang/String;", "getSecretKey", "isDebug", "()Z", "Lokhttp3/U;", "getOkHttpClient", "()Lokhttp3/U;", "", "BYTE_SIZE", "I", "PhotoMultipleUploadEntry", "PhotoMultipleUploadParam", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class PhotoMultipleUploadBridge extends SyncBridge<PhotoMultipleUploadParam> {
    private final int BYTE_SIZE = 1024;

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoMultipleUploadBridge$PhotoMultipleUploadEntry;", "", "path", "", "uploadSuccess", "", "url", "(Ljava/lang/String;ZLjava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getUploadSuccess", "()Z", "getUrl", "setUrl", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class PhotoMultipleUploadEntry {

        @NotNull
        private final String path;
        private final boolean uploadSuccess;

        @Nullable
        private String url;

        public PhotoMultipleUploadEntry(@NotNull String path, boolean z3, @Nullable String str) {
            Intrinsics.checkNotNullParameter(path, "path");
            this.path = path;
            this.uploadSuccess = z3;
            this.url = str;
        }

        public static /* synthetic */ PhotoMultipleUploadEntry copy$default(PhotoMultipleUploadEntry photoMultipleUploadEntry, String str, boolean z3, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = photoMultipleUploadEntry.path;
            }
            if ((i7 & 2) != 0) {
                z3 = photoMultipleUploadEntry.uploadSuccess;
            }
            if ((i7 & 4) != 0) {
                str2 = photoMultipleUploadEntry.url;
            }
            return photoMultipleUploadEntry.copy(str, z3, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getUploadSuccess() {
            return this.uploadSuccess;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final PhotoMultipleUploadEntry copy(@NotNull String path, boolean uploadSuccess, @Nullable String url) {
            Intrinsics.checkNotNullParameter(path, "path");
            return new PhotoMultipleUploadEntry(path, uploadSuccess, url);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoMultipleUploadEntry)) {
                return false;
            }
            PhotoMultipleUploadEntry photoMultipleUploadEntry = (PhotoMultipleUploadEntry) other;
            return Intrinsics.c(this.path, photoMultipleUploadEntry.path) && this.uploadSuccess == photoMultipleUploadEntry.uploadSuccess && Intrinsics.c(this.url, photoMultipleUploadEntry.url);
        }

        @NotNull
        public final String getPath() {
            return this.path;
        }

        public final boolean getUploadSuccess() {
            return this.uploadSuccess;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public int hashCode() {
            int iHashCode = this.path.hashCode() * 31;
            boolean z3 = this.uploadSuccess;
            ?? r3 = z3;
            if (z3) {
                r3 = 1;
            }
            int i7 = (iHashCode + r3) * 31;
            String str = this.url;
            return i7 + (str == null ? 0 : str.hashCode());
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PhotoMultipleUploadEntry(path=");
            sb2.append(this.path);
            sb2.append(", uploadSuccess=");
            sb2.append(this.uploadSuccess);
            sb2.append(", url=");
            return u.p(sb2, this.url, ')');
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ,\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoMultipleUploadBridge$PhotoMultipleUploadParam;", "", "list", "", "", "private", "", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getList", "()Ljava/util/List;", "getPrivate", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoMultipleUploadBridge$PhotoMultipleUploadParam;", "equals", "other", "hashCode", "", "toString", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class PhotoMultipleUploadParam {

        @Nullable
        private final List<String> list;

        @Nullable
        private final Boolean private;

        public PhotoMultipleUploadParam(@Nullable List<String> list, @Nullable Boolean bool) {
            this.list = list;
            this.private = bool;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PhotoMultipleUploadParam copy$default(PhotoMultipleUploadParam photoMultipleUploadParam, List list, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                list = photoMultipleUploadParam.list;
            }
            if ((i7 & 2) != 0) {
                bool = photoMultipleUploadParam.private;
            }
            return photoMultipleUploadParam.copy(list, bool);
        }

        @Nullable
        public final List<String> component1() {
            return this.list;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getPrivate() {
            return this.private;
        }

        @NotNull
        public final PhotoMultipleUploadParam copy(@Nullable List<String> list, @Nullable Boolean bool) {
            return new PhotoMultipleUploadParam(list, bool);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoMultipleUploadParam)) {
                return false;
            }
            PhotoMultipleUploadParam photoMultipleUploadParam = (PhotoMultipleUploadParam) other;
            return Intrinsics.c(this.list, photoMultipleUploadParam.list) && Intrinsics.c(this.private, photoMultipleUploadParam.private);
        }

        @Nullable
        public final List<String> getList() {
            return this.list;
        }

        @Nullable
        public final Boolean getPrivate() {
            return this.private;
        }

        public int hashCode() {
            List<String> list = this.list;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            Boolean bool = this.private;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PhotoMultipleUploadParam(list=" + this.list + ", private=" + this.private + ')';
        }
    }

    /* JADX INFO: renamed from: com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1", f = "PhotoMultipleUploadBridge.kt", i = {}, l = {163, 164, 169}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AbstractActivityC0822m $activity;
        final /* synthetic */ PhotoMultipleUploadParam $params;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ PhotoMultipleUploadBridge this$0;

        /* JADX INFO: renamed from: com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1$2", f = "PhotoMultipleUploadBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<PhotoMultipleUploadEntry> $list;
            int label;
            final /* synthetic */ PhotoMultipleUploadBridge this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(PhotoMultipleUploadBridge photoMultipleUploadBridge, List<PhotoMultipleUploadEntry> list, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = photoMultipleUploadBridge;
                this.$list = list;
            }

            @Override // Ff.a
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$list, continuation);
            }

            @Override // Ff.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Ef.a aVar = Ef.a.f2423a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
                BaseBridge.handleSuccess$default(this.this$0, this.$list, null, 2, null);
                return Unit.f38893a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
            }
        }

        /* JADX INFO: renamed from: com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        @DebugMetadata(c = "com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1$3", f = "PhotoMultipleUploadBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Exception $e;
            int label;
            final /* synthetic */ PhotoMultipleUploadBridge this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(PhotoMultipleUploadBridge photoMultipleUploadBridge, Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = photoMultipleUploadBridge;
                this.$e = exc;
            }

            @Override // Ff.a
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$e, continuation);
            }

            @Override // Ff.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Ef.a aVar = Ef.a.f2423a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
                this.this$0.handleFail(this.$e);
                return Unit.f38893a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PhotoMultipleUploadParam photoMultipleUploadParam, AbstractActivityC0822m abstractActivityC0822m, PhotoMultipleUploadBridge photoMultipleUploadBridge, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$params = photoMultipleUploadParam;
            this.$activity = abstractActivityC0822m;
            this.this$0 = photoMultipleUploadBridge;
        }

        @Override // Ff.a
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$params, this.$activity, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
        
            if (Wf.AbstractC0780y.s(r0, r5, r13) == r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        
            if (Wf.AbstractC0780y.s(r0, r4, r13) == r1) goto L32;
         */
        @Override // Ff.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
            /*
                r13 = this;
                Ef.a r1 = Ef.a.f2423a
                int r0 = r13.label
                r2 = 3
                r3 = 0
                r4 = 2
                r5 = 1
                if (r0 == 0) goto L29
                if (r0 == r5) goto L25
                if (r0 == r4) goto L1d
                if (r0 != r2) goto L15
                androidx.camera.core.impl.utils.executor.g.M(r14)
                goto L9c
            L15:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1d:
                androidx.camera.core.impl.utils.executor.g.M(r14)     // Catch: java.lang.Exception -> L22
                goto L9c
            L22:
                r0 = move-exception
                r14 = r0
                goto L85
            L25:
                androidx.camera.core.impl.utils.executor.g.M(r14)     // Catch: java.lang.Exception -> L22
                goto L6f
            L29:
                androidx.camera.core.impl.utils.executor.g.M(r14)
                java.lang.Object r14 = r13.L$0
                kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L22
                r0.<init>()     // Catch: java.lang.Exception -> L22
                com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$PhotoMultipleUploadParam r6 = r13.$params     // Catch: java.lang.Exception -> L22
                if (r6 == 0) goto L66
                java.util.List r6 = r6.getList()     // Catch: java.lang.Exception -> L22
                if (r6 == 0) goto L66
                java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Exception -> L22
                androidx.activity.m r9 = r13.$activity     // Catch: java.lang.Exception -> L22
                com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$PhotoMultipleUploadParam r10 = r13.$params     // Catch: java.lang.Exception -> L22
                com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge r11 = r13.this$0     // Catch: java.lang.Exception -> L22
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L22
            L4b:
                boolean r7 = r6.hasNext()     // Catch: java.lang.Exception -> L22
                if (r7 == 0) goto L66
                java.lang.Object r7 = r6.next()     // Catch: java.lang.Exception -> L22
                r8 = r7
                java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L22
                com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1$1$1 r7 = new com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1$1$1     // Catch: java.lang.Exception -> L22
                r12 = 0
                r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L22
                Wf.B r7 = Wf.AbstractC0780y.d(r14, r3, r7, r2)     // Catch: java.lang.Exception -> L22
                r0.add(r7)     // Catch: java.lang.Exception -> L22
                goto L4b
            L66:
                r13.label = r5     // Catch: java.lang.Exception -> L22
                java.lang.Object r14 = Wf.AbstractC0780y.e(r0, r13)     // Catch: java.lang.Exception -> L22
                if (r14 != r1) goto L6f
                goto L9b
            L6f:
                java.util.List r14 = (java.util.List) r14     // Catch: java.lang.Exception -> L22
                cg.f r0 = Wf.I.f10809a     // Catch: java.lang.Exception -> L22
                Wf.p0 r0 = p015ag.o.f11960a     // Catch: java.lang.Exception -> L22
                com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1$2 r5 = new com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1$2     // Catch: java.lang.Exception -> L22
                com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge r6 = r13.this$0     // Catch: java.lang.Exception -> L22
                r5.<init>(r6, r14, r3)     // Catch: java.lang.Exception -> L22
                r13.label = r4     // Catch: java.lang.Exception -> L22
                java.lang.Object r14 = Wf.AbstractC0780y.s(r0, r5, r13)     // Catch: java.lang.Exception -> L22
                if (r14 != r1) goto L9c
                goto L9b
            L85:
                r14.printStackTrace()
                cg.f r0 = Wf.I.f10809a
                Wf.p0 r0 = p015ag.o.f11960a
                com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1$3 r4 = new com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge$upload$1$3
                com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge r5 = r13.this$0
                r4.<init>(r5, r14, r3)
                r13.label = r2
                java.lang.Object r14 = Wf.AbstractC0780y.s(r0, r4, r13)
                if (r14 != r1) goto L9c
            L9b:
                return r1
            L9c:
                kotlin.Unit r14 = kotlin.Unit.f38893a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.palmpay.lib.bridgewrapper.photo.upload.PhotoMultipleUploadBridge.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    private final void close(Closeable c6) {
        if (c6 != null) {
            try {
                c6.close();
            } catch (Exception unused) {
            }
        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFile(Context context, String path) throws Throwable {
        if (!isContent(path)) {
            if (y.m(path, "file://", false)) {
                path = StringsKt.I(path, "file://");
            }
            return new File(path);
        }
        String strGenerateTmp = generateTmp(context);
        Uri uri = Uri.parse(path);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(path)");
        copyFile(context, uri, strGenerateTmp);
        return new File(strGenerateTmp);
    }

    private final boolean isContent(String path) {
        return !TextUtils.isEmpty(path) && y.m(path, "content://", false);
    }

    private final void upload(AbstractActivityC0822m activity, PhotoMultipleUploadParam params) {
        AbstractC0780y.m(V.f(activity), I.f10809a, null, new AnonymousClass1(params, activity, this, null), 2);
    }

    private final void writeFileFromInputStream(InputStream is, OutputStream os) throws Throwable {
        Closeable bufferedOutputStream;
        Closeable closeable = null;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(is);
            try {
                bufferedOutputStream = new BufferedOutputStream(os);
                try {
                    byte[] bArr = new byte[this.BYTE_SIZE];
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

    @NotNull
    public String getAccessKey() {
        return "";
    }

    @Nullable
    public U getOkHttpClient() {
        return null;
    }

    @NotNull
    public String getSecretKey() {
        return "";
    }

    public boolean isDebug() {
        return false;
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable PhotoMultipleUploadParam params, @Nullable IBridgeCallback callback) {
        Activity activity = getActivity();
        if (activity == null || !(activity instanceof AbstractActivityC0822m)) {
            return;
        }
        upload((AbstractActivityC0822m) activity, params);
    }
}
