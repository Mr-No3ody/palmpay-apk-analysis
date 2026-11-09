package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface AuthenticationOrBuilder extends MessageLiteOrBuilder {
    AuthProvider getProviders(int i7);

    int getProvidersCount();

    List<AuthProvider> getProvidersList();

    AuthenticationRule getRules(int i7);

    int getRulesCount();

    List<AuthenticationRule> getRulesList();
}
