package com.rnmaps.maps;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableBitmap;
import com.facebook.imagepipeline.image.CloseableImage;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends p360y2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapOverlay f24969a;

    public q(MapOverlay mapOverlay) {
        this.f24969a = mapOverlay;
    }

    @Override // p360y2.c
    public final void onFailureImpl(DataSource dataSource) {
    }

    @Override // p360y2.c
    public final void onNewResultImpl(DataSource dataSource) {
        CloseableReference closeableReference;
        Bitmap underlyingBitmap;
        if (dataSource.isFinished() && (closeableReference = (CloseableReference) dataSource.getResult()) != null) {
            try {
                CloseableImage closeableImage = (CloseableImage) closeableReference.f();
                if ((closeableImage instanceof CloseableBitmap) && (underlyingBitmap = ((CloseableBitmap) closeableImage).getUnderlyingBitmap()) != null) {
                    this.f24969a.f24796e = BitmapDescriptorFactory.fromBitmap(underlyingBitmap);
                }
                closeableReference.close();
                new Handler(Looper.getMainLooper()).post(new p024b9.g(this, 27));
            } catch (Throwable th) {
                closeableReference.close();
                throw th;
            }
        }
    }
}
