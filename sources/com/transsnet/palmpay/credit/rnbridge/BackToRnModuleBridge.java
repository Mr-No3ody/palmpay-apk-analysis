package com.transsnet.palmpay.credit.rnbridge;

import F6.d;
import android.app.Activity;
import com.didi.drouter.annotation.Service;
import com.facebook.imagepipeline.nativecode.b;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridge.IBridgeCallback;
import com.palmpay.lib.bridge.SyncBridge;
import com.transsnet.palmpay.credit.bean.BackToRnModuleParam;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.collections.z;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Service(alias = {"/credit/backToRnModule"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/rnbridge/BackToRnModuleBridge;", "Lcom/palmpay/lib/bridge/SyncBridge;", "Lcom/transsnet/palmpay/credit/bean/BackToRnModuleParam;", "<init>", "()V", "params", "Lcom/palmpay/lib/bridge/IBridgeCallback;", "callback", "", "onHandle", "(Lcom/transsnet/palmpay/credit/bean/BackToRnModuleParam;Lcom/palmpay/lib/bridge/IBridgeCallback;)V", "Companion", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBackToRnModuleBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackToRnModuleBridge.kt\ncom/transsnet/palmpay/credit/rnbridge/BackToRnModuleBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,47:1\n1563#2:48\n1634#2,3:49\n774#2:52\n865#2,2:53\n37#3:55\n36#3,3:56\n*S KotlinDebug\n*F\n+ 1 BackToRnModuleBridge.kt\ncom/transsnet/palmpay/credit/rnbridge/BackToRnModuleBridge\n*L\n26#1:48\n26#1:49,3\n27#1:52\n27#1:53,2\n35#1:55\n35#1:56,3\n*E\n"})
public final class BackToRnModuleBridge extends SyncBridge<BackToRnModuleParam> {

    @NotNull
    public static final String TAG = "BackToRnModuleBridge";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12, types: [kotlin.collections.z] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.StringBuilder] */
    @Override // com.palmpay.lib.bridge.BaseBridge
    public void onHandle(@Nullable BackToRnModuleParam params, @Nullable IBridgeCallback callback) {
        ?? arrayList;
        List<String> list;
        if (params == null || (list = params.moduleNames) == null) {
            arrayList = 0;
        } else {
            List<String> list2 = list;
            ArrayList arrayList2 = new ArrayList(r.l(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(StringsKt.V((String) it.next()).toString());
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList == 0) {
            arrayList = z.f38935a;
        }
        d.h(TAG, 3, "onHandle >>> moduleNames=" + arrayList);
        if (arrayList.isEmpty()) {
            handleReject("moduleNames is empty");
            return;
        }
        String[] strArr = (String[]) ((Collection) arrayList).toArray(new String[0]);
        Activity activityO = b.o((String[]) Arrays.copyOf(strArr, strArr.length));
        d.h(TAG, 3, "onHandle >>> target=" + activityO);
        if (activityO == null) {
            handleReject("rn module not in stack");
        } else {
            handleSuccess();
            ActivityUtils.finishToActivity(activityO, false);
        }
    }
}
