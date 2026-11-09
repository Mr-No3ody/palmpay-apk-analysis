package com.transsnet.adsdk.data.event;

/* JADX INFO: loaded from: classes3.dex */
public class AdEvent {
    public String adId;
    public long adShowTime;
    public String adSlotId;
    public String behaviorId;
    public int count = 1;
    public String eventSubType;
    public String eventType;
    public String pointWindowX;
    public String pointWindowY;
    public String relatedId;

    public AdEvent(String adId, long adShowTime, String adSlotId, String eventType, String eventSubType, String pointWindowX, String pointWindowY, String behaviorId, String relatedId) {
        this.adId = adId;
        this.adShowTime = adShowTime;
        this.adSlotId = adSlotId;
        this.eventType = eventType;
        this.eventSubType = eventSubType;
        this.pointWindowX = pointWindowX;
        this.pointWindowY = pointWindowY;
        this.behaviorId = behaviorId;
        this.relatedId = relatedId;
    }

    public String getEventKey() {
        return this.adSlotId + this.adId + this.eventType + this.eventSubType;
    }

    public boolean isSameEvent(AdEvent adEvent) {
        if (adEvent == null) {
            return false;
        }
        String eventKey = getEventKey();
        String eventKey2 = adEvent.getEventKey();
        if (eventKey == null || !eventKey.equals(eventKey2)) {
            return eventKey2 == null && eventKey == null;
        }
        return true;
    }
}
