package D8;

import android.os.Build;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.flexibank.sdk.customview.wheelview.widget.FlexiBankWheelView;
import com.transsnet.mtn.sdk.ui.view.wheelview.widget.WheelView;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListView f1693b;

    public /* synthetic */ b(ListView listView, int i7) {
        this.f1692a = i7;
        this.f1693b = listView;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i7, int i10, int i11) {
        ListView listView = this.f1693b;
        switch (this.f1692a) {
            case 0:
                if (i10 != 0) {
                    int i12 = WheelView.f25757C;
                    ((WheelView) listView).c();
                }
                break;
            case 1:
                if (i10 != 0) {
                    com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.b((com.transsnet.palmpay.custom_view.wheelview.widget.WheelView) listView, false);
                }
                break;
            default:
                if (i10 != 0) {
                    FlexiBankWheelView.b((FlexiBankWheelView) listView, false);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00fd A[PHI: r7
      0x00fd: PHI (r7v7 float) = (r7v5 float), (r7v10 float), (r7v4 float) binds: [B:55:0x00fb, B:63:0x010f, B:48:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i7) {
        WheelView wheelView;
        View childAt;
        int i10;
        com.transsnet.palmpay.custom_view.wheelview.widget.WheelView wheelView2;
        View childAt2;
        FlexiBankWheelView flexiBankWheelView;
        View childAt3;
        switch (this.f1692a) {
            case 0:
                if (i7 == 0 && (childAt = (wheelView = (WheelView) this.f1693b).getChildAt(0)) != null) {
                    float y8 = childAt.getY();
                    if (y8 != 0.0f && wheelView.f25760a != 0) {
                        float fAbs = Math.abs(y8);
                        int i11 = wheelView.f25760a;
                        if (fAbs >= i11 / 2) {
                            y8 += i11;
                            if (Math.abs(y8) > 2.0f) {
                                if (Math.abs(y8) < 12.0f) {
                                    if (y8 > 0.0f) {
                                        i10 = 2;
                                    } else {
                                        i10 = -2;
                                    }
                                }
                                y8 /= 6.0f;
                                i10 = (int) y8;
                            } else {
                                i10 = (int) y8;
                            }
                        } else if (Math.abs(y8) > 2.0f) {
                            if (Math.abs(y8) < 12.0f) {
                                if (y8 > 0.0f) {
                                    i10 = 2;
                                } else {
                                    i10 = -2;
                                }
                            }
                            y8 /= 6.0f;
                            i10 = (int) y8;
                        } else {
                            i10 = (int) y8;
                        }
                        wheelView.smoothScrollBy(i10, 50);
                        break;
                    }
                }
                break;
            case 1:
                if (i7 == 0 && (childAt2 = (wheelView2 = (com.transsnet.palmpay.custom_view.wheelview.widget.WheelView) this.f1693b).getChildAt(0)) != null) {
                    float y10 = childAt2.getY();
                    if (y10 != 0.0f && wheelView2.f31723a != 0) {
                        if (Math.abs(y10) >= wheelView2.f31723a / 2) {
                            if (!Build.BRAND.toLowerCase().contains("htc")) {
                                wheelView2.smoothScrollBy(com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.a(wheelView2, wheelView2.f31723a + y10), 50);
                                break;
                            }
                        } else {
                            wheelView2.smoothScrollBy(com.transsnet.palmpay.custom_view.wheelview.widget.WheelView.a(wheelView2, y10), 50);
                            break;
                        }
                    }
                }
                break;
            default:
                if (i7 == 0 && (childAt3 = (flexiBankWheelView = (FlexiBankWheelView) this.f1693b).getChildAt(0)) != null) {
                    float y11 = childAt3.getY();
                    if (y11 != 0.0f && flexiBankWheelView.f22280a != 0) {
                        if (Math.abs(y11) >= flexiBankWheelView.f22280a / 2) {
                            String BRAND = Build.BRAND;
                            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            String lowerCase = BRAND.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            if (!StringsKt.A(lowerCase, "htc", false)) {
                                flexiBankWheelView.smoothScrollBy(FlexiBankWheelView.a(flexiBankWheelView, flexiBankWheelView.f22280a + y11), 50);
                                break;
                            }
                        } else {
                            flexiBankWheelView.smoothScrollBy(FlexiBankWheelView.a(flexiBankWheelView, y11), 50);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
