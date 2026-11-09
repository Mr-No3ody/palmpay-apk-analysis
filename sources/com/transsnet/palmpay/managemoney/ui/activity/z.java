package com.transsnet.palmpay.managemoney.ui.activity;

import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InsuranceTakePhotoActivity f32276b;

    public /* synthetic */ z(InsuranceTakePhotoActivity insuranceTakePhotoActivity, int i7) {
        this.f32275a = i7;
        this.f32276b = insuranceTakePhotoActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32275a) {
            case 0:
                InsuranceTakePhotoActivity.m(this.f32276b);
                ToastUtils.showShort("upload images failed, please try again", new Object[0]);
                break;
            default:
                InsuranceTakePhotoActivity.m(this.f32276b);
                ToastUtils.showShort("upload images failed, please try again", new Object[0]);
                break;
        }
    }
}
