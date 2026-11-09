package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.IntentSender;
import androidx.activity.result.a;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.install.model.AppUpdateType;

/* JADX INFO: loaded from: classes2.dex */
public interface AppUpdateManager {
    @NonNull
    Task<Void> completeUpdate();

    @NonNull
    Task<AppUpdateInfo> getAppUpdateInfo();

    void registerListener(@NonNull InstallStateUpdatedListener installStateUpdatedListener);

    Task<Integer> startUpdateFlow(@NonNull AppUpdateInfo appUpdateInfo, @NonNull Activity activity, @NonNull AppUpdateOptions appUpdateOptions);

    @Deprecated
    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @AppUpdateType int i7, @NonNull Activity activity, int i10) throws IntentSender.SendIntentException;

    @Deprecated
    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @AppUpdateType int i7, @NonNull IntentSenderForResultStarter intentSenderForResultStarter, int i10) throws IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @NonNull Activity activity, @NonNull AppUpdateOptions appUpdateOptions, int i7) throws IntentSender.SendIntentException;

    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @NonNull a aVar, @NonNull AppUpdateOptions appUpdateOptions);

    boolean startUpdateFlowForResult(@NonNull AppUpdateInfo appUpdateInfo, @NonNull IntentSenderForResultStarter intentSenderForResultStarter, @NonNull AppUpdateOptions appUpdateOptions, int i7) throws IntentSender.SendIntentException;

    void unregisterListener(@NonNull InstallStateUpdatedListener installStateUpdatedListener);
}
