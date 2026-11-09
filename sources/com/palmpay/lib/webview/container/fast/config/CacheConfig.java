package com.palmpay.lib.webview.container.fast.config;

import C0.G;
import android.content.Context;
import com.palmpay.lib.webview.container.fast.utils.AppVersionUtil;
import com.palmpay.lib.webview.container.fast.utils.MemorySizeCalculator;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class CacheConfig {
    private String mCacheDir;
    private long mDiskCacheSize;
    private MimeTypeFilter mFilter;
    private int mMemCacheSize;
    private int mVersion;

    public /* synthetic */ CacheConfig(int i7) {
        this();
    }

    public String getCacheDir() {
        return this.mCacheDir;
    }

    public long getDiskCacheSize() {
        return this.mDiskCacheSize;
    }

    public MimeTypeFilter getFilter() {
        return this.mFilter;
    }

    public int getMemCacheSize() {
        return this.mMemCacheSize;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public void setVersion(int i7) {
        this.mVersion = i7;
    }

    private CacheConfig() {
    }

    public static class Builder {
        private static final String CACHE_DIR_NAME = "cached_webview_force";
        private static final int DEFAULT_DISK_CACHE_SIZE = 104857600;
        private String cacheDir;
        private int version;
        private long diskCacheSize = 104857600;
        private int memoryCacheSize = MemorySizeCalculator.getSize();
        private MimeTypeFilter filter = new DefaultMimeTypeFilter();

        public Builder(Context context) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getCacheDir());
            this.cacheDir = G.r(sb2, File.separator, CACHE_DIR_NAME);
            this.version = AppVersionUtil.getVersionCode(context);
        }

        public CacheConfig build() {
            CacheConfig cacheConfig = new CacheConfig(0);
            cacheConfig.mCacheDir = this.cacheDir;
            cacheConfig.mVersion = this.version;
            cacheConfig.mDiskCacheSize = this.diskCacheSize;
            cacheConfig.mFilter = this.filter;
            cacheConfig.mMemCacheSize = this.memoryCacheSize;
            return cacheConfig;
        }

        public Builder setCacheDir(String str) {
            this.cacheDir = str;
            return this;
        }

        public Builder setDiskCacheSize(long j6) {
            this.diskCacheSize = j6;
            return this;
        }

        public Builder setExtensionFilter(MimeTypeFilter mimeTypeFilter) {
            this.filter = mimeTypeFilter;
            return this;
        }

        public Builder setMemoryCacheSize(int i7) {
            this.memoryCacheSize = i7;
            return this;
        }

        public Builder setVersion(int i7) {
            this.version = i7;
            return this;
        }

        public Builder() {
        }
    }
}
