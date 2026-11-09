package com.transsnet.mtn.sdk.ui.view;

import Ae.n;
import C0.G;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;
import mh.e;
import p349x8.b;
import p349x8.c;
import p349x8.f;

/* JADX INFO: loaded from: classes3.dex */
public class InputView extends p274s.a implements TextWatcher, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f25702B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public a f25703A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatEditText f25704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f25705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f25706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f25707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25710g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f25711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25712j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25713o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f25714p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f25715v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f25716w;

    public interface a {
        void a();
    }

    public InputView(@NonNull Context context) {
        super(context);
        this.f25716w = false;
    }

    @Override // p274s.a
    public final void a() {
        View.inflate(getContext(), b.mtn_input_view_layout, this);
        this.f25704a = (AppCompatEditText) findViewById(p349x8.a.mtn_edit);
        this.f25705b = (ImageView) findViewById(p349x8.a.mtn_clear);
        this.f25706c = (ImageView) findViewById(p349x8.a.mtn_eye);
        this.f25704a.setHint(this.f25709f);
        c();
        this.f25705b.setOnClickListener(new B8.a(this, 3));
        this.f25704a.addTextChangedListener(this);
        this.f25704a.setOnFocusChangeListener(this);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable.length() != 0 && this.f25704a.isFocused()) {
            this.f25705b.setVisibility(0);
        } else {
            this.f25705b.setVisibility(8);
        }
        int i7 = this.f25708e;
        if ((i7 == 5 || i7 == 6) && this.f25710g > 0) {
            InputFilter[] filters = editable.getFilters();
            if (filters == null) {
                filters = new InputFilter[0];
            }
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = new InputFilter.LengthFilter(this.f25710g);
            editable.setFilters(inputFilterArr);
        }
        if (this.f25708e == 7) {
            this.f25704a.getEditableText().setFilters(new InputFilter[]{new B8.b(0)});
            if (this.t.length() == 0 && editable.length() > 0 && Pattern.matches("\\d+", editable.toString()) && !editable.toString().startsWith("+234 | ")) {
                int selectionStart = this.f25704a.getSelectionStart();
                this.f25704a.setText("+234 | " + editable.toString());
                this.f25704a.setSelection(selectionStart + 7);
            } else if (editable.length() > 0 && !Pattern.matches("\\+234 \\| \\d*", editable.toString())) {
                this.f25716w = true;
                this.f25704a.setText(this.t);
                this.f25704a.setSelection(this.f25715v);
                return;
            } else if (editable.toString().equals("+234 | ")) {
                this.f25704a.setText("");
            }
        }
        a aVar = this.f25703A;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // p274s.a
    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.InputView);
        this.f25708e = typedArrayObtainStyledAttributes.getInt(f.InputView_mtn_input_view_input_type, 2);
        this.f25709f = typedArrayObtainStyledAttributes.getString(f.InputView_mtn_input_view_hint);
        this.f25710g = typedArrayObtainStyledAttributes.getInt(f.InputView_mtn_input_view_number_digits, 0);
        this.f25711i = typedArrayObtainStyledAttributes.getString(f.InputView_mtn_input_view_date_picker_title);
        this.f25712j = typedArrayObtainStyledAttributes.getColor(f.InputView_mtn_input_view_date_picker_btn_color, -16777216);
        this.f25713o = typedArrayObtainStyledAttributes.getInt(f.InputView_mtn_input_view_date_picker_mode, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (!this.f25716w) {
            Editable text = this.f25704a.getText();
            Objects.requireNonNull(text);
            this.t = text.toString();
            this.f25715v = this.f25704a.getSelectionStart();
        }
        this.f25716w = false;
    }

    public final void c() {
        int i7 = 1;
        int i10 = 2;
        int i11 = 0;
        switch (this.f25708e) {
            case 1:
                this.f25706c.setVisibility(0);
                this.f25706c.setOnClickListener(new B8.a(this, i11));
                this.f25704a.setInputType(129);
                break;
            case 2:
                this.f25706c.setVisibility(8);
                this.f25706c.setOnClickListener(null);
                this.f25704a.setInputType(33);
                break;
            case 3:
                this.f25706c.setVisibility(8);
                this.f25706c.setOnClickListener(null);
                this.f25704a.setInputType(3);
                break;
            case 4:
                this.f25706c.setVisibility(0);
                this.f25706c.setOnClickListener(null);
                this.f25706c.setImageResource(c.mtn_right_arrow);
                this.f25704a.setInputType(1);
                this.f25704a.setFocusable(false);
                this.f25704a.setOnClickListener(new B8.a(this, i7));
                this.f25706c.setOnClickListener(new B8.a(this, i7));
                setOnClickListener(new B8.a(this, i7));
                break;
            case 5:
                this.f25706c.setVisibility(8);
                this.f25706c.setOnClickListener(null);
                this.f25704a.setInputType(2);
                post(new n(this, i7));
                break;
            case 6:
                this.f25706c.setVisibility(0);
                this.f25706c.setOnClickListener(new B8.a(this, i10));
                this.f25704a.setInputType(18);
                post(new n(this, i7));
                break;
            case 7:
                this.f25706c.setVisibility(8);
                this.f25706c.setOnClickListener(null);
                this.f25704a.setInputType(33);
                this.f25704a.setRawInputType(2);
                this.f25704a.getEditableText().setFilters(new InputFilter[]{new B8.b(0)});
                break;
        }
    }

    public String get() {
        if (this.f25708e != 7) {
            Editable text = this.f25704a.getText();
            Objects.requireNonNull(text);
            return text.toString();
        }
        String strReplace = this.f25704a.getText().toString().replace("+234 | ", "");
        if (strReplace.startsWith("0")) {
            strReplace = strReplace.substring(1);
        }
        return G.o("234", strReplace);
    }

    public int getDigit() {
        return this.f25710g;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        ImageView imageView;
        int i7;
        if (!z3 || this.f25704a.getText().length() <= 0) {
            imageView = this.f25705b;
            i7 = 8;
        } else {
            imageView = this.f25705b;
            i7 = 0;
        }
        imageView.setVisibility(i7);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    public void setDatePickerBtnColor(int i7) {
        this.f25712j = i7;
        e eVar = this.f25707d;
        if (eVar != null) {
            eVar.f39781i.setEnableColor(i7);
        }
    }

    public void setDigit(int i7) {
        int i10 = this.f25708e;
        if (i10 == 5 || i10 == 6) {
            this.f25710g = i7;
            post(new n(this, 1));
        }
    }

    public void setHint(String str) {
        this.f25709f = str;
        this.f25704a.setHint(str);
    }

    public void setInputType(int i7) {
        this.f25708e = i7;
        c();
    }

    public void setOnInputChangeListener(a aVar) {
        this.f25703A = aVar;
    }

    public void setText(String str) {
        this.f25704a.setText(str);
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25716w = false;
    }

    public InputView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f25716w = false;
    }
}
