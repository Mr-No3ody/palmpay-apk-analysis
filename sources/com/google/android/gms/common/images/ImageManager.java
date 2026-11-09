package com.google.android.gms.common.images;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.internal.base.zaj;
import com.google.android.gms.internal.base.zan;
import com.google.android.gms.internal.base.zao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageManager {
    private static final Object zaa = new Object();
    private static final HashSet zab = new HashSet();
    private static ImageManager zac;
    private final Context zad;
    private final Handler zae = new zao(Looper.getMainLooper());
    private final ExecutorService zaf = zan.zaa().zaa(4, 2);
    private final zaj zag = new zaj();
    private final Map zah = new HashMap();
    private final Map zai = new HashMap();
    private final Map zaj = new HashMap();

    @KeepName
    public final class ImageReceiver extends ResultReceiver {
        final /* synthetic */ ImageManager zaa;
        private final Uri zab;
        private final ArrayList zac;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageReceiver(ImageManager imageManager, Uri uri) {
            super(new zao(Looper.getMainLooper()));
            Objects.requireNonNull(imageManager);
            this.zaa = imageManager;
            this.zab = uri;
            this.zac = new ArrayList();
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i7, Bundle bundle) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
            AssetFileDescriptor assetFileDescriptor = parcelFileDescriptor != null ? new AssetFileDescriptor(parcelFileDescriptor, bundle.getLong("assetFdStartOffset", 0L), bundle.getLong("assetFdLength", -1L)) : null;
            ImageManager imageManager = this.zaa;
            imageManager.zaf().execute(new zaa(imageManager, this.zab, assetFileDescriptor));
        }

        public final void zaa(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zac.add(zagVar);
        }

        public final void zab(zag zagVar) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zac.remove(zagVar);
        }

        public final void zac() {
            Intent intent = new Intent(Constants.ACTION_LOAD_IMAGE);
            intent.setPackage("com.google.android.gms");
            intent.putExtra(Constants.EXTRA_URI, this.zab);
            intent.putExtra(Constants.EXTRA_RESULT_RECEIVER, this);
            intent.putExtra(Constants.EXTRA_PRIORITY, 3);
            int i7 = Build.VERSION.SDK_INT;
            Context contextZad = this.zaa.zad();
            if (i7 < 34) {
                contextZad.sendBroadcast(intent);
            } else {
                contextZad.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        }

        public final /* synthetic */ ArrayList zad() {
            return this.zac;
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(@NonNull Uri uri, @Nullable Drawable drawable, boolean z3);
    }

    private ImageManager(Context context, boolean z3) {
        this.zad = context.getApplicationContext();
    }

    @NonNull
    public static ImageManager create(@NonNull Context context) {
        if (zac == null) {
            zac = new ImageManager(context, false);
        }
        return zac;
    }

    public void loadImage(@NonNull ImageView imageView, int i7) {
        zaa(new zae(imageView, i7));
    }

    public final void zaa(zag zagVar) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zab(this, zagVar).run();
    }

    public final /* synthetic */ Context zad() {
        return this.zad;
    }

    public final /* synthetic */ Handler zae() {
        return this.zae;
    }

    public final /* synthetic */ ExecutorService zaf() {
        return this.zaf;
    }

    public final /* synthetic */ zaj zag() {
        return this.zag;
    }

    public final /* synthetic */ Map zah() {
        return this.zah;
    }

    public final /* synthetic */ Map zai() {
        return this.zai;
    }

    public final /* synthetic */ Map zaj() {
        return this.zaj;
    }

    public void loadImage(@NonNull ImageView imageView, @NonNull Uri uri) {
        zaa(new zae(imageView, uri));
    }

    public void loadImage(@NonNull ImageView imageView, @NonNull Uri uri, int i7) {
        zae zaeVar = new zae(imageView, uri);
        zaeVar.zab = i7;
        zaa(zaeVar);
    }

    public void loadImage(@NonNull OnImageLoadedListener onImageLoadedListener, @NonNull Uri uri) {
        zaa(new zaf(onImageLoadedListener, uri));
    }

    public void loadImage(@NonNull OnImageLoadedListener onImageLoadedListener, @NonNull Uri uri, int i7) {
        zaf zafVar = new zaf(onImageLoadedListener, uri);
        zafVar.zab = i7;
        zaa(zafVar);
    }
}
