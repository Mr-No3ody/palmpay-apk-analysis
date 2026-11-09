package com.palmpay.lib.webview.offline;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineConfig {
    private final HashSet<String> disableList;
    private final boolean isOpen;
    private final HashSet<String> mPreDownloadList;
    private final HashSet<String> whiteList;

    public static class Builder {
        private HashSet<String> disablelist;
        private boolean isOpen;
        private HashSet<String> predownloadlist;
        private HashSet<String> whiteHostList;

        public /* synthetic */ Builder(OfflineConfig offlineConfig, int i7) {
            this(offlineConfig);
        }

        public Builder addDisable(String str) {
            this.disablelist.add(str);
            return this;
        }

        public Builder addDisableList(Collection<String> collection) {
            this.disablelist.addAll(collection);
            return this;
        }

        public Builder addPreDownload(String str) {
            this.predownloadlist.add(str);
            return this;
        }

        public Builder addPreDownloadList(Collection<String> collection) {
            if (collection != null) {
                this.predownloadlist.addAll(collection);
            }
            return this;
        }

        public Builder addWhiteHost(String str) {
            this.whiteHostList.add(str);
            return this;
        }

        public Builder addWhiteHostList(Collection<String> collection) {
            if (collection != null) {
                this.whiteHostList.addAll(collection);
            }
            return this;
        }

        public OfflineConfig build() {
            return new OfflineConfig(this.isOpen, this.predownloadlist, this.disablelist, this.whiteHostList);
        }

        private Builder(OfflineConfig offlineConfig) {
            this.isOpen = offlineConfig.isOpen;
            this.predownloadlist = offlineConfig.mPreDownloadList;
            this.disablelist = offlineConfig.disableList;
            this.whiteHostList = offlineConfig.whiteList;
        }

        public Builder(boolean z3) {
            this.isOpen = z3;
            this.predownloadlist = new HashSet<>();
            this.disablelist = new HashSet<>();
            this.whiteHostList = new HashSet<>();
        }
    }

    public OfflineConfig(boolean z3, HashSet<String> hashSet, HashSet<String> hashSet2, HashSet<String> hashSet3) {
        this.isOpen = z3;
        this.mPreDownloadList = hashSet;
        this.disableList = hashSet2;
        this.whiteList = hashSet3;
    }

    public static Builder newBuilder(OfflineConfig offlineConfig) {
        return new Builder(offlineConfig, 0);
    }

    public HashSet<String> getPreDownloadList() {
        return this.mPreDownloadList;
    }

    public HashSet<String> getWhiteList() {
        return this.whiteList;
    }

    public boolean isDisable(String str) {
        HashSet<String> hashSet = this.disableList;
        if (hashSet == null || hashSet.size() == 0) {
            return false;
        }
        return this.disableList.contains(str);
    }

    public boolean isOpen() {
        return this.isOpen;
    }
}
