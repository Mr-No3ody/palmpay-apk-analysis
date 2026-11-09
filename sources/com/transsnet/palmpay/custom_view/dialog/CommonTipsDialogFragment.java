package com.transsnet.palmpay.custom_view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.credit.ui.dialog.ViewOnClickListenerC1533v;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/custom_view/dialog/CommonTipsDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommonTipsDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final a f31249X = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public v f31250C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public v f31251H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public c f31252L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public c f31253M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Boolean f31254Q = Boolean.FALSE;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final CommonTipsDialogFragment create(String str, String str2, String str3, Function0<Unit> function0, String str4) {
            CommonTipsDialogFragment commonTipsDialogFragment = new CommonTipsDialogFragment();
            if (!TextUtils.isEmpty(str)) {
                commonTipsDialogFragment.f31250C = new v(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                commonTipsDialogFragment.f31251H = new v(str2, 14.0f, L6.b.ppColorTextNormal);
            }
            if (!TextUtils.isEmpty(str3)) {
                commonTipsDialogFragment.f31252L = new c(str3, function0);
            }
            if (!TextUtils.isEmpty(str4)) {
                commonTipsDialogFragment.f31253M = new c(str4);
            }
            return commonTipsDialogFragment;
        }

        public static /* synthetic */ CommonTipsDialogFragment create$default(a aVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Boolean bool, int i7, Object obj) {
            if ((i7 & 16) != 0) {
                bool = Boolean.FALSE;
            }
            return aVar.create(charSequence, charSequence2, charSequence3, charSequence4, bool);
        }

        public static /* synthetic */ CommonTipsDialogFragment createDialog$default(a aVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Boolean bool, int i7, Object obj) {
            if ((i7 & 8) != 0) {
                bool = Boolean.FALSE;
            }
            return aVar.createDialog(charSequence, charSequence2, charSequence3, bool);
        }

        @NotNull
        public final CommonTipsDialogFragment createDialog(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable CharSequence charSequence3, @Nullable Boolean bool) {
            return create(charSequence, charSequence2, (CharSequence) null, charSequence3, bool);
        }

        private a() {
        }

        @NotNull
        public final CommonTipsDialogFragment createDialog(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable CharSequence charSequence3, @NotNull Function0<Unit> onClick) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            CommonTipsDialogFragment commonTipsDialogFragment = new CommonTipsDialogFragment();
            if (!TextUtils.isEmpty(charSequence)) {
                commonTipsDialogFragment.f31250C = new v(charSequence);
            }
            if (!TextUtils.isEmpty(charSequence2)) {
                commonTipsDialogFragment.f31251H = new v(charSequence2, 14.0f, L6.b.ppColorTextNormal);
            }
            if (!TextUtils.isEmpty(charSequence3)) {
                commonTipsDialogFragment.f31253M = new c(charSequence3, onClick);
            }
            return commonTipsDialogFragment;
        }

        public static /* synthetic */ CommonTipsDialogFragment create$default(a aVar, v vVar, v vVar2, c cVar, c cVar2, Boolean bool, int i7, Object obj) {
            if ((i7 & 16) != 0) {
                bool = Boolean.FALSE;
            }
            return aVar.create(vVar, vVar2, cVar, cVar2, bool);
        }

        public static /* synthetic */ CommonTipsDialogFragment createDialog$default(a aVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function0 function0, CharSequence charSequence4, Boolean bool, int i7, Object obj) {
            if ((i7 & 32) != 0) {
                bool = Boolean.FALSE;
            }
            return aVar.createDialog(charSequence, charSequence2, charSequence3, function0, charSequence4, bool);
        }

        public static /* synthetic */ CommonTipsDialogFragment createDialog$default(a aVar, v vVar, v vVar2, c cVar, c cVar2, Boolean bool, int i7, Object obj) {
            if ((i7 & 16) != 0) {
                bool = Boolean.FALSE;
            }
            return aVar.createDialog(vVar, vVar2, cVar, cVar2, bool);
        }

        @NotNull
        public final CommonTipsDialogFragment createDialog(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @Nullable CharSequence charSequence3, @NotNull Function0<Unit> onClick, @Nullable CharSequence charSequence4, @Nullable Boolean bool) {
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            return create(new v(charSequence), new v(charSequence2, 14.0f, L6.b.ppColorTextNormal), new c(charSequence3, onClick), new c(charSequence4), bool);
        }

        private final CommonTipsDialogFragment create(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Boolean bool) {
            CommonTipsDialogFragment commonTipsDialogFragment = new CommonTipsDialogFragment();
            if (!TextUtils.isEmpty(charSequence)) {
                commonTipsDialogFragment.f31250C = new v(charSequence, 20.0f, L6.b.ppColorTextPrimary);
            }
            if (!TextUtils.isEmpty(charSequence2)) {
                commonTipsDialogFragment.f31251H = new v(charSequence2, 14.0f, L6.b.ppColorTextNormal);
            }
            if (!TextUtils.isEmpty(charSequence3)) {
                commonTipsDialogFragment.f31252L = new c(charSequence3);
            }
            if (!TextUtils.isEmpty(charSequence4)) {
                commonTipsDialogFragment.f31253M = new c(charSequence4);
            }
            commonTipsDialogFragment.f31254Q = bool;
            return commonTipsDialogFragment;
        }

        @NotNull
        public final CommonTipsDialogFragment createDialog(@Nullable v vVar, @Nullable v vVar2, @Nullable c cVar, @Nullable c cVar2, @Nullable Boolean bool) {
            return create(vVar, vVar2, cVar, cVar2, bool);
        }

        private final CommonTipsDialogFragment create(v vVar, v vVar2, c cVar, c cVar2, Boolean bool) {
            CommonTipsDialogFragment commonTipsDialogFragment = new CommonTipsDialogFragment();
            commonTipsDialogFragment.f31250C = vVar;
            commonTipsDialogFragment.f31251H = vVar2;
            commonTipsDialogFragment.f31252L = cVar;
            commonTipsDialogFragment.f31253M = cVar2;
            commonTipsDialogFragment.f31254Q = bool;
            return commonTipsDialogFragment;
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        this.f31244j = true;
        this.f31245o = false;
        this.f31238c = DensityUtil.dp2px(16.0f);
        this.f31246p = false;
        this.f31243i = com.transsnet.palmpay.custom_view.w.Animation_CommonDialog;
        this.f31242g = 17;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        v vVar = this.f31250C;
        v vVar2 = this.f31251H;
        final c cVar = this.f31252L;
        final c cVar2 = this.f31253M;
        Boolean bool = this.f31254Q;
        j jVar = new j(contextRequireContext);
        p355xf.t tVar = jVar.f31277d;
        if (vVar != null) {
            TextView textView = (TextView) tVar.getValue();
            CharSequence charSequence = vVar.f31316a;
            textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
            ((TextView) tVar.getValue()).setText(charSequence);
            ((TextView) tVar.getValue()).setTextSize(2, vVar.f31317b);
            ((TextView) tVar.getValue()).setTextColor(contextRequireContext.getResources().getColor(vVar.f31318c));
        } else {
            ((TextView) tVar.getValue()).setVisibility(8);
        }
        p355xf.t tVar2 = jVar.f31276c;
        if (vVar2 != null) {
            ((TextView) tVar2.getValue()).setVisibility(0);
            ((TextView) tVar2.getValue()).setText(vVar2.f31316a);
            ((TextView) tVar2.getValue()).setTextSize(2, vVar2.f31317b);
            ((TextView) tVar2.getValue()).setTextColor(contextRequireContext.getResources().getColor(vVar2.f31318c));
        } else {
            ((TextView) tVar2.getValue()).setVisibility(8);
        }
        p355xf.t tVar3 = jVar.f31275b;
        if (cVar != null) {
            ((RoundedTextView) tVar3.getValue()).setVisibility(0);
            ((RoundedTextView) tVar3.getValue()).setText(cVar.f31261a);
            final int i7 = 0;
            ((RoundedTextView) tVar3.getValue()).setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.custom_view.dialog.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommonTipsDialogFragment commonTipsDialogFragment = this;
                    c cVar3 = cVar;
                    switch (i7) {
                        case 0:
                            CommonTipsDialogFragment.a aVar = CommonTipsDialogFragment.f31249X;
                            cVar3.f31262b.invoke();
                            commonTipsDialogFragment.dismissAllowingStateLoss();
                            break;
                        default:
                            CommonTipsDialogFragment.a aVar2 = CommonTipsDialogFragment.f31249X;
                            cVar3.f31262b.invoke();
                            commonTipsDialogFragment.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        } else {
            ((RoundedTextView) tVar3.getValue()).setVisibility(8);
        }
        p355xf.t tVar4 = jVar.f31274a;
        if (cVar2 != null) {
            ((RoundedTextView) tVar4.getValue()).setVisibility(0);
            ((RoundedTextView) tVar4.getValue()).setText(cVar2.f31261a);
            final int i10 = 1;
            ((RoundedTextView) tVar4.getValue()).setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.custom_view.dialog.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommonTipsDialogFragment commonTipsDialogFragment = this;
                    c cVar3 = cVar2;
                    switch (i10) {
                        case 0:
                            CommonTipsDialogFragment.a aVar = CommonTipsDialogFragment.f31249X;
                            cVar3.f31262b.invoke();
                            commonTipsDialogFragment.dismissAllowingStateLoss();
                            break;
                        default:
                            CommonTipsDialogFragment.a aVar2 = CommonTipsDialogFragment.f31249X;
                            cVar3.f31262b.invoke();
                            commonTipsDialogFragment.dismissAllowingStateLoss();
                            break;
                    }
                }
            });
        } else {
            ((RoundedTextView) tVar4.getValue()).setVisibility(8);
        }
        p355xf.t tVar5 = jVar.f31278e;
        ((ImageView) tVar5.getValue()).setVisibility(Intrinsics.c(bool, Boolean.TRUE) ? 0 : 8);
        ((ImageView) tVar5.getValue()).setOnClickListener(new ViewOnClickListenerC1533v(this, 19));
        return jVar;
    }
}
