package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface EndpointOrBuilder extends MessageLiteOrBuilder {
    @Deprecated
    String getAliases(int i7);

    @Deprecated
    ByteString getAliasesBytes(int i7);

    @Deprecated
    int getAliasesCount();

    @Deprecated
    List<String> getAliasesList();

    boolean getAllowCors();

    String getFeatures(int i7);

    ByteString getFeaturesBytes(int i7);

    int getFeaturesCount();

    List<String> getFeaturesList();

    String getName();

    ByteString getNameBytes();

    String getTarget();

    ByteString getTargetBytes();
}
