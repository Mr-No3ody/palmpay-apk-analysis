package com.google.firebase.remoteconfig.interop.rollouts;

import N8.q0;
import androidx.annotation.NonNull;
import com.airbnb.lottie.model.layer.d;

/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_RolloutAssignment extends RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final String rolloutId;
    private final long templateVersion;
    private final String variantId;

    public static final class Builder extends RolloutAssignment.Builder {
        private String parameterKey;
        private String parameterValue;
        private String rolloutId;
        private byte set$0;
        private long templateVersion;
        private String variantId;

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment build() {
            if (this.set$0 == 1 && this.rolloutId != null && this.variantId != null && this.parameterKey != null && this.parameterValue != null) {
                return new AutoValue_RolloutAssignment(this.rolloutId, this.variantId, this.parameterKey, this.parameterValue, this.templateVersion);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.rolloutId == null) {
                sb2.append(" rolloutId");
            }
            if (this.variantId == null) {
                sb2.append(" variantId");
            }
            if (this.parameterKey == null) {
                sb2.append(" parameterKey");
            }
            if (this.parameterValue == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.set$0) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException(d.m("Missing required properties:", sb2));
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setParameterKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.parameterKey = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setParameterValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.parameterValue = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setRolloutId(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.rolloutId = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setTemplateVersion(long j6) {
            this.templateVersion = j6;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public RolloutAssignment.Builder setVariantId(String str) {
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
        if (obj instanceof RolloutAssignment) {
            RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
            if (this.rolloutId.equals(rolloutAssignment.getRolloutId()) && this.variantId.equals(rolloutAssignment.getVariantId()) && this.parameterKey.equals(rolloutAssignment.getParameterKey()) && this.parameterValue.equals(rolloutAssignment.getParameterValue()) && this.templateVersion == rolloutAssignment.getTemplateVersion()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public String getParameterKey() {
        return this.parameterKey;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public String getParameterValue() {
        return this.parameterValue;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public String getRolloutId() {
        return this.rolloutId;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public long getTemplateVersion() {
        return this.templateVersion;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        int iHashCode = (((((((this.rolloutId.hashCode() ^ 1000003) * 1000003) ^ this.variantId.hashCode()) * 1000003) ^ this.parameterKey.hashCode()) * 1000003) ^ this.parameterValue.hashCode()) * 1000003;
        long j6 = this.templateVersion;
        return iHashCode ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.rolloutId);
        sb2.append(", variantId=");
        sb2.append(this.variantId);
        sb2.append(", parameterKey=");
        sb2.append(this.parameterKey);
        sb2.append(", parameterValue=");
        sb2.append(this.parameterValue);
        sb2.append(", templateVersion=");
        return q0.n(sb2, "}", this.templateVersion);
    }

    private AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j6) {
        this.rolloutId = str;
        this.variantId = str2;
        this.parameterKey = str3;
        this.parameterValue = str4;
        this.templateVersion = j6;
    }
}
