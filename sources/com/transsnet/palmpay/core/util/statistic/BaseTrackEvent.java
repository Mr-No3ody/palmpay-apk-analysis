package com.transsnet.palmpay.core.util.statistic;

import Pa.AbstractC0520q;
import com.alibaba.android.arouter.utils.TextUtils;
import com.transsnet.palmpay.core.util.statistic.BaseTrackEvent;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class BaseTrackEvent<T extends BaseTrackEvent<T>> {
    private static final boolean DEFAULT_AF_EVT = !AbstractC0520q.f7145k;
    private String eventName;
    private boolean gioEvt = true;
    private boolean fbEvt = true;
    private final Map<String, Object> eventMap = new HashMap();
    private boolean afEvt = DEFAULT_AF_EVT;

    public BaseTrackEvent(String eventName) {
        this.eventName = eventName;
    }

    public T add(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.eventMap.put(str, obj);
        }
        return (T) self();
    }

    public T afEvt(boolean z3) {
        this.afEvt = z3;
        return (T) self();
    }

    public T fbEvt(boolean z3) {
        this.fbEvt = z3;
        return (T) self();
    }

    public Map<String, Object> getEventMap() {
        return this.eventMap;
    }

    public String getEventName() {
        return this.eventName;
    }

    public T gioEvt(boolean z3) {
        this.gioEvt = z3;
        return (T) self();
    }

    public boolean isAfEvt() {
        return this.afEvt;
    }

    public boolean isFbEvt() {
        return this.fbEvt;
    }

    public boolean isGioEvt() {
        return this.gioEvt;
    }

    public T putAll(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            this.eventMap.putAll(map);
        }
        return (T) self();
    }

    public T self() {
        return this;
    }

    public T add(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.eventMap.put(str, str2);
        }
        return (T) self();
    }
}
