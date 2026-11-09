package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface UsageOrBuilder extends MessageLiteOrBuilder {
    String getProducerNotificationChannel();

    ByteString getProducerNotificationChannelBytes();

    String getRequirements(int i7);

    ByteString getRequirementsBytes(int i7);

    int getRequirementsCount();

    List<String> getRequirementsList();

    UsageRule getRules(int i7);

    int getRulesCount();

    List<UsageRule> getRulesList();
}
