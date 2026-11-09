package com.rnmaps.maps;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.GoogleMap;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements GoogleMap.SnapshotReadyCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f24995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout f24996b;

    public y(ImageView imageView, RelativeLayout relativeLayout) {
        this.f24995a = imageView;
        this.f24996b = relativeLayout;
    }

    @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
    public final void onSnapshotReady(Bitmap bitmap) {
        ImageView imageView = this.f24995a;
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
        this.f24996b.setVisibility(4);
    }
}
