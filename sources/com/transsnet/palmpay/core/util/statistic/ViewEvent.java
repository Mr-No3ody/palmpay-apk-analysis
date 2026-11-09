package com.transsnet.palmpay.core.util.statistic;

/* JADX INFO: loaded from: classes3.dex */
public class ViewEvent extends BaseTrackEvent<ViewEvent> {
    public ViewEvent(String eventName) {
        super(eventName);
        getEventMap().put("event_type", "View_Event");
    }
}
