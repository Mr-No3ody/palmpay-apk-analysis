package com.transsnet.palmpay.managemoney.ui.activity;

import android.hardware.Camera;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLTakePhotoActivity;
import io.reactivex.internal.operators.observable.C1755g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1578y implements Camera.PictureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseMvvmActivity f32274b;

    public /* synthetic */ C1578y(BaseMvvmActivity baseMvvmActivity, int i7) {
        this.f32273a = i7;
        this.f32274b = baseMvvmActivity;
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] data, Camera camera) {
        BaseMvvmActivity baseMvvmActivity = this.f32274b;
        switch (this.f32273a) {
            case 0:
                Intrinsics.checkNotNullParameter(data, "data");
                InsuranceTakePhotoActivity insuranceTakePhotoActivity = (InsuranceTakePhotoActivity) baseMvvmActivity;
                Camera camera2 = insuranceTakePhotoActivity.f32120p;
                if (camera2 != null) {
                    camera2.stopPreview();
                }
                int i7 = InsuranceTakePhotoActivity.f32109C;
                new C1755g(new com.transsnet.adsdk.b(6, insuranceTakePhotoActivity, data), 0).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Ab.r(insuranceTakePhotoActivity, 16));
                break;
            default:
                int i10 = CLTakePhotoActivity.f29134F0;
                Intrinsics.checkNotNullParameter(data, "data");
                CLTakePhotoActivity cLTakePhotoActivity = (CLTakePhotoActivity) baseMvvmActivity;
                Camera camera3 = cLTakePhotoActivity.f29152y0;
                if (camera3 != null) {
                    camera3.stopPreview();
                }
                new C1755g(new com.transsnet.adsdk.b(14, cLTakePhotoActivity, data), 0).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new org.greenrobot.eventbus.f(cLTakePhotoActivity, 21));
                break;
        }
    }
}
