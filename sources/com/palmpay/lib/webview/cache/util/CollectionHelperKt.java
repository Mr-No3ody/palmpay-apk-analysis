package com.palmpay.lib.webview.cache.util;

import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0006\b\u0001\u0010\u0003\u0018\u0001\"\u0016\b\u0002\u0010\u0001\u0018\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0004*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u0002H\u0003\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"keyNonNullMap", "M", "K", "V", "", "", "getKey", "Lkotlin/Function1;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;", "lib_webview_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCollectionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionHelper.kt\ncom/palmpay/lib/webview/cache/util/CollectionHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n1855#2,2:23\n*S KotlinDebug\n*F\n+ 1 CollectionHelper.kt\ncom/palmpay/lib/webview/cache/util/CollectionHelperKt\n*L\n13#1:23,2\n*E\n"})
public final class CollectionHelperKt {
    public static final <K, V, M extends Map<K, V>> M keyNonNullMap(Collection<? extends V> collection, Function1<? super V, ? extends K> getKey) {
        Intrinsics.checkNotNullParameter(getKey, "getKey");
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        Intrinsics.m();
        throw null;
    }
}
