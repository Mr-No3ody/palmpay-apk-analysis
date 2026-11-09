package V7;

import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.swmansion.rnscreens.gamma.tabs.TabsHost;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import p010a9.m;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f10095b;

    public /* synthetic */ f(Function1 function1, int i7) {
        this.f10094a = i7;
        this.f10095b = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        Function1 function1 = this.f10095b;
        switch (this.f10094a) {
            case 0:
                KProperty[] kPropertyArr = TabsHost.f25438y0;
                return ((Boolean) ((e) function1).invoke(obj)).booleanValue();
            case 1:
                return ReactScrollViewHelper.removeScrollListener$lambda$1((m) function1, obj);
            default:
                return ReactScrollViewHelper.removeLayoutChangeListener$lambda$3((m) function1, obj);
        }
    }
}
