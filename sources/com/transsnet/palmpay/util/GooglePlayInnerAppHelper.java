package com.transsnet.palmpay.util;

import Ad.C0058e;
import C0.G;
import android.app.Activity;
import androidx.camera.video.u;
import com.facebook.react.packagerconnection.a;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.ui.activity.Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p010a9.m;
import p367ya.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/util/GooglePlayInnerAppHelper;", "", "<init>", "()V", "UPDATE_REQUEST_CODE", "", "innerAppForceUpdate", "", "innerAppSmartUpdate", "activity", "Landroid/app/Activity;", "innerAppSmartDownLoadedUpdate", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GooglePlayInnerAppHelper {

    @NotNull
    public static final GooglePlayInnerAppHelper INSTANCE = new GooglePlayInnerAppHelper();
    public static final int UPDATE_REQUEST_CODE = 1;

    private GooglePlayInnerAppHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit innerAppForceUpdate$lambda$0(AppUpdateInfo appUpdateInfo) {
        if (appUpdateInfo.updateAvailability() == 2) {
            appUpdateInfo.isUpdateTypeAllowed(1);
        }
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void innerAppForceUpdate$lambda$3(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String message = it.getMessage();
        if (message != null) {
            System.out.println((Object) "appUpdateInfo ".concat(message));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void innerAppForceUpdate$lambda$4(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        System.out.println((Object) "appUpdateInfo  complete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit innerAppSmartDownLoadedUpdate$lambda$10(final AppUpdateManager appUpdateManager, AppUpdateInfo appUpdateInfo) {
        if (appUpdateInfo.updateAvailability() == 2 && appUpdateInfo.isUpdateTypeAllowed(0)) {
            appUpdateManager.registerListener(new InstallStateUpdatedListener() { // from class: com.transsnet.palmpay.util.GooglePlayInnerAppHelper$innerAppSmartDownLoadedUpdate$1$installListener$1
                @Override // com.google.android.play.core.listener.StateUpdatedListener
                public void onStateUpdate(InstallState installState) {
                    Intrinsics.checkNotNullParameter(installState, "installState");
                    if (installState.installStatus() == 11) {
                        appUpdateManager.unregisterListener(this);
                        appUpdateManager.completeUpdate();
                        System.out.println((Object) "appUpdateInfo downloaded");
                    }
                }
            });
        }
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit innerAppSmartUpdate$lambda$5(final AppUpdateManager appUpdateManager, Activity activity, AppUpdateInfo appUpdateInfo) {
        if (appUpdateInfo.updateAvailability() == 2 && appUpdateInfo.isUpdateTypeAllowed(0)) {
            c.e(false);
            System.out.println((Object) "appUpdateInfo has update condition");
            try {
                appUpdateManager.registerListener(new InstallStateUpdatedListener() { // from class: com.transsnet.palmpay.util.GooglePlayInnerAppHelper$innerAppSmartUpdate$1$installListener$1
                    @Override // com.google.android.play.core.listener.StateUpdatedListener
                    public void onStateUpdate(InstallState installState) {
                        Intrinsics.checkNotNullParameter(installState, "installState");
                        System.out.println((Object) G.m(installState.installStatus(), "appUpdateInfo has update condition"));
                        if (installState.installStatus() == 2) {
                            long jBytesDownloaded = installState.bytesDownloaded();
                            StringBuilder sbR = u.r(installState.totalBytesToDownload(), "appUpdateInfo loding total:", " loading:");
                            sbR.append(jBytesDownloaded);
                            System.out.println((Object) sbR.toString());
                            return;
                        }
                        if (installState.installStatus() == 11) {
                            appUpdateManager.unregisterListener(this);
                            appUpdateManager.completeUpdate();
                            System.out.println((Object) "appUpdateInfo downloaded");
                        }
                    }
                });
                appUpdateManager.startUpdateFlowForResult(appUpdateInfo, 0, activity, 1);
            } catch (Exception e10) {
                System.out.println((Object) G.o("appUpdateInfo", e10.getMessage()));
            }
        }
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void innerAppSmartUpdate$lambda$8(Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String message = it.getMessage();
        if (message != null) {
            System.out.println((Object) "appUpdateInfo ".concat(message));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void innerAppSmartUpdate$lambda$9(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        System.out.println((Object) "appUpdateInfo  complete");
    }

    public final void innerAppForceUpdate() {
        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(BaseApplication.getInstance());
        Intrinsics.checkNotNullExpressionValue(appUpdateManagerCreate, "create(...)");
        Task<AppUpdateInfo> appUpdateInfo = appUpdateManagerCreate.getAppUpdateInfo();
        if (appUpdateInfo != null) {
            appUpdateInfo.addOnSuccessListener(new Z(new a(18), 18));
        }
        Task<AppUpdateInfo> appUpdateInfo2 = appUpdateManagerCreate.getAppUpdateInfo();
        if (appUpdateInfo2 != null) {
            appUpdateInfo2.addOnFailureListener(new com.palmpay.lib.bridgewrapper.photo.upload.a(22));
        }
        Task<AppUpdateInfo> appUpdateInfo3 = appUpdateManagerCreate.getAppUpdateInfo();
        if (appUpdateInfo3 != null) {
            appUpdateInfo3.addOnCompleteListener(new com.palmpay.lib.bridgewrapper.photo.upload.a(23));
        }
    }

    public final void innerAppSmartDownLoadedUpdate(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(BaseApplication.getInstance());
        Intrinsics.checkNotNullExpressionValue(appUpdateManagerCreate, "create(...)");
        appUpdateManagerCreate.getAppUpdateInfo().addOnSuccessListener(new Z(new m(appUpdateManagerCreate, 17), 20));
    }

    public final void innerAppSmartUpdate(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(BaseApplication.getInstance());
        Intrinsics.checkNotNullExpressionValue(appUpdateManagerCreate, "create(...)");
        Task<AppUpdateInfo> appUpdateInfo = appUpdateManagerCreate.getAppUpdateInfo();
        if (appUpdateInfo != null) {
            appUpdateInfo.addOnSuccessListener(new Z(new C0058e(28, appUpdateManagerCreate, activity), 19));
        }
        Task<AppUpdateInfo> appUpdateInfo2 = appUpdateManagerCreate.getAppUpdateInfo();
        if (appUpdateInfo2 != null) {
            appUpdateInfo2.addOnFailureListener(new com.palmpay.lib.bridgewrapper.photo.upload.a(24));
        }
        Task<AppUpdateInfo> appUpdateInfo3 = appUpdateManagerCreate.getAppUpdateInfo();
        if (appUpdateInfo3 != null) {
            appUpdateInfo3.addOnCompleteListener(new com.palmpay.lib.bridgewrapper.photo.upload.a(25));
        }
    }
}
