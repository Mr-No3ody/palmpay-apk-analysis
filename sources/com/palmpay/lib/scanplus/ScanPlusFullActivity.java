package com.palmpay.lib.scanplus;

import I6.d;
import I6.h;
import L6.b;
import android.os.Bundle;
import com.gyf.immersionbar.i;
import com.palmpay.lib.scanplus.view.ScanView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/palmpay/lib/scanplus/ScanPlusFullActivity;", "LI6/d;", "<init>", "()V", "lib_scanplus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ScanPlusFullActivity extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScanView f23967d;

    @Override // I6.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ScanView getF23967d() {
        return this.f23967d;
    }

    @Override // I6.d
    public final void g() {
        if (this.f4028a) {
            return;
        }
        ScanView scanView = this.f23967d;
        if (scanView != null) {
            scanView.setCamera(getIntent().getBooleanExtra("CameraX", false));
        }
        this.f4028a = true;
    }

    @Override // I6.d, androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, androidx.core.app.AbstractActivityC1040i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i iVarI = i.i(this);
        iVarI.f23245i.getClass();
        iVarI.d();
        setContentView(I6.i.lib_scanplus_scan_full_activity);
        this.f23967d = (ScanView) findViewById(h.scan_view);
        if (androidx.core.content.d.a(this, "android.permission.CAMERA") == 0) {
            ScanView scanView = this.f23967d;
            if (scanView != null) {
                scanView.setCamera(getIntent().getBooleanExtra("CameraX", false));
            }
            this.f4028a = true;
        }
        int color = getColor(b.ppColorPrimary);
        ScanView scanView2 = this.f23967d;
        if (scanView2 != null) {
            scanView2.setLineColor(new int[]{color, color, color});
        }
        ScanView scanView3 = this.f23967d;
        if (scanView3 != null) {
            scanView3.setOnScanListener(new Sd.b(this, 4));
        }
        e();
    }
}
