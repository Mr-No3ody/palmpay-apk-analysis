package com.transsnet.palmpay.custom_view.input;

import Ed.ViewOnFocusChangeListenerC0235o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.credit.ui.dialog.ViewOnClickListenerC1533v;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.custom_view.x;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002lmB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020.2\b\b\u0002\u0010N\u001a\u00020.J\u0010\u0010N\u001a\u00020L2\b\b\u0002\u0010N\u001a\u00020.J\u000e\u0010O\u001a\u00020\u00002\u0006\u0010P\u001a\u00020JJ\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\u0007J\b\u0010S\u001a\u00020LH\u0002J\u0019\u0010T\u001a\u00020\u00002\f\u0010U\u001a\b\u0012\u0004\u0012\u00020W0V¢\u0006\u0002\u0010XJ\u0006\u0010Y\u001a\u00020LJ\"\u0010Z\u001a\u00020L\"\b\b\u0000\u0010[*\u00020\\2\u0010\b\u0002\u0010]\u001a\n\u0012\u0004\u0012\u0002H[\u0018\u00010^J\u0010\u0010_\u001a\u00020L2\b\u0010`\u001a\u0004\u0018\u00010aJ\u0010\u0010b\u001a\u00020L2\b\u0010`\u001a\u0004\u0018\u00010aJ\b\u0010c\u001a\u00020LH\u0002J\u0018\u0010d\u001a\u00020L2\u0006\u0010M\u001a\u00020.2\b\b\u0002\u0010N\u001a\u00020.J\u0010\u0010e\u001a\u00020L2\b\u0010f\u001a\u0004\u0018\u00010JJ\b\u0010g\u001a\u0004\u0018\u00010JJ\u000e\u0010h\u001a\u00020L2\u0006\u0010i\u001a\u00020\u0007J\u0010\u0010h\u001a\u00020L2\b\u0010j\u001a\u0004\u0018\u00010kR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001d\u0010\"\u001a\u0004\u0018\u00010\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b#\u0010 R\u001d\u0010%\u001a\u0004\u0018\u00010&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b'\u0010(R\u001a\u0010*\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u000e\u0010H\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006n"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/ModelNumberInputLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "maxLength", "getMaxLength", "()I", "setMaxLength", "(I)V", "titleTv", "Landroid/widget/TextView;", "getTitleTv", "()Landroid/widget/TextView;", "titleTv$delegate", "Lkotlin/Lazy;", "errorTv", "getErrorTv", "errorTv$delegate", "numberEdit", "Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;", "getNumberEdit", "()Landroidx/appcompat/widget/AppCompatAutoCompleteTextView;", "numberEdit$delegate", "clearIv", "Landroid/widget/ImageView;", "getClearIv", "()Landroid/widget/ImageView;", "clearIv$delegate", "dividerIv", "getDividerIv", "dividerIv$delegate", "contactIv", "Lcom/mikepenz/iconics/view/IconicsImageView;", "getContactIv", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "contactIv$delegate", "contactsIconVisible", "getContactsIconVisible", "setContactsIconVisible", "mShowErrorText", "", "getMShowErrorText", "()Z", "setMShowErrorText", "(Z)V", "mItemFullScreen", "getMItemFullScreen", "setMItemFullScreen", "errorListener", "Lcom/transsnet/palmpay/custom_view/input/ModelNumberInputLayout$OnErrorViewVisibleListener;", "getErrorListener", "()Lcom/transsnet/palmpay/custom_view/input/ModelNumberInputLayout$OnErrorViewVisibleListener;", "setErrorListener", "(Lcom/transsnet/palmpay/custom_view/input/ModelNumberInputLayout$OnErrorViewVisibleListener;)V", "onNumberInputListener", "Lcom/transsnet/palmpay/custom_view/input/ModelNumberInputLayout$OnNumberInputListener;", "getOnNumberInputListener", "()Lcom/transsnet/palmpay/custom_view/input/ModelNumberInputLayout$OnNumberInputListener;", "setOnNumberInputListener", "(Lcom/transsnet/palmpay/custom_view/input/ModelNumberInputLayout$OnNumberInputListener;)V", "focusListener", "Landroid/view/View$OnFocusChangeListener;", "getFocusListener", "()Landroid/view/View$OnFocusChangeListener;", "setFocusListener", "(Landroid/view/View$OnFocusChangeListener;)V", "hintTextSizePx", "hintContent", "", "showClearIv", "", "show", "hideKeyboard", "setHint", "hintStr", "setInputTextSize", "sizePx", "applyHintSpan", "setFilter", "inputFilters", "", "Landroid/text/InputFilter;", "([Landroid/text/InputFilter;)Lcom/transsnet/palmpay/custom_view/input/ModelNumberInputLayout;", "build", "initModelInputRegexData", "T", "Lcom/transsnet/palmpay/custom_view/input/InputSelectImpl;", "list", "", "setErrorMessage", ReactTextInputShadowNode.PROP_TEXT, "", "updateErrorView", "hideErrorView", "showContactIv", "setNumber", "phoneNumber", "getNumber", "setContactIcon", "drawableRes", "drawable", "Landroid/graphics/drawable/Drawable;", "OnNumberInputListener", "OnErrorViewVisibleListener", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelNumberInputLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelNumberInputLayout.kt\ncom/transsnet/palmpay/custom_view/input/ModelNumberInputLayout\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,467:1\n13472#2,2:468\n*S KotlinDebug\n*F\n+ 1 ModelNumberInputLayout.kt\ncom/transsnet/palmpay/custom_view/input/ModelNumberInputLayout\n*L\n182#1:468,2\n*E\n"})
public final class ModelNumberInputLayout extends LinearLayout {

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

    @Nullable
    private OnErrorViewVisibleListener errorListener;

    /* JADX INFO: renamed from: errorTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy errorTv;

    @Nullable
    private View.OnFocusChangeListener focusListener;

    @Nullable
    private String hintContent;
    private int hintTextSizePx;
    private boolean mItemFullScreen;
    private boolean mShowErrorText;
    private int maxLength;

    /* JADX INFO: renamed from: numberEdit$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy numberEdit;

    @Nullable
    private OnNumberInputListener onNumberInputListener;

    /* JADX INFO: renamed from: titleTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy titleTv;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/ModelNumberInputLayout$OnErrorViewVisibleListener;", "", "onErrorViewVisible", "", "visiable", "", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnErrorViewVisibleListener {
        void onErrorViewVisible(boolean visiable);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/ModelNumberInputLayout$OnNumberInputListener;", "", "onNumberEditing", "", "number", "", "onNumberEditComplete", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnNumberInputListener {
        void onNumberEditComplete(@Nullable String number);

        void onNumberEditing(@Nullable String number);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelNumberInputLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyHintSpan() {
        AppCompatAutoCompleteTextView numberEdit;
        String str = this.hintContent;
        if (str == null || (numberEdit = getNumberEdit()) == null) {
            return;
        }
        numberEdit.setHint(new SpanUtils().append(str).setFontFamily("sans-serif").setFontSize(this.hintTextSizePx).create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void build$lambda$7(ModelNumberInputLayout modelNumberInputLayout, View view, boolean z3) {
        showContactIv$default(modelNumberInputLayout, !z3, false, 2, null);
        View.OnFocusChangeListener onFocusChangeListener = modelNumberInputLayout.focusListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void build$lambda$8(ModelNumberInputLayout modelNumberInputLayout, View view) {
        AppCompatAutoCompleteTextView numberEdit = modelNumberInputLayout.getNumberEdit();
        if (numberEdit != null) {
            numberEdit.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView clearIv_delegate$lambda$3(ModelNumberInputLayout modelNumberInputLayout) {
        return (ImageView) modelNumberInputLayout.findViewById(s.iv_clear);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconicsImageView contactIv_delegate$lambda$5(ModelNumberInputLayout modelNumberInputLayout) {
        return (IconicsImageView) modelNumberInputLayout.findViewById(s.iv_contacts);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView dividerIv_delegate$lambda$4(ModelNumberInputLayout modelNumberInputLayout) {
        return (ImageView) modelNumberInputLayout.findViewById(s.iv_divider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView errorTv_delegate$lambda$1(ModelNumberInputLayout modelNumberInputLayout) {
        return (TextView) modelNumberInputLayout.findViewById(s.tv_error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideErrorView() {
        TextView errorTv = getErrorTv();
        if (errorTv != null) {
            errorTv.setVisibility(8);
        }
        ImageView dividerIv = getDividerIv();
        if (dividerIv != null) {
            dividerIv.setBackgroundColor(getContext().getColor(L6.b.ppColorDividerLine));
        }
        OnErrorViewVisibleListener onErrorViewVisibleListener = this.errorListener;
        if (onErrorViewVisibleListener != null) {
            onErrorViewVisibleListener.onErrorViewVisible(false);
        }
    }

    public static /* synthetic */ void hideKeyboard$default(ModelNumberInputLayout modelNumberInputLayout, boolean z3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = false;
        }
        modelNumberInputLayout.hideKeyboard(z3);
    }

    public static /* synthetic */ void initModelInputRegexData$default(ModelNumberInputLayout modelNumberInputLayout, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = null;
        }
        modelNumberInputLayout.initModelInputRegexData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initModelInputRegexData$lambda$9(ModelNumberInputAdapter modelNumberInputAdapter, ModelNumberInputLayout modelNumberInputLayout, AdapterView adapterView, View view, int i7, long j6) {
        InputSelectImpl inputSelectImpl = (InputSelectImpl) modelNumberInputAdapter.getMData().get(i7);
        AppCompatAutoCompleteTextView numberEdit = modelNumberInputLayout.getNumberEdit();
        if (numberEdit != null) {
            String itemName = inputSelectImpl.getItemName();
            if (itemName == null) {
                itemName = "";
            }
            CommonViewExtKt.setTextAndSelection(numberEdit, itemName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatAutoCompleteTextView numberEdit_delegate$lambda$2(ModelNumberInputLayout modelNumberInputLayout) {
        return (AppCompatAutoCompleteTextView) modelNumberInputLayout.findViewById(s.et_phone_number);
    }

    public static /* synthetic */ void showClearIv$default(ModelNumberInputLayout modelNumberInputLayout, boolean z3, boolean z8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z8 = false;
        }
        modelNumberInputLayout.showClearIv(z3, z8);
    }

    public static /* synthetic */ void showContactIv$default(ModelNumberInputLayout modelNumberInputLayout, boolean z3, boolean z8, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z8 = false;
        }
        modelNumberInputLayout.showContactIv(z3, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView titleTv_delegate$lambda$0(ModelNumberInputLayout modelNumberInputLayout) {
        return (TextView) modelNumberInputLayout.findViewById(s.tv_title);
    }

    public final void build() {
        AppCompatAutoCompleteTextView numberEdit = getNumberEdit();
        if (numberEdit != null) {
            numberEdit.setValidator(new AutoCompleteTextView.Validator() { // from class: com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.build.1
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
        AppCompatAutoCompleteTextView numberEdit2 = getNumberEdit();
        if (numberEdit2 != null) {
            numberEdit2.addTextChangedListener(new TextWatcher() { // from class: com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.build.2
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    String string;
                    ModelNumberInputLayout.this.hideErrorView();
                    String strK = (editable == null || (string = editable.toString()) == null) ? null : y.k(string, " ", "");
                    AppCompatAutoCompleteTextView numberEdit3 = ModelNumberInputLayout.this.getNumberEdit();
                    if (numberEdit3 == null || !numberEdit3.isFocused() || strK == null) {
                        ModelNumberInputLayout.showContactIv$default(ModelNumberInputLayout.this, true, false, 2, null);
                    } else {
                        ModelNumberInputLayout.showContactIv$default(ModelNumberInputLayout.this, !(strK.length() > 0), false, 2, null);
                    }
                    AppCompatAutoCompleteTextView numberEdit4 = ModelNumberInputLayout.this.getNumberEdit();
                    if ((numberEdit4 != null ? numberEdit4.length() : 0) >= ModelNumberInputLayout.this.getMaxLength()) {
                        OnNumberInputListener onNumberInputListener = ModelNumberInputLayout.this.getOnNumberInputListener();
                        if (onNumberInputListener != null) {
                            onNumberInputListener.onNumberEditComplete(strK);
                            return;
                        }
                        return;
                    }
                    OnNumberInputListener onNumberInputListener2 = ModelNumberInputLayout.this.getOnNumberInputListener();
                    if (onNumberInputListener2 != null) {
                        onNumberInputListener2.onNumberEditing(strK);
                    }
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence s3, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence s3, int start, int before, int count) {
                }
            });
        }
        AppCompatAutoCompleteTextView numberEdit3 = getNumberEdit();
        if (numberEdit3 != null) {
            numberEdit3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 15));
        }
        ImageView clearIv = getClearIv();
        if (clearIv != null) {
            clearIv.setOnClickListener(new ViewOnClickListenerC1533v(this, 25));
        }
    }

    @Nullable
    public final ImageView getClearIv() {
        return (ImageView) this.clearIv.getValue();
    }

    @Nullable
    public final IconicsImageView getContactIv() {
        return (IconicsImageView) this.contactIv.getValue();
    }

    public final int getContactsIconVisible() {
        return this.contactsIconVisible;
    }

    @Nullable
    public final ImageView getDividerIv() {
        return (ImageView) this.dividerIv.getValue();
    }

    @Nullable
    public final OnErrorViewVisibleListener getErrorListener() {
        return this.errorListener;
    }

    @Nullable
    public final TextView getErrorTv() {
        return (TextView) this.errorTv.getValue();
    }

    @Nullable
    public final View.OnFocusChangeListener getFocusListener() {
        return this.focusListener;
    }

    public final boolean getMItemFullScreen() {
        return this.mItemFullScreen;
    }

    public final boolean getMShowErrorText() {
        return this.mShowErrorText;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    @Nullable
    public final String getNumber() {
        Editable text;
        String string;
        String strK;
        String strK2;
        AppCompatAutoCompleteTextView numberEdit = getNumberEdit();
        if (numberEdit == null || (text = numberEdit.getText()) == null || (string = text.toString()) == null || (strK = y.k(string, " ", "")) == null || (strK2 = y.k(strK, "\u202d", "")) == null) {
            return null;
        }
        return y.k(strK2, "\u202c", "");
    }

    @Nullable
    public final AppCompatAutoCompleteTextView getNumberEdit() {
        return (AppCompatAutoCompleteTextView) this.numberEdit.getValue();
    }

    @Nullable
    public final OnNumberInputListener getOnNumberInputListener() {
        return this.onNumberInputListener;
    }

    @Nullable
    public final TextView getTitleTv() {
        return (TextView) this.titleTv.getValue();
    }

    public final void hideKeyboard(boolean hideKeyboard) {
        if (hideKeyboard) {
            KeyboardUtils.hideSoftInput(getNumberEdit());
            AppCompatAutoCompleteTextView numberEdit = getNumberEdit();
            if (numberEdit != null) {
                numberEdit.clearFocus();
            }
        }
    }

    public final <T extends InputSelectImpl> void initModelInputRegexData(@Nullable List<T> list) {
        List<T> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ModelNumberInputAdapter modelNumberInputAdapter = new ModelNumberInputAdapter(context, list);
        AppCompatAutoCompleteTextView numberEdit = getNumberEdit();
        if (numberEdit != null) {
            numberEdit.setAdapter(modelNumberInputAdapter);
        }
        AppCompatAutoCompleteTextView numberEdit2 = getNumberEdit();
        if (numberEdit2 != null) {
            numberEdit2.setThreshold(1);
        }
        AppCompatAutoCompleteTextView numberEdit3 = getNumberEdit();
        if (numberEdit3 != null) {
            numberEdit3.setOnItemClickListener(new c(modelNumberInputAdapter, this, 1));
        }
    }

    public final void setContactIcon(int drawableRes) {
        IconicsImageView contactIv = getContactIv();
        if (contactIv != null) {
            contactIv.setImageResource(drawableRes);
        }
    }

    public final void setContactsIconVisible(int i7) {
        this.contactsIconVisible = i7;
    }

    public final void setErrorListener(@Nullable OnErrorViewVisibleListener onErrorViewVisibleListener) {
        this.errorListener = onErrorViewVisibleListener;
    }

    public final void setErrorMessage(@Nullable CharSequence text) {
        updateErrorView(text);
    }

    @NotNull
    public final ModelNumberInputLayout setFilter(@NotNull InputFilter[] inputFilters) {
        Intrinsics.checkNotNullParameter(inputFilters, "inputFilters");
        AppCompatAutoCompleteTextView numberEdit = getNumberEdit();
        if (numberEdit != null) {
            numberEdit.setFilters(inputFilters);
        }
        for (InputFilter inputFilter : inputFilters) {
            if (inputFilter instanceof MaxLengthFilter) {
                this.maxLength = ((MaxLengthFilter) inputFilter).getMaxLength();
            }
        }
        return this;
    }

    public final void setFocusListener(@Nullable View.OnFocusChangeListener onFocusChangeListener) {
        this.focusListener = onFocusChangeListener;
    }

    @NotNull
    public final ModelNumberInputLayout setHint(@NotNull String hintStr) {
        Intrinsics.checkNotNullParameter(hintStr, "hintStr");
        this.hintContent = hintStr;
        applyHintSpan();
        return this;
    }

    @NotNull
    public final ModelNumberInputLayout setInputTextSize(int sizePx) {
        if (sizePx <= 0) {
            return this;
        }
        this.hintTextSizePx = sizePx;
        AppCompatAutoCompleteTextView numberEdit = getNumberEdit();
        if (numberEdit != null) {
            numberEdit.setTextSize(0, sizePx);
        }
        applyHintSpan();
        return this;
    }

    public final void setMItemFullScreen(boolean z3) {
        this.mItemFullScreen = z3;
    }

    public final void setMShowErrorText(boolean z3) {
        this.mShowErrorText = z3;
    }

    public final void setMaxLength(int i7) {
        this.maxLength = i7;
    }

    public final void setNumber(@Nullable String phoneNumber) {
        AppCompatAutoCompleteTextView numberEdit = getNumberEdit();
        if (numberEdit != null) {
            CommonViewExtKt.setTextAndSelection(numberEdit, phoneNumber);
        }
    }

    public final void setOnNumberInputListener(@Nullable OnNumberInputListener onNumberInputListener) {
        this.onNumberInputListener = onNumberInputListener;
    }

    public final void showClearIv(boolean show, boolean hideKeyboard) {
        ImageView clearIv = getClearIv();
        if (clearIv != null) {
            clearIv.setVisibility(show ? 0 : 8);
        }
        hideKeyboard(hideKeyboard);
    }

    public final void showContactIv(boolean show, boolean hideKeyboard) {
        IconicsImageView contactIv = getContactIv();
        if (contactIv != null) {
            contactIv.setVisibility((!show || this.contactsIconVisible == 2) ? 8 : 0);
        }
        showClearIv(!show, false);
        hideKeyboard(hideKeyboard);
        int iColorInt = show ? CommonViewExtKt.colorInt(L6.b.ppColorDividerLine, getContext()) : CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext());
        ImageView dividerIv = getDividerIv();
        if (dividerIv != null) {
            dividerIv.setBackgroundColor(iColorInt);
        }
    }

    public final void updateErrorView(@Nullable CharSequence text) {
        if (this.mShowErrorText) {
            if (TextUtils.isEmpty(text)) {
                hideErrorView();
                return;
            }
            TextView errorTv = getErrorTv();
            if (errorTv != null) {
                errorTv.setVisibility(0);
            }
            TextView errorTv2 = getErrorTv();
            if (errorTv2 != null) {
                errorTv2.setText(text);
            }
            ImageView dividerIv = getDividerIv();
            if (dividerIv != null) {
                dividerIv.setBackgroundColor(getContext().getColor(L6.b.ppColorError));
            }
            OnErrorViewVisibleListener onErrorViewVisibleListener = this.errorListener;
            if (onErrorViewVisibleListener != null) {
                onErrorViewVisibleListener.onErrorViewVisible(true);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelNumberInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setContactIcon(@Nullable Drawable drawable) {
        IconicsImageView contactIv = getContactIv();
        if (contactIv != null) {
            contactIv.setImageDrawable(drawable);
        }
    }

    public /* synthetic */ ModelNumberInputLayout(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelNumberInputLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        AppCompatAutoCompleteTextView numberEdit;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxLength = 30;
        final int i10 = 0;
        this.titleTv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNumberInputLayout f31385b;

            {
                this.f31385b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ModelNumberInputLayout.titleTv_delegate$lambda$0(this.f31385b);
                    case 1:
                        return ModelNumberInputLayout.errorTv_delegate$lambda$1(this.f31385b);
                    case 2:
                        return ModelNumberInputLayout.numberEdit_delegate$lambda$2(this.f31385b);
                    case 3:
                        return ModelNumberInputLayout.clearIv_delegate$lambda$3(this.f31385b);
                    case 4:
                        return ModelNumberInputLayout.dividerIv_delegate$lambda$4(this.f31385b);
                    default:
                        return ModelNumberInputLayout.contactIv_delegate$lambda$5(this.f31385b);
                }
            }
        });
        final int i11 = 1;
        this.errorTv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNumberInputLayout f31385b;

            {
                this.f31385b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ModelNumberInputLayout.titleTv_delegate$lambda$0(this.f31385b);
                    case 1:
                        return ModelNumberInputLayout.errorTv_delegate$lambda$1(this.f31385b);
                    case 2:
                        return ModelNumberInputLayout.numberEdit_delegate$lambda$2(this.f31385b);
                    case 3:
                        return ModelNumberInputLayout.clearIv_delegate$lambda$3(this.f31385b);
                    case 4:
                        return ModelNumberInputLayout.dividerIv_delegate$lambda$4(this.f31385b);
                    default:
                        return ModelNumberInputLayout.contactIv_delegate$lambda$5(this.f31385b);
                }
            }
        });
        final int i12 = 2;
        this.numberEdit = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNumberInputLayout f31385b;

            {
                this.f31385b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ModelNumberInputLayout.titleTv_delegate$lambda$0(this.f31385b);
                    case 1:
                        return ModelNumberInputLayout.errorTv_delegate$lambda$1(this.f31385b);
                    case 2:
                        return ModelNumberInputLayout.numberEdit_delegate$lambda$2(this.f31385b);
                    case 3:
                        return ModelNumberInputLayout.clearIv_delegate$lambda$3(this.f31385b);
                    case 4:
                        return ModelNumberInputLayout.dividerIv_delegate$lambda$4(this.f31385b);
                    default:
                        return ModelNumberInputLayout.contactIv_delegate$lambda$5(this.f31385b);
                }
            }
        });
        final int i13 = 3;
        this.clearIv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNumberInputLayout f31385b;

            {
                this.f31385b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ModelNumberInputLayout.titleTv_delegate$lambda$0(this.f31385b);
                    case 1:
                        return ModelNumberInputLayout.errorTv_delegate$lambda$1(this.f31385b);
                    case 2:
                        return ModelNumberInputLayout.numberEdit_delegate$lambda$2(this.f31385b);
                    case 3:
                        return ModelNumberInputLayout.clearIv_delegate$lambda$3(this.f31385b);
                    case 4:
                        return ModelNumberInputLayout.dividerIv_delegate$lambda$4(this.f31385b);
                    default:
                        return ModelNumberInputLayout.contactIv_delegate$lambda$5(this.f31385b);
                }
            }
        });
        final int i14 = 4;
        this.dividerIv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNumberInputLayout f31385b;

            {
                this.f31385b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ModelNumberInputLayout.titleTv_delegate$lambda$0(this.f31385b);
                    case 1:
                        return ModelNumberInputLayout.errorTv_delegate$lambda$1(this.f31385b);
                    case 2:
                        return ModelNumberInputLayout.numberEdit_delegate$lambda$2(this.f31385b);
                    case 3:
                        return ModelNumberInputLayout.clearIv_delegate$lambda$3(this.f31385b);
                    case 4:
                        return ModelNumberInputLayout.dividerIv_delegate$lambda$4(this.f31385b);
                    default:
                        return ModelNumberInputLayout.contactIv_delegate$lambda$5(this.f31385b);
                }
            }
        });
        final int i15 = 5;
        this.contactIv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.input.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelNumberInputLayout f31385b;

            {
                this.f31385b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ModelNumberInputLayout.titleTv_delegate$lambda$0(this.f31385b);
                    case 1:
                        return ModelNumberInputLayout.errorTv_delegate$lambda$1(this.f31385b);
                    case 2:
                        return ModelNumberInputLayout.numberEdit_delegate$lambda$2(this.f31385b);
                    case 3:
                        return ModelNumberInputLayout.clearIv_delegate$lambda$3(this.f31385b);
                    case 4:
                        return ModelNumberInputLayout.dividerIv_delegate$lambda$4(this.f31385b);
                    default:
                        return ModelNumberInputLayout.contactIv_delegate$lambda$5(this.f31385b);
                }
            }
        });
        this.hintTextSizePx = SizeUtils.dp2px(16.0f);
        View.inflate(context, t.cv_layout_mobile_input_v2, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.CVModelNumberInput);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(x.CVModelNumberInput_cv_title);
        String string2 = typedArrayObtainStyledAttributes.getString(x.CVModelNumberInput_cv_hint);
        if (string2 == null) {
            string2 = context.getString(v.cv_msg_enter_mobile_number);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        this.contactsIconVisible = typedArrayObtainStyledAttributes.getInt(x.CVModelNumberInput_cv_contacts_icon_visible, 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(x.CVModelNumberInput_cv_title_visible, false);
        this.mShowErrorText = typedArrayObtainStyledAttributes.getBoolean(x.CVModelNumberInput_cv_show_error_text, false);
        this.mItemFullScreen = typedArrayObtainStyledAttributes.getBoolean(x.CVModelNumberInput_cv_list_item_full_screen, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.hasValue(x.CVModelNumberInput_cv_input_text_size) ? typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CVModelNumberInput_cv_input_text_size, 0) : 0;
        typedArrayObtainStyledAttributes.recycle();
        TextView titleTv = getTitleTv();
        if (titleTv != null) {
            titleTv.setText(string);
        }
        TextView titleTv2 = getTitleTv();
        if (titleTv2 != null) {
            titleTv2.setVisibility(z3 ? 0 : 8);
        }
        AppCompatAutoCompleteTextView numberEdit2 = getNumberEdit();
        if (numberEdit2 != null) {
            numberEdit2.setDropDownBackgroundResource(r.cv_shape_rect_corner_12_bg_white);
        }
        if (this.mItemFullScreen && (numberEdit = getNumberEdit()) != null) {
            numberEdit.setDropDownWidth(-1);
        }
        if (dimensionPixelSize > 0) {
            setInputTextSize(dimensionPixelSize);
        }
        setHint(string2);
        if (this.contactsIconVisible == 0) {
            showContactIv$default(this, true, false, 2, null);
        } else {
            showContactIv$default(this, false, false, 2, null);
        }
        showClearIv$default(this, false, false, 2, null);
        OnErrorViewVisibleListener onErrorViewVisibleListener = this.errorListener;
        if (onErrorViewVisibleListener != null) {
            onErrorViewVisibleListener.onErrorViewVisible(false);
        }
    }
}
