package com.palmpay.lib.webview.cache.match;

import com.palmpay.lib.webview.cache.match.base.WebCacheResourceMatcher;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import com.palmpay.lib.webview.container.fast.offline.ResourceInterceptor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041ce.o;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fJ\u0016\u0010\u0019\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bJ\u0016\u0010\u001b\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bJ\u0006\u0010\u001c\u001a\u00020\u0016J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\t2\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0010\u0010\u000bR!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0013\u0010\u000b¨\u0006!"}, d2 = {"Lcom/palmpay/lib/webview/cache/match/ResourceMatcherManager;", "", "<init>", "()V", "TAG", "", "defaultMatcherClassList", "", "Ljava/lang/Class;", "Lcom/palmpay/lib/webview/cache/match/base/WebCacheResourceMatcher;", "getDefaultMatcherClassList", "()Ljava/util/List;", "defaultMatcherClassList$delegate", "Lkotlin/Lazy;", "interceptorList", "Lcom/palmpay/lib/webview/container/fast/offline/ResourceInterceptor;", "getInterceptorList$lib_webview_release", "interceptorList$delegate", "fallbackInterceptorList", "getFallbackInterceptorList$lib_webview_release", "fallbackInterceptorList$delegate", "addWebResourceInterceptor", "", "interceptor", "addWebResourceFallbackInterceptor", "registerMatcher", "matcherClass", "unregisterMatcher", "clearMatcher", "createMatcher", "clazz", "createDefaultMatcherList", "Ljava/util/LinkedList;", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResourceMatcherManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceMatcherManager.kt\ncom/palmpay/lib/webview/cache/match/ResourceMatcherManager\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n9#2,4:93\n9#2,4:97\n9#2,4:101\n9#2,4:106\n1855#3:105\n1856#3:110\n*S KotlinDebug\n*F\n+ 1 ResourceMatcherManager.kt\ncom/palmpay/lib/webview/cache/match/ResourceMatcherManager\n*L\n44#1:93,4\n53#1:97,4\n76#1:101,4\n87#1:106,4\n83#1:105\n83#1:110\n*E\n"})
public final class ResourceMatcherManager {

    @NotNull
    private static final String TAG = "ResourceMatcherManager";

    @NotNull
    public static final ResourceMatcherManager INSTANCE = new ResourceMatcherManager();

    /* JADX INFO: renamed from: defaultMatcherClassList$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy defaultMatcherClassList = C2131j.b(new o(14));

    /* JADX INFO: renamed from: interceptorList$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy interceptorList = C2131j.b(new o(15));

    /* JADX INFO: renamed from: fallbackInterceptorList$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy fallbackInterceptorList = C2131j.b(new o(16));

    private ResourceMatcherManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkedList defaultMatcherClassList_delegate$lambda$0() {
        return new LinkedList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList fallbackInterceptorList_delegate$lambda$2() {
        return new ArrayList();
    }

    private final List<Class<? extends WebCacheResourceMatcher>> getDefaultMatcherClassList() {
        return (List) defaultMatcherClassList.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList interceptorList_delegate$lambda$1() {
        return new ArrayList();
    }

    public final void addWebResourceFallbackInterceptor(@NotNull ResourceInterceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        getFallbackInterceptorList$lib_webview_release().add(interceptor);
    }

    public final void addWebResourceInterceptor(@NotNull ResourceInterceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        getInterceptorList$lib_webview_release().add(interceptor);
    }

    public final void clearMatcher() {
        getDefaultMatcherClassList().clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final LinkedList<WebCacheResourceMatcher> createDefaultMatcherList() {
        LinkedList<WebCacheResourceMatcher> linkedList = new LinkedList<>();
        Iterator<T> it = getDefaultMatcherClassList().iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            try {
                linkedList.add(cls.newInstance());
            } catch (Throwable th) {
                WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
                if (webCacheLog.getCanLog()) {
                    webCacheLog.e(TAG, "Error in creating matcher instance for ".concat(cls.getSimpleName()), th);
                }
            }
        }
        return linkedList;
    }

    @Nullable
    public final WebCacheResourceMatcher createMatcher(@NotNull Class<? extends WebCacheResourceMatcher> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        try {
            return clazz.newInstance();
        } catch (Throwable th) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (!webCacheLog.getCanLog()) {
                return null;
            }
            webCacheLog.e(TAG, "Error in creating matcher instance for ".concat(clazz.getSimpleName()), th);
            return null;
        }
    }

    @NotNull
    public final List<ResourceInterceptor> getFallbackInterceptorList$lib_webview_release() {
        return (List) fallbackInterceptorList.getValue();
    }

    @NotNull
    public final List<ResourceInterceptor> getInterceptorList$lib_webview_release() {
        return (List) interceptorList.getValue();
    }

    public final void registerMatcher(@NotNull Class<? extends WebCacheResourceMatcher> matcherClass) {
        Intrinsics.checkNotNullParameter(matcherClass, "matcherClass");
        int modifiers = matcherClass.getModifiers();
        if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog()) {
                webCacheLog.e(TAG, "Error in adding register matcher class. Cannot register abstract class.");
                return;
            }
            return;
        }
        if (!matcherClass.equals(G.a(WebCacheResourceMatcher.class))) {
            getDefaultMatcherClassList().add(matcherClass);
            return;
        }
        WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
        if (webCacheLog2.getCanLog()) {
            webCacheLog2.e(TAG, "Error in adding register matcher class. Cannot add WebCacheResourceMatcher directly, you need to implement this class.");
        }
    }

    public final void unregisterMatcher(@NotNull Class<? extends WebCacheResourceMatcher> matcherClass) {
        Intrinsics.checkNotNullParameter(matcherClass, "matcherClass");
        getDefaultMatcherClassList().remove(matcherClass);
    }
}
