package V7;

import android.graphics.drawable.ColorDrawable;
import com.swmansion.rnscreens.gamma.tabs.TabsHost;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabsHost f10101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(TabsHost tabsHost, int i7, boolean z3) {
        super(null);
        this.f10100a = i7;
        this.f10101b = tabsHost;
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        TabsHost tabsHost = this.f10101b;
        int i7 = this.f10100a;
        Intrinsics.checkNotNullParameter(property, "property");
        switch (i7) {
            case 0:
                TabsHost.c(tabsHost, (Float) obj, (Float) obj2);
                break;
            case 1:
                TabsHost.c(tabsHost, (String) obj, (String) obj2);
                break;
            case 2:
                TabsHost.c(tabsHost, (String) obj, (String) obj2);
                break;
            case 3:
                TabsHost.c(tabsHost, (Integer) obj, (Integer) obj2);
                break;
            case 4:
                TabsHost.c(tabsHost, (String) obj, (String) obj2);
                break;
            case 5:
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj;
                if (bool.booleanValue() != bool2.booleanValue()) {
                    KProperty[] kPropertyArr = TabsHost.f25438y0;
                    tabsHost.e(null);
                    TabsHost.c(tabsHost, bool2, bool);
                }
                break;
            case 6:
                Integer num = (Integer) obj2;
                if (!Intrinsics.c(num, (Integer) obj)) {
                    tabsHost.setBackground(num != null ? new ColorDrawable(num.intValue()) : null);
                }
                break;
            case 7:
                TabsHost.c(tabsHost, (Integer) obj, (Integer) obj2);
                break;
            case 8:
                TabsHost.c(tabsHost, (Integer) obj, (Integer) obj2);
                break;
            case 9:
                Boolean bool3 = (Boolean) obj2;
                bool3.getClass();
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                TabsHost.c(tabsHost, bool4, bool3);
                break;
            case 10:
                TabsHost.c(tabsHost, (Integer) obj, (Integer) obj2);
                break;
            case 11:
                TabsHost.c(tabsHost, (String) obj, (String) obj2);
                break;
            case 12:
                TabsHost.c(tabsHost, (Integer) obj, (Integer) obj2);
                break;
            case 13:
                TabsHost.c(tabsHost, (Integer) obj, (Integer) obj2);
                break;
            case 14:
                TabsHost.c(tabsHost, (Integer) obj, (Integer) obj2);
                break;
            default:
                TabsHost.c(tabsHost, (Float) obj, (Float) obj2);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(TabsHost tabsHost, int i7) {
        this.f10100a = i7;
        switch (i7) {
            case 9:
                Boolean bool = Boolean.TRUE;
                this.f10101b = tabsHost;
                super(bool);
                break;
            default:
                Boolean bool2 = Boolean.FALSE;
                this.f10101b = tabsHost;
                super(bool2);
                break;
        }
    }
}
