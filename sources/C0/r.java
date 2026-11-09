package C0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f1081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.D f1083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0130w f1084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f1085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.jvm.internal.B b7, ArrayList arrayList, kotlin.jvm.internal.D d2, AbstractC0130w abstractC0130w, Bundle bundle) {
        super(1);
        this.f1081a = b7;
        this.f1082b = arrayList;
        this.f1083c = d2;
        this.f1084d = abstractC0130w;
        this.f1085e = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listSubList;
        C0119k entry = (C0119k) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f1081a.f38947a = true;
        ArrayList arrayList = this.f1082b;
        int iIndexOf = arrayList.indexOf(entry);
        if (iIndexOf != -1) {
            kotlin.jvm.internal.D d2 = this.f1083c;
            int i7 = iIndexOf + 1;
            listSubList = arrayList.subList(d2.f38949a, i7);
            d2.f38949a = i7;
        } else {
            listSubList = kotlin.collections.z.f38935a;
        }
        this.f1084d.a(entry.f1051b, this.f1085e, entry, listSubList);
        return Unit.f38893a;
    }
}
