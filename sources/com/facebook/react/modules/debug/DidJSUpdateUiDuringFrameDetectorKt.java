package com.facebook.react.modules.debug;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u001a0\u0010\b\u001a\u00020\u00042\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u001a(\u0010\t\u001a\u00020\n2\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\u000b"}, d2 = {"hasEventBetweenTimestamps", "", "eventArray", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "startTime", "endTime", "getLastEventBetweenTimestamps", "cleanUp", "", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDidJSUpdateUiDuringFrameDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DidJSUpdateUiDuringFrameDetector.kt\ncom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetectorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1761#2,3:152\n*S KotlinDebug\n*F\n+ 1 DidJSUpdateUiDuringFrameDetector.kt\ncom/facebook/react/modules/debug/DidJSUpdateUiDuringFrameDetectorKt\n*L\n118#1:152,3\n*E\n"})
public final class DidJSUpdateUiDuringFrameDetectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void cleanUp(ArrayList<Long> arrayList, long j6) {
        int size = arrayList.size();
        int i7 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            if (arrayList.get(i10).longValue() < j6) {
                i7++;
            }
        }
        if (i7 > 0) {
            int i11 = size - i7;
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.set(i12, arrayList.get(i12 + i7));
            }
            CollectionsKt.C(i7, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getLastEventBetweenTimestamps(ArrayList<Long> arrayList, long j6, long j10) {
        Iterator<Long> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        long j11 = -1;
        while (it.hasNext()) {
            Long next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            long jLongValue = next.longValue();
            if (j6 <= jLongValue && jLongValue < j10) {
                j11 = jLongValue;
            } else if (jLongValue >= j10) {
                break;
            }
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasEventBetweenTimestamps(ArrayList<Long> arrayList, long j6, long j10) {
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            if (j6 <= jLongValue && jLongValue < j10) {
                return true;
            }
        }
        return false;
    }
}
