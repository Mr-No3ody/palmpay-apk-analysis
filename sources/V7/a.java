package V7;

import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.rnscreens.gamma.tabs.TabScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabScreen f10091b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(TabScreen tabScreen, int i7) {
        super(null);
        this.f10090a = i7;
        this.f10091b = tabScreen;
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        switch (this.f10090a) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                TabScreen tabScreen = this.f10091b;
                TabScreen.a(tabScreen, (String) obj, (String) obj2);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(property, "property");
                TabScreen tabScreen2 = this.f10091b;
                TabScreen.a(tabScreen2, (String) obj, (String) obj2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(property, "property");
                TabScreen tabScreen3 = this.f10091b;
                TabScreen.a(tabScreen3, (Integer) obj, (Integer) obj2);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(property, "property");
                TabScreen tabScreen4 = this.f10091b;
                TabScreen.a(tabScreen4, (Integer) obj, (Integer) obj2);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(property, "property");
                TabScreen tabScreen5 = this.f10091b;
                TabScreen.a(tabScreen5, (String) obj, (String) obj2);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(property, "property");
                TabScreen tabScreen6 = this.f10091b;
                TabScreen.a(tabScreen6, (String) obj, (String) obj2);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(property, "property");
                String str = (String) obj2;
                if (!Intrinsics.c(str, (String) obj)) {
                    TabScreen tabScreen7 = this.f10091b;
                    ThemedReactContext context = tabScreen7.getReactContext();
                    Intrinsics.checkNotNullParameter(context, "context");
                    Drawable drawableQ = null;
                    if (str != null) {
                        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
                        if (identifier > 0) {
                            drawableQ = p264r5.a.q(identifier, context);
                        } else {
                            int identifier2 = context.getResources().getIdentifier(str, "drawable", "android");
                            if (identifier2 > 0) {
                                drawableQ = p264r5.a.q(identifier2, context);
                            }
                        }
                    }
                    tabScreen7.setIcon(drawableQ);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(property, "property");
                TabScreen tabScreen8 = this.f10091b;
                TabScreen.a(tabScreen8, (Drawable) obj, (Drawable) obj2);
                break;
        }
    }
}
