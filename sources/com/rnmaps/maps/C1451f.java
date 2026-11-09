package com.rnmaps.maps;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: renamed from: com.rnmaps.maps.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1451f extends F2.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapMarker f24929b;

    public C1451f(MapMarker mapMarker) {
        this.f24929b = mapMarker;
    }

    @Override // F2.g, com.facebook.drawee.controller.ControllerListener
    public final void onFinalImageSet(String str, Object obj, Animatable animatable) throws Throwable {
        CloseableReference closeableReference;
        Throwable th;
        Bitmap underlyingBitmap;
        String str2;
        MapMarker mapMarker = this.f24929b;
        try {
            closeableReference = (CloseableReference) mapMarker.f24760C0.getResult();
            if (closeableReference != null) {
                try {
                    CloseableImage closeableImage = (CloseableImage) closeableReference.f();
                    if ((closeableImage instanceof CloseableStaticBitmap) && (underlyingBitmap = ((CloseableStaticBitmap) closeableImage).getUnderlyingBitmap()) != null) {
                        Bitmap bitmapCopy = underlyingBitmap.copy(Bitmap.Config.ARGB_8888, true);
                        mapMarker.f24759C = bitmapCopy;
                        mapMarker.f24757B = BitmapDescriptorFactory.fromBitmap(bitmapCopy);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mapMarker.f24760C0.close();
                    if (closeableReference != null) {
                        closeableReference.close();
                    }
                    throw th;
                }
            }
            mapMarker.f24760C0.close();
            if (closeableReference != null) {
                closeableReference.close();
            }
            MapMarkerManager mapMarkerManager = mapMarker.f24788w0;
            if (mapMarkerManager != null && (str2 = mapMarker.f24789x0) != null) {
                mapMarkerManager.getSharedIcon(str2).a(mapMarker.f24757B, mapMarker.f24759C);
            }
            mapMarker.f(true);
            mapMarker.f24790y0 = false;
            ImageManager.OnImageLoadedListener onImageLoadedListener = mapMarker.f24758B0;
            if (onImageLoadedListener != null) {
                onImageLoadedListener.onImageLoaded(null, null, false);
                mapMarker.f24758B0 = null;
            }
        } catch (Throwable th3) {
            closeableReference = null;
            th = th3;
        }
    }

    @Override // F2.g, com.facebook.drawee.controller.ControllerListener
    public final void onSubmit(String str, Object obj) {
        this.f24929b.f24790y0 = true;
    }
}
