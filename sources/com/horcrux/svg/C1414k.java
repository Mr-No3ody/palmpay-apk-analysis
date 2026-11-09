package com.horcrux.svg;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.image.CloseableBitmap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.horcrux.svg.events.SvgLoadEvent;

/* JADX INFO: renamed from: com.horcrux.svg.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1414k extends p360y2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f23528a;

    public C1414k(ImageView imageView) {
        this.f23528a = imageView;
    }

    public final void a(Bitmap bitmap) {
        ImageView imageView = this.f23528a;
        UIManagerHelper.getEventDispatcherForReactTag(imageView.mContext, imageView.getId()).dispatchEvent(new SvgLoadEvent(UIManagerHelper.getSurfaceId(imageView), imageView.getId(), imageView.mContext, imageView.f23313e, bitmap.getWidth(), bitmap.getHeight()));
        imageView.f23318o.set(false);
        SvgView svgView = imageView.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
    }

    @Override // p360y2.c
    public final void onFailureImpl(DataSource dataSource) {
        this.f23528a.f23318o.set(false);
        p229p2.a.y(dataSource.getFailureCause(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
    }

    @Override // p360y2.c
    public final void onNewResultImpl(DataSource dataSource) {
        if (dataSource.isFinished()) {
            CloseableReference closeableReference = (CloseableReference) dataSource.getResult();
            try {
                a((closeableReference == null || !(closeableReference.f() instanceof CloseableBitmap)) ? null : ((CloseableBitmap) closeableReference.f()).getUnderlyingBitmap());
            } finally {
                CloseableReference.d(closeableReference);
            }
        }
    }
}
