package androidx.fragment.app;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class P implements ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f17037b;

    public /* synthetic */ P(Z z3, int i7) {
        this.f17036a = i7;
        this.f17037b = z3;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(Object obj) {
        switch (this.f17036a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
                }
                Z z3 = this.f17037b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) z3.f17056F.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo != null) {
                    Fragment fragmentC = z3.f17069c.c(fragmentManager$LaunchedFragmentInfo.f16991a);
                    if (fragmentC != null) {
                        fragmentC.onRequestPermissionsResult(fragmentManager$LaunchedFragmentInfo.f16992b, strArr, iArr);
                        break;
                    }
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                Z z8 = this.f17037b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) z8.f17056F.pollLast();
                if (fragmentManager$LaunchedFragmentInfo2 != null) {
                    Fragment fragmentC2 = z8.f17069c.c(fragmentManager$LaunchedFragmentInfo2.f16991a);
                    if (fragmentC2 != null) {
                        fragmentC2.onActivityResult(fragmentManager$LaunchedFragmentInfo2.f16992b, activityResult.f12042a, activityResult.f12043b);
                        break;
                    }
                }
                break;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                Z z10 = this.f17037b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) z10.f17056F.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 != null) {
                    Fragment fragmentC3 = z10.f17069c.c(fragmentManager$LaunchedFragmentInfo3.f16991a);
                    if (fragmentC3 != null) {
                        fragmentC3.onActivityResult(fragmentManager$LaunchedFragmentInfo3.f16992b, activityResult2.f12042a, activityResult2.f12043b);
                        break;
                    }
                }
                break;
        }
    }
}
