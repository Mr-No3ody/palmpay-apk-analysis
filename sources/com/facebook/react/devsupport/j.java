package com.facebook.react.devsupport;

import androidx.core.util.Supplier;
import com.facebook.react.common.ShakeDetector;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements ShakeDetector.ShakeListener, Supplier, ChangeBundleLocationDialog.ChangeBundleLocationDialogListener, BundleLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DevSupportManagerBase f21732a;

    public /* synthetic */ j(DevSupportManagerBase devSupportManagerBase) {
        this.f21732a = devSupportManagerBase;
    }

    @Override // androidx.core.util.Supplier
    public Object get() {
        return DevSupportManagerBase._init_$lambda$3(this.f21732a);
    }

    @Override // com.facebook.react.devsupport.ChangeBundleLocationDialog.ChangeBundleLocationDialogListener
    public void onClick(String str) {
        DevSupportManagerBase.showDevOptionsDialog$lambda$10$lambda$9(this.f21732a, str);
    }

    @Override // com.facebook.react.common.ShakeDetector.ShakeListener
    public void onShake() {
        this.f21732a.showDevOptionsDialog();
    }

    @Override // com.facebook.react.devsupport.interfaces.BundleLoadCallback
    public void onSuccess() {
        BridgeDevSupportManager.handleReloadJS$lambda$1((BridgeDevSupportManager) this.f21732a);
    }
}
