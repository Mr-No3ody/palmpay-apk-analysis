package com.palmpay.lib.webview.cache.entity;

import N8.q0;
import androidx.annotation.Keep;
import com.palmpay.lib.webview.cache.WebCacheParamsProvider;
import com.palmpay.lib.webview.cache.WebCacheSetting;
import com.palmpay.lib.webview.cache.util.IUsefulCheckKt;
import com.palmpay.lib.webview.cache.util.UrlHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.u;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tB]\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0012\"\b\u0002\u0010\u0010\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00142\u001e\u0010\u0013\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f0\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010+R0\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/palmpay/lib/webview/cache/entity/WebCacheDataSource;", "", "Lcom/palmpay/lib/webview/cache/entity/WebCacheFileDetail;", "localFileDirDetail", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/palmpay/lib/webview/cache/entity/WebCacheLocalResp;", "localFileMap", "<init>", "(Lcom/palmpay/lib/webview/cache/entity/WebCacheFileDetail;Ljava/util/concurrent/ConcurrentHashMap;)V", "offlineDirPath", "", "isRelativePath", "", "sourceList1", "Lxf/u;", "sourceList2", "sourceStr", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "sourceList", "", "setSourceList1", "(Ljava/util/List;)V", "setSourceList2", "setSourceStr", "(Ljava/lang/String;)V", "component1", "()Lcom/palmpay/lib/webview/cache/entity/WebCacheFileDetail;", "component2", "()Ljava/util/concurrent/ConcurrentHashMap;", "copy", "(Lcom/palmpay/lib/webview/cache/entity/WebCacheFileDetail;Ljava/util/concurrent/ConcurrentHashMap;)Lcom/palmpay/lib/webview/cache/entity/WebCacheDataSource;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/palmpay/lib/webview/cache/entity/WebCacheFileDetail;", "getLocalFileDirDetail", "setLocalFileDirDetail", "(Lcom/palmpay/lib/webview/cache/entity/WebCacheFileDetail;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "getLocalFileMap", "setLocalFileMap", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebCacheDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebCacheDataSource.kt\ncom/palmpay/lib/webview/cache/entity/WebCacheDataSource\n+ 2 CollectionHelper.kt\ncom/palmpay/lib/webview/cache/util/CollectionHelperKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n11#2,3:99\n14#2,4:103\n18#2,3:108\n11#2,3:114\n14#2,4:118\n18#2,3:123\n11#2,3:126\n14#2,4:130\n18#2,3:135\n1855#3:102\n1856#3:107\n1620#3,3:111\n1855#3:117\n1856#3:122\n1855#3:129\n1856#3:134\n*S KotlinDebug\n*F\n+ 1 WebCacheDataSource.kt\ncom/palmpay/lib/webview/cache/entity/WebCacheDataSource\n*L\n80#1:99,3\n80#1:103,4\n80#1:108,3\n88#1:114,3\n88#1:118,4\n88#1:123,3\n94#1:126,3\n94#1:130,4\n94#1:135,3\n80#1:102\n80#1:107\n85#1:111,3\n88#1:117\n88#1:122\n94#1:129\n94#1:134\n*E\n"})
public final /* data */ class WebCacheDataSource {

    @NotNull
    private WebCacheFileDetail localFileDirDetail;

    @Nullable
    private ConcurrentHashMap<String, WebCacheLocalResp> localFileMap;

    public WebCacheDataSource(@NotNull WebCacheFileDetail localFileDirDetail, @Nullable ConcurrentHashMap<String, WebCacheLocalResp> concurrentHashMap) {
        Intrinsics.checkNotNullParameter(localFileDirDetail, "localFileDirDetail");
        this.localFileDirDetail = localFileDirDetail;
        this.localFileMap = concurrentHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebCacheDataSource copy$default(WebCacheDataSource webCacheDataSource, WebCacheFileDetail webCacheFileDetail, ConcurrentHashMap concurrentHashMap, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            webCacheFileDetail = webCacheDataSource.localFileDirDetail;
        }
        if ((i7 & 2) != 0) {
            concurrentHashMap = webCacheDataSource.localFileMap;
        }
        return webCacheDataSource.copy(webCacheFileDetail, concurrentHashMap);
    }

    private final void setSourceList1(List<WebCacheLocalResp> sourceList) {
        Map map = null;
        Collection collectionUseful$default = IUsefulCheckKt.useful$default(CollectionsKt.Z(sourceList), false, 1, null);
        if (collectionUseful$default != null && !collectionUseful$default.isEmpty()) {
            map = (Map) ConcurrentHashMap.class.newInstance();
            for (Object obj : collectionUseful$default) {
                String strUrlToKey = UrlHelper.INSTANCE.urlToKey(((WebCacheLocalResp) obj).getUrl());
                if (strUrlToKey != null) {
                    Intrinsics.e(map);
                    map.put(strUrlToKey, obj);
                }
            }
        }
        this.localFileMap = (ConcurrentHashMap) map;
    }

    private final void setSourceList2(List<u> sourceList) {
        ArrayList arrayList = new ArrayList(sourceList.size());
        for (u uVar : sourceList) {
            arrayList.add(new WebCacheLocalResp((String) uVar.f43985a, (String) uVar.f43986b, null, (String) uVar.f43987c, null, false, 52, null));
        }
        Map map = null;
        Collection collectionUseful$default = IUsefulCheckKt.useful$default(arrayList, false, 1, null);
        if (collectionUseful$default != null && !collectionUseful$default.isEmpty()) {
            map = (Map) ConcurrentHashMap.class.newInstance();
            for (Object obj : collectionUseful$default) {
                String strUrlToKey = UrlHelper.INSTANCE.urlToKey(((WebCacheLocalResp) obj).getUrl());
                if (strUrlToKey != null) {
                    Intrinsics.e(map);
                    map.put(strUrlToKey, obj);
                }
            }
        }
        this.localFileMap = (ConcurrentHashMap) map;
    }

    private final void setSourceStr(String sourceStr) {
        Map map = null;
        Collection collectionUseful$default = IUsefulCheckKt.useful$default(WebCacheLocalRespKt.jsonArrayParse(sourceStr), false, 1, null);
        if (collectionUseful$default != null && !collectionUseful$default.isEmpty()) {
            map = (Map) ConcurrentHashMap.class.newInstance();
            for (Object obj : collectionUseful$default) {
                String strUrlToKey = UrlHelper.INSTANCE.urlToKey(((WebCacheLocalResp) obj).getUrl());
                if (strUrlToKey != null) {
                    Intrinsics.e(map);
                    map.put(strUrlToKey, obj);
                }
            }
        }
        this.localFileMap = (ConcurrentHashMap) map;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WebCacheFileDetail getLocalFileDirDetail() {
        return this.localFileDirDetail;
    }

    @Nullable
    public final ConcurrentHashMap<String, WebCacheLocalResp> component2() {
        return this.localFileMap;
    }

    @NotNull
    public final WebCacheDataSource copy(@NotNull WebCacheFileDetail localFileDirDetail, @Nullable ConcurrentHashMap<String, WebCacheLocalResp> localFileMap) {
        Intrinsics.checkNotNullParameter(localFileDirDetail, "localFileDirDetail");
        return new WebCacheDataSource(localFileDirDetail, localFileMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebCacheDataSource)) {
            return false;
        }
        WebCacheDataSource webCacheDataSource = (WebCacheDataSource) other;
        return Intrinsics.c(this.localFileDirDetail, webCacheDataSource.localFileDirDetail) && Intrinsics.c(this.localFileMap, webCacheDataSource.localFileMap);
    }

    @NotNull
    public final WebCacheFileDetail getLocalFileDirDetail() {
        return this.localFileDirDetail;
    }

    @Nullable
    public final ConcurrentHashMap<String, WebCacheLocalResp> getLocalFileMap() {
        return this.localFileMap;
    }

    public int hashCode() {
        int iHashCode = this.localFileDirDetail.hashCode() * 31;
        ConcurrentHashMap<String, WebCacheLocalResp> concurrentHashMap = this.localFileMap;
        return iHashCode + (concurrentHashMap == null ? 0 : concurrentHashMap.hashCode());
    }

    public final void setLocalFileDirDetail(@NotNull WebCacheFileDetail webCacheFileDetail) {
        Intrinsics.checkNotNullParameter(webCacheFileDetail, "<set-?>");
        this.localFileDirDetail = webCacheFileDetail;
    }

    public final void setLocalFileMap(@Nullable ConcurrentHashMap<String, WebCacheLocalResp> concurrentHashMap) {
        this.localFileMap = concurrentHashMap;
    }

    @NotNull
    public String toString() {
        return "WebCacheDataSource(localFileDirDetail=" + this.localFileDirDetail + ", localFileMap=" + this.localFileMap + ")";
    }

    public /* synthetic */ WebCacheDataSource(WebCacheFileDetail webCacheFileDetail, ConcurrentHashMap concurrentHashMap, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(webCacheFileDetail, (i7 & 2) != 0 ? null : concurrentHashMap);
    }

    public /* synthetic */ WebCacheDataSource(String str, boolean z3, List list, List list2, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? false : z3, (i7 & 4) != 0 ? null : list, (i7 & 8) != 0 ? null : list2, (i7 & 16) != 0 ? null : str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebCacheDataSource(@NotNull String offlineDirPath, boolean z3, @Nullable List<WebCacheLocalResp> list, @Nullable List<u> list2, @Nullable String str) {
        File file;
        String cacheDir;
        String strY;
        Intrinsics.checkNotNullParameter(offlineDirPath, "offlineDirPath");
        if (z3) {
            WebCacheParamsProvider paramsProvider = WebCacheSetting.INSTANCE.getParamsProvider();
            if (paramsProvider != null && (cacheDir = paramsProvider.getCacheDir()) != null && (strY = q0.y(cacheDir, File.separator, offlineDirPath)) != null) {
                file = new File(strY);
            } else {
                throw new RuntimeException("Cache dir need to be set by WebCacheParamsProvider");
            }
        } else {
            file = new File(offlineDirPath);
        }
        this(new WebCacheFileDetail(file), null, 2, 0 == true ? 1 : 0);
        if (list != null) {
            setSourceList1(list);
        } else if (list2 != null) {
            setSourceList2(list2);
        } else if (str != null) {
            setSourceStr(str);
        }
    }
}
