package E0;

import C0.C0119k;
import C0.P;
import C0.e0;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.AbstractActivityC0822m;
import androidx.fragment.app.E;
import androidx.lifecycle.T;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.fragment.NavHostFragment;
import androidx.savedstate.SavedStateRegistry$SavedStateProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C1843j;
import kotlin.collections.C1850q;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements SavedStateRegistry$SavedStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2174b;

    public /* synthetic */ n(Object obj, int i7) {
        this.f2173a = i7;
        this.f2174b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    public final Bundle saveState() {
        Bundle bundle;
        switch (this.f2173a) {
            case 0:
                P this_apply = (P) this.f2174b;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : G.k(this_apply.f1120u.f1044a).entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle bundleH = ((e0) entry.getValue()).h();
                    if (bundleH != null) {
                        arrayList.add(str);
                        bundle2.putBundle(str, bundleH);
                    }
                }
                if (arrayList.isEmpty()) {
                    bundle = null;
                } else {
                    bundle = new Bundle();
                    bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
                }
                C1843j c1843j = this_apply.f1107g;
                if (!c1843j.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[c1843j.f38933c];
                    Iterator<E> it = c1843j.iterator();
                    int i7 = 0;
                    while (it.hasNext()) {
                        parcelableArr[i7] = new NavBackStackEntryState((C0119k) it.next());
                        i7++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                LinkedHashMap linkedHashMap = this_apply.f1112l;
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap.size()];
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int i10 = 0;
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        int iIntValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        iArr[i10] = iIntValue;
                        arrayList2.add(str2);
                        i10++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
                }
                LinkedHashMap linkedHashMap2 = this_apply.f1113m;
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        C1843j c1843j2 = (C1843j) entry3.getValue();
                        arrayList3.add(str3);
                        Parcelable[] parcelableArr2 = new Parcelable[c1843j2.f38933c];
                        int i11 = 0;
                        for (Object obj : c1843j2) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                C1850q.k();
                                throw null;
                            }
                            parcelableArr2[i11] = (NavBackStackEntryState) obj;
                            i11 = i12;
                        }
                        bundle.putParcelableArray(C0.G.o("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
                }
                if (this_apply.f1106f) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this_apply.f1106f);
                }
                if (bundle != null) {
                    return bundle;
                }
                Bundle EMPTY = Bundle.EMPTY;
                Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
                return EMPTY;
            case 1:
                NavHostFragment this$0 = (NavHostFragment) this.f2174b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i13 = this$0.f17505c;
                if (i13 != 0) {
                    return p002a.a.e(new Pair("android-support-nav:fragment:graphId", Integer.valueOf(i13)));
                }
                Bundle bundle3 = Bundle.EMPTY;
                Intrinsics.checkNotNullExpressionValue(bundle3, "{\n                    Bu…e.EMPTY\n                }");
                return bundle3;
            case 2:
                return AbstractActivityC0822m.c((E) this.f2174b);
            default:
                return T.a((T) this.f2174b);
        }
    }
}
