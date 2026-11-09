package com.adjust.sdk;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.analysis.contants.EventsConstants;

/* JADX INFO: loaded from: classes.dex */
public enum ActivityKind {
    UNKNOWN,
    SESSION,
    EVENT,
    CLICK,
    ATTRIBUTION,
    REVENUE,
    REATTRIBUTION,
    INFO,
    GDPR,
    AD_REVENUE,
    DISABLE_THIRD_PARTY_SHARING,
    SUBSCRIPTION,
    THIRD_PARTY_SHARING,
    MEASUREMENT_CONSENT,
    PURCHASE_VERIFICATION;

    public static ActivityKind fromString(String str) {
        if ("session".equals(str)) {
            return SESSION;
        }
        if ("event".equals(str)) {
            return EVENT;
        }
        if (EventsConstants.CLICK.equals(str)) {
            return CLICK;
        }
        if ("attribution".equals(str)) {
            return ATTRIBUTION;
        }
        if (Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH.equals(str)) {
            return INFO;
        }
        if ("gdpr".equals(str)) {
            return GDPR;
        }
        if ("ad_revenue".equals(str)) {
            return AD_REVENUE;
        }
        if (FirebaseAnalytics.Param.SUBSCRIPTION.equals(str)) {
            return SUBSCRIPTION;
        }
        if ("third_party_sharing".equals(str)) {
            return THIRD_PARTY_SHARING;
        }
        if ("measurement_consent".equals(str)) {
            return MEASUREMENT_CONSENT;
        }
        return "purchase_verification".equals(str) ? PURCHASE_VERIFICATION : UNKNOWN;
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (E.f19312a[ordinal()]) {
            case 1:
                return "session";
            case 2:
                return "event";
            case 3:
                return EventsConstants.CLICK;
            case 4:
                return "attribution";
            case 5:
                return Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH;
            case 6:
                return "gdpr";
            case 7:
                return "ad_revenue";
            case 8:
                return FirebaseAnalytics.Param.SUBSCRIPTION;
            case 9:
                return "third_party_sharing";
            case 10:
                return "measurement_consent";
            case 11:
                return "purchase_verification";
            default:
                return "unknown";
        }
    }
}
