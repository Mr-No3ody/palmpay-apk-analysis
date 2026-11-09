package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.content.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaab;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zacm;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {

    @NonNull
    protected final GoogleApiManager zaa;
    private final Context zab;

    @Nullable
    private final String zac;

    @Nullable
    private final AttributionSourceWrapper zad;
    private final Api zae;
    private final Api.ApiOptions zaf;
    private final ApiKey zag;
    private final Looper zah;
    private final int zai;
    private final GoogleApiClient zaj;
    private final StatusExceptionMapper zak;

    @KeepForSdk
    public static class Settings {

        @NonNull
        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS = new Builder().build();

        @NonNull
        public final StatusExceptionMapper zaa;

        @NonNull
        public final Looper zab;

        @KeepForSdk
        public static class Builder {
            private StatusExceptionMapper zaa;
            private Looper zab;

            @KeepForSdk
            public Builder() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NonNull
            @KeepForSdk
            public Settings build() {
                if (this.zaa == null) {
                    this.zaa = new ApiExceptionMapper();
                }
                if (this.zab == null) {
                    this.zab = Looper.getMainLooper();
                }
                return new Settings(this.zaa, null, this.zab, 0 == true ? 1 : 0);
            }

            @NonNull
            @KeepForSdk
            public Builder setLooper(@NonNull Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zab = looper;
                return this;
            }

            @NonNull
            @KeepForSdk
            public Builder setMapper(@NonNull StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zaa = statusExceptionMapper;
                return this;
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.zaa = statusExceptionMapper;
            this.zab = looper;
        }

        public /* synthetic */ Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper, byte[] bArr) {
            this(statusExceptionMapper, null, looper);
        }
    }

    @KeepForSdk
    @MainThread
    public GoogleApi(@NonNull Activity activity, @NonNull Api<O> api, @NonNull O o10, @NonNull Settings settings) {
        this(activity, activity, api, o10, settings);
    }

    private final BaseImplementation.ApiMethodImpl zad(int i7, @NonNull BaseImplementation.ApiMethodImpl apiMethodImpl) {
        apiMethodImpl.zak();
        this.zaa.zak(this, i7, apiMethodImpl);
        return apiMethodImpl;
    }

    private final Task zae(int i7, @NonNull TaskApiCall taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.zal(this, i7, taskApiCall, taskCompletionSource, this.zak);
        return taskCompletionSource.getTask();
    }

    @NonNull
    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.zaj;
    }

    @NonNull
    @KeepForSdk
    public ClientSettings.Builder createClientSettingsBuilder() {
        Account account;
        GoogleSignInAccount googleSignInAccount;
        GoogleSignInAccount googleSignInAccount2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions apiOptions = this.zaf;
        boolean z3 = apiOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions;
        if (!z3 || (googleSignInAccount2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).getGoogleSignInAccount()) == null) {
            account = apiOptions instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) apiOptions).getAccount() : null;
        } else {
            account = googleSignInAccount2.getAccount();
        }
        builder.zaa(account);
        Set<Scope> requestedScopes = (!z3 || (googleSignInAccount = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).getGoogleSignInAccount()) == null) ? Collections.EMPTY_SET : googleSignInAccount.getRequestedScopes();
        builder.zab(requestedScopes);
        Context context = this.zab;
        builder.zac(context.getClass().getName());
        builder.setRealClientPackageName(context.getPackageName());
        return builder;
    }

    @NonNull
    @KeepForSdk
    public Task<Boolean> disconnectService() {
        return this.zaa.zaj(this);
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(@NonNull T t) {
        zad(2, t);
        return t;
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(@NonNull T t) {
        zad(0, t);
        return t;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(@NonNull T t, @NonNull U u6) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(u6);
        Preconditions.checkNotNull(t.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(u6.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(Objects.equal(t.getListenerKey(), u6.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zan(this, t, u6, zab.zaa);
    }

    @NonNull
    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@NonNull ListenerHolder.ListenerKey<?> listenerKey) {
        return doUnregisterEventListener(listenerKey, 0);
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(@NonNull T t) {
        zad(1, t);
        return t;
    }

    @Nullable
    public String getApiFallbackAttributionTag(@NonNull Context context) {
        return null;
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    @NonNull
    public final ApiKey<O> getApiKey() {
        return this.zag;
    }

    @NonNull
    @KeepForSdk
    public O getApiOptions() {
        return (O) this.zaf;
    }

    @NonNull
    @KeepForSdk
    public Context getApplicationContext() {
        return this.zab;
    }

    @Nullable
    @KeepForSdk
    public String getContextAttributionTag() {
        return this.zac;
    }

    @Nullable
    @KeepForSdk
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    @NonNull
    @KeepForSdk
    public Looper getLooper() {
        return this.zah;
    }

    @NonNull
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@NonNull L l5, @NonNull String str) {
        return ListenerHolders.createListenerHolder(l5, this.zah, str);
    }

    public final int zab() {
        return this.zai;
    }

    public final zacm zac(Context context, Handler handler) {
        return new zacm(context, handler, createClientSettingsBuilder().build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final Api.Client zaf(Looper looper, zabk zabkVar) {
        ClientSettings clientSettingsBuild = createClientSettingsBuilder().build();
        Api.Client clientBuildClient = ((Api.AbstractClientBuilder) Preconditions.checkNotNull(this.zae.zab())).buildClient(this.zab, looper, clientSettingsBuild, this.zaf, (GoogleApiClient.ConnectionCallbacks) zabkVar, (GoogleApiClient.OnConnectionFailedListener) zabkVar);
        AttributionSourceWrapper attributionSourceWrapper = this.zad;
        if (attributionSourceWrapper != null && (clientBuildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientBuildClient).setAttributionSourceWrapper(attributionSourceWrapper);
            return clientBuildClient;
        }
        if (attributionSourceWrapper != null && (clientBuildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) clientBuildClient).zab(attributionSourceWrapper);
            return clientBuildClient;
        }
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (clientBuildClient instanceof BaseGmsClient)) {
            ((BaseGmsClient) clientBuildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (clientBuildClient instanceof NonGmsServiceBrokerClient)) {
            ((NonGmsServiceBrokerClient) clientBuildClient).zaa(contextAttributionTag);
        }
        return clientBuildClient;
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Activity activity, @NonNull Api<O> api, @NonNull O o10, @NonNull StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        builder.setLooper(activity.getMainLooper());
        this(activity, (Api) api, (Api.ApiOptions) o10, builder.build());
    }

    @NonNull
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(@NonNull TaskApiCall<A, TResult> taskApiCall) {
        return zae(2, taskApiCall);
    }

    @NonNull
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(@NonNull TaskApiCall<A, TResult> taskApiCall) {
        return zae(0, taskApiCall);
    }

    @NonNull
    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@NonNull ListenerHolder.ListenerKey<?> listenerKey, int i7) {
        Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zaa.zao(this, listenerKey, i7);
    }

    @NonNull
    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(@NonNull TaskApiCall<A, TResult> taskApiCall) {
        return zae(1, taskApiCall);
    }

    private GoogleApi(@NonNull Context context, @Nullable Activity activity, Api api, Api.ApiOptions apiOptions, Settings settings) {
        String apiFallbackAttributionTag;
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) Preconditions.checkNotNull(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            apiFallbackAttributionTag = i7 >= 30 ? c.a(context) : null;
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = i7 >= 31 ? new AttributionSourceWrapper(context.getAttributionSource()) : null;
        this.zae = api;
        this.zaf = apiOptions;
        this.zah = settings.zab;
        ApiKey sharedApiKey = ApiKey.getSharedApiKey(api, apiOptions, apiFallbackAttributionTag);
        this.zag = sharedApiKey;
        this.zaj = new zabq(this);
        GoogleApiManager googleApiManagerZaa = GoogleApiManager.zaa(context2);
        this.zaa = googleApiManagerZaa;
        this.zai = googleApiManagerZaa.zac();
        this.zak = settings.zaa;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaab.zaa(activity, googleApiManagerZaa, sharedApiKey);
        }
        googleApiManagerZaa.zad(this);
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(@NonNull RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.checkNotNull(registrationMethods);
        Preconditions.checkNotNull(registrationMethods.register.getListenerKey(), "Listener has already been released.");
        UnregisterListenerMethod unregisterListenerMethod = registrationMethods.zaa;
        Preconditions.checkNotNull(unregisterListenerMethod.getListenerKey(), "Listener has already been released.");
        return this.zaa.zan(this, registrationMethods.register, unregisterListenerMethod, registrationMethods.zab);
    }

    @KeepForSdk
    public GoogleApi(@NonNull Context context, @NonNull Api<O> api, @NonNull O o10, @NonNull Settings settings) {
        this(context, null, api, o10, settings);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Context context, @NonNull Api<O> api, @NonNull O o10, @NonNull StatusExceptionMapper statusExceptionMapper) {
        Settings.Builder builder = new Settings.Builder();
        builder.setMapper(statusExceptionMapper);
        this(context, api, o10, builder.build());
    }
}
