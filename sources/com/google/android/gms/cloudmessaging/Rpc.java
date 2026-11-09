package com.google.android.gms.cloudmessaging;

import M.n;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.didiglobal.booster.instrument.ShadowScheduledThreadPoolExecutor;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.account.bean.ResetPinVerifyTypeRsp;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class Rpc {
    private static int zza;
    private static PendingIntent zzb;
    private static final Executor zzc = new Executor() { // from class: com.google.android.gms.cloudmessaging.zzy
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    private static final Pattern zzd = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private final Context zzf;
    private final zzw zzg;
    private final ScheduledExecutorService zzh;
    private Messenger zzj;
    private zzd zzk;
    private final n zze = new n(0);
    private final Messenger zzi = new Messenger(new zzae(this, Looper.getMainLooper()));

    public Rpc(@NonNull Context context) {
        this.zzf = context;
        this.zzg = new zzw(context);
        ShadowScheduledThreadPoolExecutor shadowScheduledThreadPoolExecutor = new ShadowScheduledThreadPoolExecutor(1, "\u200bcom.google.android.gms.cloudmessaging.Rpc", true);
        shadowScheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        shadowScheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzh = shadowScheduledThreadPoolExecutor;
    }

    public static /* synthetic */ Task zza(Bundle bundle) throws Exception {
        return zzi(bundle) ? Tasks.forResult(null) : Tasks.forResult(bundle);
    }

    public static void zzc(Rpc rpc, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzc());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        rpc.zzk = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        rpc.zzj = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = zzd.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        rpc.zzh(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (rpc.zze) {
                        int i7 = 0;
                        while (true) {
                            try {
                                n nVar = rpc.zze;
                                if (i7 < nVar.f5695c) {
                                    rpc.zzh((String) nVar.f(i7), intent2.getExtras());
                                    i7++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], ResetPinVerifyTypeRsp.VERIFY_TYPE_ID)) {
                    "Unexpected structured response ".concat(stringExtra2);
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                rpc.zzh(str, intent2.putExtra("error", strSubstring).getExtras());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    @AnyThread
    private final Task zze(Bundle bundle) {
        final String strZzf = zzf();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.zze) {
            this.zze.put(strZzf, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.zzg.zzb() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        zzg(this.zzf, intent);
        intent.putExtra("kid", "|ID|" + strZzf + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.zzi);
        if (this.zzj != null || this.zzk != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.zzj;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.zzk.zzb(messageObtain);
                }
            } catch (RemoteException unused) {
                if (this.zzg.zzb() == 2) {
                    this.zzf.sendBroadcast(intent);
                } else {
                    this.zzf.startService(intent);
                }
            }
        } else if (this.zzg.zzb() == 2) {
            this.zzf.sendBroadcast(intent);
        } else {
            this.zzf.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.zzh.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzac
            @Override // java.lang.Runnable
            public final void run() {
                taskCompletionSource.trySetException(new IOException("TIMEOUT"));
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(zzc, new OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzad
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.zza.zzd(strZzf, scheduledFutureSchedule, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private static synchronized String zzf() {
        int i7;
        i7 = zza;
        zza = i7 + 1;
        return Integer.toString(i7);
    }

    private static synchronized void zzg(Context context, Intent intent) {
        try {
            if (zzb == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                zzb = PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.zza);
            }
            intent.putExtra("app", zzb);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzh(String str, @Nullable Bundle bundle) {
        synchronized (this.zze) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.zze.remove(str);
                if (taskCompletionSource == null) {
                    return;
                }
                taskCompletionSource.setResult(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean zzi(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    @NonNull
    public Task<CloudMessage> getProxiedNotificationData() {
        return this.zzg.zza() >= 241100000 ? zzv.zzb(this.zzf).zzd(5, Bundle.EMPTY).continueWith(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzab
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    @NonNull
    public Task<Void> messageHandled(@NonNull CloudMessage cloudMessage) {
        if (this.zzg.zza() < 233700000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constants.MessagePayloadKeys.MSGID, cloudMessage.getMessageId());
        Integer numZza = cloudMessage.zza();
        if (numZza != null) {
            bundle.putInt(Constants.MessagePayloadKeys.PRODUCT_ID, numZza.intValue());
        }
        return zzv.zzb(this.zzf).zzc(3, bundle);
    }

    @NonNull
    public Task<Bundle> send(@NonNull final Bundle bundle) {
        if (this.zzg.zza() < 12000000) {
            return this.zzg.zzb() != 0 ? zze(bundle).continueWithTask(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzz
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return this.zza.zzb(bundle, task);
                }
            }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return zzv.zzb(this.zzf).zzd(1, bundle).continueWith(zzc, new Continuation() { // from class: com.google.android.gms.cloudmessaging.zzaa
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) throws IOException {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(task.getException()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            }
        });
    }

    @NonNull
    public Task<Void> setRetainProxiedNotifications(boolean z3) {
        if (this.zzg.zza() < 241100000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z3);
        return zzv.zzb(this.zzf).zzc(4, bundle);
    }

    public final /* synthetic */ Task zzb(Bundle bundle, Task task) throws Exception {
        return (task.isSuccessful() && zzi((Bundle) task.getResult())) ? zze(bundle).onSuccessTask(zzc, new SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Rpc.zza((Bundle) obj);
            }
        }) : task;
    }

    public final /* synthetic */ void zzd(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.zze) {
            this.zze.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
