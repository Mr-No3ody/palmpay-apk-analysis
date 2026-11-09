package com.transsnet.palmpay.managemoney.ui.activity;

import android.content.Intent;
import android.text.TextUtils;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import java.io.File;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements FileUploadManager.UploadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InsuranceTakePhotoActivity f32014a;

    public A(InsuranceTakePhotoActivity insuranceTakePhotoActivity) {
        this.f32014a = insuranceTakePhotoActivity;
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onComplete(String str, File file) {
        InsuranceTakePhotoActivity insuranceTakePhotoActivity = this.f32014a;
        insuranceTakePhotoActivity.showLoadingDialog(false);
        F6.d.h("take_photo", 3, str == null ? "no path" : str);
        if (TextUtils.isEmpty(str)) {
            insuranceTakePhotoActivity.runOnUiThread(new z(insuranceTakePhotoActivity, 1));
            return;
        }
        int i7 = InsuranceTakePhotoActivity.f32109C;
        try {
            Intent intent = new Intent();
            intent.putExtra("result", str);
            insuranceTakePhotoActivity.setResult(-1, intent);
            insuranceTakePhotoActivity.finish();
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onError(Exception exc) {
        InsuranceTakePhotoActivity insuranceTakePhotoActivity = this.f32014a;
        insuranceTakePhotoActivity.runOnUiThread(new z(insuranceTakePhotoActivity, 0));
        if (exc != null) {
            exc.printStackTrace();
        }
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onProgressChanged(long j6, long j10) {
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onStartSync(String str, File file) {
    }
}
