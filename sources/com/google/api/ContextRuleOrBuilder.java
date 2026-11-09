package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ContextRuleOrBuilder extends MessageLiteOrBuilder {
    String getAllowedRequestExtensions(int i7);

    ByteString getAllowedRequestExtensionsBytes(int i7);

    int getAllowedRequestExtensionsCount();

    List<String> getAllowedRequestExtensionsList();

    String getAllowedResponseExtensions(int i7);

    ByteString getAllowedResponseExtensionsBytes(int i7);

    int getAllowedResponseExtensionsCount();

    List<String> getAllowedResponseExtensionsList();

    String getProvided(int i7);

    ByteString getProvidedBytes(int i7);

    int getProvidedCount();

    List<String> getProvidedList();

    String getRequested(int i7);

    ByteString getRequestedBytes(int i7);

    int getRequestedCount();

    List<String> getRequestedList();

    String getSelector();

    ByteString getSelectorBytes();
}
