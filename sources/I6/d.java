package I6;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.core.app.AbstractC1032a;
import com.didiglobal.booster.instrument.ShadowToast;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.palmpay.lib.scanplus.view.ScanView;
import com.palmpay.lib.ui.button.PpButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends AbstractActivityC0837o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4030c;

    static {
        new c(null);
    }

    public final void e() {
        if (androidx.core.content.d.a(this, "android.permission.CAMERA") != 0) {
            AbstractC1032a.g(this, new String[]{"android.permission.CAMERA"}, 100);
            return;
        }
        g();
        ScanView scanViewF = getF23965d();
        if (scanViewF != null) {
            scanViewF.f(false);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract ScanView getF23965d();

    public abstract void g();

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        G8.a.F(application);
    }

    @Override // androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ScanView scanViewF = getF23965d();
        if (scanViewF != null) {
            scanViewF.i();
        }
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        ScanView scanViewF = getF23965d();
        if (scanViewF != null) {
            scanViewF.f(true);
        }
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity, androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        if (i7 == 100) {
            if (grantResults.length != 0 && grantResults[0] == 0) {
                g();
                ScanView scanViewF = getF23965d();
                if (scanViewF != null) {
                    scanViewF.f(false);
                    return;
                }
                return;
            }
            final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this, l.CustomBottomSheetDialog);
            View viewInflate = LayoutInflater.from(this).inflate(i.dialog_permission_denied, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(h.tv_title)).setText(getString(k.scan_permission_title));
            ((TextView) viewInflate.findViewById(h.tv_message)).setText(getString(this.f4030c == 0 ? k.scan_permission_message_1 : k.scan_permission_message_2));
            PpButton ppButton = (PpButton) viewInflate.findViewById(h.btn_go_settings);
            if (this.f4030c == 0) {
                ppButton.setText(getString(k.scan_grant));
                final int i10 = 0;
                ppButton.setOnClickListener(new View.OnClickListener() { // from class: I6.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                BottomSheetDialog bottomSheetDialog2 = bottomSheetDialog;
                                Intrinsics.checkNotNullParameter(bottomSheetDialog2, "$bottomSheetDialog");
                                d this$0 = this;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                bottomSheetDialog2.dismiss();
                                this$0.e();
                                break;
                            case 1:
                                BottomSheetDialog bottomSheetDialog3 = bottomSheetDialog;
                                Intrinsics.checkNotNullParameter(bottomSheetDialog3, "$bottomSheetDialog");
                                d this$1 = this;
                                Intrinsics.checkNotNullParameter(this$1, "this$0");
                                bottomSheetDialog3.dismiss();
                                this$1.getClass();
                                try {
                                    this$1.f4029b = true;
                                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                    intent.setData(Uri.fromParts("package", this$1.getPackageName(), null));
                                    this$1.startActivity(intent);
                                } catch (Exception unused) {
                                    ShadowToast.show(Toast.makeText(this$1, this$1.getString(k.scan_manual_grant_permission), 1));
                                    this$1.finish();
                                    return;
                                }
                                break;
                            default:
                                BottomSheetDialog bottomSheetDialog4 = bottomSheetDialog;
                                Intrinsics.checkNotNullParameter(bottomSheetDialog4, "$bottomSheetDialog");
                                d this$2 = this;
                                Intrinsics.checkNotNullParameter(this$2, "this$0");
                                bottomSheetDialog4.dismiss();
                                this$2.finish();
                                break;
                        }
                    }
                });
            } else {
                ppButton.setText(getString(k.scan_go_settings));
                final int i11 = 1;
                ppButton.setOnClickListener(new View.OnClickListener() { // from class: I6.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                BottomSheetDialog bottomSheetDialog2 = bottomSheetDialog;
                                Intrinsics.checkNotNullParameter(bottomSheetDialog2, "$bottomSheetDialog");
                                d this$0 = this;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                bottomSheetDialog2.dismiss();
                                this$0.e();
                                break;
                            case 1:
                                BottomSheetDialog bottomSheetDialog3 = bottomSheetDialog;
                                Intrinsics.checkNotNullParameter(bottomSheetDialog3, "$bottomSheetDialog");
                                d this$1 = this;
                                Intrinsics.checkNotNullParameter(this$1, "this$0");
                                bottomSheetDialog3.dismiss();
                                this$1.getClass();
                                try {
                                    this$1.f4029b = true;
                                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                    intent.setData(Uri.fromParts("package", this$1.getPackageName(), null));
                                    this$1.startActivity(intent);
                                } catch (Exception unused) {
                                    ShadowToast.show(Toast.makeText(this$1, this$1.getString(k.scan_manual_grant_permission), 1));
                                    this$1.finish();
                                    return;
                                }
                                break;
                            default:
                                BottomSheetDialog bottomSheetDialog4 = bottomSheetDialog;
                                Intrinsics.checkNotNullParameter(bottomSheetDialog4, "$bottomSheetDialog");
                                d this$2 = this;
                                Intrinsics.checkNotNullParameter(this$2, "this$0");
                                bottomSheetDialog4.dismiss();
                                this$2.finish();
                                break;
                        }
                    }
                });
            }
            PpButton ppButton2 = (PpButton) viewInflate.findViewById(h.btn_cancel);
            ppButton2.setText(getString(k.scan_cancel));
            final int i12 = 2;
            ppButton2.setOnClickListener(new View.OnClickListener() { // from class: I6.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            BottomSheetDialog bottomSheetDialog2 = bottomSheetDialog;
                            Intrinsics.checkNotNullParameter(bottomSheetDialog2, "$bottomSheetDialog");
                            d this$0 = this;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            bottomSheetDialog2.dismiss();
                            this$0.e();
                            break;
                        case 1:
                            BottomSheetDialog bottomSheetDialog3 = bottomSheetDialog;
                            Intrinsics.checkNotNullParameter(bottomSheetDialog3, "$bottomSheetDialog");
                            d this$1 = this;
                            Intrinsics.checkNotNullParameter(this$1, "this$0");
                            bottomSheetDialog3.dismiss();
                            this$1.getClass();
                            try {
                                this$1.f4029b = true;
                                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent.setData(Uri.fromParts("package", this$1.getPackageName(), null));
                                this$1.startActivity(intent);
                            } catch (Exception unused) {
                                ShadowToast.show(Toast.makeText(this$1, this$1.getString(k.scan_manual_grant_permission), 1));
                                this$1.finish();
                                return;
                            }
                            break;
                        default:
                            BottomSheetDialog bottomSheetDialog4 = bottomSheetDialog;
                            Intrinsics.checkNotNullParameter(bottomSheetDialog4, "$bottomSheetDialog");
                            d this$2 = this;
                            Intrinsics.checkNotNullParameter(this$2, "this$0");
                            bottomSheetDialog4.dismiss();
                            this$2.finish();
                            break;
                    }
                }
            });
            bottomSheetDialog.setContentView(viewInflate);
            bottomSheetDialog.setCancelable(false);
            bottomSheetDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: I6.b
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    BottomSheetDialog bottomSheetDialog2 = bottomSheetDialog;
                    Intrinsics.checkNotNullParameter(bottomSheetDialog2, "$bottomSheetDialog");
                    d this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    View viewFindViewById = bottomSheetDialog2.findViewById(R.id.design_bottom_sheet);
                    if (viewFindViewById != null) {
                        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
                        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCorner(0, this$0.getResources().getDimensionPixelSize(f.bottom_sheet_corner_radius)).setTopRightCorner(0, this$0.getResources().getDimensionPixelSize(f.bottom_sheet_corner_radius)).build();
                        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelBuild, "builder()\n              …                 .build()");
                        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelBuild);
                        materialShapeDrawable.setFillColor(androidx.core.content.d.c(android.R.color.white, this$0));
                        viewFindViewById.setBackground(materialShapeDrawable);
                    }
                }
            });
            bottomSheetDialog.show();
            this.f4030c++;
        }
    }

    @Override // androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f4029b) {
            this.f4029b = false;
            if (androidx.core.content.d.a(this, "android.permission.CAMERA") != 0) {
                ShadowToast.show(Toast.makeText(this, getString(k.scan_manual_grant_permission), 1));
                finish();
                return;
            }
            g();
            ScanView scanViewF = getF23965d();
            if (scanViewF != null) {
                scanViewF.f(false);
                return;
            }
            return;
        }
        if (androidx.core.content.d.a(this, "android.permission.CAMERA") == 0) {
            ScanView scanViewF2 = getF23965d();
            if (scanViewF2 != null) {
                scanViewF2.f(false);
                return;
            }
            return;
        }
        ScanView scanViewF3 = getF23965d();
        if (scanViewF3 != null) {
            scanViewF3.f(true);
        }
    }
}
