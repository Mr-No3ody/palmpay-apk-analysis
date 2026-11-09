package com.palmpay.lib.bridgewrapper.photo.upload;

import C0.G;
import V3.e;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.i;
import androidx.annotation.Keep;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.appcompat.widget.m1;
import androidx.camera.video.u;
import androidx.core.content.d;
import androidx.core.content.f;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.utils.Consts;
import com.didi.drouter.annotation.Service;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.luck.picture.lib.config.PictureMimeType;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.palmpay.lib.bridge.param.BridgeRequestParam;
import com.palmpay.lib.bridgewrapper.R;
import com.palmpay.lib.bridgewrapper.ext.UploadExtKt;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import okhttp3.U;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p177m.g;
import p177m.h;
import p177m.l;
import top.zibin.luban.OnNewCompressListener;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/photo/upload"}, function = {IBridge.class})
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002HIB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\fJ!\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ)\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0016H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b-\u0010.J#\u0010/\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b/\u00100J\u001b\u00103\u001a\u0004\u0018\u00010\u00022\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J!\u00105\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0017H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020,H\u0016¢\u0006\u0004\b:\u0010;J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b=\u0010>R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010BR\u0014\u0010F\u001a\u00020E8\u0002X\u0082D¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge$PhotoUploadParam;", "<init>", "()V", "Landroidx/appcompat/app/o;", "activity", "params", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "", "openAlbum", "(Landroidx/appcompat/app/o;Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge$PhotoUploadParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "openCamera", "actualCapture", "(Landroidx/appcompat/app/o;Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge$PhotoUploadParam;)V", "openGallery", "context", "Ljava/io/File;", "file", "compressPhoto", "(Landroidx/appcompat/app/o;Ljava/io/File;Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge$PhotoUploadParam;)V", "Landroid/content/Context;", "", "path", "getFile", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "Landroid/net/Uri;", "sourceUri", "targetPath", "copyFile", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)V", "Ljava/io/InputStream;", "is", "Ljava/io/OutputStream;", OfflineConstant.PARAM_OS, "writeFileFromInputStream", "(Ljava/io/InputStream;Ljava/io/OutputStream;)V", "Ljava/io/Closeable;", "c", "close", "(Ljava/io/Closeable;)V", "generateTmp", "(Landroid/content/Context;)Ljava/lang/String;", "", "isContent", "(Ljava/lang/String;)Z", "onHandle", "(Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge$PhotoUploadParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Lcom/google/gson/Gson;", "gson", "parseArgs", "(Lcom/google/gson/Gson;)Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge$PhotoUploadParam;", "uploadToS3", "(Ljava/lang/String;Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge$PhotoUploadParam;)V", "getAccessKey", "()Ljava/lang/String;", "getSecretKey", "isDebug", "()Z", "Lokhttp3/U;", "getOkHttpClient", "()Lokhttp3/U;", "Landroidx/activity/result/a;", "Landroid/content/Intent;", "cameraLauncher", "Landroidx/activity/result/a;", "Landroidx/activity/result/i;", "launcher", "", "BYTE_SIZE", "I", "PhotoUploadEntry", "PhotoUploadParam", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class PhotoUploadBridge extends SyncBridge<PhotoUploadParam> {
    private final int BYTE_SIZE = 1024;

    @Nullable
    private androidx.activity.result.a cameraLauncher;

    @Nullable
    private androidx.activity.result.a launcher;

    private final void actualCapture(AbstractActivityC0837o activity, PhotoUploadParam params) {
        PhotoUploadBridge photoUploadBridge;
        AbstractActivityC0837o abstractActivityC0837o;
        File file = new File(activity.getApplicationContext().getExternalCacheDir(), "pp_" + System.currentTimeMillis() + PictureMimeType.JPG);
        if (file.exists()) {
            file.delete();
        }
        if (this.cameraLauncher == null) {
            photoUploadBridge = this;
            abstractActivityC0837o = activity;
            photoUploadBridge.cameraLauncher = UploadExtKt.registerActivityResultLauncher(abstractActivityC0837o, new l(), new e(file, photoUploadBridge, abstractActivityC0837o, params, 2));
        } else {
            photoUploadBridge = this;
            abstractActivityC0837o = activity;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri.fromFile(file);
        Uri uriForFile = f.getUriForFile(abstractActivityC0837o, abstractActivityC0837o.getPackageName() + ".luckProvider", file);
        intent.setFlags(3);
        intent.putExtra("output", uriForFile);
        androidx.activity.result.a aVar = photoUploadBridge.cameraLauncher;
        if (aVar != null) {
            aVar.a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: actualCapture$lambda-5, reason: not valid java name */
    public static final void m112actualCapture$lambda5(File file, PhotoUploadBridge this$0, AbstractActivityC0837o activity, PhotoUploadParam photoUploadParam, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        int i7 = activityResult.f12042a;
        if (i7 == -1) {
            if (file.exists()) {
                this$0.compressPhoto(activity, file, photoUploadParam);
            } else {
                this$0.handleFail(new Throwable("capture fail"));
            }
        } else if (i7 == 0) {
            BaseBridge.handleCancel$default(this$0, null, 1, null);
        } else {
            this$0.handleFail(new Throwable("fail"));
        }
        androidx.activity.result.a aVar = this$0.cameraLauncher;
        if (aVar != null) {
            aVar.b();
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

    private final void compressPhoto(AbstractActivityC0837o context, final File file, final PhotoUploadParam params) {
        m1 m1VarC = ph.e.c(context);
        m1VarC.c(0, file);
        m1VarC.f12976f = new a(2);
        m1VarC.f12973c = new a(3);
        m1VarC.f12975e = new OnNewCompressListener() { // from class: com.palmpay.lib.bridgewrapper.photo.upload.PhotoUploadBridge.compressPhoto.3
            @Override // top.zibin.luban.OnNewCompressListener
            public void onError(@Nullable String source, @Nullable Throwable e10) {
                this.handleFail(e10);
            }

            @Override // top.zibin.luban.OnNewCompressListener
            public void onStart() {
            }

            @Override // top.zibin.luban.OnNewCompressListener
            public void onSuccess(@Nullable String source, @Nullable File compressFile) {
                Unit unit;
                String absolutePath;
                if (compressFile == null || (absolutePath = compressFile.getAbsolutePath()) == null) {
                    unit = null;
                } else {
                    File file2 = file;
                    PhotoUploadBridge photoUploadBridge = this;
                    PhotoUploadParam photoUploadParam = params;
                    if (!Intrinsics.c(compressFile.getAbsolutePath(), file2.getAbsolutePath()) && file2.exists()) {
                        file2.delete();
                    }
                    photoUploadBridge.uploadToS3(absolutePath, photoUploadParam);
                    unit = Unit.f38893a;
                }
                if (unit == null) {
                    this.handleFail(new Throwable("fail"));
                }
            }
        };
        m1VarC.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: compressPhoto$lambda-10, reason: not valid java name */
    public static final String m113compressPhoto$lambda10(String filePath) {
        String strSubstring;
        Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
        int iG = StringsKt.G(filePath, 6, Consts.DOT);
        if (iG != -1) {
            strSubstring = filePath.substring(iG);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        } else {
            strSubstring = PictureMimeType.JPG;
        }
        StringBuilder sb2 = new StringBuilder("CMP_");
        sb2.append(System.currentTimeMillis());
        sb2.append('_');
        return G.n((int) (Math.random() * ((double) 1000)), strSubstring, sb2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: compressPhoto$lambda-9, reason: not valid java name */
    public static final boolean m114compressPhoto$lambda9(String str) {
        return PictureMimeType.isUrlHasImage(str) && !PictureMimeType.isHasHttp(str);
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

    private final void openAlbum(AbstractActivityC0837o activity, PhotoUploadParam params, IBridgeCallback callback) {
        Unit unit;
        if (params != null) {
            Integer type = params.getType();
            if (type != null && type.intValue() == 0) {
                openCamera(activity, params, callback);
            } else {
                openGallery(activity, params);
            }
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            BaseBridge.handleIllegalArgument$default(this, null, 1, null);
        }
    }

    private final void openCamera(AbstractActivityC0837o activity, PhotoUploadParam params, IBridgeCallback callback) {
        if (activity == null) {
            activity = null;
        }
        if (activity != null) {
            if (d.a(activity, "android.permission.CAMERA") == 0) {
                actualCapture(activity, params);
            } else {
                p140j8.f.n(activity).e("android.permission.CAMERA").e(new defpackage.a(this, 15, activity, params));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: openCamera$lambda-4$lambda-3, reason: not valid java name */
    public static final void m115openCamera$lambda4$lambda3(PhotoUploadBridge this$0, AbstractActivityC0837o it, PhotoUploadParam photoUploadParam, boolean z3, List list, List list2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(list, "<anonymous parameter 1>");
        Intrinsics.checkNotNullParameter(list2, "<anonymous parameter 2>");
        if (z3) {
            this$0.actualCapture(it, photoUploadParam);
        } else {
            this$0.handleReject(it.getString(R.string.apply_permission_tips));
        }
    }

    private final void openGallery(AbstractActivityC0837o activity, PhotoUploadParam params) {
        if (this.launcher == null) {
            this.launcher = UploadExtKt.registerActivityResultLauncher(activity, new h(), new com.palmpay.lib.bridgewrapper.video.a(this, activity, params, 2));
        }
        androidx.activity.result.a aVar = this.launcher;
        if (aVar != null) {
            g mediaType = g.f39407a;
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            i iVar = new i();
            iVar.f12068a = p177m.f.f39406a;
            Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
            iVar.f12068a = mediaType;
            aVar.a(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: openGallery$lambda-8, reason: not valid java name */
    public static final void m116openGallery$lambda8(PhotoUploadBridge this$0, AbstractActivityC0837o activity, PhotoUploadParam photoUploadParam, Uri uri) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Objects.toString(uri);
        if (uri != null) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
            this$0.compressPhoto(activity, this$0.getFile(activity, string), photoUploadParam);
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            BaseBridge.handleCancel$default(this$0, null, 1, null);
        }
        androidx.activity.result.a aVar = this$0.launcher;
        if (aVar != null) {
            aVar.b();
        }
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

    public void uploadToS3(@NotNull String path, @Nullable PhotoUploadParam params) {
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
                    p042cg.f fVar = I.f10809a;
                    t0VarM = AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new PhotoUploadBridge$uploadToS3$1$1$1(this, activity, path, zBooleanValue, null), 2);
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge$PhotoUploadEntry;", "", "photoUrl", "", "filePath", "(Ljava/lang/String;Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "getPhotoUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class PhotoUploadEntry {

        @Nullable
        private final String filePath;

        @NotNull
        private final String photoUrl;

        public PhotoUploadEntry(@NotNull String photoUrl, @Nullable String str) {
            Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
            this.photoUrl = photoUrl;
            this.filePath = str;
        }

        public static /* synthetic */ PhotoUploadEntry copy$default(PhotoUploadEntry photoUploadEntry, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = photoUploadEntry.photoUrl;
            }
            if ((i7 & 2) != 0) {
                str2 = photoUploadEntry.filePath;
            }
            return photoUploadEntry.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPhotoUrl() {
            return this.photoUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        @NotNull
        public final PhotoUploadEntry copy(@NotNull String photoUrl, @Nullable String filePath) {
            Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
            return new PhotoUploadEntry(photoUrl, filePath);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoUploadEntry)) {
                return false;
            }
            PhotoUploadEntry photoUploadEntry = (PhotoUploadEntry) other;
            return Intrinsics.c(this.photoUrl, photoUploadEntry.photoUrl) && Intrinsics.c(this.filePath, photoUploadEntry.filePath);
        }

        @Nullable
        public final String getFilePath() {
            return this.filePath;
        }

        @NotNull
        public final String getPhotoUrl() {
            return this.photoUrl;
        }

        public int hashCode() {
            int iHashCode = this.photoUrl.hashCode() * 31;
            String str = this.filePath;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PhotoUploadEntry(photoUrl=");
            sb2.append(this.photoUrl);
            sb2.append(", filePath=");
            return u.p(sb2, this.filePath, ')');
        }

        public /* synthetic */ PhotoUploadEntry(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i7 & 2) != 0 ? null : str2);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000e\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge$PhotoUploadParam;", "", "type", "", "private", "", "number", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrivate", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/palmpay/lib/bridgewrapper/photo/upload/PhotoUploadBridge$PhotoUploadParam;", "equals", "other", "hashCode", "toString", "", "lib_bridgeWrapper_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class PhotoUploadParam {

        @Nullable
        private final Integer number;

        @Nullable
        private final Boolean private;

        @Nullable
        private final Integer type;

        public PhotoUploadParam(@Nullable Integer num, @Nullable Boolean bool, @Nullable Integer num2) {
            this.type = num;
            this.private = bool;
            this.number = num2;
        }

        public static /* synthetic */ PhotoUploadParam copy$default(PhotoUploadParam photoUploadParam, Integer num, Boolean bool, Integer num2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                num = photoUploadParam.type;
            }
            if ((i7 & 2) != 0) {
                bool = photoUploadParam.private;
            }
            if ((i7 & 4) != 0) {
                num2 = photoUploadParam.number;
            }
            return photoUploadParam.copy(num, bool, num2);
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

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getNumber() {
            return this.number;
        }

        @NotNull
        public final PhotoUploadParam copy(@Nullable Integer type, @Nullable Boolean bool, @Nullable Integer number) {
            return new PhotoUploadParam(type, bool, number);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PhotoUploadParam)) {
                return false;
            }
            PhotoUploadParam photoUploadParam = (PhotoUploadParam) other;
            return Intrinsics.c(this.type, photoUploadParam.type) && Intrinsics.c(this.private, photoUploadParam.private) && Intrinsics.c(this.number, photoUploadParam.number);
        }

        @Nullable
        public final Integer getNumber() {
            return this.number;
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
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num2 = this.number;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PhotoUploadParam(type=" + this.type + ", private=" + this.private + ", number=" + this.number + ')';
        }

        public /* synthetic */ PhotoUploadParam(Integer num, Boolean bool, Integer num2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, bool, (i7 & 4) != 0 ? 2 : num2);
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable PhotoUploadParam params, @Nullable IBridgeCallback callback) {
        Activity activity = getActivity();
        AbstractActivityC0837o abstractActivityC0837o = activity instanceof AbstractActivityC0837o ? (AbstractActivityC0837o) activity : null;
        if (abstractActivityC0837o != null) {
            openAlbum(abstractActivityC0837o, params, callback);
        }
    }

    @Override // com.palmpay.lib.bridge.BaseBridge
    @Nullable
    public PhotoUploadParam parseArgs(@Nullable Gson gson) {
        if (gson == null) {
            return null;
        }
        BridgeRequestParam request = getRequest();
        return (PhotoUploadParam) gson.fromJson((JsonElement) (request != null ? request.getArgs() : null), PhotoUploadParam.class);
    }
}
