package com.transsnet.palmpay.photograph.crop;

import Zc.l;
import Zc.m;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0837o;
import java.lang.ref.WeakReference;
import p012ad.f;

/* JADX INFO: loaded from: classes4.dex */
public class PhotoCropActivity extends AbstractActivityC0837o implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CropView f33111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f33112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f33113c;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == l.doneBtn) {
            f fVar = new f(0);
            fVar.f11897b = new WeakReference(this);
            fVar.execute(new Void[0]);
        } else if (view.getId() == l.cancelBtn) {
            finish();
        } else if (view.getId() == l.backBtn) {
            finish();
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m.activity_photo_crop);
        this.f33111a = (CropView) findViewById(l.photograph_crop_view);
        this.f33112b = (TextView) findViewById(l.doneBtn);
        this.f33113c = (TextView) findViewById(l.cancelBtn);
        this.f33112b.setOnClickListener(this);
        this.f33113c.setOnClickListener(this);
        Uri data = getIntent().getData();
        String stringExtra = getIntent().getStringExtra("filePath");
        CropView cropView = this.f33111a;
        cropView.f33104q0 = data;
        cropView.f33107t0 = stringExtra;
        cropView.f33105r0 = 1;
        cropView.f33106s0 = 1;
        cropView.f(this);
    }
}
