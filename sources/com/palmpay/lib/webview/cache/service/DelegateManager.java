package com.palmpay.lib.webview.cache.service;

import C0.G;
import com.palmpay.lib.webview.cache.service.base.AbstractDelegate;
import com.palmpay.lib.webview.cache.util.WebCacheLog;
import com.transsnet.palmpay.managemoney.ui.view.c;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0010\u001a\u0004\u0018\u0001H\u0011\"\b\b\u0000\u0010\u0011*\u00020\n2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0010\u001a\u0004\u0018\u0001H\u0011\"\n\b\u0000\u0010\u0011\u0018\u0001*\u00020\nH\u0086\b¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000Rc\u0010\u0006\u001aJ\u0012\u0004\u0012\u00020\u0005\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u0007j$\u0012\u0004\u0012\u00020\u0005\u0012\u001a\u0012\u0018\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b`\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/palmpay/lib/webview/cache/service/DelegateManager;", "", "<init>", "()V", "TAG", "", "delegateMap", "Ljava/util/HashMap;", "Lkotlin/Pair;", "Ljava/lang/Class;", "Lcom/palmpay/lib/webview/cache/service/base/AbstractDelegate;", "Lkotlin/collections/HashMap;", "getDelegateMap", "()Ljava/util/HashMap;", "delegateMap$delegate", "Lkotlin/Lazy;", "getDelegate", "T", "delegateType", "(Ljava/lang/Class;)Lcom/palmpay/lib/webview/cache/service/base/AbstractDelegate;", "()Lcom/palmpay/lib/webview/cache/service/base/AbstractDelegate;", "addDelegateClass", "", "delegateClass", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDelegateManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegateManager.kt\ncom/palmpay/lib/webview/cache/service/DelegateManager\n+ 2 WebCacheLog.kt\ncom/palmpay/lib/webview/cache/util/WebCacheLogKt\n*L\n1#1,122:1\n9#2,4:123\n9#2,4:127\n9#2,4:131\n9#2,4:135\n9#2,4:139\n9#2,4:143\n9#2,4:147\n*S KotlinDebug\n*F\n+ 1 DelegateManager.kt\ncom/palmpay/lib/webview/cache/service/DelegateManager\n*L\n20#1:123,4\n26#1:127,4\n36#1:131,4\n90#1:135,4\n96#1:139,4\n114#1:143,4\n118#1:147,4\n*E\n"})
public final class DelegateManager {

    @NotNull
    private static final String TAG = "DelegateManager";

    @NotNull
    public static final DelegateManager INSTANCE = new DelegateManager();

    /* JADX INFO: renamed from: delegateMap$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy delegateMap = C2131j.b(new c(18));

    private DelegateManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap delegateMap_delegate$lambda$0() {
        return new HashMap();
    }

    private final HashMap<String, Pair<Class<? extends AbstractDelegate>, AbstractDelegate>> getDelegateMap() {
        return (HashMap) delegateMap.getValue();
    }

    public final void addDelegateClass(@NotNull Class<? extends AbstractDelegate> delegateClass) {
        Intrinsics.checkNotNullParameter(delegateClass, "delegateClass");
        if (Intrinsics.c(delegateClass, AbstractDelegate.class)) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog()) {
                webCacheLog.e(TAG, "Error in adding delegate class. Cannot add AbstractDelegate directly, you need to implement this class.");
                return;
            }
            return;
        }
        int modifiers = delegateClass.getModifiers();
        if (Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers)) {
            WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
            if (webCacheLog2.getCanLog()) {
                webCacheLog2.e(TAG, "Error in adding delegate class. Cannot add abstract class.");
                return;
            }
            return;
        }
        Class<? super Object> superclass = delegateClass.getSuperclass();
        if (superclass == null || !AbstractDelegate.class.isAssignableFrom(superclass)) {
            superclass = null;
        }
        Class<? extends AbstractDelegate> cls = delegateClass;
        while (superclass != null && !superclass.equals(AbstractDelegate.class)) {
            Class<? super Object> superclass2 = superclass.getSuperclass();
            if (superclass2 == null || !AbstractDelegate.class.isAssignableFrom(superclass2)) {
                superclass2 = null;
            }
            Class<? super Object> cls2 = superclass2;
            cls = superclass;
            superclass = cls2;
        }
        String name = cls.getName();
        if (name.length() != 0) {
            WebCacheLog webCacheLog3 = WebCacheLog.INSTANCE;
            if (webCacheLog3.getCanLog()) {
                webCacheLog3.d(TAG, G.p("Add delegate: ", name, " -> ", delegateClass.getName()));
            }
            getDelegateMap().put(name, new Pair<>(delegateClass, null));
            return;
        }
        WebCacheLog webCacheLog4 = WebCacheLog.INSTANCE;
        if (webCacheLog4.getCanLog()) {
            webCacheLog4.e(TAG, "Error in adding delegate class. Cannot find valid delegate type for your class: " + delegateClass);
        }
    }

    @Nullable
    public final <T extends AbstractDelegate> T getDelegate(@NotNull Class<? extends AbstractDelegate> delegateType) {
        Intrinsics.checkNotNullParameter(delegateType, "delegateType");
        String name = delegateType.getName();
        if (name.length() == 0) {
            WebCacheLog webCacheLog = WebCacheLog.INSTANCE;
            if (webCacheLog.getCanLog()) {
                webCacheLog.e(TAG, "Error in getting delegate instance. Delegate type (" + delegateType + ") is illegal.");
            }
            return null;
        }
        Pair<Class<? extends AbstractDelegate>, AbstractDelegate> pair = getDelegateMap().get(name);
        if (pair == null) {
            WebCacheLog webCacheLog2 = WebCacheLog.INSTANCE;
            if (webCacheLog2.getCanLog()) {
                webCacheLog2.e(TAG, "Error in getting delegate instance. Cannot find delegate for type " + name + ", you must register it first.");
            }
            return null;
        }
        Class cls = (Class) pair.f38891a;
        T t = (T) pair.f38892b;
        if (t == null) {
            try {
                t = (T) ((AbstractDelegate) cls.newInstance());
            } catch (Exception e10) {
                WebCacheLog webCacheLog3 = WebCacheLog.INSTANCE;
                if (webCacheLog3.getCanLog()) {
                    webCacheLog3.e(TAG, "Cannot create delegate's instance.", e10);
                }
            }
            getDelegateMap().put(name, new Pair<>(cls, t));
        }
        Intrinsics.f(t, "null cannot be cast to non-null type T of com.palmpay.lib.webview.cache.service.DelegateManager.getDelegate");
        return t;
    }

    public final <T extends AbstractDelegate> T getDelegate() {
        Intrinsics.m();
        throw null;
    }
}
