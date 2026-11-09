package com.transsnet.palmpay.credit.ui.activity.cashloan;

import Ya.e;
import Ya.f;
import Za.b;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLPermissionActivity;
import com.transsnet.palmpay.util.PermissionUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p284sb.A;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit权限提示页", path = "/credit_score/cl_permission_tips_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLPermissionActivity;", "LZa/b;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLPermissionActivity extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f29010j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29014g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29015i;

    public CLPermissionActivity() {
        final int i7 = 0;
        this.f29011d = C2131j.b(new Function0(this) { // from class: tb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLPermissionActivity f42421b;

            {
                this.f42421b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLPermissionActivity cLPermissionActivity = this.f42421b;
                switch (i7) {
                    case 0:
                        int i10 = CLPermissionActivity.f29010j;
                        return (Button) cLPermissionActivity.findViewById(e.open_setting_bt);
                    case 1:
                        int i11 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.third_perm_cl);
                    case 2:
                        int i12 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.second_perm_cl);
                    case 3:
                        int i13 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.first_perm_cl);
                    default:
                        int i14 = CLPermissionActivity.f29010j;
                        return (ImageView) cLPermissionActivity.findViewById(e.cl_permission_close_img);
                }
            }
        });
        final int i10 = 1;
        this.f29012e = C2131j.b(new Function0(this) { // from class: tb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLPermissionActivity f42421b;

            {
                this.f42421b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLPermissionActivity cLPermissionActivity = this.f42421b;
                switch (i10) {
                    case 0:
                        int i11 = CLPermissionActivity.f29010j;
                        return (Button) cLPermissionActivity.findViewById(e.open_setting_bt);
                    case 1:
                        int i12 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.third_perm_cl);
                    case 2:
                        int i13 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.second_perm_cl);
                    case 3:
                        int i14 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.first_perm_cl);
                    default:
                        int i15 = CLPermissionActivity.f29010j;
                        return (ImageView) cLPermissionActivity.findViewById(e.cl_permission_close_img);
                }
            }
        });
        final int i11 = 2;
        this.f29013f = C2131j.b(new Function0(this) { // from class: tb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLPermissionActivity f42421b;

            {
                this.f42421b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLPermissionActivity cLPermissionActivity = this.f42421b;
                switch (i11) {
                    case 0:
                        int i12 = CLPermissionActivity.f29010j;
                        return (Button) cLPermissionActivity.findViewById(e.open_setting_bt);
                    case 1:
                        int i13 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.third_perm_cl);
                    case 2:
                        int i14 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.second_perm_cl);
                    case 3:
                        int i15 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.first_perm_cl);
                    default:
                        int i16 = CLPermissionActivity.f29010j;
                        return (ImageView) cLPermissionActivity.findViewById(e.cl_permission_close_img);
                }
            }
        });
        final int i12 = 3;
        this.f29014g = C2131j.b(new Function0(this) { // from class: tb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLPermissionActivity f42421b;

            {
                this.f42421b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLPermissionActivity cLPermissionActivity = this.f42421b;
                switch (i12) {
                    case 0:
                        int i13 = CLPermissionActivity.f29010j;
                        return (Button) cLPermissionActivity.findViewById(e.open_setting_bt);
                    case 1:
                        int i14 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.third_perm_cl);
                    case 2:
                        int i15 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.second_perm_cl);
                    case 3:
                        int i16 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.first_perm_cl);
                    default:
                        int i17 = CLPermissionActivity.f29010j;
                        return (ImageView) cLPermissionActivity.findViewById(e.cl_permission_close_img);
                }
            }
        });
        final int i13 = 4;
        this.f29015i = C2131j.b(new Function0(this) { // from class: tb.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLPermissionActivity f42421b;

            {
                this.f42421b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLPermissionActivity cLPermissionActivity = this.f42421b;
                switch (i13) {
                    case 0:
                        int i14 = CLPermissionActivity.f29010j;
                        return (Button) cLPermissionActivity.findViewById(e.open_setting_bt);
                    case 1:
                        int i15 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.third_perm_cl);
                    case 2:
                        int i16 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.second_perm_cl);
                    case 3:
                        int i17 = CLPermissionActivity.f29010j;
                        return (ConstraintLayout) cLPermissionActivity.findViewById(e.first_perm_cl);
                    default:
                        int i18 = CLPermissionActivity.f29010j;
                        return (ImageView) cLPermissionActivity.findViewById(e.cl_permission_close_img);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_permission_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        boolean zIsGranted = PermissionUtils.isGranted("android.permission.ACCESS_COARSE_LOCATION");
        t tVar = this.f29014g;
        if (zIsGranted && PermissionUtils.isGranted(d.j())) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((ConstraintLayout) value).setVisibility(8);
        } else {
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((ConstraintLayout) value2).setVisibility(0);
        }
        boolean zIsGranted2 = PermissionUtils.isGranted("android.permission.READ_CONTACTS");
        t tVar2 = this.f29013f;
        if (zIsGranted2) {
            Object value3 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((ConstraintLayout) value3).setVisibility(8);
        } else {
            Object value4 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((ConstraintLayout) value4).setVisibility(0);
        }
        boolean zIsGranted3 = PermissionUtils.isGranted("android.permission.CAMERA");
        t tVar3 = this.f29012e;
        if (zIsGranted3) {
            Object value5 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((ConstraintLayout) value5).setVisibility(8);
        } else {
            Object value6 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            ((ConstraintLayout) value6).setVisibility(0);
        }
        Object value7 = this.f29015i.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        final int i7 = 0;
        h.l(new View.OnClickListener(this) { // from class: tb.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLPermissionActivity f42423b;

            {
                this.f42423b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLPermissionActivity cLPermissionActivity = this.f42423b;
                switch (i7) {
                    case 0:
                        int i10 = CLPermissionActivity.f29010j;
                        cLPermissionActivity.finish();
                        break;
                    default:
                        int i11 = CLPermissionActivity.f29010j;
                        Intent intent = new Intent();
                        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + cLPermissionActivity.getPackageName()));
                        cLPermissionActivity.startActivity(intent);
                        cLPermissionActivity.finish();
                        break;
                }
            }
        }, (ImageView) value7);
        Object value8 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        h.l(new A(8), (ConstraintLayout) value8);
        Object value9 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        h.l(new A(9), (ConstraintLayout) value9);
        Object value10 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        h.l(new A(10), (ConstraintLayout) value10);
        Object value11 = this.f29011d.getValue();
        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
        final int i10 = 1;
        h.l(new View.OnClickListener(this) { // from class: tb.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLPermissionActivity f42423b;

            {
                this.f42423b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLPermissionActivity cLPermissionActivity = this.f42423b;
                switch (i10) {
                    case 0:
                        int i11 = CLPermissionActivity.f29010j;
                        cLPermissionActivity.finish();
                        break;
                    default:
                        int i12 = CLPermissionActivity.f29010j;
                        Intent intent = new Intent();
                        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + cLPermissionActivity.getPackageName()));
                        cLPermissionActivity.startActivity(intent);
                        cLPermissionActivity.finish();
                        break;
                }
            }
        }, (Button) value11);
    }
}
