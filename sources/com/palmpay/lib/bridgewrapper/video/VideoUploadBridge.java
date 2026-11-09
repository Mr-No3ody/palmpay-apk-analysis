package com.palmpay.lib.bridgewrapper.video;

import Ff.h;
import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.annotation.Keep;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.camera.core.impl.utils.executor.g;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.abedelazizshe.lightcompressorlibrary.CompressionListener;
import com.abedelazizshe.lightcompressorlibrary.config.VideoResizer;
import com.didi.drouter.annotation.Service;
import com.luck.picture.lib.config.SelectMimeType;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.palmpay.lib.bridgewrapper.ext.UploadExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ag.c;
import p042cg.f;
import p091g1.e;
import p137j3.u;
import p177m.l;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/video/upload"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\nJ)\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006("}, d2 = {"Lcom/palmpay/lib/bridgewrapper/video/VideoUploadBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/palmpay/lib/bridgewrapper/video/VideoUploadBridge$VideoUploadParam;", "<init>", "()V", "Landroidx/appcompat/app/o;", "appCompatActivity", "params", "", "recordVideo", "(Landroidx/appcompat/app/o;Lcom/palmpay/lib/bridgewrapper/video/VideoUploadBridge$VideoUploadParam;)V", "pickVideo", "Landroid/net/Uri;", "uri", "compressVideo", "(Landroidx/appcompat/app/o;Landroid/net/Uri;Lcom/palmpay/lib/bridgewrapper/video/VideoUploadBridge$VideoUploadParam;)V", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "onHandle", "(Lcom/palmpay/lib/bridgewrapper/video/VideoUploadBridge$VideoUploadParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "", "path", "uploadToS3", "(Ljava/lang/String;Lcom/palmpay/lib/bridgewrapper/video/VideoUploadBridge$VideoUploadParam;)V", "Lokhttp3/U;", "getOkHttpClient", "()Lokhttp3/U;", "getAccessKey", "()Ljava/lang/String;", "getSecretKey", "", "isDebug", "()Z", "Landroidx/activity/result/a;", "Landroid/content/Intent;", "videoRecordLauncher", "Landroidx/activity/result/a;", "videoFileLauncher", "VideoUploadEntry", "VideoUploadParam", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class VideoUploadBridge extends SyncBridge<VideoUploadParam> {

    @Nullable
    private androidx.activity.result.a videoFileLauncher;

    @Nullable
    private androidx.activity.result.a videoRecordLauncher;

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/video/VideoUploadBridge$VideoUploadParam;", "", "type", "", "private", "", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getPrivate", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/palmpay/lib/bridgewrapper/video/VideoUploadBridge$VideoUploadParam;", "equals", "other", "hashCode", "toString", "", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class VideoUploadParam {

        @Nullable
        private final Boolean private;

        @Nullable
        private final Integer type;

        public VideoUploadParam(@Nullable Integer num, @Nullable Boolean bool) {
            this.type = num;
            this.private = bool;
        }

        public static /* synthetic */ VideoUploadParam copy$default(VideoUploadParam videoUploadParam, Integer num, Boolean bool, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = videoUploadParam.type;
            }
            if ((i7 & 2) != 0) {
                bool = videoUploadParam.private;
            }
            return videoUploadParam.copy(num, bool);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getType() {
            return this.type;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getPrivate() {
            return this.private;
        }

        @NotNull
        public final VideoUploadParam copy(@Nullable Integer type, @Nullable Boolean bool) {
            return new VideoUploadParam(type, bool);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoUploadParam)) {
                return false;
            }
            VideoUploadParam videoUploadParam = (VideoUploadParam) other;
            return Intrinsics.c(this.type, videoUploadParam.type) && Intrinsics.c(this.private, videoUploadParam.private);
        }

        @Nullable
        public final Boolean getPrivate() {
            return this.private;
        }

        @Nullable
        public final Integer getType() {
            return this.type;
        }

        public int hashCode() {
            Integer num = this.type;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.private;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VideoUploadParam(type=" + this.type + ", private=" + this.private + ')';
        }
    }

    /* JADX INFO: renamed from: com.palmpay.lib.bridgewrapper.video.VideoUploadBridge$compressVideo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.palmpay.lib.bridgewrapper.video.VideoUploadBridge$compressVideo$1", f = "VideoUploadBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AbstractActivityC0837o $appCompatActivity;
        final /* synthetic */ VideoUploadParam $params;
        final /* synthetic */ List<Uri> $uris;
        int label;
        final /* synthetic */ VideoUploadBridge this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AbstractActivityC0837o abstractActivityC0837o, List<? extends Uri> list, VideoUploadBridge videoUploadBridge, VideoUploadParam videoUploadParam, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$appCompatActivity = abstractActivityC0837o;
            this.$uris = list;
            this.this$0 = videoUploadBridge;
            this.$params = videoUploadParam;
        }

        @Override // Ff.a
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$appCompatActivity, this.$uris, this.this$0, this.$params, continuation);
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [com.palmpay.lib.bridgewrapper.video.VideoUploadBridge$compressVideo$1$2, java.lang.Object] */
        @Override // Ff.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ef.a aVar = Ef.a.f2423a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            Context context = this.$appCompatActivity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(context, "appCompatActivity.applicationContext");
            List<Uri> uris = this.$uris;
            u storageConfiguration = new u(4);
            List<Uri> list = uris;
            ArrayList arrayList = new ArrayList(r.l(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                List<String> pathSegments = ((Uri) it.next()).getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments, "uri.pathSegments");
                arrayList.add((String) CollectionsKt.K(pathSegments));
            }
            com.abedelazizshe.lightcompressorlibrary.config.a configureWith = new com.abedelazizshe.lightcompressorlibrary.config.a(VideoResizer.f19290h0.limitSize(1280.0d), arrayList);
            final VideoUploadBridge videoUploadBridge = this.this$0;
            final VideoUploadParam videoUploadParam = this.$params;
            ?? listener = new CompressionListener() { // from class: com.palmpay.lib.bridgewrapper.video.VideoUploadBridge.compressVideo.1.2
                @Override // com.abedelazizshe.lightcompressorlibrary.CompressionListener
                public void onCancelled(int index) {
                    Log.wtf("TAG", "compression has been cancelled");
                    BaseBridge.handleCancel$default(videoUploadBridge, null, 1, null);
                }

                @Override // com.abedelazizshe.lightcompressorlibrary.CompressionListener
                public void onFailure(int index, @NotNull String failureMessage) {
                    Intrinsics.checkNotNullParameter(failureMessage, "failureMessage");
                    Log.wtf("failureMessage", failureMessage);
                    videoUploadBridge.handleFail(new Throwable(failureMessage));
                }

                @Override // com.abedelazizshe.lightcompressorlibrary.CompressionListener
                public void onProgress(int index, float percent) {
                }

                @Override // com.abedelazizshe.lightcompressorlibrary.CompressionListener
                public void onStart(int index) {
                }

                @Override // com.abedelazizshe.lightcompressorlibrary.CompressionListener
                public void onSuccess(int index, long size, @Nullable String path) {
                    Unit unit;
                    if (path != null) {
                        videoUploadBridge.uploadToS3(path, videoUploadParam);
                        unit = Unit.f38893a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        videoUploadBridge.handleFail(new Throwable("compress fail"));
                    }
                }
            };
            e eVar = e.f36833b;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uris, "uris");
            Intrinsics.checkNotNullParameter(storageConfiguration, "storageConfiguration");
            Intrinsics.checkNotNullParameter(configureWith, "configureWith");
            Intrinsics.checkNotNullParameter(listener, "listener");
            configureWith.f19293c.size();
            uris.size();
            e.f36833b.getClass();
            F f10 = new F();
            int size = uris.size();
            for (int i7 = 0; i7 < size; i7++) {
                c cVarA = AbstractC0777v.a(kotlin.coroutines.e.c(AbstractC0780y.b(), new p091g1.a(listener, i7)));
                f fVar = I.f10809a;
                AbstractC0780y.m(cVarA, p042cg.e.f19009c, null, new p091g1.c(context, storageConfiguration, configureWith, i7, f10, uris, listener, null), 2);
                e eVar2 = e.f36833b;
            }
            return Unit.f38893a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
        }
    }

    private final void compressVideo(AbstractActivityC0837o appCompatActivity, Uri uri, VideoUploadParam params) {
        AbstractC0780y.m(V.f(appCompatActivity), null, null, new AnonymousClass1(appCompatActivity, C1849p.c(uri), this, params, null), 3);
    }

    private final void pickVideo(AbstractActivityC0837o appCompatActivity, VideoUploadParam params) {
        if (this.videoFileLauncher == null) {
            this.videoFileLauncher = UploadExtKt.registerActivityResultLauncher(appCompatActivity, new l(), new a(this, appCompatActivity, params, 0));
        }
        Intent intent = new Intent();
        intent.setType(SelectMimeType.SYSTEM_VIDEO);
        intent.setAction("android.intent.action.PICK");
        androidx.activity.result.a aVar = this.videoFileLauncher;
        if (aVar != null) {
            aVar.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pickVideo$lambda-8, reason: not valid java name */
    public static final void m120pickVideo$lambda8(VideoUploadBridge this$0, AbstractActivityC0837o appCompatActivity, VideoUploadParam params, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appCompatActivity, "$appCompatActivity");
        Intrinsics.checkNotNullParameter(params, "$params");
        int i7 = activityResult.f12042a;
        Unit unit = null;
        if (i7 == -1) {
            Intent intent = activityResult.f12043b;
            Uri data = intent != null ? intent.getData() : null;
            if (data != null) {
                this$0.compressVideo(appCompatActivity, data, params);
                unit = Unit.f38893a;
            }
            if (unit == null) {
                this$0.handleFail(new Throwable("pick video file fail"));
            }
        } else if (i7 == 0) {
            BaseBridge.handleCancel$default(this$0, null, 1, null);
        } else {
            this$0.handleFail(new Throwable("pick video file fail"));
        }
        androidx.activity.result.a aVar = this$0.videoFileLauncher;
        if (aVar != null) {
            aVar.b();
        }
    }

    private final void recordVideo(AbstractActivityC0837o appCompatActivity, VideoUploadParam params) {
        if (this.videoRecordLauncher == null) {
            this.videoRecordLauncher = UploadExtKt.registerActivityResultLauncher(appCompatActivity, new l(), new a(this, appCompatActivity, params, 1));
        }
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        androidx.activity.result.a aVar = this.videoRecordLauncher;
        if (aVar != null) {
            aVar.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: recordVideo$lambda-5, reason: not valid java name */
    public static final void m121recordVideo$lambda5(VideoUploadBridge this$0, AbstractActivityC0837o appCompatActivity, VideoUploadParam params, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appCompatActivity, "$appCompatActivity");
        Intrinsics.checkNotNullParameter(params, "$params");
        int i7 = activityResult.f12042a;
        Unit unit = null;
        if (i7 == -1) {
            Intent intent = activityResult.f12043b;
            Uri data = intent != null ? intent.getData() : null;
            if (data != null) {
                this$0.compressVideo(appCompatActivity, data, params);
                unit = Unit.f38893a;
            }
            if (unit == null) {
                this$0.handleFail(new Throwable("record video fail"));
            }
        } else if (i7 == 0) {
            BaseBridge.handleCancel$default(this$0, null, 1, null);
        } else {
            this$0.handleFail(new Throwable("record video fail"));
        }
        androidx.activity.result.a aVar = this$0.videoRecordLauncher;
        if (aVar != null) {
            aVar.b();
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

    public void uploadToS3(@NotNull String path, @Nullable VideoUploadParam params) {
        Boolean bool;
        t0 t0VarM;
        Intrinsics.checkNotNullParameter(path, "path");
        Activity activity = getActivity();
        if (activity != null) {
            if (params != null && (bool = params.getPrivate()) != null) {
                boolean zBooleanValue = bool.booleanValue();
                AbstractActivityC0837o abstractActivityC0837o = activity instanceof AbstractActivityC0837o ? (AbstractActivityC0837o) activity : null;
                if (abstractActivityC0837o != null) {
                    LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(abstractActivityC0837o);
                    f fVar = I.f10809a;
                    t0VarM = AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new VideoUploadBridge$uploadToS3$1$1$1(activity, path, zBooleanValue, this, null), 2);
                } else {
                    t0VarM = null;
                }
                if (t0VarM != null) {
                    return;
                }
            }
            BaseBridge.handleIllegalArgument$default(this, null, 1, null);
            Unit unit = Unit.f38893a;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/video/VideoUploadBridge$VideoUploadEntry;", "", "videoUrl", "", "filePath", "(Ljava/lang/String;Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "getVideoUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class VideoUploadEntry {

        @Nullable
        private final String filePath;

        @NotNull
        private final String videoUrl;

        public VideoUploadEntry(@NotNull String videoUrl, @Nullable String str) {
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            this.videoUrl = videoUrl;
            this.filePath = str;
        }

        public static /* synthetic */ VideoUploadEntry copy$default(VideoUploadEntry videoUploadEntry, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = videoUploadEntry.videoUrl;
            }
            if ((i7 & 2) != 0) {
                str2 = videoUploadEntry.filePath;
            }
            return videoUploadEntry.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getVideoUrl() {
            return this.videoUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        @NotNull
        public final VideoUploadEntry copy(@NotNull String videoUrl, @Nullable String filePath) {
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            return new VideoUploadEntry(videoUrl, filePath);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoUploadEntry)) {
                return false;
            }
            VideoUploadEntry videoUploadEntry = (VideoUploadEntry) other;
            return Intrinsics.c(this.videoUrl, videoUploadEntry.videoUrl) && Intrinsics.c(this.filePath, videoUploadEntry.filePath);
        }

        @Nullable
        public final String getFilePath() {
            return this.filePath;
        }

        @NotNull
        public final String getVideoUrl() {
            return this.videoUrl;
        }

        public int hashCode() {
            int iHashCode = this.videoUrl.hashCode() * 31;
            String str = this.filePath;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("VideoUploadEntry(videoUrl=");
            sb2.append(this.videoUrl);
            sb2.append(", filePath=");
            return androidx.camera.video.u.p(sb2, this.filePath, ')');
        }

        public /* synthetic */ VideoUploadEntry(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i7 & 2) != 0 ? null : str2);
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable VideoUploadParam params, @Nullable IBridgeCallback callback) {
        Unit unit;
        Activity activity = getActivity();
        AbstractActivityC0837o abstractActivityC0837o = activity instanceof AbstractActivityC0837o ? (AbstractActivityC0837o) activity : null;
        if (abstractActivityC0837o != null) {
            if (params != null) {
                Integer type = params.getType();
                if (type != null && type.intValue() == 0) {
                    recordVideo(abstractActivityC0837o, params);
                } else {
                    pickVideo(abstractActivityC0837o, params);
                }
                unit = Unit.f38893a;
            } else {
                unit = null;
            }
            if (unit == null) {
                BaseBridge.handleIllegalArgument$default(this, null, 1, null);
            }
        }
    }
}
