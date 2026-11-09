package com.palmpay.lib.webview.offline;

import android.text.TextUtils;
import com.palmpay.lib.webview.offline.Interceptor.IInterceptor;
import com.palmpay.lib.webview.offline.download.IDownLoader;
import com.palmpay.lib.webview.offline.flow.IFlowResultHandleStrategy;
import com.palmpay.lib.webview.offline.info.OfflineRuleConfig;
import com.palmpay.lib.webview.offline.log.Logger;
import com.palmpay.lib.webview.offline.matcher.BisNameMatcher;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebMonitor;
import com.palmpay.lib.webview.offline.net.IOfflineRequest;
import com.palmpay.lib.webview.offline.net.IPreloadRequest;
import com.palmpay.lib.webview.offline.threadpool.IExecutorServiceProvider;
import com.palmpay.lib.webview.offline.utils.OfflineGsonUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineParams {
    private IDownLoader mDownLoader;
    private IExecutorServiceProvider mExecutorProvider;
    private IFlowResultHandleStrategy mFlowResultHandleStrategy;
    private IInterceptor mInterceptor;
    private boolean mIsDebug;
    private Logger mLogger;
    private BisNameMatcher mMatcher;
    private IEnhWebMonitor mMonitor;
    private OfflineConfig mOfflineConfig;
    private OfflineRuleConfig mOfflineRuleConfig;
    private IPreloadRequest mPreloadRequest;
    private IOfflineRequest mRequest;

    public OfflineParams addRule(String str, List<String> list, List<String> list2, List<String> list3) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() != 0 && list2 != null && list2.size() != 0) {
            if (this.mOfflineRuleConfig == null) {
                this.mOfflineRuleConfig = new OfflineRuleConfig();
            }
            this.mOfflineRuleConfig.addRule(new OfflineRuleConfig.RulesInfo(str, list, list2, list3));
        }
        return this;
    }

    public OfflineParams config(OfflineConfig offlineConfig) {
        this.mOfflineConfig = offlineConfig;
        return this;
    }

    public OfflineParams downloader(IDownLoader iDownLoader) {
        this.mDownLoader = iDownLoader;
        return this;
    }

    public OfflineParams executorServiceProvider(IExecutorServiceProvider iExecutorServiceProvider) {
        this.mExecutorProvider = iExecutorServiceProvider;
        return this;
    }

    public OfflineParams flowResultHandleStrategy(IFlowResultHandleStrategy iFlowResultHandleStrategy) {
        this.mFlowResultHandleStrategy = iFlowResultHandleStrategy;
        return this;
    }

    public IDownLoader getDownLoader() {
        return this.mDownLoader;
    }

    public IExecutorServiceProvider getExecutorProvider() {
        return this.mExecutorProvider;
    }

    public IFlowResultHandleStrategy getFlowResultHandleStrategy() {
        return this.mFlowResultHandleStrategy;
    }

    public IInterceptor getInterceptor() {
        return this.mInterceptor;
    }

    public Logger getLogger() {
        return this.mLogger;
    }

    public BisNameMatcher getMatcher() {
        return this.mMatcher;
    }

    public IEnhWebMonitor getMonitor() {
        return this.mMonitor;
    }

    public OfflineConfig getOfflineConfig() {
        return this.mOfflineConfig;
    }

    public OfflineRuleConfig getOfflineRuleConfig() {
        return this.mOfflineRuleConfig;
    }

    public IPreloadRequest getPreloadRequest() {
        return this.mPreloadRequest;
    }

    public IOfflineRequest getRequest() {
        return this.mRequest;
    }

    public OfflineParams interceptor(IInterceptor iInterceptor) {
        this.mInterceptor = iInterceptor;
        return this;
    }

    public OfflineParams isDebug(boolean z3) {
        this.mIsDebug = z3;
        return this;
    }

    public OfflineParams logger(Logger logger) {
        this.mLogger = logger;
        return this;
    }

    public OfflineParams matcher(BisNameMatcher bisNameMatcher) {
        this.mMatcher = bisNameMatcher;
        return this;
    }

    public OfflineParams monitor(IEnhWebMonitor iEnhWebMonitor) {
        this.mMonitor = iEnhWebMonitor;
        return this;
    }

    public OfflineParams preloadServer(IPreloadRequest iPreloadRequest) {
        this.mPreloadRequest = iPreloadRequest;
        return this;
    }

    public OfflineParams requestServer(IOfflineRequest iOfflineRequest) {
        this.mRequest = iOfflineRequest;
        return this;
    }

    public OfflineParams setRule(OfflineRuleConfig offlineRuleConfig) {
        this.mOfflineRuleConfig = offlineRuleConfig;
        return this;
    }

    public boolean isDebug() {
        return this.mIsDebug;
    }

    public OfflineParams setRule(String str) {
        this.mOfflineRuleConfig = (OfflineRuleConfig) OfflineGsonUtils.fromJson(str, OfflineRuleConfig.class);
        return this;
    }
}
