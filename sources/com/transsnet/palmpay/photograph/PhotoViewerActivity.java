package com.transsnet.palmpay.photograph;

import V9.q;
import Yd.i;
import Zc.l;
import Zc.m;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AbstractActivityC0837o;
import com.bumptech.glide.b;
import com.github.chrisbanes.photoview.PhotoView;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoViewerActivity extends AbstractActivityC0837o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f33081c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PhotoView f33082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f33083b;

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m.pg_activity_photo_viewer);
        getWindow().setFlags(1024, 1024);
        PhotoView photoView = (PhotoView) findViewById(l.photoView);
        this.f33082a = photoView;
        photoView.setZoomable(true);
        this.f33082a.setOnPhotoTapListener(new q(this, 27));
        b.f(this.f33082a).load(getIntent().getData()).S(this.f33082a);
        ImageView imageView = (ImageView) findViewById(l.imageViewBack);
        this.f33083b = imageView;
        imageView.setVisibility(0);
        this.f33083b.setOnClickListener(new i(this, 7));
    }
}
