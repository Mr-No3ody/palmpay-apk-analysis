package com.palmpay.image.webp;

import V7.g;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes3.dex */
public class WebpGLView extends XGLTextureView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public a f23730A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Animatable f23731v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public J2.b f23732w;

    public WebpGLView(Context context) {
        super(context);
        c();
    }

    public final void c() {
        setEGLContextClientVersion(2);
        setPreserveEGLContextOnPause(true);
        setEGLConfigChooser(new p063e6.b(this, 8, 16));
        setOpaque(false);
        a aVar = new a(getContext());
        this.f23730A = aVar;
        setRenderer(aVar);
        setRenderMode(0);
        J2.b bVar = new J2.b(new I2.b(getResources()).a());
        this.f23732w = bVar;
        bVar.c().setCallback(this);
    }

    public J2.b getDraweeHolder() {
        return this.f23732w;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f23730A.f23758l = drawable;
        f fVar = this.f23734b;
        fVar.getClass();
        g gVar = XGLTextureView.t;
        synchronized (gVar) {
            fVar.t = true;
            gVar.notifyAll();
        }
    }

    @Override // com.palmpay.image.webp.XGLTextureView, android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23732w.e();
    }

    @Override // com.palmpay.image.webp.XGLTextureView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23732w.f();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.f23732w.e();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f23732w.f();
    }

    public void setImageUri(String str) {
        Uri uri = Uri.parse(str);
        C2.b bVar = p118hf.a.f37380c.get();
        bVar.d(uri);
        bVar.f2564e = true;
        bVar.f2565f = this.f23732w.f4487e;
        bVar.f2563d = new p063e6.a(this);
        this.f23732w.g(bVar.build());
    }

    @Override // com.palmpay.image.webp.XGLTextureView
    public void setRenderer(XGLTextureView.Renderer renderer) {
        super.setRenderer(renderer);
        this.f23730A = (a) renderer;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f23732w.c()) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }

    public WebpGLView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }
}
