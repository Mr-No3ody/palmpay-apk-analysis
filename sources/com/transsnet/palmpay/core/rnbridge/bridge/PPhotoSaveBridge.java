package com.transsnet.palmpay.core.rnbridge.bridge;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridgewrapper.photo.PhotoSaveBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Service(alias = {"/photo/save"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/core/rnbridge/bridge/PPhotoSaveBridge;", "Lcom/palmpay/lib/bridgewrapper/photo/PhotoSaveBridge;", "<init>", "()V", "loadImage", "", "context", "Landroid/content/Context;", "url", "", "cb", "Lcom/palmpay/lib/bridgewrapper/photo/PhotoSaveBridge$ILoaderImage;", "drawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PPhotoSaveBridge extends PhotoSaveBridge {
    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap drawableToBitmap(Drawable drawable) {
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : -1;
        int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : -1;
        if (intrinsicWidth < 1 || intrinsicHeight < 1) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, (drawable == null || drawable.getOpacity() != -1) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (drawable != null) {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        return bitmapCreateBitmap;
    }

    @Override // com.palmpay.lib.bridgewrapper.photo.PhotoSaveBridge
    public void loadImage(@Nullable Context context, @NotNull String url, @Nullable final PhotoSaveBridge.ILoaderImage cb2) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (context != null) {
            b.c(context).c(context).load(url).U(new RequestListener<Drawable>() { // from class: com.transsnet.palmpay.core.rnbridge.bridge.PPhotoSaveBridge$loadImage$1$1
                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(u e10, Object model, Target<Drawable> target, boolean isFirstResource) {
                    Intrinsics.checkNotNullParameter(target, "target");
                    PhotoSaveBridge.ILoaderImage iLoaderImage = cb2;
                    if (iLoaderImage == null) {
                        return true;
                    }
                    iLoaderImage.onResult(null);
                    return true;
                }

                @Override // com.bumptech.glide.request.RequestListener
                public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, com.bumptech.glide.load.a dataSource, boolean isFirstResource) {
                    Intrinsics.checkNotNullParameter(resource, "resource");
                    Intrinsics.checkNotNullParameter(model, "model");
                    Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                    PhotoSaveBridge.ILoaderImage iLoaderImage = cb2;
                    if (iLoaderImage == null) {
                        return true;
                    }
                    iLoaderImage.onResult(this.drawableToBitmap(resource));
                    return true;
                }
            }).f0(Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }
}
