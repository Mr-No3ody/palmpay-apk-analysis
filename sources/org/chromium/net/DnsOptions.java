package org.chromium.net;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresOptIn;
import java.time.Duration;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsOptions {

    @Nullable
    private final Boolean mEnableStaleDns;

    @Nullable
    private final Boolean mPersistHostCache;

    @Nullable
    private final Long mPersistHostCachePeriodMillis;

    @Nullable
    private final Boolean mPreestablishConnectionsToStaleDnsResults;

    @Nullable
    private final StaleDnsOptions mStaleDnsOptions;

    @Nullable
    private final Boolean mUseBuiltInDnsResolver;

    public static final class Builder {

        @Nullable
        private Boolean mEnableStaleDns;

        @Nullable
        private Boolean mPersistHostCache;

        @Nullable
        private Long mPersistHostCachePeriodMillis;

        @Nullable
        private Boolean mPreestablishConnectionsToStaleDnsResults;

        @Nullable
        private StaleDnsOptions mStaleDnsOptions;

        @Nullable
        private Boolean mUseBuiltInDnsResolver;

        public DnsOptions build() {
            return new DnsOptions(this);
        }

        public Builder enableStaleDns(boolean z3) {
            this.mEnableStaleDns = Boolean.valueOf(z3);
            return this;
        }

        public Builder persistHostCache(boolean z3) {
            this.mPersistHostCache = Boolean.valueOf(z3);
            return this;
        }

        @Experimental
        public Builder preestablishConnectionsToStaleDnsResults(boolean z3) {
            this.mPreestablishConnectionsToStaleDnsResults = Boolean.valueOf(z3);
            return this;
        }

        @RequiresApi(api = 26)
        public Builder setPersistDelay(Duration duration) {
            return setPersistHostCachePeriodMillis(duration.toMillis());
        }

        public Builder setPersistHostCachePeriodMillis(long j6) {
            this.mPersistHostCachePeriodMillis = Long.valueOf(j6);
            return this;
        }

        public Builder setStaleDnsOptions(StaleDnsOptions staleDnsOptions) {
            this.mStaleDnsOptions = staleDnsOptions;
            return this;
        }

        public Builder useBuiltInDnsResolver(boolean z3) {
            this.mUseBuiltInDnsResolver = Boolean.valueOf(z3);
            return this;
        }

        @Experimental
        public Builder setStaleDnsOptions(StaleDnsOptions.Builder builder) {
            return setStaleDnsOptions(builder.build());
        }
    }

    @RequiresOptIn
    public @interface Experimental {
    }

    public static class StaleDnsOptions {

        @Nullable
        private final Boolean mAllowCrossNetworkUsage;

        @Nullable
        private final Long mFreshLookupTimeoutMillis;

        @Nullable
        private final Long mMaxExpiredDelayMillis;

        @Nullable
        private final Boolean mUseStaleOnNameNotResolved;

        public static final class Builder {
            private Boolean mAllowCrossNetworkUsage;
            private Long mFreshLookupTimeoutMillis;
            private Long mMaxExpiredDelayMillis;
            private Boolean mUseStaleOnNameNotResolved;

            public Builder allowCrossNetworkUsage(boolean z3) {
                this.mAllowCrossNetworkUsage = Boolean.valueOf(z3);
                return this;
            }

            public StaleDnsOptions build() {
                return new StaleDnsOptions(this);
            }

            @RequiresApi(26)
            public Builder setFreshLookupTimeout(Duration duration) {
                return setFreshLookupTimeoutMillis(duration.toMillis());
            }

            public Builder setFreshLookupTimeoutMillis(long j6) {
                this.mFreshLookupTimeoutMillis = Long.valueOf(j6);
                return this;
            }

            public Builder setMaxExpiredDelayMillis(long j6) {
                this.mMaxExpiredDelayMillis = Long.valueOf(j6);
                return this;
            }

            public Builder useStaleOnNameNotResolved(boolean z3) {
                this.mUseStaleOnNameNotResolved = Boolean.valueOf(z3);
                return this;
            }

            @RequiresApi(26)
            public Builder setMaxExpiredDelayMillis(Duration duration) {
                return setMaxExpiredDelayMillis(duration.toMillis());
            }
        }

        public StaleDnsOptions(Builder builder) {
            this.mFreshLookupTimeoutMillis = builder.mFreshLookupTimeoutMillis;
            this.mMaxExpiredDelayMillis = builder.mMaxExpiredDelayMillis;
            this.mAllowCrossNetworkUsage = builder.mAllowCrossNetworkUsage;
            this.mUseStaleOnNameNotResolved = builder.mUseStaleOnNameNotResolved;
        }

        public static Builder builder() {
            return new Builder();
        }

        @Nullable
        public Boolean getAllowCrossNetworkUsage() {
            return this.mAllowCrossNetworkUsage;
        }

        @Nullable
        public Long getFreshLookupTimeoutMillis() {
            return this.mFreshLookupTimeoutMillis;
        }

        @Nullable
        public Long getMaxExpiredDelayMillis() {
            return this.mMaxExpiredDelayMillis;
        }

        @Nullable
        public Boolean getUseStaleOnNameNotResolved() {
            return this.mUseStaleOnNameNotResolved;
        }
    }

    public DnsOptions(Builder builder) {
        this.mEnableStaleDns = builder.mEnableStaleDns;
        this.mStaleDnsOptions = builder.mStaleDnsOptions;
        this.mPersistHostCachePeriodMillis = builder.mPersistHostCachePeriodMillis;
        this.mPreestablishConnectionsToStaleDnsResults = builder.mPreestablishConnectionsToStaleDnsResults;
        this.mUseBuiltInDnsResolver = builder.mUseBuiltInDnsResolver;
        this.mPersistHostCache = builder.mPersistHostCache;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Nullable
    public Boolean getEnableStaleDns() {
        return this.mEnableStaleDns;
    }

    @Nullable
    public Boolean getPersistHostCache() {
        return this.mPersistHostCache;
    }

    @Nullable
    public Long getPersistHostCachePeriodMillis() {
        return this.mPersistHostCachePeriodMillis;
    }

    @Nullable
    public Boolean getPreestablishConnectionsToStaleDnsResults() {
        return this.mPreestablishConnectionsToStaleDnsResults;
    }

    @Nullable
    public StaleDnsOptions getStaleDnsOptions() {
        return this.mStaleDnsOptions;
    }

    @Nullable
    public Boolean getUseBuiltInDnsResolver() {
        return this.mUseBuiltInDnsResolver;
    }
}
