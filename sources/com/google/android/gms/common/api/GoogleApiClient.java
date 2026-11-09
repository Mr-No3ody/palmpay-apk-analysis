package com.google.android.gms.common.api;

import M.f;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.F;
import androidx.fragment.app.E;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zaaz;
import com.google.android.gms.common.api.internal.zacs;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zas;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class GoogleApiClient {

    @NonNull
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private static final Set zaa = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public static void dumpAll(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
            try {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2);
                sb2.append(str);
                sb2.append("  ");
                String string = sb2.toString();
                int i7 = 0;
                for (GoogleApiClient googleApiClient : set) {
                    printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i7);
                    googleApiClient.dump(string, fileDescriptor, printWriter, strArr);
                    i7++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
        }
        return set;
    }

    @NonNull
    public abstract ConnectionResult blockingConnect();

    @NonNull
    public abstract ConnectionResult blockingConnect(long j6, @NonNull TimeUnit timeUnit);

    @NonNull
    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i7) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr);

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract ConnectionResult getConnectionResult(@NonNull Api<?> api);

    @NonNull
    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(@NonNull Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(@NonNull Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean maybeSignIn(@NonNull SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    @NonNull
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@NonNull L l5) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(@NonNull E e10);

    public abstract void unregisterConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    public void zao(zacs zacsVar) {
        throw new UnsupportedOperationException();
    }

    public void zap(zacs zacsVar) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static final class Builder {

        @Nullable
        private Account zaa;
        private final Set zab;
        private final Set zac;
        private int zad;
        private View zae;
        private String zaf;
        private String zag;
        private final Map zah;
        private final Context zai;
        private final Map zaj;
        private LifecycleActivity zak;
        private int zal;

        @Nullable
        private OnConnectionFailedListener zam;
        private Looper zan;
        private GoogleApiAvailability zao;
        private Api.AbstractClientBuilder zap;
        private final ArrayList zaq;
        private final ArrayList zar;

        public Builder(@NonNull Context context) {
            this.zab = new HashSet();
            this.zac = new HashSet();
            this.zah = new f(0);
            this.zaj = new f(0);
            this.zal = -1;
            this.zao = GoogleApiAvailability.getInstance();
            this.zap = com.google.android.gms.signin.zad.zac;
            this.zaq = new ArrayList();
            this.zar = new ArrayList();
            this.zai = context;
            this.zan = context.getMainLooper();
            this.zaf = context.getPackageName();
            this.zag = context.getClass().getName();
        }

        private final void zab(Api api, @Nullable Api.ApiOptions apiOptions, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zaa(), "Base client builder must not be null")).getImpliedScopes(apiOptions));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.zah.put(api, new com.google.android.gms.common.internal.zae(hashSet));
        }

        @NonNull
        public Builder addApi(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zaa(), "Base client builder must not be null")).getImpliedScopes(null);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @NonNull
        public <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@NonNull Api<O> api, @NonNull O o10, @NonNull Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o10, "Null options are not permitted for this Api");
            this.zaj.put(api, o10);
            zab(api, o10, scopeArr);
            return this;
        }

        @NonNull
        public Builder addConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zaq.add(connectionCallbacks);
            return this;
        }

        @NonNull
        public Builder addOnConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zar.add(onConnectionFailedListener);
            return this;
        }

        @NonNull
        public Builder addScope(@NonNull Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zab.add(scope);
            return this;
        }

        @NonNull
        public GoogleApiClient build() {
            Map map = this.zaj;
            Preconditions.checkArgument(!map.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings clientSettingsZaa = zaa();
            Map mapZaa = clientSettingsZaa.zaa();
            f fVar = new f(0);
            f fVar2 = new f(0);
            ArrayList arrayList = new ArrayList();
            boolean z3 = false;
            Api api = null;
            for (Api api2 : map.keySet()) {
                Object obj = map.get(api2);
                boolean z8 = mapZaa.get(api2) != null;
                fVar.put(api2, Boolean.valueOf(z8));
                zas zasVar = new zas(api2, z8);
                arrayList.add(zasVar);
                Api.AbstractClientBuilder abstractClientBuilder = (Api.AbstractClientBuilder) Preconditions.checkNotNull(api2.zab());
                Api.Client clientBuildClient = abstractClientBuilder.buildClient(this.zai, this.zan, clientSettingsZaa, obj, (ConnectionCallbacks) zasVar, (OnConnectionFailedListener) zasVar);
                fVar2.put(api2.zac(), clientBuildClient);
                if (abstractClientBuilder.getPriority() == 1) {
                    z3 = obj != null;
                }
                if (clientBuildClient.providesSignIn()) {
                    if (api != null) {
                        String strZad = api2.zad();
                        String strZad2 = api.zad();
                        throw new IllegalStateException(F.d(new StringBuilder(String.valueOf(strZad).length() + 21 + String.valueOf(strZad2).length()), strZad, " cannot be used with ", strZad2));
                    }
                    api = api2;
                }
            }
            if (api != null) {
                if (z3) {
                    String strZad3 = api.zad();
                    throw new IllegalStateException(F.d(new StringBuilder(String.valueOf(strZad3).length() + 82), "With using ", strZad3, ", GamesOptions can only be specified within GoogleSignInOptions.Builder"));
                }
                Preconditions.checkState(this.zaa == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.zad());
                Preconditions.checkState(this.zab.equals(this.zac), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.zad());
            }
            zaaz zaazVar = new zaaz(this.zai, new ReentrantLock(), this.zan, clientSettingsZaa, this.zao, this.zap, fVar, this.zaq, this.zar, fVar2, this.zal, zaaz.zaf(fVar2.values(), true), arrayList);
            synchronized (GoogleApiClient.zaa) {
                GoogleApiClient.zaa.add(zaazVar);
            }
            if (this.zal >= 0) {
                zak.zaa(this.zak).zab(this.zal, zaazVar, this.zam);
            }
            return zaazVar;
        }

        @NonNull
        public Builder enableAutoManage(@NonNull E e10, int i7, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) e10);
            Preconditions.checkArgument(i7 >= 0, "clientId must be non-negative");
            this.zal = i7;
            this.zam = onConnectionFailedListener;
            this.zak = lifecycleActivity;
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String str) {
            this.zaa = str == null ? null : new Account(str, AccountType.GOOGLE);
            return this;
        }

        @NonNull
        public Builder setGravityForPopups(int i7) {
            this.zad = i7;
            return this;
        }

        @NonNull
        public Builder setHandler(@NonNull Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zan = handler.getLooper();
            return this;
        }

        @NonNull
        public Builder setViewForPopups(@NonNull View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.zae = view;
            return this;
        }

        @NonNull
        public Builder useDefaultAccount() {
            setAccountName("<<default account>>");
            return this;
        }

        @NonNull
        public final ClientSettings zaa() {
            SignInOptions signInOptions = SignInOptions.zaa;
            Map map = this.zaj;
            Api api = com.google.android.gms.signin.zad.zag;
            if (map.containsKey(api)) {
                signInOptions = (SignInOptions) map.get(api);
            }
            return new ClientSettings(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, signInOptions, false);
        }

        @NonNull
        public Builder enableAutoManage(@NonNull E e10, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(e10, 0, onConnectionFailedListener);
            return this;
        }

        @NonNull
        public <T extends Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api, @NonNull Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            zab(api, null, scopeArr);
            return this;
        }

        @NonNull
        public <O extends Api.ApiOptions.HasOptions> Builder addApi(@NonNull Api<O> api, @NonNull O o10) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o10, "Null options are not permitted for this Api");
            this.zaj.put(api, o10);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zaa(), "Base client builder must not be null")).getImpliedScopes(o10);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        public Builder(@NonNull Context context, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zaq.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zar.add(onConnectionFailedListener);
        }
    }
}
