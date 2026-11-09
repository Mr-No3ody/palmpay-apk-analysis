package com.masteratul.exceptionhandler;

import F5.a;
import F5.b;
import F5.c;
import F5.d;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultErrorScreen extends Activity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f23564e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Button f23565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f23566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f23567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f23568d;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        try {
            string = getIntent().getExtras().getString("stack_trace_string");
        } catch (Exception e10) {
            Log.e("RN_ERROR_HANDLER", "Was not able to get StackTrace: " + e10.getMessage());
            string = "StackTrace unavailable";
        }
        setContentView(d.default_error_screen);
        this.f23565a = (Button) findViewById(c.eh_quit_button);
        this.f23566b = (Button) findViewById(c.eh_restart_button);
        this.f23567c = (Button) findViewById(c.eh_show_details_button);
        TextView textView = (TextView) findViewById(c.eh_stack_trace_text_view);
        this.f23568d = textView;
        textView.setText(string);
        this.f23567c.setOnClickListener(new a(this, 0));
        this.f23566b.setOnClickListener(new a(this, 1));
        this.f23565a.setOnClickListener(new b(0));
    }
}
