package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface MonitoringOrBuilder extends MessageLiteOrBuilder {
    Monitoring.MonitoringDestination getConsumerDestinations(int i7);

    int getConsumerDestinationsCount();

    List<Monitoring.MonitoringDestination> getConsumerDestinationsList();

    Monitoring.MonitoringDestination getProducerDestinations(int i7);

    int getProducerDestinationsCount();

    List<Monitoring.MonitoringDestination> getProducerDestinationsList();
}
