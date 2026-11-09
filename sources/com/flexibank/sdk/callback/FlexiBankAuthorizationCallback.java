package com.flexibank.sdk.callback;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u001c\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/flexibank/sdk/callback/FlexiBankAuthorizationCallback;", "", "onSuccess", "", "token", "", "memberId", "phoneNumber", "securityAlert", "", "firstLogin", "onError", "errorCode", "errorMessage", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface FlexiBankAuthorizationCallback {
    void onError(@Nullable String errorCode, @Nullable String errorMessage);

    void onSuccess(@Nullable String token, @Nullable String memberId, @Nullable String phoneNumber, boolean securityAlert, boolean firstLogin);
}
