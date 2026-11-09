package com.transsnet.palmpay.custom_view.input;

import Ad.C0058e;
import Ce.C0181x;
import Ed.ViewOnFocusChangeListenerC0235o;
import Hb.L;
import M1.j;
import Uc.B;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.camera.camera2.internal.Q0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.custom_view.x;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010a9.m;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 w2\u00020\u0001:\u0001wB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010L\u001a\u0004\u0018\u00010\"J\u000e\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020OJ£\u0001\u0010P\u001a\u00020Q\"\b\b\u0000\u0010R*\u00020\"2\b\u0010S\u001a\u0004\u0018\u00010T2\u0010\b\u0002\u0010U\u001a\n\u0012\u0004\u0012\u0002HR\u0018\u00010$2\u0010\b\u0002\u0010V\u001a\n\u0012\u0004\u0012\u0002HR\u0018\u00010W2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010O2\u0010\b\u0002\u0010Y\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010Z2\u0018\b\u0002\u0010\\\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0004\u0012\u00020\u0019\u0018\u00010]2\u001c\b\u0002\u0010^\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010_j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001``2\b\b\u0002\u0010a\u001a\u00020\u0019¢\u0006\u0002\u0010bJ\u0010\u0010c\u001a\u00020Q2\u0006\u0010d\u001a\u00020\u0019H\u0002J\u0010\u0010e\u001a\u00020Q2\b\u0010f\u001a\u0004\u0018\u00010OJp\u0010g\u001a\u00020Q\"\b\b\u0000\u0010R*\u00020h2\u0010\b\u0002\u0010U\u001a\n\u0012\u0004\u0012\u0002HR\u0018\u00010$2(\b\u0002\u0010i\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002HR0k\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0l\u0012\u0004\u0012\u00020Q\u0018\u00010j2\"\b\u0002\u0010m\u001a\u001c\u0012\u0004\u0012\u0002HR\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0l\u0012\u0004\u0012\u00020Q\u0018\u00010jJ\u001d\u0010n\u001a\u00020Q\"\b\b\u0000\u0010R*\u00020\"2\u0006\u0010!\u001a\u0002HR¢\u0006\u0002\u0010oJ\u0018\u0010p\u001a\u00020Q2\u0006\u0010q\u001a\u00020\u00192\b\b\u0002\u0010r\u001a\u00020\u0019J\u0018\u0010s\u001a\u00020Q2\u0006\u0010q\u001a\u00020\u00192\b\b\u0002\u0010r\u001a\u00020\u0019J\u0010\u0010r\u001a\u00020Q2\b\b\u0002\u0010r\u001a\u00020\u0019J\u0010\u0010t\u001a\u00020Q2\b\u0010u\u001a\u0004\u0018\u00010OJ\b\u0010v\u001a\u0004\u0018\u00010OR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0$X\u0082.¢\u0006\u0002\n\u0000R\u001d\u0010%\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001d\u0010+\u001a\u0004\u0018\u00010,8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b-\u0010.R\u001d\u00100\u001a\u0004\u0018\u0001018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b2\u00103R\u001d\u00105\u001a\u0004\u0018\u0001018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b6\u00103R\u001d\u00108\u001a\u0004\u0018\u0001018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b9\u00103R\u001d\u0010;\u001a\u0004\u0018\u0001018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010*\u001a\u0004\b<\u00103R\u001d\u0010>\u001a\u0004\u0018\u00010\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\b?\u0010@R\u001d\u0010B\u001a\u0004\u0018\u0001018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010*\u001a\u0004\bC\u00103R\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u000e\u0010K\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006x"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/ModelMobileWithIconInputLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "contactsIconVisible", "getContactsIconVisible", "()I", "setContactsIconVisible", "(I)V", "operatorIconVisible", "getOperatorIconVisible", "setOperatorIconVisible", "focusListener", "Landroid/view/View$OnFocusChangeListener;", "getFocusListener", "()Landroid/view/View$OnFocusChangeListener;", "setFocusListener", "(Landroid/view/View$OnFocusChangeListener;)V", "operatorIconClickable", "", "getOperatorIconClickable", "()Z", "setOperatorIconClickable", "(Z)V", "canSuspend", "getCanSuspend", "setCanSuspend", "selectImpl", "Lcom/transsnet/palmpay/custom_view/input/OperatorSelectImpl;", "mOperatorList", "", "phoneNumberEdit", "Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;", "getPhoneNumberEdit", "()Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;", "phoneNumberEdit$delegate", "Lkotlin/Lazy;", "errorTv", "Landroid/widget/TextView;", "getErrorTv", "()Landroid/widget/TextView;", "errorTv$delegate", "dividerIv", "Landroid/widget/ImageView;", "getDividerIv", "()Landroid/widget/ImageView;", "dividerIv$delegate", "clearIv", "getClearIv", "clearIv$delegate", "contactIv", "getContactIv", "contactIv$delegate", "arrowIv", "getArrowIv", "arrowIv$delegate", "selectOperatorLayout", "getSelectOperatorLayout", "()Landroid/widget/LinearLayout;", "selectOperatorLayout$delegate", "iv_select_operator_icon", "getIv_select_operator_icon", "iv_select_operator_icon$delegate", "onNumberInputListener", "Lcom/transsnet/palmpay/custom_view/input/OnNumberInputListener;", "getOnNumberInputListener", "()Lcom/transsnet/palmpay/custom_view/input/OnNumberInputListener;", "setOnNumberInputListener", "(Lcom/transsnet/palmpay/custom_view/input/OnNumberInputListener;)V", "isCurrentViewKeyboardShown", "getSelectOperator", "setInputHint", "hintStr", "", "initModelMobileInputLayout", "", "T", "activity", "Landroid/app/Activity;", "list", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/transsnet/palmpay/custom_view/input/OnOperatorItemClickListener;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "inputFilters", "", "Landroid/text/InputFilter;", "checkNumber", "Lkotlin/Function1;", "splitCounts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isDarkTheme", "(Landroid/app/Activity;Ljava/util/List;Lcom/transsnet/palmpay/custom_view/input/OnOperatorItemClickListener;Ljava/lang/String;[Landroid/text/InputFilter;Lkotlin/jvm/functions/Function1;Ljava/util/ArrayList;Z)V", "changeLineColor", "hasFocus", "setError", "error", "initModelInputRegexData", "Lcom/transsnet/palmpay/custom_view/input/InputMobileImpl;", "deleteAllRecordsListener", "Lkotlin/Function2;", "", "Lkotlin/Function0;", "deleteRecordListener", "updateSelectItem", "(Lcom/transsnet/palmpay/custom_view/input/OperatorSelectImpl;)V", "showContactIv", "show", "hideKeyboard", "showClearIv", "setPhoneNumber", "phoneNumber", "getPhoneNumber", "Companion", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelMobileWithIconInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelMobileWithIconInputLayout.kt\ncom/transsnet/palmpay/custom_view/input/ModelMobileWithIconInputLayout\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,722:1\n255#2:723\n*S KotlinDebug\n*F\n+ 1 ModelMobileWithIconInputLayout.kt\ncom/transsnet/palmpay/custom_view/input/ModelMobileWithIconInputLayout\n*L\n361#1:723\n*E\n"})
public final class ModelMobileWithIconInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int maxItemSize = 5;

    /* JADX INFO: renamed from: arrowIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy arrowIv;
    private boolean canSuspend;

    /* JADX INFO: renamed from: clearIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy clearIv;

    /* JADX INFO: renamed from: contactIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy contactIv;
    private int contactsIconVisible;

    /* JADX INFO: renamed from: dividerIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dividerIv;

    /* JADX INFO: renamed from: errorTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy errorTv;

    @Nullable
    private View.OnFocusChangeListener focusListener;
    private boolean isCurrentViewKeyboardShown;

    /* JADX INFO: renamed from: iv_select_operator_icon$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iv_select_operator_icon;
    private List<? extends OperatorSelectImpl> mOperatorList;

    @Nullable
    private OnNumberInputListener onNumberInputListener;
    private boolean operatorIconClickable;
    private int operatorIconVisible;

    /* JADX INFO: renamed from: phoneNumberEdit$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy phoneNumberEdit;

    @Nullable
    private OperatorSelectImpl selectImpl;

    /* JADX INFO: renamed from: selectOperatorLayout$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy selectOperatorLayout;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/ModelMobileWithIconInputLayout$Companion;", "", "<init>", "()V", "maxItemSize", "", "getMaxItemSize", "()I", "setMaxItemSize", "(I)V", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getMaxItemSize() {
            return ModelMobileWithIconInputLayout.maxItemSize;
        }

        public final void setMaxItemSize(int i7) {
            ModelMobileWithIconInputLayout.maxItemSize = i7;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelMobileWithIconInputLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView arrowIv_delegate$lambda$5(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout) {
        return (ImageView) modelMobileWithIconInputLayout.findViewById(s.iv_select_operator_arrow);
    }

    private final void changeLineColor(boolean hasFocus) {
        if (hasFocus) {
            ImageView dividerIv = getDividerIv();
            if (dividerIv != null) {
                dividerIv.setBackgroundColor(getContext().getColor(L6.b.ppColorTextPrimary));
                return;
            }
            return;
        }
        ImageView dividerIv2 = getDividerIv();
        if (dividerIv2 != null) {
            dividerIv2.setBackgroundColor(CommonViewExtKt.colorInt(L6.b.pp_transparent, getContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView clearIv_delegate$lambda$3(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout) {
        return (ImageView) modelMobileWithIconInputLayout.findViewById(s.iv_clear);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView contactIv_delegate$lambda$4(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout) {
        return (ImageView) modelMobileWithIconInputLayout.findViewById(s.iv_contacts);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView dividerIv_delegate$lambda$2(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout) {
        return (ImageView) modelMobileWithIconInputLayout.findViewById(s.iv_divider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView errorTv_delegate$lambda$1(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout) {
        return (TextView) modelMobileWithIconInputLayout.findViewById(s.tv_error);
    }

    public static /* synthetic */ void hideKeyboard$default(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = false;
        }
        modelMobileWithIconInputLayout.hideKeyboard(z3);
    }

    public static /* synthetic */ void initModelInputRegexData$default(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, List list, Function2 function2, Function2 function3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = null;
        }
        if ((i7 & 2) != 0) {
            function2 = null;
        }
        if ((i7 & 4) != 0) {
            function3 = null;
        }
        modelMobileWithIconInputLayout.initModelInputRegexData(list, function2, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initModelInputRegexData$lambda$22$lambda$21(Function2 function2, ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, List items, Function0 onSuccess) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        function2.invoke(items, new L(10, onSuccess, modelMobileWithIconInputLayout));
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initModelInputRegexData$lambda$22$lambda$21$lambda$20(Function0 function0, ModelMobileWithIconInputLayout modelMobileWithIconInputLayout) {
        function0.invoke();
        AppCompatAutoCompleteTextView phoneNumberEdit = modelMobileWithIconInputLayout.getPhoneNumberEdit();
        if (phoneNumberEdit != null) {
            phoneNumberEdit.dismissDropDown();
        }
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initModelInputRegexData$lambda$23(ModelMobileInputAdapter modelMobileInputAdapter, ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, AdapterView adapterView, View view, int i7, long j6) {
        InputMobileImpl inputMobileImpl = (InputMobileImpl) modelMobileInputAdapter.getMData().get(i7);
        AppCompatAutoCompleteTextView phoneNumberEdit = modelMobileWithIconInputLayout.getPhoneNumberEdit();
        if (phoneNumberEdit != null) {
            String phoneNumber = inputMobileImpl.getShortCustomerId();
            if (phoneNumber == null) {
                phoneNumber = "";
            }
            CommonViewExtKt.setTextAndSelection(phoneNumberEdit, phoneNumber);
        }
        modelMobileWithIconInputLayout.showContactIv(true, true);
        OnNumberInputListener onNumberInputListener = modelMobileWithIconInputLayout.onNumberInputListener;
        if (onNumberInputListener != null) {
            onNumberInputListener.onSelectNumber(inputMobileImpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initModelMobileInputLayout$default(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, Activity activity, List list, OnOperatorItemClickListener onOperatorItemClickListener, String str, InputFilter[] inputFilterArr, Function1 function1, ArrayList arrayList, boolean z3, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            list = null;
        }
        if ((i7 & 4) != 0) {
            onOperatorItemClickListener = null;
        }
        if ((i7 & 8) != 0) {
            str = null;
        }
        if ((i7 & 16) != 0) {
            inputFilterArr = new InputFilter[]{new MaxLengthFilter(PhoneBaseNumberUtils.INSTANCE.getMobileNumberValidLength(str) + 2)};
        }
        if ((i7 & 32) != 0) {
            function1 = new C0181x(str, 3);
        }
        if ((i7 & 64) != 0) {
            arrayList = C1850q.e(3, 4, 4);
        }
        if ((i7 & 128) != 0) {
            z3 = false;
        }
        modelMobileWithIconInputLayout.initModelMobileInputLayout(activity, list, onOperatorItemClickListener, str, inputFilterArr, function1, arrayList, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initModelMobileInputLayout$lambda$10(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, OperatorSelectNewPopWindow operatorSelectNewPopWindow, View view) {
        if (modelMobileWithIconInputLayout.operatorIconClickable) {
            modelMobileWithIconInputLayout.showContactIv(true, true);
            Intrinsics.e(view);
            operatorSelectNewPopWindow.showAsDropDown(view, 0, 0, 80);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initModelMobileInputLayout$lambda$13(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, Function1 function1, TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return false;
        }
        modelMobileWithIconInputLayout.showContactIv(true, true);
        if (function1 != null) {
            if (((Boolean) function1.invoke(modelMobileWithIconInputLayout.getPhoneNumber())).booleanValue()) {
                OnNumberInputListener onNumberInputListener = modelMobileWithIconInputLayout.onNumberInputListener;
                if (onNumberInputListener != null) {
                    onNumberInputListener.onNumberEditComplete(modelMobileWithIconInputLayout.getPhoneNumber());
                }
            } else {
                OnNumberInputListener onNumberInputListener2 = modelMobileWithIconInputLayout.onNumberInputListener;
                if (onNumberInputListener2 != null) {
                    onNumberInputListener2.onNumberEditing(modelMobileWithIconInputLayout.getPhoneNumber());
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initModelMobileInputLayout$lambda$14(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, int i7) {
        AppCompatAutoCompleteTextView phoneNumberEdit = modelMobileWithIconInputLayout.getPhoneNumberEdit();
        boolean z3 = false;
        if (phoneNumberEdit != null && phoneNumberEdit.isFocused()) {
            z3 = true;
        }
        modelMobileWithIconInputLayout.isCurrentViewKeyboardShown = z3;
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initModelMobileInputLayout$lambda$16(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, Function1 function1, int i7) {
        if (modelMobileWithIconInputLayout.isCurrentViewKeyboardShown) {
            modelMobileWithIconInputLayout.showContactIv(true, true);
            if (function1 != null) {
                if (((Boolean) function1.invoke(modelMobileWithIconInputLayout.getPhoneNumber())).booleanValue()) {
                    OnNumberInputListener onNumberInputListener = modelMobileWithIconInputLayout.onNumberInputListener;
                    if (onNumberInputListener != null) {
                        onNumberInputListener.onNumberEditComplete(modelMobileWithIconInputLayout.getPhoneNumber());
                    }
                } else {
                    OnNumberInputListener onNumberInputListener2 = modelMobileWithIconInputLayout.onNumberInputListener;
                    if (onNumberInputListener2 != null) {
                        onNumberInputListener2.onNumberEditing(modelMobileWithIconInputLayout.getPhoneNumber());
                    }
                }
            }
        }
        modelMobileWithIconInputLayout.isCurrentViewKeyboardShown = false;
        return Unit.f38893a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initModelMobileInputLayout$lambda$17(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, View view) {
        AppCompatAutoCompleteTextView phoneNumberEdit;
        AppCompatAutoCompleteTextView phoneNumberEdit2 = modelMobileWithIconInputLayout.getPhoneNumberEdit();
        if (phoneNumberEdit2 == null || !phoneNumberEdit2.isPopupShowing()) {
            AppCompatAutoCompleteTextView phoneNumberEdit3 = modelMobileWithIconInputLayout.getPhoneNumberEdit();
            if ((phoneNumberEdit3 != null ? phoneNumberEdit3.getAdapter() : null) == null || (phoneNumberEdit = modelMobileWithIconInputLayout.getPhoneNumberEdit()) == null) {
                return;
            }
            phoneNumberEdit.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    public static final void initModelMobileInputLayout$lambda$18(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, View view, boolean z3) {
        if (ActivityUtils.isValidGlideContext(modelMobileWithIconInputLayout.getContext())) {
            TextView errorTv = modelMobileWithIconInputLayout.getErrorTv();
            if (errorTv == null || errorTv.getVisibility() != 0) {
                modelMobileWithIconInputLayout.changeLineColor(z3);
            } else {
                TextView errorTv2 = modelMobileWithIconInputLayout.getErrorTv();
                if (TextUtils.isEmpty(errorTv2 != null ? errorTv2.getText() : null)) {
                    modelMobileWithIconInputLayout.changeLineColor(z3);
                }
            }
            showContactIv$default(modelMobileWithIconInputLayout, !z3, false, 2, null);
            View.OnFocusChangeListener onFocusChangeListener = modelMobileWithIconInputLayout.focusListener;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initModelMobileInputLayout$lambda$19(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, View view) {
        AppCompatAutoCompleteTextView phoneNumberEdit = modelMobileWithIconInputLayout.getPhoneNumberEdit();
        if (phoneNumberEdit != null) {
            phoneNumberEdit.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initModelMobileInputLayout$lambda$8(String str, String str2) {
        return PhoneBaseNumberUtils.INSTANCE.isValidMobileNumber(str2, str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initModelMobileInputLayout$lambda$9(List list, ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, OnOperatorItemClickListener onOperatorItemClickListener, OperatorSelectNewPopWindow operatorSelectNewPopWindow, j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        OperatorSelectImpl operatorSelectImpl = (OperatorSelectImpl) list.get(i7);
        modelMobileWithIconInputLayout.updateSelectItem(operatorSelectImpl);
        if (onOperatorItemClickListener != null) {
            onOperatorItemClickListener.onOperatorItemClick(operatorSelectImpl);
        }
        operatorSelectNewPopWindow.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView iv_select_operator_icon_delegate$lambda$7(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout) {
        return (ImageView) modelMobileWithIconInputLayout.findViewById(s.iv_select_operator_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatAutoCompleteTextView phoneNumberEdit_delegate$lambda$0(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout) {
        return (AppCompatAutoCompleteTextView) modelMobileWithIconInputLayout.findViewById(s.et_phone_number);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout selectOperatorLayout_delegate$lambda$6(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout) {
        return (LinearLayout) modelMobileWithIconInputLayout.findViewById(s.ll_operator);
    }

    public static /* synthetic */ void showClearIv$default(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, boolean z3, boolean z8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z8 = false;
        }
        modelMobileWithIconInputLayout.showClearIv(z3, z8);
    }

    public static /* synthetic */ void showContactIv$default(ModelMobileWithIconInputLayout modelMobileWithIconInputLayout, boolean z3, boolean z8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z8 = false;
        }
        modelMobileWithIconInputLayout.showContactIv(z3, z8);
    }

    @Nullable
    public final ImageView getArrowIv() {
        return (ImageView) this.arrowIv.getValue();
    }

    public final boolean getCanSuspend() {
        return this.canSuspend;
    }

    @Nullable
    public final ImageView getClearIv() {
        return (ImageView) this.clearIv.getValue();
    }

    @Nullable
    public final ImageView getContactIv() {
        return (ImageView) this.contactIv.getValue();
    }

    public final int getContactsIconVisible() {
        return this.contactsIconVisible;
    }

    @Nullable
    public final ImageView getDividerIv() {
        return (ImageView) this.dividerIv.getValue();
    }

    @Nullable
    public final TextView getErrorTv() {
        return (TextView) this.errorTv.getValue();
    }

    @Nullable
    public final View.OnFocusChangeListener getFocusListener() {
        return this.focusListener;
    }

    @Nullable
    public final ImageView getIv_select_operator_icon() {
        return (ImageView) this.iv_select_operator_icon.getValue();
    }

    @Nullable
    public final OnNumberInputListener getOnNumberInputListener() {
        return this.onNumberInputListener;
    }

    public final boolean getOperatorIconClickable() {
        return this.operatorIconClickable;
    }

    public final int getOperatorIconVisible() {
        return this.operatorIconVisible;
    }

    @Nullable
    public final String getPhoneNumber() {
        Editable text;
        String string;
        String strK;
        String strK2;
        String strK3;
        AppCompatAutoCompleteTextView phoneNumberEdit = getPhoneNumberEdit();
        if (phoneNumberEdit == null || (text = phoneNumberEdit.getText()) == null || (string = text.toString()) == null || (strK = y.k(string, "-", "")) == null || (strK2 = y.k(strK, " ", "")) == null || (strK3 = y.k(strK2, "\u202d", "")) == null) {
            return null;
        }
        return y.k(strK3, "\u202c", "");
    }

    @Nullable
    public final AppCompatAutoCompleteTextView getPhoneNumberEdit() {
        return (AppCompatAutoCompleteTextView) this.phoneNumberEdit.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: getSelectOperator, reason: from getter */
    public final OperatorSelectImpl getSelectImpl() {
        return this.selectImpl;
    }

    @Nullable
    public final LinearLayout getSelectOperatorLayout() {
        return (LinearLayout) this.selectOperatorLayout.getValue();
    }

    public final void hideKeyboard(boolean hideKeyboard) {
        if (hideKeyboard) {
            KeyboardUtils.hideSoftInput(getPhoneNumberEdit());
            AppCompatAutoCompleteTextView phoneNumberEdit = getPhoneNumberEdit();
            if (phoneNumberEdit != null) {
                phoneNumberEdit.clearFocus();
            }
        }
    }

    public final <T extends InputMobileImpl> void initModelInputRegexData(@Nullable List<T> list, @Nullable Function2<? super List<? extends T>, ? super Function0<Unit>, Unit> deleteAllRecordsListener, @Nullable Function2<? super T, ? super Function0<Unit>, Unit> deleteRecordListener) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (list == null) {
            list = new ArrayList<>();
        }
        ModelMobileInputAdapter modelMobileInputAdapter = new ModelMobileInputAdapter(context, list);
        modelMobileInputAdapter.setDeleteRecordListener(deleteRecordListener);
        modelMobileInputAdapter.setDeleteAllRecordsListener(deleteAllRecordsListener != null ? new B(1, this, deleteAllRecordsListener) : null);
        AppCompatAutoCompleteTextView phoneNumberEdit = getPhoneNumberEdit();
        if (phoneNumberEdit != null) {
            phoneNumberEdit.setAdapter(modelMobileInputAdapter);
        }
        AppCompatAutoCompleteTextView phoneNumberEdit2 = getPhoneNumberEdit();
        if (phoneNumberEdit2 != null) {
            phoneNumberEdit2.setThreshold(0);
        }
        AppCompatAutoCompleteTextView phoneNumberEdit3 = getPhoneNumberEdit();
        if (phoneNumberEdit3 != null) {
            phoneNumberEdit3.setOnItemClickListener(new c(modelMobileInputAdapter, this, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends OperatorSelectImpl> void initModelMobileInputLayout(@Nullable Activity activity, @Nullable List<T> list, @Nullable OnOperatorItemClickListener<T> listener, @Nullable String countryCode, @Nullable InputFilter[] inputFilters, @Nullable final Function1<? super String, Boolean> checkNumber, @Nullable final ArrayList<Integer> splitCounts, boolean isDarkTheme) {
        AppCompatAutoCompleteTextView phoneNumberEdit;
        if (this.operatorIconVisible == 0) {
            List<T> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            this.mOperatorList = list;
            OperatorAdapter operatorAdapter = new OperatorAdapter(list, isDarkTheme, this.canSuspend);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            OperatorSelectNewPopWindow operatorSelectNewPopWindow = new OperatorSelectNewPopWindow(context, operatorAdapter, false, 4, null);
            operatorAdapter.setOnItemClickListener(new Q0(list, this, listener, operatorSelectNewPopWindow, 4));
            LinearLayout selectOperatorLayout = getSelectOperatorLayout();
            if (selectOperatorLayout != null) {
                selectOperatorLayout.setOnClickListener(new p010a9.b(21, this, operatorSelectNewPopWindow));
            }
            LinearLayout selectOperatorLayout2 = getSelectOperatorLayout();
            if (selectOperatorLayout2 != null) {
                selectOperatorLayout2.setVisibility(0);
            }
        } else {
            LinearLayout selectOperatorLayout3 = getSelectOperatorLayout();
            if (selectOperatorLayout3 != null) {
                selectOperatorLayout3.setVisibility(8);
            }
        }
        AppCompatAutoCompleteTextView phoneNumberEdit2 = getPhoneNumberEdit();
        if (phoneNumberEdit2 != null) {
            phoneNumberEdit2.setValidator(new AutoCompleteTextView.Validator() { // from class: com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout.initModelMobileInputLayout.4
                @Override // android.widget.AutoCompleteTextView.Validator
                public CharSequence fixText(CharSequence invalidText) {
                    Intrinsics.checkNotNullParameter(invalidText, "invalidText");
                    return "";
                }

                @Override // android.widget.AutoCompleteTextView.Validator
                public boolean isValid(CharSequence text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    return true;
                }
            });
        }
        if (inputFilters != null && (phoneNumberEdit = getPhoneNumberEdit()) != null) {
            phoneNumberEdit.setFilters(inputFilters);
        }
        AppCompatAutoCompleteTextView phoneNumberEdit3 = getPhoneNumberEdit();
        if (phoneNumberEdit3 != null) {
            phoneNumberEdit3.addTextChangedListener(new TextWatcher() { // from class: com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout.initModelMobileInputLayout.6
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    String string;
                    if (ActivityUtils.isValidGlideContext(ModelMobileWithIconInputLayout.this.getContext())) {
                        ModelMobileWithIconInputLayout.this.setError("");
                        String strK = (editable == null || (string = editable.toString()) == null) ? null : y.k(string, " ", "");
                        AppCompatAutoCompleteTextView phoneNumberEdit4 = ModelMobileWithIconInputLayout.this.getPhoneNumberEdit();
                        if (phoneNumberEdit4 == null || !phoneNumberEdit4.isFocused() || strK == null) {
                            ModelMobileWithIconInputLayout.showContactIv$default(ModelMobileWithIconInputLayout.this, true, false, 2, null);
                        } else {
                            ModelMobileWithIconInputLayout.showContactIv$default(ModelMobileWithIconInputLayout.this, !(strK.length() > 0), false, 2, null);
                        }
                        Function1<String, Boolean> function1 = checkNumber;
                        if (function1 != null) {
                            ModelMobileWithIconInputLayout modelMobileWithIconInputLayout = ModelMobileWithIconInputLayout.this;
                            if (function1.invoke(strK).booleanValue()) {
                                OnNumberInputListener onNumberInputListener = modelMobileWithIconInputLayout.getOnNumberInputListener();
                                if (onNumberInputListener != null) {
                                    onNumberInputListener.onNumberEditComplete(strK);
                                    return;
                                }
                                return;
                            }
                            OnNumberInputListener onNumberInputListener2 = modelMobileWithIconInputLayout.getOnNumberInputListener();
                            if (onNumberInputListener2 != null) {
                                onNumberInputListener2.onNumberEditing(strK);
                            }
                        }
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence s3, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence s3, int start, int before, int count) {
                    AppCompatAutoCompleteTextView phoneNumberEdit4;
                    ArrayList<Integer> arrayList = splitCounts;
                    if (arrayList == null || (phoneNumberEdit4 = ModelMobileWithIconInputLayout.this.getPhoneNumberEdit()) == null) {
                        return;
                    }
                    CommonViewExtKt.dealInputAccountWithSpace$default(phoneNumberEdit4, s3, start, before, arrayList, false, 16, null);
                }
            });
        }
        AppCompatAutoCompleteTextView phoneNumberEdit4 = getPhoneNumberEdit();
        if (phoneNumberEdit4 != null) {
            phoneNumberEdit4.setOnEditorActionListener(new com.facebook.react.views.textinput.b(this, checkNumber, 1));
        }
        if (activity != null) {
            CommonExtKt.softKeyBoardChangeListener(activity, new m(this, 14), new C0058e(26, this, checkNumber));
        }
        AppCompatAutoCompleteTextView phoneNumberEdit5 = getPhoneNumberEdit();
        if (phoneNumberEdit5 != null) {
            final int i7 = 1;
            phoneNumberEdit5.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.custom_view.input.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ModelMobileWithIconInputLayout f31378b;

                {
                    this.f31378b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            ModelMobileWithIconInputLayout.initModelMobileInputLayout$lambda$19(this.f31378b, view);
                            break;
                        default:
                            ModelMobileWithIconInputLayout.initModelMobileInputLayout$lambda$17(this.f31378b, view);
                            break;
                    }
                }
            });
        }
        AppCompatAutoCompleteTextView phoneNumberEdit6 = getPhoneNumberEdit();
        if (phoneNumberEdit6 != null) {
            phoneNumberEdit6.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 14));
        }
        ImageView clearIv = getClearIv();
        if (clearIv != null) {
            final int i10 = 0;
            clearIv.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.custom_view.input.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ModelMobileWithIconInputLayout f31378b;

                {
                    this.f31378b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            ModelMobileWithIconInputLayout.initModelMobileInputLayout$lambda$19(this.f31378b, view);
                            break;
                        default:
                            ModelMobileWithIconInputLayout.initModelMobileInputLayout$lambda$17(this.f31378b, view);
                            break;
                    }
                }
            });
        }
    }

    public final void setCanSuspend(boolean z3) {
        this.canSuspend = z3;
    }

    public final void setContactsIconVisible(int i7) {
        this.contactsIconVisible = i7;
    }

    public final void setError(@Nullable String error) {
        boolean z3 = false;
        if (TextUtils.isEmpty(error)) {
            TextView errorTv = getErrorTv();
            if (errorTv != null) {
                errorTv.setVisibility(8);
            }
            AppCompatAutoCompleteTextView phoneNumberEdit = getPhoneNumberEdit();
            if (phoneNumberEdit != null && phoneNumberEdit.hasFocus()) {
                z3 = true;
            }
            changeLineColor(z3);
            return;
        }
        TextView errorTv2 = getErrorTv();
        if (errorTv2 != null) {
            errorTv2.setVisibility(0);
        }
        TextView errorTv3 = getErrorTv();
        if (errorTv3 != null) {
            errorTv3.setText(error);
        }
        ImageView dividerIv = getDividerIv();
        if (dividerIv != null) {
            dividerIv.setBackgroundColor(getContext().getColor(L6.b.ppColorError));
        }
    }

    public final void setFocusListener(@Nullable View.OnFocusChangeListener onFocusChangeListener) {
        this.focusListener = onFocusChangeListener;
    }

    @NotNull
    public final ModelMobileWithIconInputLayout setInputHint(@NotNull String hintStr) {
        Intrinsics.checkNotNullParameter(hintStr, "hintStr");
        SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append(hintStr).setFontFamily("sans-serif").setFontSize(CommonViewExtKt.getDp(16.0f)).create();
        AppCompatAutoCompleteTextView phoneNumberEdit = getPhoneNumberEdit();
        if (phoneNumberEdit != null) {
            phoneNumberEdit.setHint(spannableStringBuilderCreate);
        }
        return this;
    }

    public final void setOnNumberInputListener(@Nullable OnNumberInputListener onNumberInputListener) {
        this.onNumberInputListener = onNumberInputListener;
    }

    public final void setOperatorIconClickable(boolean z3) {
        this.operatorIconClickable = z3;
    }

    public final void setOperatorIconVisible(int i7) {
        this.operatorIconVisible = i7;
    }

    public final void setPhoneNumber(@Nullable String phoneNumber) {
        AppCompatAutoCompleteTextView phoneNumberEdit = getPhoneNumberEdit();
        if (phoneNumberEdit != null) {
            CommonViewExtKt.setTextAndSelection(phoneNumberEdit, PhoneBaseNumberUtils.INSTANCE.formatMobileNumber(phoneNumber, false));
        }
    }

    public final void showClearIv(boolean show, boolean hideKeyboard) {
        ImageView clearIv = getClearIv();
        if (clearIv != null) {
            clearIv.setVisibility(show ? 0 : 8);
        }
        hideKeyboard(hideKeyboard);
    }

    public final void showContactIv(boolean show, boolean hideKeyboard) {
        ImageView contactIv = getContactIv();
        if (contactIv != null) {
            contactIv.setVisibility((!show || this.contactsIconVisible == 2) ? 8 : 0);
        }
        showClearIv(!show, false);
        hideKeyboard(hideKeyboard);
    }

    public final <T extends OperatorSelectImpl> void updateSelectItem(@NotNull T selectImpl) {
        Intrinsics.checkNotNullParameter(selectImpl, "selectImpl");
        this.selectImpl = selectImpl;
        ImageView iv_select_operator_icon = getIv_select_operator_icon();
        if (iv_select_operator_icon != null) {
            ((com.bumptech.glide.m) com.bumptech.glide.b.e(iv_select_operator_icon.getContext()).load(selectImpl.getLogo()).x(r.cv_coupon_icon_gray)).S(iv_select_operator_icon);
            if (this.canSuspend && Intrinsics.c(selectImpl.isSuspend(), Boolean.TRUE)) {
                ImageView iv_select_operator_icon2 = getIv_select_operator_icon();
                if (iv_select_operator_icon2 != null) {
                    iv_select_operator_icon2.setAlpha(0.5f);
                    return;
                }
                return;
            }
            ImageView iv_select_operator_icon3 = getIv_select_operator_icon();
            if (iv_select_operator_icon3 != null) {
                iv_select_operator_icon3.setAlpha(1.0f);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelMobileWithIconInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelMobileWithIconInputLayout(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelMobileWithIconInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.operatorIconClickable = true;
        final int i10 = 0;
        this.phoneNumberEdit = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelMobileWithIconInputLayout f31380b;

            {
                this.f31380b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ModelMobileWithIconInputLayout.phoneNumberEdit_delegate$lambda$0(this.f31380b);
                    case 1:
                        return ModelMobileWithIconInputLayout.errorTv_delegate$lambda$1(this.f31380b);
                    case 2:
                        return ModelMobileWithIconInputLayout.dividerIv_delegate$lambda$2(this.f31380b);
                    case 3:
                        return ModelMobileWithIconInputLayout.clearIv_delegate$lambda$3(this.f31380b);
                    case 4:
                        return ModelMobileWithIconInputLayout.contactIv_delegate$lambda$4(this.f31380b);
                    case 5:
                        return ModelMobileWithIconInputLayout.arrowIv_delegate$lambda$5(this.f31380b);
                    case 6:
                        return ModelMobileWithIconInputLayout.selectOperatorLayout_delegate$lambda$6(this.f31380b);
                    default:
                        return ModelMobileWithIconInputLayout.iv_select_operator_icon_delegate$lambda$7(this.f31380b);
                }
            }
        });
        final int i11 = 1;
        this.errorTv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelMobileWithIconInputLayout f31380b;

            {
                this.f31380b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ModelMobileWithIconInputLayout.phoneNumberEdit_delegate$lambda$0(this.f31380b);
                    case 1:
                        return ModelMobileWithIconInputLayout.errorTv_delegate$lambda$1(this.f31380b);
                    case 2:
                        return ModelMobileWithIconInputLayout.dividerIv_delegate$lambda$2(this.f31380b);
                    case 3:
                        return ModelMobileWithIconInputLayout.clearIv_delegate$lambda$3(this.f31380b);
                    case 4:
                        return ModelMobileWithIconInputLayout.contactIv_delegate$lambda$4(this.f31380b);
                    case 5:
                        return ModelMobileWithIconInputLayout.arrowIv_delegate$lambda$5(this.f31380b);
                    case 6:
                        return ModelMobileWithIconInputLayout.selectOperatorLayout_delegate$lambda$6(this.f31380b);
                    default:
                        return ModelMobileWithIconInputLayout.iv_select_operator_icon_delegate$lambda$7(this.f31380b);
                }
            }
        });
        final int i12 = 2;
        this.dividerIv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelMobileWithIconInputLayout f31380b;

            {
                this.f31380b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ModelMobileWithIconInputLayout.phoneNumberEdit_delegate$lambda$0(this.f31380b);
                    case 1:
                        return ModelMobileWithIconInputLayout.errorTv_delegate$lambda$1(this.f31380b);
                    case 2:
                        return ModelMobileWithIconInputLayout.dividerIv_delegate$lambda$2(this.f31380b);
                    case 3:
                        return ModelMobileWithIconInputLayout.clearIv_delegate$lambda$3(this.f31380b);
                    case 4:
                        return ModelMobileWithIconInputLayout.contactIv_delegate$lambda$4(this.f31380b);
                    case 5:
                        return ModelMobileWithIconInputLayout.arrowIv_delegate$lambda$5(this.f31380b);
                    case 6:
                        return ModelMobileWithIconInputLayout.selectOperatorLayout_delegate$lambda$6(this.f31380b);
                    default:
                        return ModelMobileWithIconInputLayout.iv_select_operator_icon_delegate$lambda$7(this.f31380b);
                }
            }
        });
        final int i13 = 3;
        this.clearIv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelMobileWithIconInputLayout f31380b;

            {
                this.f31380b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ModelMobileWithIconInputLayout.phoneNumberEdit_delegate$lambda$0(this.f31380b);
                    case 1:
                        return ModelMobileWithIconInputLayout.errorTv_delegate$lambda$1(this.f31380b);
                    case 2:
                        return ModelMobileWithIconInputLayout.dividerIv_delegate$lambda$2(this.f31380b);
                    case 3:
                        return ModelMobileWithIconInputLayout.clearIv_delegate$lambda$3(this.f31380b);
                    case 4:
                        return ModelMobileWithIconInputLayout.contactIv_delegate$lambda$4(this.f31380b);
                    case 5:
                        return ModelMobileWithIconInputLayout.arrowIv_delegate$lambda$5(this.f31380b);
                    case 6:
                        return ModelMobileWithIconInputLayout.selectOperatorLayout_delegate$lambda$6(this.f31380b);
                    default:
                        return ModelMobileWithIconInputLayout.iv_select_operator_icon_delegate$lambda$7(this.f31380b);
                }
            }
        });
        final int i14 = 4;
        this.contactIv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelMobileWithIconInputLayout f31380b;

            {
                this.f31380b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ModelMobileWithIconInputLayout.phoneNumberEdit_delegate$lambda$0(this.f31380b);
                    case 1:
                        return ModelMobileWithIconInputLayout.errorTv_delegate$lambda$1(this.f31380b);
                    case 2:
                        return ModelMobileWithIconInputLayout.dividerIv_delegate$lambda$2(this.f31380b);
                    case 3:
                        return ModelMobileWithIconInputLayout.clearIv_delegate$lambda$3(this.f31380b);
                    case 4:
                        return ModelMobileWithIconInputLayout.contactIv_delegate$lambda$4(this.f31380b);
                    case 5:
                        return ModelMobileWithIconInputLayout.arrowIv_delegate$lambda$5(this.f31380b);
                    case 6:
                        return ModelMobileWithIconInputLayout.selectOperatorLayout_delegate$lambda$6(this.f31380b);
                    default:
                        return ModelMobileWithIconInputLayout.iv_select_operator_icon_delegate$lambda$7(this.f31380b);
                }
            }
        });
        final int i15 = 5;
        this.arrowIv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelMobileWithIconInputLayout f31380b;

            {
                this.f31380b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ModelMobileWithIconInputLayout.phoneNumberEdit_delegate$lambda$0(this.f31380b);
                    case 1:
                        return ModelMobileWithIconInputLayout.errorTv_delegate$lambda$1(this.f31380b);
                    case 2:
                        return ModelMobileWithIconInputLayout.dividerIv_delegate$lambda$2(this.f31380b);
                    case 3:
                        return ModelMobileWithIconInputLayout.clearIv_delegate$lambda$3(this.f31380b);
                    case 4:
                        return ModelMobileWithIconInputLayout.contactIv_delegate$lambda$4(this.f31380b);
                    case 5:
                        return ModelMobileWithIconInputLayout.arrowIv_delegate$lambda$5(this.f31380b);
                    case 6:
                        return ModelMobileWithIconInputLayout.selectOperatorLayout_delegate$lambda$6(this.f31380b);
                    default:
                        return ModelMobileWithIconInputLayout.iv_select_operator_icon_delegate$lambda$7(this.f31380b);
                }
            }
        });
        final int i16 = 6;
        this.selectOperatorLayout = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelMobileWithIconInputLayout f31380b;

            {
                this.f31380b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return ModelMobileWithIconInputLayout.phoneNumberEdit_delegate$lambda$0(this.f31380b);
                    case 1:
                        return ModelMobileWithIconInputLayout.errorTv_delegate$lambda$1(this.f31380b);
                    case 2:
                        return ModelMobileWithIconInputLayout.dividerIv_delegate$lambda$2(this.f31380b);
                    case 3:
                        return ModelMobileWithIconInputLayout.clearIv_delegate$lambda$3(this.f31380b);
                    case 4:
                        return ModelMobileWithIconInputLayout.contactIv_delegate$lambda$4(this.f31380b);
                    case 5:
                        return ModelMobileWithIconInputLayout.arrowIv_delegate$lambda$5(this.f31380b);
                    case 6:
                        return ModelMobileWithIconInputLayout.selectOperatorLayout_delegate$lambda$6(this.f31380b);
                    default:
                        return ModelMobileWithIconInputLayout.iv_select_operator_icon_delegate$lambda$7(this.f31380b);
                }
            }
        });
        final int i17 = 7;
        this.iv_select_operator_icon = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelMobileWithIconInputLayout f31380b;

            {
                this.f31380b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return ModelMobileWithIconInputLayout.phoneNumberEdit_delegate$lambda$0(this.f31380b);
                    case 1:
                        return ModelMobileWithIconInputLayout.errorTv_delegate$lambda$1(this.f31380b);
                    case 2:
                        return ModelMobileWithIconInputLayout.dividerIv_delegate$lambda$2(this.f31380b);
                    case 3:
                        return ModelMobileWithIconInputLayout.clearIv_delegate$lambda$3(this.f31380b);
                    case 4:
                        return ModelMobileWithIconInputLayout.contactIv_delegate$lambda$4(this.f31380b);
                    case 5:
                        return ModelMobileWithIconInputLayout.arrowIv_delegate$lambda$5(this.f31380b);
                    case 6:
                        return ModelMobileWithIconInputLayout.selectOperatorLayout_delegate$lambda$6(this.f31380b);
                    default:
                        return ModelMobileWithIconInputLayout.iv_select_operator_icon_delegate$lambda$7(this.f31380b);
                }
            }
        });
        View.inflate(context, t.cv_layout_mobile_input_with_operator, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.CVModelNumberInput);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(x.CVModelNumberInput_cv_hint);
        if (string == null) {
            string = context.getString(v.cv_msg_enter_mobile_number);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(x.CVModelNumberInput_cv_contacts_icon, 0);
        this.contactsIconVisible = typedArrayObtainStyledAttributes.getInt(x.CVModelNumberInput_cv_contacts_icon_visible, 0);
        this.operatorIconVisible = typedArrayObtainStyledAttributes.getInt(x.CVModelNumberInput_cv_operator_icon_visible, 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(x.CVModelNumberInput_cv_arrow_icon_visible, true);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(x.CVModelNumberInput_cv_list_item_full_screen, true);
        typedArrayObtainStyledAttributes.recycle();
        setInputHint(string);
        AppCompatAutoCompleteTextView phoneNumberEdit = getPhoneNumberEdit();
        if (phoneNumberEdit != null) {
            phoneNumberEdit.setDropDownBackgroundDrawable(new ColorDrawable(0));
        }
        if (z8) {
            AppCompatAutoCompleteTextView phoneNumberEdit2 = getPhoneNumberEdit();
            if (phoneNumberEdit2 != null) {
                phoneNumberEdit2.setDropDownWidth(-1);
            }
        } else {
            AppCompatAutoCompleteTextView phoneNumberEdit3 = getPhoneNumberEdit();
            if (phoneNumberEdit3 != null) {
                phoneNumberEdit3.setDropDownWidth(ScreenUtils.getScreenWidth() - CommonViewExtKt.getDp(32));
            }
            AppCompatAutoCompleteTextView phoneNumberEdit4 = getPhoneNumberEdit();
            if (phoneNumberEdit4 != null) {
                phoneNumberEdit4.setDropDownAnchor(s.rootView);
            }
        }
        AppCompatAutoCompleteTextView phoneNumberEdit5 = getPhoneNumberEdit();
        if (phoneNumberEdit5 != null) {
            phoneNumberEdit5.setDropDownVerticalOffset(-CommonViewExtKt.getDp(14));
        }
        if (resourceId != 0) {
            ImageView contactIv = getContactIv();
            if (contactIv != null) {
                contactIv.setImageResource(resourceId);
            }
        } else {
            ImageView contactIv2 = getContactIv();
            if (contactIv2 != null) {
                contactIv2.setImageDrawable(p059e1.a.h(context, S6.a.pay_Addressbook, null, context.getColor(L6.b.ppColorTextPrimary), 24.0f));
            }
        }
        if (this.contactsIconVisible == 0) {
            showContactIv$default(this, true, false, 2, null);
        } else {
            showContactIv$default(this, false, false, 2, null);
        }
        if (this.operatorIconVisible == 0) {
            LinearLayout selectOperatorLayout = getSelectOperatorLayout();
            if (selectOperatorLayout != null) {
                selectOperatorLayout.setVisibility(0);
            }
        } else {
            LinearLayout selectOperatorLayout2 = getSelectOperatorLayout();
            if (selectOperatorLayout2 != null) {
                selectOperatorLayout2.setVisibility(8);
            }
        }
        showClearIv$default(this, false, false, 2, null);
        ImageView arrowIv = getArrowIv();
        if (arrowIv != null) {
            arrowIv.setVisibility(z3 ? 0 : 8);
        }
        if (ScreenUtils.getScreenHeight() / 3 < CommonViewExtKt.getDp(56) * 5) {
            maxItemSize = (ScreenUtils.getScreenHeight() / 3) / CommonViewExtKt.getDp(56);
        }
    }
}
