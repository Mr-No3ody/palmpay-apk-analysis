package com.rnmaps.maps;

import android.os.Handler;
import com.facebook.drawee.view.DraweeView;
import com.facebook.fresco.ui.common.ControllerListener2;

/* JADX INFO: renamed from: com.rnmaps.maps.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1454i implements ControllerListener2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f24933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DraweeView f24934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MapMarker f24935c;

    public C1454i(MapMarker mapMarker, Handler handler, DraweeView draweeView) {
        this.f24935c = mapMarker;
        this.f24933a = handler;
        this.f24934b = draweeView;
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public final void onEmptyEvent(Object obj) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public final void onFinalImageSet(String str, Object obj, S2.d dVar) {
        this.f24933a.postDelayed(new RunnableC1453h(this, 0), ((I2.a) this.f24934b.getHierarchy()).f3969e.t);
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public final void onIntermediateImageFailed(String str) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public final void onIntermediateImageSet(String str, Object obj) {
        this.f24933a.post(new RunnableC1453h(this, 1));
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public final void onRelease(String str, S2.d dVar) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public final void onFailure(String str, Throwable th, S2.d dVar) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public final void onSubmit(String str, Object obj, S2.d dVar) {
    }
}
