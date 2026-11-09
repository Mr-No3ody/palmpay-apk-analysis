package com.facebook.react.common.network;

import Gg.f;
import com.transsnet.palmpay.custom_view.dialog.y;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.U;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/common/network/OkHttpCallUtil;", "", "<init>", "()V", "Lokhttp3/U;", "client", "tag", "", "cancelTag", "(Lokhttp3/U;Ljava/lang/Object;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OkHttpCallUtil {

    @NotNull
    public static final OkHttpCallUtil INSTANCE = new OkHttpCallUtil();

    private OkHttpCallUtil() {
    }

    @JvmStatic
    public static final void cancelTag(@NotNull U client, @NotNull Object tag) {
        List<Call> listUnmodifiableList;
        List<Call> listUnmodifiableList2;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(tag, "tag");
        y yVar = client.f40653a;
        synchronized (yVar) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) yVar.f31323a;
                ArrayList arrayList = new ArrayList(r.l(arrayDeque, 10));
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    arrayList.add(((f) it.next()).f3434c);
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Call call : listUnmodifiableList) {
            if (Intrinsics.c(tag, call.request().c(Object.class))) {
                call.cancel();
                return;
            }
        }
        synchronized (yVar) {
            try {
                ArrayDeque arrayDeque2 = (ArrayDeque) yVar.f31328f;
                ArrayDeque arrayDeque3 = (ArrayDeque) yVar.f31324b;
                ArrayList arrayList2 = new ArrayList(r.l(arrayDeque3, 10));
                Iterator it2 = arrayDeque3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((f) it2.next()).f3434c);
                }
                listUnmodifiableList2 = Collections.unmodifiableList(CollectionsKt.P(arrayDeque2, arrayList2));
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList2, "unmodifiableList(running…yncCalls.map { it.call })");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Call call2 : listUnmodifiableList2) {
            if (Intrinsics.c(tag, call2.request().c(Object.class))) {
                call2.cancel();
                return;
            }
        }
    }
}
