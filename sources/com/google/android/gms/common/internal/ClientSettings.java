package com.google.android.gms.common.internal;

import M.g;
import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class ClientSettings {

    @Nullable
    private final Account zaa;
    private final Set zab;
    private final Set zac;
    private final Map zad;
    private final int zae;

    @Nullable
    private final View zaf;
    private final String zag;
    private final String zah;
    private final SignInOptions zai;
    private Integer zaj;

    @KeepForSdk
    public static final class Builder {

        @Nullable
        private Account zaa;
        private g zab;
        private String zac;
        private String zad;
        private final SignInOptions zae = SignInOptions.zaa;

        @NonNull
        @KeepForSdk
        public ClientSettings build() {
            return new ClientSettings(this.zaa, this.zab, null, 0, null, this.zac, this.zad, this.zae, false);
        }

        @NonNull
        @KeepForSdk
        public Builder setRealClientPackageName(@NonNull String str) {
            this.zac = str;
            return this;
        }

        @NonNull
        public final Builder zaa(@Nullable Account account) {
            this.zaa = account;
            return this;
        }

        @NonNull
        public final Builder zab(@NonNull Collection collection) {
            if (this.zab == null) {
                this.zab = new g(0);
            }
            this.zab.addAll(collection);
            return this;
        }

        @NonNull
        public final Builder zac(@NonNull String str) {
            this.zad = str;
            return this;
        }
    }

    @KeepForSdk
    public ClientSettings(@NonNull Account account, @NonNull Set<Scope> set, @NonNull Map<Api<?>, zae> map, int i7, @Nullable View view, @NonNull String str, @NonNull String str2, @Nullable SignInOptions signInOptions) {
        this(account, set, map, i7, view, str, str2, signInOptions, false);
    }

    @NonNull
    @KeepForSdk
    public static ClientSettings createDefault(@NonNull Context context) {
        return new GoogleApiClient.Builder(context).zaa();
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    public Account getAccount() {
        return this.zaa;
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    @Deprecated
    public String getAccountName() {
        Account account = this.zaa;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @NonNull
    @KeepForSdk
    public Account getAccountOrDefault() {
        Account account = this.zaa;
        return account != null ? account : new Account("<<default account>>", AccountType.GOOGLE);
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getAllRequestedScopes() {
        return this.zac;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getApplicableScopes(@NonNull Api<?> api) {
        zae zaeVar = (zae) this.zad.get(api);
        if (zaeVar != null) {
            Set set = zaeVar.zaa;
            if (!set.isEmpty()) {
                HashSet hashSet = new HashSet(this.zab);
                hashSet.addAll(set);
                return hashSet;
            }
        }
        return this.zab;
    }

    @KeepForSdk
    public int getGravityForPopups() {
        return this.zae;
    }

    @NonNull
    @KeepForSdk
    public String getRealClientPackageName() {
        return this.zag;
    }

    @NonNull
    @KeepForSdk
    public Set<Scope> getRequiredScopes() {
        return this.zab;
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    public View getViewForPopups() {
        return this.zaf;
    }

    @NonNull
    public final Map zaa() {
        return this.zad;
    }

    @androidx.annotation.Nullable
    public final String zab() {
        return this.zah;
    }

    @NonNull
    public final SignInOptions zac() {
        return this.zai;
    }

    @androidx.annotation.Nullable
    public final Integer zad() {
        return this.zaj;
    }

    public final void zae(@NonNull Integer num) {
        this.zaj = num;
    }

    public ClientSettings(@Nullable Account account, @NonNull Set set, @NonNull Map map, int i7, @Nullable View view, @NonNull String str, @NonNull String str2, @Nullable SignInOptions signInOptions, boolean z3) {
        this.zaa = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.zab = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.zad = map;
        this.zaf = view;
        this.zae = i7;
        this.zag = str;
        this.zah = str2;
        this.zai = signInOptions == null ? SignInOptions.zaa : signInOptions;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((zae) it.next()).zaa);
        }
        this.zac = Collections.unmodifiableSet(hashSet);
    }
}
