package com.transsnet.palmpay.core.util.statistic;

/* JADX INFO: loaded from: classes3.dex */
public class ClickEvent extends BaseTrackEvent<ClickEvent> {
    public ClickEvent(String eventName) {
        super(eventName);
        getEventMap().put("event_type", "Click_Event");
    }
}
