package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import N8.q0;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.ConfigValue {
    private final long delta;
    private final Set<SchedulerConfig.Flag> flags;
    private final long maxAllowedDelay;

    public static final class Builder extends SchedulerConfig.ConfigValue.Builder {
        private Long delta;
        private Set<SchedulerConfig.Flag> flags;
        private Long maxAllowedDelay;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue build() {
            String strJ = this.delta == null ? " delta" : "";
            if (this.maxAllowedDelay == null) {
                strJ = q0.j(strJ, " maxAllowedDelay");
            }
            if (this.flags == null) {
                strJ = q0.j(strJ, " flags");
            }
            if (strJ.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.delta.longValue(), this.maxAllowedDelay.longValue(), this.flags);
            }
            throw new IllegalStateException("Missing required properties:".concat(strJ));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setDelta(long j6) {
            this.delta = Long.valueOf(j6);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setFlags(Set<SchedulerConfig.Flag> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.flags = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long j6) {
            this.maxAllowedDelay = Long.valueOf(j6);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig.ConfigValue) {
            SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
            if (this.delta == configValue.getDelta() && this.maxAllowedDelay == configValue.getMaxAllowedDelay() && this.flags.equals(configValue.getFlags())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public long getDelta() {
        return this.delta;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public Set<SchedulerConfig.Flag> getFlags() {
        return this.flags;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public long getMaxAllowedDelay() {
        return this.maxAllowedDelay;
    }

    public int hashCode() {
        long j6 = this.delta;
        int i7 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.maxAllowedDelay;
        return ((i7 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.flags.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.delta + ", maxAllowedDelay=" + this.maxAllowedDelay + ", flags=" + this.flags + "}";
    }

    private AutoValue_SchedulerConfig_ConfigValue(long j6, long j10, Set<SchedulerConfig.Flag> set) {
        this.delta = j6;
        this.maxAllowedDelay = j10;
        this.flags = set;
    }
}
