package com.palmpay.lib.webview.cache.util;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0010\b\u0001\u0010\u0001*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0004*\u0002H\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"useful", "R", "T", "Lcom/palmpay/lib/webview/cache/util/IUsefulCheck;", "", "needUseful", "", "(Ljava/util/Collection;Z)Ljava/util/Collection;", "lib_webview_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class IUsefulCheckKt {
    public static final <T extends IUsefulCheck, R extends Collection<T>> R useful(R r3, boolean z3) {
        if (r3 != null) {
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                if ((z3 && !((IUsefulCheck) it.next()).useful()) || (!z3 && ((IUsefulCheck) it.next()).useful())) {
                    it.remove();
                }
            }
        }
        return r3;
    }

    public static /* synthetic */ Collection useful$default(Collection collection, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = true;
        }
        return useful(collection, z3);
    }
}
