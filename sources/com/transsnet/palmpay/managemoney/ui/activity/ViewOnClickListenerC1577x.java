package com.transsnet.palmpay.managemoney.ui.activity;

import Pa.n0;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.File;

/* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.activity.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC1577x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InsuranceTakePhotoActivity f32272b;

    public /* synthetic */ ViewOnClickListenerC1577x(InsuranceTakePhotoActivity insuranceTakePhotoActivity, int i7) {
        this.f32271a = i7;
        this.f32272b = insuranceTakePhotoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InsuranceTakePhotoActivity insuranceTakePhotoActivity = this.f32272b;
        switch (this.f32271a) {
            case 0:
                int i7 = InsuranceTakePhotoActivity.f32109C;
                try {
                    ConstraintLayout constraintLayoutN = insuranceTakePhotoActivity.n();
                    if (constraintLayoutN != null) {
                        constraintLayoutN.setEnabled(false);
                    }
                    ProgressBar progressBarO = insuranceTakePhotoActivity.o();
                    if (progressBarO != null) {
                        progressBarO.setMax(5000);
                    }
                    Gb.L l5 = new Gb.L(insuranceTakePhotoActivity);
                    insuranceTakePhotoActivity.f32111B = l5;
                    l5.start();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    ToastUtils.showLong(e10.getMessage(), new Object[0]);
                }
                n0.g().m("InsuranceElementClick", "ScreenShot_CountdownShot", "");
                break;
            case 1:
                int i10 = InsuranceTakePhotoActivity.f32109C;
                insuranceTakePhotoActivity.r();
                n0.g().m("InsuranceElementClick", "ScreenShot_Reshoot", "");
                break;
            case 2:
                int i11 = InsuranceTakePhotoActivity.f32109C;
                insuranceTakePhotoActivity.showLoadingDialog(true);
                File file = insuranceTakePhotoActivity.f32122w;
                if (file != null) {
                    FileUploadManager.getInstance().uploadFile(file, false, new A(insuranceTakePhotoActivity));
                }
                n0.g().m("InsuranceElementClick", "ScreenShot_Comfirm", "");
                break;
            default:
                int i12 = InsuranceTakePhotoActivity.f32109C;
                insuranceTakePhotoActivity.p();
                break;
        }
    }
}
