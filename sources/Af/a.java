package Af;

import java.util.Map;
import kotlin.collections.AbstractC1841h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends AbstractC1841h {
    public abstract boolean b(Map.Entry entry);

    public /* bridge */ boolean c(Map.Entry entry) {
        return super.remove(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return b(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }
}
