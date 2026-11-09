package com.transsnet.palmpay.managemoney.ui.activity;

import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.AbstractC1032a;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.rmondjone.camera.AspectRatio;
import com.rmondjone.camera.CameraPreview;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/manage_money/insurance_take_photo_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/InsuranceTakePhotoActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/CashBoxViewModel;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInsuranceTakePhotoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InsuranceTakePhotoActivity.kt\ncom/transsnet/palmpay/managemoney/ui/activity/InsuranceTakePhotoActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,495:1\n1#2:496\n*E\n"})
public final class InsuranceTakePhotoActivity extends BaseMvvmActivity<CashBoxViewModel> {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f32109C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f32110A = true;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Gb.L f32111B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f32112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f32113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f32114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f32115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f32116g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p355xf.t f32117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32118j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p355xf.t f32119o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Camera f32120p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CameraPreview f32121v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public File f32122w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public InsuranceTakePhotoActivity() {
        final int i7 = 0;
        this.f32112c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceTakePhotoActivity f32270b;

            {
                this.f32270b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InsuranceTakePhotoActivity insuranceTakePhotoActivity = this.f32270b;
                switch (i7) {
                    case 0:
                        int i10 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.done_tv);
                    case 1:
                        int i11 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.try_again_tv);
                    case 2:
                        int i12 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.review_photo_cl);
                    case 3:
                        int i13 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.countdown_shot_cl);
                    case 4:
                        int i14 = InsuranceTakePhotoActivity.f32109C;
                        return (ImageView) insuranceTakePhotoActivity.findViewById(Jc.c.photo_img);
                    case 5:
                        int i15 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.tv_time_limit);
                    case 6:
                        int i16 = InsuranceTakePhotoActivity.f32109C;
                        return (ProgressBar) insuranceTakePhotoActivity.findViewById(Jc.c.plan_progress_pb);
                    default:
                        int i17 = InsuranceTakePhotoActivity.f32109C;
                        return (FrameLayout) insuranceTakePhotoActivity.findViewById(Jc.c.camera_preview_fl);
                }
            }
        });
        final int i10 = 1;
        this.f32113d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceTakePhotoActivity f32270b;

            {
                this.f32270b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InsuranceTakePhotoActivity insuranceTakePhotoActivity = this.f32270b;
                switch (i10) {
                    case 0:
                        int i11 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.done_tv);
                    case 1:
                        int i12 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.try_again_tv);
                    case 2:
                        int i13 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.review_photo_cl);
                    case 3:
                        int i14 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.countdown_shot_cl);
                    case 4:
                        int i15 = InsuranceTakePhotoActivity.f32109C;
                        return (ImageView) insuranceTakePhotoActivity.findViewById(Jc.c.photo_img);
                    case 5:
                        int i16 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.tv_time_limit);
                    case 6:
                        int i17 = InsuranceTakePhotoActivity.f32109C;
                        return (ProgressBar) insuranceTakePhotoActivity.findViewById(Jc.c.plan_progress_pb);
                    default:
                        int i18 = InsuranceTakePhotoActivity.f32109C;
                        return (FrameLayout) insuranceTakePhotoActivity.findViewById(Jc.c.camera_preview_fl);
                }
            }
        });
        final int i11 = 2;
        this.f32114e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceTakePhotoActivity f32270b;

            {
                this.f32270b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InsuranceTakePhotoActivity insuranceTakePhotoActivity = this.f32270b;
                switch (i11) {
                    case 0:
                        int i12 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.done_tv);
                    case 1:
                        int i13 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.try_again_tv);
                    case 2:
                        int i14 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.review_photo_cl);
                    case 3:
                        int i15 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.countdown_shot_cl);
                    case 4:
                        int i16 = InsuranceTakePhotoActivity.f32109C;
                        return (ImageView) insuranceTakePhotoActivity.findViewById(Jc.c.photo_img);
                    case 5:
                        int i17 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.tv_time_limit);
                    case 6:
                        int i18 = InsuranceTakePhotoActivity.f32109C;
                        return (ProgressBar) insuranceTakePhotoActivity.findViewById(Jc.c.plan_progress_pb);
                    default:
                        int i19 = InsuranceTakePhotoActivity.f32109C;
                        return (FrameLayout) insuranceTakePhotoActivity.findViewById(Jc.c.camera_preview_fl);
                }
            }
        });
        final int i12 = 3;
        this.f32115f = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceTakePhotoActivity f32270b;

            {
                this.f32270b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InsuranceTakePhotoActivity insuranceTakePhotoActivity = this.f32270b;
                switch (i12) {
                    case 0:
                        int i13 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.done_tv);
                    case 1:
                        int i14 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.try_again_tv);
                    case 2:
                        int i15 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.review_photo_cl);
                    case 3:
                        int i16 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.countdown_shot_cl);
                    case 4:
                        int i17 = InsuranceTakePhotoActivity.f32109C;
                        return (ImageView) insuranceTakePhotoActivity.findViewById(Jc.c.photo_img);
                    case 5:
                        int i18 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.tv_time_limit);
                    case 6:
                        int i19 = InsuranceTakePhotoActivity.f32109C;
                        return (ProgressBar) insuranceTakePhotoActivity.findViewById(Jc.c.plan_progress_pb);
                    default:
                        int i110 = InsuranceTakePhotoActivity.f32109C;
                        return (FrameLayout) insuranceTakePhotoActivity.findViewById(Jc.c.camera_preview_fl);
                }
            }
        });
        final int i13 = 4;
        this.f32116g = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceTakePhotoActivity f32270b;

            {
                this.f32270b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InsuranceTakePhotoActivity insuranceTakePhotoActivity = this.f32270b;
                switch (i13) {
                    case 0:
                        int i14 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.done_tv);
                    case 1:
                        int i15 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.try_again_tv);
                    case 2:
                        int i16 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.review_photo_cl);
                    case 3:
                        int i17 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.countdown_shot_cl);
                    case 4:
                        int i18 = InsuranceTakePhotoActivity.f32109C;
                        return (ImageView) insuranceTakePhotoActivity.findViewById(Jc.c.photo_img);
                    case 5:
                        int i19 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.tv_time_limit);
                    case 6:
                        int i110 = InsuranceTakePhotoActivity.f32109C;
                        return (ProgressBar) insuranceTakePhotoActivity.findViewById(Jc.c.plan_progress_pb);
                    default:
                        int i111 = InsuranceTakePhotoActivity.f32109C;
                        return (FrameLayout) insuranceTakePhotoActivity.findViewById(Jc.c.camera_preview_fl);
                }
            }
        });
        final int i14 = 5;
        this.f32117i = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceTakePhotoActivity f32270b;

            {
                this.f32270b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InsuranceTakePhotoActivity insuranceTakePhotoActivity = this.f32270b;
                switch (i14) {
                    case 0:
                        int i15 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.done_tv);
                    case 1:
                        int i16 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.try_again_tv);
                    case 2:
                        int i17 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.review_photo_cl);
                    case 3:
                        int i18 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.countdown_shot_cl);
                    case 4:
                        int i19 = InsuranceTakePhotoActivity.f32109C;
                        return (ImageView) insuranceTakePhotoActivity.findViewById(Jc.c.photo_img);
                    case 5:
                        int i110 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.tv_time_limit);
                    case 6:
                        int i111 = InsuranceTakePhotoActivity.f32109C;
                        return (ProgressBar) insuranceTakePhotoActivity.findViewById(Jc.c.plan_progress_pb);
                    default:
                        int i112 = InsuranceTakePhotoActivity.f32109C;
                        return (FrameLayout) insuranceTakePhotoActivity.findViewById(Jc.c.camera_preview_fl);
                }
            }
        });
        final int i15 = 6;
        this.f32118j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceTakePhotoActivity f32270b;

            {
                this.f32270b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InsuranceTakePhotoActivity insuranceTakePhotoActivity = this.f32270b;
                switch (i15) {
                    case 0:
                        int i16 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.done_tv);
                    case 1:
                        int i17 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.try_again_tv);
                    case 2:
                        int i18 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.review_photo_cl);
                    case 3:
                        int i19 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.countdown_shot_cl);
                    case 4:
                        int i110 = InsuranceTakePhotoActivity.f32109C;
                        return (ImageView) insuranceTakePhotoActivity.findViewById(Jc.c.photo_img);
                    case 5:
                        int i111 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.tv_time_limit);
                    case 6:
                        int i112 = InsuranceTakePhotoActivity.f32109C;
                        return (ProgressBar) insuranceTakePhotoActivity.findViewById(Jc.c.plan_progress_pb);
                    default:
                        int i113 = InsuranceTakePhotoActivity.f32109C;
                        return (FrameLayout) insuranceTakePhotoActivity.findViewById(Jc.c.camera_preview_fl);
                }
            }
        });
        final int i16 = 7;
        this.f32119o = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.activity.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceTakePhotoActivity f32270b;

            {
                this.f32270b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                InsuranceTakePhotoActivity insuranceTakePhotoActivity = this.f32270b;
                switch (i16) {
                    case 0:
                        int i17 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.done_tv);
                    case 1:
                        int i18 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.try_again_tv);
                    case 2:
                        int i19 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.review_photo_cl);
                    case 3:
                        int i110 = InsuranceTakePhotoActivity.f32109C;
                        return (ConstraintLayout) insuranceTakePhotoActivity.findViewById(Jc.c.countdown_shot_cl);
                    case 4:
                        int i111 = InsuranceTakePhotoActivity.f32109C;
                        return (ImageView) insuranceTakePhotoActivity.findViewById(Jc.c.photo_img);
                    case 5:
                        int i112 = InsuranceTakePhotoActivity.f32109C;
                        return (TextView) insuranceTakePhotoActivity.findViewById(Jc.c.tv_time_limit);
                    case 6:
                        int i113 = InsuranceTakePhotoActivity.f32109C;
                        return (ProgressBar) insuranceTakePhotoActivity.findViewById(Jc.c.plan_progress_pb);
                    default:
                        int i114 = InsuranceTakePhotoActivity.f32109C;
                        return (FrameLayout) insuranceTakePhotoActivity.findViewById(Jc.c.camera_preview_fl);
                }
            }
        });
    }

    public static final void m(InsuranceTakePhotoActivity insuranceTakePhotoActivity) {
        File file = insuranceTakePhotoActivity.f32122w;
        p355xf.t tVar = insuranceTakePhotoActivity.f32116g;
        if (file != null) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ImageView imageView = (ImageView) value;
            if (imageView != null) {
                imageView.setImageURI(Uri.fromFile(insuranceTakePhotoActivity.f32122w));
            }
        }
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ImageView imageView2 = (ImageView) value2;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        Object value3 = insuranceTakePhotoActivity.f32119o.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        FrameLayout frameLayout = (FrameLayout) value3;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        Object value4 = insuranceTakePhotoActivity.f32114e.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) value4;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        ConstraintLayout constraintLayoutN = insuranceTakePhotoActivity.n();
        if (constraintLayoutN != null) {
            constraintLayoutN.setVisibility(8);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Jc.d.mm_insurance_take_photo_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(com.transsnet.palmpay.custom_view.p.cv_color_ffffff), true);
    }

    public final ConstraintLayout n() {
        Object value = this.f32115f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ConstraintLayout) value;
    }

    public final ProgressBar o() {
        Object value = this.f32118j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ProgressBar) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Gb.L l5 = this.f32111B;
        if (l5 != null) {
            l5.cancel();
        }
        this.f32111B = null;
        if (PermissionUtils.isGranted("android.permission.CAMERA")) {
            try {
                Camera camera = this.f32120p;
                if (camera != null) {
                    camera.stopPreview();
                    Camera camera2 = this.f32120p;
                    if (camera2 != null) {
                        camera2.release();
                    }
                    this.f32120p = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (PermissionUtils.isGranted("android.permission.CAMERA")) {
            try {
                Camera camera = this.f32120p;
                if (camera != null) {
                    if (camera != null) {
                        camera.stopPreview();
                    }
                    Camera camera2 = this.f32120p;
                    if (camera2 != null) {
                        camera2.release();
                    }
                    this.f32120p = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                finish();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        if (i7 == 1000) {
            int length = grantResults.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (grantResults[i10] != 0) {
                    if (this.f32110A) {
                        q();
                        this.f32110A = false;
                        return;
                    } else if (!AbstractC1032a.h(this, permissions[i10])) {
                        p();
                        return;
                    } else {
                        if (grantResults[i10] != 0) {
                            q();
                            return;
                        }
                        return;
                    }
                }
            }
            s();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (PermissionUtils.isGranted("android.permission.CAMERA")) {
            try {
                if (this.f32120p == null) {
                    Camera cameraOpen = Camera.open(1);
                    this.f32120p = cameraOpen;
                    CameraPreview cameraPreview = this.f32121v;
                    if (cameraPreview == null) {
                        Intrinsics.n("mCameraPreview");
                        throw null;
                    }
                    cameraPreview.setCamera(cameraOpen);
                }
                Camera camera = this.f32120p;
                if (camera != null) {
                    camera.startPreview();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                ToastUtils.showLong(e10.getMessage(), new Object[0]);
                finish();
            }
        }
    }

    public final void p() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + getPackageName()));
        startActivity(intent);
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    public final void q() {
        O6.c cVar = new O6.c(this);
        cVar.f6598d = "The following system permission are required: Camera";
        String string = getString(p025ba.k.core_ok);
        ViewOnClickListenerC1577x viewOnClickListenerC1577x = new ViewOnClickListenerC1577x(this, 3);
        cVar.f6600f = string;
        cVar.f6602h = viewOnClickListenerC1577x;
        O6.d dVarA = cVar.a();
        dVarA.setOnDismissListener(new Dd.b(this, 23));
        dVarA.show();
    }

    public final void r() {
        try {
            Camera camera = this.f32120p;
            if (camera != null) {
                camera.startPreview();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            ToastUtils.showLong(e10.getMessage(), new Object[0]);
            finish();
        }
        Object value = this.f32116g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ImageView imageView = (ImageView) value;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        Object value2 = this.f32119o.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        FrameLayout frameLayout = (FrameLayout) value2;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        Object value3 = this.f32114e.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) value3;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        ConstraintLayout constraintLayoutN = n();
        if (constraintLayoutN != null) {
            constraintLayoutN.setVisibility(0);
        }
        ConstraintLayout constraintLayoutN2 = n();
        if (constraintLayoutN2 != null) {
            constraintLayoutN2.setEnabled(true);
        }
    }

    public final void s() {
        try {
            this.f32120p = Camera.open(1);
            this.f32121v = new CameraPreview(this, this.f32120p, AspectRatio.c(MessageEvent.EVENT_CL_REPAYMENT_FAILED, 625));
            Object value = this.f32119o.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            FrameLayout frameLayout = (FrameLayout) value;
            if (frameLayout != null) {
                CameraPreview cameraPreview = this.f32121v;
                if (cameraPreview != null) {
                    frameLayout.addView(cameraPreview);
                } else {
                    Intrinsics.n("mCameraPreview");
                    throw null;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            ToastUtils.showLong(e10.getMessage(), new Object[0]);
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        if (PermissionUtils.isGranted("android.permission.CAMERA")) {
            s();
        } else {
            AbstractC1032a.g(this, new String[]{"android.permission.CAMERA"}, 1000);
        }
        n().setOnClickListener(new ViewOnClickListenerC1577x(this, 0));
        Object value = this.f32113d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setOnClickListener(new ViewOnClickListenerC1577x(this, 1));
        Object value2 = this.f32112c.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setOnClickListener(new ViewOnClickListenerC1577x(this, 2));
    }
}
