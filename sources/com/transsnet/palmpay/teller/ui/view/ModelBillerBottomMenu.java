package com.transsnet.palmpay.teller.ui.view;

import Bc.l;
import Pa.i0;
import Pd.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.impl.L;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.model.BaseLinearLayout;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.z;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/ModelBillerBottomMenu;", "Lcom/transsnet/palmpay/custom_view/model/BaseLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelBillerBottomMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelBillerBottomMenu.kt\ncom/transsnet/palmpay/teller/ui/view/ModelBillerBottomMenu\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
public final class ModelBillerBottomMenu extends BaseLinearLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f34335e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f34336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p155k9.a f34337d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillerBottomMenu(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(String str, List list) {
        if (list == null) {
            list = z.f38935a;
        }
        if (list.isEmpty()) {
            h.s(this, false);
            return;
        }
        ((TextView) this.f34336c.f755c).setText(f.qt_more_service);
        p155k9.a aVar = this.f34337d;
        aVar.f38700b = str;
        aVar.setList(list);
        h.s(this, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillerBottomMenu(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelBillerBottomMenu(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillerBottomMenu(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(Pd.d.qt_layout_airtime_bottom_menu_item, (ViewGroup) this, false);
        addView(viewInflate);
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        int i10 = Pd.c.ry_bottom_menu;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewInflate);
        if (recyclerView != null) {
            i10 = Pd.c.tvBottomMenuTitle;
            TextView textView = (TextView) p059e1.a.m(i10, viewInflate);
            if (textView != null) {
                l lVar = new l(linearLayout, recyclerView, textView);
                Intrinsics.checkNotNullExpressionValue(lVar, "inflate(...)");
                this.f34336c = lVar;
                p155k9.a aVar = new p155k9.a(i0.V(this));
                this.f34337d = aVar;
                setOrientation(1);
                setVisibility(8);
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
                C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(p.transparent, context), CommonViewExtKt.getDp(12), 0, 0);
                c1548f.f31336e = false;
                recyclerView.addItemDecoration(c1548f);
                recyclerView.setAdapter(aVar);
                aVar.setOnItemClickListener(new L(this, 10));
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
