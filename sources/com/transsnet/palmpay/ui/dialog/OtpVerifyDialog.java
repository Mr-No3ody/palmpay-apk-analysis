package com.transsnet.palmpay.ui.dialog;

import Ae.k;
import M1.j;
import Pa.r0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.g;
import p025ba.l;
import p059e1.a;
import p142ja.e;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00021+B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0011JZ\u0010\u001d\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00042!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t0\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u000bR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010!R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010#R3\u0010&\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001f\u00100\u001a\u00060+R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/transsnet/palmpay/ui/dialog/OtpVerifyDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "layoutId", "styleId", "<init>", "(Landroid/content/Context;II)V", "", "initViews", "()V", "", "title", "setDialogTitle", "(Ljava/lang/String;)Lcom/transsnet/palmpay/ui/dialog/OtpVerifyDialog;", "titleResId", "(I)Lcom/transsnet/palmpay/ui/dialog/OtpVerifyDialog;", "", "items", "", "Landroid/graphics/drawable/Drawable;", "icons", "checkedItem", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", ViewProps.POSITION, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSingleChoiceItems", "([Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;)Lcom/transsnet/palmpay/ui/dialog/OtpVerifyDialog;", "show", PPRNBridge.DIALOG_ACTION_DISMISS, "[Ljava/lang/String;", "Ljava/util/List;", "I", "dialogTitle", "Ljava/lang/String;", "onItemClickListener", "Lkotlin/jvm/functions/Function1;", "Lja/e;", "binding", "Lja/e;", "LAe/k;", "mAdapter$delegate", "Lkotlin/Lazy;", "getMAdapter", "()LAe/k;", "mAdapter", "Ae/l", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOtpVerifyDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtpVerifyDialog.kt\ncom/transsnet/palmpay/ui/dialog/OtpVerifyDialog\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,179:1\n11318#2:180\n11429#2,4:181\n*S KotlinDebug\n*F\n+ 1 OtpVerifyDialog.kt\ncom/transsnet/palmpay/ui/dialog/OtpVerifyDialog\n*L\n143#1:180\n143#1:181,4\n*E\n"})
public final class OtpVerifyDialog extends b {

    @Nullable
    private e binding;
    private int checkedItem;

    @Nullable
    private String dialogTitle;

    @Nullable
    private List<? extends Drawable> icons;

    @Nullable
    private String[] items;

    /* JADX INFO: renamed from: mAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter;

    @Nullable
    private Function1<? super Integer, Unit> onItemClickListener;
    private int titleResId;

    @JvmOverloads
    public OtpVerifyDialog(@Nullable Context context) {
        this(context, 0, 0, 6, null);
    }

    private final k getMAdapter() {
        return (k) this.mAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(OtpVerifyDialog otpVerifyDialog, j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        if (r0.U0()) {
            return;
        }
        Function1<? super Integer, Unit> function1 = otpVerifyDialog.onItemClickListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i7));
        }
        otpVerifyDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k mAdapter_delegate$lambda$0(OtpVerifyDialog otpVerifyDialog) {
        return new k(g.core_dialog_otp_method_item, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OtpVerifyDialog setSingleChoiceItems$default(OtpVerifyDialog otpVerifyDialog, String[] strArr, List list, int i7, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        if ((i10 & 4) != 0) {
            i7 = -1;
        }
        return otpVerifyDialog.setSingleChoiceItems(strArr, list, i7, function1);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.binding = null;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewM;
        View viewInflate = LayoutInflater.from(getContext()).inflate(g.core_dialog_otp_verify, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i7 = p025ba.e.rvMethodList;
        RecyclerView recyclerView = (RecyclerView) a.m(i7, viewInflate);
        if (recyclerView != null) {
            i7 = p025ba.e.tv_cancel;
            TextView textView = (TextView) a.m(i7, viewInflate);
            if (textView != null) {
                i7 = p025ba.e.tvDialogTitle;
                TextView textView2 = (TextView) a.m(i7, viewInflate);
                if (textView2 != null && (viewM = a.m((i7 = p025ba.e.viewDivider), viewInflate)) != null) {
                    this.binding = new e(constraintLayout, recyclerView, textView, textView2, viewM);
                    setContentView(constraintLayout);
                    Window window = getWindow();
                    if (window != null) {
                        window.setGravity(80);
                        window.setWindowAnimations(l.dialog_bottom_in_out);
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.width = ScreenUtils.getScreenWidth();
                        attributes.height = -2;
                        window.setAttributes(attributes);
                    }
                    e eVar = this.binding;
                    if (eVar != null) {
                        eVar.f38465b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    }
                    e eVar2 = this.binding;
                    if (eVar2 != null) {
                        eVar2.f38465b.setAdapter(getMAdapter());
                    }
                    C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(L6.b.ppColorDividerLine, getContext()), CommonViewExtKt.getDp(1));
                    c1548f.f31336e = false;
                    e eVar3 = this.binding;
                    if (eVar3 != null) {
                        eVar3.f38465b.addItemDecoration(c1548f);
                    }
                    k mAdapter = getMAdapter();
                    ModelEmptyView modelEmptyView = new ModelEmptyView(getContext());
                    modelEmptyView.f31511b.setImageResource(r.cv_empty_no_transaction_history);
                    modelEmptyView.f31512c.setText("No methods available");
                    modelEmptyView.f31512c.setTextColor(modelEmptyView.getContext().getColor(L6.b.ppColorTextPrimary));
                    modelEmptyView.setBackgroundColor(modelEmptyView.getContext().getColor(p.md_white_1000));
                    mAdapter.setEmptyView(modelEmptyView);
                    getMAdapter().setOnItemClickListener(new A8.a(this, 10));
                    e eVar4 = this.binding;
                    if (eVar4 != null) {
                        eVar4.f38466c.setOnClickListener(new A8.b(this, 10));
                        return;
                    }
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @NotNull
    public final OtpVerifyDialog setDialogTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.dialogTitle = title;
        return this;
    }

    @NotNull
    public final OtpVerifyDialog setSingleChoiceItems(@NotNull String[] items, @Nullable List<? extends Drawable> icons, int checkedItem, @NotNull Function1<? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.items = items;
        this.icons = icons;
        this.checkedItem = checkedItem;
        this.onItemClickListener = listener;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.z] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    @Override // O6.f, android.app.Dialog
    public void show() {
        ?? arrayList;
        int i7 = this.titleResId;
        if (i7 != 0) {
            e eVar = this.binding;
            if (eVar != null) {
                eVar.f38467d.setText(i7);
            }
        } else {
            String str = this.dialogTitle;
            if (str == null || str.length() == 0) {
                e eVar2 = this.binding;
                if (eVar2 != null) {
                    eVar2.f38467d.setText("Select Method");
                }
            } else {
                e eVar3 = this.binding;
                if (eVar3 != null) {
                    eVar3.f38467d.setText(this.dialogTitle);
                }
            }
        }
        String[] strArr = this.items;
        if (strArr != null) {
            arrayList = new ArrayList(strArr.length);
            int length = strArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                int i12 = i11 + 1;
                List<? extends Drawable> list = this.icons;
                arrayList.add(new Ae.l(str2, list != null ? (Drawable) CollectionsKt.G(i11, list) : null));
                i10++;
                i11 = i12;
            }
        } else {
            arrayList = z.f38935a;
        }
        getMAdapter().setList((Collection) arrayList);
        super.show();
    }

    @JvmOverloads
    public OtpVerifyDialog(@Nullable Context context, int i7) {
        this(context, i7, 0, 4, null);
    }

    @NotNull
    public final OtpVerifyDialog setDialogTitle(int titleResId) {
        this.titleResId = titleResId;
        return this;
    }

    public /* synthetic */ OtpVerifyDialog(Context context, int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i7, (i11 & 4) != 0 ? w.BaseDialogTheme : i10);
    }

    @JvmOverloads
    public OtpVerifyDialog(@Nullable Context context, int i7, int i10) {
        super(context, i7, i10);
        this.checkedItem = -1;
        this.mAdapter = C2131j.b(new Ae.j(this, 0));
    }
}
