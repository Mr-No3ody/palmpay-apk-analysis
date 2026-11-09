package p177m;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f39409a = new i(null);

    @Override // p177m.b
    public final Intent createIntent(Context context, Object obj) {
        String[] input = (String[]) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return f39409a.createIntent$activity_release(input);
    }

    @Override // p177m.b
    public final a getSynchronousResult(Context context, Object obj) {
        String[] input = (String[]) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return new a(G.c());
        }
        for (String str : input) {
            if (d.a(context, str) != 0) {
                return null;
            }
        }
        int iA = F.a(input.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (String str2 : input) {
            linkedHashMap.put(str2, Boolean.TRUE);
        }
        return new a(linkedHashMap);
    }

    @Override // p177m.b
    public final Object parseResult(int i7, Intent intent) {
        if (i7 != -1) {
            return G.c();
        }
        if (intent == null) {
            return G.c();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return G.c();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i10 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i10 == 0));
        }
        return G.j(CollectionsKt.c0(C1847n.r(stringArrayExtra), arrayList));
    }
}
