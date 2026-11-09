package com.palmpay.lib.scanplus;

import I6.d;
import I6.h;
import I6.i;
import Pa.C0525w;
import S6.a;
import android.os.Bundle;
import android.view.View;
import com.gyf.immersionbar.b;
import com.palmpay.lib.scanplus.ScanPlusActivity;
import com.palmpay.lib.scanplus.view.ScanView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/palmpay/lib/scanplus/ScanPlusActivity;", "LI6/d;", "<init>", "()V", "lib_scanplus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ScanPlusActivity extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f23964f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScanView f23965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f23966e;

    @Override // I6.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ScanView getF23965d() {
        return this.f23965d;
    }

    @Override // I6.d
    public final void g() {
        if (this.f4028a) {
            return;
        }
        ScanView scanView = this.f23965d;
        if (scanView != null) {
            scanView.setCamera(getIntent().getBooleanExtra("CameraX", false));
        }
        this.f4028a = true;
    }

    @Override // I6.d, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(i.lib_scanpuls_scan_activity);
        this.f23965d = (ScanView) findViewById(h.scan_view);
        if (androidx.core.content.d.a(this, "android.permission.CAMERA") == 0) {
            ScanView scanView = this.f23965d;
            if (scanView != null) {
                scanView.setCamera(getIntent().getBooleanExtra("CameraX", false));
            }
            this.f4028a = true;
        }
        this.f23966e = findViewById(h.status_bar_view);
        com.gyf.immersionbar.i iVarI = com.gyf.immersionbar.i.i(this);
        b bVar = iVarI.f23245i;
        bVar.getClass();
        bVar.f23215a = 0;
        bVar.f23217c = true;
        View view = this.f23966e;
        if (view != null) {
            bVar.f23219e = view;
            if (iVarI.t == 0) {
                iVarI.t = 3;
            }
        }
        iVarI.d();
        ScanView scanView2 = this.f23965d;
        if (scanView2 != null) {
            scanView2.setOnScanListener(new C0525w(this, 5));
        }
        PpTitleBar ppTitleBar = (PpTitleBar) findViewById(h.titleBar);
        if (ppTitleBar != null) {
            ppTitleBar.c(a.pay_Close, -1);
            final int i7 = 0;
            ppTitleBar.setBackButtonClickListener(new View.OnClickListener(this) { // from class: I6.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScanPlusActivity f4032b;

                {
                    this.f4032b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ScanPlusActivity this$0 = this.f4032b;
                    switch (i7) {
                        case 0:
                            int i10 = ScanPlusActivity.f23964f;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.finish();
                            break;
                        default:
                            int i11 = ScanPlusActivity.f23964f;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            ScanView scanView3 = this$0.f23965d;
                            if (scanView3 != null) {
                                scanView3.d();
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            ppTitleBar.setRightTextViewClickListener(new View.OnClickListener(this) { // from class: I6.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScanPlusActivity f4032b;

                {
                    this.f4032b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ScanPlusActivity this$0 = this.f4032b;
                    switch (i10) {
                        case 0:
                            int i11 = ScanPlusActivity.f23964f;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            this$0.finish();
                            break;
                        default:
                            int i12 = ScanPlusActivity.f23964f;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            ScanView scanView3 = this$0.f23965d;
                            if (scanView3 != null) {
                                scanView3.d();
                            }
                            break;
                    }
                }
            });
        }
        e();
    }
}
