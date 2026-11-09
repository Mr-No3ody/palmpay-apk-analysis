package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface QuotaOrBuilder extends MessageLiteOrBuilder {
    QuotaLimit getLimits(int i7);

    int getLimitsCount();

    List<QuotaLimit> getLimitsList();

    MetricRule getMetricRules(int i7);

    int getMetricRulesCount();

    List<MetricRule> getMetricRulesList();
}
