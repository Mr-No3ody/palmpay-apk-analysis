package com.transsnet.palmpay.contacts.ui.activity;

import L6.b;
import R9.d;
import R9.e;
import R9.f;
import S6.a;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.luck.picture.lib.permissions.PermissionConfig;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IView;
import com.transsnet.palmpay.contacts.ui.activity.PersonalQRCodeActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.ToastUtils;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/contact/personal_qrcode")
public class PersonalQRCodeActivity extends i implements PersonalQRCodeContract$IView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f27251g = {PermissionConfig.WRITE_EXTERNAL_STORAGE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f27252i = {PermissionConfig.READ_MEDIA_IMAGES};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f27253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f27254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f27255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f27256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PpTitleBar f27257f;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.ct_personal_info_qrcode_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Z4.e.t(this, BaseApplication.getInstance().getUser().getAvatar(), this.f27254c);
        String firstName = BaseApplication.getInstance().getUser().getFirstName();
        if (TextUtils.isEmpty(firstName)) {
            this.f27255d.setText(getString(k.core_personal_qr_code));
        } else {
            this.f27255d.setText(getString(f.ct_personal_qr_code_name_format, firstName));
        }
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new U9.f();
    }

    public final void m(View view) {
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(1048576);
        view.setDrawingCacheBackgroundColor(-1);
        int width = view.getWidth();
        int height = view.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        view.layout(0, 0, width, height);
        view.draw(canvas);
        ((U9.f) this.f27350a).savePicture(bitmapCreateBitmap);
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = 1;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (iArr.length <= 0) {
            return;
        }
        for (int i10 : iArr) {
            if (i10 != 0) {
                return;
            }
        }
        if (i7 == 10) {
            m(this.f27253b);
        }
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        showLoadingDialog(true);
        ((U9.f) this.f27350a).getPersonalQRCodeInfo();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f27253b = findViewById(d.personal_qrcode_view);
        this.f27254c = (ImageView) findViewById(d.personal_avatar);
        this.f27255d = (TextView) findViewById(d.personal_name);
        this.f27256e = (ImageView) findViewById(d.personal_qrcode_iv);
        try {
            final int i7 = 2;
            findViewById(d.save_bt).setOnClickListener(new View.OnClickListener(this) { // from class: V9.G

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PersonalQRCodeActivity f10184b;

                {
                    this.f10184b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PersonalQRCodeActivity personalQRCodeActivity = this.f10184b;
                    switch (i7) {
                        case 0:
                            String[] strArr = PersonalQRCodeActivity.f27251g;
                            personalQRCodeActivity.finish();
                            break;
                        case 1:
                            String[] strArr2 = PersonalQRCodeActivity.f27251g;
                            personalQRCodeActivity.getClass();
                            ARouter.getInstance().build("/qrcode/scan").navigation(personalQRCodeActivity);
                            break;
                        default:
                            String[] strArr3 = PersonalQRCodeActivity.f27251g;
                            personalQRCodeActivity.getClass();
                            if (view.getId() == R9.d.save_bt) {
                                String[] strArr4 = PersonalQRCodeActivity.f27251g;
                                if (Build.VERSION.SDK_INT >= 33) {
                                    strArr4 = PersonalQRCodeActivity.f27252i;
                                }
                                if (!PermissionUtils.isGranted(strArr4)) {
                                    personalQRCodeActivity.requestPermissions(strArr4, 10);
                                } else {
                                    personalQRCodeActivity.m(personalQRCodeActivity.f27253b);
                                }
                            }
                            break;
                    }
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        Window window = getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        PpTitleBar ppTitleBar = (PpTitleBar) findViewById(d.titleBar);
        this.f27257f = ppTitleBar;
        final int i10 = 0;
        ppTitleBar.setBackButtonClickListener(new View.OnClickListener(this) { // from class: V9.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalQRCodeActivity f10184b;

            {
                this.f10184b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalQRCodeActivity personalQRCodeActivity = this.f10184b;
                switch (i10) {
                    case 0:
                        String[] strArr = PersonalQRCodeActivity.f27251g;
                        personalQRCodeActivity.finish();
                        break;
                    case 1:
                        String[] strArr2 = PersonalQRCodeActivity.f27251g;
                        personalQRCodeActivity.getClass();
                        ARouter.getInstance().build("/qrcode/scan").navigation(personalQRCodeActivity);
                        break;
                    default:
                        String[] strArr3 = PersonalQRCodeActivity.f27251g;
                        personalQRCodeActivity.getClass();
                        if (view.getId() == R9.d.save_bt) {
                            String[] strArr4 = PersonalQRCodeActivity.f27251g;
                            if (Build.VERSION.SDK_INT >= 33) {
                                strArr4 = PersonalQRCodeActivity.f27252i;
                            }
                            if (!PermissionUtils.isGranted(strArr4)) {
                                personalQRCodeActivity.requestPermissions(strArr4, 10);
                            } else {
                                personalQRCodeActivity.m(personalQRCodeActivity.f27253b);
                            }
                        }
                        break;
                }
            }
        });
        int color = getColor(b.ppColorTextBase);
        this.f27257f.c(a.pay_ArrowLeft, color);
        this.f27257f.getRightImageView1().setImageDrawable(G8.a.w(this, a.pay_Scan, Integer.valueOf(color), null, 24.0f, 0.0f));
        final int i11 = 1;
        this.f27257f.setRightImageView1ClickListener(new View.OnClickListener(this) { // from class: V9.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalQRCodeActivity f10184b;

            {
                this.f10184b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonalQRCodeActivity personalQRCodeActivity = this.f10184b;
                switch (i11) {
                    case 0:
                        String[] strArr = PersonalQRCodeActivity.f27251g;
                        personalQRCodeActivity.finish();
                        break;
                    case 1:
                        String[] strArr2 = PersonalQRCodeActivity.f27251g;
                        personalQRCodeActivity.getClass();
                        ARouter.getInstance().build("/qrcode/scan").navigation(personalQRCodeActivity);
                        break;
                    default:
                        String[] strArr3 = PersonalQRCodeActivity.f27251g;
                        personalQRCodeActivity.getClass();
                        if (view.getId() == R9.d.save_bt) {
                            String[] strArr4 = PersonalQRCodeActivity.f27251g;
                            if (Build.VERSION.SDK_INT >= 33) {
                                strArr4 = PersonalQRCodeActivity.f27252i;
                            }
                            if (!PermissionUtils.isGranted(strArr4)) {
                                personalQRCodeActivity.requestPermissions(strArr4, 10);
                            } else {
                                personalQRCodeActivity.m(personalQRCodeActivity.f27253b);
                            }
                        }
                        break;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IView
    public final void showError(String str) {
        showLoadingDialog(false);
        ToastUtils.showLong(str);
    }

    @Override // com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IView
    public final void showPersonalQRCodeInfo(CommonResult commonResult) {
    }

    @Override // com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IView
    public final void showQrcodeImg(Bitmap bitmap) {
        showLoadingDialog(false);
        this.f27256e.setImageBitmap(bitmap);
    }

    @Override // com.transsnet.palmpay.contacts.contract.PersonalQRCodeContract$IView
    public final void showSavePath(String str) {
        ToastUtils.showLong(f.ct_picture_saved);
    }
}
