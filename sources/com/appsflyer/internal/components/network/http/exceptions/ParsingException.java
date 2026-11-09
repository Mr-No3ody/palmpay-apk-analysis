package com.appsflyer.internal.components.network.http.exceptions;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFe1wSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFe1wSDK<String> getMediationNetwork;

    public ParsingException(String str, Throwable th, @NonNull AFe1wSDK<String> aFe1wSDK) {
        super(str, th);
        this.getMediationNetwork = aFe1wSDK;
    }

    @NonNull
    public AFe1wSDK<String> getRawResponse() {
        return this.getMediationNetwork;
    }
}
