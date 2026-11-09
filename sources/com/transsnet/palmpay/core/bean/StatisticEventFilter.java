package com.transsnet.palmpay.core.bean;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class StatisticEventFilter {
    private FilterGroup appsflyer;
    private FilterGroup firebase;
    private FilterGroup growingIO;

    public static class FilterGroup {
        private List<String> allow;
        private List<String> deny;

        private FilterGroup() {
        }
    }

    public Boolean isAllow(String type, String eventId) {
        if (TextUtils.isEmpty(type) || TextUtils.isEmpty(eventId)) {
            return null;
        }
        type.getClass();
        switch (type) {
            case "appsflyer":
                return isAllow(this.appsflyer, eventId);
            case "growingIO":
                return isAllow(this.growingIO, eventId);
            case "firebase":
                return isAllow(this.firebase, eventId);
            default:
                return null;
        }
    }

    private Boolean isAllow(FilterGroup group, String eventId) {
        if (group == null) {
            return null;
        }
        if (group.deny != null) {
            for (int i7 = 0; i7 < group.deny.size(); i7++) {
                if (eventId.equals(group.deny.get(i7))) {
                    return Boolean.FALSE;
                }
            }
        }
        if (group.allow == null) {
            return null;
        }
        for (int i10 = 0; i10 < group.allow.size(); i10++) {
            if (eventId.equals(group.allow.get(i10))) {
                return Boolean.TRUE;
            }
        }
        return null;
    }
}
