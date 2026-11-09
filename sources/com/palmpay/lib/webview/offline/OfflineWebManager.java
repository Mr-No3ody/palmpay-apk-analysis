package com.palmpay.lib.webview.offline;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.M;
import com.palmpay.lib.webview.offline.Interceptor.DefaultInterceptor;
import com.palmpay.lib.webview.offline.Interceptor.IInterceptor;
import com.palmpay.lib.webview.offline.download.DefaultDownloader;
import com.palmpay.lib.webview.offline.download.IDownLoader;
import com.palmpay.lib.webview.offline.flow.FlowResultHandleStrategy;
import com.palmpay.lib.webview.offline.flow.IFlowResultHandleStrategy;
import com.palmpay.lib.webview.offline.log.Logger;
import com.palmpay.lib.webview.offline.log.OfflineWebLog;
import com.palmpay.lib.webview.offline.matcher.BisNameMatcher;
import com.palmpay.lib.webview.offline.matcher.DefaultMatcher;
import com.palmpay.lib.webview.offline.monitor.base.IEnhWebMonitor;
import com.palmpay.lib.webview.offline.net.IOfflineRequest;
import com.palmpay.lib.webview.offline.net.IPreloadRequest;
import com.palmpay.lib.webview.offline.resource.ResourceFlow;
import com.palmpay.lib.webview.offline.threadpool.IExecutorServiceProvider;
import com.palmpay.lib.webview.offline.threadpool.OfflineIoThreadPool;
import com.palmpay.lib.webview.offline.utils.OffWebRuleUtil;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p024b9.g;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineWebManager {
    private static final String TAG = "OfflineWebManager";
    private Context mContext;
    private IDownLoader mDownLoader;
    private IExecutorServiceProvider mExecutorProvider;
    private IFlowResultHandleStrategy mFlowResultHandleStrategy;
    private final boolean mForceReloadEnable;
    private IInterceptor mInterceptor;
    private boolean mIsDebug;
    private boolean mIsInit;
    private boolean mIsOpen;
    private Logger mLogger;
    private BisNameMatcher mMatcher;
    private IEnhWebMonitor mMonitor;
    private OfflineConfig mOfflineConfig;
    private IPreloadRequest mPreloadRequest;
    private IOfflineRequest mRequest;
    private List<ResourceFlow> mResourceFlows;

    public static class Holder {
        private static final OfflineWebManager INSTANCE = new OfflineWebManager(0);

        private Holder() {
        }
    }

    public /* synthetic */ OfflineWebManager(int i7) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLifecycle() {
        M.f17358j.get().getLifecycle().a(new WebLifecycleObserver());
    }

    public static OfflineWebManager getInstance() {
        return Holder.INSTANCE;
    }

    public Context getContext() {
        return this.mContext;
    }

    public IDownLoader getDownLoader() {
        if (this.mDownLoader == null) {
            this.mDownLoader = new DefaultDownloader();
        }
        return this.mDownLoader;
    }

    public ExecutorService getExecutor() {
        IExecutorServiceProvider iExecutorServiceProvider = this.mExecutorProvider;
        if (iExecutorServiceProvider == null) {
            return OfflineIoThreadPool.getInstance().getThreadPoolExecutor();
        }
        ExecutorService executorService = iExecutorServiceProvider.get();
        return executorService == null ? OfflineIoThreadPool.getInstance().getThreadPoolExecutor() : executorService;
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
        if (this.mMatcher == null) {
            this.mMatcher = new DefaultMatcher();
        }
        return this.mMatcher;
    }

    public IEnhWebMonitor getMonitor() {
        return this.mMonitor;
    }

    public OfflineConfig getOfflineConfig() {
        return this.mOfflineConfig;
    }

    public String getOfflineRes(String str, String str2) {
        OfflineWebLog.d(TAG, str2);
        return getMatcher().matching(str, str2);
    }

    public IPreloadRequest getPreloadRequest() {
        return this.mPreloadRequest;
    }

    public IOfflineRequest getRequest() {
        return this.mRequest;
    }

    public List<ResourceFlow> getResourceFlows() {
        return this.mResourceFlows;
    }

    public SharedPreferences getSharedPreferences() {
        return this.mContext.getSharedPreferences(OfflineConstant.MODULE_SP_NAME, 0);
    }

    public void init(Context context, OfflineParams offlineParams) {
        this.mContext = context;
        this.mRequest = offlineParams.getRequest();
        this.mPreloadRequest = offlineParams.getPreloadRequest();
        OfflineConfig offlineConfig = offlineParams.getOfflineConfig();
        this.mOfflineConfig = offlineConfig;
        if (this.mRequest == null || offlineConfig == null) {
            if (offlineParams.isDebug()) {
                throw new IllegalStateException("please set base url and env");
            }
            OfflineWebLog.e(TAG, new IllegalStateException("please set base url and env"));
            return;
        }
        boolean zIsOpen = offlineConfig.isOpen();
        this.mIsOpen = zIsOpen;
        if (!zIsOpen) {
            this.mIsInit = false;
            return;
        }
        this.mDownLoader = offlineParams.getDownLoader();
        this.mExecutorProvider = offlineParams.getExecutorProvider();
        this.mIsDebug = offlineParams.isDebug();
        this.mLogger = offlineParams.getLogger();
        this.mMatcher = offlineParams.getMatcher();
        this.mInterceptor = offlineParams.getInterceptor() == null ? new DefaultInterceptor() : offlineParams.getInterceptor();
        this.mIsInit = true;
        this.mMonitor = offlineParams.getMonitor();
        this.mFlowResultHandleStrategy = offlineParams.getFlowResultHandleStrategy() == null ? new FlowResultHandleStrategy() : offlineParams.getFlowResultHandleStrategy();
        OffWebRuleUtil.init(offlineParams.getOfflineRuleConfig());
        OfflineWebLog.i(TAG, "init success ");
        if (this.mPreloadRequest != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                addLifecycle();
            } else {
                new Handler(Looper.getMainLooper()).post(new g(this, 25));
            }
        }
    }

    public boolean isDebug() {
        return this.mIsDebug;
    }

    public boolean isForceReloadEnable() {
        return true;
    }

    public boolean isInit() {
        return this.mIsInit && this.mIsOpen;
    }

    public void setOfflineConfig(OfflineConfig offlineConfig) {
        this.mOfflineConfig = offlineConfig;
    }

    private OfflineWebManager() {
        this.mResourceFlows = Collections.synchronizedList(new LinkedList());
        this.mForceReloadEnable = true;
    }
}
