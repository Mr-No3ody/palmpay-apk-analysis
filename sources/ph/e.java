package ph;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.m1;
import androidx.camera.camera2.internal.F;
import com.alibaba.android.arouter.utils.Consts;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.File;
import java.util.ArrayList;
import p137j3.q;
import top.zibin.luban.CompressionPredicate;
import top.zibin.luban.InputStreamProvider;
import top.zibin.luban.OnCompressListener;
import top.zibin.luban.OnNewCompressListener;
import top.zibin.luban.OnRenameListener;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OnRenameListener f41326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnCompressListener f41327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnNewCompressListener f41328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CompressionPredicate f41329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Handler f41330g;

    public static File b(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            File file = new File(externalCacheDir, "luban_disk_cache");
            if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                return file;
            }
        } else if (Log.isLoggable("Luban", 6)) {
            Log.e("Luban", "default disk cache dir is null");
        }
        return null;
    }

    public static m1 c(Context context) {
        m1 m1Var = new m1();
        m1Var.f12971a = context;
        m1Var.f12977g = new ArrayList();
        return m1Var;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0187  */
    public final File a(Context context, InputStreamProvider inputStreamProvider) {
        String strReplace;
        String path;
        String str = PictureMimeType.JPG;
        a aVar = a.SINGLE;
        Uri uri = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamProvider.open(), null, options);
            strReplace = options.outMimeType.replace("image/", Consts.DOT);
        } catch (Exception unused) {
            strReplace = PictureMimeType.JPG;
        }
        if (TextUtils.isEmpty(this.f41324a)) {
            this.f41324a = b(context).getAbsolutePath();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f41324a);
        sb2.append("/");
        sb2.append(System.currentTimeMillis());
        sb2.append((int) (Math.random() * 1000.0d));
        if (!TextUtils.isEmpty(strReplace)) {
            str = strReplace;
        }
        sb2.append(str);
        File file = new File(sb2.toString());
        String path2 = inputStreamProvider.getPath();
        if (TextUtils.isEmpty(path2) ? false : path2.startsWith("content://")) {
            Uri uri2 = Uri.parse(inputStreamProvider.getPath());
            Context applicationContext = context.getApplicationContext();
            int i7 = Build.VERSION.SDK_INT;
            if (DocumentsContract.isDocumentUri(applicationContext, uri2)) {
                if ("com.android.externalstorage.documents".equals(uri2.getAuthority())) {
                    String[] strArrSplit = DocumentsContract.getDocumentId(uri2).split(":");
                    if (!"primary".equalsIgnoreCase(strArrSplit[0])) {
                        path = "";
                    } else if (i7 >= 29) {
                        path = applicationContext.getExternalFilesDir(Environment.DIRECTORY_PICTURES) + "/" + strArrSplit[1];
                    } else {
                        path = Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
                    }
                } else if ("com.android.providers.downloads.documents".equals(uri2.getAuthority())) {
                    path = com.facebook.imagepipeline.nativecode.b.q(applicationContext, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(DocumentsContract.getDocumentId(uri2))), null, null);
                } else if ("com.android.providers.media.documents".equals(uri2.getAuthority())) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri2).split(":");
                    String str2 = strArrSplit2[0];
                    if ("image".equals(str2)) {
                        uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str2)) {
                        uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if (PictureMimeType.MIME_TYPE_PREFIX_AUDIO.equals(str2)) {
                        uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    path = com.facebook.imagepipeline.nativecode.b.q(applicationContext, uri, "_id=?", new String[]{strArrSplit2[1]});
                } else {
                    path = "";
                }
            } else if (FirebaseAnalytics.Param.CONTENT.equalsIgnoreCase(uri2.getScheme())) {
                path = "com.google.android.apps.photos.content".equals(uri2.getAuthority()) ? uri2.getLastPathSegment() : com.facebook.imagepipeline.nativecode.b.q(applicationContext, uri2, null, null);
            } else if ("file".equalsIgnoreCase(uri2.getScheme())) {
                path = uri2.getPath();
            } else {
                path = "";
            }
        } else {
            path = inputStreamProvider.getPath();
        }
        OnRenameListener onRenameListener = this.f41326c;
        if (onRenameListener != null) {
            String strRename = onRenameListener.rename(path);
            if (TextUtils.isEmpty(this.f41324a)) {
                this.f41324a = b(context).getAbsolutePath();
            }
            file = new File(F.d(new StringBuilder(), this.f41324a, "/", strRename));
        }
        int i10 = this.f41325b;
        CompressionPredicate compressionPredicate = this.f41329f;
        if (compressionPredicate == null) {
            a aVar2 = a.SINGLE;
            return a.a(i10, path) ? new q(inputStreamProvider, file).a() : new File(path);
        }
        if (compressionPredicate.apply(path)) {
            a aVar3 = a.SINGLE;
            if (a.a(i10, path)) {
                return new q(inputStreamProvider, file).a();
            }
        }
        return new File(path);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        OnNewCompressListener onNewCompressListener = this.f41328e;
        OnCompressListener onCompressListener = this.f41327d;
        if (i7 == 0) {
            if (onCompressListener != null) {
                onCompressListener.onSuccess(message.arg1, (File) message.obj);
            }
            if (onNewCompressListener == null) {
                return false;
            }
            onNewCompressListener.onSuccess(message.getData().getString("source"), (File) message.obj);
            return false;
        }
        if (i7 == 1) {
            if (onCompressListener != null) {
                onCompressListener.onStart();
            }
            if (onNewCompressListener == null) {
                return false;
            }
            onNewCompressListener.onStart();
            return false;
        }
        if (i7 != 2) {
            return false;
        }
        if (onCompressListener != null) {
            onCompressListener.onError(message.arg1, (Throwable) message.obj);
        }
        if (onNewCompressListener == null) {
            return false;
        }
        onNewCompressListener.onError(message.getData().getString("source"), (Throwable) message.obj);
        return false;
    }
}
