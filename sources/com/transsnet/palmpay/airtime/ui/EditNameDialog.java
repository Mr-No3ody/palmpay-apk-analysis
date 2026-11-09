package com.transsnet.palmpay.airtime.ui;

import Oc.A;
import Pa.r0;
import Pd.c;
import Pd.d;
import Pd.f;
import Rd.M;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.facebook.react.uimanager.ViewProps;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0017\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001a\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R*\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/EditNameDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/text/TextWatcher;", "Landroid/content/Context;", "context", "", "phone", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "initViews", "()V", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "", "s", "", ViewProps.START, CodePushConstants.LATEST_ROLLBACK_COUNT_KEY, "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Ljava/lang/String;", "getPhone", "()Ljava/lang/String;", "LRd/M;", "binding", "LRd/M;", "Lcom/transsnet/palmpay/core/callback/ResultCallback;", "resultCallback", "Lcom/transsnet/palmpay/core/callback/ResultCallback;", "getResultCallback", "()Lcom/transsnet/palmpay/core/callback/ResultCallback;", "setResultCallback", "(Lcom/transsnet/palmpay/core/callback/ResultCallback;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EditNameDialog extends b implements View.OnClickListener, TextWatcher {

    @Nullable
    private M binding;

    @NotNull
    private final String phone;

    @Nullable
    private ResultCallback<String> resultCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditNameDialog(@Nullable Context context, @NotNull String phone) {
        super(context);
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.phone = phone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initViews$lambda$1(EditNameDialog editNameDialog, TextView textView, int i7, KeyEvent keyEvent) {
        AppCompatEditText appCompatEditText;
        if (i7 != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        KeyboardUtils.hideSoftInput(textView);
        ResultCallback<String> resultCallback = editNameDialog.resultCallback;
        if (resultCallback != null) {
            M m7 = editNameDialog.binding;
            resultCallback.onComplete(String.valueOf((m7 == null || (appCompatEditText = m7.f8104b) == null) ? null : appCompatEditText.getText()));
        }
        editNameDialog.dismiss();
        return true;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable s3) {
        TextView textView;
        TextView textView2;
        if (TextUtils.isEmpty(s3)) {
            M m7 = this.binding;
            if (m7 == null || (textView2 = m7.f8106d) == null) {
                return;
            }
            textView2.setText(getContext().getString(f.qt_max_letters_format, 0, 20));
            return;
        }
        M m10 = this.binding;
        if (m10 == null || (textView = m10.f8106d) == null) {
            return;
        }
        textView.setText(getContext().getString(f.qt_max_letters_format, Integer.valueOf(String.valueOf(s3).length()), 20));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence s3, int start, int count, int after) {
    }

    @NotNull
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final ResultCallback<String> getResultCallback() {
        return this.resultCallback;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(d.qt_airtime_edit_name_layout_dialog);
        View viewFindViewById = findViewById(c.viewRoot);
        int i7 = c.editNameEt;
        AppCompatEditText appCompatEditText = (AppCompatEditText) a.m(i7, viewFindViewById);
        if (appCompatEditText != null) {
            i7 = c.ivClose;
            ImageView imageView = (ImageView) a.m(i7, viewFindViewById);
            if (imageView != null) {
                i7 = c.maxLengthTv;
                TextView textView = (TextView) a.m(i7, viewFindViewById);
                if (textView != null) {
                    i7 = c.tag1;
                    TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                    if (textView2 != null) {
                        i7 = c.tag2;
                        TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                        if (textView3 != null) {
                            i7 = c.tag3;
                            TextView textView4 = (TextView) a.m(i7, viewFindViewById);
                            if (textView4 != null) {
                                i7 = c.tag4;
                                TextView textView5 = (TextView) a.m(i7, viewFindViewById);
                                if (textView5 != null) {
                                    i7 = c.tag5;
                                    TextView textView6 = (TextView) a.m(i7, viewFindViewById);
                                    if (textView6 != null) {
                                        i7 = c.tvPhone;
                                        TextView textView7 = (TextView) a.m(i7, viewFindViewById);
                                        if (textView7 != null) {
                                            i7 = c.tvTitle;
                                            TextView textView8 = (TextView) a.m(i7, viewFindViewById);
                                            if (textView8 != null) {
                                                FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                                                this.binding = new M(frameLayout, appCompatEditText, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, frameLayout);
                                                Window window = getWindow();
                                                if (window != null) {
                                                    window.setGravity(80);
                                                    window.setWindowAnimations(l.dialog_bottom_in_out);
                                                    WindowManager.LayoutParams attributes = window.getAttributes();
                                                    attributes.width = ScreenUtils.getScreenWidth();
                                                    attributes.height = -2;
                                                    window.setAttributes(attributes);
                                                }
                                                M m7 = this.binding;
                                                if (m7 != null) {
                                                    m7.f8105c.setOnClickListener(this);
                                                }
                                                M m10 = this.binding;
                                                if (m10 != null) {
                                                    m10.f8107e.setOnClickListener(this);
                                                }
                                                M m11 = this.binding;
                                                if (m11 != null) {
                                                    m11.f8108f.setOnClickListener(this);
                                                }
                                                M m12 = this.binding;
                                                if (m12 != null) {
                                                    m12.f8109g.setOnClickListener(this);
                                                }
                                                M m13 = this.binding;
                                                if (m13 != null) {
                                                    m13.f8110i.setOnClickListener(this);
                                                }
                                                M m14 = this.binding;
                                                if (m14 != null) {
                                                    m14.f8111j.setOnClickListener(this);
                                                }
                                                M m15 = this.binding;
                                                if (m15 != null) {
                                                    m15.f8104b.addTextChangedListener(this);
                                                }
                                                M m16 = this.binding;
                                                if (m16 != null) {
                                                    m16.f8104b.setOnEditorActionListener(new A(this, 3));
                                                }
                                                M m17 = this.binding;
                                                if (m17 != null) {
                                                    m17.f8112o.setText(r0.D0(this.phone));
                                                }
                                                M m18 = this.binding;
                                                if (m18 != null) {
                                                    m18.f8106d.setText(getContext().getString(f.qt_max_letters_format, 0, 20));
                                                }
                                                M m19 = this.binding;
                                                if (m19 != null) {
                                                    m19.f8104b.setFocusable(true);
                                                }
                                                M m20 = this.binding;
                                                if (m20 != null) {
                                                    m20.f8104b.setFocusableInTouchMode(true);
                                                }
                                                M m21 = this.binding;
                                                if (m21 != null) {
                                                    m21.f8104b.requestFocus();
                                                }
                                                Window window2 = getWindow();
                                                if (window2 != null) {
                                                    window2.setSoftInputMode(5);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        AppCompatEditText appCompatEditText;
        AppCompatEditText appCompatEditText2;
        if (v3 != null) {
            if (v3.getId() == c.ivClose) {
                dismiss();
                return;
            }
            M m7 = this.binding;
            if (m7 != null && (appCompatEditText2 = m7.f8104b) != null) {
                appCompatEditText2.setText(((TextView) v3).getText());
            }
            M m10 = this.binding;
            if (m10 == null || (appCompatEditText = m10.f8104b) == null) {
                return;
            }
            appCompatEditText.setSelection(((TextView) v3).getText().length());
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence s3, int start, int before, int count) {
    }

    public final void setResultCallback(@Nullable ResultCallback<String> resultCallback) {
        this.resultCallback = resultCallback;
    }
}
