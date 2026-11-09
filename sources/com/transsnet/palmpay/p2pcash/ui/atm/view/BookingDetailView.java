package com.transsnet.palmpay.p2pcash.ui.atm.view;

import Da.d;
import Pa.r0;
import Sc.b;
import Sc.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class BookingDetailView extends FrameLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f32964j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P2PItemView f32965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P2PItemView f32966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P2PItemView f32967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P2PItemView f32968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P2PItemView f32969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P2PItemView f32970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final P2PItemView f32971g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f32972i;

    public BookingDetailView(@NonNull Context context) {
        this(context, null);
    }

    public void setBookAmount(long j6) {
        this.f32965a.setName("Booked Amount");
        this.f32965a.setValue(r0.B(j6, false));
    }

    public void setBookingID(String str) {
        this.f32969e.setName("Booking ID");
        this.f32969e.setValue(str);
        this.f32969e.setCopy(new d(str, 4));
    }

    public void setCompletedTime(long j6) {
        if (j6 == 0) {
            this.f32971g.setVisibility(8);
            return;
        }
        this.f32971g.setVisibility(0);
        this.f32971g.setName("Completion Time");
        this.f32971g.setValue(new SimpleDateFormat("MMM d, yyyy, HH:mm").format(new Date(j6)));
    }

    public void setPaymentAmount(long j6) {
        if (j6 == 0) {
            this.f32967c.setVisibility(8);
            return;
        }
        this.f32967c.setVisibility(0);
        this.f32967c.setName("Payment Amount");
        this.f32967c.setValue(r0.B(j6, false));
    }

    public void setStartTime(long j6) {
        this.f32970f.setName("Start Time");
        this.f32970f.setValue(new SimpleDateFormat("MMM d, yyyy, HH:mm").format(new Date(j6)));
    }

    public BookingDetailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BookingDetailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        View.inflate(context, c.p2p_booking_detail_view_layout, this);
        this.f32965a = (P2PItemView) findViewById(b.p2p_booked_amount);
        this.f32966b = (P2PItemView) findViewById(b.p2p_booking_deposit);
        this.f32967c = (P2PItemView) findViewById(b.p2p_payment_amount);
        this.f32968d = (P2PItemView) findViewById(b.p2p_payment_detail);
        this.f32969e = (P2PItemView) findViewById(b.p2p_booking_id);
        this.f32970f = (P2PItemView) findViewById(b.p2p_start_time);
        this.f32971g = (P2PItemView) findViewById(b.p2p_completion_time);
        this.f32972i = findViewById(b.p2p_change_label);
    }
}
