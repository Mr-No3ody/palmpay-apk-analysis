package com.transsnet.palmpay.send_money.ui.view;

import Gd.g;
import Gd.h;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\n\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/view/TransferHomeEntranceView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "Gd/g", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferHomeEntranceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferHomeEntranceView.kt\ncom/transsnet/palmpay/send_money/ui/view/TransferHomeEntranceView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1#2:299\n1878#3,3:300\n*S KotlinDebug\n*F\n+ 1 TransferHomeEntranceView.kt\ncom/transsnet/palmpay/send_money/ui/view/TransferHomeEntranceView\n*L\n161#1:300,3\n*E\n"})
public final class TransferHomeEntranceView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewPager2 f33873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f33874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f33875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f33876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function2 f33877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33878f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferHomeEntranceView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(List list, Function2 onEntryClick) {
        Intrinsics.checkNotNullParameter(onEntryClick, "onEntryClick");
        this.f33877e = onEntryClick;
        if (list == null) {
            list = z.f38935a;
        }
        boolean zIsEmpty = list.isEmpty();
        LinearLayout linearLayout = this.f33874b;
        ArrayList arrayList = this.f33875c;
        ViewPager2 viewPager2 = this.f33873a;
        if (zIsEmpty) {
            h hVar = this.f33876d;
            if (hVar != null) {
                viewPager2.unregisterOnPageChangeCallback(hVar);
            }
            this.f33876d = null;
            viewPager2.setAdapter(null);
            arrayList.clear();
            linearLayout.removeAllViews();
            p220oa.h.c(linearLayout);
            b(0);
            this.f33877e = null;
            this.f33878f = false;
            p220oa.h.c(this);
            return;
        }
        p220oa.h.C(this);
        this.f33878f = list.size() > 4;
        ArrayList arrayListZ = CollectionsKt.z(list, 4);
        h hVar2 = this.f33876d;
        if (hVar2 != null) {
            viewPager2.unregisterOnPageChangeCallback(hVar2);
        }
        h hVar3 = new h(this);
        this.f33876d = hVar3;
        viewPager2.registerOnPageChangeCallback(hVar3);
        viewPager2.setAdapter(new g(this, arrayListZ));
        int size = arrayListZ.size();
        arrayList.clear();
        linearLayout.removeAllViews();
        if (size <= 1) {
            p220oa.h.c(linearLayout);
            b(0);
        } else {
            p220oa.h.C(linearLayout);
            b(CommonViewExtKt.getDp(12));
            int dp = CommonViewExtKt.getDp(1);
            int i7 = 0;
            while (i7 < size) {
                ImageView imageView = new ImageView(getContext());
                imageView.setAdjustViewBounds(true);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setImageResource(d.sm_shape_transfer_entrance_indicator);
                imageView.setSelected(i7 == 0);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginStart(dp);
                layoutParams.setMarginEnd(dp);
                Unit unit = Unit.f38893a;
                linearLayout.addView(imageView, layoutParams);
                arrayList.add(imageView);
                i7++;
            }
        }
        viewPager2.setUserInputEnabled(arrayListZ.size() > 1);
        viewPager2.setCurrentItem(0, false);
    }

    public final void b(int i7) {
        LinearLayout linearLayout = this.f33874b;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.topMargin = i7;
        linearLayout.setLayoutParams(layoutParams2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h hVar = this.f33876d;
        if (hVar != null) {
            this.f33873a.unregisterOnPageChangeCallback(hVar);
        }
        this.f33876d = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferHomeEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransferHomeEntranceView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TransferHomeEntranceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewPager2 viewPager2 = new ViewPager2(context);
        this.f33873a = viewPager2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33874b = linearLayout;
        this.f33875c = new ArrayList();
        setOrientation(1);
        viewPager2.setLayoutParams(new LinearLayout.LayoutParams(-1, CommonViewExtKt.getDp(64)));
        viewPager2.setOffscreenPageLimit(1);
        addView(viewPager2);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = CommonViewExtKt.getDp(12);
        linearLayout.setLayoutParams(layoutParams);
        addView(linearLayout);
    }
}
