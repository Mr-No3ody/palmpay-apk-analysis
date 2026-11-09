package com.google.firebase.crashlytics.internal.model;

import C0.G;
import androidx.annotation.NonNull;
import com.airbnb.lottie.model.layer.d;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant {
    private final String rolloutId;
    private final String variantId;

    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder {
        private String rolloutId;
        private String variantId;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant build() {
            String str;
            String str2 = this.rolloutId;
            if (str2 != null && (str = this.variantId) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.rolloutId == null) {
                sb2.append(" rolloutId");
            }
            if (this.variantId == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException(d.m("Missing required properties:", sb2));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setRolloutId(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.rolloutId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setVariantId(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.variantId = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
            if (this.rolloutId.equals(rolloutVariant.getRolloutId()) && this.variantId.equals(rolloutVariant.getVariantId())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    @NonNull
    public String getRolloutId() {
        return this.rolloutId;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant
    @NonNull
    public String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        return ((this.rolloutId.hashCode() ^ 1000003) * 1000003) ^ this.variantId.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.rolloutId);
        sb2.append(", variantId=");
        return G.r(sb2, this.variantId, "}");
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(String str, String str2) {
        this.rolloutId = str;
        this.variantId = str2;
    }
}
