package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.view.C1052d;
import androidx.core.view.C1054f;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements TintableBackgroundView, OnReceiveContentViewBehavior, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    @NonNull
    private final C0895z mAppCompatEmojiEditTextHelper;
    private final C0885u mBackgroundTintHelper;
    private final androidx.core.widget.j mDefaultOnReceiveContentListener;

    @Nullable
    private C0893y mSuperCaller;
    private final P mTextClassifierHelper;
    private final V mTextHelper;

    public AppCompatEditText(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    @RequiresApi(26)
    @UiThread
    private C0893y getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new C0893y(this);
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.a();
        }
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return p377z5.l.P(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportBackgroundTintList() {
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            return c0885u.b();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            return c0885u.c();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({p192n.c.f39802c})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        P p3;
        if (Build.VERSION.SDK_INT >= 28 || (p3 = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = p3.f12738b;
        return textClassifier == null ? O.a(p3.f12737a) : textClassifier;
    }

    public void initEmojiKeyListener(C0895z c0895z) {
        KeyListener keyListener = getKeyListener();
        c0895z.getClass();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c0895z.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return ((p228p0.i) ((androidx.work.impl.model.b) this.mAppCompatEmojiEditTextHelper.f13033b.f41176b).f18581c).f41167c;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056 A[PHI: r1
      0x0056: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x0069, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i7;
        String[] strArrH;
        String[] stringArray;
        InputConnection eVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        V.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        androidx.camera.core.impl.utils.executor.g.G(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && (i7 = Build.VERSION.SDK_INT) <= 30 && (strArrH = androidx.core.view.N.h(this)) != null) {
            if (i7 >= 25) {
                editorInfo.contentMimeTypes = strArrH;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrH);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrH);
            }
            androidx.core.view.inputmethod.c cVar = new androidx.core.view.inputmethod.c(this);
            if (i7 >= 25) {
                eVar = new androidx.core.view.inputmethod.d(inputConnectionOnCreateInputConnection, cVar);
            } else {
                String[] strArr = androidx.core.view.inputmethod.b.f16237a;
                if (i7 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    eVar = new androidx.core.view.inputmethod.e(inputConnectionOnCreateInputConnection, cVar);
                }
            }
            inputConnectionOnCreateInputConnection = eVar;
        }
        return this.mAppCompatEmojiEditTextHelper.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 || i7 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && androidx.core.view.N.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = D.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.OnReceiveContentViewBehavior
    @Nullable
    public C1054f onReceiveContent(@NonNull C1054f c1054f) {
        return this.mDefaultOnReceiveContentListener.onReceiveContent(this, c1054f);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        if (Build.VERSION.SDK_INT >= 31 || androidx.core.view.N.h(this) == null || !(i7 == 16908322 || i7 == 16908337)) {
            return super.onTextContextMenuItem(i7);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C1052d c1052d = new C1052d(primaryClip, 1, 0);
            c1052d.setFlags(i7 == 16908322 ? 0 : 1);
            androidx.core.view.N.m(this, c1052d.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i7) {
        super.setBackgroundResource(i7);
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.f(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(p377z5.l.Q(callback, this));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z3) {
        this.mAppCompatEmojiEditTextHelper.d(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.h(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0885u c0885u = this.mBackgroundTintHelper;
        if (c0885u != null) {
            c0885u.i(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.l(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({p192n.c.f39802c})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.m(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        V v3 = this.mTextHelper;
        if (v3 != null) {
            v3.g(i7, context);
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        P p3;
        if (Build.VERSION.SDK_INT >= 28 || (p3 = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            p3.f12738b = textClassifier;
        }
    }

    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        X0.a(context);
        W0.a(this, getContext());
        C0885u c0885u = new C0885u(this);
        this.mBackgroundTintHelper = c0885u;
        c0885u.d(attributeSet, i7);
        V v3 = new V(this);
        this.mTextHelper = v3;
        v3.f(attributeSet, i7);
        v3.b();
        P p3 = new P();
        p3.f12737a = this;
        this.mTextClassifierHelper = p3;
        this.mDefaultOnReceiveContentListener = new androidx.core.widget.j();
        C0895z c0895z = new C0895z(this);
        this.mAppCompatEmojiEditTextHelper = c0895z;
        c0895z.b(attributeSet, i7);
        initEmojiKeyListener(c0895z);
    }
}
