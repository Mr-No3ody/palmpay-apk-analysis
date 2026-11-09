package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.X0;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class L {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {R.attr.onClick};
    private static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    private static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    private static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final M.n sConstructorMap = new M.n(0);

    public final View a(Context context, String str, String str2) {
        String strConcat;
        M.n nVar = sConstructorMap;
        Constructor constructor = (Constructor) nVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            nVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    public final void b(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @NonNull
    public AppCompatCheckedTextView createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @NonNull
    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @NonNull
    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @NonNull
    public AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @NonNull
    public AppCompatRatingBar createRatingBar(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    @NonNull
    public AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @NonNull
    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatToggleButton createToggleButton(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    @Nullable
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public final View createView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z3, boolean z8, boolean z10, boolean z11) {
        byte b7;
        View viewCreateRatingBar;
        Context context2 = (!z3 || view == null) ? context : view.getContext();
        if (z8 || z10) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p241q.j.View, 0, 0);
            int resourceId = z8 ? typedArrayObtainStyledAttributes.getResourceId(p241q.j.View_android_theme, 0) : 0;
            if (z10 && resourceId == 0) {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(p241q.j.View_theme, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId != 0 && (!(context2 instanceof ContextThemeWrapper) || ((ContextThemeWrapper) context2).getThemeResId() != resourceId)) {
                context2 = new ContextThemeWrapper(context2, resourceId);
            }
        }
        if (z11) {
            X0.a(context2);
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b7 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b7 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b7 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b7 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                b7 = !str.equals("ImageButton") ? (byte) -1 : (byte) 4;
                break;
            case -658531749:
                b7 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b7 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b7 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b7 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b7 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b7 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b7 = !str.equals("CheckBox") ? (byte) -1 : Ascii.VT;
                break;
            case 1666676343:
                b7 = !str.equals("EditText") ? (byte) -1 : Ascii.FF;
                break;
            case 2001146706:
                b7 = !str.equals("Button") ? (byte) -1 : Ascii.CR;
                break;
            default:
                b7 = -1;
                break;
        }
        switch (b7) {
            case 0:
                viewCreateRatingBar = createRatingBar(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 1:
                viewCreateRatingBar = createCheckedTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 2:
                viewCreateRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 3:
                viewCreateRatingBar = createTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 4:
                viewCreateRatingBar = createImageButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 5:
                viewCreateRatingBar = createSeekBar(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 6:
                viewCreateRatingBar = createSpinner(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 7:
                viewCreateRatingBar = createRadioButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 8:
                viewCreateRatingBar = createToggleButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 9:
                viewCreateRatingBar = createImageView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 10:
                viewCreateRatingBar = createAutoCompleteTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 11:
                viewCreateRatingBar = createCheckBox(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 12:
                viewCreateRatingBar = createEditText(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case 13:
                viewCreateRatingBar = createButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            default:
                viewCreateRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (viewCreateRatingBar == null && context != context2) {
            viewCreateRatingBar = null;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                Object[] objArr = this.mConstructorArgs;
                objArr[0] = context2;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i7 = 0;
                    while (true) {
                        String[] strArr = sClassPrefixList;
                        if (i7 < strArr.length) {
                            View viewA = a(context2, str, strArr[i7]);
                            if (viewA != null) {
                                Object[] objArr2 = this.mConstructorArgs;
                                objArr2[0] = null;
                                objArr2[1] = null;
                                viewCreateRatingBar = viewA;
                            } else {
                                i7++;
                            }
                        } else {
                            Object[] objArr3 = this.mConstructorArgs;
                            objArr3[0] = null;
                            objArr3[1] = null;
                        }
                    }
                } else {
                    View viewA2 = a(context2, str, null);
                    Object[] objArr4 = this.mConstructorArgs;
                    objArr4[0] = null;
                    objArr4[1] = null;
                    viewCreateRatingBar = viewA2;
                }
            } catch (Exception unused) {
                Object[] objArr5 = this.mConstructorArgs;
                objArr5[0] = viewCreateRatingBar;
                objArr5[1] = viewCreateRatingBar;
            } catch (Throwable th) {
                Object[] objArr6 = this.mConstructorArgs;
                objArr6[0] = viewCreateRatingBar;
                objArr6[1] = viewCreateRatingBar;
                throw th;
            }
        }
        View view2 = viewCreateRatingBar;
        if (view2 != null) {
            Context context3 = view2.getContext();
            if ((context3 instanceof ContextWrapper) && view2.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = typedArrayObtainStyledAttributes2.getString(0);
                if (string != null) {
                    view2.setOnClickListener(new Ee.a(view2, string));
                }
                typedArrayObtainStyledAttributes2.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z12 = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap = androidx.core.view.N.f16168a;
                    new androidx.core.view.A(W.c.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(view2, Boolean.valueOf(z12));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    androidx.core.view.N.r(view2, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = context2.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z13 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = androidx.core.view.N.f16168a;
                    new androidx.core.view.A(W.c.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(view2, Boolean.valueOf(z13));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return view2;
    }
}
