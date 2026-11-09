package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.net.MediaType;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22814a;

    public /* synthetic */ d(int i7) {
        this.f22814a = i7;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f22814a) {
            case 0:
                return TreeBasedTable.lambda$createColumnKeyIterator$0((Map) obj);
            case 1:
                return MediaType.lambda$computeToString$0((String) obj);
            default:
                return ImmutableMultiset.copyOf((Collection) obj);
        }
    }
}
