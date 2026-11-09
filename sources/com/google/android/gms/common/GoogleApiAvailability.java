package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.activity.result.a;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.B;
import androidx.core.app.v;
import androidx.core.app.z;
import androidx.core.content.d;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.load.resource.bitmap.n;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.api.internal.zabs;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.service.zaq;
import com.google.android.gms.common.internal.zaf;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    @NonNull
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @GuardedBy("lock")
    private String zac;

    @Nullable
    private com.google.android.gms.common.internal.zad zad;
    private static final Object zaa = new Object();
    private static final GoogleApiAvailability zab = new GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    @NonNull
    public static GoogleApiAvailability getInstance() {
        return zab;
    }

    @NonNull
    public static final Task zaj(@NonNull HasApiKey hasApiKey, @NonNull HasApiKey... hasApiKeyArr) {
        Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (HasApiKey hasApiKey2 : hasApiKeyArr) {
            Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(Arrays.asList(hasApiKeyArr));
        return GoogleApiManager.zab().zah(arrayList);
    }

    @NonNull
    public Task<Void> checkApiAvailability(@NonNull GoogleApi<?> googleApi, @NonNull GoogleApi<?>... googleApiArr) {
        return zaj(googleApi, googleApiArr).onSuccessTask(zab.zaa);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int getClientVersion(@NonNull Context context) {
        return super.getClientVersion(context);
    }

    @Nullable
    public Dialog getErrorDialog(@NonNull Activity activity, int i7, int i10) {
        return getErrorDialog(activity, i7, i10, (DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @Nullable
    @ShowFirstParty
    @KeepForSdk
    public Intent getErrorResolutionIntent(@Nullable Context context, int i7, @Nullable String str) {
        return super.getErrorResolutionIntent(context, i7, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @Nullable
    public PendingIntent getErrorResolutionPendingIntent(@NonNull Context context, int i7, int i10) {
        return super.getErrorResolutionPendingIntent(context, i7, i10);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @NonNull
    public final String getErrorString(int i7) {
        return super.getErrorString(i7);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @HideFirstParty
    public int isGooglePlayServicesAvailable(@NonNull Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i7) {
        return super.isUserResolvableError(i7);
    }

    @NonNull
    @MainThread
    public Task<Void> makeGooglePlayServicesAvailable(@NonNull Activity activity) {
        int i7 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i7);
        if (iIsGooglePlayServicesAvailable == 0) {
            return Tasks.forResult(null);
        }
        zabx zabxVarZaa = zabx.zaa(activity);
        zabxVarZaa.zaf(new ConnectionResult(iIsGooglePlayServicesAvailable, null), 0);
        return zabxVarZaa.zab();
    }

    @TargetApi(26)
    public void setDefaultNotificationChannelId(@NonNull Context context, @NonNull String str) {
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkNotNull(((NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    public boolean showErrorDialogFragment(@NonNull Activity activity, int i7, int i10) {
        return showErrorDialogFragment(activity, i7, i10, (DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(@NonNull Context context, int i7) {
        zac(context, i7, null, getErrorResolutionPendingIntent(context, i7, 0, "n"));
    }

    @Nullable
    public final Dialog zaa(@NonNull Context context, int i7, @Nullable zaj zajVar, @Nullable DialogInterface.OnCancelListener onCancelListener, @Nullable DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2 = null;
        if (i7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(zaf.zac(context, i7));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strZae = zaf.zae(context, i7);
        DialogInterface.OnClickListener onClickListener2 = zajVar;
        if (strZae != null) {
            if (zajVar == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strZae, onClickListener2);
        }
        String strZaa = zaf.zaa(context, i7);
        if (strZaa != null) {
            builder2.setTitle(strZaa);
        }
        new StringBuilder("Creating dialog for Google Play services availability issue. ConnectionResult=").append(i7);
        new IllegalArgumentException();
        return builder2.create();
    }

    public final boolean zab(@NonNull Activity activity, @NonNull LifecycleFragment lifecycleFragment, int i7, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i7, zaj.zad(lifecycleFragment, getErrorResolutionIntent(activity, i7, "d"), 2), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        zah(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final void zac(Context context, int i7, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        int i10;
        String str2;
        new IllegalArgumentException();
        if (i7 == 18) {
            zai(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strZab = zaf.zab(context, i7);
        String strZad = zaf.zad(context, i7);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) Preconditions.checkNotNull(context.getSystemService("notification"));
        B b7 = new B(context, null);
        b7.f15909m = true;
        b7.d(16, true);
        b7.f15901e = B.b(strZab);
        z zVar = new z(3);
        zVar.f16011c = B.b(strZad);
        b7.f(zVar);
        boolean zIsWearable = DeviceProperties.isWearable(context);
        int i11 = android.R.drawable.stat_sys_warning;
        if (zIsWearable) {
            int i12 = context.getApplicationInfo().icon;
            if (i12 != 0) {
                i11 = i12;
            }
            b7.f15917v.icon = i11;
            b7.f15906j = 2;
            if (DeviceProperties.isWearableWithoutPlayStore(context)) {
                b7.f15898b.add(new v(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), pendingIntent));
            } else {
                b7.f15903g = pendingIntent;
            }
        } else {
            b7.f15917v.icon = android.R.drawable.stat_sys_warning;
            String string = resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker);
            b7.f15917v.tickerText = B.b(string);
            b7.f15917v.when = System.currentTimeMillis();
            b7.f15903g = pendingIntent;
            b7.f15902f = B.b(strZad);
        }
        if (PlatformVersion.isAtLeastO()) {
            Preconditions.checkState(PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string2 = context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(n.g(string2));
                } else if (!string2.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string2);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            b7.t = str2;
        }
        Notification notificationA = b7.a();
        if (i7 == 1 || i7 == 2 || i7 == 3) {
            GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, notificationA);
    }

    public final boolean zad(@NonNull Context context, @NonNull ConnectionResult connectionResult, int i7) {
        PendingIntent errorResolutionPendingIntent;
        if (InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zac(context, connectionResult.getErrorCode(), null, zak.zaa(context, 0, GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i7, true), zak.zaa | 134217728));
        zae(context, connectionResult, false);
        return true;
    }

    public final void zae(@NonNull Context context, @NonNull ConnectionResult connectionResult, boolean z3) {
        Integer clientMethodKey = connectionResult.getClientMethodKey();
        com.google.android.gms.common.internal.zab zabVar = new com.google.android.gms.common.internal.zab(clientMethodKey == null ? -1 : clientMethodKey.intValue(), context.getPackageName(), System.currentTimeMillis(), connectionResult.getErrorCode(), z3);
        if (this.zad == null) {
            this.zad = new zaq(context);
        }
        this.zad.zaa(zabVar);
    }

    @NonNull
    public final Dialog zaf(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(zaf.zac(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        zah(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    @Nullable
    public final zabs zag(Context context, zabr zabrVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabs zabsVar = new zabs(zabrVar);
        d.f(context, zabsVar, intentFilter);
        zabsVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabsVar;
        }
        zabrVar.zaa();
        zabsVar.zab();
        return null;
    }

    public final void zah(Activity activity, Dialog dialog, String str, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof E) {
                SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((E) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void zai(Context context) {
        new zad(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    @Nullable
    public Dialog getErrorDialog(@NonNull Activity activity, int i7, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i7, zaj.zab(activity, getErrorResolutionIntent(activity, i7, "d"), i10), onCancelListener, null);
    }

    @Nullable
    public PendingIntent getErrorResolutionPendingIntent(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        return connectionResult.hasResolution() ? connectionResult.getResolution() : getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @ShowFirstParty
    @KeepForSdk
    public int isGooglePlayServicesAvailable(@NonNull Context context, int i7) {
        return super.isGooglePlayServicesAvailable(context, i7);
    }

    public boolean showErrorDialogFragment(@NonNull Activity activity, int i7, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i7, i10, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zah(activity, errorDialog, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @NonNull
    public Task<Void> checkApiAvailability(@NonNull HasApiKey<?> hasApiKey, @NonNull HasApiKey<?>... hasApiKeyArr) {
        return zaj(hasApiKey, hasApiKeyArr).onSuccessTask(zac.zaa);
    }

    public void showErrorNotification(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        zac(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
        zae(context, connectionResult, false);
    }

    @Nullable
    public Dialog getErrorDialog(@NonNull Fragment fragment, int i7, int i10) {
        return getErrorDialog(fragment, i7, i10, (DialogInterface.OnCancelListener) null);
    }

    public boolean showErrorDialogFragment(@NonNull Activity activity, int i7, @NonNull a aVar, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogZaa = zaa(activity, i7, null, onCancelListener, new zaa(this, activity, i7, aVar));
        if (dialogZaa == null) {
            return false;
        }
        zah(activity, dialogZaa, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Nullable
    public Dialog getErrorDialog(@NonNull Fragment fragment, int i7, int i10, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i7, zaj.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i7, "d"), i10), onCancelListener, null);
    }
}
