package com.transsnet.palmpay.ui.activity.qr;

import Ac.e;
import Ac.f;
import Ac.h;
import Fe.b0;
import Nd.c;
import Pa.r0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.facebook.imagepipeline.nativecode.b;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.req.CommonShareReq;
import com.transsnet.palmpay.ui.activity.qr.QrcodeShareActivity;
import com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IView;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/qrcode_share")
public class QrcodeShareActivity extends i implements QrcodeShareContract$IView {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f34936i = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f34937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f34938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f34939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f34940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f34941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f34942g;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.main_qrcode_share_activity;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IView
    public final void handleInviteUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b.D(this, getString(c.share_invitation_info, BaseApplication.getInstance().getUser().getNickName(), str));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new b0();
    }

    public final void m(View view) {
        int id2 = view.getId();
        if (id2 == e.back_bt) {
            finish();
            return;
        }
        if (id2 == e.share_bt) {
            ((b0) this.f27350a).getInviteUrl(new CommonShareReq(5, b.r(this.f34942g, r0.K())));
            return;
        }
        View view2 = this.f34937b;
        view2.setDrawingCacheEnabled(true);
        view2.setDrawingCacheQuality(1048576);
        view2.setDrawingCacheBackgroundColor(-1);
        int width = view2.getWidth();
        int height = view2.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        view2.layout(0, 0, width, height);
        view2.draw(canvas);
        ((b0) this.f27350a).savePicture(bitmapCreateBitmap);
        view2.setDrawingCacheEnabled(false);
        view2.destroyDrawingCache();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view2.getLayoutParams();
        layoutParams.gravity = 1;
        view2.setLayoutParams(layoutParams);
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        showLoadingDialog(true);
        ((b0) this.f27350a).queryInvitationCode();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        Window window = getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        this.f34941f = (TextView) findViewById(e.invitation_code);
        this.f34940e = (ImageView) findViewById(e.qrcode_share_iv);
        this.f34939d = (TextView) findViewById(e.inviter_name);
        this.f34938c = (TextView) findViewById(e.title_tv);
        this.f34937b = findViewById(e.qrcode_share_view);
        final int i7 = 0;
        findViewById(e.back_bt).setOnClickListener(new View.OnClickListener(this) { // from class: re.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrcodeShareActivity f41804b;

            {
                this.f41804b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QrcodeShareActivity qrcodeShareActivity = this.f41804b;
                switch (i7) {
                    case 0:
                        int i10 = QrcodeShareActivity.f34936i;
                        qrcodeShareActivity.m(view);
                        break;
                    case 1:
                        int i11 = QrcodeShareActivity.f34936i;
                        qrcodeShareActivity.m(view);
                        break;
                    default:
                        int i12 = QrcodeShareActivity.f34936i;
                        qrcodeShareActivity.m(view);
                        break;
                }
            }
        });
        final int i10 = 1;
        findViewById(e.save_bt).setOnClickListener(new View.OnClickListener(this) { // from class: re.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrcodeShareActivity f41804b;

            {
                this.f41804b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QrcodeShareActivity qrcodeShareActivity = this.f41804b;
                switch (i10) {
                    case 0:
                        int i11 = QrcodeShareActivity.f34936i;
                        qrcodeShareActivity.m(view);
                        break;
                    case 1:
                        int i12 = QrcodeShareActivity.f34936i;
                        qrcodeShareActivity.m(view);
                        break;
                    default:
                        int i13 = QrcodeShareActivity.f34936i;
                        qrcodeShareActivity.m(view);
                        break;
                }
            }
        });
        final int i11 = 2;
        findViewById(e.share_bt).setOnClickListener(new View.OnClickListener(this) { // from class: re.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrcodeShareActivity f41804b;

            {
                this.f41804b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QrcodeShareActivity qrcodeShareActivity = this.f41804b;
                switch (i11) {
                    case 0:
                        int i12 = QrcodeShareActivity.f34936i;
                        qrcodeShareActivity.m(view);
                        break;
                    case 1:
                        int i13 = QrcodeShareActivity.f34936i;
                        qrcodeShareActivity.m(view);
                        break;
                    default:
                        int i14 = QrcodeShareActivity.f34936i;
                        qrcodeShareActivity.m(view);
                        break;
                }
            }
        });
        this.f34938c.setText(h.main_qrcode_share_title);
        this.f34939d.setText(r0.b0(BaseApplication.getInstance().getUser().getFirstName(), null, BaseApplication.getInstance().getUser().getLastName()));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IView
    public final void showError(String str) {
        showLoadingDialog(false);
        ToastUtils.showShort(str);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IView
    public final void showInvitationCode(String str) {
        this.f34942g = str;
        this.f34941f.setText(str);
        ((b0) this.f27350a).generateQrcodeImg(b.r(str, r0.K()));
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IView
    public final void showQrcodeImg(Bitmap bitmap) {
        showLoadingDialog(false);
        this.f34940e.setImageBitmap(bitmap);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.QrcodeShareContract$IView
    public final void showSavePath(String str) {
        ToastUtils.showShort(getString(h.main_qrcode_share_picture_saved_text, str));
    }
}
