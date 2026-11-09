package com.google.firebase.remoteconfig.internal;

import N8.q0;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigAutoFetch {
    private static final int MAXIMUM_FETCH_ATTEMPTS = 3;
    private static final String REALTIME_DISABLED_KEY = "featureDisabled";
    private static final String REALTIME_RETRY_INTERVAL = "retryIntervalSeconds";
    private static final String TEMPLATE_VERSION_KEY = "latestTemplateVersionNumber";
    private final ConfigCacheClient activatedCache;
    private final ConfigFetchHandler configFetchHandler;

    @GuardedBy("this")
    private final Set<ConfigUpdateListener> eventListeners;
    private final HttpURLConnection httpURLConnection;
    private final ConfigUpdateListener retryCallback;
    private final ScheduledExecutorService scheduledExecutorService;
    private final ConfigSharedPrefsClient sharedPrefsClient;
    private final Random random = new Random();
    private boolean isInBackground = false;
    private final Clock clock = DefaultClock.getInstance();

    public ConfigAutoFetch(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Set<ConfigUpdateListener> set, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService, ConfigSharedPrefsClient configSharedPrefsClient) {
        this.httpURLConnection = httpURLConnection;
        this.configFetchHandler = configFetchHandler;
        this.activatedCache = configCacheClient;
        this.eventListeners = set;
        this.retryCallback = configUpdateListener;
        this.scheduledExecutorService = scheduledExecutorService;
        this.sharedPrefsClient = configSharedPrefsClient;
    }

    private void autoFetch(final int i7, final long j6) {
        if (i7 == 0) {
            propagateErrors(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
        } else {
            this.scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    ConfigAutoFetch.this.fetchLatestConfig(i7, j6);
                }
            }, this.random.nextInt(4), TimeUnit.SECONDS);
        }
    }

    private synchronized void executeAllListenerCallbacks(ConfigUpdate configUpdate) {
        Iterator<ConfigUpdateListener> it = this.eventListeners.iterator();
        while (it.hasNext()) {
            it.next().onUpdate(configUpdate);
        }
    }

    private static Boolean fetchResponseIsUpToDate(ConfigFetchHandler.FetchResponse fetchResponse, long j6) {
        if (fetchResponse.getFetchedConfigs() != null) {
            return Boolean.valueOf(fetchResponse.getFetchedConfigs().getTemplateVersionNumber() >= j6);
        }
        return Boolean.valueOf(fetchResponse.getStatus() == 1);
    }

    private void handleNotifications(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        loop0: while (true) {
            String strJ = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break loop0;
                }
                strJ = q0.j(strJ, line);
                if (line.contains("}")) {
                    strJ = parseAndValidateConfigUpdateMessage(strJ);
                    if (strJ.isEmpty()) {
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject(strJ);
                if (jSONObject.has(REALTIME_DISABLED_KEY) && jSONObject.getBoolean(REALTIME_DISABLED_KEY)) {
                    this.retryCallback.onError(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
                    break;
                }
                if (isEventListenersEmpty()) {
                    break;
                }
                if (jSONObject.has(TEMPLATE_VERSION_KEY)) {
                    long templateVersionNumber = this.configFetchHandler.getTemplateVersionNumber();
                    long j6 = jSONObject.getLong(TEMPLATE_VERSION_KEY);
                    if (j6 > templateVersionNumber) {
                        autoFetch(3, j6);
                    }
                }
                if (jSONObject.has(REALTIME_RETRY_INTERVAL)) {
                    updateBackoffMetadataWithRetryInterval(jSONObject.getInt(REALTIME_RETRY_INTERVAL));
                }
            } catch (JSONException e10) {
                propagateErrors(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e10.getCause(), FirebaseRemoteConfigException.Code.CONFIG_UPDATE_MESSAGE_INVALID));
                Log.e(FirebaseRemoteConfig.TAG, "Unable to parse latest config update message.", e10);
            }
        }
        bufferedReader.close();
    }

    private synchronized boolean isEventListenersEmpty() {
        return this.eventListeners.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$fetchLatestConfig$0(Task task, Task task2, long j6, int i7, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task2.getException()));
        }
        ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task.getResult();
        ConfigContainer configContainerBuild = (ConfigContainer) task2.getResult();
        if (!fetchResponseIsUpToDate(fetchResponse, j6).booleanValue()) {
            autoFetch(i7, j6);
            return Tasks.forResult(null);
        }
        if (fetchResponse.getFetchedConfigs() == null) {
            return Tasks.forResult(null);
        }
        if (configContainerBuild == null) {
            configContainerBuild = ConfigContainer.newBuilder().build();
        }
        Set<String> changedParams = configContainerBuild.getChangedParams(fetchResponse.getFetchedConfigs());
        if (changedParams.isEmpty()) {
            return Tasks.forResult(null);
        }
        executeAllListenerCallbacks(ConfigUpdate.create(changedParams));
        return Tasks.forResult(null);
    }

    private String parseAndValidateConfigUpdateMessage(String str) {
        int iIndexOf = str.indexOf(123);
        int iLastIndexOf = str.lastIndexOf(125);
        return (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : str.substring(iIndexOf, iLastIndexOf + 1);
    }

    private synchronized void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<ConfigUpdateListener> it = this.eventListeners.iterator();
        while (it.hasNext()) {
            it.next().onError(firebaseRemoteConfigException);
        }
    }

    private synchronized void updateBackoffMetadataWithRetryInterval(int i7) {
        this.sharedPrefsClient.setRealtimeBackoffEndTime(new Date(new Date(this.clock.currentTimeMillis()).getTime() + (((long) i7) * 1000)));
    }

    @VisibleForTesting
    public synchronized Task<Void> fetchLatestConfig(int i7, final long j6) throws Throwable {
        final int i10 = i7 - 1;
        try {
            try {
                final Task<ConfigFetchHandler.FetchResponse> taskFetchNowWithTypeAndAttemptNumber = this.configFetchHandler.fetchNowWithTypeAndAttemptNumber(ConfigFetchHandler.FetchType.REALTIME, 3 - i10);
                final Task<ConfigContainer> task = this.activatedCache.get();
                return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskFetchNowWithTypeAndAttemptNumber, task}).continueWithTask(this.scheduledExecutorService, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.a
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task2) {
                        return this.f23063a.lambda$fetchLatestConfig$0(taskFetchNowWithTypeAndAttemptNumber, task, j6, i10, task2);
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @VisibleForTesting
    public void listenForNotifications() {
        HttpURLConnection httpURLConnection = this.httpURLConnection;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                handleNotifications(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException unused) {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException unused3) {
        }
    }

    public void setIsInBackground(boolean z3) {
        this.isInBackground = z3;
    }
}
