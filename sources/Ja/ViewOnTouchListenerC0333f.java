package Ja;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckBankPinFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBankPinFragment;

/* JADX INFO: renamed from: Ja.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnTouchListenerC0333f implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4651c;

    public /* synthetic */ ViewOnTouchListenerC0333f(Object obj, int i7, int i10) {
        this.f4649a = i10;
        this.f4651c = obj;
        this.f4650b = i7;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Drawable[] compoundDrawables;
        x4.b bVar;
        AppCompatEditText appCompatEditText;
        AppCompatEditText appCompatEditText2;
        Drawable[] compoundDrawables2;
        Drawable drawable;
        AppCompatEditText appCompatEditText3;
        AppCompatEditText appCompatEditText4;
        AppCompatEditText appCompatEditText5;
        AppCompatEditText appCompatEditText6;
        Drawable[] compoundDrawables3;
        Drawable drawable2 = null;
        int i7 = this.f4650b;
        Object obj = this.f4651c;
        switch (this.f4649a) {
            case 0:
                CheckBankPinFragment.a aVar = CheckBankPinFragment.f27954A;
                if (motionEvent.getAction() == 1) {
                    CheckBankPinFragment checkBankPinFragment = (CheckBankPinFragment) obj;
                    AppCompatEditText appCompatEditTextZ = checkBankPinFragment.z();
                    if (appCompatEditTextZ != null && (compoundDrawables = appCompatEditTextZ.getCompoundDrawables()) != null) {
                        drawable2 = compoundDrawables[2];
                    }
                    if (drawable2 != null) {
                        int[] iArr = new int[2];
                        AppCompatEditText appCompatEditTextZ2 = checkBankPinFragment.z();
                        if (appCompatEditTextZ2 != null) {
                            appCompatEditTextZ2.getLocationOnScreen(iArr);
                        }
                        AppCompatEditText appCompatEditTextZ3 = checkBankPinFragment.z();
                        if (appCompatEditTextZ3 != null) {
                            int width = (appCompatEditTextZ3.getWidth() + iArr[0]) - appCompatEditTextZ3.getPaddingRight();
                            if (motionEvent.getRawX() <= width + i7 && motionEvent.getRawX() >= (width - appCompatEditTextZ3.getCompoundDrawables()[2].getIntrinsicWidth()) - i7 && appCompatEditTextZ3.isEnabled()) {
                                boolean z3 = !checkBankPinFragment.f27959w;
                                checkBankPinFragment.f27959w = z3;
                                checkBankPinFragment.A(z3);
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 1:
                FlexiBankCheckBankPinFragment.a aVar2 = FlexiBankCheckBankPinFragment.t;
                if (motionEvent.getAction() == 1) {
                    FlexiBankCheckBankPinFragment flexiBankCheckBankPinFragment = (FlexiBankCheckBankPinFragment) obj;
                    x4.b bVar2 = (x4.b) flexiBankCheckBankPinFragment.f21944f;
                    if (bVar2 != null && (appCompatEditText6 = bVar2.f43577c) != null && (compoundDrawables3 = appCompatEditText6.getCompoundDrawables()) != null) {
                        drawable2 = compoundDrawables3[2];
                    }
                    if (drawable2 != null) {
                        int[] iArr2 = new int[2];
                        x4.b bVar3 = (x4.b) flexiBankCheckBankPinFragment.f21944f;
                        if (bVar3 != null && (appCompatEditText5 = bVar3.f43577c) != null) {
                            appCompatEditText5.getLocationOnScreen(iArr2);
                        }
                        int i10 = iArr2[0];
                        x4.b bVar4 = (x4.b) flexiBankCheckBankPinFragment.f21944f;
                        int width2 = i10 + ((bVar4 == null || (appCompatEditText4 = bVar4.f43577c) == null) ? 0 : appCompatEditText4.getWidth());
                        x4.b bVar5 = (x4.b) flexiBankCheckBankPinFragment.f21944f;
                        int paddingRight = width2 - ((bVar5 == null || (appCompatEditText3 = bVar5.f43577c) == null) ? 0 : appCompatEditText3.getPaddingRight());
                        if (motionEvent.getRawX() <= paddingRight + i7) {
                            float rawX = motionEvent.getRawX();
                            x4.b bVar6 = (x4.b) flexiBankCheckBankPinFragment.f21944f;
                            if (rawX >= (paddingRight - ((bVar6 == null || (appCompatEditText2 = bVar6.f43577c) == null || (compoundDrawables2 = appCompatEditText2.getCompoundDrawables()) == null || (drawable = compoundDrawables2[2]) == null) ? 0 : drawable.getIntrinsicWidth())) - i7 && (bVar = (x4.b) flexiBankCheckBankPinFragment.f21944f) != null && (appCompatEditText = bVar.f43577c) != null && appCompatEditText.isEnabled()) {
                                boolean z8 = !flexiBankCheckBankPinFragment.f22009p;
                                flexiBankCheckBankPinFragment.f22009p = z8;
                                flexiBankCheckBankPinFragment.r(z8);
                                return true;
                            }
                        }
                    }
                }
                return false;
            case 2:
                if (motionEvent.getAction() == 1) {
                    AppCompatEditText appCompatEditText7 = (AppCompatEditText) obj;
                    if (appCompatEditText7.getCompoundDrawables()[2] != null) {
                        int[] iArr3 = new int[2];
                        appCompatEditText7.getLocationOnScreen(iArr3);
                        int width3 = (appCompatEditText7.getWidth() + iArr3[0]) - appCompatEditText7.getPaddingRight();
                        if (motionEvent.getRawX() <= width3 + i7 && motionEvent.getRawX() >= (width3 - appCompatEditText7.getCompoundDrawables()[2].getIntrinsicWidth()) - i7 && appCompatEditText7.isEnabled()) {
                            appCompatEditText7.setText("");
                            return true;
                        }
                    }
                }
                return false;
            default:
                if (motionEvent.getAction() == 1) {
                    EditText editText = (EditText) obj;
                    if (editText.getCompoundDrawables()[2] != null) {
                        int[] iArr4 = new int[2];
                        editText.getLocationOnScreen(iArr4);
                        int width4 = (editText.getWidth() + iArr4[0]) - editText.getPaddingRight();
                        if (motionEvent.getRawX() <= width4 + i7 && motionEvent.getRawX() >= (width4 - editText.getCompoundDrawables()[2].getIntrinsicWidth()) - i7 && editText.isEnabled()) {
                            editText.setText("");
                            return true;
                        }
                    }
                }
                return false;
        }
    }
}
