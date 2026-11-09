package com.transsnet.palmpay.airtime.ui.view;

import C0.G;
import G1.d;
import Pa.r0;
import Rd.l0;
import Sa.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.transsnet.palmpay.airtime.bean.rsp.GroupPurchaseItem;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p054dd.n;
import p141j9.D;
import p202n9.e;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/view/ModelAirtimeGoupPurchaseSaleView;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "n9/e", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelAirtimeGoupPurchaseSaleView extends BaseConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f26602d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f26603c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAirtimeGoupPurchaseSaleView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(e eVar, GroupPurchaseItem groupPurchaseItem, D d2) {
        int i7;
        View view = eVar.f39867a;
        if (groupPurchaseItem == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        List<String> avatar = groupPurchaseItem.getAvatar();
        List listU = avatar != null ? CollectionsKt.U(avatar, 4) : null;
        Long groupNumber = groupPurchaseItem.getGroupNumber();
        int iLongValue = (int) (groupNumber != null ? groupNumber.longValue() : 0L);
        GroupPurchaseAvatarLayout groupPurchaseAvatarLayout = eVar.f39868b;
        groupPurchaseAvatarLayout.removeAllViews();
        if (listU == null) {
            listU = z.f38935a;
        }
        if (iLongValue < 5) {
            int i10 = 0;
            for (Object obj : listU) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C1850q.k();
                    throw null;
                }
                String str = (String) obj;
                AppCompatImageView appCompatImageViewB = groupPurchaseAvatarLayout.b();
                if (StringsKt.F(str)) {
                    appCompatImageViewB.setImageDrawable(null);
                } else {
                    r0.j1(appCompatImageViewB, str, (d) d.O(r.cv_avatar_default).H(new b(groupPurchaseAvatarLayout.f26588c, CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, groupPurchaseAvatarLayout.getContext()))));
                }
                groupPurchaseAvatarLayout.a(appCompatImageViewB, i10);
                i10 = i11;
            }
            int size = iLongValue - listU.size();
            if (size > 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    AppCompatImageView appCompatImageViewB2 = groupPurchaseAvatarLayout.b();
                    appCompatImageViewB2.setImageResource(Pd.b.qt_group_purchase_avater_add);
                    groupPurchaseAvatarLayout.a(appCompatImageViewB2, listU.size() + i12);
                }
            }
        } else {
            AppCompatImageView appCompatImageViewB3 = groupPurchaseAvatarLayout.b();
            if (listU.isEmpty()) {
                i7 = 0;
            } else {
                i7 = 0;
                if (!StringsKt.F((CharSequence) listU.get(0))) {
                    r0.m1((String) listU.get(0), appCompatImageViewB3);
                }
                groupPurchaseAvatarLayout.a(appCompatImageViewB3, i7);
                AppCompatImageView appCompatImageViewB4 = groupPurchaseAvatarLayout.b();
                appCompatImageViewB4.setImageResource(Pd.b.qt_group_purchase_avater_more);
                groupPurchaseAvatarLayout.a(appCompatImageViewB4, 1);
                AppCompatImageView appCompatImageViewB5 = groupPurchaseAvatarLayout.b();
                appCompatImageViewB5.setImageResource(Pd.b.qt_group_purchase_avater_add);
                groupPurchaseAvatarLayout.a(appCompatImageViewB5, 2);
            }
            appCompatImageViewB3.setImageDrawable(null);
            groupPurchaseAvatarLayout.a(appCompatImageViewB3, i7);
            AppCompatImageView appCompatImageViewB6 = groupPurchaseAvatarLayout.b();
            appCompatImageViewB6.setImageResource(Pd.b.qt_group_purchase_avater_more);
            groupPurchaseAvatarLayout.a(appCompatImageViewB6, 1);
            AppCompatImageView appCompatImageViewB7 = groupPurchaseAvatarLayout.b();
            appCompatImageViewB7.setImageResource(Pd.b.qt_group_purchase_avater_add);
            groupPurchaseAvatarLayout.a(appCompatImageViewB7, 2);
        }
        Long amount = groupPurchaseItem.getAmount();
        eVar.f39869c.setText(G.o("Airtime ", r0.C(r0.E(amount != null ? amount.longValue() : 0L), true)));
        Long groupAmount = groupPurchaseItem.getGroupAmount();
        eVar.f39870d.setText(r0.C(r0.E(groupAmount != null ? groupAmount.longValue() : 0L), true));
        if (view != null) {
            view.setOnClickListener(new n(20, d2, groupPurchaseItem));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAirtimeGoupPurchaseSaleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelAirtimeGoupPurchaseSaleView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAirtimeGoupPurchaseSaleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26603c = l0.bind(View.inflate(context, Pd.d.qt_layout_purchase_sale_view, this));
        h.s(this, false);
    }
}
